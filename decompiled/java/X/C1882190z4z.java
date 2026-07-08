package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0z4z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882190z4z extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ Function1<Boolean, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1882190z4z(C1882070z4n c1882070z4n) {
        super(1);
        this.LL = c1882070z4n;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        bool.booleanValue();
        C20441214yg.LJ("GamePreregisterService", "handleGamePreregisterRequestEvent requestPreregisterGame onFailure");
        this.LL.invoke(Boolean.FALSE);
        return Unit.LIZ;
    }
}
