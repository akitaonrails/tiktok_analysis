package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1BFP, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BFP {
    public static final C1BFT LIZ;

    static {
        C1BFT c1bft;
        try {
            SystemClock.elapsedRealtimeNanos();
            c1bft = new C1BFT() { // from class: X.1BFQ
                @Override // X.C1BFT
                public final long LIZ() {
                    return SystemClock.elapsedRealtimeNanos();
                }
            };
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            SystemClock.elapsedRealtime();
            c1bft = new C1BFT() { // from class: X.1BFR
                @Override // X.C1BFT
                public final long LIZ() {
                    return SystemClock.elapsedRealtime() * 1000000;
                }
            };
        }
        LIZ = c1bft;
    }
}
