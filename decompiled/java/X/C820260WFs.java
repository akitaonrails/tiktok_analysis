package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;

/* JADX INFO: renamed from: X.0WFs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820260WFs {
    public static volatile boolean LIZ;
    public static long LIZIZ;
    public static final IStrategyApi LIZJ = (IStrategyApi) PluggableExtentionKt.pluggableSpi(IStrategyApi.class);
    public static C788320UwA LIZLLL;

    public static long LIZ() {
        if (!LIZ || LIZIZ == 0) {
            long jElapsedRealtime = LIZIZ;
            if (jElapsedRealtime == 0) {
                jElapsedRealtime = SystemClock.elapsedRealtime();
            }
            long jElapsedRealtime2 = (jElapsedRealtime + 15000) - SystemClock.elapsedRealtime();
            if (jElapsedRealtime2 > 0) {
                return jElapsedRealtime2;
            }
        }
        return 0L;
    }
}
