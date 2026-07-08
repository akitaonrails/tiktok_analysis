package X;

import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.05kW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.verify.bio.BioVerifyViewModel$init$1", f = "BioVerifyViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1441005kW extends C09AX implements InterfaceC1631620sYq<C1713570uh1, String, InterfaceC1364105Vn<? super String>, Object> {
    public /* synthetic */ Object LL;

    public C1441005kW(InterfaceC1364105Vn<? super C1441005kW> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C1713570uh1 c1713570uh1, String str, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        C1441005kW c1441005kW = new C1441005kW(interfaceC1364105Vn);
        c1441005kW.LL = str;
        return c1441005kW.invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("BioVerifyViewModel@d5f8.init$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("signature", obj2);
        String strJ3 = C786410Ut5.J3(jSONObject);
        C1C7U.LIZIZ("BioVerifyViewModel@d5f8.init$1");
        return strJ3;
    }
}
