package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.0NJ3, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NJ3 {
    public C0NJ1 LIZ;

    public final void LIZ(C0NJ5 c0nj5, Map<String, ? extends Object> map) {
        if (map.isEmpty()) {
            return;
        }
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
