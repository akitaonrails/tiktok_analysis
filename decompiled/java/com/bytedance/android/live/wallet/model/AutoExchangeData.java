package com.bytedance.android.live.wallet.model;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class AutoExchangeData {

    @C09CT("auto_exchange_after")
    public boolean after;

    @C09CT("auto_exchange_before")
    public boolean before;

    public AutoExchangeData() {
        this(false, false);
    }

    public final boolean getAfter() {
        return this.after;
    }

    public final boolean getBefore() {
        return this.before;
    }

    public final void setAfter(boolean z) {
        this.after = z;
    }

    public final void setBefore(boolean z) {
        this.before = z;
    }

    public AutoExchangeData(boolean z, boolean z2) {
        this.before = z;
        this.after = z2;
    }
}
