package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.04iw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1176404iw {
    public static final ConcurrentHashMap<String, C1176504ix> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Long> LIZIZ = new ConcurrentHashMap<>();

    public static void LIZ(long j, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('-');
        sbLIZ.append(1);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ConcurrentHashMap<String, C1176504ix> concurrentHashMap = LIZ;
        C1176504ix c1176504ix = concurrentHashMap.get(strLIZIZ);
        if (j > 0) {
            if (c1176504ix == null) {
                LIZIZ.put(strLIZIZ, Long.valueOf(j));
                return;
            }
        } else {
            if (j != 0) {
                if (c1176504ix == null) {
                    return;
                }
            }
            concurrentHashMap.remove(strLIZIZ);
        }
        if (c1176504ix.LIZ >= j) {
            return;
        }
        concurrentHashMap.remove(strLIZIZ);
    }
}
