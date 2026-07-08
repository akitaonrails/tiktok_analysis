package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Whb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C830250Whb {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final long LJI;
    public final String LJII;
    public final long LJIIIIZZ;
    public final JSONObject LJIIIZ;

    public final JSONObject LIZIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("request_id", this.LIZ);
            jSONObject.put("url", this.LIZIZ);
            jSONObject.put("req_body_length", this.LIZJ);
            jSONObject.put("is_success", this.LIZLLL);
            jSONObject.put("status_code", this.LJ);
            jSONObject.put("error_code", this.LJFF);
            jSONObject.put("resp_body_length", this.LJI);
            jSONObject.put("message", this.LJII);
            jSONObject.put("duration", this.LJIIIIZZ);
            JSONObject jSONObject2 = this.LJIIIZ;
            if (jSONObject2 != null && jSONObject2.length() > 0) {
                Iterator<String> itKeys = this.LJIIIZ.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, this.LJIIIZ.get(next));
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2209791BeD.LJIJJ().LJIILLIIL(8, C830260Whc.LLILZLL, "NetworkInfo toFlatJson failed", th, new Object[0]);
        }
        return jSONObject;
    }

    public final JSONObject LIZJ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("request_id", this.LIZ);
            jSONObject.put("url", this.LIZIZ);
            jSONObject.put("req_body_length", this.LIZJ);
            jSONObject.put("is_success", this.LIZLLL);
            jSONObject.put("status_code", this.LJ);
            jSONObject.put("error_code", this.LJFF);
            jSONObject.put("resp_body_length", this.LJI);
            jSONObject.put("message", this.LJII);
            jSONObject.put("duration", this.LJIIIIZZ);
            JSONObject jSONObject2 = this.LJIIIZ;
            if (jSONObject2 != null && jSONObject2.length() > 0) {
                jSONObject.put("extras", this.LJIIIZ);
                return jSONObject;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2209791BeD.LJIJJ().LJIILLIIL(8, C830260Whc.LLILZLL, "NetworkInfo toJson failed", th, new Object[0]);
        }
        return jSONObject;
    }

    public static C830250Whb LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C830250Whb(jSONObject.optString("request_id"), jSONObject.optString("url"), jSONObject.optLong("req_body_length"), jSONObject.optBoolean("is_success"), jSONObject.optInt("status_code"), jSONObject.optInt("error_code"), jSONObject.optLong("resp_body_length"), jSONObject.optString("message"), jSONObject.optLong("duration"), jSONObject.optJSONObject("extras"));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2209791BeD.LJIJJ().LJIILLIIL(8, C830260Whc.LLILZLL, "NetworkInfo fromJson failed", th, new Object[0]);
            return null;
        }
    }

    public C830250Whb(String str, String str2, long j, boolean z, int i, int i2, long j2, String str3, long j3, JSONObject jSONObject) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = z;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = j2;
        this.LJII = str3;
        this.LJIIIIZZ = j3;
        this.LJIIIZ = jSONObject;
    }
}
