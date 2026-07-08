package Y;

import X.AnonymousClass0956;
import X.C0H1U;
import X.C0N2V;
import X.C0PEM;
import X.C0QNW;
import X.C0QNX;
import X.C0QR0;
import X.C0QR2;
import X.C1295960jpS;
import X.C1537820q7Y;
import X.C1DFH;
import X.C2107308Nj;
import X.C2193508ib;
import X.C23250099c;
import X.C2341109Fh;
import X.C341940Daq;
import X.C675950QfJ;
import X.C677230QhN;
import X.C679560Ql8;
import X.C680440QmY;
import X.C687030QxB;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleKt;
import com.ss.android.ugc.aweme.search.pages.result.common.survey.core.viewmodel.SurveyViewController;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class ALAdapterS7S0100000_10 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case 1:
                animator.removeListener(this);
                break;
            case 2:
            case 3:
            default:
                super.onAnimationCancel(animator);
                break;
            case 4:
                onAnimationCancel$2(this, animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws JSONException {
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
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 4:
                onAnimationStart$0(this, animator);
                break;
            case 5:
                onAnimationStart$1(this, animator);
                break;
            case 6:
                onAnimationStart$2(this, animator);
                break;
            case 7:
                onAnimationStart$3(this, animator);
                break;
            case 8:
                onAnimationStart$4(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
            default:
                super.onAnimationStart(animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationStart$5(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationStart$6(this, animator);
                break;
        }
    }

    public ALAdapterS7S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS7S0100000_10 aLAdapterS7S0100000_10, Animator animator) {
        C0H1U.LIZIZ((C677230QhN) aLAdapterS7S0100000_10.l0);
        String str = ((C677230QhN) aLAdapterS7S0100000_10.l0).LLJIJIL;
        if (str != null) {
            C675950QfJ.LIZ.getClass();
            C675950QfJ.LIZJ(str);
        }
        animator.removeListener(aLAdapterS7S0100000_10);
    }

    public static final void onAnimationCancel$2(ALAdapterS7S0100000_10 aLAdapterS7S0100000_10, Animator animator) {
        super.onAnimationCancel(animator);
        ((C680440QmY) aLAdapterS7S0100000_10.l0).LLIZ.setColor(C679560Ql8.LIZ);
    }

    public static final void onAnimationEnd$0(ALAdapterS7S0100000_10 aLAdapterS7S0100000_10, Animator animator) {
        C0H1U.LIZIZ((C677230QhN) aLAdapterS7S0100000_10.l0);
        String str = ((C677230QhN) aLAdapterS7S0100000_10.l0).LLJIJIL;
        if (str != null) {
            C675950QfJ.LIZ.getClass();
            C675950QfJ.LIZJ(str);
        }
        animator.removeListener(aLAdapterS7S0100000_10);
    }

    public static final void onAnimationEnd$1(ALAdapterS7S0100000_10 aLAdapterS7S0100000_10, Animator animator) {
        Lifecycle lifecycle;
        LifecycleCoroutineScope lifecycleCoroutineScopeAndroidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope;
        animator.removeListener(aLAdapterS7S0100000_10);
        C677230QhN c677230QhN = (C677230QhN) aLAdapterS7S0100000_10.l0;
        WeakReference<Lifecycle> weakReference = c677230QhN.LLIZ;
        AnonymousClass0956 anonymousClass0956LIZLLL = null;
        if (weakReference != null && (lifecycle = weakReference.get()) != null && (lifecycleCoroutineScopeAndroidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope = LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(lifecycle)) != null) {
            C1DFH c1dfh = C0PEM.LIZ;
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(lifecycleCoroutineScopeAndroidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope, C2107308Nj.LIZ, null, new C2193508ib(c677230QhN, null), 2);
        }
        c677230QhN.LLIZLLLIL = anonymousClass0956LIZLLL;
    }

    public static final void onAnimationEnd$10(ALAdapterS7S0100000_10 aLAdapterS7S0100000_10, Animator animator) {
        super.onAnimationEnd(animator);
        C0QR2 c0qr2 = (C0QR2) ((C0QR0) aLAdapterS7S0100000_10.l0);
        C786410Ut5.LJLLLLLL(8, c0qr2.LJ);
        c0qr2.LIZJ = 160;
        c0qr2.LJFF = C341940Daq.LIZ(0.0d);
        ((C0QR0) aLAdapterS7S0100000_10.l0).LIZLLL = 1;
    }

    public static final void onAnimationEnd$11(ALAdapterS7S0100000_10 aLAdapterS7S0100000_10, Animator animator) {
        super.onAnimationEnd(animator);
        C0QR2 c0qr2 = (C0QR2) ((C0QR0) aLAdapterS7S0100000_10.l0);
        c0qr2.LIZJ = 160;
        c0qr2.LJFF = C341940Daq.LIZ(0.0d);
        ((C0QR0) aLAdapterS7S0100000_10.l0).LIZLLL = 0;
    }

    public static final void onAnimationEnd$2(ALAdapterS7S0100000_10 aLAdapterS7S0100000_10, Animator animator) {
        ((SurveyViewController) aLAdapterS7S0100000_10.l0).LIZLLL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onAnimationEnd$3(Y.ALAdapterS7S0100000_10 r6, android.animation.Animator r7) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS7S0100000_10.onAnimationEnd$3(Y.ALAdapterS7S0100000_10, android.animation.Animator):void");
    }

    public static final void onAnimationEnd$4(ALAdapterS7S0100000_10 aLAdapterS7S0100000_10, Animator animator) {
        super.onAnimationEnd(animator);
        ((C680440QmY) aLAdapterS7S0100000_10.l0).LLIZ.setColor(C679560Ql8.LIZ);
    }

    public static final void onAnimationEnd$5(ALAdapterS7S0100000_10 aLAdapterS7S0100000_10, Animator animator) {
        ((SurveyViewController) aLAdapterS7S0100000_10.l0).LIZJ(1000L);
    }

    public static final void onAnimationEnd$6(ALAdapterS7S0100000_10 aLAdapterS7S0100000_10, Animator animator) {
        SurveyViewController surveyViewController = (SurveyViewController) aLAdapterS7S0100000_10.l0;
        C1295960jpS c1295960jpS = surveyViewController.LLJIJIL;
        C1295960jpS c1295960jpS2 = null;
        if (c1295960jpS == null) {
            c1295960jpS = null;
        }
        c1295960jpS.addAnimatorListener(new ALAdapterS7S0100000_10(surveyViewController, 5));
        C1295960jpS c1295960jpS3 = ((SurveyViewController) aLAdapterS7S0100000_10.l0).LLJIJIL;
        if (c1295960jpS3 != null) {
            c1295960jpS2 = c1295960jpS3;
        }
        c1295960jpS2.playAnimation();
    }

    public static final void onAnimationEnd$7(ALAdapterS7S0100000_10 aLAdapterS7S0100000_10, Animator animator) {
        super.onAnimationEnd(animator);
        C0QNX c0qnx = (C0QNX) ((C0QNW) aLAdapterS7S0100000_10.l0);
        c0qnx.LIZJ = 160;
        c0qnx.LJFF = C341940Daq.LIZ(0.0d);
        ((C0QNW) aLAdapterS7S0100000_10.l0).LIZLLL = 0;
    }

    public static final void onAnimationEnd$8(ALAdapterS7S0100000_10 aLAdapterS7S0100000_10, Animator animator) {
        super.onAnimationEnd(animator);
        C0QNX c0qnx = (C0QNX) ((C0QNW) aLAdapterS7S0100000_10.l0);
        C786410Ut5.LJLLLLLL(8, c0qnx.LJ);
        c0qnx.LIZJ = 160;
        c0qnx.LJFF = C341940Daq.LIZ(0.0d);
        ((C0QNW) aLAdapterS7S0100000_10.l0).LIZLLL = 1;
    }

    public static final void onAnimationEnd$9(ALAdapterS7S0100000_10 aLAdapterS7S0100000_10, Animator animator) throws JSONException {
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("dismissWithAnim: animationEnd");
        ((C687030QxB) aLAdapterS7S0100000_10.l0).LIZ();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", C0N2V.COIN_TASK.getType());
        C1537820q7Y.LIZ("ec_search_pendant_dismiss", jSONObject);
    }

    public static final void onAnimationStart$0(ALAdapterS7S0100000_10 aLAdapterS7S0100000_10, Animator animator) {
        super.onAnimationStart(animator);
        ((C680440QmY) aLAdapterS7S0100000_10.l0).LLIZ.setColor(0);
    }

    public static final void onAnimationStart$1(ALAdapterS7S0100000_10 aLAdapterS7S0100000_10, Animator animator) {
        C1295960jpS c1295960jpS = ((SurveyViewController) aLAdapterS7S0100000_10.l0).LLJIJIL;
        if (c1295960jpS == null) {
            c1295960jpS = null;
        }
        C786410Ut5.f5(c1295960jpS, 1.0f);
    }

    public static final void onAnimationStart$2(ALAdapterS7S0100000_10 aLAdapterS7S0100000_10, Animator animator) {
        View view = ((SurveyViewController) aLAdapterS7S0100000_10.l0).LLJI;
        TextView textView = null;
        if (view == null) {
            view = null;
        }
        C786410Ut5.LJLLLLLL(0, view);
        C1295960jpS c1295960jpS = ((SurveyViewController) aLAdapterS7S0100000_10.l0).LLJIJIL;
        if (c1295960jpS == null) {
            c1295960jpS = null;
        }
        C786410Ut5.f5(c1295960jpS, 0.0f);
        ViewGroup viewGroup = ((SurveyViewController) aLAdapterS7S0100000_10.l0).LLIZ;
        if (viewGroup == null) {
            viewGroup = null;
        }
        C786410Ut5.LJLZ(8, viewGroup);
        TextView textView2 = ((SurveyViewController) aLAdapterS7S0100000_10.l0).LLJ;
        if (textView2 == null) {
            textView2 = null;
        }
        C786410Ut5.LLIL(textView2, 8);
        TextView textView3 = ((SurveyViewController) aLAdapterS7S0100000_10.l0).LLILZLL;
        if (textView3 != null) {
            textView = textView3;
        }
        textView.setText(2131845779);
    }

    public static final void onAnimationStart$3(ALAdapterS7S0100000_10 aLAdapterS7S0100000_10, Animator animator) {
        super.onAnimationStart(animator);
        C0QNX c0qnx = (C0QNX) ((C0QNW) aLAdapterS7S0100000_10.l0);
        C786410Ut5.LJLLLLLL(0, c0qnx.LJ);
        C786410Ut5.ed(c0qnx.LJ, c0qnx.LJFF);
        C786410Ut5.T4(c0qnx.LJ, 0.0f);
    }

    public static final void onAnimationStart$4(ALAdapterS7S0100000_10 aLAdapterS7S0100000_10, Animator animator) {
        super.onAnimationStart(animator);
        C0QNX c0qnx = (C0QNX) ((C0QNW) aLAdapterS7S0100000_10.l0);
        C786410Ut5.ed(c0qnx.LJ, 0.0f);
        C786410Ut5.T4(c0qnx.LJ, 1.0f);
    }

    public static final void onAnimationStart$5(ALAdapterS7S0100000_10 aLAdapterS7S0100000_10, Animator animator) {
        super.onAnimationStart(animator);
        C0QR2 c0qr2 = (C0QR2) ((C0QR0) aLAdapterS7S0100000_10.l0);
        C786410Ut5.ed(c0qr2.LJ, 0.0f);
        C786410Ut5.T4(c0qr2.LJ, 1.0f);
    }

    public static final void onAnimationStart$6(ALAdapterS7S0100000_10 aLAdapterS7S0100000_10, Animator animator) {
        super.onAnimationStart(animator);
        C0QR2 c0qr2 = (C0QR2) ((C0QR0) aLAdapterS7S0100000_10.l0);
        C786410Ut5.LJLLLLLL(0, c0qr2.LJ);
        C786410Ut5.ed(c0qr2.LJ, c0qr2.LJFF);
        C786410Ut5.T4(c0qr2.LJ, 0.0f);
    }
}
