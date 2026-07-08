package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import java.util.Map;

/* JADX INFO: renamed from: X.0jho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1291220jho implements InterfaceC1291910jiv {
    public static final Bitmap.Config FALLBACK_BITMAP_CONFIGURATION = Bitmap.Config.ARGB_8888;

    @Override // X.InterfaceC1291910jiv
    public String getName() {
        return "Unknown postprocessor";
    }

    @Override // X.InterfaceC1291910jiv
    public InterfaceC1324680kZm getPostprocessorCacheKey() {
        return null;
    }

    public void process(Bitmap bitmap) {
    }

    public static void internalCopyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap.getConfig() == bitmap2.getConfig()) {
            Bitmaps.copyBitmap(bitmap, bitmap2);
        } else {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // X.InterfaceC1291910jiv
    public C1323050kX9<Bitmap> process(Bitmap bitmap, AbstractC1301670jyf abstractC1301670jyf) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = FALLBACK_BITMAP_CONFIGURATION;
        }
        C1323050kX9<Bitmap> c1323050kX9LJFF = abstractC1301670jyf.LJFF(width, height, config);
        try {
            process(c1323050kX9LJFF.get(), bitmap);
            C1323050kX9<Bitmap> c1323050kX9LJFF2 = C1323050kX9.LJFF(c1323050kX9LJFF);
            C1323050kX9.LJII(c1323050kX9LJFF);
            return c1323050kX9LJFF2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1323050kX9.LJII(c1323050kX9LJFF);
            throw th;
        }
    }

    public void process(Bitmap bitmap, Bitmap bitmap2) {
        internalCopyBitmap(bitmap, bitmap2);
        process(bitmap);
    }

    public C1323050kX9<Bitmap> process(Bitmap bitmap, AbstractC1301670jyf abstractC1301670jyf, Map<String, String> map) {
        return process(bitmap, abstractC1301670jyf);
    }
}
