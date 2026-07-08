package com.bytedance.android.live.broadcast.model;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class LivePermissionApplyResponse {

    @C09CT("data")
    public ResponseData data;

    /* JADX INFO: loaded from: classes13.dex */
    public static class PermissionApplyInfo {

        @C09CT("anchor_fans_num")
        public int mAnchorFansNum;

        @C09CT("apply_invalid_time")
        public int mApplyInvalidTime;

        @C09CT("apply_need_fans_num")
        public int mApplyNeedFansNum;

        @C09CT("apply_source")
        public int mApplySource;

        @C09CT("apply_status")
        public int mApplyStatus;

        @C09CT("forbidden_apply_countdown")
        public int mForbiddenApplyCountdown;

        @C09CT("forbidden_apply_days")
        public int mForbiddenApplyDays;

        @C09CT("need_live_time")
        public int mNeedLiveTime;

        @C09CT("target_live_time")
        public int mTargetLiveTime;
    }

    public static class ResponseData {

        @C09CT("permission_info")
        public Map<String, PermissionApplyInfo> permissionInfo;
    }
}
