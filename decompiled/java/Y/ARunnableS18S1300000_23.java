package Y;

import X.C098200Yq;
import X.C1472910oQr;
import X.C1473310oRV;
import X.C1480430ocz;
import X.C1481290oeN;
import X.C1481340oeS;
import X.C1481720of4;
import X.C1481840ofG;
import X.C1481850ofH;
import X.C1491980ovc;
import X.C1529040ptO;
import X.C1529080ptS;
import X.C1529100ptU;
import X.C1529130ptX;
import X.C1529310ptp;
import X.C1533020pzo;
import X.C189200o6;
import X.C1C7U;
import X.C20613085r;
import X.EnumC1160050gIF;
import X.EnumC1529090ptT;
import X.EnumC1529110ptV;
import X.InterfaceC1491850ovP;
import com.bytedance.lynx.hybrid.info.model.GlobalConfig;
import com.bytedance.lynx.hybrid.info.net.NetworkAdapter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.legoImp.HybridInfoColdBootTask;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.playereventreporter.VideoInfo;
import com.ss.android.ugc.aweme.simreporterdt.SimDtReportService;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS86S1300000_23;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS18S1300000_23 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    public static final void run$3(ARunnableS18S1300000_23 aRunnableS18S1300000_23) {
        SimDtReportService.lambda$semisugar$reportVideoPlayTime$lambda$18$lambda$17$0((SimDtReportService) aRunnableS18S1300000_23.l1, aRunnableS18S1300000_23.s0, (C1481850ofH) aRunnableS18S1300000_23.l2, (VideoInfo) aRunnableS18S1300000_23.l3);
    }

    public static final void run$4(ARunnableS18S1300000_23 aRunnableS18S1300000_23) {
        SimDtReportService.lambda$semisugar$reportVideoPlayFirstFinish$lambda$16$lambda$15$0((SimDtReportService) aRunnableS18S1300000_23.l1, aRunnableS18S1300000_23.s0, (C1481840ofG) aRunnableS18S1300000_23.l2, (VideoInfo) aRunnableS18S1300000_23.l3);
    }

    public static final void run$5(ARunnableS18S1300000_23 aRunnableS18S1300000_23) {
        SimDtReportService.lambda$semisugar$reportPlayFailed$lambda$14$lambda$13$0((SimDtReportService) aRunnableS18S1300000_23.l1, aRunnableS18S1300000_23.s0, (C1481720of4) aRunnableS18S1300000_23.l2, (VideoInfo) aRunnableS18S1300000_23.l3);
    }

    public static final void run$6(ARunnableS18S1300000_23 aRunnableS18S1300000_23) {
        SimDtReportService.lambda$semisugar$reportVideoStop$lambda$12$lambda$11$0((SimDtReportService) aRunnableS18S1300000_23.l1, aRunnableS18S1300000_23.s0, (VideoInfo) aRunnableS18S1300000_23.l2, (C1481340oeS) aRunnableS18S1300000_23.l3);
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        final String str = this.s0;
        final C1529040ptO c1529040ptO = (C1529040ptO) this.l1;
        final C1529080ptS c1529080ptS = new C1529080ptS(new C1529310ptp((C1533020pzo) this.l2, "ssp_global_optimize", (HybridInfoColdBootTask) this.l3, str), null, null, c1529040ptO, EnumC1529090ptT.OID, System.currentTimeMillis());
        if (!C1529130ptX.LIZ.get()) {
            c1529080ptS.invoke(new C1529100ptU(false, null, null, EnumC1529110ptV.INIT_FAIL, "service hasn't init.", EnumC1160050gIF.NONE), null);
            return;
        }
        if (((GlobalConfig) C1529130ptX.LIZJ.getValue()).enable) {
            Runnable runnable = new Runnable() { // from class: X.0ptY
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("HybridInfoService@3e1e.fetchWithOid$runnable$1");
                    try {
                        C1529100ptU c1529100ptULIZ = C1529130ptX.LIZ(str, c1529040ptO);
                        if (c1529100ptULIZ != null) {
                            c1529080ptS.invoke(c1529100ptULIZ, null);
                        } else {
                            ((NetworkAdapter) C1529130ptX.LJFF.getValue()).LIZJ(null, str, null, c1529040ptO, c1529080ptS);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("HybridInfoService@3e1e.fetchWithOid$runnable$1");
                }
            };
            if (c1529040ptO.LIZIZ) {
                C20613085r.LIZ(runnable);
            } else {
                runnable.run();
            }
        }
    }

    public final void LIZ$1() {
        OnUIPlayListener onUIPlayListener = (OnUIPlayListener) this.l1;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayFailed((C1481290oeN) this.l2);
            SimRadar.errorScan("SimplifyPlayerImpl", "onPlayFailed-2", new C1473310oRV(((C1481290oeN) this.l2).toString()), new Object[0]);
            SimRadar.analyzer().getClass();
            C1472910oQr.LIZIZ("PF-2");
            ((OnUIPlayListener) this.l1).onPlayFailed(this.s0, (C1481290oeN) this.l2, (C1480430ocz) this.l3);
        }
    }

    public final void LIZ$2() {
        OnUIPlayListener onUIPlayListener = (OnUIPlayListener) this.l1;
        if (onUIPlayListener != null) {
            onUIPlayListener.onPlayFailed((C1481290oeN) this.l2);
            SimRadar.errorScan("SimplifyPlayerImpl", "onPlayFailed-2", new C1473310oRV(((C1481290oeN) this.l2).toString()), new Object[0]);
            SimRadar.analyzer().getClass();
            C1472910oQr.LIZIZ("PF-2");
            ((OnUIPlayListener) this.l1).onPlayFailed(this.s0, (C1481290oeN) this.l2, (C1480430ocz) this.l3);
        }
    }

    public static final void run$0(ARunnableS18S1300000_23 aRunnableS18S1300000_23) {
        boolean zLIZ;
        C1C7U.LIZ("HybridInfoColdBootTask@8c9c.run$runnable$1$1$task$1");
        try {
            aRunnableS18S1300000_23.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("HybridInfoColdBootTask@8c9c.run$runnable$1$1$task$1");
    }

    public static final void run$1(ARunnableS18S1300000_23 aRunnableS18S1300000_23) {
        boolean zLIZ;
        C1C7U.LIZ("SimplifyPlayerImpl@37de.prepareInternal$1");
        try {
            aRunnableS18S1300000_23.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SimplifyPlayerImpl@37de.prepareInternal$1");
    }

    public static final void run$2(ARunnableS18S1300000_23 aRunnableS18S1300000_23) {
        boolean zLIZ;
        C1C7U.LIZ("SimplifyPrepareInternalHelper@a4a9.prepareInternal$1");
        try {
            aRunnableS18S1300000_23.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SimplifyPrepareInternalHelper@a4a9.prepareInternal$1");
    }

    public static final void run$7(ARunnableS18S1300000_23 aRunnableS18S1300000_23) {
        Object c098200Yq;
        String str = aRunnableS18S1300000_23.s0;
        Integer num = (Integer) aRunnableS18S1300000_23.l1;
        Function0 function0 = (Function0) aRunnableS18S1300000_23.l2;
        Function0 function02 = (Function0) aRunnableS18S1300000_23.l3;
        C1C7U.LIZ("AsyncPriorityScheduler@a39f.scheduleling$1L");
        AwS86S1300000_23 awS86S1300000_23 = new AwS86S1300000_23(num, str, function0, function02, 4);
        C1491980ovc.LIZ.getClass();
        InterfaceC1491850ovP interfaceC1491850ovP = (InterfaceC1491850ovP) ((LinkedHashMap) C1491980ovc.LJII).get(str);
        if (interfaceC1491850ovP != null) {
            try {
                c098200Yq = (Unit) awS86S1300000_23.invoke();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                interfaceC1491850ovP.LIZ();
            }
        } else {
            awS86S1300000_23.invoke();
        }
        C1C7U.LIZIZ("AsyncPriorityScheduler@a39f.scheduleling$1L");
    }

    public ARunnableS18S1300000_23(Object obj, Object obj2, String str, Object obj3, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
        this.l3 = obj3;
    }
}
