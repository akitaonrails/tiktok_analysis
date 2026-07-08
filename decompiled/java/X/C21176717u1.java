package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.17u1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.AbsUsECLiveExplanationCardWidget$getIntroduceProductResponseV2$2$onResponse$2$1", f = "AbsUsECLiveExplanationCardWidget.kt", l = {}, m = "invokeSuspend")
public final class C21176717u1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PopProductResp LL;
    public final /* synthetic */ C0X52<BaseResponse<PopProductResp>> LLILLJJLI;
    public final /* synthetic */ AbstractC21194117wp LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21176717u1(PopProductResp popProductResp, C0X52<BaseResponse<PopProductResp>> c0x52, AbstractC21194117wp abstractC21194117wp, InterfaceC1364105Vn<? super C21176717u1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = popProductResp;
        this.LLILLJJLI = c0x52;
        this.LLILLL = abstractC21194117wp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21176717u1(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("AbsUsECLiveExplanationCardWidget@dce0.getIntroduceProductResponseV2$2$onResponse$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("ec_bag_set_pop_product", C1741890vQh.LJIIIIZZ(this.LL));
        String string = null;
        if (C294680Bgo.LIZ()) {
            C598030Ncv c598030Ncv = C598030Ncv.LIZ;
            C0X52<BaseResponse<PopProductResp>> c0x52 = this.LLILLJJLI;
            Room room = this.LLILLL.LLJILLL;
            if (room != null) {
                string = C2286608xc.LJFF(room.getId()).toString();
            }
            c598030Ncv.getClass();
            C598030Ncv.LIZ(c0x52, string, true);
        } else {
            String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(this.LL);
            Integer numLJ = C2286608xc.LJ(1);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pin_product_data", strLJIIIIZZ);
            AbstractC21194117wp.LJJJJL(jSONObject, numLJ);
            AbstractC21196817xG abstractC21196817xGLJJIJL = this.LLILLL.LJJIJL();
            Room room2 = this.LLILLL.LLJILLL;
            if (room2 != null) {
                string = C2286608xc.LJFF(room2.getId()).toString();
            }
            abstractC21196817xGLJJIJL.LJIIJJI(string, strLJIIIIZZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AbsUsECLiveExplanationCardWidget@dce0.getIntroduceProductResponseV2$2$onResponse$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
