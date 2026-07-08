package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0V52, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V52 {
    public static volatile C0V52 LIZIZ;
    public final CopyOnWriteArraySet<C0V5P> LIZ = new CopyOnWriteArraySet<>();

    public static C0V52 LIZ() {
        if (LIZIZ == null) {
            synchronized (C0V52.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C0V52();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }
}
