package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0th7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1675190th7 extends C09AY implements Function1<InterfaceC1679550to9, Unit> {
    public final /* synthetic */ C05P1<Float> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1675190th7(C05P1<Float> c05p1) {
        super(1);
        this.LL = c05p1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1679550to9 interfaceC1679550to9) {
        interfaceC1679550to9.LJFF(this.LL.getValue().floatValue());
        return Unit.LIZ;
    }
}
