package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallApiWithPreload;
import com.ss.android.ugc.aweme.ecommerce.mall.service.video.RecommendItemsResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0wCH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.recommend.video.VideoDetailLoadImpl$requestData$2$1$1", f = "VideoDetailLoadImpl.kt", l = {166}, m = "invokeSuspend")
public final class C1771390wCH extends C09AX implements Function1<InterfaceC1364105Vn<? super C0X52<Response<RecommendItemsResponse>>>, Object> {
    public int LL;
    public final /* synthetic */ n LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1771390wCH(n nVar, InterfaceC1364105Vn<? super C1771390wCH> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = nVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1771390wCH(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C0X52<Response<RecommendItemsResponse>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoDetailLoadImpl@ad2f.requestData$2$1$1");
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
            ShopMallApiWithPreload.LIZ.getClass();
            ShopMallApiWithPreload shopMallApiWithPreload = C1771330wCB.LIZIZ;
            n nVar = this.LLILLJJLI;
            this.LL = 1;
            obj = shopMallApiWithPreload.LIZ(nVar, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("VideoDetailLoadImpl@ad2f.requestData$2$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("VideoDetailLoadImpl@ad2f.requestData$2$1$1");
        return obj;
    }
}
