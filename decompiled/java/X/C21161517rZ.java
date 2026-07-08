package X;

import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17rZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.prefetch.PinProductRepository$getPinProduct$fasterResponse$1$1", f = "PinProductRepository.kt", l = {}, m = "invokeSuspend")
public final class C21161517rZ extends C09AX implements Function2<BaseResponse<PopProductResp>, InterfaceC1364105Vn<? super C21161717rb>, Object> {
    public /* synthetic */ Object LL;

    public C21161517rZ(InterfaceC1364105Vn<? super C21161517rZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C21161517rZ c21161517rZ = new C21161517rZ(interfaceC1364105Vn);
        c21161517rZ.LL = obj;
        return c21161517rZ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PinProductRepository@6727.getPinProduct$fasterResponse$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C21161717rb c21161717rb = new C21161717rb("feed_product", (BaseResponse) this.LL);
        C1C7U.LIZIZ("PinProductRepository@6727.getPinProduct$fasterResponse$1$1");
        return c21161717rb;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BaseResponse<PopProductResp> baseResponse, InterfaceC1364105Vn<? super C21161717rb> interfaceC1364105Vn) {
        return ((a) create(baseResponse, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
