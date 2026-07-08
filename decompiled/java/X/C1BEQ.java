package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BEQ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BEQ extends C1699610uKV {
    public int LIZJ;
    public final AbstractC2201681BEw LJI;
    public boolean LIZIZ = true;
    public List<String> LIZLLL = C1BET.LIZ(true);
    public List<String> LJ = C1BET.LIZ(false);
    public List<String> LJFF = new ArrayList();
    public int LJII = 10000;
    public boolean LJIIIIZZ = true;
    public final List<String> LJIIIZ = new ArrayList();

    public C1BEQ(C2201621BEq c2201621BEq) {
        this.LIZ = c2201621BEq.LIZ;
        this.LIZJ = 0;
        this.LJI = c2201621BEq.LIZIZ;
        SystemClock.uptimeMillis();
    }

    public final void LIZIZ(JSONObject jSONObject) {
        boolean z = true;
        try {
            this.LIZ = C1699610uKV.LIZ(jSONObject, "is_enable", true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            th.getMessage();
        }
        try {
            this.LIZIZ = C1699610uKV.LIZ(jSONObject, "store_when_offline", true);
            this.LIZJ = jSONObject.optInt("android_store_impl", 0);
            if (this.LIZLLL == null) {
                this.LIZLLL = new ArrayList();
            }
            ((ArrayList) this.LIZLLL).clear();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("macro_standard");
            if (jSONArrayOptJSONArray != null) {
                LIZJ(this.LIZLLL, jSONArrayOptJSONArray);
                C1BET.LIZIZ(this.LIZLLL);
            } else {
                ((ArrayList) this.LIZLLL).addAll(C1BET.LIZ(true));
            }
            if (this.LJ == null) {
                this.LJ = new ArrayList();
            }
            ((ArrayList) this.LJ).clear();
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("macro_non_standard");
            if (jSONArrayOptJSONArray2 != null) {
                LIZJ(this.LJ, jSONArrayOptJSONArray2);
                C1BET.LIZIZ(this.LJ);
            } else {
                ((ArrayList) this.LJ).addAll(C1BET.LIZ(false));
            }
            if (this.LJFF == null) {
                this.LJFF = new ArrayList();
            }
            ((ArrayList) this.LJFF).clear();
            LIZJ(this.LJFF, jSONObject.optJSONArray("macro_blocklist"));
            this.LJII = jSONObject.optInt("request_timeout", 10000);
            ((ArrayList) this.LJIIIZ).clear();
            LIZJ(this.LJIIIZ, jSONObject.optJSONArray("redirect_blocklist"));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            th2.getMessage();
        }
        SystemClock.uptimeMillis();
        if (jSONObject.optInt("enable_url_encode_compat", 1) != 1) {
            z = false;
        }
        this.LJIIIIZZ = z;
    }

    public static void LIZJ(List list, JSONArray jSONArray) {
        if (jSONArray != null && list != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof String) {
                        list.add(obj);
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
        }
    }
}
