package Y;

import X.C0X3T;
import X.C0X4T;
import X.C1C7U;
import X.C805420Vie;
import X.C810420Vqi;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS1S0010000_13 implements Runnable {
    public final int $t;
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
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Pair pairLIZJ = C0X4T.LIZJ();
        long jLongValue = ((Number) pairLIZJ.getFirst()).longValue() + ((Number) pairLIZJ.getSecond()).longValue();
        long j = jLongValue - C0X4T.LJFF;
        if (this.z0) {
            C0X4T.LJI += j;
        } else {
            C0X4T.LJIIIIZZ += j;
        }
        C0X4T.LJFF = jLongValue;
    }

    public static final void run$0(ARunnableS1S0010000_13 aRunnableS1S0010000_13) {
        boolean zLIZ;
        C1C7U.LIZ("EnginePreloader@7b00.<init>$1$onAppEnterBackground$1");
        try {
            if (aRunnableS1S0010000_13.z0) {
                C805420Vie.LIZ.LJJJLIIL();
            } else {
                C805420Vie.LIZ.LJJJJIZL();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EnginePreloader@7b00.<init>$1$onAppEnterBackground$1");
    }

    public static final void run$1(ARunnableS1S0010000_13 aRunnableS1S0010000_13) {
        boolean zLIZ;
        C1C7U.LIZ("PushInitializer@b651.setup$2");
        try {
            C810420Vqi.LIZ(aRunnableS1S0010000_13.z0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PushInitializer@b651.setup$2");
    }

    public static final void run$2(ARunnableS1S0010000_13 aRunnableS1S0010000_13) {
        boolean zLIZ;
        C1C7U.LIZ("TrafficPerfMonitor@6bb0.handleAppGroundChange$1");
        try {
            aRunnableS1S0010000_13.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TrafficPerfMonitor@6bb0.handleAppGroundChange$1");
    }

    public static final void run$3(ARunnableS1S0010000_13 aRunnableS1S0010000_13) {
        boolean zLIZ;
        C1C7U.LIZ("RealVsyncWorker@f031.requestNextFrame$1");
        try {
            C0X3T.LIZIZ(aRunnableS1S0010000_13.z0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RealVsyncWorker@f031.requestNextFrame$1");
    }

    public ARunnableS1S0010000_13(boolean z, int i) {
        this.$t = i;
        this.z0 = z;
    }
}
