package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ejW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1100080ejW {
    public static final Bitmap LIZ(int i, int i2, View view) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.setDensity(C2219091BtD.LIZ().getResources().getDisplayMetrics().densityDpi);
            if (view.getDrawingCacheBackgroundColor() != 0) {
                bitmapCreateBitmap.eraseColor(view.getDrawingCacheBackgroundColor());
            }
            C842150X1x.LIZIZ(new Canvas(bitmapCreateBitmap), view);
            return bitmapCreateBitmap;
        } catch (OutOfMemoryError e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
