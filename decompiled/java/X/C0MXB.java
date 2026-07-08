package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0MXB, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MXB extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC1665500tRU<C569940MWy> LL;
    public final /* synthetic */ AbstractC1690640u62 LLILLJJLI;
    public final /* synthetic */ Function1<Integer, Unit> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ InterfaceC1685750ty9 LLIZ;
    public final /* synthetic */ Function1<Integer, Unit> LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0MXB(InterfaceC1665500tRU<C569940MWy> interfaceC1665500tRU, AbstractC1690640u62 abstractC1690640u62, Function1<? super Integer, Unit> function1, String str, Function0<Unit> function0, boolean z, InterfaceC1685750ty9 interfaceC1685750ty9, Function1<? super Integer, Unit> function12, int i, int i2) {
        super(2);
        this.LL = interfaceC1665500tRU;
        this.LLILLJJLI = abstractC1690640u62;
        this.LLILLL = function1;
        this.LLILZ = str;
        this.LLILZIL = function0;
        this.LLILZLL = z;
        this.LLIZ = interfaceC1685750ty9;
        this.LLIZLLLIL = function12;
        this.LLJ = i;
        this.LLJI = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1671080taU.LIZIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJ | 1), this.LLJI);
        return Unit.LIZ;
    }
}
