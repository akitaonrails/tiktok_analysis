package X;

import android.content.Context;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM;
import com.bytedance.android.live.wallet.viewmodel.exchange.GiftGuideExchangeDialogVM;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0g1b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1149730g1b extends AbstractC1149720g1a implements InterfaceC1149940g1w {
    public final C1144350fsv LJII;
    public final InterfaceC1149850g1n LJIIIIZZ;
    public final int LJIIIZ;
    public final GiftGuideExchangeDialogVM LJIIJ;

    @Override // X.InterfaceC1150010g23
    public final boolean show() {
        RevenueExchange revenueExchange;
        BalanceStructExtra balanceStructExtra;
        BalanceStructExtra balanceStructExtra2;
        this.LJIIJ.LLILZ = C158B.LIZ();
        GiftGuideExchangeDialogVM giftGuideExchangeDialogVM = this.LJIIJ;
        giftGuideExchangeDialogVM.getClass();
        WalletStruct walletStructTF1 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().TF1();
        if (walletStructTF1 != null) {
            revenueExchange = walletStructTF1.revenue;
            balanceStructExtra = walletStructTF1.LIZ;
        } else {
            revenueExchange = null;
            balanceStructExtra = null;
        }
        long jNo0 = ((long) giftGuideExchangeDialogVM.LLJJJ.LIZIZ) - ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
        BalanceStruct balanceStructG52 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().g52();
        long coins = (balanceStructG52 == null || (balanceStructExtra2 = balanceStructG52.exchangeInfo) == null) ? 0L : balanceStructExtra2.getCoins();
        if ((giftGuideExchangeDialogVM.LLJJJIL == 2 && (walletStructTF1 == null || revenueExchange == null || !revenueExchange.enableExchange || revenueExchange.balance <= 0 || balanceStructExtra == null || balanceStructExtra.getBasePackage() == null || jNo0 > balanceStructExtra.getCoins())) || (giftGuideExchangeDialogVM.LLJJJIL == 1 && (balanceStructG52 == null || balanceStructG52.exchangeInfo == null || !balanceStructG52.validUser || jNo0 > coins))) {
            return false;
        }
        if (giftGuideExchangeDialogVM.LLJJJ.LIZJ != 0 && giftGuideExchangeDialogVM.LLJILJIL != null) {
            C1149680g1W.LJIIJJI(giftGuideExchangeDialogVM.WQ2(), giftGuideExchangeDialogVM.xQ2(), giftGuideExchangeDialogVM.zQ2().LJ, giftGuideExchangeDialogVM.vQ2());
        }
        if (this.LIZ != null) {
            LJ();
            this.LJIIJ.VQ2();
        }
        return true;
    }

    @Override // X.AbstractC1149720g1a
    public final /* bridge */ /* synthetic */ ExchangeDialogVM LIZJ() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC1149940g1w
    public final Context context() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1149940g1w
    public final void LIZ(C1149890g1r c1149890g1r) {
        String strLJIJI;
        String strLIZIZ;
        C1144330fst c1144330fst;
        if (this.LIZ != null) {
            int i = this.LJIIIZ;
            if (i != 1) {
                if (i == 2) {
                    C1149870g1p c1149870g1p = this.LIZIZ.LJII;
                    long jNo0 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
                    String strLJIIL = C497740JfY.LJIIL(2131755518, (int) jNo0, Long.valueOf(jNo0));
                    String strLJJIFFI = u.LJJIFFI(u.LJJIFFI(C497740JfY.LJIIJJI(2131755519, (int) this.LJIIJ.LLJJIJIIJIL), "%@", ((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJIIZILJ(this.LJIIJ.LLJJIJIIJIL, false), false), "%d", String.valueOf(this.LJIIJ.LLJJIJIIJIL), false);
                    if (c1149870g1p == null || (strLJIJI = c1149870g1p.LIZ) == null) {
                        if (AbstractC1149720g1a.LJI()) {
                            strLJIJI = C497740JfY.LJIJI(2131841556);
                        } else {
                            strLJIJI = C497740JfY.LJIJI(2131841615);
                        }
                    }
                    if (c1149870g1p == null || (strLIZIZ = c1149870g1p.LIZIZ) == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strLJIIL);
                        sbLIZ.append(strLJJIFFI);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    boolean zBR2 = this.LJIIJ.bR2();
                    if (c1149870g1p != null) {
                        c1144330fst = c1149870g1p.LIZJ;
                    } else {
                        c1144330fst = null;
                    }
                    this.LJ = new C1149810g1j(strLJIJI, strLIZIZ, 2131840988, 2131841606, 2131840989, zBR2, false, c1144330fst, null, 3008);
                }
            } else {
                long jNo02 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
                long jNo03 = ((long) this.LJII.LIZIZ) - ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
                String strLJIIL2 = C497740JfY.LJIIL(2131755518, (int) jNo02, Long.valueOf(jNo02));
                String strLJJIFFI2 = u.LJJIFFI(u.LJJIFFI(C497740JfY.LJIIJJI(2131755519, (int) jNo03), "%@", ((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJIJ(jNo03), false), "%d", String.valueOf(jNo03), false);
                String strLJIJI2 = C497740JfY.LJIJI(2131841617);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLJIIL2);
                sbLIZ2.append(strLJJIFFI2);
                this.LJ = new C1149810g1j(strLJIJI2, C2188811AlT.LIZIZ(sbLIZ2), 2131840988, 2131841606, 2131840989, this.LJIIJ.bR2(), false, null, null, 4032);
            }
            LIZIZ();
        }
    }

    public C1149730g1b(Context context, C1144350fsv c1144350fsv, InterfaceC1149850g1n interfaceC1149850g1n, int i) {
        super(context, c1144350fsv);
        this.LJII = c1144350fsv;
        this.LJIIIIZZ = interfaceC1149850g1n;
        this.LJIIIZ = i;
        this.LJIIJ = new GiftGuideExchangeDialogVM(i, context, interfaceC1149850g1n, c1144350fsv, this);
    }
}
