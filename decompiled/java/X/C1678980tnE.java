package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tnE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1678980tnE extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C1678920tn8 LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C0NV4 LLILZ;
    public final /* synthetic */ InterfaceC1679000tnG LLILZIL;
    public final /* synthetic */ InterfaceC1680710tq1 LLILZLL;
    public final /* synthetic */ float LLIZ;
    public final /* synthetic */ float LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1678980tnE(C1678920tn8 c1678920tn8, boolean z, boolean z2, C0NV4 c0nv4, InterfaceC1679000tnG interfaceC1679000tnG, InterfaceC1680710tq1 interfaceC1680710tq1, float f, float f2, int i, int i2) {
        super(2);
        this.LL = c1678920tn8;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = c0nv4;
        this.LLILZIL = interfaceC1679000tnG;
        this.LLILZLL = interfaceC1680710tq1;
        this.LLIZ = f;
        this.LLIZLLLIL = f2;
        this.LLJ = i;
        this.LLJI = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        this.LL.LIZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJ | 1), this.LLJI);
        return Unit.LIZ;
    }
}
