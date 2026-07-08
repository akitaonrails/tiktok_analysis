package Y;

import X.C1289620jfE;
import X.C1C7U;
import com.bytedance.pitaya.cep_engine.inner.Dispatcher;
import com.bytedance.pitaya.cep_engine.inner.TimerV2;
import com.lynx.tasm.core.VSyncMonitor;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS14S0000100_20 implements Runnable {
    public final int $t;
    public long j0;

    public static final void run$1(ARunnableS14S0000100_20 aRunnableS14S0000100_20) {
        Dispatcher.lambda$semisugar$dispatchGlobalV2$lambda$3$0(aRunnableS14S0000100_20.j0);
    }

    public static final void run$2(ARunnableS14S0000100_20 aRunnableS14S0000100_20) {
        TimerV2.lambda$semisugar$timer$lambda$1$0(aRunnableS14S0000100_20.j0);
    }

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

    public static final void run$0(ARunnableS14S0000100_20 aRunnableS14S0000100_20) {
        boolean zLIZ;
        C1C7U.LIZ("VSyncMonitor@8fde.requestOnUIThread$1");
        try {
            if (VSyncMonitor.LIZJ == null) {
                C1289620jfE.LIZLLL(new ARunnableS96S0000000_20(3));
            }
            VSyncMonitor.requestOnUIThread(aRunnableS14S0000100_20.j0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VSyncMonitor@8fde.requestOnUIThread$1");
    }

    public ARunnableS14S0000100_20(long j, int i) {
        this.$t = i;
        if (i != 0) {
            this.j0 = j;
        } else {
            this.j0 = j;
        }
    }
}
