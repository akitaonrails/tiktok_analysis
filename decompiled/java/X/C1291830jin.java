package X;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: X.0jin, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1291830jin implements InterfaceC1291910jiv {
    public final int LIZ;
    public final float LIZIZ;

    @Override // X.InterfaceC1291910jiv
    public final String getName() {
        return "blurProcessor";
    }

    @Override // X.InterfaceC1291910jiv
    public final InterfaceC1324680kZm getPostprocessorCacheKey() {
        return new C592490NLr("blur_bitmap_processor");
    }

    public C1291830jin(float f) {
        this.LIZIZ = f;
        this.LIZ = 5;
    }

    public C1291830jin(int i, float f) {
        this.LIZIZ = f;
        this.LIZ = i;
    }

    @Override // X.InterfaceC1291910jiv
    public final C1323050kX9<Bitmap> process(Bitmap bitmap, AbstractC1301670jyf abstractC1301670jyf) {
        float f;
        int i;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width >= 100 && height >= 100) {
            if (width >= 200 && height >= 200) {
                f = 0.1f;
            } else {
                f = 0.3f;
            }
        } else {
            f = 0.6f;
        }
        int iRound = Math.round(width * f);
        int iRound2 = Math.round(height * f);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, iRound, iRound2, false);
        if (this.LIZIZ != 0.0f) {
            float f2 = iRound;
            float f3 = iRound2;
            if (Math.abs((f2 / f3) - this.LIZ) > 0.2f) {
                float f4 = this.LIZIZ;
                int i2 = (int) (f2 / f4);
                if (i2 > iRound2) {
                    i = (int) (f3 * f4);
                    i2 = iRound2;
                } else {
                    i = iRound;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap, (iRound - i) >> 1, (iRound2 - i2) >> 1, i, i2);
                C786410Ut5.LJJJJ(bitmapCreateScaledBitmap);
                bitmapCreateScaledBitmap = bitmapCreateBitmap;
                iRound = i;
                iRound2 = i2;
            }
        }
        abstractC1301670jyf.getClass();
        C1323050kX9<Bitmap> c1323050kX9LIZIZ = abstractC1301670jyf.LIZIZ(iRound, iRound2, Bitmap.Config.ARGB_8888, null);
        C2349509In.LIZ(bitmapCreateScaledBitmap, c1323050kX9LIZIZ.get(), this.LIZ);
        C786410Ut5.LJJJJ(bitmapCreateScaledBitmap);
        return c1323050kX9LIZIZ;
    }
}
