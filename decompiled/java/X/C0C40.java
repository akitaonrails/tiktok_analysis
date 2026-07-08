package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: renamed from: X.0C40, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C40 {
    public static final Gson LIZ;
    public static final Type LIZIZ;

    static {
        new p();
        LIZ = new Gson();
        LIZIZ = new TypeToken<Map<String, ? extends String>>() { // from class: X.0C3z
        }.getType();
    }

    public static Object LIZ(Class cls) {
        try {
            return LIZ.LJII("", cls);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static final String LIZIZ(Object obj) {
        if (obj == null) {
            return "";
        }
        return GsonProtectorUtils.toJson(LIZ, obj);
    }
}
