package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.08Jp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2097508Jp<K, V> implements Map<K, V>, InterfaceC2095908Iz {
    public final ReentrantReadWriteLock LLILLJJLI = new ReentrantReadWriteLock();
    public final LinkedHashMap<K, V> LL = new LinkedHashMap<>();

    @Override // java.util.Map
    public final void clear() {
        int readHoldCount;
        ReentrantReadWriteLock reentrantReadWriteLock = this.LLILLJJLI;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            readHoldCount = reentrantReadWriteLock.getReadHoldCount();
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.unlock();
            }
        } else {
            readHoldCount = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.LL.clear();
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
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

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        ReentrantReadWriteLock.ReadLock lock = this.LLILLJJLI.readLock();
        lock.lock();
        try {
            Set<Map.Entry<K, V>> setEntrySet = new LinkedHashMap(this.LL).entrySet();
            lock.unlock();
            return setEntrySet;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        ReentrantReadWriteLock.ReadLock lock = this.LLILLJJLI.readLock();
        lock.lock();
        try {
            boolean zIsEmpty = this.LL.isEmpty();
            lock.unlock();
            return zIsEmpty;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        ReentrantReadWriteLock.ReadLock lock = this.LLILLJJLI.readLock();
        lock.lock();
        try {
            Set<K> setKeySet = new LinkedHashMap(this.LL).keySet();
            lock.unlock();
            return setKeySet;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    @Override // java.util.Map
    public final int size() {
        ReentrantReadWriteLock.ReadLock lock = this.LLILLJJLI.readLock();
        lock.lock();
        try {
            int size = this.LL.size();
            lock.unlock();
            return size;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        ReentrantReadWriteLock.ReadLock lock = this.LLILLJJLI.readLock();
        lock.lock();
        try {
            Collection<V> collectionValues = new LinkedHashMap(this.LL).values();
            lock.unlock();
            return collectionValues;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public final void LIZ(Function1<? super Map.Entry<? extends K, ? extends V>, Unit> function1) {
        int readHoldCount;
        ReentrantReadWriteLock reentrantReadWriteLock = this.LLILLJJLI;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            readHoldCount = reentrantReadWriteLock.getReadHoldCount();
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.unlock();
            }
        } else {
            readHoldCount = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            Iterator<Map.Entry<K, V>> it2 = this.LL.entrySet().iterator();
            while (it2.hasNext()) {
                function1.invoke(it2.next());
            }
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
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

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        ReentrantReadWriteLock.ReadLock lock = this.LLILLJJLI.readLock();
        lock.lock();
        try {
            boolean zContainsKey = this.LL.containsKey(obj);
            lock.unlock();
            return zContainsKey;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        ReentrantReadWriteLock.ReadLock lock = this.LLILLJJLI.readLock();
        lock.lock();
        try {
            boolean zContainsValue = this.LL.containsValue(obj);
            lock.unlock();
            return zContainsValue;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        ReentrantReadWriteLock.ReadLock lock = this.LLILLJJLI.readLock();
        lock.lock();
        try {
            V v = this.LL.get(obj);
            lock.unlock();
            return v;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        int readHoldCount;
        ReentrantReadWriteLock reentrantReadWriteLock = this.LLILLJJLI;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            readHoldCount = reentrantReadWriteLock.getReadHoldCount();
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.unlock();
            }
        } else {
            readHoldCount = 0;
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.LL.putAll(map);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
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

    @Override // java.util.Map
    public final V remove(Object obj) {
        int readHoldCount;
        ReentrantReadWriteLock reentrantReadWriteLock = this.LLILLJJLI;
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
            V vRemove = this.LL.remove(obj);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            return vRemove;
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

    @Override // java.util.Map
    public final V put(K k, V v) {
        int readHoldCount;
        ReentrantReadWriteLock reentrantReadWriteLock = this.LLILLJJLI;
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
            V vPut = this.LL.put(k, v);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            return vPut;
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
