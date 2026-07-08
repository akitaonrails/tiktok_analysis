package X;

import com.bytedance.android.livesdk.model.message.DispersionInfo;
import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.17u4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.AbsECLiveExplanationCardWidget$getIntroduceProductResponseV2$2$onResponse$2$1", f = "AbsECLiveExplanationCardWidget.kt", l = {}, m = "invokeSuspend")
public final class C21177017u4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PopProductResp LL;
    public final /* synthetic */ C0X52<BaseResponse<PopProductResp>> LLILLJJLI;
    public final /* synthetic */ AbstractC21194217wq LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ DispersionInfo LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ ECommerceMessage LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ Integer LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21177017u4(PopProductResp popProductResp, C0X52<BaseResponse<PopProductResp>> c0x52, AbstractC21194217wq abstractC21194217wq, boolean z, DispersionInfo dispersionInfo, String str, long j, boolean z2, ECommerceMessage eCommerceMessage, boolean z3, Integer num, InterfaceC1364105Vn<? super C21177017u4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = popProductResp;
        this.LLILLJJLI = c0x52;
        this.LLILLL = abstractC21194217wq;
        this.LLILZ = z;
        this.LLILZIL = dispersionInfo;
        this.LLILZLL = str;
        this.LLIZ = j;
        this.LLIZLLLIL = z2;
        this.LLJ = eCommerceMessage;
        this.LLJI = z3;
        this.LLJIJIL = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21177017u4(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String string;
        String string2;
        C1C7U.LIZ("AbsECLiveExplanationCardWidget@7dc4.getIntroduceProductResponseV2$2$onResponse$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("ec_bag_set_pop_product", C1741890vQh.LJIIIIZZ(this.LL));
        if (C294680Bgo.LIZ()) {
            C598040Ncw c598040Ncw = C598040Ncw.LIZ;
            C0X52<BaseResponse<PopProductResp>> c0x52 = this.LLILLJJLI;
            Room room = this.LLILLL.LLJILLL;
            if (room != null) {
                string2 = C2286608xc.LJFF(room.getId()).toString();
            } else {
                string2 = null;
            }
            c598040Ncw.getClass();
            C598040Ncw.LIZ(c0x52, string2, true);
        } else {
            String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(this.LL);
            Integer numLJ = C2286608xc.LJ(1);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pin_product_data", strLJIIIIZZ);
            AbstractC21194217wq.LJJJJJL(jSONObject, numLJ);
            AbstractC21196217xA abstractC21196217xALJJIJLIJ = this.LLILLL.LJJIJLIJ();
            Room room2 = this.LLILLL.LLJILLL;
            if (room2 != null) {
                string = C2286608xc.LJFF(room2.getId()).toString();
            } else {
                string = null;
            }
            abstractC21196217xALJJIJLIJ.LJIIJJI(string, strLJIIIIZZ);
        }
        if (Intrinsics.LJFF(this.LL.needRetry, true) && !this.LLILZ) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LJFF), null, null, new C21177117u5(this.LLILZIL, this.LLILLL, this.LL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, null), 3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AbsECLiveExplanationCardWidget@7dc4.getIntroduceProductResponseV2$2$onResponse$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
