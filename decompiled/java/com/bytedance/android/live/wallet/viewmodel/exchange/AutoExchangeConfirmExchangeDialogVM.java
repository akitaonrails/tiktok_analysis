package com.bytedance.android.live.wallet.viewmodel.exchange;

import X.C1144350fsv;
import X.C1149680g1W;
import X.C1161920gLG;
import X.C20337914i1;
import X.C2097608Jq;
import X.InterfaceC1094160eZy;
import X.InterfaceC1149850g1n;
import com.bytedance.android.live.wallet.IWalletExchange;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes18.dex */
public final class AutoExchangeConfirmExchangeDialogVM extends ExchangeDialogVM {
    public final C1144350fsv LLIZ;
    public final InterfaceC1149850g1n LLIZLLLIL;
    public final int LLJIJIL;
    public final int LLJILJILJ;
    public final long LLJILLL;
    public final boolean LLJ = false;
    public final boolean LLJI = false;
    public final Map<Integer, String> LLJILJIL = C2097608Jq.LJIIIIZZ(new Pair(2, "anchor_income"), new Pair(1, "ug_exchange"));

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final String AQ2(boolean z) {
        throw null;
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void MQ2() {
        boolean z = this.LLILLJJLI;
        C1144350fsv c1144350fsv = this.LLIZ;
        DataChannel dataChannel = c1144350fsv.LIZ;
        long j = c1144350fsv.LIZJ;
        String str = this.LLJILJIL.get(Integer.valueOf(this.LLJIJIL));
        if (str == null) {
            str = "";
        }
        C1149680g1W.LJII(dataChannel, j, "second_confirm_page", str, this.LLIZ.LIZLLL, 2, 0, 1, z ? 1 : 0, "cancel");
        int i = this.LLJIJIL;
        LQ2(i != 1 ? i != 2 ? "" : "anchor_income" : "ug_exchange");
        C20337914i1<Integer> c20337914i1 = InterfaceC1094160eZy.P0;
        c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
        String str2 = this.LLJILJIL.get(Integer.valueOf(this.LLJIJIL));
        C1149680g1W.LJIJ("not_auto_exchange", str2 != null ? str2 : "", this.LLIZ.LIZLLL, false);
        InterfaceC1149850g1n interfaceC1149850g1n = this.LLIZLLLIL;
        if (interfaceC1149850g1n != null) {
            interfaceC1149850g1n.LIZIZ(this.LLJILJILJ, this.LLJILLL, false, false, 112, null);
        }
        C1149680g1W.LJIJI();
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void NQ2() {
        InterfaceC1149850g1n interfaceC1149850g1n = this.LLIZLLLIL;
        if (interfaceC1149850g1n != null) {
            interfaceC1149850g1n.LIZIZ(this.LLJILJILJ, this.LLJILLL, false, false, 112, null);
        }
        C1149680g1W.LJIJI();
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void OQ2() {
        int i = this.LLJIJIL;
        LQ2(i != 1 ? i != 2 ? "" : "anchor_income" : "ug_exchange");
        boolean z = this.LLILLJJLI;
        C1144350fsv c1144350fsv = this.LLIZ;
        DataChannel dataChannel = c1144350fsv.LIZ;
        long j = c1144350fsv.LIZJ;
        String str = this.LLJILJIL.get(Integer.valueOf(this.LLJIJIL));
        C1149680g1W.LJIIIIZZ(dataChannel, j, "second_confirm_page", str != null ? str : "", this.LLIZ.LIZLLL, 2, 0, 1, z ? 1 : 0);
        int i2 = this.LLJIJIL;
        if (i2 == 2) {
            IWalletExchange iWalletExchangeWalletExchange = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange();
            String str2 = this.LLIZ.LIZLLL;
            iWalletExchangeWalletExchange.getClass();
            WalletExchange.LIZLLL("not_auto_exchange", str2, true);
        } else if (i2 == 1) {
            ((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJJIIJ("not_auto_exchange", this.LLIZ.LIZLLL);
        }
        InterfaceC1149850g1n interfaceC1149850g1n = this.LLIZLLLIL;
        if (interfaceC1149850g1n != null) {
            interfaceC1149850g1n.LIZ(this.LLJILJILJ);
        }
        InterfaceC1149850g1n interfaceC1149850g1n2 = this.LLIZLLLIL;
        if (interfaceC1149850g1n2 != null) {
            interfaceC1149850g1n2.LIZIZ(this.LLJILJILJ, this.LLJILLL, true, this.LLILLJJLI, 112, null);
        }
        C1149680g1W.LJIJI();
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void onShow() {
        InterfaceC1149850g1n interfaceC1149850g1n = this.LLIZLLLIL;
        if (interfaceC1149850g1n != null) {
            interfaceC1149850g1n.onShow();
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final boolean DQ2() {
        return this.LLJ;
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final boolean yQ2() {
        return this.LLJI;
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final C1144350fsv zQ2() {
        return this.LLIZ;
    }

    public AutoExchangeConfirmExchangeDialogVM(C1144350fsv c1144350fsv, InterfaceC1149850g1n interfaceC1149850g1n, int i) {
        this.LLIZ = c1144350fsv;
        this.LLIZLLLIL = interfaceC1149850g1n;
        this.LLJIJIL = i;
        this.LLJILJILJ = i;
        this.LLJILLL = ((long) c1144350fsv.LIZIZ) - ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
    }
}
