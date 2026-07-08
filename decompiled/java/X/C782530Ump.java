package X;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Ump, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C782530Ump {
    public static long LIZ = -1;
    public static long LIZIZ = -1;
    public static final Map<String, Object> LIZJ = new LinkedHashMap();

    public static void LIZ(String str, Map map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("livesdk_broadcast_endpage_");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C501590Jll.LIZLLL(map);
        C1CC2.LJII(0, strLIZIZ, map);
        map.put("event_name", strLIZIZ);
        C1143300frE.LJIIJJI().LJII("ttlive_live_anchor_end", map);
    }

    public static void LIZIZ(int i, String str) {
        long j;
        if (LIZIZ <= 0) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZJ);
        long j2 = LIZIZ;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (j2 != -1 && jElapsedRealtime > j2) {
            j = jElapsedRealtime - j2;
        } else {
            j = -1;
        }
        linkedHashMap.put("duration", Long.valueOf(j));
        if (str == null) {
            str = "unknow";
        }
        linkedHashMap.put("container_type", str);
        linkedHashMap.put("load_result", Integer.valueOf(i));
        LIZ("spark_loaded", linkedHashMap);
        Long l = -1L;
        if (l != null) {
            l.longValue();
            LIZIZ = l.longValue();
        }
    }
}
