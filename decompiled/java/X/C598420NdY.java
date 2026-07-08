package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.billboard.model.SeaLiveGetBillboardResp;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS22S1101000_9;
import njp.a;

/* JADX INFO: renamed from: X.0NdY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.billboard.BaseSeaLiveBillboardWidget$requestBillboards$1", f = "BaseSeaLiveBillboardWidget.kt", l = {}, m = "invokeSuspend")
public final class C598420NdY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1732680vBq LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Function1<n, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C598420NdY(AbstractC1732680vBq abstractC1732680vBq, int i, Function1<? super n, Unit> function1, InterfaceC1364105Vn<? super C598420NdY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1732680vBq;
        this.LLILLJJLI = i;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C598420NdY(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String idStr;
        C1C7U.LIZ("BaseSeaLiveBillboardWidget@4f6b.requestBillboards$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Room room = this.LL.LLILZIL;
        if (room != null && (idStr = room.getIdStr()) != null) {
            final AbstractC1732680vBq abstractC1732680vBq = this.LL;
            int i = this.LLILLJJLI;
            final Function1<n, Unit> function1 = this.LLILLL;
            try {
                C598360NdS.LJFF(idStr, 8, false, C598410NdX.LIZIZ(8, idStr), new AwS22S1101000_9(idStr, abstractC1732680vBq, i, 0), new InterfaceC594300NSq<BaseResponse<n>>() { // from class: X.0Nda
                    @Override // X.InterfaceC594300NSq
                    public final void onFailure(C0X9S<BaseResponse<n>> c0x9s, Throwable th) {
                        AbstractC1732680vBq abstractC1732680vBq2 = abstractC1732680vBq;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("api fail ");
                        sbLIZ.append(th.getMessage());
                        abstractC1732680vBq2.LJJIII("billboard_get_request_fail", C2188811AlT.LIZIZ(sbLIZ));
                    }

                    @Override // X.InterfaceC594300NSq
                    public final void onResponse(C0X9S<BaseResponse<n>> c0x9s, C0X52<BaseResponse<n>> c0x52) {
                        Object c098200Yq;
                        n data = c0x52.LIZIZ.getData();
                        if (data != null) {
                            Function1<n, Unit> function12 = function1;
                            AbstractC1732680vBq abstractC1732680vBq2 = abstractC1732680vBq;
                            try {
                                C1227904rF.LIZ.getClass();
                                c098200Yq = (SeaLiveGetBillboardResp) C1227904rF.LIZ(data, SeaLiveGetBillboardResp.class);
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                c098200Yq = null;
                            }
                            SeaLiveGetBillboardResp seaLiveGetBillboardResp = (SeaLiveGetBillboardResp) c098200Yq;
                            function12.invoke(data);
                            abstractC1732680vBq2.LJJIII("billboard_get_request_success", "success");
                            if (abstractC1732680vBq2.LLILZ == 1) {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                linkedHashMap.put("is_live_take_default", Boolean.TRUE);
                                if (seaLiveGetBillboardResp != null) {
                                    Map<String, ? extends Object> map = seaLiveGetBillboardResp.daInfo;
                                    if (map != null) {
                                        linkedHashMap.putAll(map);
                                    }
                                    seaLiveGetBillboardResp.daInfo = linkedHashMap;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        abstractC1732680vBq.LJJIII("billboard_get_request_fail", "resp data is null");
                    }
                });
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("network exception api fail ");
                sbLIZ.append(e.getMessage());
                abstractC1732680vBq.LJJIII("billboard_get_request_fail", C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            this.LL.LJJIII("billboard_get_request_fail", "roomid is null");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseSeaLiveBillboardWidget@4f6b.requestBillboards$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
