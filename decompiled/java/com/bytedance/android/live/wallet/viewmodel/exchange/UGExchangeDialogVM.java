package com.bytedance.android.live.wallet.viewmodel.exchange;

import X.C1144350fsv;
import X.C1149680g1W;
import X.C1149710g1Z;
import X.C1149790g1h;
import X.C1161920gLG;
import X.C158B;
import X.C20337914i1;
import X.EnumC1149830g1l;
import X.InterfaceC1094160eZy;
import X.InterfaceC1149850g1n;
import android.content.Context;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class UGExchangeDialogVM extends ExchangeTaxDialogVM {
    public final C1144350fsv LLJJJ;
    public final boolean LLJJJIL;
    public final int LLJJJJ;

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void MQ2() {
        aR2(ExchangeDialogVM.EQ2(null) ? "dont_show_again" : "not_now");
        if (!this.LLJJJIL) {
            if (ExchangeDialogVM.EQ2(null)) {
                InterfaceC1094160eZy.M0.LJFF(Boolean.FALSE);
            } else {
                C20337914i1<Integer> c20337914i1 = InterfaceC1094160eZy.L0;
                c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
            }
        }
        InterfaceC1149850g1n interfaceC1149850g1n = this.LLJILLL;
        if (interfaceC1149850g1n != null) {
            interfaceC1149850g1n.LJFF();
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.base.ExchangeFirstStageVM
    public final int RQ2() {
        return 0;
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void NQ2() {
        aR2("exit_button");
        InterfaceC1149850g1n interfaceC1149850g1n = this.LLJILLL;
        if (interfaceC1149850g1n != null) {
            interfaceC1149850g1n.LJFF();
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.base.ExchangeFirstStageVM, com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void onShow() {
        wQ2("loading_duration");
        super.onShow();
        InterfaceC1149850g1n interfaceC1149850g1n = this.LLJILLL;
        if (interfaceC1149850g1n != null) {
            interfaceC1149850g1n.onShow();
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.base.ExchangeFirstStageVM
    public final void SQ2() {
        this.LLILZ = C158B.LIZ();
        this.LLILZIL = new HashMap<>();
        C1144350fsv c1144350fsv = this.LLJJJ;
        C1149680g1W.LJIIIIZZ(c1144350fsv.LIZ, c1144350fsv.LIZJ, AQ2(this.LLJJIJIL), "ug_exchange", this.LLJJJ.LIZLLL, 1, 0, 0, 0);
        InterfaceC1149850g1n interfaceC1149850g1n = this.LLJILLL;
        boolean z = false;
        if (interfaceC1149850g1n != null) {
            interfaceC1149850g1n.LJ(this.LLJJJJ, false);
        }
        if (this.LLILLJJLI) {
            ((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJJIIJ("not_auto_exchange", this.LLJJJ.LIZLLL);
        }
        Context context = this.LLJILJIL;
        if (context != null) {
            Boolean bool = this.LLILZLL;
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.LJFF(bool, bool2)) {
                KQ2("ug_exchange", false, bool2);
                wQ2("loading_duration");
                XQ2(1, null);
                ZQ2();
                return;
            }
            Boolean bool3 = this.LLILZLL;
            Boolean bool4 = Boolean.FALSE;
            if (!Intrinsics.LJFF(bool3, bool4)) {
                InterfaceC1149850g1n interfaceC1149850g1n2 = this.LLJILLL;
                if (interfaceC1149850g1n2 != null) {
                    interfaceC1149850g1n2.LIZJ();
                    return;
                }
                return;
            }
            KQ2("ug_exchange", true, bool4);
            if (CQ2(true)) {
                LQ2(WQ2());
                InterfaceC1149850g1n interfaceC1149850g1n3 = this.LLJILLL;
                if (interfaceC1149850g1n3 != null) {
                    interfaceC1149850g1n3.LIZIZ(this.LLJJJJ, this.LLJJIJIIJIL, false, this.LLILLJJLI, 112, null);
                }
                C1149680g1W.LJIJI();
            } else {
                C1149790g1h c1149790g1h = new C1149790g1h(context, this.LLJILLL, this.LLJJJ, EnumC1149830g1l.UG, this.LLJJJIL, this.LLJJIJIL);
                ConfirmExchangeDialogVM confirmExchangeDialogVM = c1149790g1h.LJIIIIZZ;
                confirmExchangeDialogVM.getClass();
                confirmExchangeDialogVM.LLILLJJLI = this.LLILLJJLI;
                if (this.LLJJJIL && this.LLJJIJIL) {
                    z = true;
                }
                confirmExchangeDialogVM.QQ2(z);
                c1149790g1h.show();
            }
            wQ2("loading_duration");
            XQ2(2, null);
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.BillingAddressVM, com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final boolean DQ2() {
        return this.LLJJJIL;
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.BillingAddressVM
    public final int UQ2() {
        return this.LLJJJJ;
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.BillingAddressVM, com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final C1144350fsv zQ2() {
        return this.LLJJJ;
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final String AQ2(boolean z) {
        if (z) {
            return "over_threshold_one";
        }
        if (InterfaceC1094160eZy.Q0.LIZIZ().intValue() > 1) {
            return "not_auto";
        }
        return "first_two_times";
    }

    public final void aR2(String str) {
        C1144350fsv c1144350fsv = this.LLJJJ;
        C1149680g1W.LJII(c1144350fsv.LIZ, c1144350fsv.LIZJ, AQ2(this.LLJJIJIL), "ug_exchange", this.LLJJJ.LIZLLL, 1, 0, 0, 0, str);
        GQ2("ug_exchange", this.LLILZLL, false, null, null);
    }

    public UGExchangeDialogVM(Context context, InterfaceC1149850g1n interfaceC1149850g1n, C1144350fsv c1144350fsv, C1149710g1Z c1149710g1Z) {
        super(1, context, interfaceC1149850g1n, c1144350fsv, c1149710g1Z);
        this.LLJJJ = c1144350fsv;
        this.LLJJJIL = ((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJJ();
        this.LLJJJJ = 1;
    }
}
