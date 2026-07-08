package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0JfS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C497680JfS {
    public static final Map<String, Object> LIZ = new LinkedHashMap();
    public static long LIZIZ = -1;

    public static void LIZ(int i, String str, Map map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("livesdk_online_audience_rank_");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1CC2.LJII(i, strLIZIZ, map);
        map.put("event_name", strLIZIZ);
        if (i == 0) {
            C1143300frE.LJIIJJI().LJII("ttlive_online_audience", map);
        } else {
            C1143300frE.LJIIJJI().LJ("ttlive_online_audience", map);
        }
    }
}
