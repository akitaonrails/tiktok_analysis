package X;

/* JADX INFO: renamed from: X.0tyL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685870tyL {
    public static final long LIZ;
    public static final long LIZIZ;
    public static final long LIZJ;
    public static final long LIZLLL;
    public static final /* synthetic */ int LJ = 0;

    static {
        long j = 3;
        long j2 = j << 32;
        LIZ = (((long) 0) & 4294967295L) | j2;
        LIZIZ = (((long) 1) & 4294967295L) | j2;
        LIZJ = j2 | (((long) 2) & 4294967295L);
        LIZLLL = (j & 4294967295L) | (((long) 4) << 32);
    }

    public static final boolean LIZ(long j, long j2) {
        return j == j2;
    }

    public static String LIZIZ(long j) {
        if (LIZ(j, LIZ)) {
            return "Rgb";
        }
        if (LIZ(j, LIZIZ)) {
            return "Xyz";
        }
        if (LIZ(j, LIZJ)) {
            return "Lab";
        }
        if (LIZ(j, LIZLLL)) {
            return "Cmyk";
        }
        return "Unknown";
    }
}
