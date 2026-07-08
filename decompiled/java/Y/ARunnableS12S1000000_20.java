package Y;

import X.C1322200kVm;
import X.C1328130kfL;
import X.C1331900klQ;
import X.C1333180knU;
import X.C1C7U;
import X.C2188811AlT;
import X.InterfaceC1326920kdO;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.util.HashMap;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS12S1000000_20 implements Runnable {
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
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS12S1000000_20 aRunnableS12S1000000_20) {
        String str = aRunnableS12S1000000_20.s0;
        C1C7U.LIZ("MonitorListenerManager@618b.unregisterMonitorListener$1L");
        ((HashMap) C1331900klQ.LIZ).remove(str);
        C1C7U.LIZIZ("MonitorListenerManager@618b.unregisterMonitorListener$1L");
    }

    public static final void run$1(ARunnableS12S1000000_20 aRunnableS12S1000000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LiveCoreImpl@e164.updateSdkParams$1");
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Calling updateSdkParams:");
            sbLIZ.append(aRunnableS12S1000000_20.s0);
            AVLog.ioi("LiveCoreImpl", C2188811AlT.LIZIZ(sbLIZ));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveCoreImpl@e164.updateSdkParams$1");
    }

    public static final void run$2(ARunnableS12S1000000_20 aRunnableS12S1000000_20) {
        InterfaceC1326920kdO interfaceC1326920kdO;
        String str = aRunnableS12S1000000_20.s0;
        C1C7U.LIZ("FrescoCache@d725.clearCustomDiskcache$1L");
        Class<?> cls = C1322200kVm.LIZ;
        C1333180knU c1333180knULJIIIZ = C1328130kfL.LJIILIIL().LJIIIZ();
        if (c1333180knULJIIIZ != null && (interfaceC1326920kdO = (InterfaceC1326920kdO) c1333180knULJIIIZ.get(str)) != null) {
            interfaceC1326920kdO.clearAll();
        }
        C1C7U.LIZIZ("FrescoCache@d725.clearCustomDiskcache$1L");
    }

    public ARunnableS12S1000000_20(String str, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case 2:
                this.s0 = str;
                break;
            case 1:
            default:
                this.s0 = str;
                break;
        }
    }
}
