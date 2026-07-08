package X;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: X.0eRJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class InterpolatorC1088790eRJ implements Interpolator {
    public final PointF LIZ;
    public final PointF LIZIZ;

    public static float LIZ(float f, float f2, float f3) {
        if (f == 0.0f || f == 1.0f) {
            return f;
        }
        float f4 = ((f2 - 0.0f) * f) + 0.0f;
        float f5 = f2 + ((f3 - f2) * f);
        float f6 = f4 + ((f5 - f4) * f);
        return f6 + (((f5 + (((f3 + ((1.0f - f3) * f)) - f5) * f)) - f6) * f);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2;
        float f3 = 0.0f;
        if (f > 0.0f) {
            if (f >= 1.0f) {
                f3 = 1.0f;
            } else {
                float fLIZ = 0.0f;
                float f4 = 1.0f;
                f3 = f;
                float f5 = 0.0f;
                for (int i = 0; i < 8; i++) {
                    fLIZ = LIZ(f3, this.LIZ.x, this.LIZIZ.x);
                    double dLIZ = (LIZ(f3 + 1.0E-6f, this.LIZ.x, this.LIZIZ.x) - fLIZ) / 1.0E-6f;
                    float f6 = fLIZ - f;
                    if (Math.abs(f6) < 1.0E-6f) {
                        break;
                    }
                    if (Math.abs(dLIZ) < 9.999999974752427E-7d) {
                        break;
                    }
                    if (fLIZ < f) {
                        f5 = f3;
                    } else {
                        f4 = f3;
                    }
                    f3 = (float) (((double) f3) - (((double) f6) / dLIZ));
                }
                for (int i2 = 0; Math.abs(fLIZ - f) > 1.0E-6f && i2 < 8; i2++) {
                    if (fLIZ < f) {
                        f2 = (f3 + f4) / 2.0f;
                        f5 = f3;
                    } else {
                        f2 = (f3 + f5) / 2.0f;
                        f4 = f3;
                    }
                    f3 = f2;
                    fLIZ = LIZ(f3, this.LIZ.x, this.LIZIZ.x);
                }
            }
        }
        return LIZ(f3, this.LIZ.y, this.LIZIZ.y);
    }

    public InterpolatorC1088790eRJ(PointF pointF, PointF pointF2) {
        float f = pointF.x;
        if (f >= 0.0f && f <= 1.0f) {
            float f2 = pointF2.x;
            if (f2 >= 0.0f && f2 <= 1.0f) {
                this.LIZ = pointF;
                this.LIZIZ = pointF2;
                new PointF();
                new PointF();
                new PointF();
                return;
            }
            throw new RuntimeException("endX should be in [0, 1]");
        }
        throw new RuntimeException("startX should be in [0, 1]");
    }

    public InterpolatorC1088790eRJ(double d, double d2, double d3, double d4) {
        this(new PointF((float) d, (float) d2), new PointF((float) d3, (float) d4));
    }

    public InterpolatorC1088790eRJ(float f, float f2, float f3, float f4) {
        this(new PointF(f, f2), new PointF(f3, f4));
    }
}
