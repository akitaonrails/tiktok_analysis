package X;

import android.animation.TypeEvaluator;
import android.graphics.PointF;

/* JADX INFO: renamed from: X.0Gd0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419720Gd0 implements TypeEvaluator<PointF> {
    public final PointF LIZ;

    public C419720Gd0(PointF pointF) {
        this.LIZ = pointF;
    }

    @Override // android.animation.TypeEvaluator
    public final PointF evaluate(float f, PointF pointF, PointF pointF2) {
        PointF pointF3 = pointF;
        PointF pointF4 = pointF2;
        PointF pointF5 = new PointF();
        float f2 = 1.0f - f;
        double d = f2;
        float f3 = 2.0f * f * f2;
        float f4 = f * f;
        pointF5.x = (float) ((Math.pow(d, 2.0d) * ((double) pointF3.x)) + ((double) (this.LIZ.x * f3)) + ((double) (pointF4.x * f4)));
        pointF5.y = (float) ((Math.pow(d, 2.0d) * ((double) pointF3.y)) + ((double) (f3 * this.LIZ.y)) + ((double) (f4 * pointF4.y)));
        return pointF5;
    }
}
