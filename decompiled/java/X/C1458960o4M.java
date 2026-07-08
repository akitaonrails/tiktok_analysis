package X;

/* JADX INFO: renamed from: X.0o4M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1458960o4M {
    public static boolean LIZ;
    public static int LIZIZ = -1;
    public static boolean LIZJ;
    public static boolean LIZLLL;

    public static int LIZ() {
        if (LIZJ || LIZLLL) {
            return 4;
        }
        return LIZIZ;
    }

    public static final boolean LIZIZ() {
        return LIZ() != -1;
    }

    public static final void LIZJ(boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        LIZIZ = i | (LIZ ? 1 : 0);
    }
}
