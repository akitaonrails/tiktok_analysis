package X;

import com.bytedance.android.live.wallet.IWalletService;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g0g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1149160g0g {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZJ(int i) {
        return i != 1 ? i != 2 ? "" : "anchor_income" : "ug_exchange";
    }

    public static void LIZ(long j, String str, HashMap map) {
        long jLIZ;
        if (Intrinsics.LJFF(str, "loading_duration")) {
            jLIZ = (C158B.LIZ() - j) + C13LP.LJZL(map.values());
        } else {
            jLIZ = C158B.LIZ() - j;
        }
        map.put(str, Long.valueOf(jLIZ));
    }

    public static String LIZIZ(String str, String str2, boolean z, boolean z2) {
        Map map;
        if (str != null && (Intrinsics.LJFF(str, "beacon_bubble_task_page") || Intrinsics.LJFF(str, "recharge_task_page") || Intrinsics.LJFF(str, "live_income_task_page"))) {
            return "creator_task_page";
        }
        if (str2 != null) {
            return "creator_task_exchange_popup";
        }
        String str3 = null;
        if (str != null && (map = (Map) ((LinkedHashMap) C1845407Kq.LIZ).get(str)) != null) {
            str3 = (String) map.get("exchange_scenario");
        }
        if (C500260Jjc.LJJIIZ(str3)) {
            if (str3 == null) {
                return "";
            }
            return str3;
        }
        if (C1131530fYF.LJ(str)) {
            return "live_ug_task";
        }
        C1134410fct c1134410fctLJI = C1126800fQc.LIZ.KE0().LJI(4);
        if (c1134410fctLJI != null && C1134410fct.LJIIIIZZ(c1134410fctLJI) && Intrinsics.LJFF(str, "outside_live_ug_page")) {
            return "daily_ug_consume_task_popup";
        }
        if (z) {
            return "room_gift_auto";
        }
        if (z2) {
            return "room_gift_manual_send_directly";
        }
        return "room_gift_manual_non_send_directly";
    }

    public static void LIZLLL(int i, C1144350fsv c1144350fsv, boolean z, boolean z2, boolean z3) {
        C1149680g1W.LJIILL(LIZJ(i), LIZIZ(c1144350fsv.LIZLLL, null, z, z2), c1144350fsv.LIZLLL, c1144350fsv.LJ, false, false, false, z3);
    }

    public static void LJ(int i, Throwable th, int i2, C1144350fsv c1144350fsv, HashMap map, boolean z, boolean z2, boolean z3) {
        String strValueOf;
        if (i == 0) {
            LIZLLL(i2, c1144350fsv, z, z2, z3);
        }
        if (th != null) {
            C1149180g0i.Companion.getClass();
            strValueOf = String.valueOf(C1149170g0h.LIZ(th).getErrorCode());
        } else {
            strValueOf = null;
        }
        C1149680g1W.LJIIL(i, map, LIZJ(i2), LIZIZ(c1144350fsv.LIZLLL, null, z, z2), c1144350fsv.LJ, strValueOf, c1144350fsv.LIZLLL, ((long) c1144350fsv.LIZIZ) - ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().No0());
    }
}
