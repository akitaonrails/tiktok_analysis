package Y;

import X.AnonymousClass1855;
import X.C1906580ziK;
import X.C20684815ws;
import X.C2344009Gk;
import X.C786410Ut5;
import X.RunnableC776140UcW;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.bytedance.android.livesdk.broadcast.interaction.widget.ShortCutPanelPalletWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.revision.PreviewCampaignCenterWidget;
import com.bytedance.android.livesdk.broadcast.record.LiveRecordManager;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackButtonAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public class ALAdapterS9S0200000_12 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationCancel$0(this, animator);
                break;
            case 6:
                onAnimationCancel$1(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationCancel$2(this, animator);
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
                onAnimationEnd$2(this, animator);
                break;
            case 3:
                onAnimationEnd$3(this, animator);
                break;
            case 4:
                onAnimationEnd$4(this, animator);
                break;
            case 5:
            case BdTuring.TYPE_ECAF /* 9 */:
            default:
                super.onAnimationEnd(animator);
                break;
            case 6:
                onAnimationEnd$5(this, animator);
                break;
            case 7:
                onAnimationEnd$6(this, animator);
                break;
            case 8:
                onAnimationEnd$7(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationEnd$8(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (5 - this.$t != 0) {
            super.onAnimationEnd(animator, z);
        } else {
            onAnimationEnd$0(this, animator, z);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 4:
                onAnimationStart$0(this, animator);
                break;
            case 5:
            case 7:
            case 8:
            default:
                super.onAnimationStart(animator);
                break;
            case 6:
                onAnimationStart$1(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationStart$2(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationStart$3(this, animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS9S0200000_12 aLAdapterS9S0200000_12, Animator animator) {
        ((AnonymousClass1855) aLAdapterS9S0200000_12.l0).LJIJI = null;
    }

    public static final void onAnimationCancel$1(ALAdapterS9S0200000_12 aLAdapterS9S0200000_12, Animator animator) {
        C786410Ut5.LJLLLLLL(4, (View) aLAdapterS9S0200000_12.l0);
    }

    public static final void onAnimationCancel$2(ALAdapterS9S0200000_12 aLAdapterS9S0200000_12, Animator animator) {
        Function0 function0 = (Function0) aLAdapterS9S0200000_12.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS9S0200000_12 aLAdapterS9S0200000_12, Animator animator) {
        ((Function0) aLAdapterS9S0200000_12.l0).invoke();
        View view = ((ShortCutPanelPalletWidget) aLAdapterS9S0200000_12.l1).getView();
        if (view != null) {
            C786410Ut5.T4(view, 1.0f);
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS9S0200000_12 aLAdapterS9S0200000_12, Animator animator) {
        ((AnonymousClass1855) aLAdapterS9S0200000_12.l0).LJIJI = null;
        Function0 function0 = (Function0) aLAdapterS9S0200000_12.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$2(ALAdapterS9S0200000_12 aLAdapterS9S0200000_12, Animator animator) {
        super.onAnimationEnd(animator);
        ((ViewPropertyAnimator) aLAdapterS9S0200000_12.l0).setListener(null);
        ((PreviewCampaignCenterWidget) aLAdapterS9S0200000_12.l1).M1();
    }

    public static final void onAnimationEnd$3(ALAdapterS9S0200000_12 aLAdapterS9S0200000_12, Animator animator) {
        ((Function0) aLAdapterS9S0200000_12.l0).invoke();
        C786410Ut5.Ob((View) aLAdapterS9S0200000_12.l1, 1.0f);
        C786410Ut5.pc((View) aLAdapterS9S0200000_12.l1, 1.0f);
    }

    public static final void onAnimationEnd$4(ALAdapterS9S0200000_12 aLAdapterS9S0200000_12, Animator animator) {
        Function0 function0 = (Function0) aLAdapterS9S0200000_12.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$5(ALAdapterS9S0200000_12 aLAdapterS9S0200000_12, Animator animator) {
        C786410Ut5.LJLLLLLL(4, (View) aLAdapterS9S0200000_12.l0);
    }

    public static final void onAnimationEnd$6(ALAdapterS9S0200000_12 aLAdapterS9S0200000_12, Animator animator) {
        int i;
        int i2;
        Drawable background = ((RunnableC776140UcW) aLAdapterS9S0200000_12.l0).getIvRecordRedDotFromXml().getBackground();
        RunnableC776140UcW runnableC776140UcW = (RunnableC776140UcW) aLAdapterS9S0200000_12.l0;
        background.mutate();
        LiveRecordManager liveRecordManager = LiveRecordManager.LL;
        liveRecordManager.getClass();
        if (LiveRecordManager.LLILZ) {
            i = R.attr.f09;
        } else {
            i = R.attr.f07;
        }
        background.setTint(runnableC776140UcW.LJIIIIZZ(i));
        View ivRecordRedRingFromXml = ((RunnableC776140UcW) aLAdapterS9S0200000_12.l0).getIvRecordRedRingFromXml();
        Context context = ((RunnableC776140UcW) aLAdapterS9S0200000_12.l0).getContext();
        liveRecordManager.getClass();
        if (LiveRecordManager.LLILZ) {
            i2 = R.drawable.f_c;
        } else {
            i2 = R.drawable.f_a;
        }
        ivRecordRedRingFromXml.setBackground(context.getDrawable(i2));
        Function0 function0 = (Function0) aLAdapterS9S0200000_12.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$7(ALAdapterS9S0200000_12 aLAdapterS9S0200000_12, Animator animator) {
        int i;
        int i2;
        Drawable background = ((RunnableC776140UcW) aLAdapterS9S0200000_12.l0).getIvRecordRedDotFromXml().getBackground();
        RunnableC776140UcW runnableC776140UcW = (RunnableC776140UcW) aLAdapterS9S0200000_12.l0;
        background.mutate();
        LiveRecordManager liveRecordManager = LiveRecordManager.LL;
        liveRecordManager.getClass();
        if (LiveRecordManager.LLILZ) {
            i = R.attr.f09;
        } else {
            i = R.attr.f08;
        }
        background.setTint(runnableC776140UcW.LJIIIIZZ(i));
        View ivRecordRedRingFromXml = ((RunnableC776140UcW) aLAdapterS9S0200000_12.l0).getIvRecordRedRingFromXml();
        Context context = ((RunnableC776140UcW) aLAdapterS9S0200000_12.l0).getContext();
        liveRecordManager.getClass();
        if (LiveRecordManager.LLILZ) {
            i2 = R.drawable.f_c;
        } else {
            i2 = R.drawable.f_b;
        }
        ivRecordRedRingFromXml.setBackground(context.getDrawable(i2));
        Function0 function0 = (Function0) aLAdapterS9S0200000_12.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$8(ALAdapterS9S0200000_12 aLAdapterS9S0200000_12, Animator animator) {
        Function0 function0 = (Function0) aLAdapterS9S0200000_12.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationStart$0(ALAdapterS9S0200000_12 aLAdapterS9S0200000_12, Animator animator) {
        Function0 function0 = (Function0) aLAdapterS9S0200000_12.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationStart$1(ALAdapterS9S0200000_12 aLAdapterS9S0200000_12, Animator animator) {
        C786410Ut5.LJLLLLLL(0, (View) aLAdapterS9S0200000_12.l1);
    }

    public static final void onAnimationStart$2(ALAdapterS9S0200000_12 aLAdapterS9S0200000_12, Animator animator) {
        C786410Ut5.ed((View) aLAdapterS9S0200000_12.l0, 0.0f);
        EarlyFeedbackButtonAssem earlyFeedbackButtonAssem = (EarlyFeedbackButtonAssem) aLAdapterS9S0200000_12.l1;
        View view = (View) aLAdapterS9S0200000_12.l0;
        earlyFeedbackButtonAssem.getClass();
        EarlyFeedbackButtonAssem.Xp(view, 0, 0);
        C786410Ut5.LJLLLLLL(0, (View) aLAdapterS9S0200000_12.l0);
    }

    public static final void onAnimationStart$3(ALAdapterS9S0200000_12 aLAdapterS9S0200000_12, Animator animator) {
        Function0 function0 = (Function0) aLAdapterS9S0200000_12.l1;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public ALAdapterS9S0200000_12(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onAnimationEnd$0(ALAdapterS9S0200000_12 aLAdapterS9S0200000_12, Animator animator, boolean z) {
        String str;
        if (((VerticalViewPager) aLAdapterS9S0200000_12.l0).LLLLIILLL) {
            View view = (View) aLAdapterS9S0200000_12.l1;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            ((VerticalViewPager) aLAdapterS9S0200000_12.l0).LLLLZI();
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (C1906580ziK.LJI()) {
                str = "background";
            } else {
                str = "disappear";
            }
            c2344009Gk.LJIIIIZZ("disappear_method", str);
            c2344009Gk.LJIIIIZZ("ui_type", "bottom");
            C20684815ws.LJIILLIIL("swipe_up_guide_disappear", c2344009Gk.LIZ);
        }
    }
}
