package X;

/* JADX INFO: renamed from: X.0QcQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C674160QcQ {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final float LJI;
    public final float LJII;
    public final float LJIIIIZZ;
    public final float LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C674160QcQ)) {
            return false;
        }
        C674160QcQ c674160QcQ = (C674160QcQ) obj;
        return Float.compare(this.LIZ, c674160QcQ.LIZ) == 0 && Float.compare(this.LIZIZ, c674160QcQ.LIZIZ) == 0 && Float.compare(this.LIZJ, c674160QcQ.LIZJ) == 0 && Float.compare(this.LIZLLL, c674160QcQ.LIZLLL) == 0 && Float.compare(this.LJ, c674160QcQ.LJ) == 0 && Float.compare(this.LJFF, c674160QcQ.LJFF) == 0 && Float.compare(this.LJI, c674160QcQ.LJI) == 0 && Float.compare(this.LJII, c674160QcQ.LJII) == 0 && Float.compare(this.LJIIIIZZ, c674160QcQ.LJIIIIZZ) == 0 && Float.compare(this.LJIIIZ, c674160QcQ.LJIIIZ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcSearchBarAlphaSnapshot(labelContainer=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", clearIv=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", splitView=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", photoSearch=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", inputEdt=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", aiInputEdt=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", aiHintEdt=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", clearAllTv=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", microphoneIv=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", voiceWaveView=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((((((((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ)) * 31) + Float.floatToIntBits(this.LJFF)) * 31) + Float.floatToIntBits(this.LJI)) * 31) + Float.floatToIntBits(this.LJII)) * 31) + Float.floatToIntBits(this.LJIIIIZZ)) * 31) + Float.floatToIntBits(this.LJIIIZ);
    }

    public static C674160QcQ LIZ(C674160QcQ c674160QcQ, float f, float f2, float f3, float f4, int i) {
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10 = f3;
        float f11 = f2;
        float f12 = f4;
        float f13 = f;
        float f14 = 0.0f;
        if ((i & 1) != 0) {
            f5 = c674160QcQ.LIZ;
        } else {
            f5 = 0.0f;
        }
        if ((i & 2) != 0) {
            f6 = c674160QcQ.LIZIZ;
        } else {
            f6 = 0.0f;
        }
        if ((i & 4) != 0) {
            f7 = c674160QcQ.LIZJ;
        } else {
            f7 = 0.0f;
        }
        if ((i & 8) != 0) {
            f8 = c674160QcQ.LIZLLL;
        } else {
            f8 = 0.0f;
        }
        if ((i & 16) != 0) {
            f9 = c674160QcQ.LJ;
        } else {
            f9 = 0.0f;
        }
        if ((i & 32) != 0) {
            f13 = c674160QcQ.LJFF;
        }
        if ((i & 64) != 0) {
            f11 = c674160QcQ.LJI;
        }
        if ((i & 128) != 0) {
            f14 = c674160QcQ.LJII;
        }
        if ((i & 256) != 0) {
            f10 = c674160QcQ.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            f12 = c674160QcQ.LJIIIZ;
        }
        c674160QcQ.getClass();
        return new C674160QcQ(f5, f6, f7, f8, f9, f13, f11, f14, f10, f12);
    }

    public C674160QcQ(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
        this.LJ = f5;
        this.LJFF = f6;
        this.LJI = f7;
        this.LJII = f8;
        this.LJIIIIZZ = f9;
        this.LJIIIZ = f10;
    }
}
