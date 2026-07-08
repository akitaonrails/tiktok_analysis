package X;

/* JADX INFO: renamed from: X.0u8e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692260u8e {
    public final InterfaceC1692190u8X LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final float LJFF;
    public final float LJI;

    public final C1683130ttv LIZ(C1683130ttv c1683130ttv) {
        float f = this.LJFF;
        return c1683130ttv.LJIIIZ((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    public final C1683130ttv LIZJ(C1683130ttv c1683130ttv) {
        float f = -this.LJFF;
        return c1683130ttv.LJIIIZ((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    public final int LIZLLL(int i) {
        return C13LZ.LJ(i, this.LIZIZ, this.LIZJ) - this.LIZIZ;
    }

    public final long LIZIZ(long j, boolean z) {
        if (z) {
            int i = C1692280u8g.LIZJ;
            long j2 = C1692280u8g.LIZIZ;
            if (C1692280u8g.LIZIZ(j, j2)) {
                return j2;
            }
        }
        int i2 = C1692280u8g.LIZJ;
        return C1680680tpy.LIZ(((int) (j >> 32)) + this.LIZIZ, C1692280u8g.LIZLLL(j) + this.LIZIZ);
    }

    public C1692260u8e(C1695170uDL c1695170uDL, int i, int i2, int i3, int i4, float f, float f2) {
        this.LIZ = c1695170uDL;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = i4;
        this.LJFF = f;
        this.LJI = f2;
    }
}
