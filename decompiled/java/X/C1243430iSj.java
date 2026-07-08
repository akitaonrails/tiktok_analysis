package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0iSj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1243430iSj extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC1685750ty9 LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1243430iSj(float f, float f2, int i, int i2, long j, InterfaceC1685750ty9 interfaceC1685750ty9) {
        super(2);
        this.LL = interfaceC1685750ty9;
        this.LLILLJJLI = j;
        this.LLILLL = f;
        this.LLILZ = f2;
        this.LLILZIL = i;
        this.LLILZLL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        InterfaceC1685750ty9 interfaceC1685750ty9 = this.LL;
        long j = this.LLILLJJLI;
        C1670870ta9.LIZ(this.LLILLL, this.LLILZ, C341440Da2.LIZ(this.LLILZIL | 1), this.LLILZLL, j, interfaceC1680500tpg, interfaceC1685750ty9);
        return Unit.LIZ;
    }
}
