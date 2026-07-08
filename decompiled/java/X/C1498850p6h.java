package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0p6h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1498850p6h<K, T> extends LinkedHashMap<K, T> {
    public int LL;

    public C1498850p6h() {
        this(4, 4);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<K, T> entry) {
        if (size() > this.LL) {
            return true;
        }
        return false;
    }

    public void setMaxSize(int i) {
        this.LL = i;
    }

    public C1498850p6h(int i, int i2) {
        this(i, i2, true);
    }

    public C1498850p6h(int i, int i2, boolean z) {
        super(i, 0.75f, z);
        setMaxSize(i2);
    }
}
