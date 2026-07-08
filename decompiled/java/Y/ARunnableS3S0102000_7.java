package Y;

import X.C0IEG;
import X.C1C7U;
import X.C474990Ijx;
import X.C786410Ut5;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;

/* JADX INFO: loaded from: classes8.dex */
public class ARunnableS3S0102000_7 implements Runnable {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

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

    public static final void run$0(ARunnableS3S0102000_7 aRunnableS3S0102000_7) {
        LivePlayFragment livePlayFragment = (LivePlayFragment) aRunnableS3S0102000_7.l0;
        int i = aRunnableS3S0102000_7.i1;
        int i2 = aRunnableS3S0102000_7.i2;
        String str = LivePlayFragment._pnsPageId;
        livePlayFragment.getClass();
        C1C7U.LIZ("LivePlayFragment@afba.tryStartPrePullStream$1L");
        C0IEG c0iegAU = livePlayFragment.AU();
        if ((c0iegAU instanceof LiveRoomFragment) && c0iegAU.getCurrentFragment() == livePlayFragment) {
            c0iegAU.DF(livePlayFragment, i, i2);
        }
        C1C7U.LIZIZ("LivePlayFragment@afba.tryStartPrePullStream$1L");
    }

    public static final void run$1(ARunnableS3S0102000_7 aRunnableS3S0102000_7) {
        boolean zLIZ;
        C1C7U.LIZ("ShowLocationUtilSub@4c26.highLight$1");
        try {
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(((C474990Ijx) aRunnableS3S0102000_7.l0).LIZ, "backgroundColor", aRunnableS3S0102000_7.i1, aRunnableS3S0102000_7.i2);
            objectAnimatorOfInt.setDuration(3000L);
            objectAnimatorOfInt.setEvaluator(new ArgbEvaluator());
            C786410Ut5.Pd(objectAnimatorOfInt);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShowLocationUtilSub@4c26.highLight$1");
    }

    public ARunnableS3S0102000_7(Object obj, int i, int i2, int i3) {
        this.$t = i3;
        this.l0 = obj;
        this.i1 = i;
        this.i2 = i2;
    }
}
