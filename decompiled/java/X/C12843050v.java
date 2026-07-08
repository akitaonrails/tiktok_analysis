package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.050v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12843050v {
    public static final Gson LIZ = new Gson();

    public static <T> T LIZ(k kVar, Type type) {
        try {
            return (T) LIZ.LIZLLL(kVar, type);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("JSON parse error! check your config: ");
            sbLIZ.append(kVar.toString());
            C2188811AlT.LIZIZ(sbLIZ);
            return null;
        }
    }
}
