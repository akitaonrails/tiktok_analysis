package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GetUploadAuthResponse {

    @C09CT("data")
    public ResponseData data;

    /* JADX INFO: loaded from: classes31.dex */
    public static final class ResponseData {

        @C09CT("current_time")
        public long currentTime;

        @C09CT("expired_time")
        public long expiredTime;

        @C09CT("access_key")
        public String accessKey = "";

        @C09CT("secret_key")
        public String secretKey = "";

        @C09CT("session_token")
        public String sessionToken = "";

        @C09CT("service_id")
        public String serviceId = "";

        @C09CT("upload_domain")
        public String uploadDomain = "";
    }
}
