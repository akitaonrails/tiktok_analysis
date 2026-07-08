package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS190S0000000_4;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0CGs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C310920CGs {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3823));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3822));

    public static void LIZ(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        SharedPreferences.Editor editorEdit;
        C844470XAv.LIZ.getClass();
        C847490XMl c847490XMlLIZ = C310970CGx.LIZ(C844470XAv.LIZ());
        JSONObject jSONObjectPut = new JSONObject().put("sdk_key_accountSDK", jSONObject);
        c847490XMlLIZ.getClass();
        if (jSONObjectPut != null) {
            try {
                if (!jSONObjectPut.has("data") || (jSONObjectPut = jSONObjectPut.optJSONObject("data")) != null) {
                    if (jSONObjectPut.has("app")) {
                        jSONObjectPut = jSONObjectPut.optJSONObject("app");
                    } else {
                        if (jSONObjectPut.has("settings")) {
                            jSONObjectPut = jSONObjectPut.optJSONObject("settings");
                        }
                        if (!jSONObjectPut.has("sdk_key_accountSDK") && (jSONObjectOptJSONObject = jSONObjectPut.optJSONObject("sdk_key_accountSDK")) != null) {
                            String strJ3 = C786410Ut5.J3(jSONObjectOptJSONObject);
                            if (!TextUtils.isEmpty(strJ3)) {
                                Context context = c847490XMlLIZ.LIZ;
                                if (c847490XMlLIZ.LIZIZ == null && context != null) {
                                    c847490XMlLIZ.LIZIZ = C810670Vr7.LIZJ(context, 0, "account_sdk_settings_sp");
                                }
                                SharedPreferences sharedPreferences = c847490XMlLIZ.LIZIZ;
                                if (sharedPreferences != null && (editorEdit = sharedPreferences.edit()) != null) {
                                    editorEdit.putString("account_sdk_settings", strJ3);
                                    editorEdit.apply();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    if (jSONObjectPut == null) {
                        return;
                    }
                    if (!jSONObjectPut.has("sdk_key_accountSDK")) {
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
