package com.bytedance.android.live.wallet.model;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class BalanceStructExtra {

    @C09CT("base_package")
    public BasePackage basePackage;

    @C09CT("coins")
    public long coins;

    @C09CT("currency_info")
    public CurrencyInfo currencyInfo;

    @C09CT("local_currency_info")
    public CurrencyInfo localCurrencyInfo;

    public BalanceStructExtra() {
        this(null, null, null, 0L);
    }

    public final boolean isLocal() {
        BasePackage basePackage;
        CurrencyInfo currencyInfo = this.localCurrencyInfo;
        return (currencyInfo == null || Intrinsics.LJFF(currencyInfo.getSymbol(), "") || (basePackage = this.basePackage) == null || basePackage.getLocalPrice() == 0 || this.basePackage.getLocalDot() == 0) ? false : true;
    }

    public final BasePackage getBasePackage() {
        return this.basePackage;
    }

    public final long getCoins() {
        return this.coins;
    }

    public final CurrencyInfo getCurrencyInfo() {
        return this.currencyInfo;
    }

    public final CurrencyInfo getLocalCurrencyInfo() {
        return this.localCurrencyInfo;
    }

    public final void setBasePackage(BasePackage basePackage) {
        this.basePackage = basePackage;
    }

    public final void setCoins(long j) {
        this.coins = j;
    }

    public final void setCurrencyInfo(CurrencyInfo currencyInfo) {
        this.currencyInfo = currencyInfo;
    }

    public final void setLocalCurrencyInfo(CurrencyInfo currencyInfo) {
        this.localCurrencyInfo = currencyInfo;
    }

    public BalanceStructExtra(CurrencyInfo currencyInfo, CurrencyInfo currencyInfo2, BasePackage basePackage, long j) {
        this.currencyInfo = currencyInfo;
        this.localCurrencyInfo = currencyInfo2;
        this.basePackage = basePackage;
        this.coins = j;
    }
}
