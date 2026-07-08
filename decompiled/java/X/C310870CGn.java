package X;

import com.bytedance.ies.abmock.SettingsManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0CGn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C310870CGn extends AbstractC310860CGm {
    public static final C310870CGn LIZIZ = new C310870CGn();

    @Override // X.AbstractC310860CGm
    public final String LIZ() {
        return "bric_captcha_account_domain_replacement";
    }

    @Override // X.AbstractC310860CGm
    public final JSONObject LIZIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        LIZIZ.getClass();
        jSONObject.put("bric_captcha_account_domain_replacement", false);
        return jSONObject;
    }

    @Override // X.AbstractC310860CGm
    public final JSONObject LIZJ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        LIZIZ.getClass();
        SettingsManager.LIZLLL().getClass();
        jSONObject.put("bric_captcha_account_domain_replacement", !SettingsManager.LIZ("bric_captcha_account_domain_replacement", false));
        return jSONObject;
    }
}
