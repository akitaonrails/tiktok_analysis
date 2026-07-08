package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0NmG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C603820NmG<K, V> {
    public final int LIZ;
    public final C603830NmH<K, V> LIZIZ;
    public final C603810NmF LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;

    public V LIZ(K k) {
        return null;
    }

    public void LIZIZ(Object obj, Object obj2, Object obj3) {
    }

    public int LJII(K k, V v) {
        return 1;
    }

    public final int LJI() {
        int i;
        synchronized (this.LIZJ) {
            try {
                i = this.LIZLLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<K, V> LJIIIIZZ() {
        LinkedHashMap linkedHashMap;
        synchronized (this.LIZJ) {
            try {
                linkedHashMap = new LinkedHashMap(this.LIZIZ.LIZ.entrySet().size());
                Iterator<T> it2 = this.LIZIZ.LIZ.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return linkedHashMap;
    }

    public final String toString() {
        String strLIZIZ;
        synchronized (this.LIZJ) {
            try {
                int i = this.LJ;
                int i2 = this.LJFF + i;
                int i3 = i2 != 0 ? (i * 100) / i2 : 0;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LruCache[maxSize=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(",hits=");
                sbLIZ.append(this.LJ);
                sbLIZ.append(",misses=");
                sbLIZ.append(this.LJFF);
                sbLIZ.append(",hitRate=");
                sbLIZ.append(i3);
                sbLIZ.append("%]");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return strLIZIZ;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0NmF] */
    public C603820NmG(int i) {
        this.LIZ = i;
        if (i > 0) {
            this.LIZIZ = new C603830NmH<>();
            this.LIZJ = new Object() { // from class: X.0NmF
            };
        } else {
            C19968313Az.LIZ("maxSize <= 0");
            throw null;
        }
    }

    public final V LIZJ(K k) {
        V vPut;
        synchronized (this.LIZJ) {
            try {
                V v = this.LIZIZ.LIZ.get(k);
                if (v != null) {
                    this.LJ++;
                    return v;
                }
                this.LJFF++;
                V vLIZ = LIZ(k);
                if (vLIZ == null) {
                    return null;
                }
                synchronized (this.LIZJ) {
                    try {
                        vPut = this.LIZIZ.LIZ.put(k, vLIZ);
                        if (vPut != null) {
                            this.LIZIZ.LIZ.put(k, vPut);
                        } else {
                            this.LIZLLL += LJFF(k, vLIZ);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                if (vPut != null) {
                    LIZIZ(k, vLIZ, vPut);
                    return vPut;
                }
                LJIIIZ(this.LIZ);
                return vLIZ;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public final V LJ(K k) {
        V vRemove;
        synchronized (this.LIZJ) {
            try {
                vRemove = this.LIZIZ.LIZ.remove(k);
                if (vRemove != null) {
                    this.LIZLLL -= LJFF(k, vRemove);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (vRemove != null) {
            LIZIZ(k, vRemove, null);
        }
        return vRemove;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(int r6) {
        /*
            r5 = this;
        L0:
            X.0NmF r4 = r5.LIZJ
            monitor-enter(r4)
            int r0 = r5.LIZLLL     // Catch: java.lang.Throwable -> L5e
            if (r0 < 0) goto L56
            X.0NmH<K, V> r0 = r5.LIZIZ     // Catch: java.lang.Throwable -> L5e
            java.util.LinkedHashMap<K, V> r0 = r0.LIZ     // Catch: java.lang.Throwable -> L5e
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L15
            int r0 = r5.LIZLLL     // Catch: java.lang.Throwable -> L5e
            if (r0 != 0) goto L56
        L15:
            int r0 = r5.LIZLLL     // Catch: java.lang.Throwable -> L5e
            if (r0 <= r6) goto L54
            X.0NmH<K, V> r0 = r5.LIZIZ     // Catch: java.lang.Throwable -> L5e
            java.util.LinkedHashMap<K, V> r0 = r0.LIZ     // Catch: java.lang.Throwable -> L5e
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L5e
            if (r0 != 0) goto L54
            X.0NmH<K, V> r0 = r5.LIZIZ     // Catch: java.lang.Throwable -> L5e
            java.util.LinkedHashMap<K, V> r0 = r0.LIZ     // Catch: java.lang.Throwable -> L5e
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r0 = X.C13LP.LJJJLIIL(r0)     // Catch: java.lang.Throwable -> L5e
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L5e
            if (r0 != 0) goto L34
            goto L52
        L34:
            java.lang.Object r3 = r0.getKey()     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r2 = r0.getValue()     // Catch: java.lang.Throwable -> L5e
            X.0NmH<K, V> r0 = r5.LIZIZ     // Catch: java.lang.Throwable -> L5e
            java.util.LinkedHashMap<K, V> r0 = r0.LIZ     // Catch: java.lang.Throwable -> L5e
            r0.remove(r3)     // Catch: java.lang.Throwable -> L5e
            int r1 = r5.LIZLLL     // Catch: java.lang.Throwable -> L5e
            int r0 = r5.LJFF(r3, r2)     // Catch: java.lang.Throwable -> L5e
            int r1 = r1 - r0
            r5.LIZLLL = r1     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r4)
            r0 = 0
            r5.LIZIZ(r3, r2, r0)
            goto L0
        L52:
            monitor-exit(r4)
            return
        L54:
            monitor-exit(r4)
            return
        L56:
            java.lang.String r1 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L5e
            throw r0     // Catch: java.lang.Throwable -> L5e
        L5e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C603820NmG.LJIIIZ(int):void");
    }

    public final V LIZLLL(K k, V v) {
        V vPut;
        synchronized (this.LIZJ) {
            try {
                this.LIZLLL += LJFF(k, v);
                vPut = this.LIZIZ.LIZ.put(k, v);
                if (vPut != null) {
                    this.LIZLLL -= LJFF(k, vPut);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (vPut != null) {
            LIZIZ(k, vPut, v);
        }
        LJIIIZ(this.LIZ);
        return vPut;
    }

    public final int LJFF(K k, V v) {
        int iLJII = LJII(k, v);
        if (iLJII >= 0) {
            return iLJII;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Negative size: ");
        sbLIZ.append(k);
        sbLIZ.append('=');
        sbLIZ.append(v);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
