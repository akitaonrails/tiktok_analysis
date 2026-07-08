package X;

import java.util.Map;

/* JADX INFO: renamed from: X.12vO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19911212vO implements Map.Entry {
    public final Map.Entry LL;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.LL.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.LL.getValue() == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof InterfaceC19911612vS) {
            C19911112vN c19911112vN = (C19911112vN) this.LL.getValue();
            InterfaceC19911612vS interfaceC19911612vS = c19911112vN.LIZ;
            c19911112vN.LIZIZ = null;
            c19911112vN.LIZ = (InterfaceC19911612vS) obj;
            return interfaceC19911612vS;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
