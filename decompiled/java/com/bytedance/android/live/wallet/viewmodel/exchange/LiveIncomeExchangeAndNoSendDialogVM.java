package com.bytedance.android.live.wallet.viewmodel.exchange;

import X.C1144350fsv;
import X.C1149760g1e;
import X.EnumC1149830g1l;
import X.InterfaceC1149850g1n;
import android.content.Context;
import com.bytedance.android.live.wallet.viewmodel.exchange.base.BaseLiveIncomeExchangeDialogVM;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveIncomeExchangeAndNoSendDialogVM extends BaseLiveIncomeExchangeDialogVM {
    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final String AQ2(boolean z) {
        return "first_show_page";
    }

    public LiveIncomeExchangeAndNoSendDialogVM(C1149760g1e c1149760g1e, Context context, C1144350fsv c1144350fsv, InterfaceC1149850g1n interfaceC1149850g1n) {
        super(c1149760g1e, context, c1144350fsv, interfaceC1149850g1n, EnumC1149830g1l.LIVE_EXCHANGE_ONLY);
    }
}
