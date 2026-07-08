package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.0bsA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C990120bsA {
    public static Gson LIZ;
    public static C990120bsA LIZIZ;

    public C990120bsA() {
        LIZ = new Gson();
    }

    public static Object LIZ(String str, Type type) {
        try {
            Gson gson = LIZ;
            if (gson == null) {
                gson = null;
            }
            return gson.LJIIIIZZ(str, type);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
