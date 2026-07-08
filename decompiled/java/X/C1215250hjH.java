package X;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hjH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1215250hjH extends C2217421BqW implements Function1<ValueAnimator, Unit> {
    public C1215250hjH(Object obj) {
        super(1, obj, C1257550ipV.class, "updateAnimation", "updateAnimation(Landroid/animation/ValueAnimator;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ValueAnimator valueAnimator) {
        AbstractC1257680ipi abstractC1257680ipi = (AbstractC1257680ipi) this.receiver;
        abstractC1257680ipi.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Iterator it2 = ((ArrayList) abstractC1257680ipi.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            C786410Ut5.T4((View) it2.next(), fFloatValue);
        }
        return Unit.LIZ;
    }
}
