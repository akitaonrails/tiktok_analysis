package X;

import com.bytedance.pipo.verify.base.model.VerifyDetail;
import com.bytedance.pipo.verify.base.model.VerifyInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.verify.ocr.MicroblinkFakeCheckResult;
import com.ss.android.ugc.aweme.verify.ocr.OCRVerifyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS605S0100000_26;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ujx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.verify.ocr.OCRVerifyViewModel$invokeDoVerify$2", f = "OCRVerifyViewModel.kt", l = {237}, m = "invokeSuspend")
public final class C1715390ujx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ OCRVerifyViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1715390ujx(OCRVerifyViewModel oCRVerifyViewModel, InterfaceC1364105Vn<? super C1715390ujx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = oCRVerifyViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1715390ujx c1715390ujx = new C1715390ujx(this.LLILLL, interfaceC1364105Vn);
        c1715390ujx.LLILLJJLI = obj;
        return c1715390ujx;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String str;
        InterfaceC1715120ujW interfaceC1715120ujW;
        Object c098200Yq;
        String str2;
        String str3;
        String str4;
        VerifyInfo verifyInfoLJIIIZ;
        VerifyDetail verifyDetail;
        C1C7U.LIZ("OCRVerifyViewModel@d3ed.invokeDoVerify$2");
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
            C1713570uh1 c1713570uh1 = this.LLILLL.LL;
            String str5 = "";
            if (c1713570uh1 == null || (verifyInfoLJIIIZ = c1713570uh1.LJIIIZ()) == null || (verifyDetail = verifyInfoLJIIIZ.verifyDetail) == null || (str = verifyDetail.commonPublicKey) == null) {
                str = "";
            }
            interfaceC1715120ujW = null;
            try {
                C1715400ujy c1715400ujy = OCRVerifyViewModel.LLILZLL;
                if (c1715400ujy != null) {
                    MicroblinkFakeCheckResult microblinkFakeCheckResult = new MicroblinkFakeCheckResult(String.valueOf(c1715400ujy.LJIIIIZZ), String.valueOf(c1715400ujy.LJIIIZ), String.valueOf(c1715400ujy.LJIIJ), String.valueOf(c1715400ujy.LJIIJJI));
                    C1227904rF.LIZ.getClass();
                    c098200Yq = C1227904rF.LJI(microblinkFakeCheckResult);
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            JSONObject jSONObject = new JSONObject();
            OCRVerifyViewModel oCRVerifyViewModel = this.LLILLL;
            C1715400ujy c1715400ujy2 = OCRVerifyViewModel.LLILZLL;
            if (c1715400ujy2 == null || (str2 = c1715400ujy2.LJII) == null) {
                str2 = "";
            }
            String strLIZIZ = C1719290uqF.LIZIZ(str2, str);
            C1715400ujy c1715400ujy3 = OCRVerifyViewModel.LLILZLL;
            if (c1715400ujy3 == null || (str3 = c1715400ujy3.LIZLLL) == null) {
                str3 = "";
            }
            String strLIZIZ2 = C1719290uqF.LIZIZ(str3, str);
            C1715400ujy c1715400ujy4 = OCRVerifyViewModel.LLILZLL;
            if (c1715400ujy4 != null && (str4 = c1715400ujy4.LJI) != null) {
                str5 = str4;
            }
            String strLIZIZ3 = C1719290uqF.LIZIZ(str5, str);
            jSONObject.put("encrypt_card_no", strLIZIZ);
            jSONObject.put("encrypt_holder_name", strLIZIZ2);
            jSONObject.put("encrypt_card_expiration_date", strLIZIZ3);
            jSONObject.put("ocr_vendor", oCRVerifyViewModel.LLILZ);
            jSONObject.put("microblink", c098200Yq);
            String strJ3 = C786410Ut5.J3(jSONObject);
            C1713570uh1 c1713570uh12 = this.LLILLL.LL;
            if (c1713570uh12 != null) {
                C1714170uhz.LIZ(c1713570uh12);
            }
            C1714950ujF c1714950ujF = this.LLILLL.LLILLJJLI;
            if (c1714950ujF != null) {
                this.LL = 1;
                obj = c1714950ujF.LIZIZ(strJ3, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("OCRVerifyViewModel@d3ed.invokeDoVerify$2");
                    return objLJFF;
                }
            }
            OCRVerifyViewModel oCRVerifyViewModel2 = this.LLILLL;
            oCRVerifyViewModel2.getClass();
            oCRVerifyViewModel2.setState(new AwS605S0100000_26(interfaceC1715120ujW, 707));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("OCRVerifyViewModel@d3ed.invokeDoVerify$2");
            return unit;
        }
        interfaceC1715120ujW = (InterfaceC1715120ujW) obj;
        OCRVerifyViewModel oCRVerifyViewModel22 = this.LLILLL;
        oCRVerifyViewModel22.getClass();
        oCRVerifyViewModel22.setState(new AwS605S0100000_26(interfaceC1715120ujW, 707));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("OCRVerifyViewModel@d3ed.invokeDoVerify$2");
        return unit2;
    }
}
