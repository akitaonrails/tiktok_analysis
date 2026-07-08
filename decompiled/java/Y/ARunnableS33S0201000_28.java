package Y;

import X.C1C7U;
import android.view.View;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.notification.v2.MergedNotificationFragment;

/* JADX INFO: loaded from: classes29.dex */
public class ARunnableS33S0201000_28 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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

    public static final void run$0(ARunnableS33S0201000_28 aRunnableS33S0201000_28) {
        boolean zLIZ;
        C1C7U.LIZ("ViewPagerBottomSheetBehavior@4870.setState$1");
        try {
            ((ViewPagerBottomSheetBehavior) aRunnableS33S0201000_28.l1).startSettlingAnimation((View) aRunnableS33S0201000_28.l0, aRunnableS33S0201000_28.i2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ViewPagerBottomSheetBehavior@4870.setState$1");
    }

    public static final void run$1(ARunnableS33S0201000_28 aRunnableS33S0201000_28) {
        boolean zLIZ;
        C1C7U.LIZ("MergedNotificationFragment@934f.onViewCreated$1$onPreDraw$1");
        try {
            if (((View) aRunnableS33S0201000_28.l0).isAttachedToWindow()) {
                ((MergedNotificationFragment) aRunnableS33S0201000_28.l1).UR(aRunnableS33S0201000_28.i2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MergedNotificationFragment@934f.onViewCreated$1$onPreDraw$1");
    }

    public static final void run$2(ARunnableS33S0201000_28 aRunnableS33S0201000_28) {
        boolean zLIZ;
        C1C7U.LIZ("ViewPagerBottomSheetBehavior@9e5a.setState$1");
        try {
            ((com.ss.android.ugc.aweme.shortvideo.sticker.poll.ViewPagerBottomSheetBehavior) aRunnableS33S0201000_28.l1).startSettlingAnimation((View) aRunnableS33S0201000_28.l0, aRunnableS33S0201000_28.i2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ViewPagerBottomSheetBehavior@9e5a.setState$1");
    }

    public ARunnableS33S0201000_28(com.ss.android.ugc.aweme.shortvideo.sticker.poll.ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior, View view, int i) {
        this.$t = i;
        this.l1 = viewPagerBottomSheetBehavior;
        this.l0 = view;
        this.i2 = 4;
    }

    public ARunnableS33S0201000_28(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
