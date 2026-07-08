package X;

import com.google.gson.k;
import com.google.gson.n;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07fh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1920707fh implements Map<String, Object>, C03W4 {
    public final n LL;

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object compute(String str, BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfAbsent(String str, Function<? super String, ? extends Object> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfPresent(String str, BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object merge(String str, Object obj, BiFunction<? super Object, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(String str, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends Object> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object putIfAbsent(String str, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object replace(String str, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, Object>> entrySet() {
        Set<Map.Entry<String, k>> setEntrySet = this.LL.entrySet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it2 = setEntrySet.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(new C1920807fi((Map.Entry) it2.next()));
        }
        return linkedHashSet;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.LL.size() == 0;
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.LL.LJJIJIL();
    }

    @Override // java.util.Map
    public final int size() {
        return this.LL.size();
    }

    @Override // java.util.Map
    public final Collection<Object> values() {
        Set<Map.Entry<String, k>> setEntrySet = this.LL.entrySet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it2 = setEntrySet.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(C1931407hQ.LIZ((k) ((Map.Entry) it2.next()).getValue()));
        }
        return linkedHashSet;
    }

    public C1920707fh(n nVar) {
        this.LL = nVar;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.LL.LJJIJIL().contains(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Set<Map.Entry<String, k>> setEntrySet = this.LL.entrySet();
        if (!(setEntrySet instanceof Collection) || !setEntrySet.isEmpty()) {
            Iterator<T> it2 = setEntrySet.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(((Map.Entry) it2.next()).getValue(), obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        k kVarLJJIIZ = this.LL.LJJIIZ((String) obj);
        if (kVarLJJIIZ == null) {
            return null;
        }
        return C1931407hQ.LIZ(kVarLJJIIZ);
    }
}
