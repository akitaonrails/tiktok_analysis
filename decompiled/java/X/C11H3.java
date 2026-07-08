package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Add missing generic type declarations: [A, B, C] */
/* JADX INFO: renamed from: X.11H3, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11H3<A, B, C> extends C09AY implements Function1<C11H7<A, B, C>, Unit> {
    public final /* synthetic */ InterfaceC1631620sYq<A, B, C, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C11H3(InterfaceC1631620sYq<? super A, ? super B, ? super C, Unit> interfaceC1631620sYq) {
        super(1);
        this.LL = interfaceC1631620sYq;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        C11H7 c11h7 = (C11H7) obj;
        this.LL.invoke(c11h7.LIZ, c11h7.LIZIZ, c11h7.LIZJ);
        return Unit.LIZ;
    }
}
