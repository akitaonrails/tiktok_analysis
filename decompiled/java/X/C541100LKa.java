package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;

/* JADX INFO: renamed from: X.0LKa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C541100LKa {
    public static final String LIZIZ(Object obj) {
        try {
            return C2292508yZ.LIZJ(obj);
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIIIZZ(C201967140v.LIZIZ, "GsonUtils", "safeFromJson: e");
            return null;
        }
    }

    public static final <T> T LIZ(String str, Class<T> cls) {
        try {
            return (T) C2292508yZ.LIZ(str, cls);
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIIIZZ(C201967140v.LIZIZ, "GsonUtils", "safeFromJson: e");
            return null;
        }
    }
}
