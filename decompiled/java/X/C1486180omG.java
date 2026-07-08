package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0omG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1486180omG {
    public static final boolean LIZIZ(Context context) {
        String str;
        if (Build.VERSION.SDK_INT >= 33) {
            str = "android.permission.READ_MEDIA_IMAGES";
        } else {
            str = "android.permission.READ_EXTERNAL_STORAGE";
        }
        if (C838410Wul.LIZ(context, str) == 0) {
            return true;
        }
        return false;
    }

    public static final void LIZ(Window window, final Function1<? super Bitmap, Unit> function1) {
        if (window == null) {
            return;
        }
        View decorView = window.getDecorView();
        if (decorView.getWidth() != 0 && decorView.getHeight() != 0) {
            final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(decorView.getWidth(), decorView.getHeight(), Bitmap.Config.ARGB_8888);
            try {
                C1322890kWt.LIZLLL(window, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: X.0omH
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(int i) {
                        if (i == 0) {
                            function1.invoke(bitmapCreateBitmap);
                        } else {
                            function1.invoke(null);
                        }
                    }
                }, new BPEAHandler(Looper.getMainLooper()), CertProviderManagerKt.findCert("bpea-ecom_pdp_sku_screenshot_pixelcopy_request", 1476435994));
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        function1.invoke(null);
    }
}
