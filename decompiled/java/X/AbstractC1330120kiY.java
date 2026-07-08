package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0kiY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1330120kiY<T> {
    public final Set<T> LIZ = new HashSet();
    public final C1330130kiZ<T> LIZIZ = new C1330130kiZ<>();

    public final T LIZIZ() {
        T tPollLast;
        C1330130kiZ<T> c1330130kiZ = this.LIZIZ;
        synchronized (c1330130kiZ) {
            C1330140kia<T> c1330140kia = c1330130kiZ.LIZJ;
            if (c1330140kia == null) {
                tPollLast = null;
            } else {
                tPollLast = c1330140kia.LIZJ.pollLast();
                if (c1330140kia.LIZJ.isEmpty()) {
                    c1330130kiZ.LIZ(c1330140kia);
                    c1330130kiZ.LIZ.remove(c1330140kia.LIZIZ);
                }
            }
        }
        LIZ(tPollLast);
        return tPollLast;
    }

    public final void LIZ(Object obj) {
        if (obj != null) {
            synchronized (this) {
                try {
                    ((HashSet) this.LIZ).remove(obj);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
