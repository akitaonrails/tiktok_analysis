package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0ILH, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0ILH {
    public static final Map<String, Object> LIZ = new LinkedHashMap();
    public static long LIZIZ = -1;

    public static final void LIZ(long j) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZ);
        long j2 = LIZIZ;
        long j3 = -1;
        if (j2 != -1) {
            j3 = j - j2;
        }
        linkedHashMap.put("duration", Long.valueOf(j3));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("livesdk_live_audience_end_");
        sbLIZ.append("view_created");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1CC2.LJII(0, strLIZIZ, linkedHashMap);
        linkedHashMap.put("event_name", strLIZIZ);
        C1143300frE.LJIIJJI().LJII("ttlive_live_end", linkedHashMap);
    }
}
