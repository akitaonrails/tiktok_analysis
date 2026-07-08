package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qMI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546960qMI extends C09AY implements Function1<C189200o6<? extends C1536580q5Y>, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ InterfaceC1546990qML LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1546960qMI(String str, InterfaceC1546990qML interfaceC1546990qML) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = interfaceC1546990qML;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C189200o6<? extends C1536580q5Y> c189200o6) {
        Object objM10unboximpl = c189200o6.m10unboximpl();
        String str = null;
        if (C189200o6.m7isFailureimpl(objM10unboximpl)) {
            objM10unboximpl = null;
        }
        C1536580q5Y c1536580q5Y = (C1536580q5Y) objM10unboximpl;
        if (c1536580q5Y != null) {
            str = c1536580q5Y.LIZ;
        }
        if (!Intrinsics.LJFF(str, this.LL)) {
            this.LLILLJJLI.LIZIZ(new C1537200q6Y(true));
        } else {
            this.LLILLJJLI.LIZIZ(new C1537200q6Y(false));
        }
        return Unit.LIZ;
    }
}
