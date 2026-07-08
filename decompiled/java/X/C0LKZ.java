package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;

/* JADX INFO: renamed from: X.0LKZ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LKZ {
    public static final String LIZIZ(Object obj) {
        try {
            return C2292508yZ.LIZJ(obj);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIIIZZ(C563650M8t.LIZIZ, "GsonUtils", "all safeFromJson: e");
            return null;
        }
    }

    public static final String LIZLLL(Object obj) {
        try {
            return C2292508yZ.LIZJ(obj);
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIIIZZ(C563650M8t.LIZIZ, "GsonUtils", "safeFromJson: e");
            return null;
        }
    }

    public static final Object LIZ(Class cls, String str) {
        try {
            return C2292508yZ.LIZ(str, cls);
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIIIZZ(C563650M8t.LIZIZ, "GsonUtils", "all safeFromJson: e");
            return null;
        }
    }

    public static final <T> T LIZJ(String str, Class<T> cls) {
        try {
            return (T) C2292508yZ.LIZ(str, cls);
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIIIZZ(C563650M8t.LIZIZ, "GsonUtils", "safeFromJson: e");
            return null;
        }
    }
}
