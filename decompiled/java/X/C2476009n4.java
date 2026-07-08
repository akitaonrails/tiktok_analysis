package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;

/* JADX INFO: renamed from: X.09n4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2476009n4 {
    public static final /* synthetic */ int LIZ = 0;

    public static Bitmap LIZ(int i, int i2, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        int iMin = Math.min(bitmapCreateScaledBitmap.getWidth(), bitmapCreateScaledBitmap.getHeight());
        int width = (bitmapCreateScaledBitmap.getWidth() - iMin) / 2;
        int height = (bitmapCreateScaledBitmap.getHeight() - iMin) / 2;
        Rect rect = new Rect(width, height, width + iMin, height + iMin);
        Rect rect2 = new Rect(0, 0, iMin, iMin);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        float f = iMin / 2.0f;
        canvas.drawCircle(f, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmapCreateScaledBitmap, rect, rect2, paint);
        return bitmapCreateBitmap;
    }
}
