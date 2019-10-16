package com.zsy.xbottombar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.flyco.tablayout.entity.TabEntity
import com.flyco.tablayout.listener.CustomTabEntity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val TabEntities = ArrayList<CustomTabEntity>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TabEntities.add(TabEntity("home", R.drawable.home_blue, R.drawable.home_gray))
        TabEntities.add(TabEntity("home2", R.drawable.home_blue, R.drawable.home_gray))
        TabEntities.add(TabEntity("mine", R.drawable.mine_blue, R.drawable.mine_gray))
        TabEntities.add(TabEntity("mine2", R.drawable.mine_blue, R.drawable.mine_gray))
        tablayout.setTabData(TabEntities)
    }

}
