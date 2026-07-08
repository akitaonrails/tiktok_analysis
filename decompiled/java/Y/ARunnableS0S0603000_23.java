package Y;

import X.C0NKD;
import X.C1475150oUT;
import X.C1475410oUt;
import X.C1C7U;
import com.ss.android.ugc.aweme.video.preload.VideoPreloadManagerAsync;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS0S0603000_23 implements Runnable {
    public final int $t;
    public int i6;
    public int i7;
    public int i8;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

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

    public static final void run$0(ARunnableS0S0603000_23 aRunnableS0S0603000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS0S0603000_23.l0;
        SimVideoUrlModel simVideoUrlModel = (SimVideoUrlModel) aRunnableS0S0603000_23.l1;
        int i = aRunnableS0S0603000_23.i6;
        C0NKD c0nkd = (C0NKD) aRunnableS0S0603000_23.l2;
        C1475410oUt c1475410oUt = (C1475410oUt) aRunnableS0S0603000_23.l3;
        List list = (List) aRunnableS0S0603000_23.l4;
        int i2 = aRunnableS0S0603000_23.i7;
        List list2 = (List) aRunnableS0S0603000_23.l5;
        int i3 = aRunnableS0S0603000_23.i8;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.preload$2L$1L");
        videoPreloadManagerAsync.LJJZZI().LJJJLZIJ(simVideoUrlModel, Math.max(i, 0), c0nkd, c1475410oUt);
        videoPreloadManagerAsync.LJJZZI().LJJLIIIJLJLI(i2, list);
        videoPreloadManagerAsync.LJJZZI().LJJLI(i3, list2);
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.preload$2L$1L");
    }

    public static final void run$1(ARunnableS0S0603000_23 aRunnableS0S0603000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS0S0603000_23.l0;
        SimVideoUrlModel simVideoUrlModel = (SimVideoUrlModel) aRunnableS0S0603000_23.l1;
        int i = aRunnableS0S0603000_23.i6;
        C0NKD c0nkd = (C0NKD) aRunnableS0S0603000_23.l2;
        C1475410oUt c1475410oUt = (C1475410oUt) aRunnableS0S0603000_23.l3;
        List list = (List) aRunnableS0S0603000_23.l4;
        int i2 = aRunnableS0S0603000_23.i7;
        List list2 = (List) aRunnableS0S0603000_23.l5;
        int i3 = aRunnableS0S0603000_23.i8;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.preload$1L");
        videoPreloadManagerAsync.LJJZZI().LJJJLZIJ(simVideoUrlModel, Math.max(i, 0), c0nkd, c1475410oUt);
        videoPreloadManagerAsync.LJJZZI().LJJLIIIJLJLI(i2, list);
        videoPreloadManagerAsync.LJJZZI().LJJLI(i3, list2);
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.preload$1L");
    }

    public static final void run$2(ARunnableS0S0603000_23 aRunnableS0S0603000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS0S0603000_23.l0;
        SimVideoUrlModel simVideoUrlModel = (SimVideoUrlModel) aRunnableS0S0603000_23.l1;
        int i = aRunnableS0S0603000_23.i6;
        C0NKD c0nkd = (C0NKD) aRunnableS0S0603000_23.l2;
        C1475410oUt c1475410oUt = (C1475410oUt) aRunnableS0S0603000_23.l3;
        List list = (List) aRunnableS0S0603000_23.l4;
        int i2 = aRunnableS0S0603000_23.i7;
        List list2 = (List) aRunnableS0S0603000_23.l5;
        int i3 = aRunnableS0S0603000_23.i8;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.preload$2L");
        if (!C1475150oUT.LIZIZ(simVideoUrlModel)) {
            C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.preload$2L");
        } else {
            videoPreloadManagerAsync.LJJLL(new ARunnableS0S0603000_23(videoPreloadManagerAsync, simVideoUrlModel, i, c0nkd, c1475410oUt, list, i2, list2, i3, 0));
            C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.preload$2L");
        }
    }

    public ARunnableS0S0603000_23(Object obj, Object obj2, int i, Object obj3, Object obj4, Object obj5, int i2, Object obj6, int i3, int i4) {
        this.$t = i4;
        this.l0 = obj;
        this.l1 = obj2;
        this.i6 = i;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
        this.i7 = i2;
        this.l5 = obj6;
        this.i8 = i3;
    }
}
