package X;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS3S1300100_27;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1789610wff implements InterfaceC560980LzM<C1789490wfT, Pair<? extends C1789780wfw, ? extends List<? extends C1789750wft>>> {
    public static final /* synthetic */ int LIZLLL = 0;
    public final String LIZ;
    public final InterfaceC1788510wdt LIZIZ;
    public final InterfaceC1786480wac LIZJ;

    @Override // X.InterfaceC560980LzM
    public final String getName() {
        return "RequestSubscriptionInfoAction";
    }

    public static String LIZIZ(C1789460wfQ c1789460wfQ) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("merchant_id", c1789460wfQ.LIZIZ);
        jSONObject.put("from_user_id", c1789460wfQ.LIZ);
        jSONObject.put("sub_merchant_id", c1789460wfQ.LIZJ);
        jSONObject.put("to_user_id", c1789460wfQ.LIZLLL);
        return C786410Ut5.J3(jSONObject);
    }

    @Override // X.InterfaceC560980LzM
    public final Object LIZ(C1789490wfT c1789490wfT, InterfaceC1364105Vn<? super Pair<? extends C1789780wfw, ? extends List<? extends C1789750wft>>> interfaceC1364105Vn) {
        return C2296808zG.LJ(new C1410500moC(c1789490wfT, this, null), interfaceC1364105Vn);
    }

    public C1789610wff(String str, InterfaceC1788510wdt interfaceC1788510wdt, InterfaceC1786480wac interfaceC1786480wac) {
        this.LIZ = str;
        this.LIZIZ = interfaceC1788510wdt;
        this.LIZJ = interfaceC1786480wac;
    }

    public final void LIZJ(C1789460wfQ c1789460wfQ, long j, C1789780wfw c1789780wfw, Throwable th) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (c1789780wfw != null) {
            jSONObject.put("useCommonSku", c1789780wfw.LIZIZ);
            C1789680wfm c1789680wfm = c1789780wfw.LIZ;
            if (c1789680wfm != null) {
                jSONObject.put("contract_id", c1789680wfm.LIZ);
                jSONObject.put("mid", c1789680wfm.LIZIZ);
                jSONObject.put("iap_asset_id", c1789680wfm.LJIIIZ);
                jSONObject.put("from_user_id", c1789680wfm.LIZJ);
                jSONObject.put("to_user_id", c1789680wfm.LIZLLL);
                jSONObject.put("sub_merchant_id", c1789680wfm.LJ);
                jSONObject.put("payment_method", c1789680wfm.LJFF);
                jSONObject.put("state", c1789680wfm.LJI);
                jSONObject.put("payment_channel", c1789680wfm.LJIIJ.getValue());
            }
        }
        String strJ3 = C786410Ut5.J3(jSONObject);
        InterfaceC1786480wac interfaceC1786480wac = this.LIZJ;
        C1789710wfp c1789710wfp = new C1786600wao<C1789650wfj>() { // from class: X.0wfp
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1789710wfp);
            }

            public final int hashCode() {
                return -2005870781;
            }

            public final String toString() {
                return "End";
            }

            {
                new C1789650wfj();
            }
        };
        AwS3S1300100_27 awS3S1300100_27 = new AwS3S1300100_27(this, c1789460wfQ, strJ3, j, th, 0);
        c1789710wfp.getClass();
        interfaceC1786480wac.LIZ(new C1786590wan(c1789710wfp, awS3S1300100_27));
    }
}
