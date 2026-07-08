package X;

import Y.AfS186S0100000_17;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.data.api.IExchangeApi;
import com.bytedance.android.live.wallet.data.model.exchange.DefaultLocationData;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.BasePackage;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.TaxDialogParams;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g1z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1149970g1z {
    public static final /* synthetic */ int LIZ = 0;

    public static C11L6 LIZ(Map map) {
        C480460Ism.LIZ().getClass();
        return ((IExchangeApi) C480460Ism.LIZLLL(IExchangeApi.class)).getDefaultLocation().LJIL(new InterfaceC1487280oo2() { // from class: X.0g0j
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) throws C1149180g0i {
                T t = ((BaseResponse) obj).data;
                if (t != null) {
                    return t;
                }
                throw new C1149180g0i(10000, "default location data is null");
            }
        }).LJJI(new InterfaceC1487280oo2() { // from class: X.0g1v
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C1803440x1y.LIZIZ("ttlive_wallet_exchange_get_default_location", (Throwable) obj);
                DefaultLocationData defaultLocationData = new DefaultLocationData();
                defaultLocationData.LIZ = true;
                defaultLocationData.LIZIZ = C497740JfY.LJIJI(2131844625);
                return AbstractC19484711Kz.LJIJJLI(defaultLocationData);
            }
        }).LJIIL(new AfS186S0100000_17(map, 68)).LJIILL(new AfS186S0100000_17(map, 69));
    }

    public static void LIZJ(TaxDialogParams taxDialogParams, String str) {
        String str2;
        String str3 = taxDialogParams.exchangeSource;
        int iHashCode = str3.hashCode();
        if (iHashCode != 48) {
            if (iHashCode != 57) {
                if (iHashCode != 1567) {
                    if (iHashCode == 1568 && str3.equals("11")) {
                        int i = taxDialogParams.isAutoExchange;
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_balance_exchange_tax_pop_up");
                        c474500IjALIZ.LJIL();
                        c474500IjALIZ.LJJII(str, "action_type");
                        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_auto");
                        c474500IjALIZ.LIZ();
                        return;
                    }
                    return;
                }
                if (!str3.equals("10")) {
                    return;
                }
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_withdraw_exchange_tax_pop_up");
                c474500IjALIZ2.LJIL();
                c474500IjALIZ2.LJJII(str, "action_type");
                c474500IjALIZ2.LIZ();
                return;
            }
            if (!str3.equals("9")) {
                return;
            }
        } else if (!str3.equals(CardStruct.IStatusCode.DEFAULT)) {
            return;
        }
        String str4 = taxDialogParams.exchangeSource;
        if (Intrinsics.LJFF(str4, "9")) {
            str2 = "my_profile";
        } else {
            Intrinsics.LJFF(str4, CardStruct.IStatusCode.DEFAULT);
            str2 = "live_detail";
        }
        C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_recharge_exchange_tax_pop_up");
        c474500IjALIZ3.LJIL();
        c474500IjALIZ3.LJJII(str, "action_type");
        c474500IjALIZ3.LJJII(str2, "request_page");
        c474500IjALIZ3.LIZ();
    }

    public static C11L6 LIZIZ(String str, String str2, String str3, int i, int i2, boolean z, boolean z2) {
        RevenueExchange revenueExchange;
        long id;
        String str4;
        int realDot;
        BalanceStructExtra balanceStructExtra;
        BasePackage basePackage;
        BalanceStructExtra balanceStructExtra2;
        BasePackage basePackage2;
        BalanceStructExtra balanceStructExtra3;
        BasePackage basePackage3;
        WalletStruct walletStructTF1 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().TF1();
        if (walletStructTF1 != null) {
            revenueExchange = walletStructTF1.revenue;
        } else {
            revenueExchange = null;
        }
        long jNo0 = ((long) i2) - ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
        long price = 0;
        if (walletStructTF1 != null && (balanceStructExtra3 = walletStructTF1.LIZ) != null && (basePackage3 = balanceStructExtra3.getBasePackage()) != null) {
            id = basePackage3.getId();
        } else {
            id = 0;
        }
        int i3 = (int) id;
        if (revenueExchange == null || (str4 = revenueExchange.currency) == null) {
            str4 = "";
        }
        if (walletStructTF1 != null && (balanceStructExtra2 = walletStructTF1.LIZ) != null && (basePackage2 = balanceStructExtra2.getBasePackage()) != null) {
            price = basePackage2.getPrice();
        }
        long j = price * jNo0;
        if (walletStructTF1 != null && (balanceStructExtra = walletStructTF1.LIZ) != null && (basePackage = balanceStructExtra.getBasePackage()) != null) {
            realDot = basePackage.getRealDot();
        } else {
            realDot = 0;
        }
        long j2 = realDot;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("exchange_type", str), new Pair("exchange_scenario", str2), new Pair("charge_reason", str3), new Pair("request_page", "live_detail"));
        C480460Ism.LIZ().getClass();
        IExchangeApi iExchangeApi = (IExchangeApi) C480460Ism.LIZLLL(IExchangeApi.class);
        InterfaceC1149980g20.LIZ.getClass();
        return iExchangeApi.getExchangeThresholdInfo(0, i3, i, str4, 0, jNo0, j, j2, z, z2).LJIL(new InterfaceC1487280oo2() { // from class: X.0g0k
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) throws C1149180g0i {
                T t = ((BaseResponse) obj).data;
                if (t != null) {
                    return t;
                }
                throw new C1149180g0i(10001, "exchange threshold info data is null");
            }
        }).LJIIL(new AfS186S0100000_17(mapLJIIJ, 70)).LJIILL(new AfS186S0100000_17(mapLJIIJ, 71));
    }
}
