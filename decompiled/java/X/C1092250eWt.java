package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eWt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092250eWt extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C1092220eWq LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1092250eWt(C1092220eWq c1092220eWq) {
        super(1);
        this.LL = c1092220eWq;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        Function1<Boolean, Unit> onScaleStatusChange = this.LL.getOnScaleStatusChange();
        if (onScaleStatusChange != null) {
            onScaleStatusChange.invoke(Boolean.valueOf(zBooleanValue));
        }
        if (!zBooleanValue) {
            C1092220eWq c1092220eWq = this.LL;
            Pair<Float, Float> pairLIZ = c1092220eWq.LIZ(c1092220eWq.getX(), this.LL.getY());
            float fFloatValue = pairLIZ.getFirst().floatValue();
            float fFloatValue2 = pairLIZ.getSecond().floatValue();
            C1092220eWq c1092220eWq2 = this.LL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1092220eWq2);
            c1092220eWq2.setTranslationX(fFloatValue);
            C1092220eWq c1092220eWq3 = this.LL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1092220eWq3);
            c1092220eWq3.setTranslationY(fFloatValue2);
            this.LL.LJ(null);
        }
        return Unit.LIZ;
    }
}
