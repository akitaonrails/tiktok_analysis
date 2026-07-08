package X;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1AJX, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AJX {
    public static final Map<String, Object> LIZ = new LinkedHashMap();
    public static long LIZIZ = -1;
    public static long LIZJ = -1;
    public static long LIZLLL = -1;
    public static long LJ = -1;

    public static void LIZ(String str, Map map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("livesdk_sticker_perf_");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1CC2.LJII(0, strLIZIZ, map);
        map.put("event_name", strLIZIZ);
        C1143300frE.LJIIJJI().LJII("ttlive_sticker", map);
    }

    public static void LIZJ(int i, int i2) {
        long j;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZ);
        linkedHashMap.put("sticker_type", Integer.valueOf(i));
        linkedHashMap.put("load_result", Integer.valueOf(i2));
        long j2 = LJ;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (j2 != -1 && jElapsedRealtime > j2) {
            j = jElapsedRealtime - j2;
        } else {
            j = -1;
        }
        linkedHashMap.put("duration", Long.valueOf(j));
        C501590Jll.LIZLLL(linkedHashMap);
        LIZ("image_show", linkedHashMap);
        LJ = -1L;
    }

    public static void LIZLLL(int i, int i2) {
        long j;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZ);
        linkedHashMap.put("sticker_type", Integer.valueOf(i));
        linkedHashMap.put("load_result", Integer.valueOf(i2));
        long j2 = LIZLLL;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (j2 != -1 && jElapsedRealtime > j2) {
            j = jElapsedRealtime - j2;
        } else {
            j = -1;
        }
        linkedHashMap.put("duration", Long.valueOf(j));
        C501590Jll.LIZLLL(linkedHashMap);
        LIZ("sticker_show", linkedHashMap);
        LIZLLL = -1L;
    }

    public static void LIZIZ(int i, int i2, String str) {
        long j;
        String str2;
        long j2;
        if (i != 1) {
            if (i == 2) {
                j = LIZJ;
                str2 = "set_server";
            } else {
                return;
            }
        } else {
            j = LIZIZ;
            str2 = "del_server";
        }
        if (j != -1 && str2.length() != 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(LIZ);
            linkedHashMap.put("load_result", Integer.valueOf(i2));
            if (str != null && str.length() != 0) {
                linkedHashMap.put("failed_Type", str);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime > j) {
                j2 = jElapsedRealtime - j;
            } else {
                j2 = -1;
            }
            linkedHashMap.put("duration", Long.valueOf(j2));
            C501590Jll.LIZLLL(linkedHashMap);
            LIZ(str2, linkedHashMap);
            if (i != 1) {
                if (i == 2) {
                    LIZJ = -1L;
                    return;
                }
                return;
            }
            LIZIZ = -1L;
        }
    }
}
