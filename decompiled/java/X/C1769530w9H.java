package X;

/* JADX INFO: renamed from: X.0w9H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1769530w9H {
    public static final boolean LIZ;
    public static final boolean LIZIZ;

    static {
        C0CXF.LIZ.getClass();
        LIZ = C0CXF.LJ();
        LIZIZ = C0CXF.LJFF();
    }

    public static int LIZ(Integer num) {
        if (num != null) {
            num.intValue();
            int iIntValue = (num.intValue() >> 4) & 3;
            if (iIntValue == 0 || (iIntValue != 1 ? !(iIntValue != 2 || !LIZIZ) : LIZ)) {
                return num.intValue() & 15;
            }
        }
        return 0;
    }
}
