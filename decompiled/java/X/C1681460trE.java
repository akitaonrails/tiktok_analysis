package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0trE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1681460trE extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1681460trE(int i, int i2, InterfaceC1685750ty9 interfaceC1685750ty9, Function0 function0) {
        super(2);
        this.LL = function0;
        this.LLILLJJLI = interfaceC1685750ty9;
        this.LLILLL = i;
        this.LLILZ = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        Function0<Unit> function0 = this.LL;
        InterfaceC1685750ty9 interfaceC1685750ty9 = this.LLILLJJLI;
        C1681380tr6.LIZLLL(C341440Da2.LIZ(this.LLILLL | 1), this.LLILZ, interfaceC1680500tpg, interfaceC1685750ty9, function0);
        return Unit.LIZ;
    }
}
