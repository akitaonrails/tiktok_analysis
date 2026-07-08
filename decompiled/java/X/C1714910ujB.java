package X;

import com.bytedance.pipo.verify.base.model.VerifyDetail;
import com.ss.android.ugc.aweme.verify.pi.VerifyViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ujB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.verify.pi.VerifyViewModel$init$1$1", f = "PiVerifyViewModel.kt", l = {92}, m = "invokeSuspend")
public final class C1714910ujB extends C09AX implements InterfaceC1631620sYq<C1713570uh1, String, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public /* synthetic */ C1713570uh1 LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ VerifyViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1714910ujB(VerifyViewModel verifyViewModel, InterfaceC1364105Vn<? super C1714910ujB> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = verifyViewModel;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C1713570uh1 c1713570uh1, String str, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        C1714910ujB c1714910ujB = new C1714910ujB(this.LLILZ, interfaceC1364105Vn);
        c1714910ujB.LLILLJJLI = c1713570uh1;
        c1714910ujB.LLILLL = str;
        return c1714910ujB.invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1713570uh1 c1713570uh1;
        String str;
        String str2;
        C1C7U.LIZ("VerifyViewModel@4e16.init$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                str = (String) this.LLILLL;
                c1713570uh1 = this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c1713570uh1 = this.LLILLJJLI;
            str = (String) this.LLILLL;
            C1719290uqF c1719290uqF = C1719290uqF.LIZ;
            AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(this.LLILZ, 1514);
            AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26(this.LLILZ, 747);
            this.LLILLJJLI = c1713570uh1;
            this.LLILLL = str;
            this.LL = 1;
            obj = c1719290uqF.LIZJ(c1713570uh1, awS570S0100000_26, awS605S0100000_26, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("VerifyViewModel@4e16.init$1$1");
                return objLJFF;
            }
        }
        String strLIZIZ = C1719290uqF.LIZIZ(str, (String) obj);
        JSONObject jSONObject = new JSONObject();
        VerifyViewModel verifyViewModel = this.LLILZ;
        jSONObject.put("encrypt_identity", strLIZIZ);
        VerifyDetail verifyDetailLJIIIIZZ = c1713570uh1.LJIIIIZZ();
        if (verifyDetailLJIIIIZZ != null) {
            str2 = verifyDetailLJIIIIZZ.experimentGroup;
        } else {
            str2 = null;
        }
        jSONObject.put("experiment_group", str2);
        if (verifyViewModel.vQ2()) {
            jSONObject.put("has_used_ocr", verifyViewModel.getState().LLIZ);
        }
        String strJ3 = C786410Ut5.J3(jSONObject);
        C1C7U.LIZIZ("VerifyViewModel@4e16.init$1$1");
        return strJ3;
    }
}
