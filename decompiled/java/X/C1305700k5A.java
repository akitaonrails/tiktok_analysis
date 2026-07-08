package X;

import android.text.TextUtils;
import com.ss.android.ttve.monitor.TEPerfStatsInvoker;

/* JADX INFO: renamed from: X.0k5A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1305700k5A {
    public static void LIZ(String str, double d) {
        if (TextUtils.isEmpty(str)) {
            C2484209oO.LJIIIIZZ("TEMonitor", "perfDouble: key is null");
        } else {
            TEPerfStatsInvoker.nativePerfDouble(0, str, d);
        }
    }

    public static void LIZIZ(long j, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        TEPerfStatsInvoker.nativePerfLong(0, str, j);
    }

    public static void LIZJ(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            C2484209oO.LJIIIIZZ("TEMonitor", "perfString: key is null");
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        TEPerfStatsInvoker.nativePerfString(0, str, str2);
    }
}
