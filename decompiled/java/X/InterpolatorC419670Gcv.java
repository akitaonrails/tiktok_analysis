package X;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: X.0Gcv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class InterpolatorC419670Gcv implements Interpolator {
    public int LIZ;
    public final PointF LIZIZ = new PointF();
    public final PointF LIZJ = new PointF();

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        double d;
        int i = this.LIZ;
        float f2 = f;
        while (true) {
            d = 1.0d;
            if (i >= 4096) {
                break;
            }
            f2 = (i * 1.0f) / 4096.0f;
            double d2 = f2;
            double d3 = 1.0d - d2;
            double d4 = d2 * d2;
            double d5 = d3 * d3;
            if ((d5 * d3 * 0.0d) + (d5 * 3.0d * d2 * ((double) this.LIZIZ.x)) + (d3 * 3.0d * d4 * ((double) this.LIZJ.x)) + (d4 * d2 * 1.0d) >= f) {
                this.LIZ = i;
                break;
            }
            i++;
        }
        double d6 = f2;
        double d7 = 1.0d - d6;
        double d8 = d6 * d6;
        double d9 = d7 * d7;
        double d10 = (d9 * d7 * 0.0d) + (d9 * 3.0d * d6 * ((double) this.LIZIZ.y)) + (d7 * 3.0d * d8 * ((double) this.LIZJ.y)) + (d8 * d6 * 1.0d);
        if (d10 > 0.999d) {
            this.LIZ = 0;
        } else {
            d = d10;
        }
        return (float) d;
    }
}
