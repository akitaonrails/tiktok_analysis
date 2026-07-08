package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.1541, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1541 {
    public static String LIZ;
    public static final HashMap<String, AnonymousClass1543> LIZIZ = new HashMap<>();

    public static Object LIZ(String str) {
        if (LIZ == null) {
            return null;
        }
        HashMap<String, AnonymousClass1543> map = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(LIZ);
        AnonymousClass1543 anonymousClass1543 = map.get(C2188811AlT.LIZIZ(sbLIZ));
        if (anonymousClass1543 == null) {
            return null;
        }
        if (System.currentTimeMillis() - anonymousClass1543.LIZ > 60000) {
            map.clear();
            LIZ = null;
            return null;
        }
        return anonymousClass1543.LIZIZ;
    }

    public static void LIZIZ(Object obj, String str) {
        HashMap<String, AnonymousClass1543> map;
        if (LIZ != null && (map = LIZIZ) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(LIZ);
            map.put(C2188811AlT.LIZIZ(sbLIZ), new AnonymousClass1543(System.currentTimeMillis(), obj));
        }
    }
}
