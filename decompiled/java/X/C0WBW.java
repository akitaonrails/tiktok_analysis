package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0WBW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WBW {
    public static volatile C0WBW LIZIZ;
    public final Set<AbstractC819100WBg> LIZ = new HashSet();

    public final Set<AbstractC819100WBg> LIZ() {
        Set<AbstractC819100WBg> setUnmodifiableSet;
        synchronized (this.LIZ) {
            try {
                setUnmodifiableSet = Collections.unmodifiableSet(this.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return setUnmodifiableSet;
    }
}
