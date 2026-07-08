package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00qf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C205100qf {
    public final Set<String> LIZ;
    public final Set<String> LIZIZ;
    public final Map<String, String> LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommonEventConfig{sampledService=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sampledLogType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", sampledCustomLogType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ(String str, JSONObject jSONObject) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean zContains = this.LIZIZ.contains(str);
        if (zContains && (map = this.LIZJ) != null && jSONObject != null && map.containsKey(str)) {
            String str2 = this.LIZJ.get(str);
            if (TextUtils.isEmpty(str2)) {
                return true;
            }
            try {
                JSONObject jSONObject2 = new JSONObject(str2);
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject2.get(next);
                    if (next.startsWith("$.data.")) {
                        String[] strArrSplit = next.replace("$.data.", "").split("\\.");
                        Object objOpt = jSONObject;
                        int i = 0;
                        boolean z = false;
                        while (true) {
                            if (i < strArrSplit.length) {
                                if (objOpt != null) {
                                    if (objOpt instanceof JSONObject) {
                                        objOpt = ((JSONObject) objOpt).opt(strArrSplit[i]);
                                    } else {
                                        z = true;
                                    }
                                    i++;
                                }
                            } else if (!z && objOpt != null && (obj instanceof JSONObject) && ((JSONObject) obj).optInt(objOpt.toString(), 1) != 1) {
                                return false;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return zContains;
    }

    public C205100qf(Map map, Set set, Set set2) {
        this.LIZ = set;
        this.LIZIZ = set2;
        this.LIZJ = map;
    }
}
