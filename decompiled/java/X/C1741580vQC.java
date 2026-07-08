package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0vQC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1741580vQC {
    public static C1741570vQB LIZ(String str, String str2, Map map, Long l, Map map2) {
        long jCurrentTimeMillis;
        if (l != null && l.longValue() > 0) {
            jCurrentTimeMillis = l.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map2 != null) {
            linkedHashMap.putAll(map2);
        }
        return new C1741570vQB(str, str2, map, jCurrentTimeMillis, linkedHashMap);
    }
}
