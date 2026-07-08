package X;

import java.util.Map;

/* JADX INFO: renamed from: X.12ue, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19906612ue implements Comparable, Map.Entry {
    public final Comparable LL;
    public Object LLILLJJLI;
    public final /* synthetic */ C19906512ud LLILLL;

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.LL;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.LLILLJJLI;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.LL);
        String strValueOf2 = String.valueOf(this.LLILLJJLI);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strValueOf);
        sbLIZ.append("=");
        sbLIZ.append(strValueOf2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.LL;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.LLILLJJLI;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.LL.compareTo(((C19906612ue) obj).LL);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Comparable comparable = this.LL;
        Object key = entry.getKey();
        if (comparable != null ? comparable.equals(key) : key == null) {
            Object obj2 = this.LLILLJJLI;
            Object value = entry.getValue();
            if (obj2 == null) {
                if (value == null) {
                    return true;
                }
            } else if (obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.LLILLL.LJIIIIZZ();
        Object obj2 = this.LLILLJJLI;
        this.LLILLJJLI = obj;
        return obj2;
    }

    public C19906612ue(C19906512ud c19906512ud, Comparable comparable, Object obj) {
        this.LLILLL = c19906512ud;
        this.LL = comparable;
        this.LLILLJJLI = obj;
    }
}
