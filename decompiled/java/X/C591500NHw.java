package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NHw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C591500NHw {
    public static final <V> JSONObject LIZ(Pair<String, ? extends V>... pairArr) {
        boolean z;
        if (pairArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        for (Pair<String, ? extends V> pair : pairArr) {
            try {
                jSONObject.putOpt(pair.getFirst(), pair.getSecond());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jSONObject;
    }
}
