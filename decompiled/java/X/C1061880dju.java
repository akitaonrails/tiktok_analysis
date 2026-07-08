package X;

import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dju, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1061880dju implements InterfaceC1051760dTa {
    public final IESJsBridge LL;

    public C1061880dju(IESJsBridge iESJsBridge) {
        this.LL = iESJsBridge;
    }

    @Override // X.InterfaceC1051760dTa
    public final void call(C1058910df7 c1058910df7, JSONObject jSONObject) {
        int i;
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (ComplianceServiceProvider.LJIL().LJJJJZI()) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject2.put("isTeenagersModel", i);
            jSONObject2.put("language", C2222691Bz1.LIZIZ());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        IESJsBridge iESJsBridge = this.LL;
        if (iESJsBridge != null) {
            iESJsBridge.LIZ(c1058910df7.LIZIZ, jSONObject2);
        }
    }
}
