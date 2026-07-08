package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qMH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546950qMH extends C09AY implements Function1<C189200o6<? extends C1536580q5Y>, Unit> {
    public final /* synthetic */ InterfaceC1546990qML LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1546950qMH(InterfaceC1546990qML interfaceC1546990qML) {
        super(1);
        this.LL = interfaceC1546990qML;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C189200o6<? extends C1536580q5Y> c189200o6) {
        Object objM10unboximpl = c189200o6.m10unboximpl();
        this.LL.LIZ(objM10unboximpl);
        if (C189200o6.m8isSuccessimpl(objM10unboximpl)) {
            this.LL.LIZIZ(new C1537200q6Y(true));
        } else {
            this.LL.LIZIZ(new C1537200q6Y(false));
        }
        return Unit.LIZ;
    }
}
