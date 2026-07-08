package com.bytedance.android.live.wallet.viewmodel.exchange.base;

import X.AbstractC1149740g1c;
import X.C1144350fsv;
import X.C1149680g1W;
import X.C1149790g1h;
import X.C1161920gLG;
import X.C158B;
import X.C20337914i1;
import X.C500260Jjc;
import X.EnumC1149830g1l;
import X.InterfaceC1094160eZy;
import X.InterfaceC1149850g1n;
import android.content.Context;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.viewmodel.exchange.ConfirmExchangeDialogVM;
import com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM;
import com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeTaxDialogVM;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public abstract class BaseLiveIncomeExchangeDialogVM extends ExchangeTaxDialogVM {
    public final EnumC1149830g1l LLJJJ;
    public final boolean LLJJJIL;

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.base.ExchangeFirstStageVM
    public final int RQ2() {
        return 1;
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void MQ2() {
        aR2(ExchangeDialogVM.EQ2(this.LLJILJILJ.LJII) ? "dont_show_again" : CQ2(false) ? "cancel" : "not_now");
        if (ExchangeDialogVM.EQ2(this.LLJILJILJ.LJII)) {
            if (this.LLJILJILJ.LJII != null) {
                InterfaceC1094160eZy.O0.LJFF(Boolean.FALSE);
            } else {
                InterfaceC1094160eZy.M0.LJFF(Boolean.FALSE);
            }
        } else if (this.LLJILJILJ.LJII != null) {
            C20337914i1<Integer> c20337914i1 = InterfaceC1094160eZy.N0;
            c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
        } else {
            C20337914i1<Integer> c20337914i12 = InterfaceC1094160eZy.L0;
            c20337914i12.LJFF(Integer.valueOf(c20337914i12.LIZIZ().intValue() + 1));
        }
        InterfaceC1149850g1n interfaceC1149850g1n = this.LLJILLL;
        if (interfaceC1149850g1n != null) {
            interfaceC1149850g1n.LJFF();
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void NQ2() {
        aR2("exit_button");
        InterfaceC1149850g1n interfaceC1149850g1n = this.LLJILLL;
        if (interfaceC1149850g1n != null) {
            interfaceC1149850g1n.LJFF();
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.base.ExchangeFirstStageVM
    public final void SQ2() {
        if (this.LLJILJIL == null) {
            return;
        }
        this.LLILZ = C158B.LIZ();
        this.LLILZIL = new HashMap<>();
        Boolean bool = this.LLILZLL;
        Boolean bool2 = Boolean.TRUE;
        boolean z = false;
        if (Intrinsics.LJFF(bool, bool2)) {
            KQ2("anchor_income", false, bool2);
            wQ2("loading_duration");
            XQ2(1, null);
            ZQ2();
            return;
        }
        if (CQ2(false)) {
            Context context = this.LLJILJIL;
            C1144350fsv c1144350fsv = this.LLJILJILJ;
            new ConfirmExchangeDialogVM(context, this.LLJILLL, c1144350fsv, this.LLJJJ, this.LLJJJIL, false).OQ2();
            return;
        }
        C1144350fsv c1144350fsv2 = this.LLJILJILJ;
        C1149680g1W.LJIIIIZZ(c1144350fsv2.LIZ, c1144350fsv2.LIZJ, AQ2(this.LLJJIJIL), "anchor_income", this.LLJILJILJ.LIZLLL, 1, C500260Jjc.LJJJI(Boolean.valueOf(this.LLILLL)) ? 1 : 0, 0, C500260Jjc.LJJJI(Boolean.valueOf(this.LLILLJJLI)) ? 1 : 0);
        InterfaceC1149850g1n interfaceC1149850g1n = this.LLJILLL;
        if (interfaceC1149850g1n != null) {
            interfaceC1149850g1n.LJ(2, false);
        }
        KQ2("anchor_income", true, Boolean.FALSE);
        Context context2 = this.LLJILJIL;
        if (context2 != null) {
            C1149790g1h c1149790g1h = new C1149790g1h(context2, this.LLJILLL, this.LLJILJILJ, this.LLJJJ, this.LLJJJIL, this.LLJJIJIL);
            ConfirmExchangeDialogVM confirmExchangeDialogVM = c1149790g1h.LJIIIIZZ;
            confirmExchangeDialogVM.getClass();
            confirmExchangeDialogVM.LLILLJJLI = this.LLILLJJLI;
            if (this.LLJJJIL && this.LLJJIJIL) {
                z = true;
            }
            confirmExchangeDialogVM.QQ2(z);
            c1149790g1h.show();
            XQ2(2, null);
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.base.ExchangeFirstStageVM, com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void onShow() {
        super.onShow();
        InterfaceC1149850g1n interfaceC1149850g1n = this.LLJILLL;
        if (interfaceC1149850g1n != null) {
            interfaceC1149850g1n.onShow();
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.BillingAddressVM, com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final boolean DQ2() {
        return this.LLJJJIL;
    }

    public final void aR2(String str) {
        String str2;
        C1144350fsv c1144350fsv = this.LLJILJILJ;
        C1149680g1W.LJII(c1144350fsv.LIZ, c1144350fsv.LIZJ, AQ2(this.LLJJIJIL), "anchor_income", this.LLJILJILJ.LIZLLL, 1, C500260Jjc.LJJJI(Boolean.valueOf(BQ2())) ? 1 : 0, 0, C500260Jjc.LJJJI(Boolean.valueOf(this.LLILLJJLI)) ? 1 : 0, str);
        Boolean bool = this.LLILZLL;
        boolean zCQ2 = CQ2(false);
        if (ExchangeDialogVM.EQ2(this.LLJILJILJ.LJII)) {
            str2 = "dont_show_again";
        } else if (CQ2(false)) {
            str2 = "cancel";
        } else {
            str2 = "not_now";
        }
        GQ2("anchor_income", bool, false, Boolean.valueOf(zCQ2), str2);
    }

    public BaseLiveIncomeExchangeDialogVM(AbstractC1149740g1c abstractC1149740g1c, Context context, C1144350fsv c1144350fsv, InterfaceC1149850g1n interfaceC1149850g1n, EnumC1149830g1l enumC1149830g1l) {
        super(2, context, interfaceC1149850g1n, c1144350fsv, abstractC1149740g1c);
        this.LLJJJ = enumC1149830g1l;
        this.LLJJJIL = ((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJIL();
    }
}
