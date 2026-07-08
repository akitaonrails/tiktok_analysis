package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0u5W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690320u5W extends C09AY implements Function1<InterfaceC1564790qp3, Unit> {
    public final /* synthetic */ C1690080u58 LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1690320u5W(C1690080u58 c1690080u58, int i) {
        super(1);
        this.LL = c1690080u58;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1564790qp3 interfaceC1564790qp3) {
        Function1<Object, Unit> function1LJ;
        InterfaceC1564790qp3 interfaceC1564790qp32 = interfaceC1564790qp3;
        InterfaceC1690390u5d interfaceC1690390u5d = this.LL.LIZ;
        int i = this.LLILLJJLI;
        C13YG c13ygLIZ = C13YI.LIZ();
        if (c13ygLIZ != null) {
            function1LJ = c13ygLIZ.LJ();
        } else {
            function1LJ = null;
        }
        C13YI.LJ(c13ygLIZ, C13YI.LIZIZ(c13ygLIZ), function1LJ);
        interfaceC1690390u5d.LIZ(interfaceC1564790qp32, i);
        return Unit.LIZ;
    }
}
