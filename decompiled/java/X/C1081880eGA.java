package X;

import android.os.SystemClock;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eGA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1081880eGA {
    public long LIZIZ;
    public long LIZ = -1;
    public long LIZJ = -1;

    public static boolean LIZIZ() {
        return ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad();
    }

    public final void LIZ() {
        if (LIZIZ()) {
            if (this.LIZJ != -1) {
                this.LIZIZ = (this.LIZIZ + SystemClock.elapsedRealtime()) - this.LIZJ;
            }
            this.LIZJ = -1L;
        }
    }

    public final void LIZJ(DataChannel dataChannel) {
        LIZLLL("end");
        if (!LIZIZ() || this.LIZ == -1) {
            return;
        }
        long jElapsedRealtime = (SystemClock.elapsedRealtime() - this.LIZ) - this.LIZIZ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pad_landscape_play_duration");
        c474500IjALIZ.LJJIIZI(C2097908Jt.LIZJ(new Pair("duration", String.valueOf(jElapsedRealtime))));
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
    }

    public final void LIZLLL(String str) {
        if (!((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).o4()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", str);
            jSONObject.put("exp_status", LIZIZ());
            jSONObject.put("condition_status", LIZIZ());
            jSONObject.put("start_time", this.LIZ);
            jSONObject.put("current_time", SystemClock.elapsedRealtime());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1CC2.LJIIIIZZ("ttlive_client_pad_duration_monitor", 0, jSONObject);
    }
}
