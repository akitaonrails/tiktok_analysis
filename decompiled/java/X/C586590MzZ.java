package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0MzZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C586590MzZ {
    public static volatile C586590MzZ LIZJ;
    public final CopyOnWriteArraySet<String> LIZ = new CopyOnWriteArraySet<>();
    public final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();

    public static C586590MzZ LIZ() {
        if (LIZJ == null) {
            synchronized (C586590MzZ.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C586590MzZ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }
}
