package X;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: renamed from: X.121Q, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C121Q {
    public static void LJ(RectF rectF, float f) {
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float f2 = ((f * fWidth) - fWidth) / 2.0f;
        float f3 = ((f * fHeight) - fHeight) / 2.0f;
        rectF.left -= f2;
        rectF.top -= f3;
        rectF.right += f2;
        rectF.bottom += f3;
    }

    public static PointF LIZIZ(float f, float f2, float f3, PointF pointF) {
        if (Math.abs(f3) <= 0.0f) {
            return pointF;
        }
        double d = f3;
        float fCos = (float) (((((double) (pointF.x - f)) * Math.cos(d)) - (((double) (pointF.y - f2)) * Math.sin(d))) + ((double) f));
        float fSin = (float) ((((double) (pointF.x - f)) * Math.sin(d)) + (((double) (pointF.y - f2)) * Math.cos(d)) + ((double) f2));
        pointF.set(fCos, fSin);
        return new PointF(fCos, fSin);
    }

    public static void LIZJ(Point point, float f, float f2, float f3) {
        double d = f3;
        float fSin = (float) Math.sin(Math.toRadians(d));
        float fCos = (float) Math.cos(Math.toRadians(d));
        int i = point.x;
        int i2 = point.y;
        point.set((int) ((((i - f) * fCos) + f) - ((i2 - f2) * fSin)), (int) (f2 + ((i2 - f2) * fCos) + ((i - f) * fSin)));
    }

    public static void LIZLLL(float f, float f2, RectF rectF, float f3) {
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        double d = f3;
        float fSin = (float) Math.sin(Math.toRadians(d));
        float fCos = (float) Math.cos(Math.toRadians(d));
        float f4 = fCenterX - f;
        float f5 = fCenterY - f2;
        rectF.offset(((f + (f4 * fCos)) - (f5 * fSin)) - fCenterX, ((f2 + (f5 * fCos)) + (f4 * fSin)) - fCenterY);
    }

    public static boolean LIZ(float f, float f2, float f3, RectF rectF, float f4) {
        if (rectF == null) {
            return false;
        }
        RectF rectF2 = new RectF(rectF.left - f4, rectF.top - f4, rectF.right + f4, rectF.bottom + f4);
        if (Math.abs(f3) <= 0.0f) {
            return rectF2.contains(f, f2);
        }
        float fCenterX = rectF2.centerX();
        float fCenterY = rectF2.centerY();
        double d = -f3;
        float fSin = (float) Math.sin(Math.toRadians(d));
        float fCos = (float) Math.cos(Math.toRadians(d));
        float f5 = f - fCenterX;
        float f6 = f2 - fCenterY;
        return rectF2.contains((fCenterX + (f5 * fCos)) - (f6 * fSin), fCenterY + (f6 * fCos) + (f5 * fSin));
    }
}
