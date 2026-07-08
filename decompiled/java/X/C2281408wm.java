package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;

/* JADX INFO: renamed from: X.08wm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2281408wm<K, V> extends ConcurrentHashMap<K, V> {
    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
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

    public /* bridge */ Collection<Object> getValues() {
        return super.values();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return (Set<K>) getKeys();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return (Collection<V>) getValues();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                if (entry.getValue() == null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(linkedHashMap.keySet(), ",", null, null, 0, null, null, 62);
            ExecutorService executorService = C2281108wj.LIZ;
            C2281108wj.LIZIZ(EnumC2281308wl.Sequence, true, new RunnableC828430Wef(strLJJLIIIJ));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<? extends K, ? extends V> entry2 : map.entrySet()) {
                if (entry2.getKey() != null && entry2.getValue() != null) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            super.putAll(linkedHashMap2);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        try {
            if (k != null && v != null) {
                return (V) super.put(k, v);
            }
            if (k == null) {
                return null;
            }
            ExecutorService executorService = C2281108wj.LIZ;
            C2281108wj.LIZIZ(EnumC2281308wl.Sequence, true, new RunnableC828430Wef(k));
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k, V v) {
        if (k == null || v == null) {
            return null;
        }
        try {
            return (V) super.putIfAbsent(k, v);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }
}
