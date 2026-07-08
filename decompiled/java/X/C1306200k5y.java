package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS564S0100000_20;
import njp.a;

/* JADX INFO: renamed from: X.0k5y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.recommendeffect.compose.HorizontalCarouselKt$Panel$6$1", f = "HorizontalCarousel.kt", l = {241}, m = "invokeSuspend")
public final class C1306200k5y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1690080u58 LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ float LLILZIL;
    public final /* synthetic */ InterfaceC497601wk LLILZLL;
    public final /* synthetic */ C05P0<C09AE> LLIZ;
    public final /* synthetic */ Function2<String, Integer, Unit> LLIZLLLIL;
    public final /* synthetic */ C05P0<EnumC994870bzp> LLJ;
    public final /* synthetic */ C05P0<Integer> LLJI;
    public final /* synthetic */ C05P0<Integer> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1306200k5y(C1690080u58 c1690080u58, float f, Function0<Unit> function0, float f2, InterfaceC497601wk interfaceC497601wk, C05P0<C09AE> c05p0, Function2<? super String, ? super Integer, Unit> function2, C05P0<EnumC994870bzp> c05p02, C05P0<Integer> c05p03, C05P0<Integer> c05p04, InterfaceC1364105Vn<? super C1306200k5y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1690080u58;
        this.LLILLL = f;
        this.LLILZ = function0;
        this.LLILZIL = f2;
        this.LLILZLL = interfaceC497601wk;
        this.LLIZ = c05p0;
        this.LLIZLLLIL = function2;
        this.LLJ = c05p02;
        this.LLJI = c05p03;
        this.LLJIJIL = c05p04;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1306200k5y(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HorizontalCarouselKt@558d.Panel$6$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1339310kxN c1339310kxN = new C1339310kxN(C20028913Yh.LJIIIZ(new AwS564S0100000_20(this.LLILLJJLI, 23)), 3);
            final C1690080u58 c1690080u58 = this.LLILLJJLI;
            final float f = this.LLILLL;
            final Function0<Unit> function0 = this.LLILZ;
            final float f2 = this.LLILZIL;
            final InterfaceC497601wk interfaceC497601wk = this.LLILZLL;
            final C05P0<C09AE> c05p0 = this.LLIZ;
            final Function2<String, Integer, Unit> function2 = this.LLIZLLLIL;
            final C05P0<EnumC994870bzp> c05p02 = this.LLJ;
            final C05P0<Integer> c05p03 = this.LLJI;
            final C05P0<Integer> c05p04 = this.LLJIJIL;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0k5x
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    int iIntValue = ((Number) obj2).intValue();
                    C1667120tU6.LJFF(interfaceC497601wk, c05p0, function2, c05p02);
                    if (c1690080u58.LJII() == 0) {
                        float f3 = iIntValue;
                        if (f3 > c05p03.getValue().intValue() + f || f3 < c05p03.getValue().intValue() - f) {
                            function0.invoke();
                            c05p03.setValue(Integer.valueOf(c1690080u58.LJIIIIZZ()));
                            c05p04.setValue(Integer.valueOf(c1690080u58.LJII()));
                        }
                    } else if ((c1690080u58.LJII() > c05p04.getValue().intValue() && c1690080u58.LJIIIIZZ() >= (f / 2) - f2) || (c1690080u58.LJII() < c05p04.getValue().intValue() && c1690080u58.LJIIIIZZ() <= (f / 2) + f2)) {
                        function0.invoke();
                        c05p03.setValue(Integer.valueOf(c1690080u58.LJIIIIZZ()));
                        c05p04.setValue(Integer.valueOf(c1690080u58.LJII()));
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (c1339310kxN.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("HorizontalCarouselKt@558d.Panel$6$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HorizontalCarouselKt@558d.Panel$6$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
