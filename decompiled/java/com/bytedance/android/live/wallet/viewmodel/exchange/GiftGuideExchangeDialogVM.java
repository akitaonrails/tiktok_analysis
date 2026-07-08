package com.bytedance.android.live.wallet.viewmodel.exchange;

import X.C1144350fsv;
import X.C1149680g1W;
import X.C1149780g1g;
import X.C1151110g3p;
import X.C1161920gLG;
import X.C158B;
import X.C20337914i1;
import X.C2097608Jq;
import X.InterfaceC1094160eZy;
import X.InterfaceC1149850g1n;
import X.InterfaceC1149940g1w;
import android.content.Context;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftGuideExchangeDialogVM extends ExchangeTaxDialogVM {
    public final C1144350fsv LLJJJ;
    public final int LLJJJIL;
    public final boolean LLJJJJ;
    public final Map<Integer, String> LLJJJJJIL;
    public final int LLJJJJLIIL;

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeTaxDialogVM, com.bytedance.android.live.wallet.viewmodel.exchange.BillingAddressVM, com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final boolean yQ2() {
        return false;
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void MQ2() {
        boolean zBR2 = bR2();
        boolean z = this.LLILLJJLI;
        C1144350fsv c1144350fsv = this.LLJJJ;
        DataChannel dataChannel = c1144350fsv.LIZ;
        long j = c1144350fsv.LIZJ;
        String strAQ2 = AQ2(true);
        String str = this.LLJJJJJIL.get(Integer.valueOf(this.LLJJJIL));
        if (str == null) {
            str = "";
        }
        C1149680g1W.LJII(dataChannel, j, strAQ2, str, this.LLJJJ.LIZLLL, 1, zBR2 ? 1 : 0, 0, z ? 1 : 0, "cancel");
        GQ2(WQ2(), this.LLILZLL, false, null, null);
        if (InterfaceC1094160eZy.P0.LIZIZ().intValue() >= 0) {
            aR2();
        }
        InterfaceC1149850g1n interfaceC1149850g1n = this.LLJILLL;
        if (interfaceC1149850g1n != null) {
            interfaceC1149850g1n.LJFF();
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void NQ2() {
        InterfaceC1149850g1n interfaceC1149850g1n = this.LLJILLL;
        if (interfaceC1149850g1n != null) {
            interfaceC1149850g1n.LJFF();
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.base.ExchangeFirstStageVM
    public final int RQ2() {
        return this.LLJJJIL == 1 ? 0 : 1;
    }

    public final boolean aR2() {
        C20337914i1<Integer> c20337914i1 = InterfaceC1094160eZy.P0;
        c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
        return true;
    }

    public final boolean bR2() {
        WalletStruct walletStruct = C1151110g3p.LIZ.LL;
        if (walletStruct != null && walletStruct.autoExchangeSupported && !this.LLJJJJ) {
            C20337914i1<Integer> c20337914i1 = InterfaceC1094160eZy.P0;
            if (c20337914i1.LIZIZ().intValue() >= 0 && c20337914i1.LIZIZ().intValue() < 4) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.base.ExchangeFirstStageVM
    public final void SQ2() {
        this.LLILZ = C158B.LIZ();
        this.LLILZIL = new HashMap<>();
        boolean zBR2 = bR2();
        boolean z = this.LLILLJJLI;
        C1144350fsv c1144350fsv = this.LLJJJ;
        DataChannel dataChannel = c1144350fsv.LIZ;
        long j = c1144350fsv.LIZJ;
        String strAQ2 = AQ2(true);
        String str = this.LLJJJJJIL.get(Integer.valueOf(this.LLJJJIL));
        if (str == null) {
            str = "";
        }
        C1149680g1W.LJIIIIZZ(dataChannel, j, strAQ2, str, this.LLJJJ.LIZLLL, 1, zBR2 ? 1 : 0, 0, z ? 1 : 0);
        InterfaceC1149850g1n interfaceC1149850g1n = this.LLJILLL;
        if (interfaceC1149850g1n != null) {
            interfaceC1149850g1n.LJ(this.LLJJJJLIIL, false);
        }
        Context context = this.LLJILJIL;
        if (context != null) {
            Boolean bool = this.LLILZLL;
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.LJFF(bool, bool2)) {
                KQ2(WQ2(), false, bool2);
                wQ2("loading_duration");
                XQ2(1, null);
                ZQ2();
                return;
            }
            Boolean bool3 = this.LLILZLL;
            Boolean bool4 = Boolean.FALSE;
            if (!Intrinsics.LJFF(bool3, bool4)) {
                if (InterfaceC1094160eZy.P0.LIZIZ().intValue() >= 0) {
                    aR2();
                }
                InterfaceC1149850g1n interfaceC1149850g1n2 = this.LLJILLL;
                if (interfaceC1149850g1n2 != null) {
                    interfaceC1149850g1n2.LIZJ();
                    return;
                }
                return;
            }
            if (!this.LLILLJJLI || !bR2()) {
                KQ2(WQ2(), false, bool4);
                aR2();
                InterfaceC1149850g1n interfaceC1149850g1n3 = this.LLJILLL;
                if (interfaceC1149850g1n3 != null) {
                    interfaceC1149850g1n3.LIZIZ(this.LLJJJJLIIL, this.LLJJIJIIJIL, this.LLJJJJ, false, 112, null);
                }
                C1149680g1W.LJIJI();
                return;
            }
            KQ2(WQ2(), true, bool4);
            C1149780g1g c1149780g1g = new C1149780g1g(context, this.LLJJJ, this.LLJILLL, this.LLJJJIL);
            AutoExchangeConfirmExchangeDialogVM autoExchangeConfirmExchangeDialogVM = c1149780g1g.LJIIIIZZ;
            autoExchangeConfirmExchangeDialogVM.getClass();
            C1144350fsv c1144350fsv2 = autoExchangeConfirmExchangeDialogVM.LLIZ;
            DataChannel dataChannel2 = c1144350fsv2.LIZ;
            long j2 = c1144350fsv2.LIZJ;
            String str2 = autoExchangeConfirmExchangeDialogVM.LLJILJIL.get(Integer.valueOf(autoExchangeConfirmExchangeDialogVM.LLJIJIL));
            C1149680g1W.LJIIIZ(dataChannel2, j2, "second_confirm_page", str2 != null ? str2 : "", autoExchangeConfirmExchangeDialogVM.LLIZ.LIZLLL, 2, 0, 1);
            c1149780g1g.show();
            wQ2("loading_duration");
            XQ2(2, null);
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.base.ExchangeFirstStageVM, com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void onShow() {
        super.onShow();
        wQ2("loading_duration");
        XQ2(0, null);
        InterfaceC1149850g1n interfaceC1149850g1n = this.LLJILLL;
        if (interfaceC1149850g1n != null) {
            interfaceC1149850g1n.onShow();
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.BillingAddressVM, com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final boolean DQ2() {
        return this.LLJJJJ;
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.BillingAddressVM
    public final int UQ2() {
        return this.LLJJJJLIIL;
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.BillingAddressVM, com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final C1144350fsv zQ2() {
        return this.LLJJJ;
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final String AQ2(boolean z) {
        if (InterfaceC1094160eZy.P0.LIZIZ().intValue() >= 0) {
            return "first_show_page";
        }
        return "not_auto_anchor_first";
    }

    public GiftGuideExchangeDialogVM(int i, Context context, InterfaceC1149850g1n interfaceC1149850g1n, C1144350fsv c1144350fsv, InterfaceC1149940g1w interfaceC1149940g1w) {
        boolean zLJJ;
        super(i, context, interfaceC1149850g1n, c1144350fsv, interfaceC1149940g1w);
        this.LLJJJ = c1144350fsv;
        this.LLJJJIL = i;
        if (i == 2) {
            zLJJ = ((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJIL();
        } else if (i == 1) {
            zLJJ = ((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJJ();
        } else {
            zLJJ = false;
        }
        this.LLJJJJ = zLJJ;
        this.LLJJJJJIL = C2097608Jq.LJIIIIZZ(new Pair(2, "anchor_income"), new Pair(1, "ug_exchange"));
        this.LLJJJJLIIL = i;
    }
}
