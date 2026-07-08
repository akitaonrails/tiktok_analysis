package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.0GTT, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GTT {
    public static RectF LIZIZ(PointF[] pointFArr) {
        PointF pointF = pointFArr[0];
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = f;
        float f4 = f2;
        for (PointF pointF2 : pointFArr) {
            float f5 = pointF2.x;
            if (f5 < f) {
                f = f5;
            }
            if (f5 > f3) {
                f3 = f5;
            }
            float f6 = pointF2.y;
            if (f6 < f2) {
                f2 = f6;
            }
            if (f6 > f4) {
                f4 = f6;
            }
        }
        return new RectF(f, f2, f3, f4);
    }

    public static boolean LIZ(Rect rect, PointF[] pointFArr) {
        boolean z = false;
        if (pointFArr == null || rect == null) {
            return false;
        }
        RectF rectFLIZIZ = LIZIZ(pointFArr);
        if (rectFLIZIZ.right < rect.left) {
            z = true;
        }
        if (rectFLIZIZ.left > rect.right) {
            z = true;
        }
        if (rectFLIZIZ.bottom < rect.top) {
            z = true;
        }
        if (rectFLIZIZ.top > rect.bottom) {
            return true;
        }
        return z;
    }
}
