package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0uMP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1700790uMP extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C1700880uMY LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1700790uMP(C1700880uMY c1700880uMY) {
        super(1);
        this.LL = c1700880uMY;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            this.LL.LIZJ.invoke(Boolean.TRUE);
        }
        return Unit.LIZ;
    }
}
