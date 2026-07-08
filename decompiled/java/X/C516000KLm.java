package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0KLm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C516000KLm {
    public static long LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static final C516000KLm LIZ = new C516000KLm();
    public static String LJFF = "";

    public static long LIZJ() {
        return System.currentTimeMillis() - LIZLLL;
    }

    public static int LIZIZ(Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
            return Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0;
        }
        return -1;
    }

    public static void LIZ(C0K6F c0k6f, C0KNY c0kny) {
        if (c0kny == null) {
            return;
        }
        Map<String, String> map = c0kny.LJ;
        if (map != null) {
            c0k6f.LIZLLL.putAll(map);
        }
        if (c0kny instanceof C0KFM) {
            C0KFM c0kfm = (C0KFM) c0kny;
            Object obj = c0kfm.LJIILL;
            Object obj2 = "";
            if (obj == null) {
                obj = "";
            }
            c0k6f.LIZLLL.put("usd_price_amount_micros", obj.toString());
            Integer num = c0kfm.LJIILLIIL;
            if (num != null) {
                obj2 = num;
            }
            c0k6f.LIZLLL.put("renewal_period", obj2.toString());
            c0k6f.LIZJ(Integer.valueOf(c0kfm.LJIIZILJ), "livesub_create_contract_intent");
        }
    }

    public static void LJIJJ(C516000KLm c516000KLm, C0K6F c0k6f) throws JSONException {
        C0K6G c0k6g = C0K6G.EVENT_TYPE_TEA_AND_LIVE_SDK_SLARDAR_LOG;
        c516000KLm.getClass();
        c0k6f.LIZLLL(c0k6g);
    }

    public final void LJIILIIL(long j, String str, String str2) throws JSONException {
        C0K6F c0k6fLIZ = C0K6L.LIZ("livesdk_subscription_iap_precheck_success");
        c0k6fLIZ.LIZIZ.put("is_from_pgc_subscription", "1");
        Map<String, String> map = c0k6fLIZ.LIZLLL;
        str2.toString();
        map.put("show_entrance", str2);
        Map<String, String> map2 = c0k6fLIZ.LIZLLL;
        str.toString();
        map2.put("source", str);
        c0k6fLIZ.LIZJ.put("duration", Float.valueOf(j));
        c0k6fLIZ.LIZIZ(Long.valueOf(System.currentTimeMillis()));
        LJIJJ(this, c0k6fLIZ);
    }

    public static void LJIJ(long j, Integer num, String str, String str2, boolean z) {
        C1973307oB c1973307oB = C1973307oB.LIZ;
        C1973407oC c1973407oC = new C1973407oC("livesdk_subscription_tpl_iap_fail");
        c1973407oC.LIZ("1", "is_from_pgc_subscription");
        c1973407oC.LIZ(str2, "show_entrance");
        c1973407oC.LIZ(str, "source");
        c1973407oC.LIZ(Float.valueOf(j), "duration");
        c1973407oC.LIZ(num, "error_code");
        c1973407oC.LIZ(Integer.valueOf(LIZIZ(Boolean.valueOf(z))), "type");
        c1973407oC.LIZ(Long.valueOf(System.currentTimeMillis()), "time_stamp_milli");
        c1973407oC.LIZJ();
    }

    public final void LJI(boolean z, String str, String str2, String str3, C516100KLw c516100KLw, C0KFM c0kfm) throws JSONException {
        C0K6F c0k6fLIZ = C0K6L.LIZ("livesdk_subscription_create_iap_order_start");
        c0k6fLIZ.LIZIZ.put("is_from_pgc_subscription", "1");
        c0k6fLIZ.LIZIZ.put("source", str2);
        Map<String, String> map = c0k6fLIZ.LIZLLL;
        str.toString();
        map.put("order_id", str);
        c0k6fLIZ.LIZIZ.put("type", Integer.valueOf(LIZIZ(Boolean.valueOf(z))));
        c0k6fLIZ.LIZIZ.put("show_entrance", str3);
        c0k6fLIZ.LIZIZ(Long.valueOf(System.currentTimeMillis()));
        c0k6fLIZ.LIZIZ.put("network_speed", c516100KLw.LIZ);
        c0k6fLIZ.LIZIZ.put("network_type", c516100KLw.LIZIZ);
        LIZ(c0k6fLIZ, c0kfm);
        LJIJJ(this, c0k6fLIZ);
    }

    public final void LJIIJ(boolean z, String str, String str2, String str3, C516100KLw c516100KLw, C0KNY c0kny) throws JSONException {
        String str4;
        LIZLLL = System.currentTimeMillis();
        if ((c0kny instanceof C0KFM) && ((C0KFM) c0kny).LJJIIZI >= 1) {
            str4 = "livesdk_subscription_create_order_start_prefetch";
        } else {
            str4 = "livesdk_subscription_create_order_start";
        }
        C0K6F c0k6fLIZ = C0K6L.LIZ(str4);
        c0k6fLIZ.LIZIZ.put("is_from_pgc_subscription", "1");
        c0k6fLIZ.LIZIZ.put("source", str2);
        Map<String, String> map = c0k6fLIZ.LIZLLL;
        str.toString();
        map.put("order_id", str);
        c0k6fLIZ.LIZIZ.put("type", Integer.valueOf(LIZIZ(Boolean.valueOf(z))));
        c0k6fLIZ.LIZIZ.put("show_entrance", str3);
        c0k6fLIZ.LIZIZ(Long.valueOf(System.currentTimeMillis()));
        c0k6fLIZ.LIZIZ.put("network_speed", c516100KLw.LIZ);
        c0k6fLIZ.LIZIZ.put("network_type", c516100KLw.LIZIZ);
        LIZ(c0k6fLIZ, c0kny);
        LJIJJ(this, c0k6fLIZ);
    }

    public static void LJIJI(String str, String str2, String str3, String str4, boolean z, String str5, String str6) {
        C1973307oB c1973307oB = C1973307oB.LIZ;
        C1973407oC c1973407oC = new C1973407oC("livesdk_subscription_tpl_iap_data_lost");
        c1973407oC.LIZ("1", "is_from_pgc_subscription");
        c1973407oC.LIZ(str6, "show_entrance");
        c1973407oC.LIZ(str, "source");
        c1973407oC.LIZ(str2, "iap_id");
        c1973407oC.LIZ(str5, "package_id");
        c1973407oC.LIZ(Integer.valueOf(LIZIZ(Boolean.valueOf(z))), "type");
        c1973407oC.LIZ(str3, "base_plan_id");
        c1973407oC.LIZ(str4, "offer_id");
        c1973407oC.LIZ(Long.valueOf(System.currentTimeMillis()), "time_stamp_milli");
        c1973407oC.LIZJ();
    }

    public final void LJIIL(String str, int i, long j, String str2, String str3, int i2, String str4) throws JSONException {
        C0K6F c0k6fLIZ = C0K6L.LIZ("livesdk_subscription_iap_precheck_fail");
        c0k6fLIZ.LIZIZ.put("is_from_pgc_subscription", "1");
        Map<String, String> map = c0k6fLIZ.LIZLLL;
        str3.toString();
        map.put("source", str3);
        Map<String, String> map2 = c0k6fLIZ.LIZLLL;
        str2.toString();
        map2.put("allowPath", str2);
        Map<String, String> map3 = c0k6fLIZ.LIZLLL;
        str4.toString();
        map3.put("show_entrance", str4);
        c0k6fLIZ.LIZJ.put("duration", Float.valueOf(j));
        c0k6fLIZ.LIZIZ.put("result_status", Integer.valueOf(i));
        c0k6fLIZ.LIZIZ.put("error_code", Integer.valueOf(i2));
        c0k6fLIZ.LIZIZ.put("error_message", String.valueOf(str));
        c0k6fLIZ.LIZIZ(Long.valueOf(System.currentTimeMillis()));
        LJIJJ(this, c0k6fLIZ);
    }

    public final void LJIILL(boolean z, String str, String str2, String str3, C516100KLw c516100KLw, Map map, C0KNY c0kny) throws JSONException {
        C0K6F c0k6fLIZ = C0K6L.LIZ("livesdk_subscription_query_status_start");
        c0k6fLIZ.LIZIZ.put("is_from_pgc_subscription", "1");
        c0k6fLIZ.LIZIZ.put("source", str2);
        Map<String, String> map2 = c0k6fLIZ.LIZLLL;
        str.toString();
        map2.put("order_id", str);
        c0k6fLIZ.LIZIZ.put("type", Integer.valueOf(LIZIZ(Boolean.valueOf(z))));
        c0k6fLIZ.LIZIZ.put("is_supplement", 0);
        c0k6fLIZ.LIZIZ.put("show_entrance", str3);
        c0k6fLIZ.LIZIZ(Long.valueOf(System.currentTimeMillis()));
        c0k6fLIZ.LIZIZ.put("network_speed", c516100KLw.LIZ);
        c0k6fLIZ.LIZIZ.put("network_type", c516100KLw.LIZIZ);
        c0k6fLIZ.LIZLLL.putAll(map);
        LIZ(c0k6fLIZ, c0kny);
        LJIJJ(this, c0k6fLIZ);
    }

    public final void LJIIJJI(boolean z, String str, long j, String str2, String str3, C516100KLw c516100KLw, int i, C0KNY c0kny) throws JSONException {
        String str4;
        if ((c0kny instanceof C0KFM) && ((C0KFM) c0kny).LJJIIZI >= 1) {
            str4 = "livesdk_subscription_create_order_success_prefetch";
        } else {
            str4 = "livesdk_subscription_create_order_success";
        }
        C0K6F c0k6fLIZ = C0K6L.LIZ(str4);
        c0k6fLIZ.LIZIZ.put("is_from_pgc_subscription", "1");
        c0k6fLIZ.LIZIZ.put("source", str2);
        Map<String, String> map = c0k6fLIZ.LIZLLL;
        str.toString();
        map.put("order_id", str);
        c0k6fLIZ.LIZJ.put("duration", Float.valueOf(j));
        c0k6fLIZ.LIZIZ.put("type", Integer.valueOf(LIZIZ(Boolean.valueOf(z))));
        c0k6fLIZ.LIZIZ.put("show_entrance", str3);
        c0k6fLIZ.LIZIZ(Long.valueOf(System.currentTimeMillis()));
        c0k6fLIZ.LIZIZ.put("network_speed", c516100KLw.LIZ);
        c0k6fLIZ.LIZIZ.put("network_type", c516100KLw.LIZIZ);
        c0k6fLIZ.LIZIZ.put("enter_background_times", Integer.valueOf(i));
        LIZ(c0k6fLIZ, c0kny);
        LJIJJ(this, c0k6fLIZ);
    }

    public final void LIZLLL(String str, String str2, Integer num, boolean z, long j, long j2, long j3, String str3, C0KNY c0kny) throws JSONException {
        String str4;
        C0K6F c0k6fLIZ = C0K6L.LIZ("livesdk_subscription_payment_order_result");
        if (c0kny == null || (str4 = c0kny.LIZIZ) == null) {
            str4 = "";
        }
        Map<String, String> map = c0k6fLIZ.LIZLLL;
        str4.toString();
        map.put("show_entrance", str4);
        c0k6fLIZ.LIZIZ.put("source", str);
        Map<String, String> map2 = c0k6fLIZ.LIZLLL;
        str2.toString();
        map2.put("order_id", str2);
        if (num != null) {
            c0k6fLIZ.LIZJ(Integer.valueOf(num.intValue()), "error_code");
        }
        LIZ(c0k6fLIZ, c0kny);
        c0k6fLIZ.LIZIZ.put("order_status", Integer.valueOf(!z ? 1 : 0));
        c0k6fLIZ.LIZJ.put("total_duration", Long.valueOf(j));
        c0k6fLIZ.LIZJ.put("cashier_duration", Long.valueOf(j2));
        c0k6fLIZ.LIZJ.put("tech_duration", Long.valueOf(j3));
        c0k6fLIZ.LIZIZ.put("order_result", str3);
        LJIJJ(this, c0k6fLIZ);
    }

    public final void LJIIIIZZ(boolean z, long j, int i, String str, String str2, C516100KLw c516100KLw, int i2, String str3, Throwable th, C0KNY c0kny) throws JSONException {
        String str4;
        if ((c0kny instanceof C0KFM) && ((C0KFM) c0kny).LJJIIZI >= 1) {
            str4 = "livesdk_subscription_create_order_fail_prefetch";
        } else {
            str4 = "livesdk_subscription_create_order_fail";
        }
        C0K6F c0k6fLIZ = C0K6L.LIZ(str4);
        c0k6fLIZ.LIZIZ.put("is_from_pgc_subscription", "1");
        c0k6fLIZ.LIZIZ.put("source", str);
        Map<String, String> map = c0k6fLIZ.LIZLLL;
        "".toString();
        map.put("order_id", "");
        c0k6fLIZ.LIZIZ.put("error_code", Integer.valueOf(i));
        c0k6fLIZ.LIZJ.put("duration", Float.valueOf(j));
        c0k6fLIZ.LIZIZ.put("type", Integer.valueOf(LIZIZ(Boolean.valueOf(z))));
        c0k6fLIZ.LIZIZ.put("show_entrance", str2);
        c0k6fLIZ.LIZIZ(Long.valueOf(System.currentTimeMillis()));
        c0k6fLIZ.LIZIZ.put("network_speed", c516100KLw.LIZ);
        c0k6fLIZ.LIZIZ.put("network_type", c516100KLw.LIZIZ);
        c0k6fLIZ.LIZIZ.put("enter_background_times", Integer.valueOf(i2));
        c0k6fLIZ.LIZIZ.put("error_type", str3);
        c0k6fLIZ.LIZ(th);
        LIZ(c0k6fLIZ, c0kny);
        LJIJJ(this, c0k6fLIZ);
        LIZLLL(str, "", Integer.valueOf(i), false, j, 0L, j, "create_biz_order_error", c0kny);
    }

    public final void LJIILLIIL(boolean z, String str, long j, int i, String str2, String str3, C516100KLw c516100KLw, String str4, Map map, C0KNY c0kny) throws JSONException {
        C0K6F c0k6fLIZ = C0K6L.LIZ("livesdk_subscription_query_status_success");
        c0k6fLIZ.LIZIZ.put("is_from_pgc_subscription", "1");
        c0k6fLIZ.LIZIZ.put("source", str2);
        Map<String, String> map2 = c0k6fLIZ.LIZLLL;
        str.toString();
        map2.put("order_id", str);
        c0k6fLIZ.LIZJ.put("duration", Float.valueOf(j));
        c0k6fLIZ.LIZIZ.put("type", Integer.valueOf(LIZIZ(Boolean.valueOf(z))));
        c0k6fLIZ.LIZIZ.put("retry_count", Integer.valueOf(i));
        c0k6fLIZ.LIZIZ.put("is_supplement", 0);
        c0k6fLIZ.LIZIZ.put("show_entrance", str3);
        c0k6fLIZ.LIZIZ(Long.valueOf(System.currentTimeMillis()));
        c0k6fLIZ.LIZIZ.put("network_speed", c516100KLw.LIZ);
        c0k6fLIZ.LIZIZ.put("network_type", c516100KLw.LIZIZ);
        c0k6fLIZ.LIZIZ.put("iap_status", str4);
        c0k6fLIZ.LIZLLL.putAll(map);
        LIZ(c0k6fLIZ, c0kny);
        LJIJJ(this, c0k6fLIZ);
        LIZLLL(str2, str, null, true, LIZJ(), LJ, LIZJ() - LJ, "finish_order_success", c0kny);
    }

    public final void LJII(Boolean bool, String str, long j, long j2, long j3, String str2, String str3, Map map, C516100KLw c516100KLw, int i, C0KNY c0kny) throws JSONException {
        long jLongValue;
        String str4 = (String) map.get("cashier_show_duration");
        if (str4 == null) {
            str4 = "";
        }
        Long lLJIILIIL = C2095008Iq.LJIILIIL(str4);
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        LJ = jLongValue;
        C0K6F c0k6fLIZ = C0K6L.LIZ("livesdk_subscription_create_iap_order_success");
        c0k6fLIZ.LIZIZ.put("is_from_pgc_subscription", "1");
        c0k6fLIZ.LIZLLL.putAll(map);
        c0k6fLIZ.LIZIZ.put("source", str2);
        Map<String, String> map2 = c0k6fLIZ.LIZLLL;
        str.toString();
        map2.put("order_id", str);
        c0k6fLIZ.LIZJ.put("duration", Float.valueOf(j));
        c0k6fLIZ.LIZIZ.put("type", Integer.valueOf(LIZIZ(bool)));
        c0k6fLIZ.LIZIZ.put("is_supplement", 0);
        c0k6fLIZ.LIZJ.put("delay_after_check_order_success_msg", Float.valueOf(j3));
        c0k6fLIZ.LIZIZ.put("show_entrance", str3);
        c0k6fLIZ.LIZJ(Long.valueOf(System.currentTimeMillis()), "time_stamp_milli");
        c0k6fLIZ.LIZIZ.put("network_speed", c516100KLw.LIZ);
        c0k6fLIZ.LIZIZ.put("network_type", c516100KLw.LIZIZ);
        c0k6fLIZ.LIZIZ.put("enter_background_times", Integer.valueOf(i));
        c0k6fLIZ.LIZJ.put("mp_check_duration", Long.valueOf(j2));
        LIZ(c0k6fLIZ, c0kny);
        LJIJJ(this, c0k6fLIZ);
    }

    public static void LJIILJJIL(C516000KLm c516000KLm, boolean z, String str, long j, int i, int i2, String str2, String str3, C516100KLw c516100KLw, String str4, boolean z2, C0KNY c0kny) throws JSONException {
        Map<? extends String, ? extends String> mapLJ = C2097608Jq.LJ();
        c516000KLm.getClass();
        C0K6F c0k6fLIZ = C0K6L.LIZ("livesdk_subscription_query_status_fail");
        c0k6fLIZ.LIZIZ.put("is_from_pgc_subscription", "1");
        c0k6fLIZ.LIZIZ.put("source", str2);
        Map<String, String> map = c0k6fLIZ.LIZLLL;
        str.toString();
        map.put("order_id", str);
        c0k6fLIZ.LIZIZ.put("error_code", Integer.valueOf(i2));
        c0k6fLIZ.LIZJ.put("duration", Float.valueOf(j));
        c0k6fLIZ.LIZIZ.put("type", Integer.valueOf(LIZIZ(Boolean.valueOf(z))));
        c0k6fLIZ.LIZIZ.put("retry_count", Integer.valueOf(i));
        c0k6fLIZ.LIZIZ.put("is_supplement", 0);
        c0k6fLIZ.LIZIZ.put("show_entrance", str3);
        c0k6fLIZ.LIZJ(Long.valueOf(System.currentTimeMillis()), "time_stamp_milli");
        c0k6fLIZ.LIZIZ.put("network_speed", c516100KLw.LIZ);
        c0k6fLIZ.LIZIZ.put("network_type", c516100KLw.LIZIZ);
        c0k6fLIZ.LIZIZ.put("error_type", str4);
        c0k6fLIZ.LIZLLL.putAll(mapLJ);
        LIZ(c0k6fLIZ, c0kny);
        LJIJJ(c516000KLm, c0k6fLIZ);
        if (z2) {
            c516000KLm.LIZLLL(str2, str, Integer.valueOf(i2), false, LIZJ(), LJ, LIZJ() - LJ, "query_biz_order_error", c0kny);
        }
    }

    public final void LJ(Boolean bool, String str, long j, int i, int i2, String str2, String str3, String str4, Map map, C516100KLw c516100KLw, int i3, C0KNY c0kny) throws JSONException {
        long jLongValue;
        C0K6F c0k6fLIZ = C0K6L.LIZ("livesdk_subscription_create_iap_order_fail");
        c0k6fLIZ.LIZIZ.put("is_from_pgc_subscription", "1");
        c0k6fLIZ.LIZLLL.putAll(map);
        c0k6fLIZ.LIZIZ.put("source", str3);
        Map<String, String> map2 = c0k6fLIZ.LIZLLL;
        str.toString();
        map2.put("order_id", str);
        c0k6fLIZ.LIZIZ.put("result_state", Integer.valueOf(i));
        c0k6fLIZ.LIZIZ.put("error_code", Integer.valueOf(i2));
        c0k6fLIZ.LIZIZ.put("mapped_error_code", str2);
        c0k6fLIZ.LIZJ.put("duration", Float.valueOf(j));
        c0k6fLIZ.LIZIZ.put("type", Integer.valueOf(LIZIZ(bool)));
        c0k6fLIZ.LIZIZ.put("is_supplement", 0);
        c0k6fLIZ.LIZIZ.put("show_entrance", str4);
        c0k6fLIZ.LIZIZ.put("network_speed", c516100KLw.LIZ);
        c0k6fLIZ.LIZIZ.put("network_type", c516100KLw.LIZIZ);
        c0k6fLIZ.LIZIZ.put("enter_background_times", Integer.valueOf(i3));
        if (c0kny instanceof C0KFM) {
            LIZ.getClass();
            LIZ(c0k6fLIZ, c0kny);
        }
        LJIJJ(this, c0k6fLIZ);
        String str5 = (String) map.get("cashier_show_duration");
        if (str5 == null) {
            str5 = "";
        }
        Long lLJIILIIL = C2095008Iq.LJIILIIL(str5);
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        LJ = jLongValue;
        LIZLLL(str3, str, Integer.valueOf(i2), false, LIZJ(), jLongValue, LIZJ() - jLongValue, "iap_order_error", c0kny);
    }
}
