package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06PJ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent$showBottomSkipWithAnimation$1$2", f = "BaseInterestSelectionComponent.kt", l = {1158}, m = "invokeSuspend")
public final class C06PJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BaseInterestSelectionComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06PJ(BaseInterestSelectionComponent baseInterestSelectionComponent, InterfaceC1364105Vn<? super C06PJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = baseInterestSelectionComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06PJ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C197039127h c197039127h;
        final C06PL c06pl;
        final int i;
        C1C7U.LIZ("BaseInterestSelectionComponent@f1ee.showBottomSkipWithAnimation$1$2");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            BaseInterestSelectionComponent baseInterestSelectionComponent = this.LLILLJJLI;
            final C197039127h c197039127h2 = baseInterestSelectionComponent.LLJZ;
            if (c197039127h2 != null && (c197039127h = baseInterestSelectionComponent.LLJZIJLIL) != null) {
                int width = c197039127h.getWidth();
                if (c197039127h.getLayoutDirection() == 1) {
                    c06pl = C06PL.RIGHT;
                } else {
                    c06pl = C06PL.LEFT;
                }
                final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c197039127h2.getLayoutParams();
                final int width2 = c197039127h2.getWidth();
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(width2, width);
                valueAnimatorOfInt.setDuration(500L);
                if (c06pl == C06PL.LEFT) {
                    i = marginLayoutParams.leftMargin;
                } else {
                    i = marginLayoutParams.rightMargin;
                }
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.06PK
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        int i3 = width2 - iIntValue;
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                        marginLayoutParams2.width = iIntValue;
                        if (c06pl == C06PL.LEFT) {
                            marginLayoutParams2.leftMargin = i + i3;
                        } else {
                            marginLayoutParams2.rightMargin = i + i3;
                        }
                        C786410Ut5.W5(c197039127h2, marginLayoutParams);
                    }
                });
                valueAnimatorOfInt.start();
            }
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(200L, this) == objLJFF) {
                C1C7U.LIZIZ("BaseInterestSelectionComponent@f1ee.showBottomSkipWithAnimation$1$2");
                return objLJFF;
            }
        }
        C197039127h c197039127h3 = this.LLILLJJLI.LLJZIJLIL;
        if (c197039127h3 != null) {
            c197039127h3.setActivated(true);
            C786410Ut5.S4(0.0f, c197039127h3);
            C786410Ut5.LLIL(c197039127h3, 0);
            c197039127h3.animate().alpha(1.0f).setDuration(300L);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseInterestSelectionComponent@f1ee.showBottomSkipWithAnimation$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
