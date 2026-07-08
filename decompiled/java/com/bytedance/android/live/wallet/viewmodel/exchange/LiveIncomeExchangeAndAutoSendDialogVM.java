package com.bytedance.android.live.wallet.viewmodel.exchange;

import X.C1144350fsv;
import X.C1149750g1d;
import X.EnumC1149830g1l;
import X.InterfaceC1149850g1n;
import android.content.Context;
import com.bytedance.android.live.wallet.viewmodel.exchange.base.BaseLiveIncomeExchangeDialogVM;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveIncomeExchangeAndAutoSendDialogVM extends BaseLiveIncomeExchangeDialogVM {
    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final String AQ2(boolean z) {
        return z ? "over_threshold_anchor_first" : "not_auto_anchor_first";
    }

    public LiveIncomeExchangeAndAutoSendDialogVM(C1149750g1d c1149750g1d, Context context, C1144350fsv c1144350fsv, InterfaceC1149850g1n interfaceC1149850g1n) {
        super(c1149750g1d, context, c1144350fsv, interfaceC1149850g1n, EnumC1149830g1l.LIVE_EXCHANGE_AND_SEND);
    }
}
