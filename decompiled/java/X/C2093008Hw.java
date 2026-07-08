package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.08Hw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2093008Hw<K, V> extends LinkedHashMap<K, V> {
    public final int LL;

    public C2093008Hw(int i) {
        super(i, 0.75f, true);
        this.LL = i;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() > this.LL) {
            return true;
        }
        return false;
    }
}
