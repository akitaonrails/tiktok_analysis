package X;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: renamed from: X.12lZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19850312lZ implements Map, Serializable {
    public static final Map.Entry[] LLILLJJLI = new Map.Entry[0];
    public transient AbstractC19860912nH LL;

    public abstract AbstractC19860912nH LIZ();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public AbstractC19861612nO values() {
        throw null;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public AbstractC19860912nH keySet() {
        throw null;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final AbstractC19860912nH entrySet() {
        AbstractC19860912nH abstractC19860912nH = this.LL;
        if (abstractC19860912nH != null) {
            return abstractC19860912nH;
        }
        AbstractC19860912nH abstractC19860912nHLIZ = LIZ();
        this.LL = abstractC19860912nHLIZ;
        return abstractC19860912nHLIZ;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return C990690bt5.LIZ(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            throw new IllegalArgumentException("size cannot be negative but was: " + size);
        }
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }
}
