package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: renamed from: X.0GZ1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GZ1 {
    public static final /* synthetic */ int LIZ = 0;

    public static Bitmap LIZ(String str) {
        Bitmap.Config config;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        Bitmap bitmapLIZIZ = LIZIZ(iLIZIZ, str);
        int i = iLIZIZ + (iLIZIZ2 * 2);
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15));
        if (i > 0) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint(1);
            paint.setColor(-1);
            float f = i / 2.0f;
            canvas.drawCircle(f, f, f, paint);
            float f2 = i - (iLIZIZ3 / 2);
            canvas.drawCircle(f2, f2, iLIZIZ3 / 2.0f, paint);
            if (bitmapCreateBitmap != null && bitmapLIZIZ != null && (config = bitmapCreateBitmap.getConfig()) != null) {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), config);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                canvas2.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
                canvas2.drawBitmap(bitmapLIZIZ, (bitmapCreateBitmap.getWidth() - bitmapLIZIZ.getWidth()) / 2.0f, (bitmapCreateBitmap.getHeight() - bitmapLIZIZ.getHeight()) / 2.0f, (Paint) null);
                return bitmapCreateBitmap2;
            }
        }
        return null;
    }

    public static Bitmap LIZIZ(int i, String str) {
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
            return Bitmap.createScaledBitmap(bitmapCreateBitmap, i, i, true);
        }
        return null;
    }
}
