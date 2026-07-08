package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0WQE, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WQE<K, V> extends LinkedHashMap<K, V> {
    public final int LL;
    public C0WQB<K, V> LLILLJJLI;

    public int getLimit() {
        return this.LL;
    }

    public C0WQE(int i) {
        this.LL = i;
    }

    public V pop(K k) {
        V v = get(k);
        remove(k);
        return v;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<K, V> entry) {
        if (size() > this.LL) {
            C0WQB<K, V> c0wqb = this.LLILLJJLI;
            if (c0wqb != null) {
                c0wqb.LIZ(entry);
            }
            return true;
        }
        return false;
    }

    public void setOnRemoveListener(C0WQB<K, V> c0wqb) {
        this.LLILLJJLI = c0wqb;
    }
}
