package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0nzd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1456030nzd extends C09AY implements Function1<InterfaceC1457600o2A, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C1456020nzc LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1456030nzd(int i, C1456020nzc c1456020nzc, int i2) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = c1456020nzc;
        this.LLILLL = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1457600o2A interfaceC1457600o2A) {
        InterfaceC578430MmP interfaceC578430MmP;
        InterfaceC1457600o2A interfaceC1457600o2A2 = interfaceC1457600o2A;
        interfaceC1457600o2A2.Kj(this.LL);
        if (C1462920oAk.LIZLLL()) {
            interfaceC1457600o2A2.Wb2(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58)));
            C1DRG c1drgInvoke = this.LLILLJJLI.LL.invoke();
            if (c1drgInvoke != null && (interfaceC578430MmP = (InterfaceC578430MmP) c1drgInvoke.LJIIL(null, InterfaceC578430MmP.class)) != null) {
                interfaceC578430MmP.K11();
            }
        } else {
            interfaceC1457600o2A2.Wb2(this.LLILLL);
        }
        return Unit.LIZ;
    }
}
