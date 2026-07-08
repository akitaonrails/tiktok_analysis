package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: X.09Q8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09Q8 {
    public static volatile C09Q8 LJ;
    public ScheduledFuture<?> LIZIZ;
    public final ScheduledExecutorService LIZ = C2126108Up.LIZLLL;
    public final CopyOnWriteArrayList<C09QB> LIZJ = new CopyOnWriteArrayList<>();
    public long LIZLLL = Mp4ScreenVideoLoadTimeout.CONTROL;

    public static C09Q8 LIZ() {
        if (LJ == null) {
            synchronized (C09Q8.class) {
                try {
                    if (LJ == null) {
                        LJ = new C09Q8();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJ;
    }
}
