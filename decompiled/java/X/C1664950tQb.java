package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tQb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1664950tQb extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC1665500tRU<C1661930tLj<T, InterfaceC1461640o8g<? extends T>>> LL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILLJJLI;
    public final /* synthetic */ Function2<T, InterfaceC1660090tIl, Unit> LLILLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1664950tQb(InterfaceC1665500tRU<C1661930tLj<T, InterfaceC1461640o8g<? extends T>>> interfaceC1665500tRU, InterfaceC1685750ty9 interfaceC1685750ty9, Function2<? super T, ? super InterfaceC1660090tIl, Unit> function2, Function1<? super Boolean, Unit> function1, boolean z, boolean z2, boolean z3, int i, int i2) {
        super(2);
        this.LL = interfaceC1665500tRU;
        this.LLILLJJLI = interfaceC1685750ty9;
        this.LLILLL = function2;
        this.LLILZ = function1;
        this.LLILZIL = z;
        this.LLILZLL = z2;
        this.LLIZ = z3;
        this.LLIZLLLIL = i;
        this.LLJ = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1666840tTe.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLIZLLLIL | 1), this.LLJ);
        return Unit.LIZ;
    }
}
