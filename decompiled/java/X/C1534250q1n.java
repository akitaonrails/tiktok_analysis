package X;

import android.util.Log;
import com.bytedance.forest.Forest;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0q1n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534250q1n {
    public static final C1534250q1n LIZ = new C1534250q1n();

    public final void LJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[ProcessEnd:");
        sbLIZ.append("createOrGetCachePool");
        sbLIZ.append(']');
        LIZ(this, "ResponseCacheManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIIJ(Function0<C1535250q3P> function0) {
        Forest.Companion companion = Forest.Companion;
        if (companion.isDebug() || companion.getSupportLog$forest_release()) {
            C1535250q3P c1535250q3PInvoke = function0.invoke();
            String str = c1535250q3PInvoke.LIZ;
            String str2 = c1535250q3PInvoke.LIZIZ;
            String str3 = c1535250q3PInvoke.LIZJ;
            Map<String, Object> map = c1535250q3PInvoke.LIZLLL;
            getClass();
            LJIIIZ(str, str2, str3, map, false);
        }
    }

    public final void LJIILIIL(Function0<C1535250q3P> function0) {
        Forest.Companion companion = Forest.Companion;
        if (companion.isDebug() || companion.getSupportLog$forest_release()) {
            C1535250q3P c1535250q3PInvoke = function0.invoke();
            LJIIL(c1535250q3PInvoke.LIZ, c1535250q3PInvoke.LIZIZ);
        }
    }

    public final void LJIIL(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[ProcessStart:");
        sbLIZ.append(str2);
        sbLIZ.append(']');
        LIZ(this, str, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZ(C1534250q1n c1534250q1n, String str, String str2) {
        c1534250q1n.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Forest_");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static int LIZIZ(String str, String str2, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Forest_");
        sbLIZ.append(str);
        return Log.e(C2188811AlT.LIZIZ(sbLIZ), str2, th);
    }

    public static int LJII(String str, String str2, boolean z) {
        if (z) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Forest_");
                sbLIZ.append(str);
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI(C2188811AlT.LIZIZ(sbLIZ), str2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Forest_");
        sbLIZ2.append(str);
        return Log.i(C2188811AlT.LIZIZ(sbLIZ2), str2);
    }

    public static int LIZJ(String str, String str2, Throwable th, boolean z) {
        if (z) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Forest_");
                sbLIZ.append(str);
                ALog.e(C2188811AlT.LIZIZ(sbLIZ), str2, th);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Forest_");
        sbLIZ2.append(str);
        return Log.e(C2188811AlT.LIZIZ(sbLIZ2), str2, th);
    }

    public static void LJFF(String str, String str2, String str3, Throwable th, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[FatalError:");
        sbLIZ.append(str2);
        sbLIZ.append("] ");
        sbLIZ.append(str3);
        LIZJ(str, C2188811AlT.LIZIZ(sbLIZ), th, z);
    }

    public static void LJIIIZ(String str, String str2, String str3, Map map, boolean z) {
        StringBuilder sb = new StringBuilder("[KeyInfo:");
        sb.append(str2);
        sb.append("] ");
        String strLIZIZ = null;
        if (str3 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("msg = ");
            sbLIZ.append(str3);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        String str4 = "";
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        sb.append(strLIZIZ);
        sb.append(' ');
        if (map != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("extraRuntimeInfo = ");
            sbLIZ2.append(map);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            if (strLIZIZ2 != null) {
                str4 = strLIZIZ2;
            }
        }
        sb.append(str4);
        LJII(str, sb.toString(), z);
    }
}
