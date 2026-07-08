package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0VLr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC796330VLr<T> extends AbstractC795470VIj {
    public abstract void bind(InterfaceC796340VLs interfaceC796340VLs, T t);

    public AbstractC796330VLr(AbstractC796540VMm abstractC796540VMm) {
        super(abstractC796540VMm);
    }

    public final void insert(Iterable<? extends T> iterable) {
        InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
        try {
            Iterator<? extends T> it2 = iterable.iterator();
            while (it2.hasNext()) {
                bind(interfaceC796340VLsAcquire, it2.next());
                interfaceC796340VLsAcquire.LJIL();
            }
            release(interfaceC796340VLsAcquire);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public final long insertAndReturnId(T t) {
        InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
        try {
            bind(interfaceC796340VLsAcquire, t);
            long jLJIL = interfaceC796340VLsAcquire.LJIL();
            release(interfaceC796340VLsAcquire);
            return jLJIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public final long[] insertAndReturnIdsArray(Collection<? extends T> collection) {
        InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
        try {
            long[] jArr = new long[collection.size()];
            Iterator<? extends T> it2 = collection.iterator();
            int i = 0;
            while (it2.hasNext()) {
                bind(interfaceC796340VLsAcquire, it2.next());
                jArr[i] = interfaceC796340VLsAcquire.LJIL();
                i++;
            }
            release(interfaceC796340VLsAcquire);
            return jArr;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection<? extends T> collection) {
        InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
        try {
            Long[] lArr = new Long[collection.size()];
            Iterator<? extends T> it2 = collection.iterator();
            int i = 0;
            while (it2.hasNext()) {
                bind(interfaceC796340VLsAcquire, it2.next());
                lArr[i] = Long.valueOf(interfaceC796340VLsAcquire.LJIL());
                i++;
            }
            release(interfaceC796340VLsAcquire);
            return lArr;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public final List<Long> insertAndReturnIdsList(Collection<? extends T> collection) {
        InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
        try {
            ArrayList arrayList = new ArrayList(collection.size());
            Iterator<? extends T> it2 = collection.iterator();
            int i = 0;
            while (it2.hasNext()) {
                bind(interfaceC796340VLsAcquire, it2.next());
                arrayList.add(i, Long.valueOf(interfaceC796340VLsAcquire.LJIL()));
                i++;
            }
            release(interfaceC796340VLsAcquire);
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public final void insert(T[] tArr) {
        InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
        try {
            for (T t : tArr) {
                bind(interfaceC796340VLsAcquire, t);
                interfaceC796340VLsAcquire.LJIL();
            }
            release(interfaceC796340VLsAcquire);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public final long[] insertAndReturnIdsArray(T[] tArr) {
        InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
        try {
            long[] jArr = new long[tArr.length];
            int i = 0;
            for (T t : tArr) {
                bind(interfaceC796340VLsAcquire, t);
                jArr[i] = interfaceC796340VLsAcquire.LJIL();
                i++;
            }
            release(interfaceC796340VLsAcquire);
            return jArr;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(T[] tArr) {
        InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
        try {
            Long[] lArr = new Long[tArr.length];
            int i = 0;
            for (T t : tArr) {
                bind(interfaceC796340VLsAcquire, t);
                lArr[i] = Long.valueOf(interfaceC796340VLsAcquire.LJIL());
                i++;
            }
            release(interfaceC796340VLsAcquire);
            return lArr;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public final List<Long> insertAndReturnIdsList(T[] tArr) {
        InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
        try {
            ArrayList arrayList = new ArrayList(tArr.length);
            int i = 0;
            for (T t : tArr) {
                bind(interfaceC796340VLsAcquire, t);
                arrayList.add(i, Long.valueOf(interfaceC796340VLsAcquire.LJIL()));
                i++;
            }
            release(interfaceC796340VLsAcquire);
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    public final void insert(T t) {
        InterfaceC796340VLs interfaceC796340VLsAcquire = acquire();
        try {
            bind(interfaceC796340VLsAcquire, t);
            interfaceC796340VLsAcquire.LJIL();
            release(interfaceC796340VLsAcquire);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            release(interfaceC796340VLsAcquire);
            throw th;
        }
    }
}
