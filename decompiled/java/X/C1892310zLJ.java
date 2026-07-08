package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.live.common.api.model.ProductOverviewData;
import com.ss.android.ugc.aweme.localservice.live.common.api.model.ProductOverviewResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zLJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.localservice.live.influencer.widget.LSProductBeforeLiveWidget$updateProductsAlertNumText$2", f = "LSProductBeforeLiveWidget.kt", l = {172}, m = "invokeSuspend")
public final class C1892310zLJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1892390zLR LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1892310zLJ(C1892390zLR c1892390zLR, String str, InterfaceC1364105Vn<? super C1892310zLJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1892390zLR;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1892310zLJ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        Integer numLJ;
        String str;
        Integer numLJ2;
        int iIntValue;
        Integer num;
        C1C7U.LIZ("LSProductBeforeLiveWidget@c27b.updateProductsAlertNumText$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str2 = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1DFB c1dfb = C0PEM.LIZJ;
                C1892360zLO c1892360zLO = new C1892360zLO(null);
                this.LL = 1;
                obj = C23250099c.LJI(this, c1dfb, c1892360zLO);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LSProductBeforeLiveWidget@c27b.updateProductsAlertNumText$2");
                    return objLJFF;
                }
            }
            ProductOverviewResponse productOverviewResponse = (ProductOverviewResponse) obj;
            if (productOverviewResponse == null || productOverviewResponse.status_code != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateProductsAlertNumText===network error==status_code=");
                if (productOverviewResponse == null) {
                    numLJ = null;
                } else {
                    numLJ = C2286608xc.LJ(productOverviewResponse.status_code);
                }
                sbLIZ.append(numLJ);
                sbLIZ.append("=msg=");
                if (productOverviewResponse == null) {
                    str = null;
                } else {
                    str = productOverviewResponse.message;
                }
                sbLIZ.append(str);
                c2276471E8n.LIZ("ttls-live", "LSProductBeforeLiveWidget", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                C1892390zLR c1892390zLR = this.LLILLJJLI;
                ProductOverviewData productOverviewData = productOverviewResponse.data;
                if (productOverviewData != null && (num = productOverviewData.productNum) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                c1892390zLR.LJJ(iIntValue);
            }
            C1892390zLR c1892390zLR2 = this.LLILLJJLI;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("source", this.LLILLL);
            jSONObject.put("by_catch", 0);
            if (productOverviewResponse != null) {
                numLJ2 = C2286608xc.LJ(productOverviewResponse.status_code);
            } else {
                numLJ2 = null;
            }
            jSONObject.put("response_status_code", numLJ2);
            if (productOverviewResponse != null) {
                str2 = productOverviewResponse.message;
            }
            jSONObject.put("response_message", str2);
            c1892390zLR2.LJJI("StepResponseProductNum", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1892390zLR c1892390zLR3 = this.LLILLJJLI;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("source", this.LLILLL);
            jSONObject2.put("by_catch", 1);
            jSONObject2.put("catch_e_message", e.getMessage());
            c1892390zLR3.LJJI("StepResponseProductNum", jSONObject2);
            C2276471E8n.LIZIZ.e("ttls-live", "updateProductsAlertNumText===network error==", e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LSProductBeforeLiveWidget@c27b.updateProductsAlertNumText$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
