package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05P9, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.view.compose.FishEyeCarouselKt$FisheyeCarousel$5$4$1", f = "FishEyeCarousel.kt", l = {}, m = "invokeSuspend")
public final class C05P9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<Integer, Unit> LL;
    public final /* synthetic */ C05P1<Integer> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05P9(Function1<? super Integer, Unit> function1, C05P1<Integer> c05p1, InterfaceC1364105Vn<? super C05P9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = c05p1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05P9(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FishEyeCarouselKt@275.FisheyeCarousel$5$4$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(C2286608xc.LJ(C1668500tWK.LIZ(this.LLILLJJLI)));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FishEyeCarouselKt@275.FisheyeCarousel$5$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
