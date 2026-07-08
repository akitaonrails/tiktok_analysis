package com.bytedance.android.live.wallet.model;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class BalanceStruct {
    public BalanceStructExtra exchangeInfo;

    @C09CT("balance")
    public final UserBalance userBalance;

    @C09CT("valid_user")
    public final boolean validUser;

    public BalanceStruct() {
        this(null, false, null);
    }

    public final void setExchangeInfo(BalanceStructExtra balanceStructExtra) {
        this.exchangeInfo = balanceStructExtra;
    }

    public BalanceStruct(UserBalance userBalance, boolean z, BalanceStructExtra balanceStructExtra) {
        this.userBalance = userBalance;
        this.validUser = z;
        this.exchangeInfo = balanceStructExtra;
    }
}
