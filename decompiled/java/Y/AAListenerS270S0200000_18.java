package Y;

import X.C1166690gSx;
import X.C1388190mED;
import X.C418440Gaw;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class AAListenerS270S0200000_18 implements Animator.AnimatorListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onAnimationCancel$0(AAListenerS270S0200000_18 aAListenerS270S0200000_18, Animator animator) {
    }

    public static final void onAnimationCancel$1(AAListenerS270S0200000_18 aAListenerS270S0200000_18, Animator animator) {
    }

    public static final void onAnimationCancel$2(AAListenerS270S0200000_18 aAListenerS270S0200000_18, Animator animator) {
    }

    public static final void onAnimationRepeat$0(AAListenerS270S0200000_18 aAListenerS270S0200000_18, Animator animator) {
    }

    public static final void onAnimationRepeat$1(AAListenerS270S0200000_18 aAListenerS270S0200000_18, Animator animator) {
    }

    public static final void onAnimationRepeat$2(AAListenerS270S0200000_18 aAListenerS270S0200000_18, Animator animator) {
    }

    public static final void onAnimationStart$2(AAListenerS270S0200000_18 aAListenerS270S0200000_18, Animator animator) {
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

    public static final void onAnimationEnd$0(AAListenerS270S0200000_18 aAListenerS270S0200000_18, Animator animator) {
        ViewGroup.LayoutParams layoutParams;
        LinearLayout linearLayoutAp = ((PoiPublishExtensionAssem) aAListenerS270S0200000_18.l0).ap();
        if (linearLayoutAp != null && (layoutParams = linearLayoutAp.getLayoutParams()) != null) {
            layoutParams.height = ((PoiPublishExtensionAssem) aAListenerS270S0200000_18.l0).LLJJJ;
        }
        LinearLayout linearLayoutAp2 = ((PoiPublishExtensionAssem) aAListenerS270S0200000_18.l0).ap();
        if (linearLayoutAp2 != null) {
            C786410Ut5.W4(linearLayoutAp2, 1.0f);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvDp = ((PoiPublishExtensionAssem) aAListenerS270S0200000_18.l0).dp();
        if (viewOnAttachStateChangeListenerC20604515jvDp != null) {
            C786410Ut5.LLF(0, viewOnAttachStateChangeListenerC20604515jvDp);
        }
        LinearLayout linearLayoutAp3 = ((PoiPublishExtensionAssem) aAListenerS270S0200000_18.l0).ap();
        if (linearLayoutAp3 != null) {
            linearLayoutAp3.requestLayout();
        }
        LinearLayout linearLayoutAp4 = ((PoiPublishExtensionAssem) aAListenerS270S0200000_18.l0).ap();
        if (linearLayoutAp4 != null) {
            HandlerHook.viewPostDelay(linearLayoutAp4, new ARunnableS106S0100000_6((Function0) aAListenerS270S0200000_18.l1, 101), 100L);
        }
    }

    public static final void onAnimationEnd$1(AAListenerS270S0200000_18 aAListenerS270S0200000_18, Animator animator) {
        Activity activityLIZ = C1388190mED.LIZ(((ViewOnAttachStateChangeListenerC20631115oD) aAListenerS270S0200000_18.l0).getContext());
        if (activityLIZ != null && !activityLIZ.isFinishing()) {
            ((ViewOnAttachStateChangeListenerC20631115oD) aAListenerS270S0200000_18.l0).endFakeDrag();
        }
    }

    public static final void onAnimationEnd$2(AAListenerS270S0200000_18 aAListenerS270S0200000_18, Animator animator) {
        AnimatorSet animatorSet = ((C1166690gSx) aAListenerS270S0200000_18.l0).LLJILJIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ((Function0) aAListenerS270S0200000_18.l1).invoke();
    }

    public static final void onAnimationStart$0(AAListenerS270S0200000_18 aAListenerS270S0200000_18, Animator animator) {
        ViewGroup.LayoutParams layoutParams;
        LinearLayout linearLayoutAp;
        LinearLayout linearLayoutAp2 = ((PoiPublishExtensionAssem) aAListenerS270S0200000_18.l0).ap();
        if (linearLayoutAp2 != null) {
            C786410Ut5.LJZL(0, linearLayoutAp2);
        }
        if (((PoiPublishExtensionAssem) aAListenerS270S0200000_18.l0).Zo().LLILLJJLI.isImageMode() && (linearLayoutAp = ((PoiPublishExtensionAssem) aAListenerS270S0200000_18.l0).ap()) != null && linearLayoutAp.getVisibility() == 0) {
            C426750GoL.LJIIL(((PoiPublishExtensionAssem) aAListenerS270S0200000_18.l0).bp().getProvideView().findViewById(R.id.y0w), null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), 23);
        }
        if (!((PoiPublishExtensionAssem) aAListenerS270S0200000_18.l0).Zo().LLILLJJLI.isImageNewStyleUi()) {
            LinearLayout linearLayoutAp3 = ((PoiPublishExtensionAssem) aAListenerS270S0200000_18.l0).ap();
            if (linearLayoutAp3 != null && (layoutParams = linearLayoutAp3.getLayoutParams()) != null) {
                layoutParams.height = 0;
            }
            LinearLayout linearLayoutAp4 = ((PoiPublishExtensionAssem) aAListenerS270S0200000_18.l0).ap();
            if (linearLayoutAp4 != null) {
                C786410Ut5.W4(linearLayoutAp4, 0.0f);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvDp = ((PoiPublishExtensionAssem) aAListenerS270S0200000_18.l0).dp();
            if (viewOnAttachStateChangeListenerC20604515jvDp != null) {
                C786410Ut5.LLF(8, viewOnAttachStateChangeListenerC20604515jvDp);
            }
            LinearLayout linearLayoutAp5 = ((PoiPublishExtensionAssem) aAListenerS270S0200000_18.l0).ap();
            if (linearLayoutAp5 != null) {
                linearLayoutAp5.requestLayout();
            }
        }
    }

    public static final void onAnimationStart$1(AAListenerS270S0200000_18 aAListenerS270S0200000_18, Animator animator) {
        ((ViewOnAttachStateChangeListenerC20631115oD) aAListenerS270S0200000_18.l1).beginFakeDrag();
    }

    public AAListenerS270S0200000_18(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
