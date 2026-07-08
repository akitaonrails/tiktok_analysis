package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Ov6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C634780Ov6 extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C634780Ov6(long j, Function0<Unit> function0, long j2, InterfaceC1685750ty9 interfaceC1685750ty9, int i, int i2) {
        super(2);
        this.LL = j;
        this.LLILLJJLI = function0;
        this.LLILLL = j2;
        this.LLILZ = interfaceC1685750ty9;
        this.LLILZIL = i;
        this.LLILZLL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1681530trL.LJIILJJIL(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZIL | 1), this.LLILZLL);
        return Unit.LIZ;
    }
}
