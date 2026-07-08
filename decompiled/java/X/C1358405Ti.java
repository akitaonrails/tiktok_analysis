package X;

import Y.AgS83S0110000_2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS28S0100001_2;
import njp.a;

/* JADX INFO: renamed from: X.05Ti, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.view.compose.FishEyeCarouselKt$FisheyeCarousel$5$7$1", f = "FishEyeCarousel.kt", l = {249}, m = "invokeSuspend")
public final class C1358405Ti extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1690080u58 LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ Function2<List<Integer>, Boolean, Unit> LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1358405Ti(C1690080u58 c1690080u58, float f, Function2<? super List<Integer>, ? super Boolean, Unit> function2, boolean z, InterfaceC1364105Vn<? super C1358405Ti> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1690080u58;
        this.LLILLL = f;
        this.LLILZ = function2;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1358405Ti(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FishEyeCarouselKt@275.FisheyeCarousel$5$7$1");
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
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(C20028913Yh.LJIIIZ(new AwS28S0100001_2(this.LLILLJJLI, this.LLILLL, 2)));
            AgS83S0110000_2 agS83S0110000_2 = new AgS83S0110000_2(this.LLILZ, this.LLILZIL, 0);
            this.LL = 1;
            if (interfaceC346201WaLJIILL.collect(agS83S0110000_2, this) == objLJFF) {
                C1C7U.LIZIZ("FishEyeCarouselKt@275.FisheyeCarousel$5$7$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FishEyeCarouselKt@275.FisheyeCarousel$5$7$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
