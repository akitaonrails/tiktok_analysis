package com.bytedance.android.live.wallet.model.websocket;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes28.dex */
public final class WSBalancePayload {

    @C09CT("charge_status")
    public final boolean chargeStatus;

    @C09CT("coin_count")
    public final int coinCount;

    @C09CT("force_sync")
    public final boolean forceSync;

    @C09CT("is_quick_charge")
    public final boolean isQuickCharge;

    @C09CT("pay_channel")
    public final int payChannel;

    @C09CT("balance_info_list")
    public final List<WSBalanceInfo> wsBalanceInfo;

    public WSBalancePayload() {
        this(null, false, 0, false, false, 0, 63, null);
    }

    public WSBalancePayload(List<WSBalanceInfo> list, boolean z, int i, boolean z2, boolean z3, int i2) {
        this.wsBalanceInfo = list;
        this.forceSync = z;
        this.coinCount = i;
        this.isQuickCharge = z2;
        this.chargeStatus = z3;
        this.payChannel = i2;
    }

    public WSBalancePayload(List list, boolean z, int i, boolean z2, boolean z3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? C13BV.INSTANCE : list, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? false : z2, (i3 & 16) != 0 ? false : z3, (i3 & 32) == 0 ? i2 : 0);
    }
}
