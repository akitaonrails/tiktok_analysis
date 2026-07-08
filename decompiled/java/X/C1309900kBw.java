package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS17S0200100_20;
import Y.ARunnableS89S0200000_20;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.performance.PerformanceController;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0kBw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1309900kBw {
    public final C1309860kBs LIZ = new C1309860kBs();
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public volatile C1310040kCA LIZJ;
    public final int LIZLLL;
    public final WeakReference<PerformanceController> LJ;

    public C1309900kBw(PerformanceController performanceController) {
        this.LIZLLL = -1;
        this.LJ = new WeakReference<>(null);
        this.LJ = new WeakReference<>(performanceController);
        this.LIZLLL = performanceController.LJII;
    }

    public final void LIZIZ(InterfaceC1310640kD8 interfaceC1310640kD8) {
        if (this.LIZ.LJIIIZ > 0) {
            C786410Ut5.LJLIIL(this.LIZ.LJIIIZ, C1289620jfE.LIZ(), new ARunnableS89S0200000_20(interfaceC1310640kD8, new WeakReference(this), 221));
        }
    }

    public final void LIZ(EnumC1309890kBv enumC1309890kBv, C1310040kCA c1310040kCA, long j) {
        PerformanceController performanceController = this.LJ.get();
        if (performanceController == null) {
            return;
        }
        if (c1310040kCA == null) {
            HashMap map = new HashMap(1);
            map.put("fspStatus", enumC1309890kBv.getValue());
            if (!performanceController.LJ) {
                performanceController.LJIILJJIL(new ARunnableS17S0200100_20(j, performanceController, map, 8));
            }
            if (TraceController.isTracingStarted()) {
                map.put("instance_id", String.valueOf(performanceController.LJII));
                C1289620jfE.LIZJ(new ARunnableS120S0100000_20(map, 379));
                return;
            }
            return;
        }
        HashMap map2 = new HashMap(1);
        map2.put("fspStatus", enumC1309890kBv.getValue());
        map2.put("contentFillPercentageX", String.valueOf(c1310040kCA.LJIIIZ));
        map2.put("contentFillPercentageY", String.valueOf(c1310040kCA.LJIIJ));
        map2.put("contentFillPercentageTotalArea", String.valueOf(c1310040kCA.LJIIJJI));
        map2.put("containerFillPercentageContainerArea", String.valueOf(c1310040kCA.LJIIL));
        long j2 = c1310040kCA.LJIIIIZZ;
        if (!performanceController.LJ) {
            performanceController.LJIILJJIL(new ARunnableS17S0200100_20(j2, performanceController, map2, 8));
        }
        if (TraceController.isTracingStarted()) {
            map2.put("instance_id", String.valueOf(performanceController.LJII));
            C1289620jfE.LIZJ(new ARunnableS89S0200000_20(map2, c1310040kCA, 222));
        }
    }
}
