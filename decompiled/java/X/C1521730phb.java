package X;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.bytedance.android.monitorV2.debug.MonitorDebugTool;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0phb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1521730phb {
    public static boolean LIZ;
    public static boolean LIZIZ = MonitorDebugTool.isDebuggable();
    public static final boolean LIZJ = Log.isLoggable("HBMonitorSDK_V2", 3);
    public static InterfaceC1521740phc LIZLLL = new C1960107m3();

    public static String LIZLLL(String str) {
        if (TextUtils.isEmpty(str)) {
            return "HBMonitorSDK_V2";
        }
        if (!str.startsWith("HBMonitorSDK_V2")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HBMonitorSDK_V2_");
            sbLIZ.append(str);
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        int iMyPid = Process.myPid();
        int iMyTid = Process.myTid();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(e3.h);
        sbLIZ2.append(iMyPid);
        sbLIZ2.append("-");
        sbLIZ2.append(iMyTid);
        sbLIZ2.append(")");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static String LJ(WebView webView) {
        if (webView == null) {
            return "null";
        }
        return webView.getClass().toString();
    }

    public static void LIZ(String str, String str2) {
        if (LIZ) {
            if (LIZIZ || LIZJ) {
                LIZLLL.d(LIZLLL(str), str2);
            }
        }
    }

    public static void LIZIZ(String str, String str2) {
        if (!LIZ) {
            return;
        }
        LIZLLL.e(LIZLLL(str), str2);
    }

    public static void LJFF(String str, String str2) {
        if (!LIZ) {
            return;
        }
        LIZLLL.i(LIZLLL(str), str2);
    }

    public static void LJI(String str, String str2) {
        if (!LIZ) {
            return;
        }
        LIZLLL.w(LIZLLL(str), str2);
    }

    public static void LIZJ(String str, String str2, Throwable th) {
        if (!LIZ) {
            return;
        }
        LIZLLL.e(LIZLLL(str), str2, th);
    }
}
