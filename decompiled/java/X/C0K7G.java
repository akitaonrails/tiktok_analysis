package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0K7G, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K7G {
    public static final C0CQ2 LIZ = new C0CQ2();

    public static boolean LIZ() {
        return LJI("live_sub_only_space_preview", 0) == 2;
    }

    public static boolean LIZIZ() {
        return LJI("live_sub_only_space_preview", 0) == 1;
    }

    public static boolean LIZJ() {
        return LJI("live_sub_payment_time_cost_optimization", 0) == 1;
    }

    public static boolean LIZLLL() {
        return LJI("live_sub_only_space_preview", 0) > 0;
    }

    public static boolean LJ() {
        return LJFF("privilege_page_ux_optimization_is_enabled", false);
    }

    public static int LJIIIIZZ() {
        return LJI("subscribe_agreement_checkbox_type", 2);
    }

    public static boolean LJIIIZ() {
        return LJFF("subscription_europe_region", false);
    }

    public static String LJIIJJI() {
        JSONObject jSONObject;
        String strLJII = LJII("sub_purchase_feedback_questionaire");
        try {
            jSONObject = strLJII.length() == 0 ? new JSONObject() : new JSONObject(strLJII);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            jSONObject = new JSONObject();
        }
        return jSONObject.optString("questionHalfScreen", "");
    }

    public static String LJIIL() {
        JSONObject jSONObject;
        String strLJII = LJII("live_subscription_anchor_url");
        try {
            jSONObject = strLJII.length() == 0 ? new JSONObject() : new JSONObject(strLJII);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            jSONObject = new JSONObject();
        }
        return jSONObject.optString("pin_management_page", "");
    }

    public static long[] LJIILIIL() {
        String[] strArr = (String[]) C0CQ2.LIZ("live_subscription_check_order_retry_interval", new String[]{"2000", "2000", "2000"});
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (String str : strArr) {
            Long lLJIILIIL = C2095008Iq.LJIILIIL(str);
            if (lLJIILIIL != null) {
                arrayList.add(lLJIILIIL);
            }
        }
        long[] jArrLLIIIILZ = C13LP.LLIIIILZ(arrayList);
        if (jArrLLIIIILZ.length == 0) {
            jArrLLIIIILZ = new long[3];
            do {
                jArrLLIIIILZ[i] = 2000;
                i++;
            } while (i < 3);
        }
        return jArrLLIIIILZ;
    }

    public static JSONObject LJIILJJIL() {
        String strLJII = LJII("live_subscription_lynx_url");
        try {
            return strLJII.length() == 0 ? new JSONObject() : new JSONObject(strLJII);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new JSONObject();
        }
    }

    public static JSONObject LJIILL() {
        String strLJII = LJII("live_subscription_faq_url");
        try {
            return strLJII.length() == 0 ? new JSONObject() : new JSONObject(strLJII);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new JSONObject();
        }
    }

    public static String LJII(String str) {
        return (String) C0CQ2.LIZ(str, "");
    }

    public static String LJIIJ(String str) {
        JSONObject jSONObject;
        boolean z;
        String strLJII = LJII("live_subscription_user_pay_terms");
        try {
            if (strLJII.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(strLJII);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            jSONObject = new JSONObject();
        }
        return jSONObject.optString(str, "");
    }

    public static boolean LJFF(String str, boolean z) {
        return ((Boolean) C0CQ2.LIZ(str, Boolean.valueOf(z))).booleanValue();
    }

    public static int LJI(String str, int i) {
        return ((Number) C0CQ2.LIZ(str, Integer.valueOf(i))).intValue();
    }
}
