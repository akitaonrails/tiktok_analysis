package X;

import android.animation.ValueAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zlh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1908670zlh extends C09AY implements Function0<Unit> {
    public final /* synthetic */ ValueAnimator LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1908670zlh(ValueAnimator valueAnimator) {
        super(0);
        this.LL = valueAnimator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.start();
        return Unit.LIZ;
    }
}
