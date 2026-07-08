package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: renamed from: X.0GZ0, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GZ0 {
    public static final Bitmap LIZ(int i, String str) {
        Paint paint = new Paint(1);
        paint.setTextSize(i);
        paint.setColor(-16777216);
        paint.setTextAlign(Paint.Align.LEFT);
        float f = -paint.ascent();
        int iMeasureText = (int) (paint.measureText(str) + 0.5f);
        int iDescent = (int) (paint.descent() + f + 0.5f);
        if (iMeasureText > 0 && iDescent > 0) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMeasureText, iDescent, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.eraseColor(0);
            new Canvas(bitmapCreateBitmap).drawText(str, 0.0f, f, paint);
            return bitmapCreateBitmap;
        }
        return null;
    }
}
