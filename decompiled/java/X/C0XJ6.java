package X;

import android.text.TextUtils;
import com.bytedance.ies.android.base.runtime.depend.IMonitorDepend;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XJ6, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XJ6 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("service", str2);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        IMonitorDepend iMonitorDependLIZJ = C2214471Bll.LIZJ();
        if (iMonitorDependLIZJ != null) {
            iMonitorDependLIZJ.monitorCommonLog(str, jSONObject);
        }
    }
}
