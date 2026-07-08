package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KLn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C516010KLn {
    public static long LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static final C516010KLn LIZ = new C516010KLn();
    public static String LJI = "";
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(305));

    public static long LIZIZ() {
        long j = LIZIZ;
        if (j <= 0) {
            return 0L;
        }
        long j2 = LIZJ;
        if (j2 > 0) {
            return j2 - j;
        }
        return 0L;
    }

    public static String LIZJ() {
        return (String) LJII.getValue();
    }

    public static long LJ() {
        return System.currentTimeMillis() - LJ;
    }

    public static int LIZLLL(Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
            return Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0;
        }
        return -1;
    }

    public static void LIZ(C512280K7e c512280K7e, C0KNX c0knx) {
        if (c0knx == null) {
            return;
        }
        Map<String, String> map = c0knx.LJ;
        if (map != null) {
            c512280K7e.LIZLLL.putAll(map);
        }
        if (c0knx instanceof C0KJK) {
            C0KJK c0kjk = (C0KJK) c0knx;
            Object obj = c0kjk.LJIILIIL;
            Object obj2 = "";
            if (obj == null) {
                obj = "";
            }
            c512280K7e.LIZLLL.put("usd_price_amount_micros", obj.toString());
            Integer num = c0kjk.LJIILJJIL;
            if (num != null) {
                obj2 = num;
            }
            c512280K7e.LIZLLL.put("renewal_period", obj2.toString());
            c512280K7e.LIZJ(Integer.valueOf(c0kjk.LJIILL), "livesub_create_contract_intent");
        }
    }

    public static void LJIIIZ(boolean z, String str, String str2, String str3, C0KM7 c0km7, C0KNX c0knx) {
        C512280K7e c512280K7eLIZ = C512290K7f.LIZ("livesdk_subscription_create_iap_order_start");
        c512280K7eLIZ.LIZIZ.put("source", str2);
        Map<String, String> map = c512280K7eLIZ.LIZLLL;
        str.toString();
        map.put("order_id", str);
        c512280K7eLIZ.LIZIZ.put("type", Integer.valueOf(LIZLLL(Boolean.valueOf(z))));
        c512280K7eLIZ.LIZIZ.put("show_entrance", str3);
        c512280K7eLIZ.LIZIZ(Long.valueOf(System.currentTimeMillis()), "time_stamp_milli");
        c512280K7eLIZ.LIZIZ.put("network_speed", c0km7.LIZ);
        c512280K7eLIZ.LIZIZ.put("network_type", c0km7.LIZIZ);
        c512280K7eLIZ.LIZIZ(LIZJ(), "iap_country_code");
        LIZ(c512280K7eLIZ, c0knx);
        c512280K7eLIZ.LJ(C0K6J.EVENT_TYPE_TEA_AND_LIVE_SDK_SLARDAR_LOG);
    }

    public static void LJIILIIL(boolean z, String str, String str2, String str3, C0KM7 c0km7, C0KNX c0knx) {
        String str4;
        LJ = System.currentTimeMillis();
        if ((c0knx instanceof C0KJK) && ((C0KJK) c0knx).LJJIIJ >= 1) {
            str4 = "livesdk_subscription_create_order_start_prefetch";
        } else {
            str4 = "livesdk_subscription_create_order_start";
        }
        C512280K7e c512280K7eLIZ = C512290K7f.LIZ(str4);
        c512280K7eLIZ.LIZIZ.put("source", str2);
        Map<String, String> map = c512280K7eLIZ.LIZLLL;
        str.toString();
        map.put("order_id", str);
        c512280K7eLIZ.LIZIZ.put("type", Integer.valueOf(LIZLLL(Boolean.valueOf(z))));
        c512280K7eLIZ.LIZIZ.put("show_entrance", str3);
        c512280K7eLIZ.LIZIZ(Long.valueOf(System.currentTimeMillis()), "time_stamp_milli");
        c512280K7eLIZ.LIZIZ.put("network_speed", c0km7.LIZ);
        c512280K7eLIZ.LIZIZ.put("network_type", c0km7.LIZIZ);
        c512280K7eLIZ.LIZIZ(LIZJ(), "iap_country_code");
        LIZ(c512280K7eLIZ, c0knx);
        c512280K7eLIZ.LJ(C0K6J.EVENT_TYPE_TEA_AND_LIVE_SDK_SLARDAR_LOG);
    }

    public static void LJJ(String str, String str2, String str3, String str4, String str5, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_tpl_iap_data_lost");
        c474500IjALIZ.LJJII(str, "source");
        c474500IjALIZ.LJJII(str2, "iap_id");
        c474500IjALIZ.LJJII(str5, "package_id");
        c474500IjALIZ.LJJII(Integer.valueOf(LIZLLL(Boolean.valueOf(z))), "type");
        c474500IjALIZ.LJJII(str3, "base_plan_id");
        c474500IjALIZ.LJJII(str4, "offer_id");
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis()), "time_stamp_milli");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIZILJ(boolean z, String str, String str2, String str3, C0KM7 c0km7, Map map, C0KNX c0knx) {
        C512280K7e c512280K7eLIZ = C512290K7f.LIZ("livesdk_subscription_query_status_start");
        c512280K7eLIZ.LIZIZ.put("source", str2);
        Map<String, String> map2 = c512280K7eLIZ.LIZLLL;
        str.toString();
        map2.put("order_id", str);
        c512280K7eLIZ.LIZIZ.put("type", Integer.valueOf(LIZLLL(Boolean.valueOf(z))));
        c512280K7eLIZ.LIZIZ.put("is_supplement", 0);
        c512280K7eLIZ.LIZIZ.put("show_entrance", str3);
        c512280K7eLIZ.LIZIZ(Long.valueOf(System.currentTimeMillis()), "time_stamp_milli");
        c512280K7eLIZ.LIZIZ.put("network_speed", c0km7.LIZ);
        c512280K7eLIZ.LIZIZ.put("network_type", c0km7.LIZIZ);
        c512280K7eLIZ.LIZIZ(LIZJ(), "iap_country_code");
        c512280K7eLIZ.LIZLLL.putAll(map);
        LIZ(c512280K7eLIZ, c0knx);
        c512280K7eLIZ.LJ(C0K6J.EVENT_TYPE_TEA_AND_LIVE_SDK_SLARDAR_LOG);
    }

    public static void LJIJJ(long j, Integer num, Integer num2, String str, boolean z, String str2, boolean z2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_tpl_iap_fail");
        c474500IjALIZ.LJJII(str2, "source");
        c474500IjALIZ.LJJIFFI(Float.valueOf(j), "duration");
        c474500IjALIZ.LJJII(num, "error_code");
        c474500IjALIZ.LJJII(num2, "detail_error_code");
        c474500IjALIZ.LJJII(str, "error_message");
        c474500IjALIZ.LJJII(Integer.valueOf(LIZLLL(Boolean.valueOf(z))), "type");
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis()), "time_stamp_milli");
        c474500IjALIZ.LJJII(LIZJ(), "iap_country_code");
        c474500IjALIZ.LJJII(Integer.valueOf(z2 ? 1 : 0), "permission");
        c474500IjALIZ.LIZ();
    }

    public static void LJIJJLI(int i, long j, String str, String str2, String str3, boolean z, boolean z2) {
        String upperCase;
        if (str.length() == 0) {
            upperCase = LJI.toUpperCase(Locale.ROOT);
        } else {
            upperCase = str.toUpperCase(Locale.ROOT);
        }
        String upperCase2 = str2.toUpperCase(Locale.ROOT);
        boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(!Intrinsics.LJFF(upperCase2, upperCase)));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_tpl_iap_success");
        c474500IjALIZ.LJJII(str3, "source");
        c474500IjALIZ.LJJII(upperCase, "server_currency");
        c474500IjALIZ.LJJII(upperCase2, "gp_currency");
        c474500IjALIZ.LJJII(Integer.valueOf(zLJJJI ? 1 : 0), "is_different_currency");
        c474500IjALIZ.LJJIFFI(Float.valueOf(j), "duration");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "tpl_count");
        c474500IjALIZ.LJJII(Integer.valueOf(LIZLLL(Boolean.valueOf(z))), "type");
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis()), "time_stamp_milli");
        c474500IjALIZ.LJJII(LIZJ(), "iap_country_code");
        c474500IjALIZ.LJJII(Integer.valueOf(z2 ? 1 : 0), "permission");
        c474500IjALIZ.LIZ();
    }

    public static void LJIILJJIL(boolean z, String str, long j, String str2, String str3, C0KM7 c0km7, int i, C0KNX c0knx) {
        String str4;
        if ((c0knx instanceof C0KJK) && ((C0KJK) c0knx).LJJIIJ >= 1) {
            str4 = "livesdk_subscription_create_order_success_prefetch";
        } else {
            str4 = "livesdk_subscription_create_order_success";
        }
        C512280K7e c512280K7eLIZ = C512290K7f.LIZ(str4);
        c512280K7eLIZ.LIZIZ.put("source", str2);
        Map<String, String> map = c512280K7eLIZ.LIZLLL;
        str.toString();
        map.put("order_id", str);
        c512280K7eLIZ.LIZJ.put("duration", Float.valueOf(j));
        c512280K7eLIZ.LIZIZ.put("type", Integer.valueOf(LIZLLL(Boolean.valueOf(z))));
        c512280K7eLIZ.LIZIZ.put("show_entrance", str3);
        c512280K7eLIZ.LIZIZ(Long.valueOf(System.currentTimeMillis()), "time_stamp_milli");
        c512280K7eLIZ.LIZIZ.put("network_speed", c0km7.LIZ);
        c512280K7eLIZ.LIZIZ.put("network_type", c0km7.LIZIZ);
        c512280K7eLIZ.LIZIZ.put("enter_background_times", Integer.valueOf(i));
        c512280K7eLIZ.LIZIZ(LIZJ(), "iap_country_code");
        LIZ(c512280K7eLIZ, c0knx);
        c512280K7eLIZ.LJ(C0K6J.EVENT_TYPE_TEA_AND_LIVE_SDK_SLARDAR_LOG);
    }

    public static void LJFF(String str, String str2, Integer num, Integer num2, boolean z, long j, long j2, long j3, String str3, C0KNX c0knx) {
        C512280K7e c512280K7eLIZ = C512290K7f.LIZ("livesdk_subscription_payment_order_result");
        c512280K7eLIZ.LIZIZ.put("source", str);
        Map<String, String> map = c512280K7eLIZ.LIZLLL;
        str2.toString();
        map.put("order_id", str2);
        if (num != null) {
            c512280K7eLIZ.LIZJ(Integer.valueOf(num.intValue()), "error_code");
        }
        if (num2 != null) {
            c512280K7eLIZ.LIZJ(Integer.valueOf(num2.intValue()), "detail_error_code");
        }
        LIZ(c512280K7eLIZ, c0knx);
        c512280K7eLIZ.LIZIZ.put("order_status", Integer.valueOf(1 ^ (z ? 1 : 0)));
        c512280K7eLIZ.LIZJ.put("total_duration", Long.valueOf(j));
        c512280K7eLIZ.LIZJ.put("cashier_duration", Long.valueOf(j2));
        c512280K7eLIZ.LIZJ.put("tech_duration", Long.valueOf(j3));
        c512280K7eLIZ.LIZIZ.put("order_result", str3);
        c512280K7eLIZ.LJ(C0K6J.EVENT_TYPE_TEA_AND_LIVE_SDK_SLARDAR_LOG);
    }

    public final void LJIIJJI(boolean z, long j, int i, String str, String str2, C0KM7 c0km7, int i2, String str3, Throwable th, C0KNX c0knx) {
        String str4;
        if ((c0knx instanceof C0KJK) && ((C0KJK) c0knx).LJJIIJ >= 1) {
            str4 = "livesdk_subscription_create_order_fail_prefetch";
        } else {
            str4 = "livesdk_subscription_create_order_fail";
        }
        C512280K7e c512280K7eLIZ = C512290K7f.LIZ(str4);
        c512280K7eLIZ.LIZIZ.put("source", str);
        Map<String, String> map = c512280K7eLIZ.LIZLLL;
        "".toString();
        map.put("order_id", "");
        c512280K7eLIZ.LIZIZ.put("error_code", Integer.valueOf(i));
        c512280K7eLIZ.LIZJ.put("duration", Float.valueOf(j));
        c512280K7eLIZ.LIZIZ.put("type", Integer.valueOf(LIZLLL(Boolean.valueOf(z))));
        c512280K7eLIZ.LIZIZ.put("show_entrance", str2);
        c512280K7eLIZ.LIZIZ(Long.valueOf(System.currentTimeMillis()), "time_stamp_milli");
        c512280K7eLIZ.LIZIZ.put("network_speed", c0km7.LIZ);
        c512280K7eLIZ.LIZIZ.put("network_type", c0km7.LIZIZ);
        c512280K7eLIZ.LIZIZ.put("enter_background_times", Integer.valueOf(i2));
        c512280K7eLIZ.LIZIZ.put("error_type", str3);
        c512280K7eLIZ.LIZ(th);
        if (th instanceof C501470JlZ) {
            C501470JlZ c501470JlZ = (C501470JlZ) th;
            String alert = c501470JlZ.getAlert();
            String str5 = "";
            if (alert == null) {
                alert = "";
            }
            c512280K7eLIZ.LIZIZ(alert, "error_alert");
            String prompt = c501470JlZ.getPrompt();
            if (prompt != null) {
                str5 = prompt;
            }
            c512280K7eLIZ.LIZIZ(str5, "error_prompt");
        }
        c512280K7eLIZ.LIZIZ(LIZJ(), "iap_country_code");
        LIZ(c512280K7eLIZ, c0knx);
        c512280K7eLIZ.LJ(C0K6J.EVENT_TYPE_TEA_AND_LIVE_SDK_SLARDAR_LOG);
        Integer numValueOf = Integer.valueOf(i);
        getClass();
        LJFF(str, "", numValueOf, null, false, j, 0L, j, "create_biz_order_error", c0knx);
    }

    public final void LJIJ(boolean z, String str, long j, int i, String str2, String str3, C0KM7 c0km7, String str4, Map map, C0KNX c0knx) {
        C512280K7e c512280K7eLIZ = C512290K7f.LIZ("livesdk_subscription_query_status_success");
        c512280K7eLIZ.LIZIZ.put("source", str2);
        Map<String, String> map2 = c512280K7eLIZ.LIZLLL;
        str.toString();
        map2.put("order_id", str);
        c512280K7eLIZ.LIZJ.put("duration", Float.valueOf(j));
        c512280K7eLIZ.LIZIZ.put("type", Integer.valueOf(LIZLLL(Boolean.valueOf(z))));
        c512280K7eLIZ.LIZIZ.put("retry_count", Integer.valueOf(i));
        c512280K7eLIZ.LIZIZ.put("is_supplement", 0);
        c512280K7eLIZ.LIZIZ.put("show_entrance", str3);
        c512280K7eLIZ.LIZIZ(Long.valueOf(System.currentTimeMillis()), "time_stamp_milli");
        c512280K7eLIZ.LIZIZ.put("network_speed", c0km7.LIZ);
        c512280K7eLIZ.LIZIZ.put("network_type", c0km7.LIZIZ);
        c512280K7eLIZ.LIZIZ.put("iap_status", str4);
        c512280K7eLIZ.LIZIZ(LIZJ(), "iap_country_code");
        c512280K7eLIZ.LIZLLL.putAll(map);
        LIZ(c512280K7eLIZ, c0knx);
        c512280K7eLIZ.LJ(C0K6J.EVENT_TYPE_TEA_AND_LIVE_SDK_SLARDAR_LOG);
        long jLJ = LJ();
        long j2 = LJFF;
        long jLJ2 = LJ() - LJFF;
        getClass();
        LJFF(str2, str, null, null, true, jLJ, j2, jLJ2, "finish_order_success", c0knx);
    }

    public static void LJIIJ(Boolean bool, String str, long j, long j2, long j3, String str2, String str3, Map map, C0KM7 c0km7, int i, C0KNX c0knx) {
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
        LJFF = jLongValue;
        C512280K7e c512280K7eLIZ = C512290K7f.LIZ("livesdk_subscription_create_iap_order_success");
        c512280K7eLIZ.LIZLLL.putAll(map);
        c512280K7eLIZ.LIZIZ.put("source", str2);
        Map<String, String> map2 = c512280K7eLIZ.LIZLLL;
        str.toString();
        map2.put("order_id", str);
        c512280K7eLIZ.LIZJ.put("duration", Float.valueOf(j));
        c512280K7eLIZ.LIZIZ.put("type", Integer.valueOf(LIZLLL(bool)));
        c512280K7eLIZ.LIZIZ.put("is_supplement", 0);
        c512280K7eLIZ.LIZJ.put("delay_after_check_order_success_msg", Float.valueOf(j3));
        c512280K7eLIZ.LIZIZ.put("show_entrance", str3);
        c512280K7eLIZ.LIZJ(Long.valueOf(System.currentTimeMillis()), "time_stamp_milli");
        c512280K7eLIZ.LIZIZ.put("network_speed", c0km7.LIZ);
        c512280K7eLIZ.LIZIZ.put("network_type", c0km7.LIZIZ);
        c512280K7eLIZ.LIZIZ.put("enter_background_times", Integer.valueOf(i));
        c512280K7eLIZ.LIZJ.put("mp_check_duration", Long.valueOf(j2));
        c512280K7eLIZ.LIZIZ(LIZJ(), "iap_country_code");
        LIZ(c512280K7eLIZ, c0knx);
        c512280K7eLIZ.LJ(C0K6J.EVENT_TYPE_TEA_AND_LIVE_SDK_SLARDAR_LOG);
    }

    public static void LJII(Boolean bool, String str, long j, int i, int i2, String str2, String str3, String str4, String str5, Map map, C0KM7 c0km7, int i3, C0KNX c0knx) {
        long jLongValue;
        String str6 = str2;
        C512280K7e c512280K7eLIZ = C512290K7f.LIZ("livesdk_subscription_create_iap_order_fail");
        c512280K7eLIZ.LIZLLL.putAll(map);
        c512280K7eLIZ.LIZIZ.put("source", str4);
        Map<String, String> map2 = c512280K7eLIZ.LIZLLL;
        str.toString();
        map2.put("order_id", str);
        c512280K7eLIZ.LIZIZ.put("error_code", Integer.valueOf(i));
        String str7 = "";
        if (str6 == null) {
            str6 = "";
        }
        c512280K7eLIZ.LIZIZ.put("mapped_error_code", str6);
        c512280K7eLIZ.LIZIZ.put("error_message", str3);
        c512280K7eLIZ.LIZJ.put("duration", Float.valueOf(j));
        c512280K7eLIZ.LIZIZ.put("type", Integer.valueOf(LIZLLL(bool)));
        c512280K7eLIZ.LIZIZ.put("detail_error_code", Integer.valueOf(i2));
        c512280K7eLIZ.LIZIZ.put("is_supplement", 0);
        c512280K7eLIZ.LIZIZ.put("show_entrance", str5);
        c512280K7eLIZ.LIZIZ.put("network_speed", c0km7.LIZ);
        c512280K7eLIZ.LIZIZ.put("network_type", c0km7.LIZIZ);
        c512280K7eLIZ.LIZIZ.put("enter_background_times", Integer.valueOf(i3));
        c512280K7eLIZ.LIZIZ(LIZJ(), "iap_country_code");
        if (c0knx instanceof C0KJK) {
            LIZ.getClass();
            LIZ(c512280K7eLIZ, c0knx);
        }
        c512280K7eLIZ.LJ(C0K6J.EVENT_TYPE_TEA_AND_LIVE_SDK_SLARDAR_LOG);
        String str8 = (String) map.get("cashier_show_duration");
        if (str8 != null) {
            str7 = str8;
        }
        Long lLJIILIIL = C2095008Iq.LJIILIIL(str7);
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        LJFF = jLongValue;
        LJFF(str4, str, Integer.valueOf(i), Integer.valueOf(i2), false, LJ(), jLongValue, LJ() - jLongValue, "iap_order_error", c0knx);
    }

    public static void LJIILLIIL(C516010KLn c516010KLn, boolean z, String str, long j, int i, int i2, String str2, String str3, C0KM7 c0km7, String str4, boolean z2, C0KNX c0knx, Throwable th, String str5, int i3) {
        Map<? extends String, ? extends String> mapLJ;
        String str6 = str4;
        C0KM7 c0km72 = c0km7;
        if ((i3 & 256) != 0) {
            c0km72 = new C0KM7();
        }
        String str7 = "";
        if ((i3 & 512) != 0) {
            str6 = "";
        }
        Throwable th2 = null;
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            mapLJ = C2097608Jq.LJ();
        } else {
            mapLJ = null;
        }
        if ((i3 & 8192) == 0) {
            th2 = th;
        }
        c516010KLn.getClass();
        C512280K7e c512280K7eLIZ = C512290K7f.LIZ("livesdk_subscription_query_status_fail");
        c512280K7eLIZ.LIZIZ.put("source", str2);
        Map<String, String> map = c512280K7eLIZ.LIZLLL;
        str.toString();
        map.put("order_id", str);
        c512280K7eLIZ.LIZIZ.put("error_code", Integer.valueOf(i2));
        c512280K7eLIZ.LIZJ.put("duration", Float.valueOf(j));
        c512280K7eLIZ.LIZIZ.put("type", Integer.valueOf(LIZLLL(Boolean.valueOf(z))));
        c512280K7eLIZ.LIZIZ.put("retry_count", Integer.valueOf(i));
        c512280K7eLIZ.LIZIZ.put("is_supplement", 0);
        c512280K7eLIZ.LIZIZ.put("show_entrance", str3);
        c512280K7eLIZ.LIZJ(Long.valueOf(System.currentTimeMillis()), "time_stamp_milli");
        c512280K7eLIZ.LIZIZ.put("network_speed", c0km72.LIZ);
        c512280K7eLIZ.LIZIZ.put("network_type", c0km72.LIZIZ);
        c512280K7eLIZ.LIZIZ.put("error_type", str6);
        c512280K7eLIZ.LIZIZ(LIZJ(), "iap_country_code");
        c512280K7eLIZ.LIZ(th2);
        if (C1533950q1J.LJ(str5)) {
            if (str5 != null) {
                str7 = str5;
            }
            c512280K7eLIZ.LIZIZ(str7, "log_id");
        }
        c512280K7eLIZ.LIZLLL.putAll(mapLJ);
        LIZ(c512280K7eLIZ, c0knx);
        c512280K7eLIZ.LJ(C0K6J.EVENT_TYPE_TEA_AND_LIVE_SDK_SLARDAR_LOG);
        if (z2) {
            Integer numValueOf = Integer.valueOf(i2);
            long jLJ = LJ();
            long j2 = LJFF;
            long jLJ2 = LJ() - LJFF;
            c516010KLn.getClass();
            LJFF(str2, str, numValueOf, null, false, jLJ, j2, jLJ2, "query_biz_order_error", c0knx);
        }
    }
}
