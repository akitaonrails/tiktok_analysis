package Y;

import X.C013C;
import X.C732910Soz;
import X.C786410Ut5;
import android.animation.Animator;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ui.view.PostModeNestHeaderComponent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AAListenerS87S0400000_11 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    public static final void onAnimationEnd$0(AAListenerS87S0400000_11 aAListenerS87S0400000_11, Animator animator) {
    }

    public static final void onAnimationEnd$1(AAListenerS87S0400000_11 aAListenerS87S0400000_11, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS87S0400000_11 aAListenerS87S0400000_11, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS87S0400000_11 aAListenerS87S0400000_11, Animator animator) {
    }

    public static final void onAnimationRepeat$2(AAListenerS87S0400000_11 aAListenerS87S0400000_11, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS87S0400000_11 aAListenerS87S0400000_11, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS87S0400000_11 aAListenerS87S0400000_11, Animator animator) {
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

    public static final void onAnimationCancel$0(AAListenerS87S0400000_11 aAListenerS87S0400000_11, Animator animator) {
        C732910Soz c732910Soz = (C732910Soz) aAListenerS87S0400000_11.l0;
        View view = (View) aAListenerS87S0400000_11.l1;
        View view2 = (View) aAListenerS87S0400000_11.l2;
        c732910Soz.getClass();
        C732910Soz.LIZIZ(view, view2);
        ((Function0) aAListenerS87S0400000_11.l3).invoke();
    }

    public static final void onAnimationCancel$1(AAListenerS87S0400000_11 aAListenerS87S0400000_11, Animator animator) {
        C732910Soz c732910Soz = (C732910Soz) aAListenerS87S0400000_11.l0;
        View view = (View) aAListenerS87S0400000_11.l1;
        View view2 = (View) aAListenerS87S0400000_11.l2;
        c732910Soz.getClass();
        C732910Soz.LIZIZ(view, view2);
        ((Function0) aAListenerS87S0400000_11.l3).invoke();
    }

    public static final void onAnimationCancel$2(AAListenerS87S0400000_11 aAListenerS87S0400000_11, Animator animator) {
        View viewVl2 = ((PostModeNestHeaderComponent) aAListenerS87S0400000_11.l0).Vl2();
        if (viewVl2 != null) {
            viewVl2.setLayerType(0, null);
        }
        View viewLJIIZILJ = ((PostModeNestHeaderComponent) aAListenerS87S0400000_11.l0).LJIIZILJ();
        if (viewLJIIZILJ != null) {
            viewLJIIZILJ.setLayerType(0, null);
        }
        C013C c013c = (C013C) aAListenerS87S0400000_11.l2;
        if (!c013c.element) {
            c013c.element = true;
            Function1 function1 = (Function1) aAListenerS87S0400000_11.l3;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
        }
        View viewVl22 = ((PostModeNestHeaderComponent) aAListenerS87S0400000_11.l0).Vl2();
        if (viewVl22 != null) {
            C786410Ut5.T4(viewVl22, 0.0f);
        }
        View viewLJIIZILJ2 = ((PostModeNestHeaderComponent) aAListenerS87S0400000_11.l0).LJIIZILJ();
        if (viewLJIIZILJ2 != null) {
            C786410Ut5.T4(viewLJIIZILJ2, 0.0f);
        }
        TuxIconView tuxIconView = (TuxIconView) aAListenerS87S0400000_11.l1;
        if (tuxIconView != null) {
            C786410Ut5.x5(tuxIconView, 0.0f);
        }
    }

    public static final void onAnimationEnd$2(AAListenerS87S0400000_11 aAListenerS87S0400000_11, Animator animator) {
        View viewVl2 = ((PostModeNestHeaderComponent) aAListenerS87S0400000_11.l0).Vl2();
        if (viewVl2 != null) {
            viewVl2.setLayerType(0, null);
        }
        View viewLJIIZILJ = ((PostModeNestHeaderComponent) aAListenerS87S0400000_11.l0).LJIIZILJ();
        if (viewLJIIZILJ != null) {
            viewLJIIZILJ.setLayerType(0, null);
        }
        View viewVl22 = ((PostModeNestHeaderComponent) aAListenerS87S0400000_11.l0).Vl2();
        if (viewVl22 != null) {
            C786410Ut5.T4(viewVl22, 0.0f);
        }
        View viewLJIIZILJ2 = ((PostModeNestHeaderComponent) aAListenerS87S0400000_11.l0).LJIIZILJ();
        if (viewLJIIZILJ2 != null) {
            C786410Ut5.T4(viewLJIIZILJ2, 0.0f);
        }
        TuxIconView tuxIconView = (TuxIconView) aAListenerS87S0400000_11.l1;
        if (tuxIconView != null) {
            C786410Ut5.x5(tuxIconView, 0.0f);
        }
    }

    public static final void onAnimationStart$2(AAListenerS87S0400000_11 aAListenerS87S0400000_11, Animator animator) {
        View viewVl2 = ((PostModeNestHeaderComponent) aAListenerS87S0400000_11.l0).Vl2();
        if (viewVl2 != null) {
            viewVl2.setLayerType(2, null);
        }
        View viewLJIIZILJ = ((PostModeNestHeaderComponent) aAListenerS87S0400000_11.l0).LJIIZILJ();
        if (viewLJIIZILJ != null) {
            viewLJIIZILJ.setLayerType(2, null);
        }
    }

    public AAListenerS87S0400000_11(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
