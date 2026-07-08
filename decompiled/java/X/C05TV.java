package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05TV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.view.compose.FishEyeCarouselKt$FisheyeCarousel$5$5$1", f = "FishEyeCarousel.kt", l = {224}, m = "invokeSuspend")
public final class C05TV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1690080u58 LLILLJJLI;
    public final /* synthetic */ InterfaceC1665500tRU<InterfaceC1627890sSp> LLILLL;
    public final /* synthetic */ C05P1<Integer> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05TV(C1690080u58 c1690080u58, InterfaceC1665500tRU<? extends InterfaceC1627890sSp> interfaceC1665500tRU, C05P1<Integer> c05p1, InterfaceC1364105Vn<? super C05TV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1690080u58;
        this.LLILLL = interfaceC1665500tRU;
        this.LLILZ = c05p1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05TV(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF;
        C1C7U.LIZ("FishEyeCarouselKt@275.FisheyeCarousel$5$5$1");
        Object objLJFF2 = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1690080u58 c1690080u58 = this.LLILLJJLI;
            boolean zLIZIZ = c1690080u58.LIZIZ();
            Object objLJJJLZIJ = C13LP.LJJJLZIJ(C1668500tWK.LIZ(this.LLILZ), this.LLILLL);
            int iLIZ = C1668500tWK.LIZ(this.LLILZ);
            this.LL = 1;
            if (!zLIZIZ && (objLJJJLZIJ instanceof C1627800sSg)) {
                int iLJFF = c1690080u58.LJIIIZ().LJFF() - 1;
                if (iLIZ == 0) {
                    objLJFF = c1690080u58.LJFF(1, 0, this);
                    if (objLJFF != C099R.LJFF()) {
                        objLJFF = Unit.LIZ;
                    }
                } else if (iLIZ != iLJFF || (objLJFF = c1690080u58.LJFF(iLJFF - 1, 0, this)) != C099R.LJFF()) {
                    objLJFF = Unit.LIZ;
                }
            } else {
                objLJFF = Unit.LIZ;
            }
            if (objLJFF == objLJFF2) {
                C1C7U.LIZIZ("FishEyeCarouselKt@275.FisheyeCarousel$5$5$1");
                return objLJFF2;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FishEyeCarouselKt@275.FisheyeCarousel$5$5$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
