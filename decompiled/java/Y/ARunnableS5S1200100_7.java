package Y;

import X.C1C7U;
import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendedRoom;
import com.ss.android.ugc.aweme.hangout.component.interact.view.HangoutInteractModuleV2Assem;
import com.ss.android.ugc.aweme.hangout.component.interact.view.MultiTopLiveRandomMatchFragment;

/* JADX INFO: loaded from: classes8.dex */
public class ARunnableS5S1200100_7 implements Runnable {
    public final int $t;
    public long j3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS5S1200100_7 aRunnableS5S1200100_7) {
        boolean zLIZ;
        C1C7U.LIZ("HangoutInteractModuleV2Assem@14fa.handleMatchSuccess$3");
        try {
            ((HangoutInteractModuleV2Assem) aRunnableS5S1200100_7.l1).hp(Long.valueOf(((RecommendedRoom) aRunnableS5S1200100_7.l2).anchorId), aRunnableS5S1200100_7.s0, Long.valueOf(aRunnableS5S1200100_7.j3), ((HangoutInteractModuleV2Assem) aRunnableS5S1200100_7.l1).LLLFF);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("HangoutInteractModuleV2Assem@14fa.handleMatchSuccess$3");
    }

    public static final void run$1(ARunnableS5S1200100_7 aRunnableS5S1200100_7) {
        boolean zLIZ;
        C1C7U.LIZ("MultiTopLiveRandomMatchFragment@5d7e.initStateObserver$1$1$1");
        try {
            ((MultiTopLiveRandomMatchFragment) aRunnableS5S1200100_7.l2).SR("StartRandomMatchSucceed", "match_success", aRunnableS5S1200100_7.s0, Long.valueOf(((RecommendedRoom) aRunnableS5S1200100_7.l1).anchorId), Long.valueOf(aRunnableS5S1200100_7.j3));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiTopLiveRandomMatchFragment@5d7e.initStateObserver$1$1$1");
    }

    public ARunnableS5S1200100_7(Object obj, Object obj2, String str, long j, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
        this.j3 = j;
    }
}
