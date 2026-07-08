package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17u3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.refresh.PopCardRequestManager$requestPopReal$2$onResponse$3$1", f = "PopCardRequestManager.kt", l = {}, m = "invokeSuspend")
public final class C21176917u3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PopProductResp LL;
    public final /* synthetic */ C0X52<BaseResponse<PopProductResp>> LLILLJJLI;
    public final /* synthetic */ AbstractC21196217xA LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21176917u3(PopProductResp popProductResp, C0X52<BaseResponse<PopProductResp>> c0x52, AbstractC21196217xA abstractC21196217xA, InterfaceC1364105Vn<? super C21176917u3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = popProductResp;
        this.LLILLJJLI = c0x52;
        this.LLILLL = abstractC21196217xA;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21176917u3(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PopCardRequestManager@6049.requestPopReal$2$onResponse$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("ec_bag_set_pop_product", C1741890vQh.LJIIIIZZ(this.LL));
        Long lLJFF = null;
        if (C294680Bgo.LIZ()) {
            C598040Ncw c598040Ncw = C598040Ncw.LIZ;
            C0X52<BaseResponse<PopProductResp>> c0x52 = this.LLILLJJLI;
            Room room = this.LLILLL.LIZ.LLJILLL;
            if (room != null) {
                lLJFF = C2286608xc.LJFF(room.getId());
            }
            String strValueOf = String.valueOf(lLJFF);
            c598040Ncw.getClass();
            C598040Ncw.LIZ(c0x52, strValueOf, true);
        } else {
            String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(this.LL);
            AbstractC21196217xA abstractC21196217xA = this.LLILLL;
            Room room2 = abstractC21196217xA.LIZ.LLJILLL;
            if (room2 != null) {
                lLJFF = C2286608xc.LJFF(room2.getId());
            }
            abstractC21196217xA.LJIIJJI(String.valueOf(lLJFF), strLJIIIIZZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PopCardRequestManager@6049.requestPopReal$2$onResponse$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
