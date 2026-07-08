package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tmv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1678790tmv extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC1685750ty9 LL;
    public final /* synthetic */ Function2<InterfaceC1680500tpg, Integer, Unit> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ InterfaceC1680710tq1 LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ float LLIZ;
    public final /* synthetic */ Function2<InterfaceC1680500tpg, Integer, Unit> LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1678790tmv(InterfaceC1685750ty9 interfaceC1685750ty9, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, boolean z, InterfaceC1680710tq1 interfaceC1680710tq1, long j, long j2, float f, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function22, int i, int i2) {
        super(2);
        this.LL = interfaceC1685750ty9;
        this.LLILLJJLI = function2;
        this.LLILLL = z;
        this.LLILZ = interfaceC1680710tq1;
        this.LLILZIL = j;
        this.LLILZLL = j2;
        this.LLIZ = f;
        this.LLIZLLLIL = function22;
        this.LLJ = i;
        this.LLJI = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1678780tmu.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJ | 1), this.LLJI);
        return Unit.LIZ;
    }
}
