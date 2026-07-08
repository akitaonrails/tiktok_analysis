package X;

import Y.ARunnableS14S1100000_9;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NJJ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NJJ {
    public static final <V> JSONObject LIZIZ(Pair<String, ? extends V>... pairArr) {
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

    public static final void LIZ(String str, JSONObject jSONObject) {
        C20684815ws.LJFF().execute(new ARunnableS14S1100000_9(str, jSONObject, 25));
    }
}
