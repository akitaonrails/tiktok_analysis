package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0mxI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.CarouselInitialShowMetricsComponent$observeShowSlideBar$1$1$1", f = "CarouselInitialShowMetricsComponent.kt", l = {77}, m = "invokeSuspend")
public final class C1416140mxI extends C09AX implements InterfaceC1685430txd<InterfaceC346701Wf<? super C1627090sRX>, Long, Long, C1626830sR7, Long, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public /* synthetic */ C1626830sR7 LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C1626820sR6 LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1416140mxI(C1626820sR6 c1626820sR6, InterfaceC1364105Vn<? super C1416140mxI> interfaceC1364105Vn) {
        super(6, interfaceC1364105Vn);
        this.LLIZ = c1626820sR6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CarouselInitialShowMetricsComponent@c0ee.observeShowSlideBar$1$1$1");
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
            InterfaceC346701Wf interfaceC346701Wf = this.LLILLJJLI;
            Long l = (Long) this.LLILLL;
            Long l2 = (Long) this.LLILZ;
            C1626830sR7 c1626830sR7 = this.LLILZIL;
            Long l3 = (Long) this.LLILZLL;
            if (l != null && l2 != null && c1626830sR7 != null && l3 != null) {
                C1627090sRX c1627090sRX = new C1627090sRX(l.longValue(), l2.longValue(), c1626830sR7, l3.longValue(), this.LLIZ.LL.Xp());
                this.LLILLJJLI = null;
                this.LLILLL = null;
                this.LLILZ = null;
                this.LLILZIL = null;
                this.LL = 1;
                if (interfaceC346701Wf.emit(c1627090sRX, this) == objLJFF) {
                    C1C7U.LIZIZ("CarouselInitialShowMetricsComponent@c0ee.observeShowSlideBar$1$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CarouselInitialShowMetricsComponent@c0ee.observeShowSlideBar$1$1$1");
        return unit;
    }

    @Override // X.InterfaceC1685430txd
    public final Object invoke(InterfaceC346701Wf<? super C1627090sRX> interfaceC346701Wf, Long l, Long l2, C1626830sR7 c1626830sR7, Long l3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C1416140mxI c1416140mxI = new C1416140mxI(this.LLIZ, interfaceC1364105Vn);
        c1416140mxI.LLILLJJLI = interfaceC346701Wf;
        c1416140mxI.LLILLL = l;
        c1416140mxI.LLILZ = l2;
        c1416140mxI.LLILZIL = c1626830sR7;
        c1416140mxI.LLILZLL = l3;
        return c1416140mxI.invokeSuspend(Unit.LIZ);
    }
}
