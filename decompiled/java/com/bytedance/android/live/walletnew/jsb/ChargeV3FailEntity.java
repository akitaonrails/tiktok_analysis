package com.bytedance.android.live.walletnew.jsb;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class ChargeV3FailEntity {

    @C09CT("error_code")
    public final String errorCode;

    @C09CT("error_message")
    public final String errorMessage;

    @C09CT("order_id")
    public final String orderId;

    public ChargeV3FailEntity() {
        this("", "", "");
    }

    public ChargeV3FailEntity(String str, String str2, String str3) {
        this.errorCode = str;
        this.errorMessage = str2;
        this.orderId = str3;
    }
}
