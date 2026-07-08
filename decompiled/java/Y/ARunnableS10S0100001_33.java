package Y;

import X.C1C7U;
import X.C21637819mC;
import X.C2186771AiB;
import X.C2186791AiD;
import X.C2186881AiM;
import android.hardware.Camera;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class ARunnableS10S0100001_33 implements Runnable {
    public final int $t;
    public float f1;
    public Object l0;

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

    public final void LIZ$0() {
        C2186791AiD c2186791AiD = ((C2186771AiB) this.l0).LIZJ;
        float f = this.f1;
        Camera.Parameters parameters = c2186791AiD.LIZ.getParameters();
        if (c2186791AiD.LIZ == null || !parameters.isZoomSupported() || f <= 1.0f) {
            return;
        }
        try {
            float f2 = c2186791AiD.LJIIJJI * f;
            c2186791AiD.LJIIJJI = f2;
            double d = f2;
            int i = C2186881AiM.LIZ;
            List<Integer> zoomRatios = parameters.getZoomRatios();
            int maxZoom = parameters.getMaxZoom();
            if (zoomRatios == null || zoomRatios.isEmpty() || zoomRatios.size() != maxZoom + 1) {
                return;
            }
            double d2 = d * 100.0d;
            double d3 = Double.POSITIVE_INFINITY;
            int i2 = 0;
            for (int i3 = 0; i3 < zoomRatios.size(); i3++) {
                double dAbs = Math.abs(((double) ((Integer) ListProtector.get(zoomRatios, i3)).intValue()) - d2);
                if (dAbs < d3) {
                    i2 = i3;
                    d3 = dAbs;
                }
            }
            if (i2 != -1) {
                int zoom = parameters.getZoom();
                int maxZoom2 = parameters.getMaxZoom();
                if (i2 <= zoom || maxZoom2 <= i2) {
                    return;
                }
                parameters.setZoom(i2);
                c2186791AiD.LIZ.setParameters(parameters);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void run$0(ARunnableS10S0100001_33 aRunnableS10S0100001_33) {
        boolean zLIZ;
        C1C7U.LIZ("StickerBorderLine@b02b.updateBottomLineMarginBottomFor4to3Photo$1");
        try {
            if (((C21637819mC) aRunnableS10S0100001_33.l0).LLILLJJLI.getParent() != null) {
                C21637819mC c21637819mC = (C21637819mC) aRunnableS10S0100001_33.l0;
                c21637819mC.LLJJIJI = c21637819mC.LJJJJ().bottom - aRunnableS10S0100001_33.f1;
                ((C21637819mC) aRunnableS10S0100001_33.l0).LLJJJIL = false;
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StickerBorderLine@b02b.updateBottomLineMarginBottomFor4to3Photo$1");
    }

    public static final void run$1(ARunnableS10S0100001_33 aRunnableS10S0100001_33) {
        boolean zLIZ;
        C1C7U.LIZ("StickerBorderLine@b02b.updateTopLineMarginTopFor4to3Photo$1");
        try {
            if (((C21637819mC) aRunnableS10S0100001_33.l0).LLILLJJLI.getParent() != null) {
                C21637819mC c21637819mC = (C21637819mC) aRunnableS10S0100001_33.l0;
                c21637819mC.LLJJIII = c21637819mC.LJJJJ().top + aRunnableS10S0100001_33.f1;
                ((C21637819mC) aRunnableS10S0100001_33.l0).LLJJJ = false;
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StickerBorderLine@b02b.updateTopLineMarginTopFor4to3Photo$1");
    }

    public static final void run$2(ARunnableS10S0100001_33 aRunnableS10S0100001_33) {
        boolean zLIZ;
        C1C7U.LIZ("CameraInstance@2707.setZoom$2");
        try {
            aRunnableS10S0100001_33.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CameraInstance@2707.setZoom$2");
    }

    public ARunnableS10S0100001_33(C21637819mC c21637819mC, int i) {
        this.$t = i;
        this.l0 = c21637819mC;
        this.f1 = 0.0f;
    }

    public ARunnableS10S0100001_33(Object obj, float f, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f1 = f;
    }
}
