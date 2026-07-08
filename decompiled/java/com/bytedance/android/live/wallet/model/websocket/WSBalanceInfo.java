package com.bytedance.android.live.wallet.model.websocket;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class WSBalanceInfo {

    @C09CT("account_type")
    public final int accountType;

    @C09CT("scores")
    public final long scores;

    @C09CT("version")
    public final long version;

    public WSBalanceInfo(int i, long j, long j2) {
        this.accountType = i;
        this.version = j;
        this.scores = j2;
    }
}
