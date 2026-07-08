package com.bytedance.android.live.wallet.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes18.dex */
public final class BasePackage {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("local_price_real_dot")
    public int localDot;

    @C09CT("local_price")
    public long localPrice;

    @C09CT("price")
    public long price;

    @C09CT("real_dot")
    public int realDot;

    public BasePackage() {
        this(0L, 0L, 0, 0L, 0);
    }

    public final long getId() {
        return this.id;
    }

    public final int getLocalDot() {
        return this.localDot;
    }

    public final long getLocalPrice() {
        return this.localPrice;
    }

    public final long getPrice() {
        return this.price;
    }

    public final int getRealDot() {
        return this.realDot;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setLocalDot(int i) {
        this.localDot = i;
    }

    public final void setLocalPrice(long j) {
        this.localPrice = j;
    }

    public final void setPrice(long j) {
        this.price = j;
    }

    public final void setRealDot(int i) {
        this.realDot = i;
    }

    public BasePackage(long j, long j2, int i, long j3, int i2) {
        this.id = j;
        this.price = j2;
        this.realDot = i;
        this.localPrice = j3;
        this.localDot = i2;
    }
}
