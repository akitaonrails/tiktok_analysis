package Y;

import X.C0U7H;
import X.C12ES;
import X.C20441214yg;
import X.C2188811AlT;
import X.C403701hb;
import X.C439101nJ;
import X.C500260Jjc;
import X.C752230Tf3;
import X.C779330Uhf;
import X.C786410Ut5;
import X.EnumC767070U7d;
import X.InterfaceC752180Tey;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;

/* JADX INFO: loaded from: classes13.dex */
public class AAListenerS63S0110000_12 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public boolean z1;

    public static final void onAnimationCancel$2(AAListenerS63S0110000_12 aAListenerS63S0110000_12, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS63S0110000_12 aAListenerS63S0110000_12, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS63S0110000_12 aAListenerS63S0110000_12, Animator animator) {
    }

    public static final void onAnimationRepeat$2(AAListenerS63S0110000_12 aAListenerS63S0110000_12, Animator animator) {
    }

    public static final void onAnimationRepeat$3(AAListenerS63S0110000_12 aAListenerS63S0110000_12, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS63S0110000_12 aAListenerS63S0110000_12, Animator animator) {
    }

    public static final void onAnimationStart$2(AAListenerS63S0110000_12 aAListenerS63S0110000_12, Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                this.z1 = true;
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
        }
    }

    public AAListenerS63S0110000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$1(AAListenerS63S0110000_12 aAListenerS63S0110000_12, Animator animator) {
        View view;
        C779330Uhf c779330Uhf = (C779330Uhf) aAListenerS63S0110000_12.l0;
        c779330Uhf.LJIIJ = false;
        if (!aAListenerS63S0110000_12.z1 && (view = c779330Uhf.LIZLLL) != null) {
            C439101nJ.LJI(view);
        }
    }

    public static final void onAnimationCancel$3(AAListenerS63S0110000_12 aAListenerS63S0110000_12, Animator animator) {
        C20441214yg.LIZIZ("AIBeauty#anim", "cancel");
        aAListenerS63S0110000_12.z1 = true;
        C500260Jjc.LLFFF(((C0U7H) aAListenerS63S0110000_12.l0).LIZIZ);
        ViewGroup viewGroup = ((C0U7H) aAListenerS63S0110000_12.l0).LJI;
        if (viewGroup != null) {
            C500260Jjc.LJIILLIIL(viewGroup);
        }
    }

    public static final void onAnimationEnd$0(AAListenerS63S0110000_12 aAListenerS63S0110000_12, Animator animator) {
        if (!aAListenerS63S0110000_12.z1 && ((View) aAListenerS63S0110000_12.l0).getVisibility() != 8) {
            C786410Ut5.LJLLLLLL(4, (View) aAListenerS63S0110000_12.l0);
        }
        aAListenerS63S0110000_12.z1 = false;
    }

    public static final void onAnimationEnd$1(AAListenerS63S0110000_12 aAListenerS63S0110000_12, Animator animator) {
        View view;
        C779330Uhf c779330Uhf = (C779330Uhf) aAListenerS63S0110000_12.l0;
        c779330Uhf.LJIIJ = false;
        if (!aAListenerS63S0110000_12.z1 && (view = c779330Uhf.LIZLLL) != null) {
            C439101nJ.LJI(view);
        }
    }

    public static final void onAnimationEnd$2(AAListenerS63S0110000_12 aAListenerS63S0110000_12, Animator animator) {
        InterfaceC752180Tey smallMoreView = ((C752230Tf3) aAListenerS63S0110000_12.l0).getSmallMoreView();
        if (smallMoreView != null) {
            smallMoreView.LIZ((C752230Tf3) aAListenerS63S0110000_12.l0, aAListenerS63S0110000_12.z1);
        }
        ((C752230Tf3) aAListenerS63S0110000_12.l0).setSmallMoreView(null);
    }

    public static final void onAnimationEnd$3(AAListenerS63S0110000_12 aAListenerS63S0110000_12, Animator animator) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("end, isAnalyzing: ");
        EnumC767070U7d enumC767070U7d = ((C0U7H) aAListenerS63S0110000_12.l0).LJ.LLILZLL;
        EnumC767070U7d enumC767070U7d2 = EnumC767070U7d.ANALYZING;
        if (enumC767070U7d == enumC767070U7d2) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C20441214yg.LIZIZ("AIBeauty#anim", C2188811AlT.LIZIZ(sbLIZ));
        LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel = ((C0U7H) aAListenerS63S0110000_12.l0).LJ;
        if (liveSmallItemBeautyViewModel.LLILZLL == enumC767070U7d2 && !aAListenerS63S0110000_12.z1) {
            liveSmallItemBeautyViewModel.JQ2(new C403701hb());
        }
        C500260Jjc.LLFFF(((C0U7H) aAListenerS63S0110000_12.l0).LIZIZ);
        ViewGroup viewGroup = ((C0U7H) aAListenerS63S0110000_12.l0).LJI;
        if (viewGroup != null) {
            C500260Jjc.LJIILLIIL(viewGroup);
        }
    }

    public static final void onAnimationStart$1(AAListenerS63S0110000_12 aAListenerS63S0110000_12, Animator animator) {
        View view;
        C779330Uhf c779330Uhf = (C779330Uhf) aAListenerS63S0110000_12.l0;
        c779330Uhf.LJIIJ = true;
        if (aAListenerS63S0110000_12.z1 && (view = c779330Uhf.LIZLLL) != null) {
            C12ES.LJIILL(0, view);
        }
    }

    public static final void onAnimationStart$3(AAListenerS63S0110000_12 aAListenerS63S0110000_12, Animator animator) {
        aAListenerS63S0110000_12.z1 = false;
        C20441214yg.LIZIZ("AIBeauty#anim", "start");
        C500260Jjc.LJIILLIIL(((C0U7H) aAListenerS63S0110000_12.l0).LIZIZ);
        ViewGroup viewGroup = ((C0U7H) aAListenerS63S0110000_12.l0).LJI;
        if (viewGroup != null) {
            C500260Jjc.LLFFF(viewGroup);
        }
    }

    public AAListenerS63S0110000_12(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
