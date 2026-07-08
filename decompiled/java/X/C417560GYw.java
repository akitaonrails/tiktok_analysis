package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: renamed from: X.0GYw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417560GYw {
    public static final Bitmap LIZ(Bitmap bitmap, float f) {
        int i;
        int i2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width < height) {
            i2 = (height - width) / 2;
            i = 0;
        } else {
            i = (width - height) / 2;
            width = height;
            i2 = 0;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i, i2, width, width, (Matrix) null, false);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapCreateBitmap, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        float f2 = width;
        RectF rectF = new RectF(0.0f, 0.0f, f2, f2);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap2).drawRoundRect(rectF, f, f, paint);
        return bitmapCreateBitmap2;
    }
}
