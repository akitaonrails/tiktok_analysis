package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08FF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08FF {
    public static <T extends Enum<T>> T LIZ(Class<T> cls, String str) {
        if (C09EU.LIZIZ()) {
            try {
                return (T) Enum.valueOf(cls, str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C08FV c08fvLIZ = C09EU.LIZ(C08FG.ENUM, th);
                if (c08fvLIZ != null) {
                    Object obj = c08fvLIZ.LIZ;
                    if (obj instanceof String) {
                        return (T) Enum.valueOf(cls, (String) obj);
                    }
                    return null;
                }
                throw th;
            }
        }
        return (T) Enum.valueOf(cls, str);
    }
}
