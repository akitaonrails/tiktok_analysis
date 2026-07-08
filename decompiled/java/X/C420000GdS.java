package X;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: X.0GdS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420000GdS implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View LL;

    public C420000GdS(View view) {
        this.LL = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C786410Ut5.ed(this.LL, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
