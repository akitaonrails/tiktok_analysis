package Y;

import X.C1481690of1;
import X.C1C7U;
import X.InterfaceC1475840oVa;
import com.ss.android.ugc.aweme.playereventreporter.VideoInfo;
import com.ss.android.ugc.aweme.simreporterdt.SimDtReportService;
import com.ss.android.ugc.aweme.video.preload.VideoPreloadManagerAsync;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS0S1310100_23 implements Runnable {
    public final int $t;
    public long j5;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;
    public boolean z4;

    public static final void run$0(ARunnableS0S1310100_23 aRunnableS0S1310100_23) {
        SimDtReportService.lambda$semisugar$reportBlock$lambda$8$lambda$7$0((SimDtReportService) aRunnableS0S1310100_23.l1, (VideoInfo) aRunnableS0S1310100_23.l2, (C1481690of1) aRunnableS0S1310100_23.l3, aRunnableS0S1310100_23.j5, aRunnableS0S1310100_23.s0, aRunnableS0S1310100_23.z4);
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$1(ARunnableS0S1310100_23 aRunnableS0S1310100_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS0S1310100_23.l1;
        SimVideoUrlModel simVideoUrlModel = (SimVideoUrlModel) aRunnableS0S1310100_23.l2;
        String str = aRunnableS0S1310100_23.s0;
        boolean z = aRunnableS0S1310100_23.z4;
        long j = aRunnableS0S1310100_23.j5;
        InterfaceC1475840oVa interfaceC1475840oVa = (InterfaceC1475840oVa) aRunnableS0S1310100_23.l3;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.copyCache$4L$1L");
        videoPreloadManagerAsync.LJJZZI().LJJJJJL(simVideoUrlModel, str, z, j, interfaceC1475840oVa);
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.copyCache$4L$1L");
    }

    public static final void run$2(ARunnableS0S1310100_23 aRunnableS0S1310100_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS0S1310100_23.l1;
        SimVideoUrlModel simVideoUrlModel = (SimVideoUrlModel) aRunnableS0S1310100_23.l2;
        String str = aRunnableS0S1310100_23.s0;
        boolean z = aRunnableS0S1310100_23.z4;
        long j = aRunnableS0S1310100_23.j5;
        InterfaceC1475840oVa interfaceC1475840oVa = (InterfaceC1475840oVa) aRunnableS0S1310100_23.l3;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.copyCache$3L");
        videoPreloadManagerAsync.LJJZZI().LJJJJJL(simVideoUrlModel, str, z, j, interfaceC1475840oVa);
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.copyCache$3L");
    }

    public static final void run$3(ARunnableS0S1310100_23 aRunnableS0S1310100_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS0S1310100_23.l1;
        SimVideoUrlModel simVideoUrlModel = (SimVideoUrlModel) aRunnableS0S1310100_23.l2;
        String str = aRunnableS0S1310100_23.s0;
        boolean z = aRunnableS0S1310100_23.z4;
        long j = aRunnableS0S1310100_23.j5;
        InterfaceC1475840oVa interfaceC1475840oVa = (InterfaceC1475840oVa) aRunnableS0S1310100_23.l3;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.copyCache$4L");
        videoPreloadManagerAsync.LJJLL(new ARunnableS0S1310100_23(videoPreloadManagerAsync, simVideoUrlModel, interfaceC1475840oVa, j, str, z, 1));
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.copyCache$4L");
    }

    public ARunnableS0S1310100_23(Object obj, Object obj2, Object obj3, long j, String str, boolean z, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.l3 = obj3;
        this.j5 = j;
        this.s0 = str;
        this.z4 = z;
    }
}
