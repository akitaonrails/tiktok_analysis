package X;

import J.N;
import Y.ARunnableS98S0000000_23;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import com.ttnet.org.chromium.base.ThreadUtils;

/* JADX INFO: renamed from: X.0p76, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1499100p76 implements MessageQueue.IdleHandler {
    public static boolean LLILLJJLI;
    public static C1499100p76 LLILLL;
    public long LL;

    public static void LIZ() {
        if (ThreadUtils.LIZ().getLooper() != Looper.myLooper()) {
            C786410Ut5.LJJZZIII(ThreadUtils.LIZ(), new ARunnableS98S0000000_23(9));
            return;
        }
        if (!N.MpI7Xy5x()) {
            if (LLILLL == null || !LLILLJJLI) {
                return;
            }
            Looper.myQueue().removeIdleHandler(LLILLL);
            LLILLJJLI = false;
            return;
        }
        if (LLILLL == null) {
            LLILLL = new C1499100p76();
        }
        if (LLILLJJLI) {
            return;
        }
        C786410Ut5.f3(LLILLL, Looper.myQueue());
        LLILLJJLI = true;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.LL;
        if (j != 0 && jElapsedRealtime - j <= 1000) {
            return true;
        }
        this.LL = jElapsedRealtime;
        N.MgOuiubc();
        return true;
    }
}
