package X;

import android.os.Looper;
import android.os.SystemClock;
import kotlin.jvm.internal.AwS412S0200000_11;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0S9K, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public abstract class C0S9K implements C0S9I {
    public Long LIZ;
    public int LIZIZ;

    public final void LIZ(Integer num, long j, String str) {
        if (C0SKM.LJIIIIZZ().enablePerfTrack && j > 0 && !C20737116Cr.LIZJ()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Long l = this.LIZ;
            if (l != null && jElapsedRealtime - l.longValue() <= 10000) {
                int i = this.LIZIZ;
                if (i >= 2) {
                    return;
                } else {
                    this.LIZIZ = i + 1;
                }
            } else {
                this.LIZ = Long.valueOf(jElapsedRealtime);
                this.LIZIZ = 1;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("aid", str).putOpt("method_cost_time_ms", Long.valueOf(j)).putOpt("index", num);
            AwS412S0200000_11 awS412S0200000_11 = new AwS412S0200000_11(this, jSONObject, 104);
            C786410Ut5.f3(new C512801zC(awS412S0200000_11, 1), Looper.getMainLooper().getQueue());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getEventName());
            sbLIZ.append(" ---> ");
            sbLIZ.append(jSONObject);
            C0S9H.LIZ(this, C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
