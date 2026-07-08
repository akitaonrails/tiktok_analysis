package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.139M, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C139M<K, V> {
    public C139M<K, V>.a LIZIZ;
    public C139M<K, V>.a LIZJ;
    public final Map<K, C139M<K, V>.a> LIZ = new LinkedHashMap();
    public final ReentrantLock LIZLLL = new ReentrantLock();

    public final void LIZ(C139M<K, V>.a aVar) {
        aVar.LIZJ = null;
        C139M<K, V>.a aVar2 = this.LIZIZ;
        aVar.LIZLLL = aVar2;
        if (aVar2 != null) {
            aVar2.LIZJ = aVar;
        }
        this.LIZIZ = aVar;
        if (this.LIZJ == null) {
            this.LIZJ = aVar;
        }
    }

    public final V LIZIZ(K k) {
        ReentrantLock reentrantLock = this.LIZLLL;
        reentrantLock.lock();
        try {
            C139M<K, V>.a aVar = (a) ((LinkedHashMap) this.LIZ).get(k);
            if (aVar == null) {
                reentrantLock.unlock();
                return null;
            }
            LIZLLL(aVar);
            LIZ(aVar);
            V v = aVar.LIZIZ;
            reentrantLock.unlock();
            return v;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void LIZLLL(C139M<K, V>.a aVar) {
        C139M<K, V>.a aVar2 = aVar.LIZJ;
        C139M<K, V>.a aVar3 = aVar.LIZLLL;
        if (aVar2 != null) {
            aVar2.LIZLLL = aVar3;
        } else {
            this.LIZIZ = aVar3;
        }
        if (aVar3 != null) {
            aVar3.LIZJ = aVar2;
        } else {
            this.LIZJ = aVar2;
        }
    }

    /* JADX INFO: renamed from: X.139M$a */
    public final class a {
        public final K LIZ;
        public V LIZIZ;
        public C139M<K, V>.a LIZJ;
        public C139M<K, V>.a LIZLLL;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, Object obj2) {
            this.LIZ = obj;
            this.LIZIZ = obj2;
        }
    }

    public final void LIZJ(K k, V v) {
        C139M<K, V>.a aVar;
        ReentrantLock reentrantLock = this.LIZLLL;
        reentrantLock.lock();
        try {
            C139M<K, V>.a aVar2 = (a) ((LinkedHashMap) this.LIZ).get(k);
            if (aVar2 != null) {
                aVar2.LIZIZ = v;
                LIZLLL(aVar2);
                LIZ(aVar2);
            } else {
                C139M<K, V>.a aVar3 = new a(k, v);
                this.LIZ.put(k, aVar3);
                LIZ(aVar3);
                if (this.LIZ.size() > 100 && (aVar = this.LIZJ) != null) {
                    LIZLLL(aVar);
                    this.LIZ.remove(aVar.LIZ);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }
}
