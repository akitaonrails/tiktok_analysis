package X;

/* JADX INFO: renamed from: X.1Cxk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2247381Cxk {
    public float LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;

    public C2247381Cxk() {
    }

    public C2247381Cxk(int[] iArr) {
        this(iArr[0], iArr[1], r1 + iArr[2], r3 + iArr[3]);
    }

    public static C2247381Cxk LIZ(C2247381Cxk c2247381Cxk) {
        if (c2247381Cxk == null) {
            return null;
        }
        C2247381Cxk c2247381Cxk2 = new C2247381Cxk();
        c2247381Cxk2.LIZ = c2247381Cxk.LIZ;
        c2247381Cxk2.LIZIZ = c2247381Cxk.LIZIZ;
        c2247381Cxk2.LIZJ = c2247381Cxk.LIZJ;
        c2247381Cxk2.LIZLLL = c2247381Cxk.LIZLLL;
        return c2247381Cxk2;
    }

    public final void LJ(int[] iArr) {
        this.LIZ = iArr[0];
        this.LIZIZ = iArr[1];
        this.LIZJ = r2 + iArr[2];
        this.LIZLLL = r1 + iArr[3];
    }

    public final C2247381Cxk LIZIZ(float f, float f2) {
        if (f != 0.0f && f2 != 0.0f) {
            LIZJ(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, f, f2);
        }
        return this;
    }

    public final void LIZLLL(float f, float f2, int[] iArr) {
        if (f != 0.0f && f2 != 0.0f && iArr != null && iArr.length == 4) {
            LIZJ(iArr[0], iArr[1], r2 + iArr[2], r1 + iArr[3], f, f2);
        }
    }

    public C2247381Cxk(float f, float f2, float f3, float f4) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
    }

    public final void LIZJ(float f, float f2, float f3, float f4, float f5, float f6) {
        if (f5 != 0.0f && f6 != 0.0f) {
            this.LIZ = f / f5;
            this.LIZIZ = f2 / f6;
            this.LIZJ = f3 / f5;
            this.LIZLLL = f4 / f6;
        }
    }
}
