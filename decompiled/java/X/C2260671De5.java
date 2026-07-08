package X;

/* JADX INFO: renamed from: X.1De5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2260671De5 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;

    public C2260671De5() {
        this(0, 0, 0, 0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2260671De5)) {
            return false;
        }
        C2260671De5 c2260671De5 = (C2260671De5) obj;
        return this.LIZ == c2260671De5.LIZ && this.LIZIZ == c2260671De5.LIZIZ && this.LIZJ == c2260671De5.LIZJ && this.LIZLLL == c2260671De5.LIZLLL && this.LJ == c2260671De5.LJ && this.LJFF == c2260671De5.LJFF;
    }

    public static C2260671De5 LIZ(C2260671De5 c2260671De5, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7 = i2;
        int i8 = i;
        int i9 = 0;
        if ((i3 & 1) != 0) {
            i4 = c2260671De5.LIZ;
        } else {
            i4 = 0;
        }
        if ((i3 & 2) != 0) {
            i5 = c2260671De5.LIZIZ;
        } else {
            i5 = 0;
        }
        if ((i3 & 4) != 0) {
            i8 = c2260671De5.LIZJ;
        }
        if ((i3 & 8) != 0) {
            i6 = c2260671De5.LIZLLL;
        } else {
            i6 = 0;
        }
        if ((i3 & 16) != 0) {
            i7 = c2260671De5.LJ;
        }
        if ((i3 & 32) != 0) {
            i9 = c2260671De5.LJFF;
        }
        c2260671De5.getClass();
        return new C2260671De5(i4, i5, i8, i6, i7, i9);
    }

    public C2260671De5(int i, int i2, int i3, int i4, int i5, int i6) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = i5;
        this.LJFF = i6;
    }
}
