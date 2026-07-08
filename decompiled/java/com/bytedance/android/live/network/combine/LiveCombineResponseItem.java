package com.bytedance.android.live.network.combine;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveCombineResponseItem {

    @C09CT("resp")
    public String resp;

    @C09CT("http_code")
    public int respCode = 200;

    public final String getResp() {
        return this.resp;
    }

    public final int getRespCode() {
        return this.respCode;
    }

    public final void setResp(String str) {
        this.resp = str;
    }

    public final void setRespCode(int i) {
        this.respCode = i;
    }
}
