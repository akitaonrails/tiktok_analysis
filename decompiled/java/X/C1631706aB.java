package X;

import Y.AUListenerS64S0101000_2;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.06aB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1631706aB implements InterfaceC1632106aF, C06OA {
    public final /* synthetic */ C06ME LL = new C06ME();
    public final List<InterfaceC1632006aE> LLILLJJLI;
    public ValueAnimator LLILLL;

    @Override // X.C06OA
    public final void LLLZIL(C06MF c06mf) {
        this.LL.LLLZIL(c06mf);
    }

    @Override // X.C06OA
    public final void LLZLI() {
        this.LL.LLZLI();
    }

    @Override // X.C06OA
    public final void l(C06MF c06mf) {
        this.LL.l(c06mf);
    }

    @Override // X.InterfaceC1632106aF
    public final void LJIILIIL() {
        Iterator<InterfaceC1632006aE> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LJIILIIL();
        }
    }

    public C1631706aB() {
        ArrayList arrayList = new ArrayList();
        this.LLILLJJLI = arrayList;
        arrayList.add(new InterfaceC1632006aE() { // from class: X.06aD
            @Override // X.InterfaceC1632006aE
            public final void LIZ() {
            }

            @Override // X.InterfaceC1632006aE
            public final void LJIILIIL() {
            }

            @Override // X.InterfaceC1632006aE
            public final void LIZIZ() {
                this.LIZ.LLZLI();
            }
        });
    }

    public final void LIZ(final View view) {
        ValueAnimator valueAnimator = this.LLILLL;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        final int measuredHeight = view.getMeasuredHeight();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(measuredHeight, 0);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS64S0101000_2(measuredHeight, view, 2));
        valueAnimatorOfInt.addListener(new AnimatorListenerAdapter() { // from class: X.06aC
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (measuredHeight > 0) {
                    view.getLayoutParams().height = measuredHeight;
                }
                C786410Ut5.T4(view, 1.0f);
                C786410Ut5.LJLLLLLL(8, view);
                Iterator<InterfaceC1632006aE> it2 = this.LL.LLILLJJLI.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                Iterator<InterfaceC1632006aE> it2 = this.LL.LLILLJJLI.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ();
                }
            }
        });
        this.LLILLL = valueAnimatorOfInt;
        valueAnimatorOfInt.start();
    }
}
