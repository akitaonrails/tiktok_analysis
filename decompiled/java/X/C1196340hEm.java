package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.thirdparty.repo.model.ReportOrderAttributeReqBody;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hEm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.transaction.PoiTransactionServiceImpl$getOrderAttributeEventHandler$1$1", f = "PoiTransactionServiceImpl.kt", l = {59}, m = "invokeSuspend")
public final class C1196340hEm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ JSONObject LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1196340hEm(String str, InterfaceC1364105Vn interfaceC1364105Vn, JSONObject jSONObject) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = jSONObject;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1196340hEm(this.LLILLL, interfaceC1364105Vn, this.LLILLJJLI);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strOptString;
        String strJ3;
        C1C7U.LIZ("PoiTransactionServiceImpl@6392.getOrderAttributeEventHandler$1$1");
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
                C1196380hEq c1196380hEq = InterfaceC1196370hEp.LIZ;
                Integer numLJ = C2286608xc.LJ(2);
                JSONObject jSONObject = this.LLILLJJLI;
                String strOptString2 = null;
                if (jSONObject != null) {
                    strOptString = jSONObject.optString("ttoclid");
                } else {
                    strOptString = null;
                }
                String str = "";
                if (strOptString == null) {
                    strOptString = "";
                }
                String str2 = this.LLILLL;
                JSONObject jSONObject2 = this.LLILLJJLI;
                if (jSONObject2 != null) {
                    strJ3 = C786410Ut5.J3(jSONObject2);
                } else {
                    strJ3 = null;
                }
                JSONObject jSONObject3 = this.LLILLJJLI;
                if (jSONObject3 != null) {
                    strOptString2 = jSONObject3.optString("page_url");
                }
                if (strOptString2 != null) {
                    str = strOptString2;
                }
                ReportOrderAttributeReqBody reportOrderAttributeReqBody = new ReportOrderAttributeReqBody(numLJ, strOptString, str2, strJ3, str);
                this.LL = 1;
                if (c1196380hEq.LIZIZ(reportOrderAttributeReqBody, this) == objLJFF) {
                    C1C7U.LIZIZ("PoiTransactionServiceImpl@6392.getOrderAttributeEventHandler$1$1");
                    return objLJFF;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1205490hTX.LIZ.LJ(C1EMR.REPORT_ORDER_ATTRIBUTE_ERROR, th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiTransactionServiceImpl@6392.getOrderAttributeEventHandler$1$1");
        return unit;
    }
}
