package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.api.IAccountUtilsService;
import com.ss.android.ugc.aweme.localservice.live.common.api.LiveForLocalServiceApi;
import com.ss.android.ugc.aweme.localservice.live.common.api.model.ProductOverviewRequest;
import com.ss.android.ugc.aweme.localservice.live.common.api.model.ProductOverviewResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zLP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.localservice.live.influencer.widget.LSDuringLiveShopBagWidget$updateProductsAlertNumText$2$response$1", f = "LSDuringLiveShopBagWidget.kt", l = {239}, m = "invokeSuspend")
public final class C1892370zLP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super ProductOverviewResponse>, Object> {
    public int LL;
    public final /* synthetic */ C1892420zLU LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1892370zLP(C1892420zLU c1892420zLU, InterfaceC1364105Vn<? super C1892370zLP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1892420zLU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1892370zLP(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String idStr;
        C1C7U.LIZ("LSDuringLiveShopBagWidget@b658.updateProductsAlertNumText$2$response$1");
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
                Room room = this.LLILLJJLI.LLILZ;
                if (room != null) {
                    idStr = room.getIdStr();
                } else {
                    idStr = null;
                }
                IAccountUtilsService iAccountUtilsServiceLIZ = C916803iA.LIZ();
                if (iAccountUtilsServiceLIZ != null) {
                    curUserId = iAccountUtilsServiceLIZ.getCurUserId();
                }
                ProductOverviewRequest productOverviewRequest = new ProductOverviewRequest(idStr, curUserId);
                this.LL = 1;
                obj = liveForLocalServiceApiLIZ.getRoomProductOverview(productOverviewRequest, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LSDuringLiveShopBagWidget@b658.updateProductsAlertNumText$2$response$1");
                    return objLJFF;
                }
            }
        }
        C1C7U.LIZIZ("LSDuringLiveShopBagWidget@b658.updateProductsAlertNumText$2$response$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super ProductOverviewResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
