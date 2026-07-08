package Y;

import X.AnonymousClass0956;
import X.C1749580vd6;
import X.C1753490vjP;
import X.C20441214yg;
import X.C2188811AlT;
import android.animation.Animator;
import com.bytedance.android.livesdk.unityanimation.widget.EventAreaUnityAnimationWidget;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes27.dex */
public class AAListenerS274S0200000_26 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onAnimationCancel$0(AAListenerS274S0200000_26 aAListenerS274S0200000_26, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS274S0200000_26 aAListenerS274S0200000_26, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS274S0200000_26 aAListenerS274S0200000_26, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS274S0200000_26 aAListenerS274S0200000_26, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS274S0200000_26 aAListenerS274S0200000_26, Animator animator) {
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

    public static final void onAnimationCancel$1(AAListenerS274S0200000_26 aAListenerS274S0200000_26, Animator animator) {
        Function0 function0 = (Function0) aAListenerS274S0200000_26.l0;
        if (function0 != null) {
            function0.invoke();
        }
        ((C1753490vjP) aAListenerS274S0200000_26.l1).LJIILIIL = false;
    }

    public static final void onAnimationEnd$0(AAListenerS274S0200000_26 aAListenerS274S0200000_26, Animator animator) {
        EventAreaUnityAnimationWidget eventAreaUnityAnimationWidget = (EventAreaUnityAnimationWidget) aAListenerS274S0200000_26.l0;
        C1749580vd6 c1749580vd6 = (C1749580vd6) aAListenerS274S0200000_26.l1;
        eventAreaUnityAnimationWidget.y1().remove(c1749580vd6);
        AnonymousClass0956 anonymousClass0956 = c1749580vd6.LLILZLL;
        if (anonymousClass0956 != null && !anonymousClass0956.isCancelled()) {
            AnonymousClass0956 anonymousClass09562 = c1749580vd6.LLILZLL;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("canceled delay job:");
            sbLIZ.append(c1749580vd6.LL);
            C20441214yg.LIZIZ("EventAreaUnityAnimationWidget", C2188811AlT.LIZIZ(sbLIZ));
        }
        eventAreaUnityAnimationWidget.x1();
    }

    public static final void onAnimationEnd$1(AAListenerS274S0200000_26 aAListenerS274S0200000_26, Animator animator) {
        Function0 function0 = (Function0) aAListenerS274S0200000_26.l0;
        if (function0 != null) {
            function0.invoke();
        }
        ((C1753490vjP) aAListenerS274S0200000_26.l1).LJIILIIL = false;
    }

    public AAListenerS274S0200000_26(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
