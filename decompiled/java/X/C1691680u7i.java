package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0u7i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691680u7i extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILLJJLI;
    public final /* synthetic */ C1693430uAX LLILLL;
    public final /* synthetic */ Function1<C1692150u8T, Unit> LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ InterfaceC1691620u7c LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1691680u7i(String str, InterfaceC1685750ty9 interfaceC1685750ty9, C1693430uAX c1693430uAX, Function1<? super C1692150u8T, Unit> function1, int i, boolean z, int i2, int i3, InterfaceC1691620u7c interfaceC1691620u7c, int i4, int i5) {
        super(2);
        this.LL = str;
        this.LLILLJJLI = interfaceC1685750ty9;
        this.LLILLL = c1693430uAX;
        this.LLILZ = function1;
        this.LLILZIL = i;
        this.LLILZLL = z;
        this.LLIZ = i2;
        this.LLIZLLLIL = i3;
        this.LLJ = interfaceC1691620u7c;
        this.LLJI = i4;
        this.LLJIJIL = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1691640u7e.LIZLLL(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJI | 1), this.LLJIJIL);
        return Unit.LIZ;
    }
}
