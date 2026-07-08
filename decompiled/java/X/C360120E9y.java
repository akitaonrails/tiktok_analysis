package X;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: X.0E9y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C360120E9y {
    public static final Bitmap LIZ(Bitmap bitmap, Float f, Float f2) {
        int iFloatValue;
        int iFloatValue2;
        int iMin;
        if (f != null) {
            f.floatValue();
            if (f.floatValue() <= 0.0f) {
                return bitmap;
            }
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float f3 = width;
            float f4 = height;
            if (f3 / f4 > f.floatValue()) {
                iFloatValue2 = (int) (f4 * f.floatValue());
                iFloatValue = height;
            } else {
                iFloatValue = (int) (f3 / f.floatValue());
                iFloatValue2 = width;
            }
            int i = (width - iFloatValue2) / 2;
            if (f2 == null) {
                iMin = (height - iFloatValue) / 2;
            } else {
                int i2 = height - iFloatValue;
                iMin = Math.min(i2 / 2, (int) (((double) i2) * (0.5d - ((double) f2.floatValue()))));
            }
            return Bitmap.createBitmap(bitmap, i, iMin, iFloatValue2, iFloatValue);
        }
        return bitmap;
    }
}
