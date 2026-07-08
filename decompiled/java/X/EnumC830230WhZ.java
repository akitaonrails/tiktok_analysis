package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WhZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public enum EnumC830230WhZ {
    GET,
    PUT,
    POST,
    DELETE,
    HEAD,
    OPTIONS,
    TRACE,
    CONNECT,
    PATCH,
    PROPFIND,
    PROPPATCH,
    MKCOL,
    MOVE,
    COPY,
    LOCK,
    UNLOCK;

    public static EnumC830230WhZ LIZJ(String str) {
        if (str == null) {
            return null;
        }
        try {
            return valueOf(str);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static EnumC830230WhZ valueOf(String str) {
        return (EnumC830230WhZ) C08FF.LIZ(EnumC830230WhZ.class, str);
    }
}
