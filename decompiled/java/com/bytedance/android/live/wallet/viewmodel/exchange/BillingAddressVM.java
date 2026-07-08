package com.bytedance.android.live.wallet.viewmodel.exchange;

import X.C1144350fsv;
import X.C1149680g1W;
import X.C1149890g1r;
import X.C11NJ;
import X.C1796540wqq;
import X.C2097608Jq;
import X.C2348809Ig;
import X.EnumC1796260wqO;
import X.InterfaceC1149850g1n;
import X.InterfaceC1149940g1w;
import android.content.Context;
import com.bytedance.android.live.wallet.viewmodel.exchange.base.ExchangeFirstStageVM;
import com.bytedance.android.livesdk.livesetting.other.LiveExchangeCancelLimit;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public abstract class BillingAddressVM extends ExchangeFirstStageVM {
    public final InterfaceC1149940g1w LLJIJIL;
    public final Context LLJILJIL;
    public final C1144350fsv LLJILJILJ;
    public final InterfaceC1149850g1n LLJILLL;
    public final int LLJJ;
    public final C11NJ LLJJI;
    public C1149890g1r LLJJIII;

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public boolean DQ2() {
        return false;
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public boolean yQ2() {
        return false;
    }

    public int UQ2() {
        return this.LLJJ;
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public C1144350fsv zQ2() {
        return this.LLJILJILJ;
    }

    public final void TQ2(Throwable th) {
        try {
            Map<String, String> mapQQ2 = QQ2();
            if (th != null) {
                C1149680g1W.LIZIZ(th, mapQQ2);
            } else {
                mapQQ2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "success");
            }
            C1796540wqq.LIZ.LIZ(EnumC1796260wqO.BOTH, "livesdk_exchange_billing_address_return", C2348809Ig.LIZLLL(C2097608Jq.LJIIZILJ(mapQQ2)), null, null, null, "wallet");
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public BillingAddressVM(Context context, InterfaceC1149850g1n interfaceC1149850g1n, C1144350fsv c1144350fsv, InterfaceC1149940g1w interfaceC1149940g1w) {
        super(context, interfaceC1149940g1w);
        this.LLJIJIL = interfaceC1149940g1w;
        this.LLJILJIL = context;
        this.LLJILJILJ = c1144350fsv;
        this.LLJILLL = interfaceC1149850g1n;
        LiveExchangeCancelLimit.INSTANCE.getValue();
        this.LLJJ = 2;
        this.LLJJI = new C11NJ();
    }
}
