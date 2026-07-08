package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.13pT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20129313pT {
    public static final C20129413pU LIZ = new Object() { // from class: X.13pU
    };
    public static final C20129213pS LIZIZ = new Object() { // from class: X.13pS
    };

    public static double LIZJ(Object obj) {
        return ((Double) obj).doubleValue();
    }

    public static Object LIZ(Object obj, String str) {
        HashMap map = (HashMap) obj;
        if (map.containsKey(str)) {
            Object obj2 = map.get(str);
            if (obj2 == null) {
                return LIZIZ;
            }
            return obj2;
        }
        return LIZ;
    }

    public static void LIZIZ(Object obj, String str, Object obj2) {
        ((HashMap) obj).put(str, obj2);
    }
}
