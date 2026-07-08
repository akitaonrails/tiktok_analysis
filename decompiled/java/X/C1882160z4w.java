package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0z4w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882160z4w extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Function1<Boolean, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1882160z4w(C1882070z4n c1882070z4n) {
        super(0);
        this.LL = c1882070z4n;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C20441214yg.LIZIZ("GamePreregisterService", "handleGamePreregisterRequestEvent requestPreregisterGame onSuccess");
        C20337914i1<Boolean> c20337914i1 = InterfaceC772390URp.LLZZZZ;
        Boolean bool = Boolean.TRUE;
        c20337914i1.LJFF(bool);
        this.LL.invoke(bool);
        return Unit.LIZ;
    }
}
