package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0HNE, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HNE extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC1685750ty9 LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HNE(int i, InterfaceC1685750ty9 interfaceC1685750ty9, Function0 function0, boolean z) {
        super(2);
        this.LL = interfaceC1685750ty9;
        this.LLILLJJLI = z;
        this.LLILLL = function0;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        InterfaceC1685750ty9 interfaceC1685750ty9 = this.LL;
        boolean z = this.LLILLJJLI;
        Function0<Unit> function0 = this.LLILLL;
        C1666000tSI.LIZJ(C341440Da2.LIZ(this.LLILZ | 1), interfaceC1680500tpg, interfaceC1685750ty9, function0, z);
        return Unit.LIZ;
    }
}
