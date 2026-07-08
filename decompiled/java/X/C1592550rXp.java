package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0rXp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1592550rXp extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C1592450rXf LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1592550rXp(C1592450rXf c1592450rXf) {
        super(1);
        this.LL = c1592450rXf;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        int i;
        boolean zBooleanValue = bool.booleanValue();
        C1592450rXf c1592450rXf = this.LL;
        if (zBooleanValue) {
            i = c1592450rXf.LLL;
        } else {
            i = 0;
        }
        c1592450rXf.setGradientWidth(i);
        return Unit.LIZ;
    }
}
