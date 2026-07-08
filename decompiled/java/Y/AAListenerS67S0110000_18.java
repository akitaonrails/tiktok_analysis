package Y;

import X.C1196500hF2;
import X.C339190DRl;
import X.C487280J9a;
import X.C786410Ut5;
import X.ViewOnClickListenerC1203580hQS;
import android.animation.Animator;
import com.ss.android.ugc.aweme.poi.detail.container.bottom.dynamic.PoiDynamicBottomBarComponent;
import com.ss.android.ugc.aweme.poi.detail.container.bottom.dynamicscroll.PoiScrollBottomBarComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class AAListenerS67S0110000_18 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public boolean z1;

    public static final void onAnimationCancel$0(AAListenerS67S0110000_18 aAListenerS67S0110000_18, Animator animator) {
    }

    public static final void onAnimationCancel$1(AAListenerS67S0110000_18 aAListenerS67S0110000_18, Animator animator) {
    }

    public static final void onAnimationCancel$2(AAListenerS67S0110000_18 aAListenerS67S0110000_18, Animator animator) {
    }

    public static final void onAnimationCancel$3(AAListenerS67S0110000_18 aAListenerS67S0110000_18, Animator animator) {
    }

    public static final void onAnimationCancel$4(AAListenerS67S0110000_18 aAListenerS67S0110000_18, Animator animator) {
    }

    public static final void onAnimationEnd$1(AAListenerS67S0110000_18 aAListenerS67S0110000_18, Animator animator) {
    }

    public static final void onAnimationEnd$3(AAListenerS67S0110000_18 aAListenerS67S0110000_18, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS67S0110000_18 aAListenerS67S0110000_18, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS67S0110000_18 aAListenerS67S0110000_18, Animator animator) {
    }

    public static final void onAnimationRepeat$2(AAListenerS67S0110000_18 aAListenerS67S0110000_18, Animator animator) {
    }

    public static final void onAnimationRepeat$3(AAListenerS67S0110000_18 aAListenerS67S0110000_18, Animator animator) {
    }

    public static final void onAnimationRepeat$4(AAListenerS67S0110000_18 aAListenerS67S0110000_18, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS67S0110000_18 aAListenerS67S0110000_18, Animator animator) {
    }

    public static final void onAnimationStart$2(AAListenerS67S0110000_18 aAListenerS67S0110000_18, Animator animator) {
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

    public static final void onAnimationEnd$0(AAListenerS67S0110000_18 aAListenerS67S0110000_18, Animator animator) {
        if (!aAListenerS67S0110000_18.z1) {
            C786410Ut5.LJLLLLLL(4, ((PoiDynamicBottomBarComponent) aAListenerS67S0110000_18.l0).ap());
        }
    }

    public static final void onAnimationEnd$2(AAListenerS67S0110000_18 aAListenerS67S0110000_18, Animator animator) {
        if (!aAListenerS67S0110000_18.z1) {
            C786410Ut5.LJLLLLLL(4, ((PoiScrollBottomBarComponent) aAListenerS67S0110000_18.l0).LJJIJL());
        }
    }

    public static final void onAnimationEnd$4(AAListenerS67S0110000_18 aAListenerS67S0110000_18, Animator animator) {
        Function0<Unit> function0;
        if (aAListenerS67S0110000_18.z1 && (function0 = ((C1196500hF2) aAListenerS67S0110000_18.l0).LLILZIL) != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationStart$1(AAListenerS67S0110000_18 aAListenerS67S0110000_18, Animator animator) {
        if (aAListenerS67S0110000_18.z1) {
            C339190DRl.LIZLLL(((PoiDynamicBottomBarComponent) aAListenerS67S0110000_18.l0).ap());
        }
    }

    public static final void onAnimationStart$3(AAListenerS67S0110000_18 aAListenerS67S0110000_18, Animator animator) {
        if (aAListenerS67S0110000_18.z1) {
            C339190DRl.LIZLLL(((PoiScrollBottomBarComponent) aAListenerS67S0110000_18.l0).LJJIJL());
        }
    }

    public static final void onAnimationStart$4(AAListenerS67S0110000_18 aAListenerS67S0110000_18, Animator animator) {
        ViewOnClickListenerC1203580hQS viewOnClickListenerC1203580hQS = ((C1196500hF2) aAListenerS67S0110000_18.l0).LLILZLL;
        viewOnClickListenerC1203580hQS.setPadding(0, viewOnClickListenerC1203580hQS.getPaddingTop(), viewOnClickListenerC1203580hQS.getPaddingRight(), viewOnClickListenerC1203580hQS.getPaddingBottom());
        C1196500hF2 c1196500hF2 = (C1196500hF2) aAListenerS67S0110000_18.l0;
        C487280J9a.LIZIZ(c1196500hF2.LL, c1196500hF2.LLIZ);
    }

    public AAListenerS67S0110000_18(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
