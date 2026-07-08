package com.bytedance.android.live.effect.model;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveGoalInfo {

    @C09CT("canvas")
    public Canvas canvas;

    @C09CT("cur_num")
    public Long curNum;

    @C09CT("drag_mode")
    public int dragMode;

    @C09CT("effect_position")
    public int effectPosition;

    @C09CT("first_use")
    public int firstUse;

    @C09CT("goal_num")
    public Long goalNum;

    @C09CT("goal_str")
    public String goalStr;

    @C09CT("icon_path")
    public String iconPath;

    @C09CT("init_position")
    public Area initPosition;

    @C09CT("last_position")
    public LastPosition lastPosition;

    @C09CT("max_line")
    public Integer maxLine;

    @C09CT("play_anim_timestamp")
    public String playAnimTimeStamp;

    @C09CT("play_guide_animation")
    public int playGuideAnimation;

    @C09CT("safe_area")
    public Area safeArea;

    @C09CT("safe_area_height")
    public Integer safeAreaHeight;

    @C09CT("time")
    public String time;

    @C09CT("transparency")
    public float transparency;

    public LiveGoalInfo(String str, Long l, Long l2, String str2, String str3, float f, Integer num, Area area, Area area2, Canvas canvas, LastPosition lastPosition, int i, int i2, int i3, int i4, Integer num2, String str4) {
        this.iconPath = str;
        this.goalNum = l;
        this.curNum = l2;
        this.goalStr = str2;
        this.time = str3;
        this.transparency = f;
        this.maxLine = num;
        this.initPosition = area;
        this.safeArea = area2;
        this.canvas = canvas;
        this.lastPosition = lastPosition;
        this.dragMode = i;
        this.firstUse = i2;
        this.effectPosition = i3;
        this.playGuideAnimation = i4;
        this.safeAreaHeight = num2;
        this.playAnimTimeStamp = str4;
    }
}
