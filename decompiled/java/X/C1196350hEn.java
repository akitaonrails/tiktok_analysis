package X;

import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.thirdparty.repo.model.ReportOrderAttributeReqBody;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hEn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.thirdparty.provider.PoiThirdPartyLoadCallback$reportOrderAttribute$1", f = "PoiThirdPartyLoadCallback.kt", l = {221}, m = "invokeSuspend")
public final class C1196350hEn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C1892880zME LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1196350hEn(String str, String str2, String str3, C1892880zME c1892880zME, InterfaceC1364105Vn<? super C1196350hEn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = c1892880zME;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1196350hEn(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        JSONObject jSONObject;
        String strOptString;
        View viewE1;
        String string;
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
        C1C7U.LIZ("PoiThirdPartyLoadCallback@1e5f.reportOrderAttribute$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                String str = this.LLILLJJLI;
                String strLJ = null;
                if (str != null) {
                    jSONObject = new JSONObject(str);
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null && C123100dR.LIZ(this.LLILLL)) {
                    jSONObject.put("promote_id", this.LLILLL);
                }
                if (jSONObject != null) {
                    jSONObject.put("bcm_chain", this.LLILZ);
                }
                if (jSONObject != null) {
                    SparkContext sparkContext = this.LLILZIL.LLJ;
                    if (sparkContext != null && (interfaceC1541990qEHLJIJJ = sparkContext.LJIJJ()) != null) {
                        viewE1 = interfaceC1541990qEHLJIJJ.e1();
                    } else {
                        viewE1 = null;
                    }
                    for (Map.Entry entry : C1076720e7q.LIZ(PageFinder.via(viewE1), true).entrySet()) {
                        String str2 = (String) entry.getKey();
                        Object value = entry.getValue();
                        if (value != null) {
                            string = value.toString();
                        } else {
                            string = null;
                        }
                        C1189060h32.LJJI(str2, string, jSONObject);
                    }
                }
                C1196380hEq c1196380hEq = InterfaceC1196370hEp.LIZ;
                Integer numLJ = C2286608xc.LJ(2);
                if (jSONObject != null) {
                    strOptString = jSONObject.optString("ttoclid");
                } else {
                    strOptString = null;
                }
                if (strOptString == null) {
                    strOptString = "";
                }
                if (jSONObject != null) {
                    strLJ = C2365509Or.LJ(jSONObject);
                }
                ReportOrderAttributeReqBody reportOrderAttributeReqBody = new ReportOrderAttributeReqBody(numLJ, strOptString, "enter_poi_webview", strLJ, this.LLILZIL.LLILZ);
                this.LL = 1;
                if (c1196380hEq.LIZIZ(reportOrderAttributeReqBody, this) == objLJFF) {
                    C1C7U.LIZIZ("PoiThirdPartyLoadCallback@1e5f.reportOrderAttribute$1");
                    return objLJFF;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1205490hTX.LIZ.LJ(C1EMR.REPORT_ORDER_ATTRIBUTE_ERROR, th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiThirdPartyLoadCallback@1e5f.reportOrderAttribute$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
