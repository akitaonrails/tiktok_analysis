package Y;

import X.C013C;
import X.C1105900esu;
import X.C1324720kZq;
import X.C1846630y9d;
import X.C1846800y9u;
import X.C1847150yAT;
import X.C1847160yAU;
import X.C500260Jjc;
import X.C786410Ut5;
import android.animation.Animator;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes28.dex */
public class AAListenerS75S0201000_27 implements Animator.AnimatorListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    public static final void onAnimationCancel$0(AAListenerS75S0201000_27 aAListenerS75S0201000_27, Animator animator) {
    }

    public static final void onAnimationCancel$1(AAListenerS75S0201000_27 aAListenerS75S0201000_27, Animator animator) {
    }

    public static final void onAnimationEnd$0(AAListenerS75S0201000_27 aAListenerS75S0201000_27, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS75S0201000_27 aAListenerS75S0201000_27, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS75S0201000_27 aAListenerS75S0201000_27, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS75S0201000_27 aAListenerS75S0201000_27, Animator animator) {
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

    public static final void onAnimationEnd$1(AAListenerS75S0201000_27 aAListenerS75S0201000_27, Animator animator) {
        C500260Jjc.LJIILIIL(((C1847150yAT) aAListenerS75S0201000_27.l0).LLILLJJLI);
        C1846630y9d c1846630y9d = ((C1847150yAT) aAListenerS75S0201000_27.l0).LL;
        if (c1846630y9d != null) {
            C786410Ut5.qd(c1846630y9d, 0.0f);
        }
        C1846630y9d c1846630y9d2 = ((C1847150yAT) aAListenerS75S0201000_27.l0).LL;
        if (c1846630y9d2 != null) {
            int[] iArrLIZJ = C1847160yAU.LIZJ(aAListenerS75S0201000_27.i2);
            boolean z = C1105900esu.LIZIZ;
            String strLIZJ = C1105900esu.LIZJ(aAListenerS75S0201000_27.i2);
            if (strLIZJ == null) {
                strLIZJ = "";
            }
            c1846630y9d2.LJJJJJ(strLIZJ, iArrLIZJ);
        }
        C1846630y9d c1846630y9d3 = ((C1847150yAT) aAListenerS75S0201000_27.l0).LL;
        if (c1846630y9d3 != null) {
            boolean z2 = C1105900esu.LIZIZ;
            c1846630y9d3.setText(C1105900esu.LIZJ(aAListenerS75S0201000_27.i2));
        }
        FrameLayout frameLayout = ((C1847150yAT) aAListenerS75S0201000_27.l0).LLILLL;
        if (frameLayout != null) {
            C1846800y9u.LJIILL(frameLayout, -2);
        }
        ((C1847150yAT) aAListenerS75S0201000_27.l0).LLJI = false;
        Function0 function0 = (Function0) aAListenerS75S0201000_27.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationStart$0(AAListenerS75S0201000_27 aAListenerS75S0201000_27, Animator animator) {
        int iLIZ;
        C1324720kZq c1324720kZq = (C1324720kZq) aAListenerS75S0201000_27.l0;
        if (c1324720kZq != null) {
            if (((C013C) aAListenerS75S0201000_27.l1).element) {
                iLIZ = C1847160yAU.LIZIZ(aAListenerS75S0201000_27.i2);
            } else {
                iLIZ = C1847160yAU.LIZ(aAListenerS75S0201000_27.i2);
            }
            c1324720kZq.setActualImageResource(iLIZ);
        }
    }

    public AAListenerS75S0201000_27(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
