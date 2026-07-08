package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.09Bx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2332309Bx {
    public static String LIZIZ(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            c09cu.LJJJJJL();
            return null;
        }
        return c09cu.LJJJZ();
    }

    public static void LIZ(HashMap map, HashMap map2) {
        String str;
        if (map == null) {
            return;
        }
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (C1893407bI.LIZ((String) entry.getKey())) {
                Object value = entry.getValue();
                if ((value instanceof String) && (str = (String) value) != null && str.length() != 0) {
                    map2.put(((String) entry.getKey()).substring(1), str);
                }
                it2.remove();
            }
        }
    }
}
