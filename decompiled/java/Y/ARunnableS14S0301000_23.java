package Y;

import X.C0POE;
import X.C1482260ofw;
import X.C1516150pYb;
import X.C1551530qTf;
import X.C1551960qUM;
import X.C1552230qUn;
import X.C1552410qV5;
import X.C1553130qWF;
import X.C1C7U;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.playereventreporter.VideoInfo;
import com.ss.android.ugc.aweme.simreporterdt.SimDtReportService;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS14S0301000_23 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    public static final void run$2(ARunnableS14S0301000_23 aRunnableS14S0301000_23) {
        SimDtReportService.lambda$semisugar$reportVideoResponse$lambda$9$0((SimDtReportService) aRunnableS14S0301000_23.l0, aRunnableS14S0301000_23.i3, (VideoInfo) aRunnableS14S0301000_23.l1, (C1482260ofw) aRunnableS14S0301000_23.l2);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
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
        try {
            C1551530qTf c1551530qTf = ((C1552410qV5) this.l2).LIZ;
            Map map = (Map) this.l0;
            OptionCheckUpdateParams optionCheckUpdateParams = (OptionCheckUpdateParams) this.l1;
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            C1551960qUM.LIZ(optionCheckUpdateParams, concurrentHashMap, map);
            C1552230qUn c1552230qUnLJIIJJI = C1551960qUM.LJIIJJI(c1551530qTf, concurrentHashMap, optionCheckUpdateParams, null);
            c1552230qUnLJIIJJI.setPipelineData("req_type", 4);
            c1552230qUnLJIIJJI.setPipelineData("sync_task_id", Integer.valueOf(this.i3));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1553130qWF.LIZ("gecko-debug-tag", "sync gecko checkUpdate exception", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x028a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$0(Y.ARunnableS14S0301000_23 r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS14S0301000_23.run$0(Y.ARunnableS14S0301000_23):void");
    }

    public static final void run$1(ARunnableS14S0301000_23 aRunnableS14S0301000_23) {
        boolean zLIZ;
        C1C7U.LIZ("SyncManager@2ac2.checkUpdate$1");
        try {
            aRunnableS14S0301000_23.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SyncManager@2ac2.checkUpdate$1");
    }

    public static final void run$3(ARunnableS14S0301000_23 aRunnableS14S0301000_23) {
        boolean zLIZ;
        C1C7U.LIZ("ParallelChunkGsonResponseBodyConverter@3768.mapParallelWithPrefer$1$call$1$onNext$2");
        try {
            ((C1516150pYb) aRunnableS14S0301000_23.l0).LJFF(aRunnableS14S0301000_23.i3, (byte[]) aRunnableS14S0301000_23.l1, (C0POE) aRunnableS14S0301000_23.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ParallelChunkGsonResponseBodyConverter@3768.mapParallelWithPrefer$1$call$1$onNext$2");
    }

    public ARunnableS14S0301000_23(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.i3 = i;
    }
}
