package X;

import java.util.Map;

/* JADX INFO: renamed from: X.12xm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19926012xm<K> implements Map.Entry<K, Object> {
    public final Map.Entry<K, C19926112xn> LL;

    public C19926012xm() {
        throw null;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.LL.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C19926112xn value = this.LL.getValue();
        if (value == null) {
            return null;
        }
        return value.LIZLLL();
    }

    public C19926012xm(Map.Entry entry) {
        this.LL = entry;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof InterfaceC19925612xi) {
            C19926112xn value = this.LL.getValue();
            InterfaceC19925612xi interfaceC19925612xi = value.LIZJ;
            value.LIZ = null;
            value.LIZLLL = null;
            value.LIZJ = (InterfaceC19925612xi) obj;
            return interfaceC19925612xi;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
