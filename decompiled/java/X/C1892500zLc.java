package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.localservice.live.common.api.LocalServiceForLiveApi;
import com.ss.android.ugc.aweme.localservice.live.common.api.model.PinedProductsResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zLc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.localservice.live.influencer.widget.LSLiveBroadcasterExplanationCardWidget$silenceUpdatePinedProduct$2$response$1", f = "LSLiveBroadcasterExplanationCardWidget.kt", l = {258}, m = "invokeSuspend")
public final class C1892500zLc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super PinedProductsResponse>, Object> {
    public int LL;
    public final /* synthetic */ C1892540zLg LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1892500zLc(C1892540zLg c1892540zLg, InterfaceC1364105Vn<? super C1892500zLc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1892540zLg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1892500zLc(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String idStr;
        InterfaceC2262081DgM interfaceC2262081DgMAuthor;
        C1C7U.LIZ("LSLiveBroadcasterExplanationCardWidget@325.silenceUpdatePinedProduct$2$response$1");
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
            LocalServiceForLiveApi.LIZ.getClass();
            LocalServiceForLiveApi localServiceForLiveApiLIZ = C1173130gdL.LIZ();
            Room room = this.LLILLJJLI.LLILLL;
            Long lLJFF = null;
            if (room != null) {
                idStr = room.getIdStr();
            } else {
                idStr = null;
            }
            String value = EnumC1892470zLZ.B_LIVE_PIN_CARD.getValue();
            Room room2 = this.LLILLJJLI.LLILLL;
            if (room2 != null && (interfaceC2262081DgMAuthor = room2.author()) != null) {
                lLJFF = C2286608xc.LJFF(interfaceC2262081DgMAuthor.getId());
            }
            String strValueOf = String.valueOf(lLJFF);
            this.LL = 1;
            obj = localServiceForLiveApiLIZ.getPinedProducts(idStr, null, value, strValueOf, null, null, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LSLiveBroadcasterExplanationCardWidget@325.silenceUpdatePinedProduct$2$response$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("LSLiveBroadcasterExplanationCardWidget@325.silenceUpdatePinedProduct$2$response$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super PinedProductsResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
