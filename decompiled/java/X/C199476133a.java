package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.logging.Logger;

/* JADX INFO: renamed from: X.133a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199476133a {
    public final C199478133c LIZ = new Serializable() { // from class: X.133c
    };
    public final String LIZIZ;
    public volatile Logger LIZJ;

    public final Logger LIZ() {
        Logger logger = this.LIZJ;
        if (logger != null) {
            return logger;
        }
        synchronized (this.LIZ) {
            try {
                Logger logger2 = this.LIZJ;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.LIZIZ);
                this.LIZJ = logger3;
                return logger3;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.133c] */
    public C199476133a(Class cls) {
        this.LIZIZ = cls.getName();
    }
}
