package X;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: X.09Io, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2349609Io {
    public static Bitmap LIZ(float f, Bitmap bitmap) {
        float f2;
        int i;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width >= 100 && height >= 100) {
            if (width >= 200 && height >= 200) {
                f2 = 0.1f;
            } else {
                f2 = 0.3f;
            }
        } else {
            f2 = 0.6f;
        }
        int iRound = Math.round(width * f2);
        int iRound2 = Math.round(height * f2);
        boolean z = false;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, iRound, iRound2, false);
        if (f == 0.0f) {
            z = true;
        }
        if (!z) {
            float f3 = iRound;
            float f4 = iRound2;
            if (Math.abs((f3 / f4) - 5) > 0.2f) {
                int i2 = (int) (f3 / f);
                if (i2 > iRound2) {
                    i = (int) (f4 * f);
                    i2 = iRound2;
                } else {
                    i = iRound;
                }
                if (i > 0 && i2 > 0) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap, (iRound - i) >> 1, (iRound2 - i2) >> 1, i, i2);
                    C786410Ut5.LJJJJ(bitmapCreateScaledBitmap);
                    bitmapCreateScaledBitmap = bitmapCreateBitmap;
                    iRound2 = i2;
                    iRound = i;
                } else {
                    return null;
                }
            }
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iRound, iRound2, Bitmap.Config.ARGB_8888);
        C2349509In.LIZ(bitmapCreateScaledBitmap, bitmapCreateBitmap2, 5);
        C786410Ut5.LJJJJ(bitmapCreateScaledBitmap);
        return bitmapCreateBitmap2;
    }
}
