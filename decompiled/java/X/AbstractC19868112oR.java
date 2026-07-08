package X;

import java.util.Map;

/* JADX INFO: renamed from: X.12oR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19868112oR<K, V> implements Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    public abstract K getKey();

    @Override // java.util.Map.Entry
    public abstract V getValue();

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(getKey());
        String strValueOf2 = String.valueOf(getValue());
        StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!C19837412jU.LIZ(getKey(), entry.getKey()) || !C19837412jU.LIZ(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
