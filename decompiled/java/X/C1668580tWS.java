package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tWS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1668580tWS extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ float LLILZIL;
    public final /* synthetic */ float LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ float LLIZLLLIL;
    public final /* synthetic */ float LLJ;
    public final /* synthetic */ Function2<Integer, Float, Unit> LLJI;
    public final /* synthetic */ int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1668580tWS(int i, int i2, int i3, float f, float f2, float f3, boolean z, float f4, float f5, Function2<? super Integer, ? super Float, Unit> function2, int i4) {
        super(2);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = f;
        this.LLILZIL = f2;
        this.LLILZLL = f3;
        this.LLIZ = z;
        this.LLIZLLLIL = f4;
        this.LLJ = f5;
        this.LLJI = function2;
        this.LLJIJIL = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1668490tWJ.LJIIJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJIJIL | 1));
        return Unit.LIZ;
    }
}
