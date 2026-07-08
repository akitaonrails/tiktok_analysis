package Y;

import X.C0N0S;
import X.C1324720kZq;
import X.C1847050yAJ;
import X.C1847340yAm;
import X.C786410Ut5;
import android.animation.Animator;
import com.ss.android.ugc.aweme.live.WelcomeVideoPlayerDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes28.dex */
public class AAListenerS337S0100000_27 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;

    public static final void onAnimationCancel$0(AAListenerS337S0100000_27 aAListenerS337S0100000_27, Animator animator) {
    }

    public static final void onAnimationCancel$1(AAListenerS337S0100000_27 aAListenerS337S0100000_27, Animator animator) {
    }

    public static final void onAnimationCancel$2(AAListenerS337S0100000_27 aAListenerS337S0100000_27, Animator animator) {
    }

    public static final void onAnimationCancel$3(AAListenerS337S0100000_27 aAListenerS337S0100000_27, Animator animator) {
    }

    public static final void onAnimationCancel$4(AAListenerS337S0100000_27 aAListenerS337S0100000_27, Animator animator) {
    }

    public static final void onAnimationEnd$4(AAListenerS337S0100000_27 aAListenerS337S0100000_27, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS337S0100000_27 aAListenerS337S0100000_27, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS337S0100000_27 aAListenerS337S0100000_27, Animator animator) {
    }

    public static final void onAnimationRepeat$2(AAListenerS337S0100000_27 aAListenerS337S0100000_27, Animator animator) {
    }

    public static final void onAnimationRepeat$3(AAListenerS337S0100000_27 aAListenerS337S0100000_27, Animator animator) {
    }

    public static final void onAnimationRepeat$4(AAListenerS337S0100000_27 aAListenerS337S0100000_27, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS337S0100000_27 aAListenerS337S0100000_27, Animator animator) {
    }

    public static final void onAnimationStart$3(AAListenerS337S0100000_27 aAListenerS337S0100000_27, Animator animator) {
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
        }
    }

    public AAListenerS337S0100000_27(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationEnd$0(AAListenerS337S0100000_27 aAListenerS337S0100000_27, Animator animator) {
        C1324720kZq c1324720kZq = (C1324720kZq) aAListenerS337S0100000_27.l0;
        if (c1324720kZq != null) {
            C786410Ut5.LLJJIII(c1324720kZq, 8);
        }
    }

    public static final void onAnimationEnd$1(AAListenerS337S0100000_27 aAListenerS337S0100000_27, Animator animator) {
        ((C1847050yAJ) aAListenerS337S0100000_27.l0).LIZJ(false);
    }

    public static final void onAnimationEnd$2(AAListenerS337S0100000_27 aAListenerS337S0100000_27, Animator animator) {
        ((WelcomeVideoPlayerDialogFragment) aAListenerS337S0100000_27.l0).dismiss();
        ((WelcomeVideoPlayerDialogFragment) aAListenerS337S0100000_27.l0).onDestroy();
        ((WelcomeVideoPlayerDialogFragment) aAListenerS337S0100000_27.l0).getClass();
    }

    public static final void onAnimationEnd$3(AAListenerS337S0100000_27 aAListenerS337S0100000_27, Animator animator) {
        ((C1847340yAm) aAListenerS337S0100000_27.l0).LIZ.LJIIIIZZ(Unit.LIZ);
    }

    public static final void onAnimationStart$1(AAListenerS337S0100000_27 aAListenerS337S0100000_27, Animator animator) {
        ((C1847050yAJ) aAListenerS337S0100000_27.l0).LIZJ(true);
    }

    public static final void onAnimationStart$2(AAListenerS337S0100000_27 aAListenerS337S0100000_27, Animator animator) {
        C0N0S c0n0s = ((WelcomeVideoPlayerDialogFragment) aAListenerS337S0100000_27.l0).LLIZLLLIL;
        if (c0n0s != null) {
            c0n0s.mute();
        }
    }

    public static final void onAnimationStart$4(AAListenerS337S0100000_27 aAListenerS337S0100000_27, Animator animator) {
        Function0 function0 = (Function0) aAListenerS337S0100000_27.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
