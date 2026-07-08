package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jmS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294100jmS {
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
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                EnumC1490770otf enumC1490770otf = EnumC1490770otf.E;
                C1533720q0w.LIZ.getClass();
                c1490740otc.LIZ(strLIZIZ, enumC1490770otf, C1533720q0w.LIZIZ);
                return null;
            }
        }
    }
}
