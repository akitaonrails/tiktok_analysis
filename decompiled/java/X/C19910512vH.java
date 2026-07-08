package X;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.12vH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19910512vH extends LinkedHashMap {
    public static final C19910512vH LLILLJJLI;
    public boolean LL;

    public static C19910512vH zza() {
        return LLILLJJLI;
    }

    public final void zzc() {
        this.LL = false;
    }

    public final boolean zze() {
        return this.LL;
    }

    static {
        C19910512vH c19910512vH = new C19910512vH();
        LLILLJJLI = c19910512vH;
        c19910512vH.LL = false;
    }

    public final void LIZIZ() {
        if (!this.LL) {
            throw new UnsupportedOperationException();
        }
    }

    public C19910512vH() {
        this.LL = true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        LIZIZ();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iLIZ = 0;
        for (Map.Entry entry : entrySet()) {
            iLIZ += LIZ(entry.getValue()) ^ LIZ(entry.getKey());
        }
        return iLIZ;
    }

    public final C19910512vH zzb() {
        return isEmpty() ? new C19910512vH() : new C19910512vH(this);
    }

    public C19910512vH(Map map) {
        super(map);
        this.LL = true;
    }

    public static int LIZ(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Charset charset = C19856312mX.LIZ;
            int length = bArr.length;
            for (byte b : bArr) {
                length = (length * 31) + b;
            }
            if (length == 0) {
                return 1;
            }
            return length;
        }
        if (!(obj instanceof InterfaceC19912512vb)) {
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
                    for (Map.Entry entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            Object value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                                zEquals = Arrays.equals((byte[]) value, (byte[]) obj2);
                            } else {
                                zEquals = value.equals(obj2);
                            }
                            if (!zEquals) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        LIZIZ();
        for (Object obj : map.keySet()) {
            Charset charset = C19856312mX.LIZ;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        LIZIZ();
        return super.remove(obj);
    }

    public final void zzd(C19910512vH c19910512vH) {
        LIZIZ();
        if (!c19910512vH.isEmpty()) {
            putAll(c19910512vH);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        LIZIZ();
        Charset charset = C19856312mX.LIZ;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }
}
