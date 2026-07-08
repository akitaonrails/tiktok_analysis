package X;

/* JADX INFO: renamed from: X.1BUE, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BUE {
    public static final C1BUG LIZ = new ThreadLocal<byte[]>() { // from class: X.1BUG
        @Override // java.lang.ThreadLocal
        public final byte[] initialValue() {
            return new byte[512];
        }
    };
    public static long LIZIZ = -1;
    public static final C1BUF LIZJ = new C1BUF();
    public static final C1BUD LIZLLL = new C1BUD();
    public static C1BUE LJ;

    public static synchronized C1BUE LIZ() {
        if (LJ == null) {
            LJ = new C1BUE();
        }
        return LJ;
    }
}
