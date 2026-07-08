package X;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: renamed from: X.0I7V, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I7V implements InterfaceC1331800klG {
    public final Context LIZ;
    public final int LIZIZ;

    @Override // X.InterfaceC1331800klG
    public final String getKey() {
        return "blur-transform";
    }

    public C0I7V(Context context, int i) {
        this.LIZ = context;
        this.LIZIZ = i;
    }

    @Override // X.InterfaceC1331800klG
    public final InterfaceC1332090klj LIZIZ(Bitmap bitmap, C0I7N c0i7n) {
        Bitmap bitmapCopy;
        float f;
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
        if (width >= 100 && height >= 100) {
            if (width >= 200 && height >= 200) {
                f = 0.1f;
            } else {
                f = 0.3f;
            }
        } else {
            f = 0.6f;
        }
        int iLIZIZ = C814420VxA.LIZIZ(width * f);
        int iLIZIZ2 = C814420VxA.LIZIZ(height * f);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCopy, iLIZIZ, iLIZIZ2, false);
        if (f != 0.0f) {
            float f2 = iLIZIZ;
            float f3 = iLIZIZ2;
            if (Math.abs((f2 / f3) - this.LIZIZ) > 0.2f) {
                int i2 = (int) (f2 / f);
                if (i2 > iLIZIZ2) {
                    i = (int) (f3 * f);
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
        C1100030ejR.LIZ(this.LIZIZ, this.LIZ, bitmapCreateScaledBitmap, c1331870klNLIZ.getBitmap());
        C786410Ut5.LJJJJ(bitmapCreateScaledBitmap);
        return c1331870klNLIZ;
    }

    @Override // X.InterfaceC1331800klG
    public final InterfaceC1332090klj LIZ(Bitmap bitmap, C0I7N c0i7n, Map map) {
        return LIZIZ(bitmap, c0i7n);
    }
}
