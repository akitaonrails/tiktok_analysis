package Y;

import X.C1C7U;
import X.C2188811AlT;
import X.SurfaceHolderCallbackC1272890jEF;
import android.view.SurfaceHolder;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.android.ttvecamera.b0;
import com.ss.ttlivestreamer.core.utils.AVLog;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS3S0200001_20 implements Runnable {
    public final int $t;
    public float f2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS3S0200001_20 aRunnableS3S0200001_20) {
        boolean zLIZ;
        C1C7U.LIZ("TECameraServer@d252.setAperture$1");
        try {
            ((b0) aRunnableS3S0200001_20.l1).setAperture((TECameraCapture) aRunnableS3S0200001_20.l0, aRunnableS3S0200001_20.f2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECameraServer@d252.setAperture$1");
    }

    public static final void run$1(ARunnableS3S0200001_20 aRunnableS3S0200001_20) {
        boolean zLIZ;
        C1C7U.LIZ("TECameraServer@d252.setManualFocusDistance$1");
        try {
            ((b0) aRunnableS3S0200001_20.l1).setManualFocusDistance((TECameraCapture) aRunnableS3S0200001_20.l0, aRunnableS3S0200001_20.f2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECameraServer@d252.setManualFocusDistance$1");
    }

    public static final void run$2(ARunnableS3S0200001_20 aRunnableS3S0200001_20) {
        SurfaceHolderCallbackC1272890jEF surfaceHolderCallbackC1272890jEF = (SurfaceHolderCallbackC1272890jEF) aRunnableS3S0200001_20.l0;
        float f = aRunnableS3S0200001_20.f2;
        SurfaceHolder surfaceHolder = (SurfaceHolder) aRunnableS3S0200001_20.l1;
        surfaceHolderCallbackC1272890jEF.getClass();
        C1C7U.LIZ("GLRenderVideoSink@a139.checkFixedSize$1L");
        double d = f;
        if (d > 1.0d) {
            int i = (int) (surfaceHolderCallbackC1272890jEF.LLJILLL / f);
            surfaceHolderCallbackC1272890jEF.LLJJI = i;
            int i2 = (int) (surfaceHolderCallbackC1272890jEF.LLJILJILJ / f);
            surfaceHolderCallbackC1272890jEF.LLJJ = i2;
            surfaceHolder.setFixedSize(i, i2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isSelfSideRender:");
            sbLIZ.append(surfaceHolderCallbackC1272890jEF.LLJLLL);
            sbLIZ.append(" setFixedSize:");
            sbLIZ.append(surfaceHolderCallbackC1272890jEF.LLJJI);
            sbLIZ.append("x");
            sbLIZ.append(surfaceHolderCallbackC1272890jEF.LLJJ);
            AVLog.iow("GLRenderVideoSink", C2188811AlT.LIZIZ(sbLIZ));
        } else if (d < 1.0d) {
            surfaceHolder.setSizeFromLayout();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("isSelfSideRender:");
            sbLIZ2.append(surfaceHolderCallbackC1272890jEF.LLJLLL);
            sbLIZ2.append(" setSizeFromLayout:");
            sbLIZ2.append(surfaceHolderCallbackC1272890jEF.LLJILLL);
            sbLIZ2.append("x");
            sbLIZ2.append(surfaceHolderCallbackC1272890jEF.LLJILJILJ);
            AVLog.iow("GLRenderVideoSink", C2188811AlT.LIZIZ(sbLIZ2));
        }
        C1C7U.LIZIZ("GLRenderVideoSink@a139.checkFixedSize$1L");
    }

    public ARunnableS3S0200001_20(Object obj, Object obj2, float f, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
        this.f2 = f;
    }
}
