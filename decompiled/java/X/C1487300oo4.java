package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0oo4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1487300oo4 {
    public static final Map<String, String> LIZIZ;
    public static volatile C1487300oo4 LIZJ;
    public Context LIZ;

    static {
        HashMap map = new HashMap();
        LIZIZ = map;
        map.put("regular", C1697600uHG.LIZ(1, false));
        map.put("bold", C1697600uHG.LIZ(3, false));
        map.put("medium", C1697600uHG.LIZ(2, false));
    }

    public static C1487300oo4 LIZ() {
        if (LIZJ == null) {
            synchronized (C1487300oo4.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C1487300oo4();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }
}
