package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0txw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685620txw extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C1692220u8a LL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILLJJLI;
    public final /* synthetic */ C1693430uAX LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ Function1<C1692150u8T, Unit> LLIZ;
    public final /* synthetic */ Function1<Integer, Unit> LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1685620txw(C1692220u8a c1692220u8a, InterfaceC1685750ty9 interfaceC1685750ty9, C1693430uAX c1693430uAX, boolean z, int i, int i2, Function1<? super C1692150u8T, Unit> function1, Function1<? super Integer, Unit> function12, int i3, int i4) {
        super(2);
        this.LL = c1692220u8a;
        this.LLILLJJLI = interfaceC1685750ty9;
        this.LLILLL = c1693430uAX;
        this.LLILZ = z;
        this.LLILZIL = i;
        this.LLILZLL = i2;
        this.LLIZ = function1;
        this.LLIZLLLIL = function12;
        this.LLJ = i3;
        this.LLJI = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1685610txv.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJ | 1), this.LLJI);
        return Unit.LIZ;
    }
}
