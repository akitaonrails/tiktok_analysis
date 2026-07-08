package com.bytedance.android.live.wallet.model;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class UserBalance {

    @C09CT("balance")
    public long balance;

    @C09CT("country_code")
    public final String countryCode;

    @C09CT("currency_type")
    public final String currencyType;

    @C09CT("score")
    public long score;

    public UserBalance() {
        this("", "", 0L, 0L);
    }

    public final void setBalance(long j) {
        this.balance = j;
    }

    public final void setScore(long j) {
        this.score = j;
    }

    public UserBalance(String str, String str2, long j, long j2) {
        this.currencyType = str;
        this.countryCode = str2;
        this.balance = j;
        this.score = j2;
    }
}
