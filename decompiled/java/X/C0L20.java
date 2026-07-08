package X;

/* JADX INFO: renamed from: X.0L20, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L20 {
    public boolean LIZ;
    public boolean LIZIZ;
    public final boolean LIZJ;
    public int LIZLLL;
    public int LJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0L20() {
        boolean z = false;
        this(z, z, z, 31);
    }

    public static C0L20 LIZ(C0L20 c0l20) {
        boolean z = c0l20.LIZ;
        boolean z2 = c0l20.LIZIZ;
        boolean z3 = c0l20.LIZJ;
        int i = c0l20.LIZLLL;
        int i2 = c0l20.LJ;
        c0l20.getClass();
        return new C0L20(z, z2, z3, i, i2);
    }

    public /* synthetic */ C0L20(boolean z, boolean z2, boolean z3, int i) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? false : z3, 0, 0);
    }

    public C0L20(boolean z, boolean z2, boolean z3, int i, int i2) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = i;
        this.LJ = i2;
    }
}
