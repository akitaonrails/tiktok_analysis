package Y;

import X.C1475000oUE;
import X.C1475090oUN;
import X.C1477400oY6;
import X.C1C7U;
import X.InterfaceC1475840oVa;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.video.preload.VideoPreloadManagerAsync;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS0S2220000_23 implements Runnable {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;
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
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS0S2220000_23 aRunnableS0S2220000_23) {
        ARunnableS0S1220000_23 aRunnableS0S1220000_23 = (ARunnableS0S1220000_23) aRunnableS0S2220000_23.l2;
        List list = (List) aRunnableS0S2220000_23.l3;
        boolean z = aRunnableS0S2220000_23.z4;
        boolean z2 = aRunnableS0S2220000_23.z5;
        String str = aRunnableS0S2220000_23.s0;
        String str2 = aRunnableS0S2220000_23.s1;
        aRunnableS0S1220000_23.getClass();
        C1C7U.LIZ("EnginePreloaderMediaHelper@3874.addMedias$1$1L");
        try {
            ((C1475090oUN) aRunnableS0S1220000_23.l2).LIZ(str, list, z, z2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1475000oUE.LJIIIIZZ().ensureNotReachHere(e, "addMedias fail.");
            C1477400oY6.LJJJJI.LJJIJ(str2, "add_error");
        }
        C1C7U.LIZIZ("EnginePreloaderMediaHelper@3874.addMedias$1$1L");
    }

    public static final void run$1(ARunnableS0S2220000_23 aRunnableS0S2220000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS0S2220000_23.l2;
        String str = aRunnableS0S2220000_23.s0;
        String str2 = aRunnableS0S2220000_23.s1;
        boolean z = aRunnableS0S2220000_23.z4;
        boolean z2 = aRunnableS0S2220000_23.z5;
        InterfaceC1475840oVa interfaceC1475840oVa = (InterfaceC1475840oVa) aRunnableS0S2220000_23.l3;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.copyCache$6L$1L");
        videoPreloadManagerAsync.LJJZZI().LJIIIZ(str, str2, z, z2, interfaceC1475840oVa);
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.copyCache$6L$1L");
    }

    public static final void run$2(ARunnableS0S2220000_23 aRunnableS0S2220000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS0S2220000_23.l2;
        String str = aRunnableS0S2220000_23.s0;
        String str2 = aRunnableS0S2220000_23.s1;
        boolean z = aRunnableS0S2220000_23.z4;
        boolean z2 = aRunnableS0S2220000_23.z5;
        InterfaceC1475840oVa interfaceC1475840oVa = (InterfaceC1475840oVa) aRunnableS0S2220000_23.l3;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.copyCache$5L");
        videoPreloadManagerAsync.LJJZZI().LJIIIZ(str, str2, z, z2, interfaceC1475840oVa);
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.copyCache$5L");
    }

    public static final void run$3(ARunnableS0S2220000_23 aRunnableS0S2220000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS0S2220000_23.l2;
        String str = aRunnableS0S2220000_23.s0;
        String str2 = aRunnableS0S2220000_23.s1;
        boolean z = aRunnableS0S2220000_23.z4;
        boolean z2 = aRunnableS0S2220000_23.z5;
        InterfaceC1475840oVa interfaceC1475840oVa = (InterfaceC1475840oVa) aRunnableS0S2220000_23.l3;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.copyCache$6L");
        videoPreloadManagerAsync.LJJLL(new ARunnableS0S2220000_23(videoPreloadManagerAsync, interfaceC1475840oVa, z, z2, str, str2, 1));
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.copyCache$6L");
    }

    public ARunnableS0S2220000_23(Object obj, Object obj2, boolean z, boolean z2, String str, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.l3 = obj2;
        this.z4 = z;
        this.z5 = z2;
        this.s0 = str;
        this.s1 = str2;
    }
}
