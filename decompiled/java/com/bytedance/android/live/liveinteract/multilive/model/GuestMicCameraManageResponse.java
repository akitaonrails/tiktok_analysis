package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GuestMicCameraManageResponse {

    @C09CT("data")
    public ResponseData data;

    @C09CT("extra")
    public Extra extra;

    public static final class Extra {

        @C09CT("now")
        public long now;
    }

    public static final class ResponseData {

        @C09CT("expiration_time")
        public long expirationTime;

        @C09CT("rateLimit")
        public boolean ratelimit;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.replace(0, 2, "ResponseData{");
            sb.append('}');
            return sb.toString();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.data != null) {
            sb.append(", data=");
            sb.append(this.data);
        }
        sb.replace(0, 2, "GuestMicCameraManageResponse{");
        sb.append('}');
        return sb.toString();
    }
}
