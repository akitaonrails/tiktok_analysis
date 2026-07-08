package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.ies.cutsame.util.Size;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.19qZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21664919qZ {
    public static final /* synthetic */ int LIZ = 0;

    public static C21666819qs LJ(RectF rectF, RectF rectF2) {
        float fWidth = rectF2.width() / rectF.width();
        rectF2.height();
        rectF.height();
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        return new C21666819qs(fWidth, 0.0f, rectF2.centerX() - fCenterX, rectF2.centerY() - fCenterY);
    }

    public static List LJFF(RectF rectF, float f) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f, rectF.centerX(), rectF.centerY());
        float f2 = rectF.left;
        float f3 = rectF.top;
        float f4 = rectF.right;
        float f5 = rectF.bottom;
        float[] fArr = {f2, f3, f4, f3, f2, f5, f4, f5};
        matrix.mapPoints(fArr);
        return C1697810uHb.LJIIJJI(new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3]), new PointF(fArr[4], fArr[5]), new PointF(fArr[6], fArr[7]));
    }

    public static boolean LJI(List list, RectF rectF) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            PointF pointF = (PointF) it2.next();
            float f = pointF.x;
            if (f >= rectF.left && f <= rectF.right) {
                float f2 = pointF.y;
                if (f2 < rectF.top || f2 > rectF.bottom) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static float LIZJ(RectF rectF, RectF rectF2, Size size) {
        float f = size.width / size.height;
        if (!C1441960ncw.LIZ()) {
            float fWidth = rectF2.width() / rectF.width();
            float fWidth2 = rectF2.width() / rectF2.height();
            if (fWidth2 < f) {
                return (fWidth * f) / fWidth2;
            }
            return fWidth;
        }
        float fWidth3 = rectF.width() / rectF.height();
        float fWidth4 = rectF2.width() / rectF2.height();
        if (fWidth3 > f) {
            float fWidth5 = rectF2.width() / rectF.width();
            if (fWidth4 >= f) {
                return fWidth5;
            }
            return (fWidth5 * f) / fWidth4;
        }
        float fHeight = rectF2.height() / rectF.height();
        if (fWidth4 < f) {
            return fHeight;
        }
        return (fHeight * fWidth4) / f;
    }

    public static C21666819qs LIZLLL(RectF rectF, RectF rectF2, Size size) {
        float fCenterX;
        float fHeight;
        float fCenterY;
        float fHeight2;
        float fWidth = rectF.width() / rectF.height();
        float f = size.width / size.height;
        if (!C1441960ncw.LIZ() || fWidth > f) {
            fCenterX = rectF2.centerX() - rectF.centerX();
            fHeight = rectF.width();
        } else {
            fCenterX = rectF2.centerX() - rectF.centerX();
            fHeight = rectF.height() * (size.width / size.height);
        }
        float f2 = fCenterX / fHeight;
        if (!C1441960ncw.LIZ() || fWidth > f) {
            fCenterY = rectF2.centerY() - rectF.centerY();
            float fWidth2 = rectF.width();
            float f3 = size.width;
            int i = size.height;
            fHeight2 = fWidth2 / (f3 / i);
            return new C21666819qs(1.0f, 0.0f, f2, fCenterY / fHeight2);
        }
        fCenterY = rectF2.centerY() - rectF.centerY();
        fHeight2 = rectF.height();
        return new C21666819qs(1.0f, 0.0f, f2, fCenterY / fHeight2);
    }

    public static float LIZ(float f, RectF rectF, RectF rectF2, Size size) {
        float f2 = size.width / size.height;
        float fWidth = f * rectF.width();
        float fWidth2 = rectF2.width() / rectF2.height();
        if (fWidth2 < f2) {
            fWidth = (fWidth * fWidth2) / f2;
        }
        return fWidth / rectF2.width();
    }

    public static float LIZIZ(List list, RectF rectF, float f, float f2) {
        Iterator it2 = list.iterator();
        float fMax = 1.0f;
        while (it2.hasNext()) {
            PointF pointF = (PointF) it2.next();
            float f3 = pointF.x;
            float f4 = rectF.left;
            if (f3 < f4) {
                fMax = Math.max(fMax, (f3 - f) / (f4 - f));
            }
            float f5 = pointF.x;
            float f6 = rectF.right;
            if (f5 > f6) {
                fMax = Math.max(fMax, (f5 - f) / (f6 - f));
            }
            float f7 = pointF.y;
            float f8 = rectF.top;
            if (f7 < f8) {
                fMax = Math.max(fMax, (f7 - f2) / (f8 - f2));
            }
            float f9 = pointF.y;
            float f10 = rectF.bottom;
            if (f9 > f10) {
                fMax = Math.max(fMax, (f9 - f2) / (f10 - f2));
            }
        }
        return fMax;
    }
}
