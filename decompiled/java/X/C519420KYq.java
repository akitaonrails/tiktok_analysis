package X;

import Y.ALAdapterS4S0100000_7;
import Y.AUListenerS257S0100000_7;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0KYq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C519420KYq extends C21459418yW {
    public InterfaceC519430KYr LLJLLL;

    @Override // X.C21459418yW, X.AbstractC21463118z7
    public final Animator LJIIJ(ViewGroup viewGroup, C1489080oqw c1489080oqw, C1489080oqw c1489080oqw2) {
        Animator animatorLJIIJ = super.LJIIJ(viewGroup, c1489080oqw, c1489080oqw2);
        if (animatorLJIIJ instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animatorLJIIJ;
            valueAnimator.addUpdateListener(new AUListenerS257S0100000_7(c1489080oqw, 32));
            valueAnimator.addListener(new ALAdapterS4S0100000_7(this, 28));
        }
        return animatorLJIIJ;
    }
}
