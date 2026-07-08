package X;

import android.hardware.Camera;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1AiF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class RunnableC2186811AiF implements Runnable {
    public int LL;
    public final /* synthetic */ C2186771AiB LLILLJJLI;

    public final void LIZ() {
        try {
            C2186791AiD c2186791AiD = this.LLILLJJLI.LIZJ;
            int i = this.LL;
            Camera camera = c2186791AiD.LIZ;
            if (camera != null) {
                Camera.Parameters parameters = camera.getParameters();
                if (parameters.isZoomSupported()) {
                    int maxZoom = parameters.getMaxZoom();
                    int zoom = parameters.getZoom();
                    c2186791AiD.LJIIJJI = 1.0f;
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                if (zoom > 0) {
                                    c2186791AiD.LIZLLL(0);
                                    return;
                                } else {
                                    c2186791AiD.LIZLLL(maxZoom / 3);
                                    return;
                                }
                            }
                            return;
                        }
                        if (zoom > 0) {
                            zoom--;
                        }
                    } else if (zoom < maxZoom) {
                        zoom++;
                    }
                    parameters.setZoom(zoom);
                    c2186791AiD.LIZ.setParameters(parameters);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.LIZ(e);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("CameraInstance$ChangeZoomByGesturer@7254.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CameraInstance$ChangeZoomByGesturer@7254.run");
    }

    public RunnableC2186811AiF(C2186771AiB c2186771AiB) {
        this.LLILLJJLI = c2186771AiB;
    }
}
