package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feature.info.MemoryFeatureInfo;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.0ooX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1487590ooX<T> {
    public final String LIZ;
    public final int LIZIZ;
    public final ConcurrentHashMap<String, T> LIZJ = new ConcurrentHashMap<>();
    public final ArrayList<String> LIZLLL = new ArrayList<>();
    public final ReentrantReadWriteLock LJ = new ReentrantReadWriteLock();

    public final T LIZ(String str) {
        if (str == null) {
            return null;
        }
        return this.LIZJ.get(str);
    }

    public C1487590ooX(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }

    public final void LIZJ(String str, MemoryFeatureInfo memoryFeatureInfo) {
        if (str != null && memoryFeatureInfo != null) {
            if (!this.LIZJ.containsKey(str)) {
                this.LIZJ.put(str, memoryFeatureInfo);
            }
            this.LJ.writeLock().lock();
            try {
                if (!this.LIZLLL.contains(str)) {
                    this.LIZLLL.add(str);
                }
                if (this.LIZLLL.size() > this.LIZIZ && this.LIZLLL.size() > 0) {
                    String str2 = this.LIZLLL.get(0);
                    this.LIZLLL.remove(0);
                    this.LIZJ.remove(str2);
                }
                this.LJ.writeLock().unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LJ.writeLock().unlock();
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList<T> LIZIZ(int r7, java.lang.String r8, boolean r9) {
        /*
            r6 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r6.LJ
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            java.util.ArrayList<java.lang.String> r0 = r6.LIZLLL     // Catch: java.lang.Throwable -> L69
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L69
            int r5 = r1 + (-1)
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto L29
            java.util.ArrayList<java.lang.String> r0 = r6.LIZLLL     // Catch: java.lang.Throwable -> L69
            boolean r0 = X.C13LP.LJJJJ(r8, r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L29
            java.util.ArrayList<java.lang.String> r0 = r6.LIZLLL     // Catch: java.lang.Throwable -> L69
            int r5 = r0.indexOf(r8)     // Catch: java.lang.Throwable -> L69
            if (r9 == 0) goto L29
            int r5 = r5 + (-1)
        L29:
            r4 = 0
            if (r5 < 0) goto L5f
            if (r5 >= r1) goto L5f
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L69
            r3.<init>()     // Catch: java.lang.Throwable -> L69
            int r2 = r7 + (-1)
        L35:
            r0 = -1
            if (r0 >= r2) goto L55
            if (r5 < 0) goto L3b
            goto L3d
        L3b:
            r0 = r4
            goto L4d
        L3d:
            java.util.ArrayList<java.lang.String> r0 = r6.LIZLLL     // Catch: java.lang.Throwable -> L69
            java.lang.Object r1 = r0.get(r5)     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L3b
            java.util.concurrent.ConcurrentHashMap<java.lang.String, T> r0 = r6.LIZJ     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L69
        L4d:
            int r5 = r5 + (-1)
            r3.add(r0)     // Catch: java.lang.Throwable -> L69
            int r2 = r2 + (-1)
            goto L35
        L55:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r6.LJ
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.unlock()
            return r3
        L5f:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r6.LJ
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.unlock()
            return r4
        L69:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L69
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r6.LJ
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1487590ooX.LIZIZ(int, java.lang.String, boolean):java.util.ArrayList");
    }
}
