package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0IjD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C474530IjD {
    public static final Map<String, Long> LIZ = new LinkedHashMap();

    public static void LIZ(long j, String str) {
        Long lValueOf = Long.valueOf(j);
        Map<String, Long> map = LIZ;
        map.put(str, lValueOf);
        if (map.size() == 6) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_partnership_pf_intro_card");
            c474500IjALIZ.LJJIJ(map);
            c474500IjALIZ.LIZ();
            ((LinkedHashMap) map).clear();
        }
    }
}
