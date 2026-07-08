package X;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: X.0TKI, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TKI {
    public static final ScheduledExecutorService LIZ = C807400Vlq.LJ();

    public static Future LIZ(Runnable runnable) {
        return LIZ.submit(runnable);
    }
}
