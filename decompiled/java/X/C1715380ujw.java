package X;

import com.bytedance.pipo.verify.base.model.VerifyDetail;
import com.bytedance.pipo.verify.base.model.VerifyInfo;
import com.ss.android.ugc.aweme.verify.ocr.OCRVerifyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS605S0100000_26;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ujw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.verify.ocr.OCRVerifyViewModel$invokeFallback$2", f = "OCRVerifyViewModel.kt", l = {259}, m = "invokeSuspend")
public final class C1715380ujw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OCRVerifyViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1715380ujw(OCRVerifyViewModel oCRVerifyViewModel, String str, InterfaceC1364105Vn<? super C1715380ujw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = oCRVerifyViewModel;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1715380ujw(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String str;
        InterfaceC1715120ujW interfaceC1715120ujW;
        VerifyInfo verifyInfoLJIIIZ;
        VerifyDetail verifyDetail;
        C1C7U.LIZ("OCRVerifyViewModel@d3ed.invokeFallback$2");
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
            JSONObject jSONObject = new JSONObject();
            OCRVerifyViewModel oCRVerifyViewModel = this.LLILLJJLI;
            String str2 = this.LLILLL;
            C1713570uh1 c1713570uh1 = oCRVerifyViewModel.LL;
            if (c1713570uh1 == null || (verifyInfoLJIIIZ = c1713570uh1.LJIIIZ()) == null || (verifyDetail = verifyInfoLJIIIZ.verifyDetail) == null || (str = verifyDetail.commonPublicKey) == null) {
                str = "";
            }
            jSONObject.put("fail_reason", C1719290uqF.LIZIZ(str2, str));
            String strJ3 = C786410Ut5.J3(jSONObject);
            C1714950ujF c1714950ujF = this.LLILLJJLI.LLILLJJLI;
            if (c1714950ujF != null) {
                this.LL = 1;
                obj = c1714950ujF.LIZIZ(strJ3, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("OCRVerifyViewModel@d3ed.invokeFallback$2");
                    return objLJFF;
                }
            } else {
                interfaceC1715120ujW = null;
                OCRVerifyViewModel oCRVerifyViewModel2 = this.LLILLJJLI;
                oCRVerifyViewModel2.getClass();
                oCRVerifyViewModel2.setState(new AwS605S0100000_26(interfaceC1715120ujW, 707));
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("OCRVerifyViewModel@d3ed.invokeFallback$2");
                return unit;
            }
        }
        interfaceC1715120ujW = (InterfaceC1715120ujW) obj;
        OCRVerifyViewModel oCRVerifyViewModel22 = this.LLILLJJLI;
        oCRVerifyViewModel22.getClass();
        oCRVerifyViewModel22.setState(new AwS605S0100000_26(interfaceC1715120ujW, 707));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("OCRVerifyViewModel@d3ed.invokeFallback$2");
        return unit2;
    }
}
