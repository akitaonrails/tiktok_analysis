package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class CheckActivityRoomResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("activity_stage")
        public long activityStage;

        @C09CT("is_activity_room")
        public boolean isActivityRoom;

        @C09CT("operation_user_region")
        public String operationUserRegion = "";

        @C09CT("activity_name")
        public String activityName = "";
    }
}
