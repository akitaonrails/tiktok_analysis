package Y;

import X.C1468940oKS;
import X.C1482970oh5;
import X.C1482990oh7;
import X.C1483000oh8;
import X.C1483340ohg;
import X.C1490820otk;
import X.C1490830otl;
import X.C1490840otm;
import X.C1511830pRd;
import X.C1512080pS2;
import X.C1C7U;
import X.C2188811AlT;
import X.InterfaceC1512050pRz;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS4S0111000_23 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public boolean z1;

    public static final void run$2(ARunnableS4S0111000_23 aRunnableS4S0111000_23) {
        C1468940oKS.a((C1468940oKS) aRunnableS4S0111000_23.l0, aRunnableS4S0111000_23.z1, aRunnableS4S0111000_23.i2);
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

    /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS4S0111000_23.LIZ$0():void");
    }

    public final void LIZ$1() {
        int iLIZLLL;
        try {
            C1490840otm c1490840otm = (C1490840otm) this.l0;
            if (c1490840otm.LLILZLL > 0 && (iLIZLLL = c1490840otm.LIZLLL()) != 0) {
                if (C1490830otl.LIZ()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("WaitingRetryTasksCount = ");
                    sbLIZ.append(((C1490840otm) this.l0).LLILZLL);
                    C1490830otl.LIZIZ("RetryScheduler", "doScheduleAllTaskRetry", C2188811AlT.LIZIZ(sbLIZ));
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                synchronized (((C1490840otm) this.l0).LLILLL) {
                    for (int i = 0; i < ((C1490840otm) this.l0).LLILLL.size(); i++) {
                        try {
                            C1490820otk c1490820otkValueAt = ((C1490840otm) this.l0).LLILLL.valueAt(i);
                            if (c1490820otkValueAt != null && c1490820otkValueAt.LIZ(this.i2, iLIZLLL, jCurrentTimeMillis, this.z1)) {
                                if (this.z1) {
                                    c1490820otkValueAt.LJII.set(c1490820otkValueAt.LIZLLL);
                                }
                                arrayList.add(c1490820otkValueAt);
                            }
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
                if (arrayList.size() > 0) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((C1490840otm) this.l0).LIZIZ(((C1490820otk) it2.next()).LIZ, iLIZLLL, false);
                    }
                }
            }
        } catch (Exception th) {
        }
    }

    public static final void run$0(ARunnableS4S0111000_23 aRunnableS4S0111000_23) {
        boolean zLIZ;
        C1C7U.LIZ("GlobalSettingsManager@c899.syncGlobalSettings$1");
        try {
            aRunnableS4S0111000_23.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GlobalSettingsManager@c899.syncGlobalSettings$1");
    }

    public static final void run$1(ARunnableS4S0111000_23 aRunnableS4S0111000_23) {
        Aweme aweme = (Aweme) aRunnableS4S0111000_23.l0;
        int i = aRunnableS4S0111000_23.i2;
        boolean z = aRunnableS4S0111000_23.z1;
        C1C7U.LIZ("VideoPreloaderManagerUtil@ccfe.preload$1L");
        C1483340ohg.LJIILJJIL(aweme, i, z);
        C1C7U.LIZIZ("VideoPreloaderManagerUtil@ccfe.preload$1L");
    }

    public static final void run$3(ARunnableS4S0111000_23 aRunnableS4S0111000_23) {
        boolean zLIZ;
        C1C7U.LIZ("PreRenderStrategy@356.triggerPreRender$2");
        try {
            ((C1483000oh8) aRunnableS4S0111000_23.l0).LJIILL(aRunnableS4S0111000_23.i2, aRunnableS4S0111000_23.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreRenderStrategy@356.triggerPreRender$2");
    }

    public static final void run$4(ARunnableS4S0111000_23 aRunnableS4S0111000_23) {
        boolean zLIZ;
        C1C7U.LIZ("RetrySchedulerImpl@9e9d.doScheduleAllTaskRetry$1");
        try {
            aRunnableS4S0111000_23.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RetrySchedulerImpl@9e9d.doScheduleAllTaskRetry$1");
    }

    public static final void run$5(ARunnableS4S0111000_23 aRunnableS4S0111000_23) {
        boolean zLIZ;
        C1C7U.LIZ("PreRenderStrategy@3bb6.triggerPreRender$1");
        try {
            ((C1482970oh5) aRunnableS4S0111000_23.l0).LJIIIIZZ(aRunnableS4S0111000_23.i2, aRunnableS4S0111000_23.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreRenderStrategy@3bb6.triggerPreRender$1");
    }

    public static final void run$6(ARunnableS4S0111000_23 aRunnableS4S0111000_23) {
        C1511830pRd c1511830pRd = (C1511830pRd) aRunnableS4S0111000_23.l0;
        boolean z = aRunnableS4S0111000_23.z1;
        int i = aRunnableS4S0111000_23.i2;
        c1511830pRd.getClass();
        C1C7U.LIZ("HARService@6c94.onPredictResultChanged$1L");
        if (c1511830pRd.LJFF.isEmpty()) {
            C1C7U.LIZIZ("HARService@6c94.onPredictResultChanged$1L");
            return;
        }
        if (C1512080pS2.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HARService.onPredictResultChanged real in success:");
            sbLIZ.append(z);
            sbLIZ.append(" errCode:");
            sbLIZ.append(i);
            sbLIZ.append(" lastResult:");
            sbLIZ.append(c1511830pRd.LJI());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        synchronized (c1511830pRd.LJFF) {
            for (int i2 = 0; i2 < c1511830pRd.LJFF.size(); i2++) {
                try {
                    InterfaceC1512050pRz interfaceC1512050pRz = c1511830pRd.LJFF.get(i2);
                    if (interfaceC1512050pRz != null) {
                        interfaceC1512050pRz.LIZ(i, z, c1511830pRd.LJI());
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C1C7U.LIZIZ("HARService@6c94.onPredictResultChanged$1L");
    }

    public static final void run$7(ARunnableS4S0111000_23 aRunnableS4S0111000_23) {
        boolean zLIZ;
        C1C7U.LIZ("PreRenderHook@8809.triggerPreRender$2");
        try {
            ((C1482990oh7) aRunnableS4S0111000_23.l0).LJIILL(aRunnableS4S0111000_23.i2, aRunnableS4S0111000_23.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreRenderHook@8809.triggerPreRender$2");
    }

    public ARunnableS4S0111000_23(C1482990oh7 c1482990oh7, int i, int i2) {
        this.$t = i2;
        this.l0 = c1482990oh7;
        this.i2 = i;
        this.z1 = true;
    }

    public ARunnableS4S0111000_23(Object obj, int i, boolean z, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.z1 = z;
    }
}
