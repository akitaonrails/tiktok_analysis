package X;

import Y.AUListenerS276S0100000_28;
import android.animation.ValueAnimator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ziP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1906630ziP extends C09AY implements Function0<ValueAnimator> {
    public final /* synthetic */ C16FB LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1906630ziP(C16FB c16fb) {
        super(0);
        this.LL = c16fb;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ValueAnimator invoke() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.addUpdateListener(new AUListenerS276S0100000_28(this.LL, 0));
        valueAnimator.setDuration(300L);
        valueAnimator.setInterpolator(C1619980sG4.LJIILIIL());
        return valueAnimator;
    }
}
