package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05UG, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.view.compose.FishEyeCarouselKt$FisheyeCarousel$5$1$1", f = "FishEyeCarousel.kt", l = {}, m = "invokeSuspend")
public final class C05UG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C21149817pg LL;
    public final /* synthetic */ C1690080u58 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05UG(C21149817pg c21149817pg, C1690080u58 c1690080u58, InterfaceC1364105Vn<? super C05UG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c21149817pg;
        this.LLILLJJLI = c1690080u58;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05UG(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FishEyeCarouselKt@275.FisheyeCarousel$5$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C21149817pg c21149817pg = this.LL;
        if (this.LLILLJJLI.LIZIZ()) {
            c21149817pg.LIZ();
        } else {
            c21149817pg.getClass();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FishEyeCarouselKt@275.FisheyeCarousel$5$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
