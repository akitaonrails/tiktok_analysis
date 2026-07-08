package Y;

import X.C0SOW;
import X.C0SOY;
import X.C0SS3;
import X.C0SSM;
import X.C1440005kM;
import X.C19EG;
import X.C722760SWs;
import X.C786410Ut5;
import android.animation.Animator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.SAFTikTokFragment;
import com.ss.android.ugc.aweme.feed.assem.bubblelist.BubbleListAssem;
import com.ss.android.ugc.aweme.ui.view.PostModeNestHeaderComponent;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS243S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public class AAListenerS136S0300000_11 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public static final void onAnimationEnd$1(AAListenerS136S0300000_11 aAListenerS136S0300000_11, Animator animator) {
    }

    public static final void onAnimationEnd$2(AAListenerS136S0300000_11 aAListenerS136S0300000_11, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS136S0300000_11 aAListenerS136S0300000_11, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS136S0300000_11 aAListenerS136S0300000_11, Animator animator) {
    }

    public static final void onAnimationRepeat$2(AAListenerS136S0300000_11 aAListenerS136S0300000_11, Animator animator) {
    }

    public static final void onAnimationRepeat$3(AAListenerS136S0300000_11 aAListenerS136S0300000_11, Animator animator) {
    }

    public static final void onAnimationRepeat$4(AAListenerS136S0300000_11 aAListenerS136S0300000_11, Animator animator) {
    }

    public static final void onAnimationRepeat$5(AAListenerS136S0300000_11 aAListenerS136S0300000_11, Animator animator) {
    }

    public static final void onAnimationRepeat$6(AAListenerS136S0300000_11 aAListenerS136S0300000_11, Animator animator) {
    }

    public static final void onAnimationStart$0(AAListenerS136S0300000_11 aAListenerS136S0300000_11, Animator animator) {
    }

    public static final void onAnimationStart$1(AAListenerS136S0300000_11 aAListenerS136S0300000_11, Animator animator) {
    }

    public static final void onAnimationStart$2(AAListenerS136S0300000_11 aAListenerS136S0300000_11, Animator animator) {
    }

    public static final void onAnimationStart$5(AAListenerS136S0300000_11 aAListenerS136S0300000_11, Animator animator) {
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
            case 6:
                onAnimationCancel$6(this, animator);
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
            case 6:
                onAnimationEnd$6(this, animator);
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
            case 6:
                onAnimationRepeat$6(this, animator);
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
            case 6:
                onAnimationStart$6(this, animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(AAListenerS136S0300000_11 aAListenerS136S0300000_11, Animator animator) {
        C786410Ut5.T4(((BubbleListAssem) aAListenerS136S0300000_11.l0).LJJIJL(), 0.0f);
        Function0 function0 = (Function0) aAListenerS136S0300000_11.l2;
        if (function0 != null) {
            function0.invoke();
        }
        ((BubbleListAssem) aAListenerS136S0300000_11.l0).LLLFFI = null;
    }

    public static final void onAnimationCancel$1(AAListenerS136S0300000_11 aAListenerS136S0300000_11, Animator animator) {
        C0SOW c0sow = (C0SOW) aAListenerS136S0300000_11.l0;
        ImageView imageView = (ImageView) aAListenerS136S0300000_11.l1;
        int i = ((C0SOY) aAListenerS136S0300000_11.l2).LJIIJJI;
        c0sow.getClass();
        C0SOW.LJIILJJIL(i, imageView);
        C786410Ut5.V4((ImageView) aAListenerS136S0300000_11.l1, 1.0f);
    }

    public static final void onAnimationCancel$2(AAListenerS136S0300000_11 aAListenerS136S0300000_11, Animator animator) {
        C0SOW c0sow = (C0SOW) aAListenerS136S0300000_11.l0;
        C0SOW.LJIILJJIL(c0sow.getDotSize(), (ImageView) aAListenerS136S0300000_11.l1);
        C786410Ut5.V4((ImageView) aAListenerS136S0300000_11.l1, ((C0SOY) aAListenerS136S0300000_11.l2).LIZ());
    }

    public static final void onAnimationCancel$3(AAListenerS136S0300000_11 aAListenerS136S0300000_11, Animator animator) {
        if (!((PostModeNestHeaderComponent) aAListenerS136S0300000_11.l2).LJJJJZI()) {
            C786410Ut5.V4((ImageView) aAListenerS136S0300000_11.l0, 0.0f);
            View viewLJJI = ((PostModeNestHeaderComponent) aAListenerS136S0300000_11.l2).LJJI();
            if (viewLJJI != null) {
                C786410Ut5.T4(viewLJJI, 1.0f);
            }
        }
    }

    public static final void onAnimationCancel$4(AAListenerS136S0300000_11 aAListenerS136S0300000_11, Animator animator) {
        C19EG c19eg = (C19EG) aAListenerS136S0300000_11.l1;
        if (c19eg != null) {
            c19eg.finish();
            return;
        }
        SAFTikTokFragment sAFTikTokFragment = (SAFTikTokFragment) aAListenerS136S0300000_11.l2;
        if (sAFTikTokFragment == null) {
            return;
        }
        sAFTikTokFragment.finish();
    }

    public static final void onAnimationCancel$5(AAListenerS136S0300000_11 aAListenerS136S0300000_11, Animator animator) {
        C0SSM c0ssm = ((C722760SWs) aAListenerS136S0300000_11.l0).LIZ;
        if (c0ssm != null) {
            c0ssm.setOnTouchListener(null);
        }
        ((ImageView) aAListenerS136S0300000_11.l1).setImageDrawable(null);
        C786410Ut5.LJZ(8, (FrameLayout) aAListenerS136S0300000_11.l2);
        View view = ((C722760SWs) aAListenerS136S0300000_11.l0).LIZIZ;
        if (view != null) {
            C786410Ut5.T4(view, 1.0f);
        }
    }

    public static final void onAnimationCancel$6(AAListenerS136S0300000_11 aAListenerS136S0300000_11, Animator animator) {
        C786410Ut5.bd(0.0f, (ViewGroup) aAListenerS136S0300000_11.l2);
    }

    public static final void onAnimationEnd$0(AAListenerS136S0300000_11 aAListenerS136S0300000_11, Animator animator) {
        C786410Ut5.T4(((BubbleListAssem) aAListenerS136S0300000_11.l0).LJJIJL(), 0.0f);
        Function0 function0 = (Function0) aAListenerS136S0300000_11.l1;
        if (function0 != null) {
            function0.invoke();
        }
        ((BubbleListAssem) aAListenerS136S0300000_11.l0).LLLFFI = null;
    }

    public static final void onAnimationEnd$3(AAListenerS136S0300000_11 aAListenerS136S0300000_11, Animator animator) {
        C786410Ut5.V4((ImageView) aAListenerS136S0300000_11.l0, 1.0f);
        View viewLJJI = ((PostModeNestHeaderComponent) aAListenerS136S0300000_11.l2).LJJI();
        if (viewLJJI != null) {
            C786410Ut5.T4(viewLJJI, 0.0f);
        }
        C0SS3 c0ss3 = ((PostModeNestHeaderComponent) aAListenerS136S0300000_11.l2).LLILZIL;
        if (c0ss3 != null) {
            c0ss3.LIZ();
        }
    }

    public static final void onAnimationEnd$4(AAListenerS136S0300000_11 aAListenerS136S0300000_11, Animator animator) {
        C19EG c19eg = (C19EG) aAListenerS136S0300000_11.l1;
        if (c19eg != null) {
            c19eg.finish();
            return;
        }
        SAFTikTokFragment sAFTikTokFragment = (SAFTikTokFragment) aAListenerS136S0300000_11.l2;
        if (sAFTikTokFragment == null) {
            return;
        }
        sAFTikTokFragment.aS(AFwS243S0000000_11.get$arr$(622));
        sAFTikTokFragment.finish();
    }

    public static final void onAnimationEnd$5(AAListenerS136S0300000_11 aAListenerS136S0300000_11, Animator animator) {
        C0SSM c0ssm = ((C722760SWs) aAListenerS136S0300000_11.l0).LIZ;
        if (c0ssm != null) {
            c0ssm.setOnTouchListener(null);
        }
        ((ImageView) aAListenerS136S0300000_11.l1).setImageDrawable(null);
        C786410Ut5.LJZ(8, (FrameLayout) aAListenerS136S0300000_11.l2);
        View view = ((C722760SWs) aAListenerS136S0300000_11.l0).LIZIZ;
        if (view != null) {
            C786410Ut5.T4(view, 1.0f);
        }
        ((C722760SWs) aAListenerS136S0300000_11.l0).getClass();
        C1440005kM.LIZ(new IEvent() { // from class: X.0SWt
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
    }

    public static final void onAnimationEnd$6(AAListenerS136S0300000_11 aAListenerS136S0300000_11, Animator animator) {
        Function0 function0 = (Function0) aAListenerS136S0300000_11.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationStart$3(AAListenerS136S0300000_11 aAListenerS136S0300000_11, Animator animator) {
        C786410Ut5.LJZI(0, (ImageView) aAListenerS136S0300000_11.l0);
        ((ImageView) aAListenerS136S0300000_11.l0).setImageBitmap((Bitmap) aAListenerS136S0300000_11.l1);
    }

    public static final void onAnimationStart$4(AAListenerS136S0300000_11 aAListenerS136S0300000_11, Animator animator) {
        View view = ((C722760SWs) aAListenerS136S0300000_11.l0).LIZIZ;
        if (view != null) {
            C786410Ut5.T4(view, 0.5f);
        }
    }

    public static final void onAnimationStart$6(AAListenerS136S0300000_11 aAListenerS136S0300000_11, Animator animator) {
        ViewGroup viewGroup = (ViewGroup) aAListenerS136S0300000_11.l0;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(0, viewGroup);
        }
    }

    public AAListenerS136S0300000_11(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj3;
        this.l2 = obj2;
    }
}
