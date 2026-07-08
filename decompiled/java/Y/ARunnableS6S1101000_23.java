package Y;

import X.C08VH;
import X.C1468940oKS;
import X.C1C7U;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.video.preload.VideoPreloadManagerAsync;
import com.ttnet.org.chromium.net.impl.CronetWebsocketConnection;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS6S1101000_23 implements Runnable {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    public static final void run$1(ARunnableS6S1101000_23 aRunnableS6S1101000_23) {
        C1468940oKS.i((C1468940oKS) aRunnableS6S1101000_23.l1, aRunnableS6S1101000_23.i2, aRunnableS6S1101000_23.s0);
    }

    public static final void run$2(ARunnableS6S1101000_23 aRunnableS6S1101000_23) {
        C1468940oKS.LLZZLLIL((C1468940oKS) aRunnableS6S1101000_23.l1, aRunnableS6S1101000_23.i2, aRunnableS6S1101000_23.s0);
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS6S1101000_23 aRunnableS6S1101000_23) {
        boolean zLIZ;
        C1C7U.LIZ("CronetWebsocketConnection@25f3.onConnectionStateChanged$1");
        try {
            try {
                CronetWebsocketConnection cronetWebsocketConnection = (CronetWebsocketConnection) aRunnableS6S1101000_23.l1;
                cronetWebsocketConnection.LIZIZ.onConnectionStateChanged(cronetWebsocketConnection, aRunnableS6S1101000_23.i2, aRunnableS6S1101000_23.s0);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C08VH.LIZ("Exception in callback: ", e);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CronetWebsocketConnection@25f3.onConnectionStateChanged$1");
    }

    public static final void run$3(ARunnableS6S1101000_23 aRunnableS6S1101000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS6S1101000_23.l1;
        int i = aRunnableS6S1101000_23.i2;
        String str = aRunnableS6S1101000_23.s0;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.businessEvent$3L");
        videoPreloadManagerAsync.LJJZZI().LJJJJIZL(i, str);
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.businessEvent$3L");
    }

    public static final void run$4(ARunnableS6S1101000_23 aRunnableS6S1101000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS6S1101000_23.l1;
        int i = aRunnableS6S1101000_23.i2;
        String str = aRunnableS6S1101000_23.s0;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.businessEvent$4L");
        videoPreloadManagerAsync.LJJLL(new ARunnableS6S1101000_23(videoPreloadManagerAsync, i, str, 5));
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.businessEvent$4L");
    }

    public static final void run$5(ARunnableS6S1101000_23 aRunnableS6S1101000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS6S1101000_23.l1;
        int i = aRunnableS6S1101000_23.i2;
        String str = aRunnableS6S1101000_23.s0;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.businessEvent$4L$1L");
        videoPreloadManagerAsync.LJJZZI().LJJJJIZL(i, str);
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.businessEvent$4L$1L");
    }

    public ARunnableS6S1101000_23(Object obj, int i, String str, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.i2 = i;
        this.s0 = str;
    }
}
