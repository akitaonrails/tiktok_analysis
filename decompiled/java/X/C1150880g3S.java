package X;

import com.bytedance.android.live.wallet.IWalletExchange;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g3S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1150880g3S {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str, String str2, Long l, Long l2, boolean z, boolean z2) {
        long jLongValue;
        C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
        if (str == null) {
            str = "";
        }
        long jLongValue2 = -1;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        }
        c1803800x2Y.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_balance_update");
        c474500IjALIZ.LJJII(str, "charge_reason");
        c474500IjALIZ.LJJII(str2, "scenario");
        c474500IjALIZ.LJJII(C1803800x2Y.LJIIL(null), "strategy_task_type");
        c474500IjALIZ.LJJII(C1796440wqg.LIZ(), "pay_method");
        c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "coin_balance_version_before");
        c474500IjALIZ.LJJII(Long.valueOf(jLongValue2), "coins_balance_version_after");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_update");
        c474500IjALIZ.LJJII(Integer.valueOf(z2 ? 1 : 0), "request_succeeded");
        c474500IjALIZ.LIZ();
    }

    public static void LIZ(String str, String str2, String str3, int i, long j, String str4, String str5, int i2) {
        IWalletExchange iWalletExchangeWalletExchange;
        IWalletExchange iWalletExchangeWalletExchange2;
        IWalletService iWalletService = (IWalletService) C1161920gLG.LIZJ(IWalletService.class);
        boolean z = true;
        if (!Intrinsics.LJFF(str2, "anchor_income") ? iWalletService == null || (iWalletExchangeWalletExchange = iWalletService.walletExchange()) == null || !((WalletExchange) iWalletExchangeWalletExchange).LJJ() : iWalletService == null || (iWalletExchangeWalletExchange2 = iWalletService.walletExchange()) == null || !((WalletExchange) iWalletExchangeWalletExchange2).LJIL()) {
            z = false;
        }
        WalletExchange.LL.getClass();
        String strLIZIZ = C1149160g0g.LIZIZ(str3, str5, z, WalletExchange.LIZ());
        C1803800x2Y.LIZ.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_balance_precheck");
        c474500IjALIZ.LJJII(str, "charge_reason");
        c474500IjALIZ.LJJII("live_detail", "request_page");
        c474500IjALIZ.LJJII(C1803800x2Y.LJIIL(null), "strategy_task_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "sufficient_type");
        c474500IjALIZ.LJJII(str2, "exchange_type");
        c474500IjALIZ.LJJII(strLIZIZ, "exchange_scenario");
        c474500IjALIZ.LJJII(C1123580fLQ.LIZ(str3), "gift_enter_from");
        c474500IjALIZ.LJJII(str4, "gift_send_type");
        c474500IjALIZ.LJJII(Long.valueOf(j), "gift_id");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "gift_total_price");
        c474500IjALIZ.LIZ();
    }
}
