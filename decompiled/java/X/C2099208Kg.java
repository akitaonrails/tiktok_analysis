package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.08Kg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2099208Kg<K, V> extends LinkedHashMap<K, V> {
    public final int LL;
    public final Lock LLILLJJLI;

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        try {
            ((ReentrantLock) this.LLILLJJLI).lock();
            super.clear();
            ((ReentrantLock) this.LLILLJJLI).unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantLock) this.LLILLJJLI).unlock();
            throw th;
        }
    }

    public Collection<V> getValues() {
        try {
            ((ReentrantLock) this.LLILLJJLI).lock();
            Collection<V> collectionValues = super.values();
            ((ReentrantLock) this.LLILLJJLI).unlock();
            return collectionValues;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantLock) this.LLILLJJLI).unlock();
            throw th;
        }
    }

    public C2099208Kg() {
        this(Integer.MAX_VALUE);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return (Set<Map.Entry<K, V>>) getEntries();
    }

    public /* bridge */ Set<Map.Entry<Object, Object>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<Object> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return (Set<K>) getKeys();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    public C2099208Kg(int i) {
        this.LL = i;
        this.LLILLJJLI = new ReentrantLock();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        try {
            ((ReentrantLock) this.LLILLJJLI).lock();
            V v = (V) super.get(obj);
            ((ReentrantLock) this.LLILLJJLI).unlock();
            return v;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantLock) this.LLILLJJLI).unlock();
            throw th;
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        try {
            ((ReentrantLock) this.LLILLJJLI).lock();
            super.putAll(map);
            ((ReentrantLock) this.LLILLJJLI).unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantLock) this.LLILLJJLI).unlock();
            throw th;
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        try {
            ((ReentrantLock) this.LLILLJJLI).lock();
            V v = (V) super.remove(obj);
            ((ReentrantLock) this.LLILLJJLI).unlock();
            return v;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantLock) this.LLILLJJLI).unlock();
            throw th;
        }
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<K, V> entry) {
        if (this.LL == Integer.MAX_VALUE || size() <= this.LL) {
            return false;
        }
        return true;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        try {
            ((ReentrantLock) this.LLILLJJLI).lock();
            V v2 = (V) super.put(k, v);
            ((ReentrantLock) this.LLILLJJLI).unlock();
            return v2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantLock) this.LLILLJJLI).unlock();
            throw th;
        }
    }
}
