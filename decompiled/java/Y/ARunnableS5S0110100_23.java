package Y;

import X.C1C7U;
import X.InterfaceC1493160oxW;
import com.ss.android.ugc.aweme.video.preload.VideoPreloadManagerAsync;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS5S0110100_23 implements Runnable {
    public final int $t;
    public long j2;
    public Object l0;
    public boolean z1;

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

    public static final void run$0(ARunnableS5S0110100_23 aRunnableS5S0110100_23) {
        boolean zLIZ;
        C1C7U.LIZ("TTMultiNetwork@9111.notifyUserSpecifiedNetworkEnabled$1");
        try {
            ((InterfaceC1493160oxW) aRunnableS5S0110100_23.l0).onUserSpecifiedNetworkEnabled(aRunnableS5S0110100_23.z1, aRunnableS5S0110100_23.j2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTMultiNetwork@9111.notifyUserSpecifiedNetworkEnabled$1");
    }

    public static final void run$1(ARunnableS5S0110100_23 aRunnableS5S0110100_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS5S0110100_23.l0;
        long j = aRunnableS5S0110100_23.j2;
        boolean z = aRunnableS5S0110100_23.z1;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.tryToClearAndGetCachesByUsedTime$1L");
        videoPreloadManagerAsync.LJJZZI().LJIILJJIL(j, z);
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.tryToClearAndGetCachesByUsedTime$1L");
    }

    public static final void run$2(ARunnableS5S0110100_23 aRunnableS5S0110100_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS5S0110100_23.l0;
        long j = aRunnableS5S0110100_23.j2;
        boolean z = aRunnableS5S0110100_23.z1;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.tryToClearAndGetCachesByUsedTime$2L");
        videoPreloadManagerAsync.LJJLL(new ARunnableS5S0110100_23(videoPreloadManagerAsync, z, j, 3));
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.tryToClearAndGetCachesByUsedTime$2L");
    }

    public static final void run$3(ARunnableS5S0110100_23 aRunnableS5S0110100_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS5S0110100_23.l0;
        long j = aRunnableS5S0110100_23.j2;
        boolean z = aRunnableS5S0110100_23.z1;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.tryToClearAndGetCachesByUsedTime$2L$1L");
        videoPreloadManagerAsync.LJJZZI().LJIILJJIL(j, z);
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.tryToClearAndGetCachesByUsedTime$2L$1L");
    }

    public ARunnableS5S0110100_23(Object obj, boolean z, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
        this.j2 = j;
    }
}
