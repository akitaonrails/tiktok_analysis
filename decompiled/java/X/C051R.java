package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.e;

/* JADX INFO: renamed from: X.051R, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C051R {
    public static final Gson LIZ;
    public static final Gson LIZIZ;

    static {
        e eVar = new e();
        eVar.LJI = true;
        LIZ = eVar.LIZ();
        e eVar2 = new e();
        eVar2.LJI = true;
        LIZIZ = eVar2.LIZ();
        e eVar3 = new e();
        eVar3.LJI = true;
        eVar3.LJIILIIL = true;
        eVar3.LIZ();
    }

    public static String LIZIZ(Object obj) {
        Gson gson = LIZ;
        if (obj != null && gson != null) {
            try {
                return gson.LJIILL(obj);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    public static <T> T LIZ(String str, Class<T> cls) {
        Gson gson = LIZIZ;
        if (gson != null) {
            try {
                return (T) gson.LJII(str, cls);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }
}
