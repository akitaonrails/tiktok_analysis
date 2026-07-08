package X;

import J.N;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import com.ttnet.org.chromium.base.EarlyTraceEvent;
import com.ttnet.org.chromium.base.TraceEvent;

/* JADX INFO: renamed from: X.0p7M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1499260p7M extends C1499270p7N implements MessageQueue.IdleHandler {
    public long LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;

    public final void LIZJ() {
        if (TraceEvent.LLILLJJLI && !this.LLIZ) {
            this.LLILLJJLI = SystemClock.elapsedRealtime();
            C786410Ut5.f3(this, Looper.myQueue());
            this.LLIZ = true;
        } else {
            if (!this.LLIZ || TraceEvent.LLILLJJLI) {
                return;
            }
            Looper.myQueue().removeIdleHandler(this);
            this.LLIZ = false;
        }
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.LLILLJJLI == 0) {
            this.LLILLJJLI = jElapsedRealtime;
        }
        long j = jElapsedRealtime - this.LLILLJJLI;
        this.LLILZIL++;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(" tasks since last idle.");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        boolean z = TraceEvent.LLILLJJLI;
        EarlyTraceEvent.LIZ("Looper.queueIdle", false);
        if (TraceEvent.LLILLJJLI) {
            N.MajVTFsV("Looper.queueIdle", strLIZIZ);
        }
        if (j > 48) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.LLILZ);
            sbLIZ2.append(" tasks and ");
            sbLIZ2.append(this.LLILZIL);
            sbLIZ2.append(" idles processed so far, ");
            sbLIZ2.append(this.LLILZLL);
            sbLIZ2.append(" tasks bursted and ");
            sbLIZ2.append(j);
            sbLIZ2.append("ms elapsed since last idle");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            if (TraceEvent.LLILLJJLI) {
                N.Mz5qii_R("TraceEvent.LooperMonitor:IdleStats", strLIZIZ2);
            }
        }
        this.LLILLJJLI = jElapsedRealtime;
        this.LLILZLL = 0;
        return true;
    }

    @Override // X.C1499270p7N
    public final void LIZ(String str) {
        if (this.LLILZLL == 0) {
            boolean z = TraceEvent.LLILLJJLI;
            EarlyTraceEvent.LIZJ("Looper.queueIdle", false);
            if (TraceEvent.LLILLJJLI) {
                N.M5yUVmrW("Looper.queueIdle", null);
            }
        }
        this.LLILLL = SystemClock.elapsedRealtime();
        LIZJ();
        super.LIZ(str);
    }

    @Override // X.C1499270p7N
    public final void LIZIZ(String str) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLILLL;
        if (jElapsedRealtime > 16) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("observed a task that took ");
            sbLIZ.append(jElapsedRealtime);
            sbLIZ.append("ms: ");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (TraceEvent.LLILLJJLI) {
                N.Mz5qii_R("TraceEvent.LooperMonitor:IdleStats", strLIZIZ);
            }
        }
        super.LIZIZ(str);
        LIZJ();
        this.LLILZ++;
        this.LLILZLL++;
    }
}
