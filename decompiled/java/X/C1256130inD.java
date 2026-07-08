package X;

/* JADX INFO: renamed from: X.0inD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1256130inD {
    public static final C1256130inD LIZ = new C1256130inD();
    public static volatile int LIZIZ;
    public static volatile int LIZJ;
    public static String LIZLLL;

    public static int LIZ() {
        return C10EU.LJIIZILJ(LIZLLL) ? LIZJ : LIZIZ;
    }

    public static void LIZIZ(int i, String str) {
        LIZLLL = str;
        LIZ();
        if (C10EU.LJIIZILJ(str)) {
            LIZJ = i;
        } else {
            LIZIZ = i;
        }
    }
}
