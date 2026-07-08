package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.0C8t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C308850C8t {
    public static final C313430CQj LIZ;

    static {
        C313430CQj c313430CQj;
        try {
            Map map = (Map) SettingsManager.LIZLLL().LJIIIIZZ("profile_badge_all", C313430CQj.class, LIZ);
            if (map == null || (map instanceof C313430CQj)) {
                c313430CQj = (C313430CQj) map;
            } else {
                C313430CQj c313430CQj2 = new C313430CQj();
                if (map != null) {
                    c313430CQj2.putAll(map);
                }
                c313430CQj = c313430CQj2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c313430CQj = null;
        }
        LIZ = c313430CQj;
    }
}
