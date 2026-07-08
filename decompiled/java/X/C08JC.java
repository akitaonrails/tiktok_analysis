package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.08JC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08JC implements Map<String, C961750b8P>, InterfaceC2095908Iz {
    public final /* synthetic */ Map<String, C961750b8P> LL = new LinkedHashMap();

    @Override // java.util.Map
    public final void clear() {
        this.LL.clear();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.LL.isEmpty();
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends C961750b8P> map) {
        this.LL.putAll(map);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, C961750b8P>> entrySet() {
        return this.LL.entrySet();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.LL.keySet();
    }

    @Override // java.util.Map
    public final int size() {
        return this.LL.size();
    }

    @Override // java.util.Map
    public final Collection<C961750b8P> values() {
        return this.LL.values();
    }

    public C08JC(int i) {
    }

    public final void LIZ(String str) {
        if (!containsKey(str)) {
            put(str, null);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.LL.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj != null && !(obj instanceof C961750b8P)) {
            return false;
        }
        return this.LL.containsValue(obj);
    }

    @Override // java.util.Map
    public final C961750b8P get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return this.LL.get(obj);
    }

    @Override // java.util.Map
    public final C961750b8P remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return this.LL.remove(obj);
    }

    @Override // java.util.Map
    public final C961750b8P put(String str, C961750b8P c961750b8P) {
        return this.LL.put(str, c961750b8P);
    }
}
