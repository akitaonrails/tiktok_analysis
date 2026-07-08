package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0jyp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1301770jyp extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC1685750ty9 LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1301770jyp(int i, int i2, InterfaceC1685750ty9 interfaceC1685750ty9) {
        super(2);
        this.LL = interfaceC1685750ty9;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1666060tSO.LIZIZ(this.LL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILLJJLI | 1), this.LLILLL);
        return Unit.LIZ;
    }
}
