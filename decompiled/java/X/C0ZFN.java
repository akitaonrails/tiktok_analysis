package X;

/* JADX INFO: renamed from: X.0ZFN, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZFN {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0ZFN() {
        boolean z = false;
        this(z, z, z, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZFN)) {
            return false;
        }
        C0ZFN c0zfn = (C0ZFN) obj;
        return this.LIZ == c0zfn.LIZ && this.LIZIZ == c0zfn.LIZIZ && this.LIZJ == c0zfn.LIZJ && this.LIZLLL == c0zfn.LIZLLL;
    }

    public /* synthetic */ C0ZFN(boolean z, boolean z2, boolean z3, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, false);
    }

    public C0ZFN(boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
    }
}
