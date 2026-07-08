package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.bytedance.tux.drawable.TuxIconDrawable;

/* JADX INFO: renamed from: X.0Epp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376710Epp {
    public static Bitmap LIZIZ(TuxIconDrawable tuxIconDrawable) {
        return LIZ(tuxIconDrawable, tuxIconDrawable.LIZJ(), tuxIconDrawable.LIZIZ(), Bitmap.Config.ARGB_8888);
    }

    public static final Bitmap LIZ(Drawable drawable, int i, int i2, Bitmap.Config config) {
        int iMax = Math.max(i, 1);
        int iMax2 = Math.max(i2, 1);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMax, iMax2, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, iMax, iMax2);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }
}
