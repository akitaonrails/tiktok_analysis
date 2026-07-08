package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.08qA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2240408qA {
    public static final <T> T LIZ(String str, Type type) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        T t = null;
        if (z) {
            return null;
        }
        try {
            C1227904rF.LIZ.getClass();
            t = (T) C1227904rF.LIZJ(str, type);
            return t;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("JsonSyntaxException: msg: ");
            sbLIZ.append(e.getMessage());
            sbLIZ.append(", stackTrace: ");
            sbLIZ.append(Log.getStackTraceString(e));
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
            return t;
        }
    }
}
