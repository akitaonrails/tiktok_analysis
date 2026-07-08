package X;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0oLf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class RunnableC1469690oLf implements Runnable {
    public final /* synthetic */ C1472250oPn LL;

    public final void LIZ() throws Throwable {
        Surface surface;
        C1472250oPn c1472250oPn = this.LL;
        Surface surface2 = c1472250oPn.LLJILJIL;
        if (surface2 != null) {
            surface = surface2;
        } else {
            surface = c1472250oPn.LLJIJIL;
            if (surface == null) {
                return;
            }
        }
        View viewLIZIZ = surface == surface2 ? C1471640oOo.LIZIZ(surface) : surface == c1472250oPn.LLJIJIL ? C1471640oOo.LIZJ(surface) : null;
        if (!surface.isValid() || viewLIZIZ == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(viewLIZIZ.getWidth(), viewLIZIZ.getHeight(), Bitmap.Config.RGB_565);
        C2204961BRm.LLILL(surface, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: X.0oLg
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                RunnableC1469690oLf runnableC1469690oLf = this.LIZ;
                Bitmap bitmap = bitmapCreateBitmap;
                if (i == 0) {
                    runnableC1469690oLf.LL.getClass();
                    int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i3 < iMin) {
                            if (bitmap.getPixel(i3, i3) != -16777216) {
                                break;
                            } else {
                                i3++;
                            }
                        } else {
                            i2 = 1;
                            break;
                        }
                    }
                    C1472150oPd c1472150oPd = runnableC1469690oLf.LL.LLILZIL;
                    if (c1472150oPd != null) {
                        c1472150oPd.LIZJ(4033, i2);
                        return;
                    }
                    return;
                }
                runnableC1469690oLf.getClass();
            }
        }, new BPEAHandler(Looper.getMainLooper()), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqkYobLznyDromBCVaxSKCvnrdDO/l6+A==", null));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("TTPlayer@13ee.doDetectBlack$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTPlayer@13ee.doDetectBlack$1");
    }

    public RunnableC1469690oLf(C1472250oPn c1472250oPn) {
        this.LL = c1472250oPn;
    }
}
