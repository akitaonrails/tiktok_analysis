package X;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: renamed from: X.0I7W, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I7W implements InterfaceC1331800klG {
    public final int LIZ;
    public final float LIZIZ;
    public final Context LIZJ;

    @Override // X.InterfaceC1331800klG
    public final String getKey() {
        return "blur-transform-effect";
    }

    @Override // X.InterfaceC1331800klG
    public final InterfaceC1332090klj LIZIZ(Bitmap bitmap, C0I7N c0i7n) {
        Bitmap bitmapCopy;
        int i;
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config != config2) {
            bitmapCopy = bitmap.copy(config2, true);
        } else {
            bitmapCopy = bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int iLIZIZ = C814420VxA.LIZIZ(width * this.LIZIZ);
        int iLIZIZ2 = C814420VxA.LIZIZ(height * this.LIZIZ);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCopy, iLIZIZ, iLIZIZ2, false);
        if (this.LIZIZ != 0.0f) {
            float f = iLIZIZ;
            float f2 = iLIZIZ2;
            if (Math.abs((f / f2) - this.LIZ) > 0.2f) {
                float f3 = this.LIZIZ;
                int i2 = (int) (f / f3);
                if (i2 > iLIZIZ2) {
                    i = (int) (f2 * f3);
                    i2 = iLIZIZ2;
                } else {
                    i = iLIZIZ;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap, (iLIZIZ - i) >> 1, (iLIZIZ2 - i2) >> 1, i, i2);
                C786410Ut5.LJJJJ(bitmapCreateScaledBitmap);
                bitmapCreateScaledBitmap = bitmapCreateBitmap;
                iLIZIZ = i;
                iLIZIZ2 = i2;
            }
        }
        C1331870klN c1331870klNLIZ = ((C1331760klC) c0i7n).LIZ(iLIZIZ, iLIZIZ2, Bitmap.Config.ARGB_8888);
        C1100030ejR.LIZ(this.LIZ, this.LIZJ, bitmapCreateScaledBitmap, c1331870klNLIZ.getBitmap());
        C786410Ut5.LJJJJ(bitmapCreateScaledBitmap);
        return c1331870klNLIZ;
    }

    public C0I7W(float f, int i, Context context) {
        this.LIZ = i;
        this.LIZIZ = f;
        this.LIZJ = C786410Ut5.N3(context);
    }

    @Override // X.InterfaceC1331800klG
    public final InterfaceC1332090klj LIZ(Bitmap bitmap, C0I7N c0i7n, Map map) {
        return LIZIZ(bitmap, c0i7n);
    }
}
