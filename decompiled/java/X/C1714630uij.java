package X;

import com.bytedance.pipo.verify.base.model.VerifyDetail;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uij, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.verify.bio.BioVerifyViewModel$proceedNoCandidateBackendJudge$2$1$fallbackVerifyUseCase$1", f = "BioVerifyViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1714630uij extends C09AX implements InterfaceC1631620sYq<C1713570uh1, String, InterfaceC1364105Vn<? super String>, Object> {
    public final /* synthetic */ C1713570uh1 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1714630uij(C1713570uh1 c1713570uh1, InterfaceC1364105Vn<? super C1714630uij> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LL = c1713570uh1;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C1713570uh1 c1713570uh1, String str, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return new C1714630uij(this.LL, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String str;
        C1C7U.LIZ("BioVerifyViewModel@d5f8.proceedNoCandidateBackendJudge$2$1$fallbackVerifyUseCase$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        JSONObject jSONObject = new JSONObject();
        VerifyDetail verifyDetail = this.LL.LJIIIZ().verifyDetail;
        if (verifyDetail == null || (str = verifyDetail.publicKey) == null) {
            str = "";
        }
        C1714620uii c1714620uiiLIZ = C1719290uqF.LIZ("biometric_not_available", str);
        jSONObject.put("biometric_status", c1714620uiiLIZ.LIZ);
        jSONObject.put("encrypt_random_salt", c1714620uiiLIZ.LIZIZ);
        String strJ3 = C786410Ut5.J3(jSONObject);
        C1C7U.LIZIZ("BioVerifyViewModel@d5f8.proceedNoCandidateBackendJudge$2$1$fallbackVerifyUseCase$1");
        return strJ3;
    }
}
