package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XGI, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XGI {
    public static C0XO3 LIZIZ() {
        C844470XAv.LIZ.getClass();
        String string = C810670Vr7.LIZJ(C844470XAv.LIZ(), 0, "aweme_user").getString("user_info_raw", "");
        String str = string != null ? string : "";
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            C0XO3 c0xo3 = new C0XO3(new JSONObject(str));
            c0xo3.LIZ();
            return c0xo3;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final void LIZ(String str) {
        C844470XAv.LIZ.getClass();
        C810670Vr7.LIZJ(C844470XAv.LIZ(), 0, "aweme_user").edit().putString("user_info_raw", str).apply();
    }
}
