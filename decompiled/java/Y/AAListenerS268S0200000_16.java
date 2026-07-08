package Y;

import X.AlertDialogC1377870lxZ;
import X.C1035340d36;
import X.C994850bzn;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public class AAListenerS268S0200000_16 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onAnimationCancel$0(AAListenerS268S0200000_16 aAListenerS268S0200000_16, Animator animator) {
    }

    public static final void onAnimationCancel$1(AAListenerS268S0200000_16 aAListenerS268S0200000_16, Animator animator) {
    }

    public static final void onAnimationCancel$2(AAListenerS268S0200000_16 aAListenerS268S0200000_16, Animator animator) {
    }

    public static final void onAnimationCancel$3(AAListenerS268S0200000_16 aAListenerS268S0200000_16, Animator animator) {
    }

    public static final void onAnimationCancel$4(AAListenerS268S0200000_16 aAListenerS268S0200000_16, Animator animator) {
    }

    public static final void onAnimationCancel$5(AAListenerS268S0200000_16 aAListenerS268S0200000_16, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS268S0200000_16 aAListenerS268S0200000_16, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS268S0200000_16 aAListenerS268S0200000_16, Animator animator) {
    }

    public static final void onAnimationRepeat$2(AAListenerS268S0200000_16 aAListenerS268S0200000_16, Animator animator) {
    }

    public static final void onAnimationRepeat$3(AAListenerS268S0200000_16 aAListenerS268S0200000_16, Animator animator) {
    }

    public static final void onAnimationRepeat$4(AAListenerS268S0200000_16 aAListenerS268S0200000_16, Animator animator) {
    }

    public static final void onAnimationRepeat$5(AAListenerS268S0200000_16 aAListenerS268S0200000_16, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS268S0200000_16 aAListenerS268S0200000_16, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS268S0200000_16 aAListenerS268S0200000_16, Animator animator) {
    }

    public static final void onAnimationStart$2(AAListenerS268S0200000_16 aAListenerS268S0200000_16, Animator animator) {
    }

    public static final void onAnimationStart$4(AAListenerS268S0200000_16 aAListenerS268S0200000_16, Animator animator) {
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
            case 2:
                onAnimationCancel$2(this, animator);
                break;
            case 3:
                onAnimationCancel$3(this, animator);
                break;
            case 4:
                onAnimationCancel$4(this, animator);
                break;
            case 5:
                onAnimationCancel$5(this, animator);
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
            case 2:
                onAnimationEnd$2(this, animator);
                break;
            case 3:
                onAnimationEnd$3(this, animator);
                break;
            case 4:
                onAnimationEnd$4(this, animator);
                break;
            case 5:
                onAnimationEnd$5(this, animator);
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
            case 2:
                onAnimationRepeat$2(this, animator);
                break;
            case 3:
                onAnimationRepeat$3(this, animator);
                break;
            case 4:
                onAnimationRepeat$4(this, animator);
                break;
            case 5:
                onAnimationRepeat$5(this, animator);
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
            case 2:
                onAnimationStart$2(this, animator);
                break;
            case 3:
                onAnimationStart$3(this, animator);
                break;
            case 4:
                onAnimationStart$4(this, animator);
                break;
            case 5:
                onAnimationStart$5(this, animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(AAListenerS268S0200000_16 aAListenerS268S0200000_16, Animator animator) {
        ((C994850bzn) aAListenerS268S0200000_16.l0).LLJILJIL = new AnimatorSet();
        AnimatorSet animatorSet = ((C994850bzn) aAListenerS268S0200000_16.l0).LLJILJIL;
        if (animatorSet != null) {
            animatorSet.setDuration(300L);
        }
        AnimatorSet animatorSet2 = ((C994850bzn) aAListenerS268S0200000_16.l0).LLJILJIL;
        if (animatorSet2 != null) {
            animatorSet2.setInterpolator(new LinearInterpolator());
        }
        C994850bzn c994850bzn = (C994850bzn) aAListenerS268S0200000_16.l0;
        c994850bzn.LLJI = ObjectAnimator.ofFloat(c994850bzn, (Property<C994850bzn, Float>) View.SCALE_X, 1.2f, 1.0f);
        C994850bzn c994850bzn2 = (C994850bzn) aAListenerS268S0200000_16.l0;
        c994850bzn2.LLJ = ObjectAnimator.ofFloat(c994850bzn2, (Property<C994850bzn, Float>) View.SCALE_Y, 1.2f, 1.0f);
        C994850bzn c994850bzn3 = (C994850bzn) aAListenerS268S0200000_16.l0;
        AnimatorSet animatorSet3 = c994850bzn3.LLJILJIL;
        if (animatorSet3 != null) {
            animatorSet3.playTogether(c994850bzn3.LLJI, c994850bzn3.LLJ);
        }
        View view = (View) aAListenerS268S0200000_16.l1;
        if (view != null) {
            HandlerHook.viewPostDelay(view, new ARunnableS116S0100000_16((C994850bzn) aAListenerS268S0200000_16.l0, 99), 600L);
        }
    }

    public static final void onAnimationEnd$1(AAListenerS268S0200000_16 aAListenerS268S0200000_16, Animator animator) {
        C1035340d36 c1035340d36 = (C1035340d36) aAListenerS268S0200000_16.l0;
        if (c1035340d36.LLLF == null) {
            c1035340d36.LLLF = new ARunnableS116S0100000_16((AnimatorSet) aAListenerS268S0200000_16.l1, 116);
        }
        HandlerHook.viewPostDelay(c1035340d36.getAdBottomButtonNewFromXml(), ((C1035340d36) aAListenerS268S0200000_16.l0).LLLF, 400L);
    }

    public static final void onAnimationEnd$2(AAListenerS268S0200000_16 aAListenerS268S0200000_16, Animator animator) {
        C1035340d36 c1035340d36 = (C1035340d36) aAListenerS268S0200000_16.l0;
        if (c1035340d36.LLLFF == null) {
            c1035340d36.LLLFF = new ARunnableS85S0200000_16(c1035340d36, (ObjectAnimator) aAListenerS268S0200000_16.l1, 29);
        }
        HandlerHook.viewPostDelay(c1035340d36.getAdBottomButtonNewFromXml(), ((C1035340d36) aAListenerS268S0200000_16.l0).LLLFF, 400L);
    }

    public static final void onAnimationEnd$3(AAListenerS268S0200000_16 aAListenerS268S0200000_16, Animator animator) {
        ((Function0) aAListenerS268S0200000_16.l1).invoke();
    }

    public static final void onAnimationEnd$4(AAListenerS268S0200000_16 aAListenerS268S0200000_16, Animator animator) {
        ((View) aAListenerS268S0200000_16.l0).setClipToOutline(false);
        ((Function0) aAListenerS268S0200000_16.l1).invoke();
    }

    public static final void onAnimationEnd$5(AAListenerS268S0200000_16 aAListenerS268S0200000_16, Animator animator) {
        TextView textView = ((AlertDialogC1377870lxZ) aAListenerS268S0200000_16.l1).LLJIJIL;
        if (textView != null) {
            textView.setText(2131837961);
        }
    }

    public static final void onAnimationStart$3(AAListenerS268S0200000_16 aAListenerS268S0200000_16, Animator animator) {
        ((Function0) aAListenerS268S0200000_16.l0).invoke();
    }

    public static final void onAnimationStart$5(AAListenerS268S0200000_16 aAListenerS268S0200000_16, Animator animator) {
        HandlerHook.viewPost(((AlertDialogC1377870lxZ) aAListenerS268S0200000_16.l1).LLJJ, new ARunnableS116S0100000_16(aAListenerS268S0200000_16, 273));
    }

    public AAListenerS268S0200000_16(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj2;
        this.l0 = obj;
    }
}
