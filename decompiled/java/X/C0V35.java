package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V35, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0V35 {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public int LIZLLL;
    public int LJ;
    public long LJFF;
    public long LJI;
    public C088J LJII;
    public String LJIIIIZZ;
    public StackTraceElement[] LJIIIZ;
    public StackTraceElement[] LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public C791400V2s LJIILIIL;

    public final JSONObject LIZIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("msg", C0V36.LIZ(this.LJIIIIZZ));
            jSONObject.put("cpuDuration", this.LJI);
            jSONObject.put("duration", this.LJFF);
            jSONObject.put("type", this.LIZLLL);
            jSONObject.put("messageCount", this.LJ);
            jSONObject.put("lastDuration", this.LIZIZ - this.LIZJ);
            jSONObject.put("start", this.LIZ);
            jSONObject.put("end", this.LIZIZ);
            LIZ(jSONObject);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    public final void LIZ(JSONObject jSONObject) throws JSONException {
        boolean z;
        StackTraceElement[] stackTraceElementArr = this.LJIIIZ;
        if (stackTraceElementArr != null) {
            jSONObject.put("block_stack", C0V36.LIZIZ(stackTraceElementArr));
        }
        jSONObject.put("block_uuid", this.LJIIL);
        StackTraceElement[] stackTraceElementArr2 = this.LJIIJ;
        if (stackTraceElementArr2 != null) {
            jSONObject.put("sblock_stack", C0V36.LIZIZ(stackTraceElementArr2));
        }
        jSONObject.put("sblock_uuid", this.LJIIL);
        if (TextUtils.isEmpty(this.LJIIJJI)) {
            jSONObject.put("evil_msg", this.LJIIJJI);
        }
        if (this.LJIILIIL != null) {
            z = true;
        } else {
            z = false;
        }
        jSONObject.put("belong_frame", z);
        C791400V2s c791400V2s = this.LJIILIIL;
        if (c791400V2s != null) {
            jSONObject.put("vsyncDelayTime", this.LIZJ - (c791400V2s.LIZ / 1000000));
            jSONObject.put("doFrameTime", (this.LJIILIIL.LIZIZ / 1000000) - this.LIZJ);
            C791400V2s c791400V2s2 = this.LJIILIIL;
            jSONObject.put("inputHandlingTime", (c791400V2s2.LIZJ / 1000000) - (c791400V2s2.LIZIZ / 1000000));
            C791400V2s c791400V2s3 = this.LJIILIIL;
            jSONObject.put("animationsTime", (c791400V2s3.LIZLLL / 1000000) - (c791400V2s3.LIZJ / 1000000));
            C791400V2s c791400V2s4 = this.LJIILIIL;
            jSONObject.put("performTraversalsTime", (c791400V2s4.LJ / 1000000) - (c791400V2s4.LIZLLL / 1000000));
            jSONObject.put("drawTime", this.LIZIZ - (this.LJIILIIL.LJ / 1000000));
        }
        C088J c088j = this.LJII;
        if (c088j != null) {
            jSONObject.put("service_name", c088j.LIZ);
            jSONObject.put("service_what", this.LJII.LIZIZ);
            jSONObject.put("service_time", this.LJII.LIZJ);
            jSONObject.put("service_thread", this.LJII.LJ);
            jSONObject.put("service_token", this.LJII.LIZLLL);
        }
    }
}
