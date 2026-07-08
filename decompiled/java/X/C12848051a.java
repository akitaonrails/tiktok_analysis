package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.051a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12848051a {
    public static final Object LIZ(Keva keva, Object obj, String str) {
        if (obj instanceof Integer) {
            return Integer.valueOf(keva.getInt(str, ((Number) obj).intValue()));
        }
        if (obj instanceof Boolean) {
            return Boolean.valueOf(keva.getBoolean(str, ((Boolean) obj).booleanValue()));
        }
        if (obj instanceof Float) {
            return Float.valueOf(keva.getFloat(str, ((Number) obj).floatValue()));
        }
        if (obj instanceof Long) {
            return Long.valueOf(keva.getLong(str, ((Number) obj).longValue()));
        }
        if (obj instanceof String) {
            return keva.getString(str, (String) obj);
        }
        if (obj instanceof Object[]) {
            return keva.getStringArray(str, (String[]) obj);
        }
        throw new IllegalArgumentException("the valueType is not supported yet");
    }

    public static final void LIZIZ(Keva keva, Object obj, String str) {
        if (obj instanceof Integer) {
            keva.storeInt(str, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Boolean) {
            keva.storeBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Float) {
            keva.storeFloat(str, ((Number) obj).floatValue());
            return;
        }
        if (obj instanceof Long) {
            keva.storeLong(str, ((Number) obj).longValue());
        } else if (obj instanceof String) {
            keva.storeString(str, (String) obj);
        } else {
            if (obj instanceof Object[]) {
                keva.storeStringArray(str, (String[]) obj);
                return;
            }
            throw new IllegalArgumentException("the valueType is not supported yet");
        }
    }
}
