package X;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: X.0Ger, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class InterpolatorC420870Ger implements Interpolator {
    public final PointF LIZ;
    public final PointF LIZIZ;
    public final PointF LIZJ;
    public final PointF LIZLLL;
    public final PointF LJ;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = f;
        for (int i = 1; i < 14; i++) {
            PointF pointF = this.LJ;
            PointF pointF2 = this.LIZ;
            float f3 = pointF2.x * 3.0f;
            pointF.x = f3;
            PointF pointF3 = this.LIZLLL;
            float f4 = ((this.LIZIZ.x - pointF2.x) * 3.0f) - f3;
            pointF3.x = f4;
            PointF pointF4 = this.LIZJ;
            float f5 = (1.0f - pointF.x) - f4;
            pointF4.x = f5;
            float f6 = ((pointF.x + ((pointF3.x + (f5 * f2)) * f2)) * f2) - f;
            if (Math.abs(f6) < 0.001d) {
                break;
            }
            f2 -= f6 / (this.LJ.x + (((this.LIZLLL.x * 2.0f) + ((this.LIZJ.x * 3.0f) * f2)) * f2));
        }
        PointF pointF5 = this.LJ;
        PointF pointF6 = this.LIZ;
        float f7 = pointF6.y * 3.0f;
        pointF5.y = f7;
        PointF pointF7 = this.LIZLLL;
        float f8 = ((this.LIZIZ.y - pointF6.y) * 3.0f) - f7;
        pointF7.y = f8;
        PointF pointF8 = this.LIZJ;
        float f9 = (1.0f - pointF5.y) - f8;
        pointF8.y = f9;
        return f2 * (pointF5.y + ((pointF7.y + (f9 * f2)) * f2));
    }

    public InterpolatorC420870Ger(double d, double d2, double d3) {
        this((float) d, (float) d2, (float) d3, (float) 1.0d);
    }

    public InterpolatorC420870Ger(float f, float f2, float f3, float f4) {
        PointF pointF = new PointF(f, f2);
        PointF pointF2 = new PointF(f3, f4);
        this.LIZJ = new PointF();
        this.LIZLLL = new PointF();
        this.LJ = new PointF();
        float f5 = pointF.x;
        if (f5 >= 0.0f && f5 <= 1.0f) {
            float f6 = pointF2.x;
            if (f6 >= 0.0f && f6 <= 1.0f) {
                this.LIZ = pointF;
                this.LIZIZ = pointF2;
                return;
            }
            throw new IllegalArgumentException("endX value must be in the range [0, 1]");
        }
        throw new IllegalArgumentException("startX value must be in the range [0, 1]");
    }
}
