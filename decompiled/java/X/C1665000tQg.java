package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tQg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1665000tQg extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC1665500tRU<C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>> LL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILLJJLI;
    public final /* synthetic */ Function2<AbstractC1678220tm0, InterfaceC1660090tIl, Unit> LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1665000tQg(InterfaceC1665500tRU<C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>> interfaceC1665500tRU, InterfaceC1685750ty9 interfaceC1685750ty9, Function2<? super AbstractC1678220tm0, ? super InterfaceC1660090tIl, Unit> function2, int i, Function1<? super Boolean, Unit> function1, boolean z, boolean z2, int i2, int i3) {
        super(2);
        this.LL = interfaceC1665500tRU;
        this.LLILLJJLI = interfaceC1685750ty9;
        this.LLILLL = function2;
        this.LLILZ = i;
        this.LLILZIL = function1;
        this.LLILZLL = z;
        this.LLIZ = z2;
        this.LLIZLLLIL = i2;
        this.LLJ = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1665470tRR.LIZLLL(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLIZLLLIL | 1), this.LLJ);
        return Unit.LIZ;
    }
}
