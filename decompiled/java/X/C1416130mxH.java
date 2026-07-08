package X;

import Y.AgS305S0100000_25;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mxH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.CarouselInitialShowMetricsComponent$observeShowSlideBar$1$1", f = "CarouselInitialShowMetricsComponent.kt", l = {87}, m = "invokeSuspend")
public final class C1416130mxH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1626820sR6 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1416130mxH(C1626820sR6 c1626820sR6, InterfaceC1364105Vn<? super C1416130mxH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1626820sR6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1416130mxH(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CarouselInitialShowMetricsComponent@c0ee.observeShowSlideBar$1$1");
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
            C1626820sR6 c1626820sR6 = this.LLILLJJLI;
            C20099713kh c20099713khLJJIJL = C09IC.LJJIJL(new C095D(new C414601jM(new InterfaceC346201Wa[]{c1626820sR6.LLILZ, c1626820sR6.LLILZIL, c1626820sR6.LLILZLL, c1626820sR6.LLIZ}, null, new C1416140mxI(c1626820sR6, null))), 1);
            AgS305S0100000_25 agS305S0100000_25 = new AgS305S0100000_25(this.LLILLJJLI, 26);
            this.LL = 1;
            if (c20099713khLJJIJL.collect(agS305S0100000_25, this) == objLJFF) {
                C1C7U.LIZIZ("CarouselInitialShowMetricsComponent@c0ee.observeShowSlideBar$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CarouselInitialShowMetricsComponent@c0ee.observeShowSlideBar$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
