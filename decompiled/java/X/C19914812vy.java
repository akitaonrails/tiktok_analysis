package X;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.12vy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19914812vy<K, V> extends LinkedHashMap<K, V> {
    public static final C19914812vy<?, ?> LLILLJJLI;
    public boolean LL;

    public void makeImmutable() {
        this.LL = false;
    }

    static {
        C19914812vy<?, ?> c19914812vy = new C19914812vy<>();
        LLILLJJLI = c19914812vy;
        c19914812vy.makeImmutable();
    }

    public C19914812vy() {
        this.LL = true;
    }

    public final void LIZLLL() {
        if (!isMutable()) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        LIZLLL();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return LIZ(this);
    }

    public C19914812vy<K, V> mutableCopy() {
        return isEmpty() ? new C19914812vy<>() : new C19914812vy<>(this);
    }

    public static <K, V> C19914812vy<K, V> emptyMapField() {
        return (C19914812vy<K, V>) LLILLJJLI;
    }

    public boolean isMutable() {
        return this.LL;
    }

    public C19914812vy(Map<K, V> map) {
        super(map);
        this.LL = true;
    }

    public static <K, V> int LIZ(Map<K, V> map) {
        int iLIZIZ = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            iLIZIZ += LIZIZ(entry.getValue()) ^ LIZIZ(entry.getKey());
        }
        return iLIZIZ;
    }

    public static int LIZIZ(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Charset charset = C19922012x8.LIZ;
            int length = bArr.length;
            for (byte b : bArr) {
                length = (length * 31) + b;
            }
            if (length == 0) {
                return 1;
            }
            return length;
        }
        if (!(obj instanceof InterfaceC19931112yb)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> Map<K, V> LIZJ(Map<K, V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(((map.size() * 4) / 3) + 1);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                value = (V) Arrays.copyOf(bArr, bArr.length);
            }
            linkedHashMap.put(key, value);
        }
        return linkedHashMap;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if ((obj instanceof Map) && LJ(this, (Map) obj)) {
            return true;
        }
        return false;
    }

    public void mergeFrom(C19914812vy<K, V> c19914812vy) {
        LIZLLL();
        if (!c19914812vy.isEmpty()) {
            putAll(c19914812vy);
        }
    }

    public V put(Map.Entry<K, V> entry) {
        return put(entry.getKey(), entry.getValue());
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        LIZLLL();
        for (K k : map.keySet()) {
            Charset charset = C19922012x8.LIZ;
            k.getClass();
            map.get(k).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        LIZLLL();
        return (V) super.remove(obj);
    }

    public static <K, V> boolean LJ(Map<K, V> map, Map<K, V> map2) {
        boolean zEquals;
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey())) {
                return false;
            }
            V value = entry.getValue();
            V v = map2.get(entry.getKey());
            if ((value instanceof byte[]) && (v instanceof byte[])) {
                zEquals = Arrays.equals((byte[]) value, (byte[]) v);
            } else {
                zEquals = value.equals(v);
            }
            if (!zEquals) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        LIZLLL();
        Charset charset = C19922012x8.LIZ;
        k.getClass();
        v.getClass();
        return (V) super.put(k, v);
    }
}
