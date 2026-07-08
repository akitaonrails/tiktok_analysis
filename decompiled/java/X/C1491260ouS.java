package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ouS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1491260ouS<K, V> {
    public final ConcurrentHashMap<K, V> LIZ = new ConcurrentHashMap<>(64);
    public final C1491270ouT LIZIZ = new C1491270ouT(this);
    public final ReentrantReadWriteLock LIZJ = new ReentrantReadWriteLock();

    public final void LIZ(Function1<? super Map.Entry<? extends K, ? extends V>, Unit> function1) {
        try {
            this.LIZJ.readLock().tryLock(100L, TimeUnit.MILLISECONDS);
            try {
                Iterator<Map.Entry<Object, Object>> it2 = this.LIZIZ.entrySet().iterator();
                while (it2.hasNext()) {
                    function1.invoke(it2.next());
                }
                this.LIZJ.readLock().unlock();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZJ.readLock().unlock();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }

    public final V LIZIZ(K k) {
        try {
            this.LIZJ.readLock().tryLock(100L, TimeUnit.MILLISECONDS);
            try {
                V v = this.LIZ.get(k);
                this.LIZJ.readLock().unlock();
                return v;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZJ.readLock().unlock();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            V v2 = (V) new C098200Yq(th2);
            C189200o6.m2constructorimpl(v2);
            if (C189200o6.m7isFailureimpl(v2)) {
                return null;
            }
            return v2;
        }
    }

    public final void LIZLLL(Object obj) {
        Object c098200Yq;
        try {
            this.LIZJ.writeLock().tryLock(100L, TimeUnit.MILLISECONDS);
            try {
                this.LIZIZ.remove(obj);
                c098200Yq = this.LIZ.remove(obj);
                this.LIZJ.writeLock().unlock();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZJ.writeLock().unlock();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m7isFailureimpl(c098200Yq);
    }

    public final void LIZJ(Object obj, C1491290ouV c1491290ouV) {
        try {
            this.LIZJ.writeLock().tryLock(100L, TimeUnit.MILLISECONDS);
            try {
                if (this.LIZIZ.size() >= 64) {
                    Map.Entry<Object, Object> next = this.LIZIZ.entrySet().iterator().next();
                    this.LIZIZ.remove(next.getKey());
                    this.LIZ.remove(next.getKey());
                }
                this.LIZIZ.put(obj, c1491290ouV);
                this.LIZ.put(obj, c1491290ouV);
                this.LIZJ.writeLock().unlock();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZJ.writeLock().unlock();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }
}
