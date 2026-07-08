package X;

import Y.ARunnableS78S0200000_9;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0oSw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1474200oSw {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(final View view, final boolean z, final Function1 function1) {
        Bitmap.Config config;
        SurfaceHolder holder;
        Surface surface;
        Bitmap bitmapLJ = null;
        if (view instanceof C1473870oSP) {
            TextureView textureView = (TextureView) view;
            if (textureView != null) {
                Bitmap bitmap = textureView.getBitmap();
                if (bitmap == null) {
                    if (z) {
                        C786410Ut5.LJLIIL(100L, C1475000oUE.LJ, new ARunnableS78S0200000_9(view, (View) function1, (Function1<? super Bitmap, Unit>) 1));
                        return;
                    } else {
                        function1.invoke(null);
                        return;
                    }
                }
                function1.invoke(bitmap);
                return;
            }
            return;
        }
        if (view instanceof SurfaceView) {
            SurfaceView surfaceView = (SurfaceView) view;
            if (surfaceView == null) {
                return;
            }
            int i = Build.VERSION.SDK_INT;
            if (i == 28) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.RGB_565;
            }
            final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
            if (i < 24 || (holder = surfaceView.getHolder()) == null || (surface = holder.getSurface()) == null || !surface.isValid() || bitmapCreateBitmap == null) {
                return;
            }
            try {
                C1322890kWt.LIZJ(surfaceView, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: X.0N4O
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(int i2) {
                        if (i2 == 0) {
                            function1.invoke(bitmapCreateBitmap);
                        } else if (z) {
                            C786410Ut5.LJLIIL(100L, C1475000oUE.LJ, new ARunnableS78S0200000_9(view, (View) function1, (Function1<? super Bitmap, Unit>) 2));
                        } else {
                            function1.invoke(bitmapCreateBitmap);
                        }
                    }
                }, C1475000oUE.LJ, CertProviderManagerKt.findCert("bpea-pause_panel_screen_shot", 1476435978));
                return;
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
                function1.invoke(null);
                return;
            }
        }
        if (view != null) {
            view.destroyDrawingCache();
            view.buildDrawingCache();
            try {
                bitmapLJ = C842150X1x.LJ(view, false, CertProviderManagerKt.findCert("bpea-pause_panel_view_screen_shot", 1476435978));
            } catch (C838130WuJ e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        function1.invoke(bitmapLJ);
    }
}
