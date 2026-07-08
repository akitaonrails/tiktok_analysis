package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XNn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C847770XNn {
    public static void LIZ(int i, String str, String str2, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("platform", "app_auth");
            jSONObject.put(Scene.SCENE_SERVICE, "auth");
            jSONObject.put("result", i);
            if (str != null) {
                jSONObject.put("errCode", str);
            }
            if (str2 != null) {
                jSONObject.put("errDesc", str2);
            }
            if (i == 0 && z) {
                jSONObject.put("errorCancel", z);
            }
            jSONObject.put("params_for_special", "uc_login");
            InterfaceC847760XNm interfaceC847760XNm = (InterfaceC847760XNm) C847650XNb.LIZ(InterfaceC847760XNm.class);
            if (interfaceC847760XNm != null) {
                interfaceC847760XNm.LIZ(jSONObject);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
