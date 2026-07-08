package Y;

import X.C1602160rnK;
import X.C1819070xRB;
import X.C1835920xsM;
import X.C1835960xsQ;
import X.C1835970xsR;
import X.C1835980xsS;
import X.C1838180xw0;
import X.C1840250xzL;
import X.C1851760yHu;
import X.C427330GpH;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.EnumC1802220x00;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.bytedance.android.live.liveinteract.multihost.biz.view.InteractionGuideLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.general.HighlightPreviewClipFragment;
import com.ss.android.ugc.aweme.tako.otherpage.sheet.TakoSheetFragment;
import com.tts.oecverify.BdTuring;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public class ALAdapterS22S0100000_27 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 4:
                onAnimationCancel$0(this, animator);
                break;
            case 5:
            case 6:
            case 7:
            default:
                super.onAnimationCancel(animator);
                break;
            case 8:
                onAnimationCancel$1(this, animator);
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
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (8 - this.$t != 0) {
            super.onAnimationStart(animator);
        } else {
            onAnimationStart$0(this, animator);
        }
    }

    public ALAdapterS22S0100000_27(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS22S0100000_27 aLAdapterS22S0100000_27, Animator animator) {
        if (!Intrinsics.LJFF(((C1819070xRB) aLAdapterS22S0100000_27.l0).LLIZ, animator)) {
            return;
        }
        C1819070xRB c1819070xRB = (C1819070xRB) aLAdapterS22S0100000_27.l0;
        c1819070xRB.LLIZ = null;
        c1819070xRB.LLILZLL = null;
        c1819070xRB.LLILZ = EnumC1802220x00.LL;
        c1819070xRB.LIZ();
    }

    public static final void onAnimationCancel$1(ALAdapterS22S0100000_27 aLAdapterS22S0100000_27, Animator animator) {
        ((HighlightPreviewClipFragment) aLAdapterS22S0100000_27.l0).LLJJJJJIL = null;
    }

    public static final void onAnimationEnd$0(ALAdapterS22S0100000_27 aLAdapterS22S0100000_27, Animator animator) {
        super.onAnimationEnd(animator);
        C500260Jjc.LJLJLJ((C1851760yHu) aLAdapterS22S0100000_27.l0, false);
    }

    public static final void onAnimationEnd$1(ALAdapterS22S0100000_27 aLAdapterS22S0100000_27, Animator animator) {
        C500260Jjc.LJIILIIL((View) aLAdapterS22S0100000_27.l0);
    }

    public static final void onAnimationEnd$2(ALAdapterS22S0100000_27 aLAdapterS22S0100000_27, Animator animator) {
        C1840250xzL c1840250xzL = (C1840250xzL) aLAdapterS22S0100000_27.l0;
        c1840250xzL.LLJI = 1.0f;
        c1840250xzL.LLILLJJLI = false;
    }

    public static final void onAnimationEnd$3(ALAdapterS22S0100000_27 aLAdapterS22S0100000_27, Animator animator) {
        ((C1835980xsS) aLAdapterS22S0100000_27.l0).setNeedShowMask(false);
        ((C1835980xsS) aLAdapterS22S0100000_27.l0).LIZJ();
    }

    public static final void onAnimationEnd$4(ALAdapterS22S0100000_27 aLAdapterS22S0100000_27, Animator animator) {
        if (!Intrinsics.LJFF(((C1819070xRB) aLAdapterS22S0100000_27.l0).LLIZ, animator)) {
            return;
        }
        C1819070xRB c1819070xRB = (C1819070xRB) aLAdapterS22S0100000_27.l0;
        c1819070xRB.LLIZ = null;
        c1819070xRB.LLILLL = 0.0f;
        c1819070xRB.LLILZLL = null;
        c1819070xRB.LLILZ = EnumC1802220x00.LL;
        c1819070xRB.LJIIJ();
        C786410Ut5.Z1(((C1819070xRB) aLAdapterS22S0100000_27.l0).LLJILJIL, 8);
        C1819070xRB c1819070xRB2 = (C1819070xRB) aLAdapterS22S0100000_27.l0;
        int visibility = c1819070xRB2.getVisibility();
        c1819070xRB2.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c1819070xRB2);
    }

    public static final void onAnimationEnd$5(ALAdapterS22S0100000_27 aLAdapterS22S0100000_27, Animator animator) {
        ((C1835980xsS) aLAdapterS22S0100000_27.l0).setNeedShowMask(true);
        if (((C1835980xsS) aLAdapterS22S0100000_27.l0).getNeedHide()) {
            ((C1835980xsS) aLAdapterS22S0100000_27.l0).LIZIZ(Mp4ScreenVideoLoadTimeout.CONTROL);
        }
        ((C1835980xsS) aLAdapterS22S0100000_27.l0).LIZJ();
    }

    public static final void onAnimationEnd$6(ALAdapterS22S0100000_27 aLAdapterS22S0100000_27, Animator animator) {
        ((C1838180xw0) aLAdapterS22S0100000_27.l0).getClass();
    }

    public static final void onAnimationEnd$7(ALAdapterS22S0100000_27 aLAdapterS22S0100000_27, Animator animator) {
        super.onAnimationEnd(animator);
        C427330GpH c427330GpH = ((InteractionGuideLayout) aLAdapterS22S0100000_27.l0).LLJJJJ;
        if (c427330GpH == null) {
            c427330GpH = null;
        }
        c427330GpH.LJJJJI();
    }

    public static final void onAnimationEnd$8(ALAdapterS22S0100000_27 aLAdapterS22S0100000_27, Animator animator) {
        float currentPercentage;
        float fFloatValue;
        C1835960xsQ scrollHandle$live_release;
        float fFloatValue2;
        float f;
        C1835960xsQ scrollHandle$live_release2;
        C1835970xsR c1835970xsR = ((HighlightPreviewClipFragment) aLAdapterS22S0100000_27.l0).LLIZLLLIL;
        if (c1835970xsR != null) {
            c1835970xsR.LJIIIIZZ(0.01f);
        }
        TuxTextView tuxTextView = ((HighlightPreviewClipFragment) aLAdapterS22S0100000_27.l0).LLJJIII;
        boolean z = false;
        if (tuxTextView != null) {
            tuxTextView.setText(C786410Ut5.k4(Locale.ENGLISH, "%02d:%02d", Arrays.copyOf(new Object[]{0, 0}, 2)));
        }
        View view = ((HighlightPreviewClipFragment) aLAdapterS22S0100000_27.l0).LLJIJIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        TuxTextView tuxTextView2 = ((HighlightPreviewClipFragment) aLAdapterS22S0100000_27.l0).LLILZ;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(C497740JfY.LJIJI(2131852400));
        }
        HighlightPreviewClipFragment highlightPreviewClipFragment = (HighlightPreviewClipFragment) aLAdapterS22S0100000_27.l0;
        highlightPreviewClipFragment.LLJJJ = true;
        C1835920xsM c1835920xsM = highlightPreviewClipFragment.LLJJ;
        float fFloatValue3 = 0.0f;
        if (c1835920xsM != null && (scrollHandle$live_release2 = c1835920xsM.getScrollHandle$live_release()) != null) {
            currentPercentage = scrollHandle$live_release2.getCurrentPercentage();
        } else {
            currentPercentage = 0.0f;
        }
        C1835920xsM c1835920xsM2 = ((HighlightPreviewClipFragment) aLAdapterS22S0100000_27.l0).LLJJ;
        if (c1835920xsM2 != null) {
            fFloatValue = c1835920xsM2.getLeftPercentage().invoke().floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        C1835920xsM c1835920xsM3 = ((HighlightPreviewClipFragment) aLAdapterS22S0100000_27.l0).LLJJ;
        if (c1835920xsM3 != null) {
            fFloatValue3 = c1835920xsM3.getRightPercentage().invoke().floatValue();
        }
        if (currentPercentage >= fFloatValue3 || currentPercentage <= fFloatValue) {
            z = true;
        }
        C1835920xsM c1835920xsM4 = ((HighlightPreviewClipFragment) aLAdapterS22S0100000_27.l0).LLJJ;
        if (c1835920xsM4 != null && (scrollHandle$live_release = c1835920xsM4.getScrollHandle$live_release()) != null) {
            scrollHandle$live_release.LLJJIJIIJIL = true;
            if (z) {
                scrollHandle$live_release.LLJJJ = System.currentTimeMillis();
                scrollHandle$live_release.LLJJL.invoke();
                Function1<? super Float, Unit> function1 = scrollHandle$live_release.LLJJIII;
                if (function1 != null) {
                    if (scrollHandle$live_release.LLIZLLLIL) {
                        fFloatValue2 = (scrollHandle$live_release.LLJJJIL.LIZIZ.floatValue() - scrollHandle$live_release.LLJ) - (scrollHandle$live_release.LLJIJIL / 2);
                        f = scrollHandle$live_release.LLLFFI;
                    } else {
                        fFloatValue2 = (scrollHandle$live_release.LLJJJIL.LIZIZ.floatValue() - scrollHandle$live_release.LLJ) + (scrollHandle$live_release.LLJIJIL / 2);
                        f = scrollHandle$live_release.LLLFFI;
                    }
                    function1.invoke(Float.valueOf(fFloatValue2 / f));
                }
                Function0<Unit> function0 = scrollHandle$live_release.LLJJIJI;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
        ((HighlightPreviewClipFragment) aLAdapterS22S0100000_27.l0).LLJJJJJIL = null;
    }

    public static final void onAnimationEnd$9(ALAdapterS22S0100000_27 aLAdapterS22S0100000_27, Animator animator) {
        ((TakoSheetFragment) aLAdapterS22S0100000_27.l0).uS();
    }

    public static final void onAnimationStart$0(ALAdapterS22S0100000_27 aLAdapterS22S0100000_27, Animator animator) {
        C1835960xsQ scrollHandle$live_release;
        super.onAnimationStart(animator);
        C1835970xsR c1835970xsR = ((HighlightPreviewClipFragment) aLAdapterS22S0100000_27.l0).LLIZLLLIL;
        if (c1835970xsR != null) {
            c1835970xsR.LJI();
        }
        C1835970xsR c1835970xsR2 = ((HighlightPreviewClipFragment) aLAdapterS22S0100000_27.l0).LLIZLLLIL;
        if (c1835970xsR2 != null) {
            c1835970xsR2.LJIIIIZZ(0.0f);
        }
        C1835920xsM c1835920xsM = ((HighlightPreviewClipFragment) aLAdapterS22S0100000_27.l0).LLJJ;
        if (c1835920xsM != null && (scrollHandle$live_release = c1835920xsM.getScrollHandle$live_release()) != null) {
            Function0<Unit> function0 = scrollHandle$live_release.LLJJIJI;
            if (function0 != null) {
                function0.invoke();
            }
            scrollHandle$live_release.LLJJJ = System.currentTimeMillis();
            scrollHandle$live_release.LLJJL.invoke();
        }
    }
}
