package com.bytedance.android.live.network.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes4.dex */
public class RequestPb {
    public static final TypeAdapter ADAPTER = new RequestPb_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("pass_through_api")
    public String passThroughApi;

    @C09CT("switches")
    public String switches;

    public static RequestPb defaultInstance() {
        RequestPb requestPb = new RequestPb();
        requestPb.enable = false;
        requestPb.switches = "{}";
        requestPb.passThroughApi = "";
        return requestPb;
    }

    public String getPassThroughApi() {
        return this.passThroughApi;
    }

    public String getSwitches() {
        return this.switches;
    }

    public boolean isEnable() {
        return this.enable;
    }
}
