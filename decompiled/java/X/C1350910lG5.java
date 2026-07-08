package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lG5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1350910lG5 extends C09AY implements Function1<Float, Unit> {
    public final /* synthetic */ C1355780lNw LL;
    public final /* synthetic */ float LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1350910lG5(C1355780lNw c1355780lNw, float f) {
        super(1);
        this.LL = c1355780lNw;
        this.LLILLJJLI = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
        float fFloatValue = f.floatValue();
        C424580Gkq c424580Gkq = this.LL.LIZLLL;
        float f2 = this.LLILLJJLI;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c424580Gkq);
        c424580Gkq.setAlpha(f2 + ((1.0f - f2) * fFloatValue));
        return Unit.LIZ;
    }
}
