package com.bytedance.android.live.publicscreen.impl.model;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class FoldMessageReleaseParam {

    @C09CT("action")
    public final long action;

    @C09CT("msg_type")
    public final String msgType;

    @C09CT("priority")
    public final int priority;

    @C09CT("release_count")
    public final int releaseCount;

    public FoldMessageReleaseParam(String str, long j, int i, int i2) {
        this.msgType = str;
        this.action = j;
        this.priority = i;
        this.releaseCount = i2;
    }
}
