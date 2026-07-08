package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.s;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.0518, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0518 {
    public static final Gson LIZ = new Gson();

    public static <T> T LIZ(k kVar, Type type) {
        try {
            return (T) GsonProtectorUtils.fromJson(LIZ, kVar, type);
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("JSON parse error! check your config: ");
            sbLIZ.append(kVar.toString());
            C1481110oe5.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }
}
