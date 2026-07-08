package X;

import com.ss.android.ugc.aweme.api.IAccountUtilsService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.localservice.live.common.api.LiveForLocalServiceApi;
import com.ss.android.ugc.aweme.localservice.live.common.api.model.ProductDelRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0zLN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.localservice.live.influencer.widget.LSProductBeforeLiveWidget$onLoseSelect$response$1", f = "LSProductBeforeLiveWidget.kt", l = {295}, m = "invokeSuspend")
public final class C1892350zLN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super BaseResponse>, Object> {
    public int LL;

    public C1892350zLN(InterfaceC1364105Vn<? super C1892350zLN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1892350zLN(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LSProductBeforeLiveWidget@c27b.onLoseSelect$response$1");
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
            LiveForLocalServiceApi.LIZ.getClass();
            LiveForLocalServiceApi liveForLocalServiceApiLIZ = C1172970gd5.LIZ();
            obj = null;
            String curUserId = null;
            if (liveForLocalServiceApiLIZ != null) {
                IAccountUtilsService iAccountUtilsServiceLIZ = C916803iA.LIZ();
                if (iAccountUtilsServiceLIZ != null) {
                    curUserId = iAccountUtilsServiceLIZ.getCurUserId();
                }
                ProductDelRequest productDelRequest = new ProductDelRequest(null, null, true, curUserId);
                this.LL = 1;
                obj = liveForLocalServiceApiLIZ.delProducts(productDelRequest, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LSProductBeforeLiveWidget@c27b.onLoseSelect$response$1");
                    return objLJFF;
                }
            }
        }
        C1C7U.LIZIZ("LSProductBeforeLiveWidget@c27b.onLoseSelect$response$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn) {
        return new C1892350zLN(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
