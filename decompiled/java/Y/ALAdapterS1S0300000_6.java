package Y;

import X.C013C;
import X.C1324720kZq;
import X.C16F5;
import X.C1764390w0z;
import X.C1765200w2I;
import X.C2188811AlT;
import X.C421800GgM;
import X.C423640GjK;
import X.C425820Gmq;
import X.C425830Gmr;
import X.C426950Gof;
import X.C453470HqL;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.text.Spannable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public class ALAdapterS1S0300000_6 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 4:
                onAnimationCancel$0(this, animator);
                break;
            case 14:
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
            case 7:
                onAnimationEnd$7(this, animator);
                break;
            case 8:
                onAnimationEnd$8(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationEnd$9(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationEnd$10(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationEnd$11(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationEnd$12(this, animator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationEnd$13(this, animator);
                break;
            case 14:
                onAnimationEnd$14(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 1:
                onAnimationStart$0(this, animator);
                break;
            case 2:
                onAnimationStart$1(this, animator);
                break;
            case 6:
                onAnimationStart$2(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationStart$3(this, animator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationStart$4(this, animator);
                break;
            case 15:
                onAnimationStart$5(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS1S0300000_6 aLAdapterS1S0300000_6, Animator animator) {
        ((C013C) aLAdapterS1S0300000_6.l0).element = true;
    }

    public static final void onAnimationCancel$1(ALAdapterS1S0300000_6 aLAdapterS1S0300000_6, Animator animator) {
        ((C013C) aLAdapterS1S0300000_6.l0).element = true;
    }

    public static final void onAnimationEnd$0(ALAdapterS1S0300000_6 aLAdapterS1S0300000_6, Animator animator) {
        C786410Ut5.LJJJLZIJ((FrameLayout) aLAdapterS1S0300000_6.l1, (ViewGroup) aLAdapterS1S0300000_6.l0);
        ((Function0) aLAdapterS1S0300000_6.l2).invoke();
    }

    public static final void onAnimationEnd$1(ALAdapterS1S0300000_6 aLAdapterS1S0300000_6, Animator animator) {
        ((C16F5) aLAdapterS1S0300000_6.l0).setText((Spannable) aLAdapterS1S0300000_6.l2);
    }

    public static final void onAnimationEnd$10(ALAdapterS1S0300000_6 aLAdapterS1S0300000_6, Animator animator) {
        C786410Ut5.LJLZ(4, (ViewGroup) aLAdapterS1S0300000_6.l0);
        C786410Ut5.LJJJJI((ViewGroup) aLAdapterS1S0300000_6.l0);
        C1765200w2I c1765200w2I = ((C1764390w0z) aLAdapterS1S0300000_6.l1).LIZLLL;
        if (c1765200w2I != null) {
            c1765200w2I.LIZLLL();
        }
        ((C1764390w0z) aLAdapterS1S0300000_6.l1).LIZLLL = null;
        Function0 function0 = (Function0) aLAdapterS1S0300000_6.l2;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$11(ALAdapterS1S0300000_6 aLAdapterS1S0300000_6, Animator animator) {
        C425830Gmr c425830Gmr = (C425830Gmr) aLAdapterS1S0300000_6.l0;
        C425820Gmq c425820Gmq = (C425820Gmq) aLAdapterS1S0300000_6.l1;
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c425830Gmr, c425820Gmq);
        c425830Gmr.removeView(c425820Gmq);
        ListProtector.remove(((C425830Gmr) aLAdapterS1S0300000_6.l0).LLILZ, 0);
        for (View view : (ArrayList) ((C425830Gmr) aLAdapterS1S0300000_6.l0).LLILZ) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
            view.setTranslationX(0.0f);
        }
        C425820Gmq c425820Gmq2 = (C425820Gmq) aLAdapterS1S0300000_6.l2;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c425820Gmq2);
        c425820Gmq2.setTranslationX(0.0f);
        ((ArrayList) ((C425830Gmr) aLAdapterS1S0300000_6.l0).LLILZ).add((C425820Gmq) aLAdapterS1S0300000_6.l2);
        ((C425830Gmr) aLAdapterS1S0300000_6.l0).LIZ();
        C425830Gmr c425830Gmr2 = (C425830Gmr) aLAdapterS1S0300000_6.l0;
        c425830Gmr2.LLILZLL = false;
        c425830Gmr2.requestLayout();
        ((C425830Gmr) aLAdapterS1S0300000_6.l0).invalidate();
    }

    public static final void onAnimationEnd$12(ALAdapterS1S0300000_6 aLAdapterS1S0300000_6, Animator animator) {
        ((ValueAnimator) aLAdapterS1S0300000_6.l1).removeAllListeners();
        ((C421800GgM) aLAdapterS1S0300000_6.l2).LJIIIZ((RecyclerView.ViewHolder) aLAdapterS1S0300000_6.l0);
        ((C421800GgM) aLAdapterS1S0300000_6.l2).LLJJI.remove((RecyclerView.ViewHolder) aLAdapterS1S0300000_6.l0);
        ((C421800GgM) aLAdapterS1S0300000_6.l2).LJJIIZI();
    }

    public static final void onAnimationEnd$13(ALAdapterS1S0300000_6 aLAdapterS1S0300000_6, Animator animator) {
        ((ValueAnimator) aLAdapterS1S0300000_6.l1).removeAllListeners();
        View view = ((RecyclerView.ViewHolder) aLAdapterS1S0300000_6.l0).itemView;
        C786410Ut5.T4(view, 1.0f);
        C786410Ut5.Ob(view, 1.0f);
        C786410Ut5.pc(view, 1.0f);
        ((C421800GgM) aLAdapterS1S0300000_6.l2).LJIIIZ((RecyclerView.ViewHolder) aLAdapterS1S0300000_6.l0);
        ((C421800GgM) aLAdapterS1S0300000_6.l2).LLJJIII.remove((RecyclerView.ViewHolder) aLAdapterS1S0300000_6.l0);
        ((C421800GgM) aLAdapterS1S0300000_6.l2).LJJIIZI();
    }

    public static final void onAnimationEnd$14(ALAdapterS1S0300000_6 aLAdapterS1S0300000_6, Animator animator) {
        if (((C013C) aLAdapterS1S0300000_6.l0).element) {
            return;
        }
        ((C453470HqL) aLAdapterS1S0300000_6.l1).LLJILJIL = null;
        C786410Ut5.M5((C453470HqL) aLAdapterS1S0300000_6.l1, 1.0f);
        C786410Ut5.LJLLLLLL(8, (C453470HqL) aLAdapterS1S0300000_6.l1);
        ((Function0) aLAdapterS1S0300000_6.l2).invoke();
        ((C453470HqL) aLAdapterS1S0300000_6.l1).LLILZ = false;
    }

    public static final void onAnimationEnd$2(ALAdapterS1S0300000_6 aLAdapterS1S0300000_6, Animator animator) {
        ((ViewPropertyAnimator) aLAdapterS1S0300000_6.l2).setListener(null);
        ((C426950Gof) aLAdapterS1S0300000_6.l0).LJJIIJ((RecyclerView.ViewHolder) aLAdapterS1S0300000_6.l1);
    }

    public static final void onAnimationEnd$3(ALAdapterS1S0300000_6 aLAdapterS1S0300000_6, Animator animator) {
        C786410Ut5.LJJJLZIJ((C1324720kZq) aLAdapterS1S0300000_6.l1, (ViewGroup) aLAdapterS1S0300000_6.l0);
        Runnable runnable = (Runnable) aLAdapterS1S0300000_6.l2;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static final void onAnimationEnd$4(ALAdapterS1S0300000_6 aLAdapterS1S0300000_6, Animator animator) {
        boolean z;
        if (((C013C) aLAdapterS1S0300000_6.l0).element) {
            return;
        }
        ((C453470HqL) aLAdapterS1S0300000_6.l1).LLJILJIL = null;
        C786410Ut5.Bd((C453470HqL) aLAdapterS1S0300000_6.l1, 0.0f);
        C786410Ut5.M5((C453470HqL) aLAdapterS1S0300000_6.l1, 1.0f);
        ((C453470HqL) aLAdapterS1S0300000_6.l1).LIZIZ();
        C786410Ut5.LJLLLLLL(8, (C453470HqL) aLAdapterS1S0300000_6.l1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismiss: end, alpha=");
        sbLIZ.append(((C453470HqL) aLAdapterS1S0300000_6.l1).getAlpha());
        sbLIZ.append(", isVisible=");
        if (((C453470HqL) aLAdapterS1S0300000_6.l1).getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        ((Function0) aLAdapterS1S0300000_6.l2).invoke();
        ((C453470HqL) aLAdapterS1S0300000_6.l1).LLILZ = false;
    }

    public static final void onAnimationEnd$5(ALAdapterS1S0300000_6 aLAdapterS1S0300000_6, Animator animator) {
        View view = (View) aLAdapterS1S0300000_6.l0;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = (View) aLAdapterS1S0300000_6.l1;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        ((Function0) aLAdapterS1S0300000_6.l2).invoke();
    }

    public static final void onAnimationEnd$6(ALAdapterS1S0300000_6 aLAdapterS1S0300000_6, Animator animator) {
        ((C16F5) aLAdapterS1S0300000_6.l0).setText((Spannable) aLAdapterS1S0300000_6.l2);
    }

    public static final void onAnimationEnd$7(ALAdapterS1S0300000_6 aLAdapterS1S0300000_6, Animator animator) {
        C786410Ut5.LJZL(8, (LinearLayout) aLAdapterS1S0300000_6.l0);
        LinearLayout linearLayout = (LinearLayout) aLAdapterS1S0300000_6.l0;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.width = -2;
        C786410Ut5.d6(linearLayout, layoutParams);
        ((LinearLayout) aLAdapterS1S0300000_6.l0).requestLayout();
        C786410Ut5.Uc((TuxIconView) aLAdapterS1S0300000_6.l1, 0.0f);
        Function0 function0 = (Function0) aLAdapterS1S0300000_6.l2;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onAnimationEnd$8(ALAdapterS1S0300000_6 aLAdapterS1S0300000_6, Animator animator) {
        ((View) aLAdapterS1S0300000_6.l0).animate().setListener(null);
        ((C423640GjK) aLAdapterS1S0300000_6.l1).LJJIJIL((RecyclerView.ViewHolder) aLAdapterS1S0300000_6.l2);
    }

    public static final void onAnimationEnd$9(ALAdapterS1S0300000_6 aLAdapterS1S0300000_6, Animator animator) {
        ((View) aLAdapterS1S0300000_6.l0).animate().setListener(null);
        if (((C423640GjK) aLAdapterS1S0300000_6.l1).LLJJJJ.contains((RecyclerView.ViewHolder) aLAdapterS1S0300000_6.l2)) {
            C423640GjK c423640GjK = (C423640GjK) aLAdapterS1S0300000_6.l1;
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) aLAdapterS1S0300000_6.l2;
            c423640GjK.getClass();
            View view = viewHolder.itemView;
            view.animate().translationX(0.0f).translationY(0.0f).setDuration(20L).setInterpolator(c423640GjK.LLJJJJJIL).setListener(new ALAdapterS1S0300000_6(view, c423640GjK, viewHolder, 8)).start();
        }
    }

    public static final void onAnimationStart$0(ALAdapterS1S0300000_6 aLAdapterS1S0300000_6, Animator animator) {
        ((C16F5) aLAdapterS1S0300000_6.l0).setText((Spannable) aLAdapterS1S0300000_6.l1);
    }

    public static final void onAnimationStart$1(ALAdapterS1S0300000_6 aLAdapterS1S0300000_6, Animator animator) {
        ((C426950Gof) aLAdapterS1S0300000_6.l0).getClass();
    }

    public static final void onAnimationStart$2(ALAdapterS1S0300000_6 aLAdapterS1S0300000_6, Animator animator) {
        ((C16F5) aLAdapterS1S0300000_6.l0).setText((Spannable) aLAdapterS1S0300000_6.l1);
    }

    public static final void onAnimationStart$3(ALAdapterS1S0300000_6 aLAdapterS1S0300000_6, Animator animator) {
        ((C421800GgM) aLAdapterS1S0300000_6.l2).getClass();
    }

    public static final void onAnimationStart$4(ALAdapterS1S0300000_6 aLAdapterS1S0300000_6, Animator animator) {
        ((C421800GgM) aLAdapterS1S0300000_6.l2).getClass();
    }

    public static final void onAnimationStart$5(ALAdapterS1S0300000_6 aLAdapterS1S0300000_6, Animator animator) {
        TextPaint paint;
        super.onAnimationStart(animator);
        if (((C013C) aLAdapterS1S0300000_6.l0).element && (paint = ((C16F5) aLAdapterS1S0300000_6.l1).getPaint()) != null) {
            paint.setShader(null);
        }
        ((Function0) aLAdapterS1S0300000_6.l2).invoke();
    }

    public ALAdapterS1S0300000_6(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
