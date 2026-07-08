package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Add missing generic type declarations: [A, B, C, D] */
/* JADX INFO: renamed from: X.11H5, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11H5<A, B, C, D> extends C09AY implements Function1<C11H6<A, B, C, D>, Unit> {
    public final /* synthetic */ InterfaceC1631630sYr<A, B, C, D, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C11H5(InterfaceC1631630sYr<? super A, ? super B, ? super C, ? super D, Unit> interfaceC1631630sYr) {
        super(1);
        this.LL = interfaceC1631630sYr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        C11H6 c11h6 = (C11H6) obj;
        this.LL.invoke(c11h6.LIZ, c11h6.LIZIZ, c11h6.LIZJ, c11h6.LIZLLL);
        return Unit.LIZ;
    }
}
