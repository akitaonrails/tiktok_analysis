package com.bytedance.android.live.wallet.viewmodel.exchange;

import X.C0IJT;
import X.C1103530ep5;
import X.C1126800fQc;
import X.C1131530fYF;
import X.C1133940fc8;
import X.C1142550fq1;
import X.C1144350fsv;
import X.C1149160g0g;
import X.C1149170g0h;
import X.C1149180g0i;
import X.C1149680g1W;
import X.C1149870g1p;
import X.C1161920gLG;
import X.C13LP;
import X.C158B;
import X.C1803800x2Y;
import X.C1805400x58;
import X.C474500IjA;
import X.InterfaceC1094160eZy;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.livesdk.livesetting.other.LiveExchangeCancelLimit;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public abstract class ExchangeDialogVM extends ViewModel {
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public long LLILZ;
    public Boolean LLILZLL;
    public final /* synthetic */ C1103530ep5 LL = new C1103530ep5();
    public HashMap<String, Long> LLILZIL = new HashMap<>();

    public abstract String AQ2(boolean z);

    public abstract boolean DQ2();

    public abstract void MQ2();

    public abstract void NQ2();

    public abstract void OQ2();

    public abstract void onShow();

    public abstract boolean yQ2();

    public abstract C1144350fsv zQ2();

    public final boolean BQ2() {
        return InterfaceC1094160eZy.S0.LIZIZ().intValue() > 1 && !DQ2();
    }

    public final boolean vQ2() {
        return DQ2() && !yQ2();
    }

    public final String xQ2() {
        boolean zVQ2 = vQ2();
        WalletExchange.LL.getClass();
        boolean zLIZ = WalletExchange.LIZ();
        String str = zQ2().LIZLLL;
        C1149870g1p c1149870g1p = zQ2().LJII;
        return C1149160g0g.LIZIZ(str, c1149870g1p != null ? c1149870g1p.LIZLLL : null, zVQ2, zLIZ);
    }

    public static boolean EQ2(C1149870g1p c1149870g1p) {
        boolean z;
        Boolean boolLIZIZ;
        if (c1149870g1p == null ? InterfaceC1094160eZy.L0.LIZIZ().intValue() >= LiveExchangeCancelLimit.INSTANCE.getValue() : InterfaceC1094160eZy.N0.LIZIZ().intValue() >= LiveExchangeCancelLimit.INSTANCE.getValue()) {
            z = true;
        } else {
            z = false;
        }
        if (c1149870g1p != null) {
            boolLIZIZ = InterfaceC1094160eZy.O0.LIZIZ();
        } else {
            boolLIZIZ = InterfaceC1094160eZy.M0.LIZIZ();
        }
        if (z && boolLIZIZ.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean CQ2(boolean z) {
        return C1805400x58.LIZIZ(this.LLILLJJLI, zQ2().LIZIZ, zQ2().LIZLLL, zQ2().LIZJ, z, zQ2().LIZ);
    }

    public final void LQ2(String str) {
        Object obj;
        long jNo0 = ((long) zQ2().LIZIZ) - ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
        String strXQ2 = xQ2();
        String str2 = zQ2().LJ;
        WalletExchange.LL.getClass();
        boolean z = !WalletExchange.LIZ();
        String str3 = zQ2().LIZLLL;
        C1126800fQc.LIZ.M92();
        boolean zLJIIJJI = C1133940fc8.LJIIJJI();
        C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
        HashMap map = new HashMap();
        c1803800x2Y.getClass();
        C1803800x2Y.LJFF(0, map);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_exchange_confirm");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str, "exchange_type");
        c474500IjALIZ.LJJII("live_detail", "request_page");
        c474500IjALIZ.LJJII(strXQ2, "exchange_scenario");
        c474500IjALIZ.LJJII(str2, "charge_reason");
        c474500IjALIZ.LJJII(str3, "gift_enter_from");
        c474500IjALIZ.LJJII(C1149680g1W.LIZLLL(), "live_scene");
        c474500IjALIZ.LJJII("system_combo", "exchange_level");
        c474500IjALIZ.LJJII(Long.valueOf(jNo0), "exchange_coins");
        String str4 = "1";
        if (zLJIIJJI) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, "is_first_recharge");
        if (!z) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str4, "is_exchange_only");
        c474500IjALIZ.LJJIIZI(map);
        C1149680g1W.LIZJ(c474500IjALIZ, str3);
        c474500IjALIZ.LIZ();
        C1803800x2Y.LJJJJJL(c474500IjALIZ);
    }

    public final void wQ2(String str) {
        long jLIZ;
        HashMap<String, Long> map = this.LLILZIL;
        if (Intrinsics.LJFF(str, "loading_duration")) {
            jLIZ = (C158B.LIZ() - this.LLILZ) + C13LP.LJZL(this.LLILZIL.values());
        } else {
            jLIZ = C158B.LIZ() - this.LLILZ;
        }
        map.put(str, Long.valueOf(jLIZ));
        this.LLILZ = C158B.LIZ();
    }

    public final void JQ2(String str, boolean z, Boolean bool) {
        C1149680g1W.LJIILL(str, xQ2(), zQ2().LIZLLL, zQ2().LJ, CQ2(Intrinsics.LJFF(str, "ug_exchange")), z, Intrinsics.LJFF(bool, Boolean.TRUE), this.LLILLL);
    }

    public final void KQ2(String str, boolean z, Boolean bool) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        long jNo0 = ((long) zQ2().LIZIZ) - ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
        String strXQ2 = xQ2();
        String str2 = zQ2().LIZLLL;
        String str3 = zQ2().LJ;
        C1126800fQc.LIZ.M92();
        boolean zLJIIJJI = C1133940fc8.LJIIJJI();
        boolean zLJFF = Intrinsics.LJFF(bool, Boolean.TRUE);
        boolean zCQ2 = CQ2(Intrinsics.LJFF(str, "ug_exchange"));
        boolean z2 = this.LLILLJJLI;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_exchange_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str, "exchange_type");
        c474500IjALIZ.LJJII(strXQ2, "exchange_scenario");
        c474500IjALIZ.LJJII(C1149680g1W.LIZLLL(), "live_scene");
        c474500IjALIZ.LJJII("system_combo", "exchange_level");
        c474500IjALIZ.LJJII(Long.valueOf(jNo0), "exchange_coins");
        c474500IjALIZ.LJJII(str3, "charge_reason");
        c474500IjALIZ.LJJII(str2, "gift_enter_from");
        c474500IjALIZ.LJJII("live_detail", "request_page");
        String str4 = "1";
        if (zLJIIJJI) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, "is_first_recharge");
        if (zLJFF) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj2, "is_need_w9");
        if (z) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj3, "is_need_second_confirm");
        if (!zCQ2) {
            obj4 = "1";
        } else {
            obj4 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj4, "is_second_confirmation_needed");
        if (!z2) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str4, "is_auto_exchange_selected");
        C1149680g1W.LIZ(c474500IjALIZ);
        C1149680g1W.LIZJ(c474500IjALIZ, str2);
        c474500IjALIZ.LIZ();
        C1803800x2Y.LIZ.getClass();
        C1803800x2Y.LJJJJJL(c474500IjALIZ);
        if (C1131530fYF.LJ(str2) && Intrinsics.LJFF(str, "ug_exchange")) {
            C1142550fq1.LIZIZ("pre_claim", "ug_live_first_consume_task", "click", str2);
        }
    }

    public final void GQ2(String str, Boolean bool, boolean z, Boolean bool2, String str2) {
        String str3;
        String str4;
        String str5;
        long jNo0 = ((long) zQ2().LIZIZ) - ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
        String strXQ2 = xQ2();
        String str6 = zQ2().LIZLLL;
        String str7 = zQ2().LJ;
        if (z) {
            str3 = "livesdk_exchange_confirm_cancel";
        } else {
            str3 = "livesdk_exchange_cancel";
        }
        C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
        HashMap map = new HashMap();
        c1803800x2Y.getClass();
        C1803800x2Y.LJFF(0, map);
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str3);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str, "exchange_type");
        c474500IjALIZ.LJJII(strXQ2, "exchange_scenario");
        c474500IjALIZ.LJJII(C1149680g1W.LIZLLL(), "live_scene");
        c474500IjALIZ.LJJII("system_combo", "exchange_level");
        c474500IjALIZ.LJJII(Long.valueOf(jNo0), "exchange_coins");
        c474500IjALIZ.LJJII(str7, "charge_reason");
        c474500IjALIZ.LJJII(str6, "gift_enter_from");
        c474500IjALIZ.LJJII("live_detail", "request_page");
        c474500IjALIZ.LJJII(C1149680g1W.LJ(), "is_first_recharge");
        boolean zLJFF = Intrinsics.LJFF(bool, Boolean.TRUE);
        String str8 = CardStruct.IStatusCode.DEFAULT;
        if (zLJFF) {
            str4 = "1";
        } else if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str4 = "-1";
        }
        c474500IjALIZ.LJJII(str4, "is_need_w9");
        c474500IjALIZ.LJJIIZI(map);
        if (!z && bool2 != null) {
            if (!bool2.booleanValue()) {
                str8 = "1";
            }
            c474500IjALIZ.LJJII(str8, "is_second_confirmation_needed");
            if (bool2.booleanValue()) {
                str5 = "exchange_and_send";
            } else {
                str5 = "confirm";
            }
            c474500IjALIZ.LJJII(str5, "click_button");
        }
        if (str2 != null) {
            c474500IjALIZ.LJJII(str2, "exit_click_position");
        }
        C1149680g1W.LIZJ(c474500IjALIZ, str6);
        c474500IjALIZ.LIZ();
        C1803800x2Y.LJJJJJL(c474500IjALIZ);
        if (!z && C1131530fYF.LJ(str6) && Intrinsics.LJFF(str, "ug_exchange")) {
            C1142550fq1.LIZIZ("pre_claim", "ug_live_first_consume_task", "cancel", str6);
        }
    }

    public final void IQ2(Throwable th, String str, String str2, String str3, Boolean bool) {
        String strValueOf;
        if (th != null) {
            C1149180g0i.Companion.getClass();
            strValueOf = String.valueOf(C1149170g0h.LIZ(th).getErrorCode());
        } else {
            strValueOf = null;
        }
        long jNo0 = ((long) zQ2().LIZIZ) - ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0();
        String str4 = zQ2().LJ;
        WalletExchange.LL.getClass();
        C1149680g1W.LJIILIIL(str2, str, str4, !WalletExchange.LIZ(), strValueOf, C158B.LIZ() - this.LLILZ, jNo0, zQ2().LIZLLL, str3, bool, null);
    }
}
