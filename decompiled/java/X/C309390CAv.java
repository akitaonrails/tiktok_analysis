package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.0CAv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C309390CAv {
    public static Gson LIZ;

    public static String LIZIZ(Object obj) {
        try {
            if (LIZ == null) {
                LIZ = new Gson();
            }
            Gson gson = LIZ;
            if (gson != null) {
                return gson.LJIILL(obj);
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static Object LIZ(String str, Type type) {
        try {
            if (LIZ == null) {
                LIZ = new Gson();
            }
            Gson gson = LIZ;
            if (gson != null) {
                return gson.LJIIIIZZ(str, type);
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
