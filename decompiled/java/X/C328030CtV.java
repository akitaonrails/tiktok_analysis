package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0CtV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C328030CtV {
    /* JADX WARN: Multi-variable type inference failed */
    public static final HashMap<String, String> LIZ(Object obj) {
        if (!(obj instanceof Map)) {
            return null;
        }
        HashMap<String, String> map = new HashMap<>();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (!(key instanceof String) || !(value instanceof String)) {
                return null;
            }
            map.put(key, value);
        }
        return map;
    }

    public static final int LIZIZ(Throwable th) {
        if (th instanceof C501470JlZ) {
            return ((C501520Jle) th).getErrorCode();
        }
        if (th instanceof C1811850xFX) {
            return ((C1811850xFX) th).getCronetError();
        }
        if (th instanceof C1494690ozz) {
            return ((C1494690ozz) th).getCronetInternalErrorCode();
        }
        return 999;
    }
}
