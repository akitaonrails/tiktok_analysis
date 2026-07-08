package X;

import Y.AgS162S0300000_2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS546S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.05Uw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.tab.compose.AIPortraitCarouselKt$Carousel$1$1", f = "AIPortraitCarousel.kt", l = {165}, m = "invokeSuspend")
public final class C1362405Uw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC1690640u62 LLILLJJLI;
    public final /* synthetic */ InterfaceC1665500tRU<C569940MWy> LLILLL;
    public final /* synthetic */ Function1<Integer, Unit> LLILZ;
    public final /* synthetic */ C05P0<Integer> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1362405Uw(AbstractC1690640u62 abstractC1690640u62, InterfaceC1665500tRU<C569940MWy> interfaceC1665500tRU, Function1<? super Integer, Unit> function1, C05P0<Integer> c05p0, InterfaceC1364105Vn<? super C1362405Uw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC1690640u62;
        this.LLILLL = interfaceC1665500tRU;
        this.LLILZ = function1;
        this.LLILZIL = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1362405Uw(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitCarouselKt@d91a.Carousel$1$1");
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
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(C20028913Yh.LJIIIZ(new AwS546S0100000_2(this.LLILLJJLI, 1155)));
            AgS162S0300000_2 agS162S0300000_2 = new AgS162S0300000_2(this.LLILLL, this.LLILZ, this.LLILZIL, 9);
            this.LL = 1;
            if (interfaceC346201WaLJIILL.collect(agS162S0300000_2, this) == objLJFF) {
                C1C7U.LIZIZ("AIPortraitCarouselKt@d91a.Carousel$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIPortraitCarouselKt@d91a.Carousel$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
