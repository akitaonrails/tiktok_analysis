package X;

import Y.AgS83S0110000_2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS28S0100001_2;
import njp.a;

/* JADX INFO: renamed from: X.06XE, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.view.compose.FishEyeCarouselKt$ReportShownItems$1$1", f = "FishEyeCarousel.kt", l = {863}, m = "invokeSuspend")
public final class C06XE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1690080u58 LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ C05P1<Function2<int[], Boolean, Unit>> LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C06XE(C1690080u58 c1690080u58, float f, C05P1<? extends Function2<? super int[], ? super Boolean, Unit>> c05p1, boolean z, InterfaceC1364105Vn<? super C06XE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1690080u58;
        this.LLILLL = f;
        this.LLILZ = c05p1;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06XE(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FishEyeCarouselKt@275.ReportShownItems$1$1");
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
            C095D c095dLJIIIZ = C20028913Yh.LJIIIZ(new AwS28S0100001_2(this.LLILLJJLI, this.LLILLL, 3));
            AgS83S0110000_2 agS83S0110000_2 = new AgS83S0110000_2(this.LLILZ, this.LLILZIL, 1);
            this.LL = 1;
            if (c095dLJIIIZ.collect(agS83S0110000_2, this) == objLJFF) {
                C1C7U.LIZIZ("FishEyeCarouselKt@275.ReportShownItems$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FishEyeCarouselKt@275.ReportShownItems$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
