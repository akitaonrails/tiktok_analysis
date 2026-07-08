package X;

import com.bytedance.crash.CrashType;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0VdJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802110VdJ {
    public static InterfaceC801750Vcj LIZ;
    public static final HashMap<String, C802120VdK> LIZIZ = new HashMap<>();

    public static boolean LIZ() {
        InterfaceC801750Vcj interfaceC801750Vcj = LIZ;
        return interfaceC801750Vcj != null && interfaceC801750Vcj.isInit();
    }

    public static void LIZIZ(String str, long j, long j2, CrashType crashType) {
        HashMap<String, C802120VdK> map = LIZIZ;
        synchronized (map) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(j);
                C802120VdK c802120VdK = map.get(C2188811AlT.LIZIZ(sbLIZ));
                if (c802120VdK == null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append(j);
                    map.put(C2188811AlT.LIZIZ(sbLIZ2), new C802120VdK(str, j2, crashType));
                } else {
                    ((ArrayList) c802120VdK.LIZIZ).add(Long.valueOf(j2));
                    if (crashType == CrashType.LAUNCH) {
                        c802120VdK.LIZJ = true;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
