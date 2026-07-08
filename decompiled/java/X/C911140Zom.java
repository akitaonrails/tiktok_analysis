package X;

/* JADX INFO: renamed from: X.0Zom, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C911140Zom {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C911140Zom() {
        boolean z = false;
        this(z, z, 7);
    }

    public /* synthetic */ C911140Zom(boolean z, boolean z2, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, false);
    }

    public C911140Zom(boolean z, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
    }

    public static C911140Zom LIZ(C911140Zom c911140Zom, boolean z, boolean z2, int i) {
        boolean z3;
        if ((i & 1) != 0) {
            z = c911140Zom.LIZ;
        }
        if ((i & 2) != 0) {
            z3 = c911140Zom.LIZIZ;
        } else {
            z3 = false;
        }
        if ((i & 4) != 0) {
            z2 = c911140Zom.LIZJ;
        }
        return new C911140Zom(z, z3, z2);
    }
}
