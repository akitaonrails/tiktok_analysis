package X;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15nk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20628215nk extends C09AY implements Function0<ValueAnimator> {
    public final /* synthetic */ AbstractC20628015ni LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20628215nk(AbstractC20628015ni abstractC20628015ni) {
        super(0);
        this.LL = abstractC20628015ni;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ValueAnimator invoke() {
        AbstractC20628015ni.LLJ.getClass();
        ValueAnimator valueAnimator = AbstractC20628015ni.LLJIJIL;
        AbstractC20628015ni abstractC20628015ni = this.LL;
        valueAnimator.setIntValues(abstractC20628015ni.getPlaceholderColor(), abstractC20628015ni.getPulsingColor());
        valueAnimator.setEvaluator(new ArgbEvaluator());
        return valueAnimator;
    }
}
