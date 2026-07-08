package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class ProxyResp {

    @C09CT("data")
    public ResponseData data;

    @C09CT("extra")
    public Extra extra;

    public static final class Extra {

        @C09CT("now")
        public long now;
    }

    public static final class ResponseData {

        @C09CT("req_json_data")
        public String reqJsonData = "";

        @C09CT("resp_json_data")
        public String respJsonData = "";
    }
}
