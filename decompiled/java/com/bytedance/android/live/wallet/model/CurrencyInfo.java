package com.bytedance.android.live.wallet.model;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class CurrencyInfo {

    @C09CT("code")
    public String code;

    @C09CT("keep_dot")
    public int keepDot;

    @C09CT("symbol")
    public String symbol;

    public CurrencyInfo() {
        this("", 0, "");
    }

    public final String getCode() {
        return this.code;
    }

    public final int getKeepDot() {
        return this.keepDot;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final void setCode(String str) {
        this.code = str;
    }

    public final void setKeepDot(int i) {
        this.keepDot = i;
    }

    public final void setSymbol(String str) {
        this.symbol = str;
    }

    public CurrencyInfo(String str, int i, String str2) {
        this.code = str;
        this.keepDot = i;
        this.symbol = str2;
    }
}
