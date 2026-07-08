package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.0GRp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C415670GRp {
    public static final PointF LIZ = new PointF(2.4492173f, 0.0f);
    public static final PointF LIZIZ = new PointF(14.759765f, 7.3271484f);
    public static final PointF LIZJ = new PointF(1.2695299f, 7.8310547f);
    public static final PointF LIZLLL = new PointF(1.7695299f, 5.3291016f);
    public static final PointF LJ = new PointF(9.620108f, 7.3271484f);
    public static final PointF LJFF = new PointF(4.7684913f, 8.293479f);
    public static final PointF LJI = new PointF(0.2781701f, 7.69992f);
    public static final PointF LJII = new PointF(-1.2304956f, 6.8289413f);
    public static final PointF LJIIIIZZ = new PointF(4.597634f, 3.9153214f);
    public static final PointF LJIIIZ = new PointF(3.6178417f, 2.2497797f);

    public static final PointF LIZIZ(float f, float f2, float f3, PointF pointF) {
        return new PointF(f + (pointF.x * f2), f3 + (pointF.y * f2));
    }

    public static Path LIZ(float f, float f2, float f3, float f4, float f5, boolean z) {
        float fMin = Math.min(14.0f * f5, (f4 - f2) / 2.0f);
        float f6 = ((-0.7597656f) * f5) + f;
        PointF pointF = LIZIZ;
        float f7 = f4 - (pointF.y * f5);
        PointF pointFLIZIZ = LIZIZ(f6, f5, f7, LIZ);
        PointF pointFLIZIZ2 = LIZIZ(f6, f5, f7, pointF);
        PointF pointFLIZIZ3 = LIZIZ(f6, f5, f7, LIZJ);
        PointF pointFLIZIZ4 = LIZIZ(f6, f5, f7, LIZLLL);
        PointF pointFLIZIZ5 = LIZIZ(f6, f5, f7, LJ);
        PointF pointFLIZIZ6 = LIZIZ(f6, f5, f7, LJFF);
        PointF pointFLIZIZ7 = LIZIZ(f6, f5, f7, LJI);
        PointF pointFLIZIZ8 = LIZIZ(f6, f5, f7, LJII);
        PointF pointFLIZIZ9 = LIZIZ(f6, f5, f7, LJIIIIZZ);
        PointF pointFLIZIZ10 = LIZIZ(f6, f5, f7, LJIIIZ);
        float degrees = (float) Math.toDegrees(Math.atan2(pointFLIZIZ.y - r4, pointFLIZIZ.x - r10));
        Path path = new Path();
        path.moveTo(f + fMin, f2);
        path.lineTo(f3 - fMin, f2);
        float f8 = 2 * fMin;
        float f9 = f3 - f8;
        float f10 = f2 + f8;
        path.arcTo(new RectF(f9, f2, f3, f10), -90.0f, 90.0f, false);
        path.lineTo(f3, f4 - fMin);
        float f11 = f4 - f8;
        path.arcTo(new RectF(f9, f11, f3, f4), 0.0f, 90.0f, false);
        path.lineTo(pointFLIZIZ2.x, pointFLIZIZ2.y);
        path.cubicTo(pointFLIZIZ5.x, pointFLIZIZ5.y, pointFLIZIZ6.x, pointFLIZIZ6.y, pointFLIZIZ3.x, pointFLIZIZ3.y);
        path.cubicTo(pointFLIZIZ7.x, pointFLIZIZ7.y, pointFLIZIZ8.x, pointFLIZIZ8.y, pointFLIZIZ4.x, pointFLIZIZ4.y);
        path.cubicTo(pointFLIZIZ9.x, pointFLIZIZ9.y, pointFLIZIZ10.x, pointFLIZIZ10.y, pointFLIZIZ.x, pointFLIZIZ.y);
        float f12 = f + f8;
        path.arcTo(new RectF(f, f11, f12, f4), degrees, 180.0f - degrees, false);
        path.lineTo(f, f2 + fMin);
        path.arcTo(new RectF(f, f2, f12, f10), 180.0f, 90.0f, false);
        path.close();
        if (z) {
            Matrix matrix = new Matrix();
            matrix.postScale(-1.0f, 1.0f);
            matrix.postTranslate(f + f3, 0.0f);
            path.transform(matrix);
        }
        return path;
    }
}
