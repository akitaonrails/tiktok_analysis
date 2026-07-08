package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.07kj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1951907kj {
    public static final Map<String, String> LIZ = new LinkedHashMap();
    public static final Object LIZIZ = new Object();

    public static final void LIZ(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        String curUserId = C0XQ7.LJFF().getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(curUserId);
        sbLIZ.append(':');
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        synchronized (LIZIZ) {
            try {
                LIZ.put(strLIZIZ, str2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
