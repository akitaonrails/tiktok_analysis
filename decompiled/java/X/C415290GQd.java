package X;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.0GQd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C415290GQd {
    public final Path LIZ = new Path();
    public final PointF LIZIZ = new PointF();
    public final PointF LIZJ = new PointF();
    public final PointF LIZLLL = new PointF();
    public final PointF LJ = new PointF();

    public final void LJ() {
        PointF pointF = this.LIZIZ;
        PointF pointF2 = this.LIZLLL;
        pointF.x = pointF2.x;
        pointF.y = pointF2.y;
        PointF pointF3 = this.LIZJ;
        pointF3.x = pointF2.x;
        pointF3.y = pointF2.y;
        this.LIZ.close();
        Path path = this.LIZ;
        PointF pointF4 = this.LIZIZ;
        path.moveTo(pointF4.x, pointF4.y);
    }

    public final void LJII(float f) {
        this.LIZ.lineTo(f, this.LIZIZ.y);
        this.LIZIZ.x = f;
    }

    public final void LJIIL(float f) {
        this.LIZ.rLineTo(f, 0.0f);
        this.LIZIZ.x += f;
    }

    public final void LJIILLIIL(float f) {
        this.LIZ.rLineTo(0.0f, f);
        this.LIZIZ.y += f;
    }

    public final void LJIJ(Path.FillType fillType) {
        this.LIZ.setFillType(fillType);
    }

    public final void LJIJI(float f) {
        this.LIZ.lineTo(this.LIZIZ.x, f);
        this.LIZIZ.y = f;
    }

    public final void LJIIIIZZ(float f, float f2) {
        this.LIZ.lineTo(f, f2);
        PointF pointF = this.LIZIZ;
        pointF.x = f;
        pointF.y = f2;
    }

    public final void LJIIIZ(float f, float f2) {
        PointF pointF = this.LIZIZ;
        pointF.x = f;
        pointF.y = f2;
        this.LIZ.moveTo(f, f2);
        PointF pointF2 = this.LIZLLL;
        PointF pointF3 = this.LIZIZ;
        pointF2.x = pointF3.x;
        pointF2.y = pointF3.y;
    }

    public final void LJIILIIL(float f, float f2) {
        this.LIZ.rLineTo(f, f2);
        PointF pointF = this.LIZIZ;
        pointF.x += f;
        pointF.y += f2;
    }

    public final void LJIILJJIL(float f, float f2) {
        PointF pointF = this.LIZIZ;
        pointF.x += f;
        pointF.y += f2;
        this.LIZ.rMoveTo(f, f2);
        PointF pointF2 = this.LIZLLL;
        PointF pointF3 = this.LIZIZ;
        pointF2.x = pointF3.x;
        pointF2.y = pointF3.y;
    }

    public final void LIZIZ(float f, float f2, Path.Direction direction) {
        this.LIZ.addRect(0.0f, 0.0f, f, f2, direction);
    }

    public final void LIZ(float f, float f2, float f3, Path.Direction direction) {
        this.LIZ.addCircle(f, f2, f3, direction);
    }

    public final void LIZJ(RectF rectF, float f, float f2, Path.Direction direction) {
        this.LIZ.addRoundRect(rectF, f, f2, direction);
    }

    public final void LJIILL(boolean z, float f, float f2, float f3, float f4) {
        if (z) {
            PointF pointF = this.LJ;
            PointF pointF2 = this.LIZIZ;
            float f5 = pointF2.x;
            PointF pointF3 = this.LIZJ;
            pointF.x = f5 - pointF3.x;
            pointF.y = pointF2.y - pointF3.y;
        } else {
            PointF pointF4 = this.LJ;
            pointF4.x = 0.0f;
            pointF4.y = 0.0f;
        }
        Path path = this.LIZ;
        PointF pointF5 = this.LJ;
        path.rCubicTo(pointF5.x, pointF5.y, f, f2, f3, f4);
        PointF pointF6 = this.LIZJ;
        PointF pointF7 = this.LIZIZ;
        pointF6.x = pointF7.x + f;
        pointF6.y = pointF7.y + f2;
        pointF7.x += f3;
        pointF7.y += f4;
    }

    public final void LJIIZILJ(boolean z, float f, float f2, float f3, float f4) {
        if (z) {
            PointF pointF = this.LJ;
            float f5 = 2;
            PointF pointF2 = this.LIZIZ;
            float f6 = pointF2.x * f5;
            PointF pointF3 = this.LIZJ;
            pointF.x = f6 - pointF3.x;
            pointF.y = (f5 * pointF2.y) - pointF3.y;
        } else {
            PointF pointF4 = this.LJ;
            PointF pointF5 = this.LIZIZ;
            pointF4.x = pointF5.x;
            pointF4.y = pointF5.y;
        }
        Path path = this.LIZ;
        PointF pointF6 = this.LJ;
        path.cubicTo(pointF6.x, pointF6.y, f, f2, f3, f4);
        PointF pointF7 = this.LIZJ;
        pointF7.x = f;
        pointF7.y = f2;
        PointF pointF8 = this.LIZIZ;
        pointF8.x = f3;
        pointF8.y = f4;
    }

    public final void LIZLLL(float f, float f2, boolean z, boolean z2, float f3, float f4) {
        Path path = this.LIZ;
        PointF pointF = this.LIZIZ;
        LJI(path, pointF.x, pointF.y, f3, f4, f, f2, 0.0f, z, z2);
        PointF pointF2 = this.LIZIZ;
        pointF2.x = f3;
        pointF2.y = f4;
        PointF pointF3 = this.LIZJ;
        pointF3.x = f3;
        pointF3.y = f4;
    }

    public final void LJFF(float f, float f2, float f3, float f4, float f5, float f6) {
        this.LIZ.cubicTo(f, f2, f3, f4, f5, f6);
        PointF pointF = this.LIZJ;
        pointF.x = f3;
        pointF.y = f4;
        PointF pointF2 = this.LIZIZ;
        pointF2.x = f5;
        pointF2.y = f6;
    }

    public final void LJIIJ(float f, float f2, boolean z, boolean z2, float f3, float f4) {
        PointF pointF = this.LIZIZ;
        float f5 = pointF.x;
        float f6 = f3 + f5;
        float f7 = pointF.y;
        float f8 = f4 + f7;
        LJI(this.LIZ, f5, f7, f6, f8, f, f2, 0.0f, z, z2);
        PointF pointF2 = this.LIZIZ;
        pointF2.x = f6;
        pointF2.y = f8;
        PointF pointF3 = this.LIZJ;
        pointF3.x = f6;
        pointF3.y = f8;
    }

    public final void LJIIJJI(float f, float f2, float f3, float f4, float f5, float f6) {
        this.LIZ.rCubicTo(f, f2, f3, f4, f5, f6);
        PointF pointF = this.LIZJ;
        PointF pointF2 = this.LIZIZ;
        pointF.x = pointF2.x + f3;
        pointF.y = pointF2.y + f4;
        pointF2.x += f5;
        pointF2.y += f6;
    }

    public static void LJI(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        boolean z3;
        double d10 = d2;
        double d11 = d;
        double d12 = (d7 / ((double) 180)) * 3.141592653589793d;
        double dCos = Math.cos(d12);
        double dSin = Math.sin(d12);
        double d13 = ((d11 * dCos) + (d10 * dSin)) / d5;
        double d14 = (((-d11) * dSin) + (d10 * dCos)) / d6;
        double d15 = ((d3 * dCos) + (d4 * dSin)) / d5;
        double d16 = (((-d3) * dSin) + (d4 * dCos)) / d6;
        double d17 = d13 - d15;
        double d18 = d14 - d16;
        double d19 = 2;
        double d20 = (d13 + d15) / d19;
        double d21 = (d14 + d16) / d19;
        double d22 = (d17 * d17) + (d18 * d18);
        if (d22 == 0.0d) {
            return;
        }
        double d23 = (1.0d / d22) - 0.25d;
        if (d23 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d22) / 1.99999d);
            LJI(path, d11, d10, d3, d4, d5 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d23);
        double d24 = d17 * dSqrt2;
        double d25 = dSqrt2 * d18;
        if (z == z2) {
            d8 = d20 - d25;
            d9 = d21 + d24;
        } else {
            d8 = d20 + d25;
            d9 = d21 - d24;
        }
        double dAtan2 = Math.atan2(d14 - d9, d13 - d8);
        double dAtan22 = Math.atan2(d16 - d9, d15 - d8) - dAtan2;
        if (dAtan22 >= 0.0d) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 != z3) {
            if (dAtan22 > 0.0d) {
                dAtan22 -= 6.283185307179586d;
            } else {
                dAtan22 += 6.283185307179586d;
            }
        }
        double d26 = d8 * d5;
        double d27 = d9 * d6;
        double d28 = (d26 * dCos) - (d27 * dSin);
        double d29 = (d26 * dSin) + (d27 * dCos);
        double d30 = 4;
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * d30) / 3.141592653589793d));
        double dCos2 = Math.cos(d12);
        double dSin2 = Math.sin(d12);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d31 = -d5;
        double d32 = d31 * dCos2;
        double d33 = d6 * dSin2;
        double d34 = (d32 * dSin3) - (d33 * dCos3);
        double d35 = d31 * dSin2;
        double d36 = d6 * dCos2;
        double d37 = (dSin3 * d35) + (dCos3 * d36);
        double d38 = dAtan22 / ((double) iCeil);
        if (iCeil > 0) {
            int i = 0;
            while (true) {
                i++;
                double d39 = dAtan2 + d38;
                double dSin4 = Math.sin(d39);
                double dCos4 = Math.cos(d39);
                double d40 = (d28 + ((d5 * dCos2) * dCos4)) - (d33 * dSin4);
                double d41 = d29 + (d5 * dSin2 * dCos4) + (d36 * dSin4);
                double d42 = (d32 * dSin4) - (d33 * dCos4);
                double d43 = (dSin4 * d35) + (dCos4 * d36);
                double d44 = d39 - dAtan2;
                double dTan = Math.tan(d44 / d19);
                double dSin5 = (Math.sin(d44) * (Math.sqrt(d30 + ((3.0d * dTan) * dTan)) - ((double) 1))) / ((double) 3);
                path.cubicTo((float) (d11 + (d34 * dSin5)), (float) (d10 + (d37 * dSin5)), (float) (d40 - (dSin5 * d42)), (float) (d41 - (dSin5 * d43)), (float) d40, (float) d41);
                if (i < iCeil) {
                    d11 = d40;
                    d10 = d41;
                    dAtan2 = d39;
                    d37 = d43;
                    d34 = d42;
                } else {
                    return;
                }
            }
        }
    }
}
