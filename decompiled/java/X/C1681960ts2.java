package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ts2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1681960ts2 extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1681960ts2(int i, int i2, InterfaceC1685750ty9 interfaceC1685750ty9, boolean z) {
        super(2);
        this.LL = z;
        this.LLILLJJLI = interfaceC1685750ty9;
        this.LLILLL = i;
        this.LLILZ = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        boolean z = this.LL;
        InterfaceC1685750ty9 interfaceC1685750ty9 = this.LLILLJJLI;
        C1681530trL.LJII(C341440Da2.LIZ(this.LLILLL | 1), this.LLILZ, interfaceC1680500tpg, interfaceC1685750ty9, z);
        return Unit.LIZ;
    }
}
