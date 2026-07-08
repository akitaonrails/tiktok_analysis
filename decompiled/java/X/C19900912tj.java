package X;

import java.util.Map;

/* JADX INFO: renamed from: X.12tj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19900912tj<K> implements Map.Entry<K, Object> {
    public final Map.Entry<K, C19901212tm> LL;

    public C19900912tj() {
        throw null;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.LL.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.LL.getValue() == null) {
            return null;
        }
        throw new NoSuchMethodError();
    }

    public C19900912tj(Map.Entry entry) {
        this.LL = entry;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof InterfaceC19901112tl) {
            C19901212tm value = this.LL.getValue();
            InterfaceC19901112tl interfaceC19901112tl = value.LIZ;
            value.LIZIZ = null;
            value.LIZ = (InterfaceC19901112tl) obj;
            return interfaceC19901112tl;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
