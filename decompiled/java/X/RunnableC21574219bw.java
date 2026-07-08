package X;

import Y.ALAdapterS27S0100000_33;
import Y.AUListenerS280S0100000_33;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.19bw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class RunnableC21574219bw implements Runnable {
    public final /* synthetic */ C21574419by LL;
    public final /* synthetic */ Rect LLILLJJLI;
    public final /* synthetic */ Rect LLILLL;
    public final /* synthetic */ InterfaceC417910Ga5 LLILZ;
    public final /* synthetic */ C16CY LLILZIL;
    public final /* synthetic */ int[] LLILZLL = null;

    public RunnableC21574219bw(C21574419by c21574419by, Rect rect, Rect rect2, C417900Ga4 c417900Ga4, C16CY c16cy) {
        this.LL = c21574419by;
        this.LLILLJJLI = rect;
        this.LLILLL = rect2;
        this.LLILZ = c417900Ga4;
        this.LLILZIL = c16cy;
    }

    public final void LIZ() {
        Rect rect = this.LL.LLJILJIL;
        boolean z = !((rect == null || rect.isEmpty()) ? false : true);
        Rect rect2 = this.LLILLJJLI;
        boolean z2 = !((rect2 == null || rect2.isEmpty()) ? false : true);
        Rect rect3 = this.LLILLL;
        boolean z3 = !((rect3 == null || rect3.isEmpty()) ? false : true);
        if (z || z2 || z3) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS280S0100000_33(this.LL, 39));
            this.LL.LLJJIJIIJIL = new AnimatorSet();
            C21574419by c21574419by = this.LL;
            AnimatorSet animatorSet = c21574419by.LLJJIJIIJIL;
            if (animatorSet != null) {
                animatorSet.addListener(new ALAdapterS27S0100000_33(c21574419by, 15));
                animatorSet.playTogether(valueAnimatorOfFloat);
                animatorSet.setInterpolator(c21574419by.LLJJJJLIIL);
                animatorSet.setDuration(200L);
                animatorSet.start();
                return;
            }
            return;
        }
        Rect rect4 = this.LLILLJJLI;
        Rect rect5 = this.LLILLL;
        int[] iArr = new int[2];
        this.LL.getLocationOnScreen(iArr);
        rect4.offset(-iArr[0], -iArr[1]);
        rect5.offset(-iArr[0], -iArr[1]);
        Matrix matrix = new Matrix(C21572019ba.LIZ(this.LLILLJJLI, this.LL.getWidth(), this.LL.getHeight(), this.LL.LLJILJIL, this.LLILZ));
        Matrix matrix2 = new Matrix();
        C21574419by c21574419by2 = this.LL;
        AnimatorSet animatorSetLIZIZ = C21572019ba.LIZIZ(matrix, matrix2, c21574419by2.LLJILJIL, this.LLILZIL, new AwS612S0100000_33(c21574419by2, 137));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        C16CY c16cy = this.LLILZIL;
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS280S0100000_33(this.LL, 38));
        valueAnimatorOfFloat2.setDuration(c16cy.LIZLLL);
        valueAnimatorOfFloat2.setInterpolator(c16cy.LIZIZ);
        Rect rect6 = new Rect(this.LLILLJJLI);
        int[] iArr2 = this.LLILZLL;
        if (iArr2 != null && iArr2.length == 4) {
            rect6.left += iArr2[0];
            rect6.top += iArr2[1];
            rect6.right -= iArr2[2];
            rect6.bottom -= iArr2[3];
        }
        Animator animatorLIZLLL = this.LL.LIZLLL(rect6, this.LLILLL, false);
        C16CY c16cy2 = this.LLILZIL;
        animatorLIZLLL.setDuration(c16cy2.LIZLLL);
        animatorLIZLLL.setInterpolator(c16cy2.LIZIZ);
        this.LL.LLJJIJIIJIL = new AnimatorSet();
        C21574419by c21574419by3 = this.LL;
        AnimatorSet animatorSet2 = c21574419by3.LLJJIJIIJIL;
        if (animatorSet2 != null) {
            animatorSet2.addListener(new ALAdapterS27S0100000_33(c21574419by3, 16));
            animatorSet2.playTogether(animatorSetLIZIZ, animatorLIZLLL, valueAnimatorOfFloat2);
            animatorSet2.setInterpolator(c21574419by3.LLJJJJLIIL);
            animatorSet2.setDuration(200L);
            animatorSet2.start();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ScaleGestureLayout@133.animateAppear$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ScaleGestureLayout@133.animateAppear$1");
    }
}
