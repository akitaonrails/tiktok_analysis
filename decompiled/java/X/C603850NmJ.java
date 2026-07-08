package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS644S0100000_30;

/* JADX INFO: renamed from: X.0NmJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C603850NmJ<K, V> {
    public final LinkedHashMap<K, V> LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public final int LJ;
    public final Function2<K, V, Boolean> LJFF;
    public final Function2<K, V, Unit> LJI;

    public final synchronized String toString() {
        StringBuilder sbLIZ;
        int i = this.LIZJ;
        int i2 = this.LIZLLL + i;
        int i3 = i2 != 0 ? (i * 100) / i2 : 0;
        sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LruCache[maxSize=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(",hits=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(",misses=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(",hitRate=");
        sbLIZ.append(i3);
        sbLIZ.append("%%]");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final V LIZ(K k) {
        new C259800zU();
        synchronized (this) {
            try {
                V v = this.LIZ.get(k);
                if (v != null) {
                    this.LIZJ++;
                    return v;
                }
                this.LIZLLL++;
                return null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append(X.C603850NmJ.class.getName());
        r1.append(".sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        throw new java.lang.IllegalStateException(X.C2188811AlT.LIZIZ(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L63
            if (r0 < 0) goto L47
            java.util.LinkedHashMap<K, V> r0 = r3.LIZ     // Catch: java.lang.Throwable -> L63
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L11
            int r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L63
            if (r0 != 0) goto L47
        L11:
            int r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L63
            if (r0 > r4) goto L16
            goto L43
        L16:
            java.util.LinkedHashMap<K, V> r0 = r3.LIZ     // Catch: java.lang.Throwable -> L63
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = X.C13LP.LJJJLIIL(r0)     // Catch: java.lang.Throwable -> L63
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L45
            java.lang.Object r2 = r0.getKey()     // Catch: java.lang.Throwable -> L63
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> L63
            java.util.LinkedHashMap<K, V> r0 = r3.LIZ     // Catch: java.lang.Throwable -> L63
            if (r2 != 0) goto L33
            kotlin.jvm.internal.Intrinsics.LJIIL()     // Catch: java.lang.Throwable -> L63
        L33:
            r0.remove(r2)     // Catch: java.lang.Throwable -> L63
            int r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L63
            if (r1 != 0) goto L3d
            kotlin.jvm.internal.Intrinsics.LJIIL()     // Catch: java.lang.Throwable -> L63
        L3d:
            int r0 = r0 + (-1)
            r3.LIZIZ = r0     // Catch: java.lang.Throwable -> L63
            monitor-exit(r3)
            goto L0
        L43:
            monitor-exit(r3)
            return
        L45:
            monitor-exit(r3)
            return
        L47:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L63
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L63
            java.lang.Class<X.0NmJ> r0 = X.C603850NmJ.class
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L63
            r1.append(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = ".sizeOf() is reporting inconsistent results!"
            r1.append(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L63
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L63
            throw r2     // Catch: java.lang.Throwable -> L63
        L63:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L63
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C603850NmJ.LIZJ(int):void");
    }

    public final void LIZIZ(K k, V v) {
        new C259800zU();
        synchronized (this) {
            try {
                this.LIZIZ++;
                if (this.LIZ.put(k, v) != null) {
                    this.LIZIZ--;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LIZJ(this.LJ);
    }

    public C603850NmJ(int i, AwS644S0100000_30 awS644S0100000_30, AwS644S0100000_30 awS644S0100000_302) {
        this.LJ = i;
        this.LJFF = awS644S0100000_30;
        this.LJI = awS644S0100000_302;
        if (i > 0) {
            this.LIZ = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
}
