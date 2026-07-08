package Y;

import X.C1C7U;
import X.InterfaceC1475840oVa;
import com.ss.android.ugc.aweme.video.preload.VideoPreloadManagerAsync;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS0S1320000_23 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;
    public boolean z4;
    public boolean z5;

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

    public static final void run$0(ARunnableS0S1320000_23 aRunnableS0S1320000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS0S1320000_23.l1;
        SimVideoUrlModel simVideoUrlModel = (SimVideoUrlModel) aRunnableS0S1320000_23.l2;
        String str = aRunnableS0S1320000_23.s0;
        boolean z = aRunnableS0S1320000_23.z4;
        boolean z2 = aRunnableS0S1320000_23.z5;
        InterfaceC1475840oVa interfaceC1475840oVa = (InterfaceC1475840oVa) aRunnableS0S1320000_23.l3;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.copyCache$1L");
        videoPreloadManagerAsync.LJJZZI().LJJIFFI(simVideoUrlModel, str, z, z2, interfaceC1475840oVa);
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.copyCache$1L");
    }

    public static final void run$1(ARunnableS0S1320000_23 aRunnableS0S1320000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS0S1320000_23.l1;
        SimVideoUrlModel simVideoUrlModel = (SimVideoUrlModel) aRunnableS0S1320000_23.l2;
        String str = aRunnableS0S1320000_23.s0;
        boolean z = aRunnableS0S1320000_23.z4;
        boolean z2 = aRunnableS0S1320000_23.z5;
        InterfaceC1475840oVa interfaceC1475840oVa = (InterfaceC1475840oVa) aRunnableS0S1320000_23.l3;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.copyCache$2L");
        videoPreloadManagerAsync.LJJLL(new ARunnableS0S1320000_23(videoPreloadManagerAsync, simVideoUrlModel, str, z, z2, interfaceC1475840oVa, 2));
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.copyCache$2L");
    }

    public static final void run$2(ARunnableS0S1320000_23 aRunnableS0S1320000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS0S1320000_23.l1;
        SimVideoUrlModel simVideoUrlModel = (SimVideoUrlModel) aRunnableS0S1320000_23.l2;
        String str = aRunnableS0S1320000_23.s0;
        boolean z = aRunnableS0S1320000_23.z4;
        boolean z2 = aRunnableS0S1320000_23.z5;
        InterfaceC1475840oVa interfaceC1475840oVa = (InterfaceC1475840oVa) aRunnableS0S1320000_23.l3;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.copyCache$2L$1L");
        videoPreloadManagerAsync.LJJZZI().LJJIFFI(simVideoUrlModel, str, z, z2, interfaceC1475840oVa);
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.copyCache$2L$1L");
    }

    public ARunnableS0S1320000_23(VideoPreloadManagerAsync videoPreloadManagerAsync, SimVideoUrlModel simVideoUrlModel, String str, boolean z, boolean z2, InterfaceC1475840oVa interfaceC1475840oVa, int i) {
        this.$t = i;
        this.l1 = videoPreloadManagerAsync;
        this.l2 = simVideoUrlModel;
        this.s0 = str;
        this.z4 = z;
        this.z5 = z2;
        this.l3 = interfaceC1475840oVa;
    }
}
