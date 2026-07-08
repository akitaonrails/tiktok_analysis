package X;

import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.jvm.internal.AwS567S0100000_23;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qR9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1549970qR9 extends AbstractC1549980qRA implements InterfaceC1550170qRT {
    public final C01GW LJII;

    public C1549970qR9(Uri uri, C1550020qRE c1550020qRE, Map<String, String> map) {
        super(uri, c1550020qRE, map);
        this.LJII = C452501pT.LIZ(EnumC452301pR.NONE, new AwS567S0100000_23(this, 212));
    }

    @Override // X.AbstractC1549980qRA
    public final void LJIIJJI(AbstractC1550060qRI abstractC1550060qRI, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        try {
            LJIILJJIL(abstractC1550060qRI, str, jSONObject, jSONObject2, jSONObject3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJIILIIL(abstractC1550060qRI.getUrl(), "rn", e);
        }
    }

    public final void LJIILJJIL(AbstractC1550060qRI abstractC1550060qRI, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) throws JSONException {
        String str2;
        InterfaceC824360WVm interfaceC824360WVm = (InterfaceC824360WVm) this.LJII.getValue();
        String url = abstractC1550060qRI.getUrl();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("type", "rn");
        if (this.LIZLLL.LIZ(InterfaceC1550100qRM.class) == null) {
            str2 = "origin";
        } else {
            str2 = "fallback";
        }
        jSONObject.put("is_fallback", str2);
        C1043700dGa.LIZ(jSONObject, abstractC1550060qRI.getFormatData());
        InterfaceC1550100qRM interfaceC1550100qRM = (InterfaceC1550100qRM) this.LIZLLL.LIZ(InterfaceC1550100qRM.class);
        if (interfaceC1550100qRM != null) {
            C1043700dGa.LIZ(jSONObject, new C1549990qRB(interfaceC1550100qRM.LJIIIIZZ().LLILLJJLI, "original_", null, 4).getFormatData());
        }
        String strJ3 = C786410Ut5.J3(jSONObject);
        JSONObject jSONObject4 = new JSONObject();
        if (jSONObject2 != null) {
            C1043700dGa.LIZ(jSONObject4, jSONObject2);
        }
        String strJ32 = C786410Ut5.J3(jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        if (jSONObject3 != null) {
            C1043700dGa.LIZ(jSONObject5, jSONObject3);
        }
        interfaceC824360WVm.customReport(null, url, str, strJ3, strJ32, C786410Ut5.J3(jSONObject5), CardStruct.IStatusCode.DEFAULT);
        ((InterfaceC1041930dDj) this.LJII.getValue()).report(null);
    }
}
