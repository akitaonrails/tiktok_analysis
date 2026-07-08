package X;

import android.graphics.RectF;

/* JADX INFO: renamed from: X.0GZ4, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GZ4 {
    public static boolean LIZ(float f, float f2, RectF rectF, float f3) {
        if (Math.abs(f3) <= 0.0f) {
            return rectF.contains(f, f2);
        }
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        double d = -f3;
        float fSin = (float) Math.sin(Math.toRadians(d));
        float fCos = (float) Math.cos(Math.toRadians(d));
        float f4 = f - fCenterX;
        float f5 = f2 - fCenterY;
        return rectF.contains((fCenterX + (f4 * fCos)) - (f5 * fSin), fCenterY + (f5 * fCos) + (f4 * fSin));
    }
}
