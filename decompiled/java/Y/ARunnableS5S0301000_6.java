package Y;

import X.C1C7U;
import X.C420880Ges;
import android.animation.AnimatorSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public class ARunnableS5S0301000_6 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public final void LIZ$0() {
        int iIntValue = ((Number) ((Function1) this.l0).invoke((View) this.l1)).intValue();
        if (iIntValue > 0) {
            ((RecyclerView) this.l2).scrollBy(0, iIntValue);
            new Pair("targetPos", Integer.valueOf(this.i3));
            new Pair("scrollAmount", Integer.valueOf(iIntValue));
        }
    }

    public static final void run$0(ARunnableS5S0301000_6 aRunnableS5S0301000_6) {
        boolean zLIZ;
        C1C7U.LIZ("AdjustableFooterUtilKt@6ea4.scrollItemCheck$1");
        try {
            aRunnableS5S0301000_6.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AdjustableFooterUtilKt@6ea4.scrollItemCheck$1");
    }

    public static final void run$1(ARunnableS5S0301000_6 aRunnableS5S0301000_6) {
        boolean zLIZ;
        C1C7U.LIZ("AvatarSwingAnimator@fe1d.attachToView$1$onAnimationEnd$1");
        try {
            if (Intrinsics.LJFF(((C420880Ges) aRunnableS5S0301000_6.l0).LIZ, (AnimatorSet) aRunnableS5S0301000_6.l1)) {
                C420880Ges c420880Ges = (C420880Ges) aRunnableS5S0301000_6.l0;
                View view = (View) aRunnableS5S0301000_6.l2;
                int i = aRunnableS5S0301000_6.i3;
                AnimatorSet animatorSet = c420880Ges.LIZ;
                if (animatorSet != null && animatorSet.isRunning()) {
                    animatorSet.cancel();
                }
                c420880Ges.LIZ(i, view);
                AnimatorSet animatorSet2 = c420880Ges.LIZ;
                if (animatorSet2 != null) {
                    animatorSet2.start();
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AvatarSwingAnimator@fe1d.attachToView$1$onAnimationEnd$1");
    }

    public ARunnableS5S0301000_6(int i, Object obj, Object obj2, Object obj3, int i2) {
        this.$t = i2;
        this.l0 = obj3;
        this.l1 = obj;
        this.l2 = obj2;
        this.i3 = i;
    }
}
