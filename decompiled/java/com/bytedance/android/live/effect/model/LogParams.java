package com.bytedance.android.live.effect.model;

import X.C09CT;
import X.C158B;

/* JADX INFO: loaded from: classes13.dex */
public final class LogParams {

    @C09CT("background_pos")
    public int backgroundPos;

    @C09CT("drag_mode")
    public int dragMode;

    @C09CT("entrance")
    public String entrance;

    @C09CT("gift_id")
    public String giftId;

    @C09CT("goal_type")
    public String goalType;

    @C09CT("is_adjust")
    public Integer isAdjust;

    @C09CT("is_first_guide")
    public Integer isFirstGuide;

    @C09CT("setting_status")
    public String settingStatus;

    @C09CT("start_time")
    public long startTime;

    @C09CT("stream_goal_id")
    public String streamGoalId;

    public LogParams() {
        this(null, null, null, null, null, null, 0, 0, 0, C158B.LIZ());
    }

    public LogParams(String str, Integer num, String str2, String str3, String str4, String str5, int i, Integer num2, int i2, long j) {
        this.entrance = str;
        this.isFirstGuide = num;
        this.settingStatus = str2;
        this.goalType = str3;
        this.streamGoalId = str4;
        this.giftId = str5;
        this.backgroundPos = i;
        this.isAdjust = num2;
        this.dragMode = i2;
        this.startTime = j;
    }
}
