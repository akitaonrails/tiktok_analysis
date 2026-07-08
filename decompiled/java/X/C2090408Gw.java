package X;

/* JADX INFO: renamed from: X.08Gw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2090408Gw {
    public static boolean LIZ = true;
    public static Boolean LIZIZ = Boolean.FALSE;
    public static int LIZJ = 2;
    public static boolean LIZLLL = false;
    public static boolean LJ = false;
    public static boolean LJFF = false;

    public static void LIZ(int i) {
        boolean z = false;
        if (i < 50) {
            LIZJ = 100 / i;
            LJ = false;
        } else {
            LIZJ = 100 / (100 - i);
            LJ = true;
        }
        if (LIZJ % 2 == 1) {
            z = true;
        }
        LIZLLL = z;
    }
}
