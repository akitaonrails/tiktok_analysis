package X;

import Y.ARunnableS96S0200000_27;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.ss.android.ugc.aweme.tako.botpage.cards.questionnaire.TakoQuestionnaireAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yRK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class RunnableC1857600yRK implements Runnable {
    public final /* synthetic */ TakoQuestionnaireAssem LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    public RunnableC1857600yRK(TakoQuestionnaireAssem takoQuestionnaireAssem, long j, Function0<Unit> function0) {
        this.LL = takoQuestionnaireAssem;
        this.LLILLJJLI = j;
        this.LLILLL = function0;
    }

    public final void LIZ() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator interpolator;
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction;
        View view = this.LL.LLJJLIIIJLLLLLLLZ;
        if (view == null || (viewPropertyAnimatorAnimate = view.animate()) == null || (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(0.0f)) == null || (duration = viewPropertyAnimatorAlpha.setDuration(this.LLILLJJLI)) == null || (interpolator = duration.setInterpolator(C1619980sG4.LJIILIIL())) == null || (viewPropertyAnimatorWithEndAction = interpolator.withEndAction(new ARunnableS96S0200000_27(this.LLILLL, this.LL, 32))) == null) {
            return;
        }
        viewPropertyAnimatorWithEndAction.start();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("TakoQuestionnaireAssem@b499.dismissQuestionnaire$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoQuestionnaireAssem@b499.dismissQuestionnaire$1");
    }
}
