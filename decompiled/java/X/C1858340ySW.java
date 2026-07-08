package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0ySW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858340ySW {
    public static final Map<String, C1858330ySV> LIZ = new LinkedHashMap();

    public static C1858330ySV LIZ(String str) {
        return (C1858330ySV) ((LinkedHashMap) LIZ).get(str);
    }

    public static void LIZJ(long j, String str) {
        Long l;
        Map<String, C1858330ySV> map = LIZ;
        C1858330ySV c1858330ySV = (C1858330ySV) ((LinkedHashMap) map).get(str);
        if (c1858330ySV != null && (l = c1858330ySV.LIZLLL) != null) {
            map.put(str, C1858330ySV.LIZ(c1858330ySV, c1858330ySV.LIZJ + (j - l.longValue()), null, 3));
        }
    }

    public static void LIZIZ(int i, long j, String str) {
        LIZ.put(str, new C1858330ySV(i, j, 0L, null));
    }
}
