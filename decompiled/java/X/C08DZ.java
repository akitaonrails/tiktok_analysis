package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.animax.util.AnimaXLog;

/* JADX INFO: renamed from: X.08DZ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08DZ {
    public static String LIZ(String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    return UriProtector.parse(str).buildUpon().clearQuery().build().toString();
                }
                return "unknown";
            } catch (UnsupportedOperationException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("clearUrlQuery failed, error: ");
                sbLIZ.append(e.toString());
                AnimaXLog.LIZ("AnimaXMonitor", C2188811AlT.LIZIZ(sbLIZ));
                return "unknown";
            }
        }
        return "unknown";
    }
}
