package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0pt2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1528820pt2<K, V> extends LinkedHashMap<K, V> {
    public static final int $stable = 8;
    public final int LL;
    public final C13E8<Pair<K, V>> LLILLJJLI;
    public Function2<? super K, ? super V, Unit> LLILLL;

    public C1528820pt2() {
        this(10);
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

    public /* bridge */ Collection<Object> getValues() {
        return super.values();
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
        return (Collection<V>) getValues();
    }

    public final int getMax() {
        return this.LL;
    }

    public final Function2<K, V, Unit> getOnEvict() {
        return this.LLILLL;
    }

    public C1528820pt2(int i) {
        super(16, 0.75f, true);
        this.LL = i;
        this.LLILLJJLI = new C13E8<>();
    }

    public final void drainEvictions(Function2<? super K, ? super V, Unit> function2) {
        while (!this.LLILLJJLI.isEmpty()) {
            Pair<K, V> pairRemoveFirst = this.LLILLJJLI.removeFirst();
            function2.invoke(pairRemoveFirst.getFirst(), pairRemoveFirst.getSecond());
        }
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<K, V> entry) {
        if (size() > this.LL) {
            if (entry != null) {
                this.LLILLJJLI.add(new Pair<>(entry.getKey(), entry.getValue()));
            }
            return true;
        }
        return false;
    }

    public final void setOnEvict(Function2<? super K, ? super V, Unit> function2) {
        this.LLILLL = function2;
    }
}
