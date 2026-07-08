package X;

import android.graphics.PointF;

/* JADX INFO: renamed from: X.0EO2, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EO2 {
    public boolean LIZIZ;
    public boolean LIZJ;
    public float LIZLLL;
    public float LJ;
    public float LJFF;
    public float LJI;
    public C0EO3 LIZ = new C0EO3(false, false);
    public float LJII = -1.0f;
    public float LJIIIIZZ = -1.0f;
    public float LJIIIZ = -1.0f;
    public float LJIIJ = -1.0f;

    public final PointF LIZ(PointF pointF, PointF pointF2) {
        float f = pointF.x;
        float f2 = pointF2.x;
        float f3 = f + f2;
        float f4 = pointF.y + pointF2.y;
        float f5 = this.LJII;
        if (f5 > 0.0f) {
            if (this.LIZ.LIZ) {
                float f6 = this.LIZLLL;
                if (f6 < f5) {
                    this.LIZLLL = f6 + Math.abs(f2);
                    f3 = 0.0f;
                } else if (Math.abs(f3) >= this.LJII) {
                    this.LIZ = C0EO3.LIZ(this.LIZ, false, false, 2);
                }
            } else if (Math.abs(f3) < this.LJII) {
                this.LIZ = C0EO3.LIZ(this.LIZ, true, false, 2);
                this.LIZLLL = 0.0f;
                f3 = 0.0f;
            }
        }
        float f7 = this.LJIIIIZZ;
        if (f7 > 0.0f) {
            if (this.LIZ.LIZIZ) {
                float f8 = this.LJ;
                if (f8 < f7) {
                    this.LJ = f8 + Math.abs(pointF2.y);
                    f4 = 0.0f;
                } else if (Math.abs(f4) >= this.LJIIIIZZ) {
                    this.LIZ = C0EO3.LIZ(this.LIZ, false, false, 1);
                }
            } else if (Math.abs(f4) < this.LJIIIIZZ) {
                this.LIZ = C0EO3.LIZ(this.LIZ, false, true, 1);
                this.LJ = 0.0f;
                f4 = 0.0f;
            }
        }
        return new PointF(f3, f4);
    }

    public final void LIZJ(PointF pointF, float f) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (pointF.x == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (pointF.y == 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LIZ = new C0EO3(z, z2);
        if (f % 90.0f != 0.0f) {
            z3 = false;
        }
        this.LIZIZ = z3;
    }

    public final float LIZIZ(float f, float f2, int i) {
        int i2;
        float f3 = f + f2;
        if (this.LJIIIZ <= 0.0f) {
            return f3;
        }
        float f4 = i;
        float fAbs = Math.abs(f3 % f4);
        if (this.LIZIZ) {
            float fAbs2 = this.LJFF + Math.abs(f2);
            this.LJFF = fAbs2;
            float f5 = this.LJIIIZ;
            if (fAbs2 < f5) {
                return f;
            }
            if (fAbs >= f5 && fAbs <= f4 - f5) {
                this.LIZIZ = false;
            }
            return f3;
        }
        float f6 = this.LJIIIZ;
        if (fAbs >= f6 && fAbs <= f4 - f6) {
            return f3;
        }
        int i3 = 1;
        this.LIZIZ = true;
        this.LJFF = 0.0f;
        if (fAbs < f6) {
            i2 = ((int) f3) / i;
        } else {
            int i4 = ((int) f3) / i;
            if (f3 < 0.0f) {
                i3 = -1;
            }
            i2 = i4 + i3;
        }
        return i2 * f4;
    }
}
