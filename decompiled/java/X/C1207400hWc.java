package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hWc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1207400hWc {
    public static final C1207400hWc LIZ = new C1207400hWc();

    public static int LIZ() {
        Activity activityLIZIZ;
        Activity activityLIZ;
        C844470XAv.LIZ.getClass();
        if (C1194170hBH.LIZ(C844470XAv.LIZ())) {
            return 0;
        }
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ == null || (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) == null || (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) == null) {
            return -1;
        }
        if (C0VE9.LJIIJ(activityLIZ, "android.permission.ACCESS_COARSE_LOCATION")) {
            return 1;
        }
        C19741112Lp.LIZ.getClass();
        return C19741112Lp.LJI(activityLIZ, "android.permission.ACCESS_COARSE_LOCATION", false) ? 0 : 2;
    }

    public static void LJFF() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C20489080x.LIZ.getClass();
        linkedHashMap.put("show_index", String.valueOf(C20489080x.LJ()));
        C20684815ws.LJIILLIIL("overall_location_permission_result", linkedHashMap);
    }

    public static void LJI() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C20489080x.LIZ.getClass();
        linkedHashMap.put("show_index", String.valueOf(C20489080x.LJ()));
        C20684815ws.LJIILLIIL("overall_location_permission_show", linkedHashMap);
    }

    public static boolean LIZIZ(Context context) {
        if (context != null) {
            try {
                C19741112Lp.LIZ.getClass();
                return C19741112Lp.LIZLLL(context, "android.permission.ACCESS_COARSE_LOCATION");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                e.getMessage();
                return false;
            }
        }
        return false;
    }

    public static void LJIIIZ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_hot");
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJFF("cert", str);
        C20684815ws.LJIILLIIL("ttls_lbs_system_location_permission_request_send", c2344009Gk.LIZ);
    }

    public static void LJIILIIL(int i) {
        C19371010qS.LIZIZ(i, "system_location_permission_trace");
    }

    public static void LJIIJ(long j, boolean z) {
        String str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_allow", str);
        c2344009Gk.LIZLLL(j, "show_duration");
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_hot");
        C20489080x.LIZ.getClass();
        c2344009Gk.LJIIIIZZ("show_index", String.valueOf(C20489080x.LJFF() - 1));
        C20684815ws.LJIILLIIL("system_location_permission_result", c2344009Gk.LIZ);
        LJFF();
    }

    public static void LJ(String str, String str2, String str3) {
        C20489080x.LIZ.getClass();
        long j = C20489080x.LIZLLL().getLong("guided_location_permission_show_ts", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C20489080x.LIZLLL().storeInt("guided_location_permission_show_count", C20489080x.LIZLLL().getInt("guided_location_permission_show_count", 0) + 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("previous_page", str);
        }
        if (str2 != null) {
            linkedHashMap.put("enter_from", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("enter_method", str3);
        }
        linkedHashMap.put("show_index", String.valueOf(C20489080x.LIZLLL().getInt("guided_location_permission_show_count", 0) - 1));
        if (j > 0) {
            linkedHashMap.put("time_int", String.valueOf((jCurrentTimeMillis - j) / ((long) 86400000)));
        } else {
            linkedHashMap.put("time_int", "-1");
        }
        C20684815ws.LJIILLIIL("guided_location_permission_show", linkedHashMap);
        LJI();
        C20489080x.LIZLLL().storeLong("guided_location_permission_show_ts", System.currentTimeMillis());
    }

    public static void LJIILLIIL(String str, TokenCert tokenCert, EnumC1205470hTV enumC1205470hTV) {
        if (str == null) {
            str = "";
        }
        LJII(0, str, tokenCert.getToken(), "cert_error", String.valueOf(enumC1205470hTV.getValue()));
    }

    public static void LIZJ(long j, String str, String str2, boolean z) {
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("enter_from", str);
        }
        if (str2 != null) {
            linkedHashMap.put("enter_method", str2);
        }
        linkedHashMap.put("show_duration", String.valueOf(j));
        C20489080x.LIZ.getClass();
        linkedHashMap.put("show_index", String.valueOf(C20489080x.LIZLLL().getInt("guided_location_permission_show_count", 0) - 1));
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_allow", str3);
        C20684815ws.LJIILLIIL("guided_location_permission_result", linkedHashMap);
        LJFF();
    }

    public static void LJIILL(String str, String str2, String str3, Map map) {
        C20489080x.LIZ.getClass();
        long j = C20489080x.LIZLLL().getLong("system_location_setting_show_ts", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C20489080x.LIZLLL().storeInt("system_location_setting_show_count", C20489080x.LIZLLL().getInt("system_location_setting_show_count", 0) + 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("enter_from", str);
        }
        if (str2 != null) {
            linkedHashMap.put("enter_method", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("previous_page", str3);
        }
        linkedHashMap.put("show_index", String.valueOf(C20489080x.LIZLLL().getInt("system_location_setting_show_count", 0) - 1));
        if (j > 0) {
            linkedHashMap.put("time_int", String.valueOf((jCurrentTimeMillis - j) / ((long) 86400000)));
        } else {
            linkedHashMap.put("time_int", "-1");
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        C20684815ws.LJIILLIIL("system_location_setting_show", linkedHashMap);
        LJI();
        C20489080x.LIZ.getClass();
        C20489080x.LIZLLL().storeLong("system_location_setting_show_ts", System.currentTimeMillis());
    }

    public static void LJII(int i, String str, String str2, String str3, String str4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LIZJ(i, "is_success");
        if (str2 == null) {
            str2 = "";
        }
        c2344009Gk.LJIIIIZZ("cert", str2);
        if (str3 != null) {
            c2344009Gk.LJFF("fail_reason", str3);
        }
        if (str4 != null) {
            c2344009Gk.LJFF("fail_code", str4);
        }
        C20684815ws.LJIILLIIL("ttls_lbs_system_location_permission_request_result", c2344009Gk.LIZ);
    }

    public static void LJIIL(Boolean bool, String str, String str2, String str3, Map map) {
        C20489080x.LIZ.getClass();
        long j = C20489080x.LIZLLL().getLong("system_location_permission_show_ts", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C20489080x.LIZLLL().storeInt("system_location_permission_show_count", C20489080x.LJFF() + 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("enter_from", str);
        }
        if (str2 != null) {
            linkedHashMap.put("enter_method", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("previous_page", str3);
        }
        if (bool != null) {
            linkedHashMap.put("is_black_layer", String.valueOf(bool.booleanValue() ? 1 : 0));
        }
        linkedHashMap.put("show_index", String.valueOf(C20489080x.LJFF() - 1));
        if (j > 0) {
            linkedHashMap.put("time_int", String.valueOf((jCurrentTimeMillis - j) / ((long) 86400000)));
        } else {
            linkedHashMap.put("time_int", "-1");
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        C20684815ws.LJIILLIIL("system_location_permission_show", linkedHashMap);
        LJI();
        C20489080x.LIZ.getClass();
        C20489080x.LIZLLL().storeLong("system_location_permission_show_ts", System.currentTimeMillis());
        C20489080x.LJIIJ(System.currentTimeMillis(), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
    }

    public static void LJIILJJIL(int i, long j, String str, String str2, String str3, Function1 function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("enter_from", str);
        }
        if (str2 != null) {
            linkedHashMap.put("enter_method", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("previous_page", str3);
        }
        linkedHashMap.put("is_allow", String.valueOf(i));
        linkedHashMap.put("show_duration", String.valueOf(j));
        C20489080x.LIZ.getClass();
        linkedHashMap.put("show_index", String.valueOf(C20489080x.LIZLLL().getInt("system_location_setting_show_count", 0) - 1));
        function1.invoke(linkedHashMap);
        C20684815ws.LJIILLIIL("system_location_setting_result", linkedHashMap);
        LJFF();
    }

    public static void LJIIJJI(String str, String str2, String str3, int i, long j, boolean z, Function1 function1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("previous_page", str);
        }
        if (str2 != null) {
            linkedHashMap.put("enter_from", str2);
        }
        linkedHashMap.put("enter_method", str3);
        linkedHashMap.put("is_allow", String.valueOf(i));
        linkedHashMap.put("show_duration", String.valueOf(j));
        C20489080x.LIZ.getClass();
        linkedHashMap.put("show_index", String.valueOf(C20489080x.LJFF() - 1));
        LIZ.getClass();
        linkedHashMap.put("is_black_layer", String.valueOf(z ? 1 : 0));
        function1.invoke(linkedHashMap);
        C20684815ws.LJIILLIIL("system_location_permission_result", linkedHashMap);
        LJFF();
    }
}
