package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.GetBillboardResp;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS22S1101000_9;
import njp.a;

/* JADX INFO: renamed from: X.0NdZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.BaseECBillboardWidget$requestBillboards$1", f = "BaseECBillboardWidget.kt", l = {}, m = "invokeSuspend")
public final class C598430NdZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1732690vBr LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Function1<GetBillboardResp, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C598430NdZ(AbstractC1732690vBr abstractC1732690vBr, int i, Function1<? super GetBillboardResp, Unit> function1, InterfaceC1364105Vn<? super C598430NdZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1732690vBr;
        this.LLILLJJLI = i;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C598430NdZ(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String idStr;
        C1C7U.LIZ("BaseECBillboardWidget@a7b6.requestBillboards$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Room room = this.LL.LLILZIL;
        if (room != null && (idStr = room.getIdStr()) != null) {
            final AbstractC1732690vBr abstractC1732690vBr = this.LL;
            int i = this.LLILLJJLI;
            final Function1<GetBillboardResp, Unit> function1 = this.LLILLL;
            try {
                C598360NdS.LJFF(idStr, 7, false, C598410NdX.LIZIZ(7, idStr), new AwS22S1101000_9(idStr, abstractC1732690vBr, i, 2), new InterfaceC594300NSq<BaseResponse<GetBillboardResp>>() { // from class: X.0Ndb
                    @Override // X.InterfaceC594300NSq
                    public final void onFailure(C0X9S<BaseResponse<GetBillboardResp>> c0x9s, Throwable th) {
                        AbstractC1732690vBr abstractC1732690vBr2 = abstractC1732690vBr;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("api fail ");
                        sbLIZ.append(th.getMessage());
                        abstractC1732690vBr2.LJJIIJZLJL("billboard_get_request_fail", C2188811AlT.LIZIZ(sbLIZ));
                    }

                    @Override // X.InterfaceC594300NSq
                    public final void onResponse(C0X9S<BaseResponse<GetBillboardResp>> c0x9s, C0X52<BaseResponse<GetBillboardResp>> c0x52) {
                        GetBillboardResp data;
                        BaseResponse<GetBillboardResp> baseResponse = c0x52.LIZIZ;
                        if (baseResponse != null && (data = baseResponse.getData()) != null) {
                            Function1<GetBillboardResp, Unit> function12 = function1;
                            AbstractC1732690vBr abstractC1732690vBr2 = abstractC1732690vBr;
                            function12.invoke(data);
                            abstractC1732690vBr2.LJJIIJZLJL("billboard_get_request_success", "success");
                            if (abstractC1732690vBr2.LLILZ == 1) {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                linkedHashMap.put("is_live_take_default", Boolean.TRUE);
                                Map<String, ? extends Object> map = data.daInfo;
                                if (map != null) {
                                    linkedHashMap.putAll(map);
                                }
                                data.daInfo = linkedHashMap;
                                return;
                            }
                            return;
                        }
                        abstractC1732690vBr.LJJIIJZLJL("billboard_get_request_fail", "resp data is null");
                    }
                });
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("network exception api fail ");
                sbLIZ.append(e.getMessage());
                abstractC1732690vBr.LJJIIJZLJL("billboard_get_request_fail", C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            this.LL.LJJIIJZLJL("billboard_get_request_fail", "roomid is null");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseECBillboardWidget@a7b6.requestBillboards$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
