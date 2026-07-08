package X;

import android.content.Context;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM;
import com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeTaxDialogVM;
import com.bytedance.android.live.wallet.viewmodel.exchange.base.BaseLiveIncomeExchangeDialogVM;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletExchangeUseNewStarlingSetting;
import kotlin.jvm.internal.AwS261S0300000_17;

/* JADX INFO: renamed from: X.0g1d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1149750g1d extends AbstractC1149740g1c {
    public final InterfaceC1149850g1n LJIIIZ;
    public final C01GW LJIIJ;

    @Override // X.AbstractC1149720g1a
    public final ExchangeDialogVM LIZJ() {
        return (ExchangeDialogVM) this.LJIIJ.getValue();
    }

    @Override // X.AbstractC1149740g1c
    public final BaseLiveIncomeExchangeDialogVM LJII() {
        return (BaseLiveIncomeExchangeDialogVM) this.LJIIJ.getValue();
    }

    @Override // X.AbstractC1149740g1c
    public final String LJIIIZ() {
        String str;
        String strLJFF = AbstractC1149720g1a.LJFF(this.LIZIZ.LIZLLL);
        C1149870g1p c1149870g1p = this.LIZIZ.LJII;
        return (c1149870g1p == null || (str = c1149870g1p.LIZIZ) == null) ? C1149800g1i.LIZIZ(((ExchangeTaxDialogVM) this.LJIIJ.getValue()).LLJJIJIIJIL, ((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJIIZILJ(((ExchangeTaxDialogVM) this.LJIIJ.getValue()).LLJJIJIIJIL, false), strLJFF) : str;
    }

    @Override // X.AbstractC1149740g1c
    public final String LJIIJ() {
        String str;
        WalletStruct walletStructTF1 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().TF1();
        RevenueExchange revenueExchange = walletStructTF1 != null ? walletStructTF1.revenue : null;
        C1144350fsv c1144350fsv = this.LIZIZ;
        C1149870g1p c1149870g1p = c1144350fsv.LJII;
        String strLJFF = AbstractC1149720g1a.LJFF(c1144350fsv.LIZLLL);
        return (c1149870g1p == null || (str = c1149870g1p.LIZ) == null) ? (revenueExchange == null || !revenueExchange.isRevenue()) ? AbstractC1149720g1a.LJI() ? LiveWalletExchangeUseNewStarlingSetting.INSTANCE.isEnable() ? C1149800g1i.LIZJ(C497740JfY.LJIJJ(2131852269, strLJFF), strLJFF) : C497740JfY.LJIJJ(2131841554, strLJFF) : LiveWalletExchangeUseNewStarlingSetting.INSTANCE.isEnable() ? C1149800g1i.LIZJ(C497740JfY.LJIJJ(2131852270, strLJFF), strLJFF) : C497740JfY.LJIJJ(2131841635, strLJFF) : AbstractC1149720g1a.LJI() ? LiveWalletExchangeUseNewStarlingSetting.INSTANCE.isEnable() ? C1149800g1i.LIZJ(C497740JfY.LJIJJ(2131852268, strLJFF), strLJFF) : C497740JfY.LJIJJ(2131841545, strLJFF) : LiveWalletExchangeUseNewStarlingSetting.INSTANCE.isEnable() ? C1149800g1i.LIZJ(C497740JfY.LJIJJ(2131852267, strLJFF), strLJFF) : C497740JfY.LJIJJ(2131841636, strLJFF) : str;
    }

    @Override // X.AbstractC1149740g1c
    public final int LJIIIIZZ() {
        if (LIZJ().CQ2(false)) {
            return LiveWalletExchangeUseNewStarlingSetting.INSTANCE.isEnable() ? 2131852253 : 2131855704;
        }
        return 2131841606;
    }

    public C1149750g1d(Context context, C1144350fsv c1144350fsv, InterfaceC1149850g1n interfaceC1149850g1n) {
        super(context, c1144350fsv);
        this.LJIIIZ = interfaceC1149850g1n;
        this.LJIIJ = C292401Bi.LIZ(new AwS261S0300000_17(this, context, c1144350fsv, 9));
    }
}
