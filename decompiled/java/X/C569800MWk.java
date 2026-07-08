package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0MWk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C569800MWk extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Integer LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C569800MWk(Function0<Unit> function0, InterfaceC1685750ty9 interfaceC1685750ty9, boolean z, Integer num, boolean z2, int i, int i2) {
        super(2);
        this.LL = function0;
        this.LLILLJJLI = interfaceC1685750ty9;
        this.LLILLL = z;
        this.LLILZ = num;
        this.LLILZIL = z2;
        this.LLILZLL = i;
        this.LLIZ = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1666700tTQ.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZLL | 1), this.LLIZ);
        return Unit.LIZ;
    }
}
