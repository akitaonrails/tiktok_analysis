package X;

import Y.AgS206S0200000_20;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS564S0100000_20;
import njp.a;

/* JADX INFO: renamed from: X.0k5s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.recommendeffect.compose.HorizontalCarouselKt$Panel$3$1", f = "HorizontalCarousel.kt", l = {155}, m = "invokeSuspend")
public final class C1306140k5s extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1690080u58 LLILLJJLI;
    public final /* synthetic */ Function2<String, Integer, Unit> LLILLL;
    public final /* synthetic */ C05P0<EnumC994870bzp> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1306140k5s(C1690080u58 c1690080u58, Function2<? super String, ? super Integer, Unit> function2, C05P0<EnumC994870bzp> c05p0, InterfaceC1364105Vn<? super C1306140k5s> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1690080u58;
        this.LLILLL = function2;
        this.LLILZ = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1306140k5s(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HorizontalCarouselKt@558d.Panel$3$1");
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
            C1339310kxN c1339310kxN = new C1339310kxN(C20028913Yh.LJIIIZ(new AwS564S0100000_20(this.LLILLJJLI, 21)), 1);
            AgS206S0200000_20 agS206S0200000_20 = new AgS206S0200000_20(this.LLILZ, this.LLILLL, 1);
            this.LL = 1;
            if (c1339310kxN.collect(agS206S0200000_20, this) == objLJFF) {
                C1C7U.LIZIZ("HorizontalCarouselKt@558d.Panel$3$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HorizontalCarouselKt@558d.Panel$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
