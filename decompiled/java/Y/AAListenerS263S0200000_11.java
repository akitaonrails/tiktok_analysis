package Y;

import X.C0SOX;
import X.C0SU0;
import X.C10IT;
import X.C786410Ut5;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.base.ui.bottom.banner.FeedBottomBannerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerListFragment;
import com.ss.android.ugc.aweme.ui.view.PostModeNestHeaderComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public class AAListenerS263S0200000_11 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onAnimationCancel$0(AAListenerS263S0200000_11 aAListenerS263S0200000_11, Animator animator) {
    }

    public static final void onAnimationCancel$2(AAListenerS263S0200000_11 aAListenerS263S0200000_11, Animator animator) {
    }

    public static final void onAnimationEnd$1(AAListenerS263S0200000_11 aAListenerS263S0200000_11, Animator animator) {
    }

    public static final void onAnimationEnd$3(AAListenerS263S0200000_11 aAListenerS263S0200000_11, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS263S0200000_11 aAListenerS263S0200000_11, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS263S0200000_11 aAListenerS263S0200000_11, Animator animator) {
    }

    public static final void onAnimationRepeat$2(AAListenerS263S0200000_11 aAListenerS263S0200000_11, Animator animator) {
    }

    public static final void onAnimationRepeat$3(AAListenerS263S0200000_11 aAListenerS263S0200000_11, Animator animator) {
    }

    public static final void onAnimationRepeat$4(AAListenerS263S0200000_11 aAListenerS263S0200000_11, Animator animator) {
    }

    public static final void onAnimationRepeat$5(AAListenerS263S0200000_11 aAListenerS263S0200000_11, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS263S0200000_11 aAListenerS263S0200000_11, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS263S0200000_11 aAListenerS263S0200000_11, Animator animator) {
    }

    public static final void onAnimationStart$2(AAListenerS263S0200000_11 aAListenerS263S0200000_11, Animator animator) {
    }

    public static final void onAnimationStart$3(AAListenerS263S0200000_11 aAListenerS263S0200000_11, Animator animator) {
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

    public static final void onAnimationCancel$1(AAListenerS263S0200000_11 aAListenerS263S0200000_11, Animator animator) {
        C786410Ut5.V4((ImageView) aAListenerS263S0200000_11.l0, ((C0SOX) aAListenerS263S0200000_11.l1).LIZ());
    }

    public static final void onAnimationCancel$3(AAListenerS263S0200000_11 aAListenerS263S0200000_11, Animator animator) {
        ((StoryViewerListFragment) aAListenerS263S0200000_11.l0).LLJI = false;
        Function0 function0 = (Function0) aAListenerS263S0200000_11.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationCancel$4(AAListenerS263S0200000_11 aAListenerS263S0200000_11, Animator animator) {
        ViewGroup viewGroup = (ViewGroup) aAListenerS263S0200000_11.l1;
        if (viewGroup != null) {
            C786410Ut5.R4(1.0f, viewGroup);
        }
        View view = ((PostModeNestHeaderComponent) aAListenerS263S0200000_11.l0).LLJILLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(4, view);
        }
    }

    public static final void onAnimationCancel$5(AAListenerS263S0200000_11 aAListenerS263S0200000_11, Animator animator) {
        C0SU0 c0su0 = (C0SU0) aAListenerS263S0200000_11.l0;
        if (c0su0 != null) {
            c0su0.setLayerType(0, null);
        }
        Function0 function0 = (Function0) aAListenerS263S0200000_11.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$0(AAListenerS263S0200000_11 aAListenerS263S0200000_11, Animator animator) {
        ((FeedBottomBannerView) aAListenerS263S0200000_11.l0).LLJILJILJ.addView((View) aAListenerS263S0200000_11.l1);
    }

    public static final void onAnimationEnd$2(AAListenerS263S0200000_11 aAListenerS263S0200000_11, Animator animator) {
        ((StoryViewerListFragment) aAListenerS263S0200000_11.l0).LLJI = false;
        Function0 function0 = (Function0) aAListenerS263S0200000_11.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$4(AAListenerS263S0200000_11 aAListenerS263S0200000_11, Animator animator) {
        ViewGroup viewGroup = (ViewGroup) aAListenerS263S0200000_11.l1;
        if (viewGroup != null) {
            C786410Ut5.R4(1.0f, viewGroup);
        }
        View view = ((PostModeNestHeaderComponent) aAListenerS263S0200000_11.l0).LLJILLL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(4, view);
        }
    }

    public static final void onAnimationEnd$5(AAListenerS263S0200000_11 aAListenerS263S0200000_11, Animator animator) {
        C0SU0 c0su0 = (C0SU0) aAListenerS263S0200000_11.l0;
        if (c0su0 != null) {
            c0su0.setLayerType(0, null);
        }
        Function0 function0 = (Function0) aAListenerS263S0200000_11.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationStart$4(AAListenerS263S0200000_11 aAListenerS263S0200000_11, Animator animator) {
        ViewGroup viewGroup;
        C10IT c10it = C10IT.LIZ;
        Aweme aweme = ((PostModeNestHeaderComponent) aAListenerS263S0200000_11.l0).LLILLL.LIZJ;
        c10it.getClass();
        if (!C10IT.LJIILJJIL(aweme) && (viewGroup = (ViewGroup) aAListenerS263S0200000_11.l1) != null) {
            C786410Ut5.LJLZ(0, viewGroup);
        }
    }

    public static final void onAnimationStart$5(AAListenerS263S0200000_11 aAListenerS263S0200000_11, Animator animator) {
        C0SU0 c0su0 = (C0SU0) aAListenerS263S0200000_11.l0;
        if (c0su0 != null) {
            c0su0.setLayerType(2, null);
        }
    }

    public AAListenerS263S0200000_11(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
