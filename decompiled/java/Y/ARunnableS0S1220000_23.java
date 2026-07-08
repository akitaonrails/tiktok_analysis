package Y;

import X.C1475000oUE;
import X.C1475090oUN;
import X.C1477400oY6;
import X.C1C7U;
import X.C786410Ut5;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.video.preload.VideoPreloadManagerAsync;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS0S1220000_23 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;
    public boolean z3;
    public boolean z4;

    public final void LIZ$0() {
        List list = (List) this.l1;
        String sourceId = (list == null || list.size() <= 0 || ListProtector.get((List) this.l1, 0) == null) ? null : ((SimVideoUrlModel) ListProtector.get((List) this.l1, 0)).getSourceId();
        try {
            C786410Ut5.LJJZZIII(((C1475090oUN) this.l2).LIZ.LJIIJ, new ARunnableS0S2220000_23(this, ((C1475090oUN) this.l2).LIZLLL(this.s0, (List) this.l1, this.z3), this.z3, this.z4, this.s0, sourceId, 0));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1475000oUE.LJIIIIZZ().ensureNotReachHere(e, "addMedias fail.");
            C1477400oY6.LJJJJI.LJJIJ(sourceId, "add_error_2");
        }
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS0S1220000_23 aRunnableS0S1220000_23) {
        boolean zLIZ;
        C1C7U.LIZ("EnginePreloaderMediaHelper@3874.addMedias$1");
        try {
            aRunnableS0S1220000_23.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EnginePreloaderMediaHelper@3874.addMedias$1");
    }

    public static final void run$1(ARunnableS0S1220000_23 aRunnableS0S1220000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS0S1220000_23.l1;
        List list = (List) aRunnableS0S1220000_23.l2;
        boolean z = aRunnableS0S1220000_23.z3;
        boolean z2 = aRunnableS0S1220000_23.z4;
        String str = aRunnableS0S1220000_23.s0;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.addMedias$1L");
        videoPreloadManagerAsync.LJJZZI().LJIJ(str, list, z, z2);
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.addMedias$1L");
    }

    public static final void run$2(ARunnableS0S1220000_23 aRunnableS0S1220000_23) {
        VideoPreloadManagerAsync videoPreloadManagerAsync = (VideoPreloadManagerAsync) aRunnableS0S1220000_23.l1;
        List list = (List) aRunnableS0S1220000_23.l2;
        boolean z = aRunnableS0S1220000_23.z3;
        boolean z2 = aRunnableS0S1220000_23.z4;
        String str = aRunnableS0S1220000_23.s0;
        videoPreloadManagerAsync.getClass();
        C1C7U.LIZ("VideoPreloadManagerAsync@f0ac.addMedias$2L");
        videoPreloadManagerAsync.LJJZZI().LJIJ(str, list, z, z2);
        C1C7U.LIZIZ("VideoPreloadManagerAsync@f0ac.addMedias$2L");
    }

    public ARunnableS0S1220000_23(Object obj, Object obj2, boolean z, boolean z2, String str, int i) {
        this.$t = i;
        this.l2 = obj;
        this.l1 = obj2;
        this.z3 = z;
        this.z4 = z2;
        this.s0 = str;
    }
}
