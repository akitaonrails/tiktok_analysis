package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05PJ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.view.compose.FishEyeCarouselKt$RememberCarouselCenterCallbackV2$1$1", f = "FishEyeCarousel.kt", l = {}, m = "invokeSuspend")
public final class C05PJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Function2<Integer, Float, Unit> LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ C05P1<Pair<Integer, Float>> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05PJ(float f, boolean z, Function2<? super Integer, ? super Float, Unit> function2, float f2, C05P1<Pair<Integer, Float>> c05p1, InterfaceC1364105Vn<? super C05PJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = f;
        this.LLILLJJLI = z;
        this.LLILLL = function2;
        this.LLILZ = f2;
        this.LLILZIL = c05p1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05PJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FishEyeCarouselKt@275.RememberCarouselCenterCallbackV2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Pair<Integer, Float> value = this.LLILZIL.getValue();
        int iIntValue = value.getFirst().intValue();
        if (value.getSecond().floatValue() <= this.LL && this.LLILLJJLI) {
            this.LLILLL.invoke(C2286608xc.LJ(iIntValue), C2286608xc.LIZLLL(this.LLILZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FishEyeCarouselKt@275.RememberCarouselCenterCallbackV2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
