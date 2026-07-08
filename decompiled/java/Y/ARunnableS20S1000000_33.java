package Y;

import X.C0A0Q;
import X.C0CFK;
import X.C1702460uP6;
import X.C1BCA;
import X.C1C7U;
import X.C2184071Adp;
import X.C2184121Adu;
import X.C2184361AeI;
import X.C2184371AeJ;
import X.C2185111AfV;
import X.C2185121AfW;
import X.C2185171Afb;
import X.C2185291Afn;
import X.C2185491Ag7;
import com.ss.android.ugc.aweme.boost.ThreadBoostConfigs;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.performanceopt.api.IPerformanceOptMTDiffService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS240S0000000_9;

/* JADX INFO: loaded from: classes34.dex */
public class ARunnableS20S1000000_33 implements Runnable {
    public final int $t;
    public String s0;

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
        List<C2185491Ag7> threadBoostConfig;
        String str = this.s0;
        int iHashCode = str.hashCode();
        if (iHashCode == 812882236) {
            if (str.equals("SystemLaunchStage")) {
                C2184071Adp.LIZ.getClass();
                if (((Boolean) C2185171Afb.LIZLLL.getValue()).booleanValue()) {
                    C1BCA.LJIILJJIL("SystemLaunchStage", C2185291Afn.LIZ((ThreadBoostConfigs) C2185171Afb.LJ.getValue()));
                    C2184371AeJ c2184371AeJ = C2184371AeJ.LIZ;
                    c2184371AeJ.LIZJ("SystemLaunchStage");
                    c2184371AeJ.LIZLLL("SystemLaunchStage");
                    return;
                }
                return;
            }
            return;
        }
        if (iHashCode == 1697483413) {
            if (str.equals("OnPageSelectedStage")) {
                C2184071Adp.LIZ.getClass();
                if (((Boolean) C2185111AfV.LIZLLL.getValue()).booleanValue()) {
                    C1BCA.LJIILJJIL("OnPageSelectedStage", C2185291Afn.LIZ((ThreadBoostConfigs) C2185111AfV.LJ.getValue()));
                    C2184371AeJ.LIZ.LIZJ("OnPageSelectedStage");
                    ((ArrayList) C0CFK.LJII).add(AFwS240S0000000_9.get$arr$(972));
                    return;
                }
                return;
            }
            return;
        }
        if (iHashCode == 1851824637 && str.equals("AllStage")) {
            C2184071Adp.LIZ.getClass();
            if (((Boolean) C2185121AfW.LIZLLL.getValue()).booleanValue()) {
                AtomicBoolean atomicBoolean = C2184121Adu.LIZ;
                if (!atomicBoolean.get()) {
                    C1702460uP6 c1702460uP6 = new C1702460uP6();
                    C2184371AeJ c2184371AeJ2 = C2184371AeJ.LIZ;
                    C2184361AeI.LIZIZ = c1702460uP6;
                    atomicBoolean.set(true);
                }
                if (((Boolean) C0A0Q.LIZIZ.getValue()).booleanValue()) {
                    IPerformanceOptMTDiffService iPerformanceOptMTDiffService = (IPerformanceOptMTDiffService) PluggableExtentionKt.pluggableSpi$default(IPerformanceOptMTDiffService.class, false, false, false, 14, null);
                    if (iPerformanceOptMTDiffService == null || (threadBoostConfig = iPerformanceOptMTDiffService.getThreadBoostConfig()) == null) {
                        return;
                    } else {
                        C1BCA.LJIILJJIL("AllStage", threadBoostConfig);
                    }
                } else {
                    C1BCA.LJIILJJIL("AllStage", C2185291Afn.LIZ((ThreadBoostConfigs) C2185121AfW.LJ.getValue()));
                }
                C2184371AeJ c2184371AeJ3 = C2184371AeJ.LIZ;
                c2184371AeJ3.LIZJ("AllStage");
                c2184371AeJ3.LIZLLL("AllStage");
            }
        }
    }

    public static final void run$0(ARunnableS20S1000000_33 aRunnableS20S1000000_33) {
        boolean zLIZ;
        C1C7U.LIZ("ThreadBoostStrategyManager@627.startThreadBoost$1");
        try {
            aRunnableS20S1000000_33.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ThreadBoostStrategyManager@627.startThreadBoost$1");
    }

    public static final void run$1(ARunnableS20S1000000_33 aRunnableS20S1000000_33) {
        boolean zLIZ;
        C1C7U.LIZ("ThreadBoostStrategyManager@627.stopThreadBoost$1");
        try {
            String str = aRunnableS20S1000000_33.s0;
            int iHashCode = str.hashCode();
            if (iHashCode != 812882236) {
                if (iHashCode != 1697483413) {
                    if (iHashCode == 1851824637) {
                        str.equals("AllStage");
                    }
                } else if (str.equals("OnPageSelectedStage") && ((Boolean) C2185111AfV.LIZLLL.getValue()).booleanValue()) {
                    C2184371AeJ.LIZ.LIZIZ("OnPageSelectedStage");
                }
            } else if (str.equals("SystemLaunchStage") && ((Boolean) C2185171Afb.LIZLLL.getValue()).booleanValue()) {
                C2184371AeJ.LIZ.LIZIZ("SystemLaunchStage");
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ThreadBoostStrategyManager@627.stopThreadBoost$1");
    }

    public ARunnableS20S1000000_33(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
