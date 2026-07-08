package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.common.MobClick;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0N1L, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N1L {
    public static void LIZIZ(String str, String str2) {
        MobClick mobClickObtain = MobClick.obtain();
        mobClickObtain.setEventName("unblock");
        mobClickObtain.setLabelName(str);
        mobClickObtain.setValue(str2);
        C20684815ws.onEvent(mobClickObtain);
    }

    public static void LIZ(String str, String str2, String str3) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str3)) {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("enter_from", str3);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            jSONObject = null;
        }
        MobClick mobClickObtain = MobClick.obtain();
        mobClickObtain.setEventName("block");
        mobClickObtain.setLabelName(str);
        mobClickObtain.setValue(str2);
        mobClickObtain.setJsonObject(jSONObject);
        C20684815ws.onEvent(mobClickObtain);
    }
}
