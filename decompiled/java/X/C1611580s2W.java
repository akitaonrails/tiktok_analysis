package X;

/* JADX INFO: renamed from: X.0s2W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1611580s2W {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final boolean LJ;

    public C1611580s2W() {
        this(false, false, false, 0, false, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1611580s2W)) {
            return false;
        }
        C1611580s2W c1611580s2W = (C1611580s2W) obj;
        return this.LIZ == c1611580s2W.LIZ && this.LIZIZ == c1611580s2W.LIZIZ && this.LIZJ == c1611580s2W.LIZJ && this.LIZLLL == c1611580s2W.LIZLLL && this.LJ == c1611580s2W.LJ;
    }

    public C1611580s2W(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2) {
        z = (i2 & 1) != 0 ? false : z;
        z2 = (i2 & 2) != 0 ? false : z2;
        z3 = (i2 & 4) != 0 ? false : z3;
        i = (i2 & 8) != 0 ? 0 : i;
        z4 = (i2 & 16) != 0 ? false : z4;
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = i;
        this.LJ = z4;
    }
}
