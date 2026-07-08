package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uKH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1699470uKH {
    public final int LIZIZ;
    public final long LIZJ = System.currentTimeMillis();
    public long LIZLLL = -1;
    public final JSONObject LIZ = new JSONObject();

    public C1699470uKH(JSONObject jSONObject, int i) {
        this.LIZIZ = 3;
        this.LIZIZ = i;
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                this.LIZ.put(next, jSONObject.get(next));
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
