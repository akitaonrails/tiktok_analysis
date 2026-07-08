package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class HostCheckOtherAudienceMultiGuestPermissionResponse {

    @C09CT("data")
    public ResponseData data;

    @C09CT("extra")
    public Extra extra;

    public static final class Extra {

        @C09CT("now")
        public long now;
    }

    public static final class ResponseData {

        @C09CT("other_permission_info")
        public MultiGuestPermissionInfo otherPermissionInfo;
    }
}
