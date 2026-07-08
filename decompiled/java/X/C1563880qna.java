package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qna, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563880qna extends C09AY implements Function1<C062P<InterfaceC111300bX>, Unit> {
    public final /* synthetic */ InterfaceC1602040rn8 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1563880qna(InterfaceC1602040rn8 interfaceC1602040rn8) {
        super(1);
        this.LL = interfaceC1602040rn8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C062P<InterfaceC111300bX> c062p) {
        c062p.LIZ = this.LL;
        return Unit.LIZ;
    }
}
