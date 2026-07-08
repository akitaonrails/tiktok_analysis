package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.text.TextPaint;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import lth.o;

/* JADX INFO: renamed from: X.0HIj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C438750HIj {
    public static final C438750HIj LIZ = new C438750HIj();

    public static Point LIZ(int i, int i2) {
        float f = i / i2;
        if (f < 0.8f) {
            i2 = ((int) ((i2 - i) / 2)) + i;
        } else if (f > 1.0f || f <= 0.8f) {
            if (f > 1.0f) {
                i = ((int) ((i - i2) / 2)) + i2;
            } else {
                i = 0;
                i2 = 0;
            }
        }
        return new Point(i, i2);
    }

    public static Bitmap LIZIZ(int i, int i2, String str, boolean z) {
        int i3;
        int i4;
        float f;
        float f2 = i / 750.0f;
        float f3 = i2 / 750.0f;
        if (f2 > f3) {
            f2 = f3;
        }
        Resources resources = o.LIZ.getResources();
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTypeface(C1697580uHE.LIZIZ(0.0f, 400, 17.0f, 0.0f, Float.valueOf(16.0f), 0.0f, 0, null, 224));
        textPaint.setColor(C1383370m6R.LJFF(R.attr.ee));
        float f4 = 28 * f2;
        textPaint.setTextSize(f4);
        float f5 = 4 * f2;
        textPaint.setShadowLayer(f5, 0.0f, f2, C1383370m6R.LJFF(R.attr.zb));
        int i5 = (int) f4;
        int iMeasureText = (int) textPaint.measureText(str);
        if (z) {
            i3 = i5;
        } else {
            i3 = 0;
        }
        float f6 = i3 + i5 + i5 + iMeasureText + f5;
        int i6 = (int) (32 * f2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) f6, i6, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        if (C438760HIk.LIZ()) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_color_tiktok_logo_light;
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(o.LIZ);
            int i7 = (i6 - i5) / 2;
            tuxIconDrawableLIZ.setBounds(0, i7, i5, i7 + i5);
            tuxIconDrawableLIZ.draw(canvas);
            i4 = 2;
        } else {
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, R.drawable.aa6, null);
            if (bitmapDecodeResource != null) {
                i4 = 2;
                canvas.drawBitmap(Bitmap.createScaledBitmap(bitmapDecodeResource, i5, i5, true), 0.0f, (i6 - i5) / 2, paint);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (z) {
            float f7 = i5;
            canvas.drawBitmap(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(resources, R.drawable.aad, null), i5, i5, true), f7, (i6 - f7) / i4, paint);
        }
        Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(resources, R.drawable.a_p, null);
        if (bitmapDecodeResource2 != null) {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeResource2, i5, i5, true);
            float f8 = i5;
            if (z) {
                f = f8;
            } else {
                f = (i4 * f2) + 0.0f;
            }
            float f9 = f + f8;
            float f10 = i6 - f8;
            float f11 = i4;
            canvas.drawBitmap(bitmapCreateScaledBitmap, f9, f10 / f11, paint);
            canvas.drawText(str, f6 - iMeasureText, (i6 / i4) - ((textPaint.descent() + textPaint.ascent()) / f11), textPaint);
            return bitmapCreateBitmap;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
