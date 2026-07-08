package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09Xw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2389409Xw implements InterfaceC1051760dTa {
    @Override // X.InterfaceC1051760dTa
    public final void call(C1058910df7 c1058910df7, JSONObject jSONObject) {
        HashMap map = new HashMap();
        C0XDN.LIZJ(map, false);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!C2093608Ic.LJ(str) && !C2093608Ic.LJ(str2)) {
                try {
                    jSONObject.put(str, str2);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        try {
            jSONObject.put("code", 1);
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
