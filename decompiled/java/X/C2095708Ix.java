package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08Ix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2095708Ix implements Map<String, Object>, InterfaceC2095908Iz {
    public JSONObject LL;

    @Override // java.util.Map
    public final void clear() {
        this.LL = new JSONObject();
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, Object>> entrySet() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> itKeys = this.LL.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            linkedHashSet.add(new C2095808Iy(next, this.LL.opt(next)));
        }
        return linkedHashSet;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.LL.length() == 0;
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C19719612Di.LJJIFFI(linkedHashSet, C09R4.LIZIZ(this.LL.keys()));
        return linkedHashSet;
    }

    @Override // java.util.Map
    public final int size() {
        return this.LL.length();
    }

    @Override // java.util.Map
    public final Collection<Object> values() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> itKeys = this.LL.keys();
        while (itKeys.hasNext()) {
            linkedHashSet.add(this.LL.opt(itKeys.next()));
        }
        return linkedHashSet;
    }

    public C2095708Ix(JSONObject jSONObject) {
        this.LL = jSONObject;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.LL.has((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        Iterator<String> itKeys = this.LL.keys();
        while (itKeys.hasNext()) {
            Object objOpt = this.LL.opt(itKeys.next());
            if (objOpt != null && objOpt.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return this.LL.opt((String) obj);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends Object> map) throws JSONException {
        for (Map.Entry<? extends String, ? extends Object> entry : map.entrySet()) {
            this.LL.put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return this.LL.remove((String) obj);
    }

    @Override // java.util.Map
    public final Object put(String str, Object obj) {
        return this.LL.put(str, obj);
    }
}
