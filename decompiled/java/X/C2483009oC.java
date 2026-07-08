package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.09oC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2483009oC {
    public static final Bitmap LIZ(Bitmap bitmap, float f) {
        int height;
        float f2 = 1.0f;
        if (bitmap.getWidth() > bitmap.getHeight()) {
            if (bitmap.getWidth() > f) {
                height = bitmap.getWidth();
                f2 = f / height;
            }
        } else if (bitmap.getHeight() > f) {
            height = bitmap.getHeight();
            f2 = f / height;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(f2, f2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Bitmap.Config config = bitmapCreateBitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config != config2) {
            Bitmap bitmapCopy = bitmapCreateBitmap.copy(config2, true);
            bitmapCreateBitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
            return bitmapCopy;
        }
        return bitmapCreateBitmap;
    }
}
