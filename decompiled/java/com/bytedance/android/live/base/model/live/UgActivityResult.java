package com.bytedance.android.live.base.model.live;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public class UgActivityResult {

    @C09CT("status_code")
    public int statusCode;

    @C09CT("status_msg")
    public String statusMsg;

    public UgActivityResult(int i, String str) {
        this.statusCode = i;
        this.statusMsg = str;
    }
}
