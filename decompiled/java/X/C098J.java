package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.098J, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C098J<K, V> implements InterfaceC470710Id3<K, V> {
    public final C2093008Hw LIZ;
    public final int LIZIZ;
    public int LIZJ;

    public final synchronized void LIZIZ() {
        LIZJ(-1);
    }

    @Override // X.InterfaceC470710Id3
    public final C11NZ LLLLLLIL() {
        return null;
    }

    public final synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        C2093008Hw c2093008Hw = this.LIZ;
        if (c2093008Hw != null) {
            for (Map.Entry<K, V> entry : c2093008Hw.entrySet()) {
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
                sb.append(",");
            }
        }
        sb.append("maxMemory=");
        sb.append(this.LIZIZ);
        sb.append(",");
        sb.append("memorySize=");
        sb.append(this.LIZJ);
        return sb.toString();
    }

    public C098J() {
        this(8);
    }

    public C098J(int i) {
        if (i > 0) {
            try {
                this.LIZ = new C2093008Hw(i);
                this.LIZIZ = i;
                return;
            } catch (OutOfMemoryError e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ = new C2093008Hw(10);
                this.LIZIZ = 10;
                return;
            }
        }
        throw new IllegalArgumentException("capacity <= 0");
    }

    @Override // X.InterfaceC470710Id3
    public final void LIZ(K k) {
        synchronized (this) {
            try {
                C2093008Hw c2093008Hw = this.LIZ;
                if (c2093008Hw != null && c2093008Hw.remove(k) != null) {
                    this.LIZJ--;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZJ(int i) {
        C2093008Hw c2093008Hw;
        while (this.LIZJ > i && (c2093008Hw = this.LIZ) != null && !c2093008Hw.isEmpty()) {
            if (this.LIZJ >= 0 && (!this.LIZ.isEmpty() || this.LIZJ == 0)) {
                Map.Entry<K, V> next = this.LIZ.entrySet().iterator().next();
                this.LIZ.remove(next.getKey());
                int i2 = this.LIZJ;
                next.getValue();
                this.LIZJ = i2 - 1;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C098J.class.getName());
                sbLIZ.append(".getValueSize() is reporting inconsistent results");
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    @Override // X.InterfaceC470710Id3
    public final V get(K k) {
        V v;
        synchronized (this) {
            try {
                C2093008Hw c2093008Hw = this.LIZ;
                if (c2093008Hw != null) {
                    v = c2093008Hw.get(k);
                } else {
                    v = null;
                }
                if (v == null) {
                    return null;
                }
                return v;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC470710Id3
    public final void put(K k, V v) {
        V vPut;
        synchronized (this) {
            try {
                C2093008Hw c2093008Hw = this.LIZ;
                if (c2093008Hw != null) {
                    vPut = c2093008Hw.put(k, v);
                } else {
                    vPut = null;
                }
                int i = this.LIZJ + 1;
                this.LIZJ = i;
                if (vPut != null) {
                    this.LIZJ = i - 1;
                }
                LIZJ(this.LIZIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
