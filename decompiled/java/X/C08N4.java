package X;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.08N4, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08N4<K, V> extends LinkedHashMap<K, V> {
    public static final C08N4<?, ?> LLILLJJLI;
    public boolean LL;

    public final void zzc() {
        this.LL = false;
    }

    static {
        C08N4<?, ?> c08n4 = new C08N4<>();
        LLILLJJLI = c08n4;
        c08n4.LL = false;
    }

    public final void LIZIZ() {
        if (!this.LL) {
            throw new UnsupportedOperationException();
        }
    }

    public C08N4() {
        this.LL = true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        LIZIZ();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iLIZ = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iLIZ += LIZ(entry.getValue()) ^ LIZ(entry.getKey());
        }
        return iLIZ;
    }

    public final C08N4<K, V> zzb() {
        return isEmpty() ? new C08N4<>() : new C08N4<>(this);
    }

    public static <K, V> C08N4<K, V> zza() {
        return (C08N4<K, V>) LLILLJJLI;
    }

    public final boolean zzd() {
        return this.LL;
    }

    public C08N4(Map<K, V> map) {
        super(map);
        this.LL = true;
    }

    public static int LIZ(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Charset charset = C19856912md.LIZ;
            int length = bArr.length;
            for (byte b : bArr) {
                length = (length * 31) + b;
            }
            if (length == 0) {
                return 1;
            }
            return length;
        }
        if (!(obj instanceof InterfaceC19793112cL)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    for (Map.Entry<K, V> entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            V value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                                zEquals = Arrays.equals((byte[]) value, (byte[]) obj2);
                            } else {
                                zEquals = value.equals(obj2);
                            }
                            if (!zEquals) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        LIZIZ();
        for (K k : map.keySet()) {
            Charset charset = C19856912md.LIZ;
            k.getClass();
            map.get(k).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        LIZIZ();
        return (V) super.remove(obj);
    }

    public final void zza(C08N4<K, V> c08n4) {
        LIZIZ();
        if (!c08n4.isEmpty()) {
            putAll(c08n4);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        LIZIZ();
        Charset charset = C19856912md.LIZ;
        k.getClass();
        v.getClass();
        return (V) super.put(k, v);
    }
}
