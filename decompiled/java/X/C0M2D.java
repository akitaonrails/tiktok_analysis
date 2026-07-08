package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0M2D, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M2D extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC522120Kdm LL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ C530510KrJ LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M2D(InterfaceC522120Kdm interfaceC522120Kdm, InterfaceC1685750ty9 interfaceC1685750ty9, Function0<Unit> function0, C530510KrJ c530510KrJ, boolean z, int i, int i2) {
        super(2);
        this.LL = interfaceC522120Kdm;
        this.LLILLJJLI = interfaceC1685750ty9;
        this.LLILLL = function0;
        this.LLILZ = c530510KrJ;
        this.LLILZIL = z;
        this.LLILZLL = i;
        this.LLIZ = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1668250tVv.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZLL | 1), this.LLIZ);
        return Unit.LIZ;
    }
}
