package Y;

import X.C1161920gLG;
import X.C1697810uHb;
import X.C20441214yg;
import X.C2188811AlT;
import X.C497740JfY;
import X.C984930bjn;
import X.C984940bjo;
import X.C984950bjp;
import X.C984960bjq;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.Animator;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public class AAListenerS2S0200002_15 implements Animator.AnimatorListener {
    public final int $t;
    public float f2;
    public float f3;
    public Object l0;
    public Object l1;

    public static final void onAnimationRepeat$0(AAListenerS2S0200002_15 aAListenerS2S0200002_15, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS2S0200002_15 aAListenerS2S0200002_15, Animator animator) {
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

    public static final void onAnimationCancel$0(AAListenerS2S0200002_15 aAListenerS2S0200002_15, Animator animator) {
        float fLJJI = C497740JfY.LJJI(((C984960bjq) aAListenerS2S0200002_15.l1).getWidth()) / 28.0f;
        ((C984960bjq) aAListenerS2S0200002_15.l1).setPivotX(aAListenerS2S0200002_15.f2);
        ((C984960bjq) aAListenerS2S0200002_15.l1).setPivotY(aAListenerS2S0200002_15.f3);
        C984960bjq c984960bjq = (C984960bjq) aAListenerS2S0200002_15.l1;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c984960bjq);
        c984960bjq.setScaleX(fLJJI);
        C984960bjq c984960bjq2 = (C984960bjq) aAListenerS2S0200002_15.l1;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c984960bjq2);
        c984960bjq2.setScaleY(fLJJI);
    }

    public static final void onAnimationCancel$1(AAListenerS2S0200002_15 aAListenerS2S0200002_15, Animator animator) {
        float fLJJI = C497740JfY.LJJI(((C984950bjp) aAListenerS2S0200002_15.l1).getWidth()) / 28.0f;
        ((C984950bjp) aAListenerS2S0200002_15.l1).setPivotX(aAListenerS2S0200002_15.f2);
        ((C984950bjp) aAListenerS2S0200002_15.l1).setPivotY(aAListenerS2S0200002_15.f3);
        C984950bjp c984950bjp = (C984950bjp) aAListenerS2S0200002_15.l1;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c984950bjp);
        c984950bjp.setScaleX(fLJJI);
        C984950bjp c984950bjp2 = (C984950bjp) aAListenerS2S0200002_15.l1;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c984950bjp2);
        c984950bjp2.setScaleY(fLJJI);
    }

    public static final void onAnimationEnd$0(AAListenerS2S0200002_15 aAListenerS2S0200002_15, Animator animator) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showMvpAnimation onAnimationEnd isLeftWin:");
        sbLIZ.append(((C984940bjo) aAListenerS2S0200002_15.l0).LLILLL);
        C20441214yg.LIZIZ("CatchBeansMvpContainerLayout", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onAnimationEnd$1(AAListenerS2S0200002_15 aAListenerS2S0200002_15, Animator animator) {
        Function0<Unit> function0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showMvpAnimation onAnimationEnd isLeftWin:");
        sbLIZ.append(((C984930bjn) aAListenerS2S0200002_15.l0).LLILZ);
        C20441214yg.LIZIZ("TakeTheStageMvpContainerLayout", C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(((C984930bjn) aAListenerS2S0200002_15.l0).LLILZ, Boolean.TRUE) && (function0 = ((C984930bjn) aAListenerS2S0200002_15.l0).LLILLJJLI) != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationStart$0(AAListenerS2S0200002_15 aAListenerS2S0200002_15, Animator animator) {
        boolean z;
        float fLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showMvpAnimation onAnimationStart, ServiceManager.getService(IHostAppContext::class.java).isAppBackground = ");
        sbLIZ.append(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground());
        C20441214yg.LIZIZ("CatchBeansMvpContainerLayout", C2188811AlT.LIZIZ(sbLIZ));
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground()) {
            ((C984940bjo) aAListenerS2S0200002_15.l0).LIZIZ();
            return;
        }
        C984940bjo c984940bjo = (C984940bjo) aAListenerS2S0200002_15.l0;
        Function1<? super ArrayList<Float>, Unit> function1 = c984940bjo.LLILLJJLI;
        if (function1 == null) {
            return;
        }
        C984960bjq c984960bjq = (C984960bjq) aAListenerS2S0200002_15.l1;
        c984940bjo.getClass();
        int iLJIIZILJ = C497740JfY.LJIIZILJ();
        int[] iArr = new int[2];
        c984960bjq.getLocationOnScreen(iArr);
        float f = iArr[0];
        float f2 = iLJIIZILJ / 2.0f;
        if (f < f2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            fLIZIZ = -(f2 - (f + (C497740JfY.LJIIIZ(R.dimen.acu) / 2.0f)));
        } else {
            fLIZIZ = f2 - (((iLJIIZILJ - r10) + ((int) C497740JfY.LIZIZ(8.0f))) - (C497740JfY.LJIIIZ(R.dimen.acu) / 2.0f));
        }
        function1.invoke(C1697810uHb.LJ(Float.valueOf(fLIZIZ), Float.valueOf((c984960bjq.getBottom() - (c984940bjo.getHeight() / 2.0f)) - ((int) C497740JfY.LIZIZ(3.0f)))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int[], java.lang.Object] */
    public static final void onAnimationStart$1(AAListenerS2S0200002_15 aAListenerS2S0200002_15, Animator animator) {
        C20441214yg.LIZIZ("TakeTheStageMvpContainerLayout", "showMvpAnimation onAnimationStart");
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground()) {
            ((C984930bjn) aAListenerS2S0200002_15.l0).LIZIZ();
            return;
        }
        C984930bjn c984930bjn = (C984930bjn) aAListenerS2S0200002_15.l0;
        Function1<? super int[], Unit> function1 = c984930bjn.LLILLL;
        if (function1 == null) {
            return;
        }
        C984950bjp c984950bjp = (C984950bjp) aAListenerS2S0200002_15.l1;
        c984930bjn.getClass();
        ?? r3 = new int[2];
        r3[1] = r3[1] + c984950bjp.getHeight();
        c984950bjp.getLocationOnScreen(r3);
        function1.invoke(r3);
    }

    public AAListenerS2S0200002_15(Object obj, Object obj2, float f, float f2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.f2 = f;
        this.f3 = f2;
    }
}
