package X;

import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17rd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.prefetch.UsPinProductRepository$getPinProduct$fasterResponse$1$1", f = "UsPinProductRepository.kt", l = {}, m = "invokeSuspend")
public final class C21161917rd extends C09AX implements Function2<BaseResponse<PopProductResp>, InterfaceC1364105Vn<? super C21162217rg>, Object> {
    public /* synthetic */ Object LL;

    public C21161917rd(InterfaceC1364105Vn<? super C21161917rd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C21161917rd c21161917rd = new C21161917rd(interfaceC1364105Vn);
        c21161917rd.LL = obj;
        return c21161917rd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UsPinProductRepository@f977.getPinProduct$fasterResponse$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C21162217rg c21162217rg = new C21162217rg("feed_product", (BaseResponse) this.LL);
        C1C7U.LIZIZ("UsPinProductRepository@f977.getPinProduct$fasterResponse$1$1");
        return c21162217rg;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BaseResponse<PopProductResp> baseResponse, InterfaceC1364105Vn<? super C21162217rg> interfaceC1364105Vn) {
        return ((a) create(baseResponse, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
