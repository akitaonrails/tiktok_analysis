package X;

import android.os.Handler;
import com.bytedance.applog.AppLog;
import com.ss.android.ugc.aweme.flush.LiveAppLogFlushExp;

/* JADX INFO: renamed from: X.1AE7, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AE7 implements Runnable {
    public static final C1AE7 LL = new C1AE7();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LiveAppLogFlushManager@944f.flushRunnable$1");
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - C1AE5.LIZIZ;
            LiveAppLogFlushExp.LIZ.getClass();
            if (j > LiveAppLogFlushExp.LIZ().freqCtrTimeSec * 1000) {
                C1AE5.LIZIZ = jCurrentTimeMillis;
                C1AE5.LIZ.getClass();
                C786410Ut5.LJJZZIII((Handler) C1AE5.LIZLLL.getValue(), new Runnable() { // from class: X.1AE8
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ2;
                        C1C7U.LIZ("LiveAppLogFlushManager@944f.flushRunnable$1$1");
                        try {
                            AppLog.flushAsync();
                        } finally {
                            if (!zLIZ2) {
                            }
                        }
                        C1C7U.LIZIZ("LiveAppLogFlushManager@944f.flushRunnable$1$1");
                    }
                });
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveAppLogFlushManager@944f.flushRunnable$1");
    }
}
