package Y;

import X.C1C7U;
import X.C2104908Ml;
import android.os.Build;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.GCThreadOpt;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes27.dex */
public class ARunnableS2S0011000_26 implements Runnable {
    public final int $t;
    public int i1;
    public boolean z0;

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
        GCThreadOpt gCThreadOptLIZ = GCThreadOpt.LIZ();
        int i = Build.VERSION.SDK_INT;
        int i2 = this.i1;
        boolean z = this.z0;
        synchronized (gCThreadOptLIZ) {
            if (gCThreadOptLIZ.LIZ) {
                return;
            }
            if (C2104908Ml.LIZIZ() && i2 >= -20 && i2 <= 19) {
                try {
                    if (GCThreadOpt.nIncreaseGCThreadPrio(i, i2, z) == 1) {
                        gCThreadOptLIZ.LIZ = true;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    public static final void run$0(ARunnableS2S0011000_26 aRunnableS2S0011000_26) {
        boolean zLIZ;
        C1C7U.LIZ("JatoXL@558d.gcStwThreadBoost$1");
        try {
            aRunnableS2S0011000_26.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JatoXL@558d.gcStwThreadBoost$1");
    }

    public static final void run$1(ARunnableS2S0011000_26 aRunnableS2S0011000_26) {
        boolean z = aRunnableS2S0011000_26.z0;
        int i = aRunnableS2S0011000_26.i1;
        C1C7U.LIZ("OptimizerHelper@3f44.logcutOptimize$1L");
        if (z) {
            JatoXL.logCutStart(i);
        } else {
            JatoXL.logCutStop();
        }
        Npth.addTag("has_native_log", String.valueOf(z));
        C1C7U.LIZIZ("OptimizerHelper@3f44.logcutOptimize$1L");
    }

    public ARunnableS2S0011000_26(int i, int i2) {
        this.$t = i2;
        this.z0 = true;
        this.i1 = i;
    }

    public ARunnableS2S0011000_26(int i, boolean z, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.z0 = z;
    }
}
