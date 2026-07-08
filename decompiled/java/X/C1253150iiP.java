package X;

/* JADX INFO: renamed from: X.0iiP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1253150iiP {
    public static C1253330iih LIZ;
    public static String LIZIZ = "";
    public static int LIZJ = 2;
    public static int LIZLLL = 2;

    public static int LIZIZ() {
        int i = LIZJ;
        if (i == 0) {
            if (LIZLLL == 1) {
                return 3;
            }
        } else {
            if (i == 1) {
                return LIZLLL == 0 ? 4 : 0;
            }
            if (i != 0) {
                return 0;
            }
        }
        return LIZLLL == 0 ? 5 : 0;
    }

    public static void LIZJ(boolean z, boolean z2) {
        C1253330iih c1253330iih;
        if (z2) {
            LIZJ = z ? 1 : 0;
        } else {
            LIZLLL = z ? 1 : 0;
        }
        if (LIZJ != 2 && LIZLLL != 2 && (c1253330iih = LIZ) != null) {
            c1253330iih.LIZIZ(LIZIZ());
        }
    }

    public static void LIZ(C1253200iiU c1253200iiU, String str, boolean z, String str2) {
        LIZIZ = str2;
        LIZ = new C1253330iih(new C1253340iii(System.currentTimeMillis(), true, z, 443), str, c1253200iiU);
    }
}
