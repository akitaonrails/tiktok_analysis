package com.bytedance.android.live.network.response;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public class RequestError {

    @C09CT("alert")
    public String alert;

    @C09CT("message")
    public String message;

    @C09CT("prompts")
    public String prompts = "Operation failed, please try again later";
    public transient String url;
}
