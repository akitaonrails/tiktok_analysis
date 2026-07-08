package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0NmI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C603840NmI<K, V> extends LinkedHashMap<K, V> {
    public final int LL;

    public C603840NmI(int i) {
        super(i);
        this.LL = i;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<K, V> entry) {
        if (size() > this.LL) {
            return true;
        }
        return false;
    }
}
