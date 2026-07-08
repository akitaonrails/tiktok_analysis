package X;

import Y.AAListenerS271S0200000_19;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/* JADX INFO: renamed from: X.0iiF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1253050iiF implements InterfaceC629820On6 {
    public boolean LIZ;
    public int LIZIZ;
    public boolean LIZJ;

    @Override // X.InterfaceC629820On6
    public final boolean LIZIZ(int i) {
        return true;
    }

    @Override // X.InterfaceC629820On6
    public final void LIZ(int i, View view) {
        if (i != 1) {
            if (i == 2 && this.LIZ && this.LIZIZ != 0 && !this.LIZJ) {
                this.LIZJ = true;
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f), ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), view.getTranslationY() - this.LIZIZ));
                animatorSet.setDuration(200L);
                animatorSet.setInterpolator(C1619980sG4.LJIILIIL());
                animatorSet.addListener(new AAListenerS271S0200000_19(this, view, 8));
                animatorSet.start();
                return;
            }
            return;
        }
        if (this.LIZ || this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.LIZIZ = C11VU.LIZLLL(view.getContext()) - iArr[1];
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), view.getTranslationY() + this.LIZIZ));
        animatorSet2.setDuration(200L);
        animatorSet2.setInterpolator(C1619980sG4.LJIILIIL());
        animatorSet2.addListener(new AAListenerS271S0200000_19(this, view, 7));
        animatorSet2.start();
    }
}
