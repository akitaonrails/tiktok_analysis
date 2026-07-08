package X;

/* JADX INFO: renamed from: X.0ttv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683130ttv {
    public static final C1683130ttv LJ = new C1683130ttv(0.0f, 0.0f, 0.0f, 0.0f);
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1683130ttv)) {
            return false;
        }
        C1683130ttv c1683130ttv = (C1683130ttv) obj;
        return Float.compare(this.LIZ, c1683130ttv.LIZ) == 0 && Float.compare(this.LIZIZ, c1683130ttv.LIZIZ) == 0 && Float.compare(this.LIZJ, c1683130ttv.LIZJ) == 0 && Float.compare(this.LIZLLL, c1683130ttv.LIZLLL) == 0;
    }

    public final long LIZJ() {
        float f = this.LIZ;
        float f2 = f + ((this.LIZJ - f) / 2.0f);
        float f3 = this.LIZIZ;
        return (((long) Float.floatToRawIntBits(f3 + ((this.LIZLLL - f3) / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public final long LIZLLL() {
        float f = this.LIZJ - this.LIZ;
        return (((long) Float.floatToRawIntBits(this.LIZLLL - this.LIZIZ)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final long LJ() {
        float f = this.LIZ;
        return (((long) Float.floatToRawIntBits(this.LIZIZ)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final boolean LJI() {
        return (this.LIZ >= this.LIZJ) | (this.LIZIZ >= this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Rect.fromLTRB(");
        sbLIZ.append(C1297290jrb.LIZ(this.LIZ));
        sbLIZ.append(", ");
        sbLIZ.append(C1297290jrb.LIZ(this.LIZIZ));
        sbLIZ.append(", ");
        sbLIZ.append(C1297290jrb.LIZ(this.LIZJ));
        sbLIZ.append(", ");
        sbLIZ.append(C1297290jrb.LIZ(this.LIZLLL));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        boolean z4 = true;
        if (fIntBitsToFloat >= this.LIZ) {
            z = true;
        } else {
            z = false;
        }
        if (fIntBitsToFloat < this.LIZJ) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (fIntBitsToFloat2 >= this.LIZIZ) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 & z3;
        if (fIntBitsToFloat2 >= this.LIZLLL) {
            z4 = false;
        }
        return z6 & z4;
    }

    public final C1683130ttv LJFF(C1683130ttv c1683130ttv) {
        return new C1683130ttv(Math.max(this.LIZ, c1683130ttv.LIZ), Math.max(this.LIZIZ, c1683130ttv.LIZIZ), Math.min(this.LIZJ, c1683130ttv.LIZJ), Math.min(this.LIZLLL, c1683130ttv.LIZLLL));
    }

    public final boolean LJII(C1683130ttv c1683130ttv) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (this.LIZ < c1683130ttv.LIZJ) {
            z = true;
        } else {
            z = false;
        }
        if (c1683130ttv.LIZ < this.LIZJ) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (this.LIZIZ < c1683130ttv.LIZLLL) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 & z3;
        if (c1683130ttv.LIZIZ >= this.LIZLLL) {
            z4 = false;
        }
        return z6 & z4;
    }

    public final C1683130ttv LJIIIZ(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new C1683130ttv(this.LIZ + Float.intBitsToFloat(i), this.LIZIZ + Float.intBitsToFloat(i2), this.LIZJ + Float.intBitsToFloat(i), this.LIZLLL + Float.intBitsToFloat(i2));
    }

    public final C1683130ttv LJIIIIZZ(float f, float f2) {
        return new C1683130ttv(this.LIZ + f, this.LIZIZ + f2, this.LIZJ + f, this.LIZLLL + f2);
    }

    public C1683130ttv(float f, float f2, float f3, float f4) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
    }

    public static C1683130ttv LIZIZ(C1683130ttv c1683130ttv, float f, float f2, int i) {
        float f3;
        if ((i & 1) != 0) {
            f = c1683130ttv.LIZ;
        }
        float f4 = 0.0f;
        if ((i & 2) != 0) {
            f3 = c1683130ttv.LIZIZ;
        } else {
            f3 = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = c1683130ttv.LIZJ;
        }
        if ((i & 8) != 0) {
            f4 = c1683130ttv.LIZLLL;
        }
        c1683130ttv.getClass();
        return new C1683130ttv(f, f3, f2, f4);
    }
}
