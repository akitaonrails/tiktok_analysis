package Y;

import X.C12O7;
import X.C16F5;
import X.C473410IhP;
import android.animation.Animator;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import kotlin.Pair;

/* JADX INFO: loaded from: classes30.dex */
public class AAListenerS92S0101000_29 implements Animator.AnimatorListener {
    public final int $t;
    public int i1;
    public Object l0;

    public static final void onAnimationCancel$0(AAListenerS92S0101000_29 aAListenerS92S0101000_29, Animator animator) {
    }

    public static final void onAnimationCancel$1(AAListenerS92S0101000_29 aAListenerS92S0101000_29, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS92S0101000_29 aAListenerS92S0101000_29, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS92S0101000_29 aAListenerS92S0101000_29, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS92S0101000_29 aAListenerS92S0101000_29, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS92S0101000_29 aAListenerS92S0101000_29, Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 1:
                onAnimationCancel$1(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animator);
                break;
            case 1:
                onAnimationRepeat$1(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(AAListenerS92S0101000_29 aAListenerS92S0101000_29, Animator animator) {
        C16F5 c16f5 = ((C12O7) aAListenerS92S0101000_29.l0).LJII;
        if (c16f5 != null) {
            c16f5.setText(C12O7.LJIL(aAListenerS92S0101000_29.i1));
        }
        C12O7 c12o7 = (C12O7) aAListenerS92S0101000_29.l0;
        c12o7.LJFF = false;
        Pair<Integer, Integer> pairPoll = c12o7.LJ.poll();
        if (pairPoll != null) {
            c12o7.LJFF = true;
            C473410IhP.LIZJ(new ARunnableS98S0200000_29(c12o7, pairPoll, 70), 1000L);
        }
    }

    public static final void onAnimationEnd$1(AAListenerS92S0101000_29 aAListenerS92S0101000_29, Animator animator) {
        C16F5 c16f5 = ((C12O7) aAListenerS92S0101000_29.l0).LJII;
        if (c16f5 != null) {
            c16f5.setText(C12O7.LJIL(aAListenerS92S0101000_29.i1));
        }
        C12O7 c12o7 = (C12O7) aAListenerS92S0101000_29.l0;
        LiveIconView liveIconView = c12o7.LJI;
        if (liveIconView != null) {
            liveIconView.setIconTint(c12o7.LJIIL);
        }
        C12O7 c12o72 = (C12O7) aAListenerS92S0101000_29.l0;
        c12o72.LJFF = false;
        Pair<Integer, Integer> pairPoll = c12o72.LJ.poll();
        if (pairPoll != null) {
            c12o72.LJFF = true;
            C473410IhP.LIZJ(new ARunnableS98S0200000_29(c12o72, pairPoll, 70), 1000L);
        }
    }

    public AAListenerS92S0101000_29(C12O7 c12o7, int i, int i2) {
        this.$t = i2;
        this.l0 = c12o7;
        this.i1 = i;
    }
}
