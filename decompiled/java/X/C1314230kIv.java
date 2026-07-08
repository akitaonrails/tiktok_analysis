package X;

/* JADX INFO: renamed from: X.0kIv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1314230kIv {
    public static final int[] LJ = {1, 2, 4, 8, 16, 32, 64, 128, 256};
    public final float[] LIZ;
    public int LIZIZ;
    public final float LIZJ;
    public boolean LIZLLL;

    public C1314230kIv() {
        this(0.0f);
    }

    public C1314230kIv(float f) {
        this.LIZ = new float[]{1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f};
        this.LIZIZ = 0;
        this.LIZJ = f;
    }

    public final float LIZ(int i) {
        float f;
        char c;
        if (i != 4 && i != 5) {
            f = this.LIZJ;
        } else {
            f = 1.0E21f;
        }
        int i2 = this.LIZIZ;
        if (i2 == 0) {
            return f;
        }
        int[] iArr = LJ;
        if ((iArr[i] & i2) != 0) {
            return this.LIZ[i];
        }
        if (this.LIZLLL) {
            if (i != 1 && i != 3) {
                c = 6;
            } else {
                c = 7;
            }
            if ((iArr[c] & i2) != 0) {
                return this.LIZ[c];
            }
            if ((i2 & iArr[8]) != 0) {
                return this.LIZ[8];
            }
        }
        return f;
    }

    public final void LIZIZ(float f, int i) {
        boolean z;
        if (!C1314140kIm.LIZ(this.LIZ[i], f)) {
            this.LIZ[i] = f;
            boolean zLIZ = C1314550kJR.LIZ(f);
            int[] iArr = LJ;
            if (zLIZ) {
                this.LIZIZ &= ~iArr[i];
            } else {
                this.LIZIZ |= iArr[i];
            }
            int i2 = this.LIZIZ;
            if ((iArr[8] & i2) == 0 && (iArr[7] & i2) == 0 && (i2 & iArr[6]) == 0) {
                z = false;
            } else {
                z = true;
            }
            this.LIZLLL = z;
        }
    }
}
