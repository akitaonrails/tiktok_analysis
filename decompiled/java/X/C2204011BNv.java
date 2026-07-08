package X;

import com.bytedance.pia.core.setting.Config;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: X.1BNv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2204011BNv {
    public static final ConcurrentHashMap<String, FutureTask<C2204041BNy>> LIZ = new ConcurrentHashMap<>();

    public static C2204041BNy LIZ(String str, String str2, Object obj, Config config, boolean z) {
        C2204001BNu c2204001BNu = new C2204001BNu();
        c2204001BNu.LIZIZ = str;
        c2204001BNu.LIZ = str2;
        c2204001BNu.LIZJ = obj;
        c2204001BNu.LJ = config;
        String strLIZIZ = c2204001BNu.LIZIZ();
        if (strLIZIZ != null && !strLIZIZ.isEmpty()) {
            if (!z) {
                return c2204001BNu.LIZ();
            }
            FutureTask<C2204041BNy> futureTaskRemove = LIZ.remove(strLIZIZ);
            if (futureTaskRemove != null) {
                try {
                    C2204041BNy c2204041BNy = futureTaskRemove.get();
                    if (c2204041BNy != null) {
                        C1BPP.LJ("[Runtime] consume warmup success.");
                        return c2204041BNy;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            return c2204001BNu.LIZ();
        }
        return null;
    }
}
