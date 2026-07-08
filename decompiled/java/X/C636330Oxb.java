package X;

/* JADX INFO: renamed from: X.0Oxb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C636330Oxb {
    public final int LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    public C636330Oxb() {
        this(false, 0, false, false, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C636330Oxb)) {
            return false;
        }
        C636330Oxb c636330Oxb = (C636330Oxb) obj;
        return this.LIZ == c636330Oxb.LIZ && this.LIZIZ == c636330Oxb.LIZIZ && this.LIZJ == c636330Oxb.LIZJ && this.LIZLLL == c636330Oxb.LIZLLL && this.LJ == c636330Oxb.LJ;
    }

    public C636330Oxb(boolean z, int i, boolean z2, boolean z3, int i2) {
        boolean z4;
        i = (i2 & 1) != 0 ? 0 : i;
        z = (i2 & 2) != 0 ? false : z;
        if ((i2 & 4) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        z2 = (i2 & 8) != 0 ? false : z2;
        z3 = (i2 & 16) != 0 ? false : z3;
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = z4;
        this.LIZLLL = z2;
        this.LJ = z3;
    }
}
