package X;

import Y.ARunnableS82S0200000_13;
import android.os.SystemClock;
import com.bytedance.pumbaa.utility.worker.PumbaaWorkerThread;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WRT, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WRT {
    public final long LIZ = SystemClock.elapsedRealtimeNanos();
    public final JSONObject LIZIZ;
    public final JSONObject LIZJ;
    public final boolean LIZLLL;

    public final void LIZIZ() throws JSONException {
        if (this.LIZLLL) {
            this.LIZJ.put("total_cost", (SystemClock.elapsedRealtimeNanos() - this.LIZ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            JSONObject jSONObject = this.LIZIZ;
            C786410Ut5.LJJZZIII(PumbaaWorkerThread.getHandler(), new ARunnableS82S0200000_13(this.LIZJ, jSONObject, 85));
        }
    }

    public C0WRT(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        this.LIZIZ = jSONObject;
        this.LIZJ = new JSONObject();
        this.LIZLLL = C823240WRe.LIZ().LIZ(str);
        jSONObject.put("event_name", str);
        jSONObject.put("sdk_version", "6.22.0.1-bugfix");
    }

    public final void LIZ(long j, String str) throws JSONException {
        if (!this.LIZLLL) {
            return;
        }
        this.LIZJ.put(str, j);
    }
}
