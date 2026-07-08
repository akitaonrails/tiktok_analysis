package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0z8D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1884190z8D {
    public static C1884200z8E LIZ(String str) {
        Map<String, C1884200z8E> map = C1884200z8E.LJII;
        C1884200z8E c1884200z8E = (C1884200z8E) ((LinkedHashMap) map).get(str);
        if (c1884200z8E == null) {
            C1884200z8E c1884200z8E2 = new C1884200z8E();
            map.put(str, c1884200z8E2);
            return c1884200z8E2;
        }
        return c1884200z8E;
    }
}
