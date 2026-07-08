package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01ZV, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.FullWidthCarouselBottomComponent$observeBottomWidgetVisibility$2$1", f = "FullWidthCarouselBottomComponent.kt", l = {70}, m = "invokeSuspend")
public final class C01ZV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC332260D0u<Boolean> LLILLJJLI;
    public final /* synthetic */ Boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01ZV(InterfaceC332260D0u<Boolean> interfaceC332260D0u, Boolean bool, InterfaceC1364105Vn<? super C01ZV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC332260D0u;
        this.LLILLL = bool;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01ZV(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FullWidthCarouselBottomComponent@d6b5.observeBottomWidgetVisibility$2$1");
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
            InterfaceC332260D0u<Boolean> interfaceC332260D0u = this.LLILLJJLI;
            Boolean bool = this.LLILLL;
            this.LL = 1;
            if (interfaceC332260D0u.emit(bool, this) == objLJFF) {
                C1C7U.LIZIZ("FullWidthCarouselBottomComponent@d6b5.observeBottomWidgetVisibility$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullWidthCarouselBottomComponent@d6b5.observeBottomWidgetVisibility$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
