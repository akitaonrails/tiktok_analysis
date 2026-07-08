package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Bl0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2214001Bl0<K, T> {
    public final int LIZ = 16;
    public final ConcurrentHashMap<K, C2214001Bl0<K, T>.a> LIZIZ = new ConcurrentHashMap<>();
    public final ReentrantReadWriteLock LIZJ = new ReentrantReadWriteLock();
    public final C2214001Bl0<K, T>.a LIZLLL;
    public final C2214001Bl0<K, T>.a LJ;

    public final ArrayList LIZIZ() {
        this.LIZJ.readLock().lock();
        try {
            ArrayList arrayList = new ArrayList();
            int size = 16 >= this.LIZIZ.size() ? this.LIZIZ.size() : 16;
            C2214001Bl0<K, T>.a aVar = this.LJ.LIZLLL;
            for (int i = 0; i < size; i++) {
                if (Intrinsics.LJFF(aVar, this.LIZLLL)) {
                    break;
                }
                T t = aVar != null ? aVar.LIZIZ : null;
                if (t == null) {
                    break;
                }
                arrayList.add(t);
                aVar = aVar != null ? aVar.LIZLLL : null;
            }
            this.LIZJ.readLock().unlock();
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.readLock().unlock();
            throw th;
        }
    }

    public C2214001Bl0() {
        C2214001Bl0<K, T>.a aVar = new a(null, null);
        this.LIZLLL = aVar;
        C2214001Bl0<K, T>.a aVar2 = new a(null, null);
        this.LJ = aVar2;
        aVar.LIZJ = aVar2;
        aVar2.LIZLLL = aVar;
    }

    public final T LIZ(K k) {
        C2214001Bl0<K, T>.a aVar;
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

    /* JADX INFO: renamed from: X.1Bl0$a */
    public final class a {
        public final K LIZ;
        public final T LIZIZ;
        public C2214001Bl0<K, T>.a LIZJ;
        public C2214001Bl0<K, T>.a LIZLLL;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, Object obj2) {
            this.LIZ = obj;
            this.LIZIZ = obj2;
        }
    }
}
