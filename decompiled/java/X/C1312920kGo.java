package X;

import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.utils.DisplayMetricsHolder;

/* JADX INFO: renamed from: X.0kGo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1312920kGo {
    public static float LIZ(String str, float f) {
        return LIZIZ(str, 0.0f, 0.0f, 0.0f, 0.0f, f, DisplayMetricsHolder.LIZIZ());
    }

    public static float LJ(String str, float f, DisplayMetrics displayMetrics) {
        int length;
        if (!TextUtils.isEmpty(str) && (length = str.length()) > 1) {
            try {
                if (str.endsWith("%")) {
                    return (CastFloatProtector.parseFloat(str.substring(0, length - 1)) * f) / 100.0f;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Number parse error from value = ");
                sbLIZ.append(str);
                sbLIZ.append(" to px!");
                LynxLog.w("lynx", C2188811AlT.LIZIZ(sbLIZ));
                return 0.0f;
            }
        }
        return LIZIZ(str, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, displayMetrics);
    }

    public static float LIZLLL(String str, float f, float f2, DisplayMetrics displayMetrics) {
        int length;
        if (!TextUtils.isEmpty(str) && (length = str.length()) > 1) {
            try {
                if (str.endsWith("%")) {
                    return (CastFloatProtector.parseFloat(str.substring(0, length - 1)) * f) / 100.0f;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Number parse error from value = ");
                sbLIZ.append(str);
                sbLIZ.append(" to px!");
                LynxLog.w("lynx", C2188811AlT.LIZIZ(sbLIZ));
                return f2;
            }
        }
        return LIZIZ(str, 0.0f, 0.0f, 0.0f, 0.0f, f2, displayMetrics);
    }

    public static float LIZJ(String str, float f, float f2, float f3, float f4, DisplayMetrics displayMetrics) {
        return LIZIZ(str, f, f2, f3, f4, 0.0f, displayMetrics);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c3, code lost:
    
        if (r1 <= 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[Catch: all -> 0x00ca, TryCatch #0 {all -> 0x00ca, blocks: (B:6:0x000e, B:8:0x0016, B:10:0x0029, B:12:0x0031, B:16:0x003e, B:18:0x0046, B:22:0x005a, B:24:0x0062, B:27:0x006f, B:29:0x0077, B:32:0x0085, B:34:0x008d, B:36:0x0099, B:38:0x00a1, B:40:0x00ae, B:42:0x00b6, B:45:0x00c5), top: B:50:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float LIZIZ(java.lang.String r7, float r8, float r9, float r10, float r11, float r12, android.util.DisplayMetrics r13) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1312920kGo.LIZIZ(java.lang.String, float, float, float, float, float, android.util.DisplayMetrics):float");
    }
}
