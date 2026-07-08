package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0VF4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VF4 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public long LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public long LJII;
    public final String LJIIIIZZ;
    public final JSONObject LJIIIZ;

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            this.LJIIIZ.put("aid", this.LIZIZ);
            this.LJIIIZ.put("path", this.LIZJ);
            this.LJIIIZ.put("update_time", this.LIZLLL);
            try {
                JSONObject jSONObject2 = this.LJIIIZ;
                if (C0VXL.LIZLLL == null) {
                    C0VXL.LIZLLL = new SimpleDateFormat("yyyy-MM-dd@HH-mm-ss.SSS", Locale.getDefault());
                }
                jSONObject2.put("update_time_format", C0VXL.LIZLLL.format(new Date(this.LIZLLL)));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LJIIIZ.put("update_time_format", "");
            }
            this.LJIIIZ.put("strategy", this.LJ);
            this.LJIIIZ.put("alog_strategy", this.LJFF);
            this.LJIIIZ.put("retreatCount", this.LJI);
            this.LJIIIZ.put("redirect", this.LJIIIIZZ);
            jSONObject.put(this.LIZ, this.LJIIIZ);
            return jSONObject;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return jSONObject;
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(e3.e);
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(" ");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(" ");
        sbLIZ.append(this.LJI);
        sbLIZ.append(" ");
        sbLIZ.append(this.LJII);
        sbLIZ.append(e3.f);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0VF4(JSONObject jSONObject) {
        if (jSONObject != null) {
            String strOptString = jSONObject.optString("aid");
            this.LIZIZ = strOptString;
            String strOptString2 = jSONObject.optString("path");
            this.LIZJ = strOptString2;
            this.LJ = jSONObject.optInt("strategy");
            this.LJFF = jSONObject.optInt("alog_strategy");
            this.LIZLLL = jSONObject.optLong("update_time");
            jSONObject.optString("update_time_format");
            this.LJI = jSONObject.optInt("retreatCount");
            this.LJIIIIZZ = jSONObject.optString("redirect");
            this.LJIIIZ = new JSONObject(C786410Ut5.J3(jSONObject));
            this.LIZ = C802230VdV.LJFF(strOptString, strOptString2);
            return;
        }
        throw new IllegalArgumentException("json can't be null");
    }

    public C0VF4(String str, String str2) {
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LJIIIIZZ = "";
        JSONObject jSONObject = new JSONObject();
        this.LJIIIZ = jSONObject;
        this.LIZ = C802230VdV.LJFF(str, str2);
        try {
            jSONObject.put("aid", str);
            jSONObject.put("path", str2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
