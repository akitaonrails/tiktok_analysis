package X;

/* JADX INFO: renamed from: X.12zF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19935112zF {
    public static final C19935112zF LIZJ = new C19935112zF(false, false);
    public static final C19935112zF LIZLLL = new C19935112zF(false, true);
    public static final C19935112zF LJ = new C19935112zF(true, false);
    public static final C19935112zF LJFF = new C19935112zF(true, true);
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C19935112zF(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }

    public static C19935112zF LIZ(boolean z, boolean z2) {
        if (z) {
            if (z2) {
                return LJFF;
            }
            return LJ;
        }
        if (z2) {
            return LIZLLL;
        }
        return LIZJ;
    }
}
