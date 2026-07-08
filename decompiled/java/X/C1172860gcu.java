package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.compliance.repo.model.PoiPassportLoginData;
import com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitViewModel;
import com.ss.android.ugc.aweme.poi.osp.repo.model.BuySkuItem;
import com.ss.android.ugc.aweme.poi.osp.repo.model.LsExceptionUx;
import com.ss.android.ugc.aweme.poi.osp.repo.model.OrderAttribute;
import com.ss.android.ugc.aweme.poi.osp.repo.model.SkuData;
import com.ss.android.ugc.aweme.poi.osp.repo.model.SubmitOrderResponse;
import com.ss.android.ugc.aweme.tracker.LocationNetTracker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS52S0100100_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import njp.a;

/* JADX INFO: renamed from: X.0gcu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitViewModel$submitOrder$1$2$1", f = "PoiOrderSubmitViewModel.kt", l = {177}, m = "invokeSuspend")
public final class C1172860gcu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ PoiOrderSubmitViewModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ List<SkuData> LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C1164500gPQ LLIZ;
    public final /* synthetic */ OrderAttribute LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1172860gcu(PoiOrderSubmitViewModel poiOrderSubmitViewModel, String str, List<SkuData> list, String str2, C1164500gPQ c1164500gPQ, OrderAttribute orderAttribute, String str3, String str4, String str5, InterfaceC1364105Vn<? super C1172860gcu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = poiOrderSubmitViewModel;
        this.LLILZ = str;
        this.LLILZIL = list;
        this.LLILZLL = str2;
        this.LLIZ = c1164500gPQ;
        this.LLIZLLLIL = orderAttribute;
        this.LLJ = str3;
        this.LLJI = str4;
        this.LLJIJIL = str5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1172860gcu(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.ss.android.ugc.aweme.tracker.LocationNetTracker$LocationNetRequestInfo] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        LocationNetTracker.LocationNetRequestInfo locationNetRequestInfo;
        long jCurrentTimeMillis;
        ArrayList arrayList;
        String str;
        String strValueOf;
        C2276411E8h c2276411E8h;
        StringBuilder sbLIZ;
        Object objLLJJJ = obj;
        C1C7U.LIZ("PoiOrderSubmitViewModel@6475.submitOrder$1$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    jCurrentTimeMillis = this.LL;
                    C155000ia.LIZIZ(objLLJJJ);
                    locationNetRequestInfo = 0;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLLJJJ);
                jCurrentTimeMillis = System.currentTimeMillis();
                InterfaceC1172870gcv interfaceC1172870gcv = (InterfaceC1172870gcv) this.LLILLL.LL.getValue().getOperator();
                String str2 = this.LLILZ;
                List<SkuData> list = this.LLILZIL;
                if (list != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    for (SkuData skuData : list) {
                        arrayList.add(new BuySkuItem(skuData.skuId, skuData.num, skuData.productId));
                    }
                } else {
                    arrayList = new ArrayList();
                }
                String str3 = this.LLILZLL;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = this.LLIZ.LIZIZ;
                OrderAttribute orderAttribute = this.LLIZLLLIL;
                String str5 = this.LLJ;
                PoiPassportLoginData poiPassportLoginData = this.LLILLL.LLILLL;
                if (poiPassportLoginData != null) {
                    str = poiPassportLoginData.gecToken;
                } else {
                    str = null;
                }
                String str6 = this.LLJI;
                try {
                    String str7 = this.LLJIJIL;
                    this.LL = jCurrentTimeMillis;
                    this.LLILLJJLI = 1;
                    locationNetRequestInfo = 0;
                    locationNetRequestInfo = 0;
                    try {
                        objLLJJJ = interfaceC1172870gcv.LLJJJ(str2, arrayList, str3, str4, orderAttribute, str5, str, str6, str7, this);
                        if (objLLJJJ == objLJFF) {
                            C1C7U.LIZIZ("PoiOrderSubmitViewModel@6475.submitOrder$1$2$1");
                            return objLJFF;
                        }
                    } catch (Throwable th) {
                        th = th;
                        TryCatchGuardChecker.doCheck(th);
                        this.LLILLL.setState(new AwS597S0100000_18(th, 434));
                        C1173110gdJ c1173110gdJ = C1173110gdJ.LIZ;
                        c1173110gdJ.getClass();
                        c1173110gdJ.LIZJ("poi_order_submit_request_result", new C1180850gpn(-1, locationNetRequestInfo, false, false));
                        C2276411E8h.LIZIZ.log("poi", "osp submitOrder error");
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("PoiOrderSubmitViewModel@6475.submitOrder$1$2$1");
                        return unit;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    locationNetRequestInfo = 0;
                    TryCatchGuardChecker.doCheck(th);
                    this.LLILLL.setState(new AwS597S0100000_18(th, 434));
                    C1173110gdJ c1173110gdJ2 = C1173110gdJ.LIZ;
                    c1173110gdJ2.getClass();
                    c1173110gdJ2.LIZJ("poi_order_submit_request_result", new C1180850gpn(-1, locationNetRequestInfo, false, false));
                    C2276411E8h.LIZIZ.log("poi", "osp submitOrder error");
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("PoiOrderSubmitViewModel@6475.submitOrder$1$2$1");
                    return unit2;
                }
            }
            SubmitOrderResponse submitOrderResponse = (SubmitOrderResponse) objLLJJJ;
            this.LLILLL.setState(new AwS597S0100000_18(submitOrderResponse, 433));
            LocationNetTracker.LIZIZ(locationNetRequestInfo, new AwS52S0100100_18(jCurrentTimeMillis, submitOrderResponse, 4));
            LsExceptionUx exceptionUx = submitOrderResponse.getExceptionUx();
            if (exceptionUx == null || (strValueOf = exceptionUx.code) == null) {
                strValueOf = String.valueOf(submitOrderResponse.status_code);
            }
            C1173110gdJ c1173110gdJ3 = C1173110gdJ.LIZ;
            boolean zLIZ = C123100dR.LIZ(submitOrderResponse.getOrderId());
            boolean zLIZ2 = C123100dR.LIZ(submitOrderResponse.getPayResultInfo());
            c1173110gdJ3.getClass();
            c1173110gdJ3.LIZJ("poi_order_submit_request_result", new C1180850gpn(0, strValueOf, zLIZ, zLIZ2));
            c2276411E8h = C2276411E8h.LIZIZ;
            sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("osp submitOrder success, bizStatusCode = ");
            sbLIZ.append(strValueOf);
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            c2276411E8h.log("poi", C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th4) {
            th = th4;
            TryCatchGuardChecker.doCheck(th);
            this.LLILLL.setState(new AwS597S0100000_18(th, 434));
            C1173110gdJ c1173110gdJ22 = C1173110gdJ.LIZ;
            c1173110gdJ22.getClass();
            c1173110gdJ22.LIZJ("poi_order_submit_request_result", new C1180850gpn(-1, locationNetRequestInfo, false, false));
            C2276411E8h.LIZIZ.log("poi", "osp submitOrder error");
        }
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("PoiOrderSubmitViewModel@6475.submitOrder$1$2$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
