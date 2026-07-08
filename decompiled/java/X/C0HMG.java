package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0HMG, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HMG extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC1685750ty9 LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ C1668650tWZ LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HMG(InterfaceC1685750ty9 interfaceC1685750ty9, long j, float f, C1668650tWZ c1668650tWZ, int i, int i2) {
        super(2);
        this.LL = interfaceC1685750ty9;
        this.LLILLJJLI = j;
        this.LLILLL = f;
        this.LLILZ = c1668650tWZ;
        this.LLILZIL = i;
        this.LLILZLL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1668640tWY.LIZJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZIL | 1), this.LLILZLL);
        return Unit.LIZ;
    }
}
