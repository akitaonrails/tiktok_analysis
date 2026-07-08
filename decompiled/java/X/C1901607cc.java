package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.07cc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1901607cc implements Map, Serializable, C03W4 {
    public static final C1901607cc LL = new C1901607cc();
    public static final long serialVersionUID = 8246714829545688274L;

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return 0;
    }

    public final String toString() {
        return "{}";
    }

    private final Object readResolve() {
        return LL;
    }

    @Override // java.util.Map
    public final Set<Map.Entry> entrySet() {
        return C08CX.INSTANCE;
    }

    @Override // java.util.Map
    public final Set<Object> keySet() {
        return C08CX.INSTANCE;
    }

    @Override // java.util.Map
    public final Collection values() {
        return C13BV.INSTANCE;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        return !(obj instanceof Void) ? false : false;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if ((obj instanceof Map) && ((Map) obj).isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
