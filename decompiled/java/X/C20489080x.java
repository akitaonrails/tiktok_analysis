package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.080x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20489080x {
    public static final C20489080x LIZ = new C20489080x();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(720));

    static {
        if (LIZLLL().getBoolean("key_compatible_fyp_popup", false)) {
            return;
        }
        for (Map.Entry entry : ((LinkedHashMap) LJII("fyp_poi_permission_popup_showed")).entrySet()) {
            LIZ.getClass();
            Keva kevaLIZLLL = LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fyp_poi_permission_popup_showed_");
            sbLIZ.append((String) entry.getKey());
            kevaLIZLLL.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), ((Boolean) entry.getValue()).booleanValue());
        }
        for (Map.Entry entry2 : ((LinkedHashMap) LJII("fyp_poi_permission_popup_time")).entrySet()) {
            try {
                LIZ.getClass();
                Keva kevaLIZLLL2 = LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("fyp_poi_permission_popup_time_");
                sbLIZ2.append((String) entry2.getKey());
                kevaLIZLLL2.storeLong(C2188811AlT.LIZIZ(sbLIZ2), CastLongProtector.parseLong((String) entry2.getValue()));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        LIZLLL().storeBoolean("key_compatible_fyp_popup", true);
    }

    public static long LIZ() {
        long j = -1;
        try {
            Keva kevaLIZLLL = LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("app_first_hit_gps_exp_launch_time_");
            sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            j = kevaLIZLLL.getLong(C2188811AlT.LIZIZ(sbLIZ), -1L);
            return j;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return j;
        }
    }

    public static Keva LIZLLL() {
        return (Keva) LIZIZ.getValue();
    }

    public static long LIZIZ() {
        Keva kevaLIZLLL = LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("app_first_launch_time_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return kevaLIZLLL.getLong(C2188811AlT.LIZIZ(sbLIZ), -1L);
    }

    public static long LIZJ() {
        Keva kevaLIZLLL = LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fyp_gps_popup_timing_strategy_first_hit_time_");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return kevaLIZLLL.getLong(C2188811AlT.LIZIZ(sbLIZ), -1L);
    }

    public static int LJ() {
        return (((LIZLLL().getInt("pre_location_permission_show_count", 0) + LJFF()) + LIZLLL().getInt("system_location_setting_show_count", 0)) + LIZLLL().getInt("guided_location_permission_show_count", 0)) - 1;
    }

    public static int LJFF() {
        return LIZLLL().getInt("system_location_permission_show_count", 0);
    }

    public static void LJIIIIZZ() {
        try {
            if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() || LIZ() > 0) {
                return;
            }
            Keva kevaLIZLLL = LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("app_first_hit_gps_exp_launch_time_");
            sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            kevaLIZLLL.storeLong(C2188811AlT.LIZIZ(sbLIZ), System.currentTimeMillis());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static boolean LJI(String str) {
        if (C1790906zr.LIZ()) {
            Keva kevaLIZLLL = LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fyp_poi_permission_popup_showed_");
            sbLIZ.append(str);
            return kevaLIZLLL.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
        }
        return Intrinsics.LJFF(((LinkedHashMap) LJII("fyp_poi_permission_popup_showed")).get(str), Boolean.TRUE);
    }

    public static Map LJII(String str) {
        String string = LIZLLL().getString(str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    linkedHashMap.put(next, jSONObject.opt(next));
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return linkedHashMap;
        }
    }

    public static void LJIIIZ(String str) {
        if (C1790906zr.LIZ()) {
            Keva kevaLIZLLL = LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fyp_poi_permission_popup_showed_");
            sbLIZ.append(str);
            kevaLIZLLL.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
            LJIIJ(System.currentTimeMillis(), str);
            return;
        }
        Map mapLJII = LJII("fyp_poi_permission_popup_showed");
        mapLJII.put(str, Boolean.TRUE);
        LIZLLL().storeString("fyp_poi_permission_popup_showed", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), mapLJII));
        LJIIJ(System.currentTimeMillis(), str);
    }

    public static void LJIIJ(long j, String str) {
        if (C1790906zr.LIZ()) {
            Keva kevaLIZLLL = LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fyp_poi_permission_popup_time_");
            sbLIZ.append(str);
            kevaLIZLLL.storeLong(C2188811AlT.LIZIZ(sbLIZ), j);
            return;
        }
        Map mapLJII = LJII("fyp_poi_permission_popup_time");
        mapLJII.put(str, String.valueOf(j));
        LIZLLL().storeString("fyp_poi_permission_popup_time", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), mapLJII));
    }
}
