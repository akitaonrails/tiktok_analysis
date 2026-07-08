package X;

import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0eg9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1097990eg9 {
    public static final C1097990eg9 LIZ = new C1097990eg9();
    public static C1098010egB LIZIZ;

    public static long LIZ(long j, long j2) {
        if (j == -1 || j2 < j) {
            return -1L;
        }
        return j2 - j;
    }

    public static C1098010egB LIZIZ() {
        C1098010egB c1098010egB = LIZIZ;
        if (c1098010egB != null) {
            return c1098010egB;
        }
        C1098010egB c1098010egB2 = new C1098010egB();
        LIZIZ = c1098010egB2;
        return c1098010egB2;
    }

    public final void LJFF() {
        C1098010egB c1098010egBLIZIZ = LIZIZ();
        long jLIZ = LIZ(c1098010egBLIZIZ.LJIIIZ, c1098010egBLIZIZ.LJIIJ);
        long jLIZ2 = LIZ(c1098010egBLIZIZ.LJFF, c1098010egBLIZIZ.LJIIJ);
        long jLIZ3 = LIZ(c1098010egBLIZIZ.LJII, c1098010egBLIZIZ.LJIIJ);
        HashMap map = new HashMap(c1098010egBLIZIZ.LIZIZ());
        map.put("duration", Long.valueOf(jLIZ));
        map.put("duration_from_network", Long.valueOf(jLIZ2));
        map.put("duration_from_create", Long.valueOf(jLIZ3));
        LIZJ(this, "container_load", 0, map);
    }

    public final void LJI() {
        C1098010egB c1098010egBLIZIZ = LIZIZ();
        long jLIZ = LIZ(c1098010egBLIZIZ.LJIIJ, c1098010egBLIZIZ.LJIIJJI);
        long j = c1098010egBLIZIZ.LJFF;
        if (j <= 0) {
            j = c1098010egBLIZIZ.LJII;
        }
        long jLIZ2 = LIZ(j, c1098010egBLIZIZ.LJIIJJI);
        HashMap map = new HashMap(c1098010egBLIZIZ.LIZIZ());
        long jLIZ3 = LIZ(c1098010egBLIZIZ.LJII, c1098010egBLIZIZ.LJIIJ);
        map.put("duration", Long.valueOf(jLIZ));
        map.put("duration_from_network", Long.valueOf(jLIZ2));
        map.put("duration_from_create", Long.valueOf(jLIZ3));
        LIZJ(this, "container_show", 0, map);
    }

    public final void LIZLLL(Map<String, String> map) {
        C1098010egB c1098010egBLIZIZ = LIZIZ();
        long jLIZ = LIZ(c1098010egBLIZIZ.LJII, c1098010egBLIZIZ.LJIIIIZZ);
        HashMap map2 = new HashMap(c1098010egBLIZIZ.LIZIZ());
        map2.put("duration", Long.valueOf(jLIZ));
        for (Map.Entry<String, String> entry : map.entrySet()) {
            map2.put(entry.getKey(), entry.getValue());
        }
        LIZJ(this, "container_create", 0, map2);
    }

    public final void LJ(String str) {
        C1098010egB c1098010egBLIZIZ = LIZIZ();
        long jLIZ = LIZ(c1098010egBLIZIZ.LJIIIZ, c1098010egBLIZIZ.LJIIJ);
        long jLIZ2 = LIZ(c1098010egBLIZIZ.LJFF, c1098010egBLIZIZ.LJIIJ);
        long jLIZ3 = LIZ(c1098010egBLIZIZ.LJII, c1098010egBLIZIZ.LJIIJ);
        HashMap map = new HashMap(c1098010egBLIZIZ.LIZIZ());
        map.put("duration", Long.valueOf(jLIZ));
        map.put("duration_from_network", Long.valueOf(jLIZ2));
        map.put("duration_from_create", Long.valueOf(jLIZ3));
        if (str == null) {
            str = "unknown";
        }
        map.put("error_message", str);
        LIZJ(this, "container_load", 1, map);
    }

    public static void LIZJ(C1097990eg9 c1097990eg9, String str, int i, Map map) {
        String string;
        Map map2;
        c1097990eg9.getClass();
        map.put("action", str);
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_live_sdk_banner_all_in_one")) {
            if (C501590Jll.LIZJ()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(map);
                C501590Jll.LIZLLL(linkedHashMap);
                map2 = linkedHashMap;
            } else {
                map2 = map;
            }
            C1CC2.LJII(i, "live_sdk_banner_all_in_one", map2);
        }
        map.put("event_name", "live_sdk_banner_all_in_one");
        if (i == 0) {
            C1143300frE.LJIIJJI().LJII("ttlive_banner", map);
        } else {
            C1143300frE.LJIIJJI().LJ("ttlive_banner", map);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("live_banner_all_in_one");
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                string = value.toString();
            } else {
                string = null;
            }
            c474500IjALIZ.LJJII(string, str2);
        }
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LIZ();
        } else {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJJIJL();
        }
    }
}
