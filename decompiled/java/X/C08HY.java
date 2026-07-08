package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.08HY, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08HY<K, V> extends LinkedHashMap<K, V> {
    public static final long serialVersionUID = 3805937866184666407L;
    public final int LL;

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<K, V> entry) {
        if (size() > this.LL) {
            return true;
        }
        return false;
    }

    public C08HY(int i, int i2) {
        this(i, i2, false);
    }

    public C08HY(int i, int i2, boolean z) {
        super(i2, 0.75f, true);
        this.LL = i;
        if (i > 0) {
        } else {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }
}
