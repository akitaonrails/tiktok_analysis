package X;

import java.util.Map;
import java.util.Map.Entry;

/* JADX INFO: renamed from: X.13CP, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C13CP<E extends Map.Entry<? extends K, ? extends V>, K, V> extends C13CT<E> {
    public abstract boolean LIZJ(Map.Entry<? extends K, ? extends V> entry);

    public abstract boolean LJ(Map.Entry<? extends K, ? extends V> entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry<? extends K, ? extends V> entry;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry<? extends K, ? extends V> entry2 = (Map.Entry) obj;
        if (entry2 instanceof Object) {
            entry = entry2;
        } else {
            entry = null;
        }
        if (!(entry instanceof Map.Entry)) {
            return false;
        }
        return LIZJ(entry2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry<? extends K, ? extends V> entry;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry<? extends K, ? extends V> entry2 = (Map.Entry) obj;
        if (entry2 instanceof Object) {
            entry = entry2;
        } else {
            entry = null;
        }
        if (!(entry instanceof Map.Entry)) {
            return false;
        }
        return LJ(entry2);
    }
}
