package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0pTi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1513120pTi<K, T> {
    public final int LIZ;
    public final ConcurrentHashMap<K, C1513120pTi<K, T>.a> LIZIZ = new ConcurrentHashMap<>();
    public final ReentrantReadWriteLock LIZJ = new ReentrantReadWriteLock();
    public final C1513120pTi<K, T>.a LIZLLL;
    public final C1513120pTi<K, T>.a LJ;

    public C1513120pTi(int i) {
        this.LIZ = i;
        C1513120pTi<K, T>.a aVar = new a(null, null);
        this.LIZLLL = aVar;
        C1513120pTi<K, T>.a aVar2 = new a(null, null);
        this.LJ = aVar2;
        aVar.LIZJ = aVar2;
        aVar2.LIZLLL = aVar;
    }

    public final T LIZ(K k) {
        C1513120pTi<K, T>.a aVar;
        this.LIZJ.readLock().lock();
        try {
            if (this.LIZIZ.containsKey(k) && (aVar = this.LIZIZ.get(k)) != null) {
                T t = aVar.LIZIZ;
                this.LIZJ.readLock().unlock();
                return t;
            }
            this.LIZJ.readLock().unlock();
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.readLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: X.0pTi$a */
    public final class a {
        public final K LIZ;
        public final T LIZIZ;
        public C1513120pTi<K, T>.a LIZJ;
        public C1513120pTi<K, T>.a LIZLLL;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, Object obj2) {
            this.LIZ = obj;
            this.LIZIZ = obj2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(Function1 function1, Object obj) {
        C1513120pTi<K, T>.a aVar;
        C1513120pTi<K, T>.a aVar2;
        T tLIZ = LIZ(obj);
        if (tLIZ == null) {
            Object objInvoke = function1.invoke(null);
            this.LIZJ.writeLock().lock();
            try {
                if (this.LIZIZ.containsKey(obj) && (aVar2 = this.LIZIZ.get(obj)) != null) {
                    C1513120pTi<K, T>.a aVar3 = aVar2.LIZJ;
                    C1513120pTi<K, T>.a aVar4 = aVar2.LIZLLL;
                    if (aVar3 != null && aVar4 != null) {
                        aVar4.LIZJ = aVar3;
                        aVar3.LIZLLL = aVar4;
                    }
                }
                C1513120pTi<K, T>.a aVar5 = new a(obj, objInvoke);
                C1513120pTi<K, T>.a aVar6 = this.LJ;
                C1513120pTi<K, T>.a aVar7 = aVar6.LIZLLL;
                if (aVar7 != null) {
                    aVar7.LIZJ = aVar5;
                    aVar5.LIZLLL = aVar7;
                    aVar5.LIZJ = aVar6;
                    aVar6.LIZLLL = aVar5;
                }
                this.LIZIZ.put(obj, aVar5);
                if (this.LIZIZ.size() > this.LIZ && (aVar = this.LIZLLL.LIZJ) != null) {
                    C1513120pTi<K, T>.a aVar8 = aVar.LIZJ;
                    C1513120pTi<K, T>.a aVar9 = aVar.LIZLLL;
                    if (aVar8 != null && aVar9 != null) {
                        aVar9.LIZJ = aVar8;
                        aVar8.LIZLLL = aVar9;
                    }
                    C19719512Dh.LIZJ(this.LIZIZ).remove(aVar.LIZ);
                }
                this.LIZJ.writeLock().unlock();
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZJ.writeLock().unlock();
                throw th;
            }
        }
        function1.invoke(tLIZ);
    }
}
