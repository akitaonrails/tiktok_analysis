package X;

import android.text.TextUtils;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0osN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1489970osN implements InterfaceC1489890osF {
    public final C1490040osU LIZ = new C1490040osU();
    public String LIZIZ = "";
    public int LIZJ = LSPassThroughRecordSizeConfig.DEFAULT;
    public C1489900osG LIZLLL = null;

    @Override // X.InterfaceC1489890osF
    public Request LIZ(Request request) {
        return request;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0osG] */
    public void LJFF() {
        final long j = this.LIZJ;
        this.LIZLLL = new AbstractRunnableC1490020osS(j) { // from class: X.0osG
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TTHttpCallPriorityControl$BaseModeControl@1245.modeStart$1");
                try {
                    C1489880osE c1489880osELJ = C1489880osE.LJ();
                    c1489880osELJ.LJIIIIZZ((AbstractC1489970osN) ((ConcurrentHashMap) c1489880osELJ.LIZIZ).get(""));
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TTHttpCallPriorityControl$BaseModeControl@1245.modeStart$1");
            }
        };
        C1490010osR.LIZ(EnumC1490030osT.NETWORK).LIZIZ(this.LIZLLL);
    }

    public void LJI() {
        if (this.LIZLLL != null) {
            C1490010osR c1490010osRLIZ = C1490010osR.LIZ(EnumC1490030osT.NETWORK);
            C1489900osG c1489900osG = this.LIZLLL;
            c1490010osRLIZ.getClass();
            try {
                Runnable runnableRemove = c1490010osRLIZ.LIZIZ.remove(c1489900osG);
                if (runnableRemove != null) {
                    c1490010osRLIZ.LIZLLL.remove(runnableRemove);
                }
                ScheduledFuture scheduledFutureRemove = c1490010osRLIZ.LIZ.remove(c1489900osG);
                if (scheduledFutureRemove != null) {
                    scheduledFutureRemove.cancel(true);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public EnumC1489930osJ LJII() {
        return EnumC1489930osJ.NOT_REACHED;
    }

    @Override // X.InterfaceC1489890osF
    public void LIZLLL(Request request) {
        C1490040osU c1490040osU = this.LIZ;
        if (request == null) {
            c1490040osU.getClass();
        } else {
            ((CopyOnWriteArraySet) c1490040osU.LIZIZ).remove(request);
            ((CopyOnWriteArraySet) c1490040osU.LJFF).remove(request);
        }
    }

    public boolean LJ(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("state_name", "");
        this.LIZIZ = strOptString;
        if (TextUtils.isEmpty(strOptString)) {
            return false;
        }
        jSONObject.optInt("state", -1);
        int i = LSPassThroughRecordSizeConfig.DEFAULT;
        int iOptInt = jSONObject.optInt("delay_disable_time_ms", LSPassThroughRecordSizeConfig.DEFAULT);
        this.LIZJ = iOptInt;
        if (iOptInt > 0) {
            i = iOptInt;
        }
        this.LIZJ = i;
        return true;
    }
}
