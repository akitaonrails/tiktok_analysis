package Y;

import X.C1B7E;
import X.C1C7U;
import X.C2200681BBa;
import com.bytedance.applog.AppLog;

/* JADX INFO: loaded from: classes31.dex */
public class ARunnableS103S0000000_30 implements Runnable {
    public final int $t;

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

    public ARunnableS103S0000000_30(int i) {
        this.$t = i;
    }

    public static final void run$0(ARunnableS103S0000000_30 aRunnableS103S0000000_30) {
        boolean zLIZ;
        C1C7U.LIZ("DownloadComponentManager@154a.setDownloadInMultiProcess$1");
        try {
            C1B7E.LIZ(true).LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DownloadComponentManager@154a.setDownloadInMultiProcess$1");
    }

    public static final void run$1(ARunnableS103S0000000_30 aRunnableS103S0000000_30) {
        C1C7U.LIZ("OptimizerHelper@3f44.applogSlideBatch$1$invoke$1L");
        AppLog.setInsertEventOptEnabled(false);
        C1C7U.LIZIZ("OptimizerHelper@3f44.applogSlideBatch$1$invoke$1L");
    }

    public static final void run$2(ARunnableS103S0000000_30 aRunnableS103S0000000_30) {
        C1C7U.LIZ("CpuResourceStateManager@20dd.init$1L");
        C2200681BBa.LJI.LIZ.LIZ();
        C1C7U.LIZIZ("CpuResourceStateManager@20dd.init$1L");
    }
}
