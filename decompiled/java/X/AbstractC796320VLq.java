package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0VLq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC796320VLq<T> extends AbstractC795470VIj {
    public abstract void bind(InterfaceC796340VLs interfaceC796340VLs, T t);

    @Override // X.AbstractC795470VIj
    public abstract String createQuery();

    public AbstractC796320VLq(AbstractC796540VMm abstractC796540VMm) {
        super(abstractC796540VMm);
    }

    public final int handle(T t) {
        InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
        try {
            bind(interfaceC796340VLsAcquire, t);
            int iLJIIL = interfaceC796340VLsAcquire.LJIIL();
            release(interfaceC796340VLsAcquire);
            return iLJIIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public final int handleMultiple(Iterable<? extends T> iterable) {
        InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
        try {
            Iterator<? extends T> it2 = iterable.iterator();
            int iLJIIL = 0;
            while (it2.hasNext()) {
                bind(interfaceC796340VLsAcquire, it2.next());
                iLJIIL += interfaceC796340VLsAcquire.LJIIL();
            }
            release(interfaceC796340VLsAcquire);
            return iLJIIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public final int handleMultiple(T[] tArr) {
        InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
        try {
            int iLJIIL = 0;
            for (T t : tArr) {
                bind(interfaceC796340VLsAcquire, t);
                iLJIIL += interfaceC796340VLsAcquire.LJIIL();
            }
            release(interfaceC796340VLsAcquire);
            return iLJIIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            release(interfaceC796340VLsAcquire);
            throw th;
        }
    }
}
