package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0NBs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C589900NBs<T> {
    public final List<T> LIZ = new ArrayList();
    public final List<T> LIZIZ = new ArrayList();
    public final List<T> LIZJ = new ArrayList();

    public final List<T> LIZ() {
        if (((ArrayList) this.LIZIZ).size() > 0) {
            synchronized (this) {
                try {
                    for (Object obj : (ArrayList) this.LIZIZ) {
                        if (!((ArrayList) this.LIZ).contains(obj)) {
                            ((ArrayList) this.LIZ).add(obj);
                        }
                    }
                    ((ArrayList) this.LIZIZ).clear();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        if (((ArrayList) this.LIZJ).size() > 0) {
            synchronized (this) {
                try {
                    for (Object obj2 : (ArrayList) this.LIZJ) {
                        if (!((ArrayList) this.LIZ).contains(obj2)) {
                            ((ArrayList) this.LIZ).add(obj2);
                        }
                    }
                    ((ArrayList) this.LIZJ).clear();
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        return this.LIZ;
    }

    public final void LIZIZ(T t) {
        if (t == null) {
            return;
        }
        synchronized (this) {
            try {
                ((ArrayList) this.LIZIZ).add(t);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZJ(T t) {
        if (t == null) {
            return;
        }
        synchronized (this) {
            try {
                ((ArrayList) this.LIZJ).add(t);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
