package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.addon.dto.GetRecommendDataRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03XZ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.addon.PdpAddOnPanelHelper$prefetchRecData$1", f = "PdpAddOnPanelHelper.kt", l = {68}, m = "invokeSuspend")
public final class C03XZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super n>, Object> {
    public int LL;
    public final /* synthetic */ GetRecommendDataRequest LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03XZ(GetRecommendDataRequest getRecommendDataRequest, InterfaceC1364105Vn<? super C03XZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = getRecommendDataRequest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03XZ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpAddOnPanelHelper@3d3.prefetchRecData$1");
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
            C859303Xj c859303Xj = InterfaceC859003Xg.LIZ;
            GetRecommendDataRequest getRecommendDataRequest = this.LLILLJJLI;
            this.LL = 1;
            obj = c859303Xj.LIZIZ(getRecommendDataRequest, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PdpAddOnPanelHelper@3d3.prefetchRecData$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PdpAddOnPanelHelper@3d3.prefetchRecData$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super n> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
