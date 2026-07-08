package X;

import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.WalletStruct;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.0fYI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1131560fYI {
    public static final AtomicLong LIZ = new AtomicLong(0);

    public static boolean LIZ() {
        IWalletService iWalletService;
        IWalletCenter iWalletCenterWalletCenter;
        BalanceStruct balanceStructG52;
        IWalletService iWalletService2;
        IWalletCenter iWalletCenterWalletCenter2;
        BalanceStruct balanceStructG522;
        BalanceStructExtra balanceStructExtra;
        IWalletService iWalletService3;
        IWalletCenter iWalletCenterWalletCenter3;
        WalletStruct walletStructTF1;
        BalanceStructExtra balanceStructExtra2;
        IWalletCenter iWalletCenterWalletCenter4;
        WalletStruct walletStructTF12;
        RevenueExchange revenueExchange;
        IWalletService iWalletService4 = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
        return ((!((iWalletService4 == null || (iWalletCenterWalletCenter4 = iWalletService4.walletCenter()) == null || (walletStructTF12 = iWalletCenterWalletCenter4.TF1()) == null || (revenueExchange = walletStructTF12.revenue) == null) ? false : revenueExchange.enableExchange) || (iWalletService3 = (IWalletService) C1161920gLG.LIZJ(IWalletService.class)) == null || (iWalletCenterWalletCenter3 = iWalletService3.walletCenter()) == null || (walletStructTF1 = iWalletCenterWalletCenter3.TF1()) == null || (balanceStructExtra2 = walletStructTF1.LIZ) == null || balanceStructExtra2.getCoins() <= 0) && ((iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class)) == null || (iWalletCenterWalletCenter = iWalletService.walletCenter()) == null || (balanceStructG52 = iWalletCenterWalletCenter.g52()) == null || !balanceStructG52.validUser || (iWalletService2 = (IWalletService) C1161920gLG.LIZJ(IWalletService.class)) == null || (iWalletCenterWalletCenter2 = iWalletService2.walletCenter()) == null || (balanceStructG522 = iWalletCenterWalletCenter2.g52()) == null || (balanceStructExtra = balanceStructG522.exchangeInfo) == null || balanceStructExtra.getCoins() <= 0)) ? false : true;
    }

    public static long LIZIZ() {
        IWalletCenter iWalletCenterWalletCenter;
        IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
        if (iWalletService == null || (iWalletCenterWalletCenter = iWalletService.walletCenter()) == null) {
            return 0L;
        }
        return iWalletCenterWalletCenter.No0();
    }

    public static void LIZJ() {
        long jLIZIZ = LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onGiftWidgetLoad:");
        sbLIZ.append(jLIZIZ);
        C20441214yg.LJ("GiftWalletHelper", C2188811AlT.LIZIZ(sbLIZ));
        AtomicLong atomicLong = LIZ;
        atomicLong.set(jLIZIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("new balance:");
        sbLIZ2.append(atomicLong.get());
        C20441214yg.LJ("GiftWalletHelper", C2188811AlT.LIZIZ(sbLIZ2));
    }
}
