package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.098K, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public abstract class C098K<K, V> {
    public final int LIZ;
    public final LinkedHashMap<K, V> LIZIZ;

    public final void LIZ() {
        synchronized (this) {
            try {
                this.LIZIZ.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C098K(int i) {
        this.LIZ = i;
        this.LIZIZ = new LinkedHashMap<>(i, 0.75f, true);
    }

    public final V LIZIZ(K k) {
        V v;
        synchronized (this) {
            try {
                v = this.LIZIZ.get(k);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return v;
    }

    public final void LIZLLL(K k) {
        synchronized (this) {
            try {
                this.LIZIZ.remove(k);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZJ(K k, V v) {
        synchronized (this) {
            try {
                this.LIZIZ.put(k, v);
                if (this.LIZIZ.size() > this.LIZ) {
                    this.LIZIZ.remove(this.LIZIZ.keySet().iterator().next());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
