package X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0R5g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C690140R5g extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C690140R5g(float f, long j, int i) {
        super(1);
        this.LL = f;
        this.LLILLJJLI = j;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        final View view2 = view;
        if (!C1834107Gh.LIZ() || !C690160R5i.LIZIZ.contains(Integer.valueOf(view2.getId()))) {
            C2180521AVm.LIZ(view2, EnumC2180541AVo.V_ANIMATE, (C1AV2) C1AVH.LIZLLL.getValue());
            ViewPropertyAnimator duration = view2.animate().alpha(this.LL).setDuration(this.LLILLJJLI);
            final int i = this.LLILLL;
            duration.setListener(new Animator.AnimatorListener(i, view2) { // from class: X.0R5h
                public final View LL;
                public final int LLILLJJLI;

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    if (this.LLILLJJLI == 2 && C1E29.LIZ()) {
                        C786410Ut5.LJLLLLLL(4, this.LL);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    if (this.LLILLJJLI == 1 && C1E29.LIZ()) {
                        C786410Ut5.LJLLLLLL(0, this.LL);
                    }
                }

                {
                    this.LL = view2;
                    this.LLILLJJLI = i;
                }
            }).start();
        }
        return Unit.LIZ;
    }
}
