package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Z1c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C892900Z1c {
    public static final /* synthetic */ int LIZ = 0;

    public static float[] LIZ(int i, int i2, Bitmap bitmap) {
        int i3 = i * i2;
        int[] iArr = new int[i3];
        SystemClock.uptimeMillis();
        bitmap.getPixels(iArr, 0, i, 0, 0, i, i2);
        SystemClock.uptimeMillis();
        float[] fArr = new float[i3 * 3];
        SystemClock.uptimeMillis();
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = iArr[i5];
            int i7 = i4 + 1;
            fArr[i4] = i6 & 255;
            int i8 = i7 + 1;
            fArr[i7] = (i6 >>> 8) & 255;
            i4 = i8 + 1;
            fArr[i8] = (i6 >>> 16) & 255;
        }
        return fArr;
    }

    public static Pair LIZJ(Bitmap bitmap, int i, int i2, int i3, boolean z, boolean z2) {
        int i4;
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        if (!z2) {
            return new Pair(Bitmap.createScaledBitmap(bitmap, i, i2, true), Float.valueOf(((i / width) + (i2 / height)) / 2));
        }
        float f = i;
        float f2 = width;
        float f3 = i2;
        float f4 = height;
        float fMin = Math.min(f / f2, f3 / f4);
        int i5 = (int) (f2 * fMin);
        int i6 = (int) (f4 * fMin);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setColor(i3);
        canvas.drawRect(0.0f, 0.0f, f, f3, paint);
        int i7 = 0;
        if (z) {
            i4 = (i - i5) / 2;
            i7 = (i2 - i6) / 2;
        } else {
            i4 = 0;
        }
        canvas.drawBitmap(Bitmap.createScaledBitmap(bitmap, i5, i6, true), i4, i7, (Paint) null);
        return new Pair(bitmapCreateBitmap, Float.valueOf(fMin));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float[] LIZIZ(android.graphics.Bitmap r19, com.tiktok.clientai.android.bitmap.NormalizationType r20, float r21, X.C443120HZe r22, X.C443120HZe r23, com.tiktok.clientai.android.bitmap.OutputFormat r24, com.tiktok.clientai.android.bitmap.ColorSeq r25) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C892900Z1c.LIZIZ(android.graphics.Bitmap, com.tiktok.clientai.android.bitmap.NormalizationType, float, X.0HZe, X.0HZe, com.tiktok.clientai.android.bitmap.OutputFormat, com.tiktok.clientai.android.bitmap.ColorSeq):float[]");
    }
}
