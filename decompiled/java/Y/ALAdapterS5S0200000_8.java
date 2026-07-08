package Y;

import X.C0C64;
import X.C0M8O;
import X.C0MDX;
import X.C1295960jpS;
import X.C375780EoK;
import X.C565220MEu;
import X.C565240MEw;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.tools.draft.DraftFragment;

/* JADX INFO: loaded from: classes9.dex */
public class ALAdapterS5S0200000_8 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 4:
                onAnimationCancel$0(this, animator);
                break;
            case 5:
                onAnimationCancel$1(this, animator);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            case 2:
            default:
                super.onAnimationEnd(animator);
                break;
            case 3:
                onAnimationEnd$2(this, animator);
                break;
            case 4:
                onAnimationEnd$3(this, animator);
                break;
            case 5:
                onAnimationEnd$4(this, animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 2:
                onAnimationStart$0(this, animator);
                break;
            case 3:
            default:
                super.onAnimationStart(animator);
                break;
            case 4:
                onAnimationStart$1(this, animator);
                break;
            case 5:
                onAnimationStart$2(this, animator);
                break;
        }
    }

    public ALAdapterS5S0200000_8(DraftFragment draftFragment, int i) {
        this.$t = i;
        this.l0 = draftFragment;
        this.l1 = null;
    }

    public static final void onAnimationCancel$0(ALAdapterS5S0200000_8 aLAdapterS5S0200000_8, Animator animator) {
        super.onAnimationCancel(animator);
        C375780EoK.LIZIZ((C1295960jpS) aLAdapterS5S0200000_8.l0, false);
        SmartImageView smartImageView = (SmartImageView) aLAdapterS5S0200000_8.l1;
        if (smartImageView != null) {
            C786410Ut5.u5(smartImageView, 1.0f);
        }
    }

    public static final void onAnimationCancel$1(ALAdapterS5S0200000_8 aLAdapterS5S0200000_8, Animator animator) {
        super.onAnimationCancel(animator);
        C375780EoK.LIZIZ((C1295960jpS) aLAdapterS5S0200000_8.l0, false);
        SmartImageView smartImageView = (SmartImageView) aLAdapterS5S0200000_8.l1;
        if (smartImageView != null) {
            C786410Ut5.u5(smartImageView, 1.0f);
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS5S0200000_8 aLAdapterS5S0200000_8, Animator animator) {
        FrameLayout frameLayout = ((DraftFragment) aLAdapterS5S0200000_8.l0).LLJJJ;
        if (frameLayout == null) {
            frameLayout = null;
        }
        C786410Ut5.LJZ(8, frameLayout);
        View view = (View) aLAdapterS5S0200000_8.l1;
        if (view != null) {
            view.setEnabled(true);
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS5S0200000_8 aLAdapterS5S0200000_8, Animator animator) {
        super.onAnimationEnd(animator);
        View view = ((C0MDX) aLAdapterS5S0200000_8.l0).mView;
        if (view != null) {
            C565240MEw c565240MEw = (C565240MEw) aLAdapterS5S0200000_8.l1;
            C786410Ut5.Ob(view, c565240MEw.LIZ);
            C786410Ut5.pc(view, c565240MEw.LIZ);
            C786410Ut5.Jc(view, view.getTranslationX());
            C786410Ut5.ed(view, view.getTranslationY());
        }
        int i = C565220MEu.LIZ[((C565240MEw) aLAdapterS5S0200000_8.l1).LJ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                ((C0MDX) aLAdapterS5S0200000_8.l0).LLLLLLIL();
            }
        } else {
            ((C0MDX) aLAdapterS5S0200000_8.l0).LLLLLLLLL();
        }
        ((C565240MEw) aLAdapterS5S0200000_8.l1).LJFF.invoke();
    }

    public static final void onAnimationEnd$2(ALAdapterS5S0200000_8 aLAdapterS5S0200000_8, Animator animator) {
        super.onAnimationEnd(animator);
        View view = (View) aLAdapterS5S0200000_8.l0;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = (View) aLAdapterS5S0200000_8.l1;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
    }

    public static final void onAnimationEnd$3(ALAdapterS5S0200000_8 aLAdapterS5S0200000_8, Animator animator) {
        super.onAnimationEnd(animator);
        C375780EoK.LIZIZ((C1295960jpS) aLAdapterS5S0200000_8.l0, false);
        SmartImageView smartImageView = (SmartImageView) aLAdapterS5S0200000_8.l1;
        if (smartImageView != null) {
            C786410Ut5.u5(smartImageView, 1.0f);
        }
    }

    public static final void onAnimationEnd$4(ALAdapterS5S0200000_8 aLAdapterS5S0200000_8, Animator animator) {
        super.onAnimationEnd(animator);
        C375780EoK.LIZIZ((C1295960jpS) aLAdapterS5S0200000_8.l0, false);
        SmartImageView smartImageView = (SmartImageView) aLAdapterS5S0200000_8.l1;
        if (smartImageView != null) {
            C786410Ut5.u5(smartImageView, 1.0f);
        }
    }

    public static final void onAnimationStart$0(ALAdapterS5S0200000_8 aLAdapterS5S0200000_8, Animator animator) {
        FrameLayout frameLayout = ((DraftFragment) aLAdapterS5S0200000_8.l0).LLJJJ;
        if (frameLayout == null) {
            frameLayout = null;
        }
        C786410Ut5.LJZ(0, frameLayout);
        View view = (View) aLAdapterS5S0200000_8.l1;
        if (view != null) {
            view.setEnabled(true);
        }
    }

    public static final void onAnimationStart$1(ALAdapterS5S0200000_8 aLAdapterS5S0200000_8, Animator animator) {
        super.onAnimationStart(animator);
        C375780EoK.LIZIZ((C1295960jpS) aLAdapterS5S0200000_8.l0, true);
        SmartImageView smartImageView = (SmartImageView) aLAdapterS5S0200000_8.l1;
        if (smartImageView != null) {
            C786410Ut5.u5(smartImageView, 0.0f);
        }
        C0M8O.LIZ.getClass();
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_story_ai_live_photo_icon_anim_always_show", true, false)) {
            C0M8O.LJ = true;
        }
    }

    public static final void onAnimationStart$2(ALAdapterS5S0200000_8 aLAdapterS5S0200000_8, Animator animator) {
        super.onAnimationStart(animator);
        C375780EoK.LIZIZ((C1295960jpS) aLAdapterS5S0200000_8.l0, true);
        SmartImageView smartImageView = (SmartImageView) aLAdapterS5S0200000_8.l1;
        if (smartImageView != null) {
            C786410Ut5.u5(smartImageView, 0.0f);
        }
        C0M8O.LIZ.getClass();
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_story_ai_live_photo_icon_anim_always_show", true, false)) {
            C0M8O.LJ = true;
        }
    }

    public ALAdapterS5S0200000_8(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
