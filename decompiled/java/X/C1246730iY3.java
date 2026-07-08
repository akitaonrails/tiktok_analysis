package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0iY3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1246730iY3 {
    public static void LIZ(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_language", str);
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("translation_language", str2);
            AppLogNewUtils.onEventV3("enter_sys_language_setting", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
