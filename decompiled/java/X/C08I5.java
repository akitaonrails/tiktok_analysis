package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: renamed from: X.08I5, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08I5<K, V> {
    public final LinkedHashMap<K, V> LIZ = new LinkedHashMap<>(0, 0.75f, true);
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append(X.C08I5.class.getName());
        r1.append(".sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        throw new java.lang.IllegalStateException(X.C2188811AlT.LIZIZ(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L61
            if (r0 < 0) goto L45
            java.util.LinkedHashMap<K, V> r0 = r3.LIZ     // Catch: java.lang.Throwable -> L61
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L11
            int r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L45
        L11:
            int r1 = r3.LIZIZ     // Catch: java.lang.Throwable -> L61
            r0 = 31
            if (r1 <= r0) goto L43
            java.util.LinkedHashMap<K, V> r0 = r3.LIZ     // Catch: java.lang.Throwable -> L61
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L43
            java.util.LinkedHashMap<K, V> r0 = r3.LIZ     // Catch: java.lang.Throwable -> L61
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L61
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L61
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L61
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L61
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L61
            r0.getValue()     // Catch: java.lang.Throwable -> L61
            java.util.LinkedHashMap<K, V> r0 = r3.LIZ     // Catch: java.lang.Throwable -> L61
            r0.remove(r1)     // Catch: java.lang.Throwable -> L61
            int r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L61
            int r0 = r0 + (-1)
            r3.LIZIZ = r0     // Catch: java.lang.Throwable -> L61
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L61
            goto L0
        L43:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L61
            return
        L45:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L61
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L61
            java.lang.Class<X.08I5> r0 = X.C08I5.class
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L61
            r1.append(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = ".sizeOf() is reporting inconsistent results!"
            r1.append(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L61
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L61
            throw r2     // Catch: java.lang.Throwable -> L61
        L61:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L61
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L61
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08I5.LIZJ():void");
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.LIZJ;
        i2 = this.LIZLLL + i;
        return C786410Ut5.k4(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{31, Integer.valueOf(this.LIZJ), Integer.valueOf(this.LIZLLL), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0)});
    }

    public final V LIZ(K k) {
        if (k != null) {
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
        throw new NullPointerException("key == null");
    }

    public final void LIZIZ(Object obj, C1603150rov c1603150rov) {
        if (obj != null) {
            synchronized (this) {
                try {
                    this.LIZIZ++;
                    if (this.LIZ.put(obj, c1603150rov) != null) {
                        this.LIZIZ--;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            LIZJ();
            return;
        }
        throw new NullPointerException("key == null || value == null");
    }
}
