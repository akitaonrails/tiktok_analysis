package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.08I6, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C08I6<K, V> {
    public final LinkedHashMap<K, V> LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;

    public void LIZ(Object obj, Object obj2, Object obj3) {
    }

    public final synchronized int LIZJ() {
        return this.LJ;
    }

    public final synchronized int LJFF() {
        return this.LIZIZ;
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.LIZLLL;
        i2 = this.LJ + i;
        return C786410Ut5.j4("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.LIZJ), Integer.valueOf(this.LIZLLL), Integer.valueOf(this.LJ), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0)});
    }

    public C08I6(int i) {
        if (i > 0) {
            this.LIZJ = i;
            this.LIZ = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final V LIZIZ(K k) {
        if (k != null) {
            synchronized (this) {
                try {
                    V v = this.LIZ.get(k);
                    if (v != null) {
                        this.LIZLLL++;
                        return v;
                    }
                    this.LJ++;
                    return null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        throw new NullPointerException("key == null");
    }

    public final void LJ(Object obj) {
        V vRemove;
        if (obj != null) {
            synchronized (this) {
                try {
                    vRemove = this.LIZ.remove(obj);
                    if (vRemove != null) {
                        this.LIZIZ--;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (vRemove != null) {
                LIZ(obj, vRemove, null);
                return;
            }
            return;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append(getClass().getName());
        r1.append(".sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        throw new java.lang.IllegalStateException(X.C2188811AlT.LIZIZ(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(int r5) {
        /*
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L7a
            if (r0 < 0) goto L5c
            java.util.LinkedHashMap<K, V> r0 = r4.LIZ     // Catch: java.lang.Throwable -> L7a
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L11
            int r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L7a
            if (r0 != 0) goto L5c
        L11:
            int r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L7a
            if (r0 <= r5) goto L5a
            java.util.LinkedHashMap<K, V> r0 = r4.LIZ     // Catch: java.lang.Throwable -> L7a
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7a
            if (r0 != 0) goto L5a
            java.util.LinkedHashMap<K, V> r0 = r4.LIZ     // Catch: java.lang.Throwable -> L7a
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L7a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L7a
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> L7a
            r3 = 0
            if (r0 == 0) goto L58
            java.util.LinkedHashMap<K, V> r0 = r4.LIZ     // Catch: java.lang.Throwable -> L7a
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L7a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L7a
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L58
            java.lang.Object r2 = r0.getKey()     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> L7a
            java.util.LinkedHashMap<K, V> r0 = r4.LIZ     // Catch: java.lang.Throwable -> L7a
            r0.remove(r2)     // Catch: java.lang.Throwable -> L7a
            int r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L7a
            int r0 = r0 + (-1)
            r4.LIZIZ = r0     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7a
            r4.LIZ(r2, r1, r3)
            goto L0
        L58:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7a
            return
        L5a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7a
            return
        L5c:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L7a
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L7a
            r1.append(r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = ".sizeOf() is reporting inconsistent results!"
            r1.append(r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L7a
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L7a
            throw r2     // Catch: java.lang.Throwable -> L7a
        L7a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08I6.LJI(int):void");
    }

    public final void LIZLLL(Object obj, Object obj2) {
        V vPut;
        if (obj != null && obj2 != null) {
            synchronized (this) {
                try {
                    this.LIZIZ++;
                    vPut = this.LIZ.put(obj, obj2);
                    if (vPut != null) {
                        this.LIZIZ--;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (vPut != null) {
                LIZ(obj, vPut, obj2);
            }
            LJI(this.LIZJ);
            return;
        }
        throw new NullPointerException("key == null || value == null");
    }
}
