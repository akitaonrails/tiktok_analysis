package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oz4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1494120oz4 {
    public final String LIZIZ;
    public long LIZLLL;
    public IOException LJI;
    public C1494600ozq LJIIJJI;
    public int LIZ = -1;
    public final long LIZJ = System.currentTimeMillis();
    public int LJ = 0;
    public int LJFF = -1;
    public String LJII = "";
    public long LJIIIIZZ = -1;
    public Boolean LJIIIZ = Boolean.FALSE;
    public long LJIIJ = -1;

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("host", this.LIZIZ);
            jSONObject.put("start", this.LIZJ);
            jSONObject.put("end", this.LIZLLL);
            jSONObject.put("net_error", this.LJ);
            jSONObject.put("code", this.LJFF);
            IOException iOException = this.LJI;
            if (iOException != null) {
                String message = iOException.getMessage();
                if (!TextUtils.isEmpty(message) && message.length() > 64) {
                    message = message.substring(0, 64);
                }
                jSONObject.put("exception", message);
            }
            jSONObject.put("dispatch", this.LJIIIIZZ);
            jSONObject.put("dpHost", this.LJII);
            if (this.LJIIIZ.booleanValue()) {
                jSONObject.put("sentAlready", true);
            }
            long j = this.LJIIJ;
            if (j > 0) {
                jSONObject.put("cleanUpTime", j);
                return jSONObject;
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONObject;
    }

    public C1494120oz4(String str) {
        this.LIZIZ = str;
    }
}
