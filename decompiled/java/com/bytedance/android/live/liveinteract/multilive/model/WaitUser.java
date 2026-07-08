package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class WaitUser {

    @C09CT("link_mic_id")
    public String linkMicId;

    @C09CT("uid")
    public long uid;

    public WaitUser() {
        this(0L, null);
    }

    public WaitUser(long j, String str) {
        this.uid = j;
        this.linkMicId = str;
    }
}
