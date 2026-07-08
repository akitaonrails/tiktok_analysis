package X;

import android.content.Context;
import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.live.wallet.viewmodel.exchange.ConfirmExchangeDialogVM;
import com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM;

/* JADX INFO: renamed from: X.0g1h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1149790g1h extends AbstractC1149720g1a {
    public final EnumC1149830g1l LJII;
    public final ConfirmExchangeDialogVM LJIIIIZZ;

    @Override // X.InterfaceC1150010g23
    public final boolean show() {
        RevenueExchange revenueExchange;
        WalletStruct walletStructTF1;
        this.LJIIIIZZ.LLILZ = C158B.LIZ();
        long jNo0 = ((long) this.LIZIZ.LIZIZ) - ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
        WalletStruct walletStructTF12 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().TF1();
        if (walletStructTF12 != null && (revenueExchange = walletStructTF12.revenue) != null) {
            int i = C1149840g1m.LIZ[this.LJII.ordinal()];
            if (i == 1) {
                this.LJ = new C1149810g1j(C497740JfY.LJIJI(2131841614), C497740JfY.LJIJJ(revenueExchange.isRevenue() ? 2131841971 : 2131841970, ((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJIIZILJ(jNo0, false)), 2131841595, 2131841613, 0, false, false, null, null, 3968);
            } else if (i == 2) {
                String strLJIJI = this.LJIIIIZZ.LLILLJJLI ? C497740JfY.LJIJI(2131840992) : C1149800g1i.LIZ(AbstractC1149720g1a.LJFF(this.LIZIZ.LIZLLL));
                IWalletCenter iWalletCenterWalletCenter = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter();
                boolean z = (iWalletCenterWalletCenter == null || (walletStructTF1 = iWalletCenterWalletCenter.TF1()) == null || !walletStructTF1.isPeriodicPayout) ? false : true;
                this.LJ = new C1149810g1j(strLJIJI, C497740JfY.LJIJJ(revenueExchange.isRevenue() ? z ? 2131841541 : 2131841592 : z ? 2131841549 : 2131841591, ((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJIIZILJ(jNo0, false)), 2131841595, 2131841613, 0, false, false, null, null, 3968);
            } else {
                if (i != 3) {
                    throw new C1954807lC();
                }
                this.LJ = new C1149810g1j(this.LJIIIIZZ.LLILLJJLI ? C497740JfY.LJIJI(2131840992) : C1149800g1i.LIZ(AbstractC1149720g1a.LJFF(this.LIZIZ.LIZLLL)), C497740JfY.LJIJJ(2131841596, ((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJIJ(jNo0)), 2131841595, 2131841613, 0, false, false, null, null, 3968);
            }
        }
        LIZIZ();
        return true;
    }

    @Override // X.AbstractC1149720g1a
    public final /* bridge */ /* synthetic */ ExchangeDialogVM LIZJ() {
        return this.LJIIIIZZ;
    }

    public C1149790g1h(Context context, InterfaceC1149850g1n interfaceC1149850g1n, C1144350fsv c1144350fsv, EnumC1149830g1l enumC1149830g1l, boolean z, boolean z2) {
        super(context, c1144350fsv);
        this.LJII = enumC1149830g1l;
        this.LJIIIIZZ = new ConfirmExchangeDialogVM(context, interfaceC1149850g1n, c1144350fsv, enumC1149830g1l, z, z2);
    }
}
