package Y;

import X.C01GW;
import X.C0TJZ;
import X.C1702250uOl;
import X.C1C7U;
import X.C21278818Pa;
import X.C21278918Pb;
import X.C21279318Pf;
import X.C21378418lS;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC21378318lR;
import com.bytedance.android.bcm.impl.BcmServiceImpl;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.creative.taskscheduler.resource.ResourceType;
import com.ss.android.ugc.aweme.creative.taskscheduler.scheduler.g;
import java.util.Iterator;

/* JADX INFO: loaded from: classes33.dex */
public class ARunnableS105S0000000_32 implements Runnable {
    public final int $t;

    public static final void run$0(ARunnableS105S0000000_32 aRunnableS105S0000000_32) {
        C1C7U.LIZ("GroupSceneManager@36ed.<field>$5");
        C1C7U.LIZIZ("GroupSceneManager@36ed.<field>$5");
    }

    public static final void run$6(ARunnableS105S0000000_32 aRunnableS105S0000000_32) {
        C1C7U.LIZ("CoordinatePushOptionOperation@f1db.execute$5");
        C1C7U.LIZIZ("CoordinatePushOptionOperation@f1db.execute$5");
    }

    public static final void run$7(ARunnableS105S0000000_32 aRunnableS105S0000000_32) {
        C1C7U.LIZ("CoordinatePushOptionOperation@f1db.execute$6");
        C1C7U.LIZIZ("CoordinatePushOptionOperation@f1db.execute$6");
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
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                BcmServiceImpl.lambda$semisugar$init$lambda$2$0();
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public ARunnableS105S0000000_32(int i) {
        this.$t = i;
    }

    public static final void run$1(ARunnableS105S0000000_32 aRunnableS105S0000000_32) {
        g gVar = g.LIZ;
        C1C7U.LIZ("GlobalTaskScheduler@e796.<clinit>$1L");
        g gVar2 = g.LIZ;
        gVar2.getClass();
        boolean zLIZ = C1702250uOl.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("delayGetCpuInfo isBusy: ");
        sbLIZ.append(zLIZ);
        C0TJZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        BPEAHandler bPEAHandler = g.LIZLLL;
        ARunnableS105S0000000_32 aRunnableS105S0000000_322 = g.LJIIJJI;
        bPEAHandler.removeCallbacks(aRunnableS105S0000000_322);
        if (!zLIZ) {
            gVar2.LIZLLL(ResourceType.CPU);
        } else {
            C786410Ut5.LJLIIL(500L, bPEAHandler, aRunnableS105S0000000_322);
        }
        C1C7U.LIZIZ("GlobalTaskScheduler@e796.<clinit>$1L");
    }

    public static final void run$2(ARunnableS105S0000000_32 aRunnableS105S0000000_32) {
        g gVar = g.LIZ;
        C1C7U.LIZ("GlobalTaskScheduler@e796.<clinit>$2L");
        g gVar2 = g.LIZ;
        gVar2.getClass();
        boolean zLIZIZ = C21378418lS.LIZ.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("delayGetNetworkTransmit isBusy: ");
        sbLIZ.append(zLIZIZ);
        C0TJZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        BPEAHandler bPEAHandler = g.LIZLLL;
        ARunnableS105S0000000_32 aRunnableS105S0000000_322 = g.LJIIL;
        bPEAHandler.removeCallbacks(aRunnableS105S0000000_322);
        if (!zLIZIZ) {
            gVar2.LIZLLL(ResourceType.NETWORK_TRANSMIT);
        } else {
            C786410Ut5.LJLIIL(1000L, bPEAHandler, aRunnableS105S0000000_322);
        }
        C1C7U.LIZIZ("GlobalTaskScheduler@e796.<clinit>$2L");
    }

    public static final void run$3(ARunnableS105S0000000_32 aRunnableS105S0000000_32) {
        g gVar = g.LIZ;
        C1C7U.LIZ("GlobalTaskScheduler@e796.<clinit>$3L");
        g gVar2 = g.LIZ;
        gVar2.getClass();
        boolean zLIZ = C21378418lS.LIZ.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("delayGetNetworkReceive isBusy: ");
        sbLIZ.append(zLIZ);
        C0TJZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        BPEAHandler bPEAHandler = g.LIZLLL;
        ARunnableS105S0000000_32 aRunnableS105S0000000_322 = g.LJIILIIL;
        bPEAHandler.removeCallbacks(aRunnableS105S0000000_322);
        if (!zLIZ) {
            gVar2.LIZLLL(ResourceType.NETWORK_RECEIVE);
        } else {
            C786410Ut5.LJLIIL(1000L, bPEAHandler, aRunnableS105S0000000_322);
        }
        C1C7U.LIZIZ("GlobalTaskScheduler@e796.<clinit>$3L");
    }

    public static final void run$4(ARunnableS105S0000000_32 aRunnableS105S0000000_32) {
        g gVar = g.LIZ;
        C1C7U.LIZ("GlobalTaskScheduler@e796.onTaskEnd$1L");
        synchronized (g.LIZ) {
            Iterator<InterfaceC21378318lR> it2 = g.LJI.iterator();
            while (it2.hasNext()) {
                it2.next().LIZJ();
            }
        }
        C1C7U.LIZIZ("GlobalTaskScheduler@e796.onTaskEnd$1L");
    }

    public static final void run$5(ARunnableS105S0000000_32 aRunnableS105S0000000_32) {
        boolean zLIZ;
        C1C7U.LIZ("EcUgVSAClickManager@6e53.handleIfNoShopTab$$inlined$runOnWorkerThreadDelay$1");
        try {
            C21278918Pb.LIZ.getClass();
            C01GW c01gw = C21278818Pa.LIZ;
            C21279318Pf c21279318PfLIZJ = C21278818Pa.LIZJ(C21278818Pa.LIZIZ, null);
            if (c21279318PfLIZJ != null) {
                c21279318PfLIZJ.LJIILIIL = true;
                try {
                    DataCenter dataCenter = c21279318PfLIZJ.LJIIJ;
                    if (dataCenter != null) {
                        dataCenter.zQ2(Boolean.TRUE, "AD_ACTION_MOVE_IN_DESC");
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                C21278918Pb.LIZ.getClass();
                C21278918Pb.LJ();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcUgVSAClickManager@6e53.handleIfNoShopTab$$inlined$runOnWorkerThreadDelay$1");
    }
}
