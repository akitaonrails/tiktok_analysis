package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0SRK, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SRK {
    public static long LIZ = -1;
    public static final LinkedHashMap<String, Long> LIZIZ = new LinkedHashMap<>();

    public static long LIZIZ(String str) {
        Long l = LIZIZ.get(str);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static void LIZJ(String str) {
        if (LIZ == -1) {
            LIZ = System.currentTimeMillis();
        }
        LIZIZ.put(str, Long.valueOf(System.currentTimeMillis() - LIZ));
    }

    public static void LIZ(C735800Ste c735800Ste, String str) {
        c735800Ste.LJFF(str, String.valueOf(LIZIZ(str)), InterfaceC1210900hcG.LIZ);
    }
}
