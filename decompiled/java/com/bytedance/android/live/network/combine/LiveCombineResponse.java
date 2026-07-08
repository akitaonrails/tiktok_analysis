package com.bytedance.android.live.network.combine;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class LiveCombineResponse {

    @C09CT("data")
    public Map<String, LiveCombineResponseItem> combineResp;

    @C09CT("status_code")
    public int statusCode = 200;

    public final Map<String, LiveCombineResponseItem> getCombineResp() {
        return this.combineResp;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final void setCombineResp(Map<String, LiveCombineResponseItem> map) {
        this.combineResp = map;
    }

    public final void setStatusCode(int i) {
        this.statusCode = i;
    }
}
