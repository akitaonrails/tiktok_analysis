package X;

import com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitViewModel$loopOrderStatus$2$1$1", f = "PoiOrderSubmitViewModel.kt", l = {272}, m = "invokeSuspend")
public final class C1172850gct extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PoiOrderSubmitViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC1172910gcz LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1172850gct(PoiOrderSubmitViewModel poiOrderSubmitViewModel, String str, InterfaceC1172910gcz interfaceC1172910gcz, InterfaceC1364105Vn<? super C1172850gct> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = poiOrderSubmitViewModel;
        this.LLILLL = str;
        this.LLILZ = interfaceC1172910gcz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1172850gct(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiOrderSubmitViewModel@6475.loopOrderStatus$2$1$1");
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
            C1172880gcw c1172880gcw = new C1172880gcw(this.LLILLJJLI.LL.getValue(), EnumC0333009r.POST_PAY.getValue(), this.LLILLL, this.LLILZ);
            this.LL = 1;
            c1172880gcw.LJ = System.currentTimeMillis();
            Object objLIZ = c1172880gcw.LIZ(this);
            if (objLIZ != C099R.LJFF()) {
                objLIZ = Unit.LIZ;
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("PoiOrderSubmitViewModel@6475.loopOrderStatus$2$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiOrderSubmitViewModel@6475.loopOrderStatus$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
