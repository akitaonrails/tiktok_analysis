package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tr5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1681370tr5 extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C05P1<C1396005dG> LL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1681370tr5(C05P1<C1396005dG> c05p1, InterfaceC1685750ty9 interfaceC1685750ty9, int i, int i2) {
        super(2);
        this.LL = c05p1;
        this.LLILLJJLI = interfaceC1685750ty9;
        this.LLILLL = i;
        this.LLILZ = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1681580trQ.LJ(this.LL, this.LLILLJJLI, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILLL | 1), this.LLILZ);
        return Unit.LIZ;
    }
}
