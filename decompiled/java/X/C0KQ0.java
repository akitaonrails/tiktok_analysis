package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KQ0, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KQ0 extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C517110KPt LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KQ0(C517110KPt c517110KPt) {
        super(1);
        this.LL = c517110KPt;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean z;
        boolean zBooleanValue = bool.booleanValue();
        C517110KPt c517110KPt = this.LL;
        if (c517110KPt.LIZIZ) {
            if (!c517110KPt.LIZ && !zBooleanValue) {
                z = false;
            } else {
                z = true;
            }
            c517110KPt.LIZ = z;
        }
        return Unit.LIZ;
    }
}
