package Y;

import X.C1C7U;
import X.C2186771AiB;
import X.C2186791AiD;
import X.C2186801AiE;
import X.C2186881AiM;
import android.hardware.Camera;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.adapter.widget.LivePreviewTopMaskLayerWidget;

/* JADX INFO: loaded from: classes34.dex */
public class ARunnableS51S0110000_33 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        String flashMode;
        C2186791AiD c2186791AiD = ((C2186771AiB) this.l0).LIZJ;
        boolean z = this.z1;
        Camera camera = c2186791AiD.LIZ;
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                if (z != ((parameters == null || (flashMode = parameters.getFlashMode()) == null || (!"on".equals(flashMode) && !"torch".equals(flashMode))) ? false : true)) {
                    C2186801AiE c2186801AiE = c2186791AiD.LIZJ;
                    if (c2186801AiE != null) {
                        c2186801AiE.LIZJ();
                    }
                    Camera.Parameters parameters2 = c2186791AiD.LIZ.getParameters();
                    C2186881AiM.LIZIZ(parameters2, z);
                    c2186791AiD.LJFF.getClass();
                    c2186791AiD.LIZ.setParameters(parameters2);
                    C2186801AiE c2186801AiE2 = c2186791AiD.LIZJ;
                    if (c2186801AiE2 != null) {
                        c2186801AiE2.LIZ = false;
                        c2186801AiE2.LIZIZ();
                    }
                }
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static final void run$0(ARunnableS51S0110000_33 aRunnableS51S0110000_33) {
        boolean zLIZ;
        C1C7U.LIZ("LivePreviewTopMaskLayerWidget@c1da.loadWidgetWhenPageIdle$1");
        try {
            LivePreviewTopMaskLayerWidget livePreviewTopMaskLayerWidget = (LivePreviewTopMaskLayerWidget) aRunnableS51S0110000_33.l0;
            if (!livePreviewTopMaskLayerWidget.isDestroyed && ((!aRunnableS51S0110000_33.z1 || livePreviewTopMaskLayerWidget.LL) && livePreviewTopMaskLayerWidget.LLJJJ.compareAndSet(false, true))) {
                ((LivePreviewTopMaskLayerWidget) aRunnableS51S0110000_33.l0).Q1(false);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LivePreviewTopMaskLayerWidget@c1da.loadWidgetWhenPageIdle$1");
    }

    public static final void run$1(ARunnableS51S0110000_33 aRunnableS51S0110000_33) {
        boolean zLIZ;
        C1C7U.LIZ("CameraInstance@2707.setTorch$1");
        try {
            aRunnableS51S0110000_33.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CameraInstance@2707.setTorch$1");
    }

    public ARunnableS51S0110000_33(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
