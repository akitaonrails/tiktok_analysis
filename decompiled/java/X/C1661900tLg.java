package X;

/* JADX INFO: renamed from: X.0tLg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1661900tLg {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public C1661900tLg() {
        this(false, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1661900tLg)) {
            return false;
        }
        C1661900tLg c1661900tLg = (C1661900tLg) obj;
        return this.LIZ == c1661900tLg.LIZ && this.LIZIZ == c1661900tLg.LIZIZ && this.LIZJ == c1661900tLg.LIZJ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1661900tLg(boolean z, int i) {
        boolean z2;
        z = (i & 1) != 0 ? true : z;
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this(z, z2, (i & 4) != 0);
    }

    public C1661900tLg(boolean z, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
    }
}
