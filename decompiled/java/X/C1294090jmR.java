package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jmR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294090jmR {
    public static final JSONObject LIZ(String str, JSONObject jSONObject) {
        try {
            return JSONObjectProtectorUtils.getJSONObject(jSONObject, str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                return new JSONObject(JSONObjectProtectorUtils.getString(jSONObject, str));
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1490740otc c1490740otc = C1490740otc.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("could not parse content to JSONObject at ");
                sbLIZ.append(str);
                sbLIZ.append(", error message: ");
                sbLIZ.append(th2.getMessage());
                c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.E, "HybridSettings");
                return null;
            }
        }
    }
}
