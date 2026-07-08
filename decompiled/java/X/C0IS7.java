package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0IS7, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IS7<K, V> {
    public final Function2<K, V, Unit> LIZ = null;
    public final Object LIZIZ = new Object();
    public final C0IS8 LIZJ = new C0IS8(this, false);

    public final List<K> LIZJ() {
        ArrayList arrayList;
        synchronized (this.LIZIZ) {
            try {
                arrayList = new ArrayList(this.LIZJ.keySet());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return arrayList;
    }

    public final boolean LIZ(K k) {
        boolean zContainsKey;
        synchronized (this.LIZIZ) {
            try {
                zContainsKey = this.LIZJ.containsKey(k);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zContainsKey;
    }

    public final V LIZIZ(K k) {
        V v;
        synchronized (this.LIZIZ) {
            try {
                v = (V) this.LIZJ.get(k);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return v;
    }

    public final void LJ(Object obj) {
        synchronized (this.LIZIZ) {
            try {
                this.LIZJ.remove(obj);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZLLL(Object obj, C465120ILu c465120ILu) {
        synchronized (this.LIZIZ) {
            try {
                this.LIZJ.put(obj, c465120ILu);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
