package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05TS, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.view.compose.FishEyeCarouselKt$FisheyeCarousel$5$6$1", f = "FishEyeCarousel.kt", l = {}, m = "invokeSuspend")
public final class C05TS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1690080u58 LL;
    public final /* synthetic */ InterfaceC1665500tRU<InterfaceC1627890sSp> LLILLJJLI;
    public final /* synthetic */ Function1<Integer, Unit> LLILLL;
    public final /* synthetic */ C05P1<Integer> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05TS(C1690080u58 c1690080u58, InterfaceC1665500tRU<? extends InterfaceC1627890sSp> interfaceC1665500tRU, Function1<? super Integer, Unit> function1, C05P1<Integer> c05p1, InterfaceC1364105Vn<? super C05TS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1690080u58;
        this.LLILLJJLI = interfaceC1665500tRU;
        this.LLILLL = function1;
        this.LLILZ = c05p1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05TS(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FishEyeCarouselKt@275.FisheyeCarousel$5$6$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.LIZIZ()) {
            Object objLJJJLZIJ = C13LP.LJJJLZIJ(C1668500tWK.LIZ(this.LLILZ), this.LLILLJJLI);
            if (objLJJJLZIJ == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("FishEyeCarouselKt@275.FisheyeCarousel$5$6$1");
                return unit;
            }
            if (!(objLJJJLZIJ instanceof C1627800sSg)) {
                this.LLILLL.invoke(C2286608xc.LJ(C1668500tWK.LIZ(this.LLILZ)));
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FishEyeCarouselKt@275.FisheyeCarousel$5$6$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
