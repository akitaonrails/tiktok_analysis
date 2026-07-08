package com.bytedance.android.live.network.response;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public class StartLiveResponse<T> {
    public transient RequestError LIZ;

    @C09CT("data")
    public T data;

    @C09CT("extra")
    public Object extra;

    @C09CT("status_code")
    public int statusCode;
}
