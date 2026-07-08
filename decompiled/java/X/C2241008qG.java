package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08qG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2241008qG {
    public final HashMap<String, Object> LIZ = new HashMap<>();

    public final JSONObject LJ() {
        try {
            return new JSONObject(this.LIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static C2241008qG LJFF(JSONObject jSONObject) {
        C2241008qG c2241008qG = new C2241008qG();
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    c2241008qG.LIZLLL(next, JSONObjectProtectorUtils.getString(jSONObject, next));
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return c2241008qG;
    }

    public final void LIZ(Boolean bool, String str) {
        this.LIZ.put(str, bool);
    }

    public final void LIZIZ(Integer num, String str) {
        this.LIZ.put(str, num);
    }

    public final void LIZJ(Long l, String str) {
        this.LIZ.put(str, l);
    }

    public final void LIZLLL(String str, String str2) {
        this.LIZ.put(str, str2);
    }
}
