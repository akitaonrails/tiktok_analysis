package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.text.u;

/* JADX INFO: renamed from: X.01sM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C470401sM {
    public static final String LIZ = C470401sM.class.getName();

    public static String LIZ(int i) {
        if (i <= 0) {
            return "";
        }
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        StringBuilder sb = new StringBuilder();
        C089E c089e = new C089E(stackTrace);
        int i2 = 0;
        while (c089e.hasNext()) {
            StackTraceElement stackTraceElement = (StackTraceElement) c089e.next();
            if (!u.LJJIIJZLJL(stackTraceElement.getClassName(), LIZ, false)) {
                if (i2 > 0) {
                    sb.append('\n');
                }
                sb.append(stackTraceElement.getClassName());
                sb.append('.');
                sb.append(stackTraceElement.getMethodName());
                sb.append('(');
                String fileName = stackTraceElement.getFileName();
                if (fileName == null) {
                    fileName = "Unknown";
                }
                sb.append(fileName);
                sb.append(':');
                sb.append(stackTraceElement.getLineNumber());
                sb.append(')');
                i2++;
                if (i2 >= i) {
                    break;
                }
            }
        }
        return sb.toString();
    }

    public static final void LIZIZ(int i, int i2, String str) {
        try {
            String strLIZ = LIZ(i2);
            HashMap map = new HashMap();
            map.put("error_code", String.valueOf(i));
            map.put("error_message", str);
            map.put("msg", strLIZ);
            map.put("action", C786410Ut5.u3().getName());
            map.put("effect_fetch_ts", "");
            map.put("effect_downloaded_ts", "");
            map.put("effect_apply_ts", "");
            map.put("effect_ready_ts", "");
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pcs_effect_error_perf");
            c474500IjALIZ.LJJIIZI(map);
            c474500IjALIZ.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[code=");
            sbLIZ.append(i);
            sbLIZ.append("] ");
            sbLIZ.append(str);
            sbLIZ.append(" } | stack=");
            sbLIZ.append(strLIZ);
            C20441214yg.LJIIL("BoardDiagnostics", C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("report failed: ");
                sbLIZ2.append(th.getMessage());
                C20441214yg.LJIIL("BoardDiagnostics", C2188811AlT.LIZIZ(sbLIZ2));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
    }
}
