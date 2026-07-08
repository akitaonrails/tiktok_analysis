package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0vQ7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1741530vQ7 {
    public static C1741560vQA LIZ(String str, String str2, long j, Map map, int i) {
        if ((i & 4) != 0) {
            j = 0;
        }
        if ((i & 8) != 0) {
            map = new LinkedHashMap();
        }
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        return new C1741560vQA(str, str2, j, map);
    }
}
