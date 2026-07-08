package com.bytedance.android.live.wallet.viewmodel.exchange;

import X.C1126800fQc;
import X.C1131530fYF;
import X.C1133940fc8;
import X.C1144350fsv;
import X.C1149680g1W;
import X.C1149820g1k;
import X.C1150850g3P;
import X.C1161920gLG;
import X.C158B;
import X.C1954807lC;
import X.C2097608Jq;
import X.C500260Jjc;
import X.EnumC1149830g1l;
import X.InterfaceC1149850g1n;
import android.content.Context;
import com.bytedance.android.live.wallet.IWalletExchange;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.BasePackage;
import com.bytedance.android.live.wallet.model.CurrencyInfo;
import com.bytedance.android.live.wallet.model.ExchangeParams;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class ConfirmExchangeDialogVM extends ExchangeDialogVM {
    public final Context LLIZ;
    public final C1144350fsv LLIZLLLIL;
    public final InterfaceC1149850g1n LLJ;
    public final boolean LLJI;
    public final boolean LLJIJIL;
    public final EnumC1149830g1l LLJILJIL;
    public final Map<EnumC1149830g1l, Pair<Integer, String>> LLJILJILJ;
    public final int LLJILLL;

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void MQ2() {
        String second;
        boolean z = this.LLILLJJLI;
        C1144350fsv c1144350fsv = this.LLIZLLLIL;
        DataChannel dataChannel = c1144350fsv.LIZ;
        long j = c1144350fsv.LIZJ;
        String strAQ2 = AQ2(this.LLJIJIL);
        Pair<Integer, String> pair = this.LLJILJILJ.get(this.LLJILJIL);
        if (pair == null || (second = pair.getSecond()) == null) {
            second = "";
        }
        C1149680g1W.LJII(dataChannel, j, strAQ2, second, this.LLIZLLLIL.LIZLLL, 2, 0, z ? 1 : 0, z ? 1 : 0, "cancel");
        GQ2(PQ2(), this.LLILZLL, true, Boolean.valueOf(CQ2(this.LLJILJIL == EnumC1149830g1l.UG)), null);
        InterfaceC1149850g1n interfaceC1149850g1n = this.LLJ;
        if (interfaceC1149850g1n != null) {
            interfaceC1149850g1n.LIZLLL();
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void NQ2() {
        InterfaceC1149850g1n interfaceC1149850g1n = this.LLJ;
        if (interfaceC1149850g1n != null) {
            interfaceC1149850g1n.LIZLLL();
        }
    }

    public final String PQ2() {
        int i = C1149820g1k.LIZ[this.LLJILJIL.ordinal()];
        if (i == 1) {
            return "anchor_income";
        }
        if (i == 2) {
            return "ug_exchange";
        }
        if (i != 3) {
            throw new C1954807lC();
        }
        return "anchor_income";
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void onShow() {
        InterfaceC1149850g1n interfaceC1149850g1n = this.LLJ;
        if (interfaceC1149850g1n != null) {
            interfaceC1149850g1n.onShow();
        }
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final void OQ2() {
        String second;
        BalanceStructExtra balanceStructExtra;
        CurrencyInfo currencyInfo;
        BalanceStructExtra balanceStructExtra2;
        BasePackage basePackage;
        BalanceStructExtra balanceStructExtra3;
        BasePackage basePackage2;
        String str;
        BalanceStructExtra balanceStructExtra4;
        BasePackage basePackage3;
        this.LLILZ = C158B.LIZ();
        long jNo0 = ((long) this.LLIZLLLIL.LIZIZ) - ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
        boolean z = this.LLILLJJLI;
        C1144350fsv c1144350fsv = this.LLIZLLLIL;
        DataChannel dataChannel = c1144350fsv.LIZ;
        long j = c1144350fsv.LIZJ;
        String strAQ2 = AQ2(this.LLJIJIL);
        Pair<Integer, String> pair = this.LLJILJILJ.get(this.LLJILJIL);
        String str2 = "";
        if (pair == null || (second = pair.getSecond()) == null) {
            second = "";
        }
        C1149680g1W.LJIIIIZZ(dataChannel, j, strAQ2, second, this.LLIZLLLIL.LIZLLL, 2, 0, z ? 1 : 0, z ? 1 : 0);
        if (this.LLILLJJLI) {
            IWalletExchange iWalletExchangeWalletExchange = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange();
            String str3 = this.LLIZLLLIL.LIZLLL;
            iWalletExchangeWalletExchange.getClass();
            WalletExchange.LIZLLL("not_auto_exchange", str3, false);
        }
        InterfaceC1149850g1n interfaceC1149850g1n = this.LLJ;
        if (interfaceC1149850g1n != null) {
            interfaceC1149850g1n.LIZ(this.LLJILLL);
        }
        boolean zCQ2 = CQ2(this.LLJILJIL == EnumC1149830g1l.UG);
        if (zCQ2) {
            KQ2("anchor_income", false, this.LLILZLL);
        } else {
            LQ2(PQ2());
        }
        if (this.LLJILJIL != EnumC1149830g1l.LIVE_EXCHANGE_ONLY) {
            InterfaceC1149850g1n interfaceC1149850g1n2 = this.LLJ;
            if (interfaceC1149850g1n2 != null) {
                interfaceC1149850g1n2.LIZIZ(this.LLJILLL, jNo0, false, this.LLILLJJLI, 112, Boolean.valueOf(zCQ2));
            }
            C1149680g1W.LJIJI();
            return;
        }
        WalletExchange walletExchange = WalletExchange.LL;
        C1144350fsv c1144350fsv2 = this.LLIZLLLIL;
        int i = c1144350fsv2.LIZIZ;
        String str4 = c1144350fsv2.LJ;
        walletExchange.getClass();
        long jNo02 = ((long) i) - ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
        WalletStruct walletStructTF1 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().TF1();
        String symbol = null;
        RevenueExchange revenueExchange = walletStructTF1 != null ? walletStructTF1.revenue : null;
        ExchangeParams exchangeParams = new ExchangeParams();
        long price = 0;
        exchangeParams.diamondId = (int) ((walletStructTF1 == null || (balanceStructExtra4 = walletStructTF1.LIZ) == null || (basePackage3 = balanceStructExtra4.getBasePackage()) == null) ? 0L : basePackage3.getId());
        exchangeParams.way = 1;
        if (revenueExchange != null && (str = revenueExchange.currency) != null) {
            str2 = str;
        }
        exchangeParams.currency = str2;
        exchangeParams.source = 11;
        exchangeParams.subSource = 111;
        exchangeParams.coinsCount = jNo02;
        if (walletStructTF1 != null && (balanceStructExtra3 = walletStructTF1.LIZ) != null && (basePackage2 = balanceStructExtra3.getBasePackage()) != null) {
            price = basePackage2.getPrice();
        }
        exchangeParams.localAmount = price * jNo02;
        exchangeParams.currencyDot = (walletStructTF1 == null || (balanceStructExtra2 = walletStructTF1.LIZ) == null || (basePackage = balanceStructExtra2.getBasePackage()) == null) ? 0 : basePackage.getRealDot();
        C1126800fQc.LIZ.M92();
        exchangeParams.isFirstRecharge = C1133940fc8.LJIIJJI();
        if (walletStructTF1 != null && (balanceStructExtra = walletStructTF1.LIZ) != null && (currencyInfo = balanceStructExtra.getCurrencyInfo()) != null) {
            symbol = currencyInfo.getSymbol();
        }
        exchangeParams.symbol = symbol;
        exchangeParams.exchangeLevel = "system_combo";
        exchangeParams.eventParams = C2097608Jq.LJI(new Pair("charge_reason", str4));
        boolean z2 = C1131530fYF.LJ(this.LLIZLLLIL.LIZLLL) || C1131530fYF.LJFF(this.LLIZLLLIL.LIZLLL);
        Context context = this.LLIZ;
        C1144350fsv c1144350fsv3 = this.LLIZLLLIL;
        C1150850g3P.LIZIZ(c1144350fsv3.LIZJ, context, this.LLJ, exchangeParams, c1144350fsv3.LIZ, c1144350fsv3.LIZLLL, new AwS561S0100000_17(this, 442), new AwS596S0100000_17(this, 420), z2);
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final boolean DQ2() {
        return this.LLJI;
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final boolean yQ2() {
        return this.LLJIJIL;
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final C1144350fsv zQ2() {
        return this.LLIZLLLIL;
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public final String AQ2(boolean z) {
        int i = C1149820g1k.LIZ[this.LLJILJIL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "second_confirm_page";
                }
                throw new C1954807lC();
            }
            return "over_threshold_two";
        }
        if (z) {
            return "over_threshold_anchor_second";
        }
        return "not_auto_anchor_second";
    }

    public final void QQ2(boolean z) {
        String second;
        boolean z2 = this.LLILLJJLI;
        C1144350fsv c1144350fsv = this.LLIZLLLIL;
        DataChannel dataChannel = c1144350fsv.LIZ;
        long j = c1144350fsv.LIZJ;
        String strAQ2 = AQ2(z);
        Pair<Integer, String> pair = this.LLJILJILJ.get(this.LLJILJIL);
        if (pair == null || (second = pair.getSecond()) == null) {
            second = "";
        }
        C1149680g1W.LJIIIZ(dataChannel, j, strAQ2, second, this.LLIZLLLIL.LIZLLL, 2, C500260Jjc.LJJJI(Boolean.valueOf(BQ2())) ? 1 : 0, z2 ? 1 : 0);
    }

    public ConfirmExchangeDialogVM(Context context, InterfaceC1149850g1n interfaceC1149850g1n, C1144350fsv c1144350fsv, EnumC1149830g1l enumC1149830g1l, boolean z, boolean z2) {
        this.LLIZ = context;
        this.LLIZLLLIL = c1144350fsv;
        this.LLJ = interfaceC1149850g1n;
        this.LLJI = z;
        this.LLJIJIL = z2;
        this.LLJILJIL = enumC1149830g1l;
        Map<EnumC1149830g1l, Pair<Integer, String>> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair(EnumC1149830g1l.LIVE_EXCHANGE_ONLY, new Pair(2, "anchor_income")), new Pair(EnumC1149830g1l.UG, new Pair(1, "ug_exchange")), new Pair(EnumC1149830g1l.LIVE_EXCHANGE_AND_SEND, new Pair(2, "anchor_income")));
        this.LLJILJILJ = mapLJIIIIZZ;
        Pair<Integer, String> pair = mapLJIIIIZZ.get(enumC1149830g1l);
        this.LLJILLL = pair != null ? pair.getFirst().intValue() : 0;
    }
}
