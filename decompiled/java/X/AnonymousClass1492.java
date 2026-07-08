package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1492, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1492 {
    public static final JSONObject LIZ(AnonymousClass1490 anonymousClass1490) {
        try {
            AnonymousClass1495 anonymousClass1495 = anonymousClass1490.LJJIFFI;
            if (anonymousClass1495 != null) {
                return anonymousClass1495.LIZ();
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
