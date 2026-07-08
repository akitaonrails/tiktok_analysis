package X;

/* JADX INFO: renamed from: X.0lYn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362510lYn {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1362510lYn() {
        boolean z = false;
        this(z, z, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1362510lYn)) {
            return false;
        }
        C1362510lYn c1362510lYn = (C1362510lYn) obj;
        return this.LIZ == c1362510lYn.LIZ && this.LIZIZ == c1362510lYn.LIZIZ && this.LIZJ == c1362510lYn.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public /* synthetic */ C1362510lYn(boolean z, boolean z2, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, false);
    }

    public C1362510lYn(boolean z, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
    }
}
