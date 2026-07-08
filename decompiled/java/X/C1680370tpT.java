package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tpT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1680370tpT extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC1680040tow LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ EnumC1680400tpW LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ float LLILZLL;
    public final /* synthetic */ InterfaceC1685750ty9 LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1680370tpT(InterfaceC1680040tow interfaceC1680040tow, boolean z, EnumC1680400tpW enumC1680400tpW, boolean z2, long j, float f, InterfaceC1685750ty9 interfaceC1685750ty9, int i, int i2) {
        super(2);
        this.LL = interfaceC1680040tow;
        this.LLILLJJLI = z;
        this.LLILLL = enumC1680400tpW;
        this.LLILZ = z2;
        this.LLILZIL = j;
        this.LLILZLL = f;
        this.LLIZ = interfaceC1685750ty9;
        this.LLIZLLLIL = i;
        this.LLJ = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1680380tpU.LIZIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLIZLLLIL | 1), this.LLJ);
        return Unit.LIZ;
    }
}
