package com.songu.happie.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 7/17/2017.
 */

public class UserModel {

    @SerializedName("name")
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
