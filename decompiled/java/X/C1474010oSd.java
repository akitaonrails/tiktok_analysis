package X;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0oSd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1474010oSd {
    public static void LIZ(SurfaceView surfaceView, InterfaceC1474030oSf interfaceC1474030oSf) {
        if (surfaceView == null) {
            interfaceC1474030oSf.LIZ(null);
        } else {
            LIZIZ(surfaceView, interfaceC1474030oSf, surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888);
        }
    }

    public static void LIZJ(TextureView textureView, InterfaceC1474030oSf interfaceC1474030oSf) {
        if (textureView == null) {
            interfaceC1474030oSf.LIZ(null);
        } else {
            interfaceC1474030oSf.LIZ(textureView.getBitmap());
        }
    }

    public static void LIZIZ(SurfaceView surfaceView, final InterfaceC1474030oSf interfaceC1474030oSf, int i, int i2, Bitmap.Config config) {
        Surface surfaceLIZJ;
        if (surfaceView == null) {
            interfaceC1474030oSf.LIZ(null);
            return;
        }
        if (surfaceView.getWidth() > 0 && surfaceView.getHeight() > 0) {
            if (Build.VERSION.SDK_INT >= 24) {
                final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
                PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener = new PixelCopy.OnPixelCopyFinishedListener() { // from class: X.0oSe
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(int i3) {
                        if (i3 == 0) {
                            interfaceC1474030oSf.LIZ(bitmapCreateBitmap);
                        } else {
                            interfaceC1474030oSf.LIZ(null);
                        }
                    }
                };
                try {
                    if (C1472280oPq.LIZLLL() && surfaceView.getHolder() != null && surfaceView.getHolder().getSurface() != null) {
                        InterfaceC1472350oPx interfaceC1472350oPxLIZIZ = C1472280oPq.LIZIZ(surfaceView.getHolder().getSurface());
                        if (C1481110oe5.LIZ) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("getBitmap. use surfaceControlSession:");
                            sbLIZ.append(interfaceC1472350oPxLIZIZ);
                            C1481110oe5.LIZIZ("GetVideoFrameUtil", C2188811AlT.LIZIZ(sbLIZ));
                        }
                        if (interfaceC1472350oPxLIZIZ != null && (surfaceLIZJ = interfaceC1472350oPxLIZIZ.LIZJ()) != null && surfaceLIZJ.isValid()) {
                            C1322890kWt.LIZIZ(interfaceC1472350oPxLIZIZ.LIZJ(), bitmapCreateBitmap, onPixelCopyFinishedListener, surfaceView.getHandler(), C1475000oUE.LJII());
                            return;
                        }
                    }
                    C1322890kWt.LIZJ(surfaceView, bitmapCreateBitmap, onPixelCopyFinishedListener, surfaceView.getHandler(), C1475000oUE.LJII());
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            return;
        }
        interfaceC1474030oSf.LIZ(null);
    }
}
