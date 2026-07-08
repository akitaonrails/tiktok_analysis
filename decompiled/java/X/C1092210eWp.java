package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eWp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092210eWp extends C09AY implements Function1<Float, Unit> {
    public final /* synthetic */ C1092220eWq LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1092210eWp(C1092220eWq c1092220eWq) {
        super(1);
        this.LL = c1092220eWq;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
        float fFloatValue = f.floatValue();
        if (this.LL.getOnScaleChange() != null) {
            this.LL.getClass();
            C1092220eWq c1092220eWq = this.LL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1092220eWq);
            c1092220eWq.setScaleX(fFloatValue);
            C1092220eWq c1092220eWq2 = this.LL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1092220eWq2);
            c1092220eWq2.setScaleY(fFloatValue);
            Function1<Float, Unit> onScaleChange = this.LL.getOnScaleChange();
            if (onScaleChange != null) {
                onScaleChange.invoke(Float.valueOf(fFloatValue));
            }
        }
        return Unit.LIZ;
    }
}
