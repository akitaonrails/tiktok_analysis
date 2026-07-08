package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tX7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1668990tX7 extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C1690050u55 LLILLJJLI;
    public final /* synthetic */ Function1<Integer, String> LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ float LLILZIL;
    public final /* synthetic */ float LLILZLL;
    public final /* synthetic */ InterfaceC1685750ty9 LLIZ;
    public final /* synthetic */ float LLIZLLLIL;
    public final /* synthetic */ Function2<InterfaceC1680500tpg, Integer, Unit> LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1668990tX7(int i, C1690050u55 c1690050u55, Function1<? super Integer, String> function1, float f, float f2, float f3, InterfaceC1685750ty9 interfaceC1685750ty9, float f4, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2, int i2, int i3) {
        super(2);
        this.LL = i;
        this.LLILLJJLI = c1690050u55;
        this.LLILLL = function1;
        this.LLILZ = f;
        this.LLILZIL = f2;
        this.LLILZLL = f3;
        this.LLIZ = interfaceC1685750ty9;
        this.LLIZLLLIL = f4;
        this.LLJ = function2;
        this.LLJI = i2;
        this.LLJIJIL = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1668980tX6.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJI | 1), this.LLJIJIL);
        return Unit.LIZ;
    }
}
