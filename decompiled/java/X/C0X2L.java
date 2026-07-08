package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0X2L, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X2L {
    public static boolean LIZ;
    public static final C822650WOx LIZIZ = new C822650WOx(1, 1, 0, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public static final C08JB LIZJ = new C08JB(C0X2J.LIZ().throughputSampleSize);
    public static final CopyOnWriteArraySet<C0X2M> LIZLLL = new CopyOnWriteArraySet<>();

    public static C0X4L LIZ() {
        int effectiveConnectionType;
        int iLIZIZ = -1;
        try {
            effectiveConnectionType = TTNetInit.getEffectiveConnectionType();
            try {
                iLIZIZ = LIZJ.LIZIZ();
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
            }
        } catch (Throwable th2) {
            th = th2;
            effectiveConnectionType = -1;
        }
        return new C0X4L(LIZ, effectiveConnectionType, iLIZIZ);
    }
}
