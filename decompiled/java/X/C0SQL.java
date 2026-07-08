package X;

/* JADX INFO: renamed from: X.0SQL, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SQL implements C0S9I {
    public static final C0SQL LIZ = new C0SQL();
    public static String LIZIZ;
    public static String LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static long LJI;

    @Override // X.C0S9I
    public final String getEventName() {
        return "back_to_feed_latency";
    }

    public static final void LIZ() {
        if (LJFF == 0) {
            LJFF = System.currentTimeMillis();
        }
    }

    public static final void LIZIZ() {
        if (LJ == 0) {
            LJ = System.currentTimeMillis();
        }
    }
}
