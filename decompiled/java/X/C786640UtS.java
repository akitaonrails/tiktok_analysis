package X;

import android.os.Process;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0UtS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C786640UtS {
    public static final int LIZ() {
        try {
            int iMyTid = Process.myTid();
            try {
                int threadPriority = Process.getThreadPriority(iMyTid);
                if (threadPriority != -20) {
                    Process.setThreadPriority(iMyTid, -20);
                    return threadPriority;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return LSPassThroughRecordSizeConfig.DEFAULT;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        return LSPassThroughRecordSizeConfig.DEFAULT;
    }

    public static final void LIZIZ(int i) {
        if (i != 1000) {
            try {
                int iMyTid = Process.myTid();
                if (i != 1000) {
                    try {
                        Process.setThreadPriority(iMyTid, i);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }
}
