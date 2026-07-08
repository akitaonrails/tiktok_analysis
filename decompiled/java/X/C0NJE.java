package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0NJE, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NJE {
    public final ReentrantReadWriteLock LIZ = new ReentrantReadWriteLock();
    public final Map<String, Object> LIZIZ = new LinkedHashMap();
    public final C2252321DDq LIZJ = C1BNE.LIZ(C2097608Jq.LJ());
    public final C1DEV LIZLLL = C2191201ApK.LIZ();

    public final Object LIZ(String str) {
        ReentrantReadWriteLock.ReadLock lock = this.LIZ.readLock();
        lock.lock();
        try {
            Object obj = ((LinkedHashMap) this.LIZIZ).get(str);
            if (obj == null) {
                obj = null;
            }
            lock.unlock();
            return obj;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public final Object LIZIZ(Collection collection) {
        if (collection.isEmpty()) {
            return C2097608Jq.LJ();
        }
        ReentrantReadWriteLock.ReadLock lock = this.LIZ.readLock();
        lock.lock();
        try {
            HashMap map = new HashMap();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                Object obj = ((LinkedHashMap) this.LIZIZ).get(str);
                if (obj != null) {
                    map.put(str, obj);
                }
            }
            lock.unlock();
            return map;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C0NJF
            if (r0 == 0) goto L26
            r6 = r8
            X.0NJF r6 = (X.C0NJF) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r5 = r6.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r6.LLILZ
            r4 = 0
            r0 = 1
            if (r1 == 0) goto L34
            if (r1 != r0) goto L2c
            X.1DEV r3 = r6.LL
            X.C155000ia.LIZIZ(r5)
            goto L44
        L26:
            X.0NJF r6 = new X.0NJF
            r6.<init>(r7, r8)
            goto L12
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r5)
            X.1DEV r3 = r7.LIZLLL
            r6.LL = r3
            r6.LLILZ = r0
            java.lang.Object r0 = r3.LIZLLL(r4, r6)
            if (r0 != r2) goto L44
            return r2
        L44:
            X.1DDq r2 = r7.LIZJ     // Catch: java.lang.Throwable -> L69
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r7.LIZ     // Catch: java.lang.Throwable -> L69
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()     // Catch: java.lang.Throwable -> L69
            r1.lock()     // Catch: java.lang.Throwable -> L69
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.LIZIZ     // Catch: java.lang.Throwable -> L61
            java.util.Map r0 = X.C2097608Jq.LJIIZILJ(r0)     // Catch: java.lang.Throwable -> L61
            r1.unlock()     // Catch: java.lang.Throwable -> L69
            r2.setValue(r0)     // Catch: java.lang.Throwable -> L69
            r3.LIZIZ(r4)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L61:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L61
            r1.unlock()     // Catch: java.lang.Throwable -> L69
            throw r0     // Catch: java.lang.Throwable -> L69
        L69:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L69
            r3.LIZIZ(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NJE.LIZLLL(X.05Vn):java.lang.Object");
    }

    public final Object LIZJ(Map<String, ? extends Object> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        int readHoldCount;
        if (map.isEmpty()) {
            return Unit.LIZ;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.LIZ;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            readHoldCount = reentrantReadWriteLock.getReadHoldCount();
        } else {
            readHoldCount = 0;
        }
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.LIZIZ.putAll(map);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            Object objLIZLLL = LIZLLL(interfaceC1364105Vn);
            if (objLIZLLL == C099R.LJFF()) {
                return objLIZLLL;
            }
            return Unit.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }
}
