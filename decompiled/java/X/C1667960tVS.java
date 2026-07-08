package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tVS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1667960tVS extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ AbstractC1676270tir LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ InterfaceC1685750ty9 LLILLL;
    public final /* synthetic */ InterfaceC1668050tVb LLILZ;
    public final /* synthetic */ InterfaceC1671600tbK LLILZIL;
    public final /* synthetic */ float LLILZLL;
    public final /* synthetic */ C1685400txa LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1667960tVS(AbstractC1676270tir abstractC1676270tir, String str, InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1668050tVb interfaceC1668050tVb, InterfaceC1671600tbK interfaceC1671600tbK, float f, C1685400txa c1685400txa, int i, int i2) {
        super(2);
        this.LL = abstractC1676270tir;
        this.LLILLJJLI = str;
        this.LLILLL = interfaceC1685750ty9;
        this.LLILZ = interfaceC1668050tVb;
        this.LLILZIL = interfaceC1671600tbK;
        this.LLILZLL = f;
        this.LLIZ = c1685400txa;
        this.LLIZLLLIL = i;
        this.LLJ = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1668230tVt.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLIZLLLIL | 1), this.LLJ);
        return Unit.LIZ;
    }
}
