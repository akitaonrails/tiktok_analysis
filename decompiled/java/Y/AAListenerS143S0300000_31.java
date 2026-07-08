package Y;

import X.C15AI;
import X.C204748159u;
import X.C204750159w;
import X.C204751159x;
import android.animation.Animator;
import android.animation.AnimatorSet;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes32.dex */
public class AAListenerS143S0300000_31 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public static final void onAnimationRepeat$0(AAListenerS143S0300000_31 aAListenerS143S0300000_31, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS143S0300000_31 aAListenerS143S0300000_31, Animator animator) {
    }

    public static final void onAnimationRepeat$2(AAListenerS143S0300000_31 aAListenerS143S0300000_31, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS143S0300000_31 aAListenerS143S0300000_31, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS143S0300000_31 aAListenerS143S0300000_31, Animator animator) {
    }

    public static final void onAnimationStart$2(AAListenerS143S0300000_31 aAListenerS143S0300000_31, Animator animator) {
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
        }
    }

    public static final void onAnimationCancel$0(AAListenerS143S0300000_31 aAListenerS143S0300000_31, Animator animator) {
        C204748159u c204748159u = (C204748159u) aAListenerS143S0300000_31.l0;
        c204748159u.getClass();
        C15AI.LJFF(c204748159u, "onAnimationCancel");
        ((AnimatorSet) aAListenerS143S0300000_31.l1).removeAllListeners();
        Function2 function2 = (Function2) aAListenerS143S0300000_31.l2;
        if (function2 != null) {
            function2.invoke(Boolean.TRUE, null);
        }
    }

    public static final void onAnimationCancel$1(AAListenerS143S0300000_31 aAListenerS143S0300000_31, Animator animator) {
        C204750159w c204750159w = (C204750159w) aAListenerS143S0300000_31.l0;
        c204750159w.getClass();
        C15AI.LJFF(c204750159w, "onAnimationCancel");
        ((AnimatorSet) aAListenerS143S0300000_31.l1).removeAllListeners();
        Function2 function2 = (Function2) aAListenerS143S0300000_31.l2;
        if (function2 != null) {
            function2.invoke(Boolean.TRUE, null);
        }
    }

    public static final void onAnimationCancel$2(AAListenerS143S0300000_31 aAListenerS143S0300000_31, Animator animator) {
        C204751159x c204751159x = (C204751159x) aAListenerS143S0300000_31.l0;
        c204751159x.getClass();
        C15AI.LJFF(c204751159x, "onAnimationCancel");
        ((AnimatorSet) aAListenerS143S0300000_31.l1).removeAllListeners();
        Function2 function2 = (Function2) aAListenerS143S0300000_31.l2;
        if (function2 != null) {
            function2.invoke(Boolean.TRUE, null);
        }
    }

    public static final void onAnimationEnd$0(AAListenerS143S0300000_31 aAListenerS143S0300000_31, Animator animator) {
        C204748159u c204748159u = (C204748159u) aAListenerS143S0300000_31.l0;
        c204748159u.getClass();
        C15AI.LJFF(c204748159u, "onAnimationEnd");
        ((AnimatorSet) aAListenerS143S0300000_31.l1).removeAllListeners();
        HandlerHook.viewPost((C204748159u) aAListenerS143S0300000_31.l0, new ARunnableS104S0100000_4((Function2) aAListenerS143S0300000_31.l2, 61));
    }

    public static final void onAnimationEnd$1(AAListenerS143S0300000_31 aAListenerS143S0300000_31, Animator animator) {
        C204750159w c204750159w = (C204750159w) aAListenerS143S0300000_31.l0;
        c204750159w.getClass();
        C15AI.LJFF(c204750159w, "onAnimationEnd");
        ((AnimatorSet) aAListenerS143S0300000_31.l1).removeAllListeners();
        Function2 function2 = (Function2) aAListenerS143S0300000_31.l2;
        if (function2 != null) {
            function2.invoke(Boolean.TRUE, null);
        }
    }

    public static final void onAnimationEnd$2(AAListenerS143S0300000_31 aAListenerS143S0300000_31, Animator animator) {
        C204751159x c204751159x = (C204751159x) aAListenerS143S0300000_31.l0;
        c204751159x.getClass();
        C15AI.LJFF(c204751159x, "onAnimationEnd");
        ((AnimatorSet) aAListenerS143S0300000_31.l1).removeAllListeners();
        Function2 function2 = (Function2) aAListenerS143S0300000_31.l2;
        if (function2 != null) {
            function2.invoke(Boolean.TRUE, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AAListenerS143S0300000_31(Object obj, C204748159u c204748159u, AnimatorSet animatorSet, Function2<? super Boolean, ? super String, Unit> function2) {
        this.$t = function2;
        this.l0 = obj;
        this.l1 = c204748159u;
        this.l2 = animatorSet;
    }
}
