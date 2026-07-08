package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;

/* JADX INFO: renamed from: X.0GZ9, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GZ9 {
    public static final Bitmap LIZ(Bitmap bitmap, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4, float f) {
        float fAbs = Math.abs(pointF3.x - pointF.x);
        float fAbs2 = Math.abs(pointF4.x - pointF2.x);
        float fAbs3 = Math.abs(pointF2.y - pointF.y);
        float fAbs4 = Math.abs(pointF4.y - pointF3.y);
        if (fAbs < fAbs2) {
            fAbs = fAbs2;
        }
        int i = (int) fAbs;
        if (fAbs3 < fAbs4) {
            fAbs3 = fAbs4;
        }
        int i2 = (int) fAbs3;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Matrix matrix = new Matrix();
        float f2 = i;
        float f3 = i2;
        matrix.setPolyToPoly(new float[]{pointF.x, pointF.y, pointF3.x, pointF3.y, pointF2.x, pointF2.y, pointF4.x, pointF4.y}, 0, new float[]{0.0f, 0.0f, f2, 0.0f, 0.0f, f3, f2, f3}, 0, 4);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, matrix, null);
        Matrix matrix2 = new Matrix();
        matrix2.postRotate(f);
        return Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix2, true);
    }
}
