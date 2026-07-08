package X;

import android.util.SparseArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1B7O, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B7O {
    public static volatile C1B7O LIZJ;
    public final SparseArray<Long> LIZ = new SparseArray<>();
    public final SparseArray<C1B7P> LIZIZ = new SparseArray<>();

    public static C1B7O LIZ() {
        if (LIZJ == null) {
            synchronized (C1B7O.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C1B7O();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public final C1B7P LIZIZ(int i) {
        C1B7P c1b7p;
        if (i == 0) {
            return null;
        }
        synchronized (this.LIZIZ) {
            try {
                c1b7p = this.LIZIZ.get(i);
                if (c1b7p != null) {
                    this.LIZIZ.remove(i);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c1b7p;
    }
}
