package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ShopReachControlGetParams;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ShopReachControlResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0w80, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVMV2$reachControlGet$1$1$1$ssResponse$1", f = "CustomDotVMV2.kt", l = {1036}, m = "invokeSuspend")
public final class C1768740w80 extends C09AX implements Function1<InterfaceC1364105Vn<? super C0X52<Response<ShopReachControlResponse>>>, Object> {
    public int LL;
    public final /* synthetic */ CustomDotVMV2 LLILLJJLI;
    public final /* synthetic */ ShopReachControlGetParams LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1768740w80(CustomDotVMV2 customDotVMV2, ShopReachControlGetParams shopReachControlGetParams, InterfaceC1364105Vn<? super C1768740w80> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = customDotVMV2;
        this.LLILLL = shopReachControlGetParams;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1768740w80(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C0X52<Response<ShopReachControlResponse>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CustomDotVMV2@ba3d.reachControlGet$1$1$1$ssResponse$1");
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
            InterfaceC1768760w82 interfaceC1768760w82 = (InterfaceC1768760w82) this.LLILLJJLI.xQ2().getOperator();
            ShopReachControlGetParams shopReachControlGetParams = this.LLILLL;
            this.LL = 1;
            obj = interfaceC1768760w82.shopReachControlGet(shopReachControlGetParams, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CustomDotVMV2@ba3d.reachControlGet$1$1$1$ssResponse$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CustomDotVMV2@ba3d.reachControlGet$1$1$1$ssResponse$1");
        return obj;
    }
}
