package X;

import android.util.Log;
import com.ss.android.agilelogger.ALog;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1BPP, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BPP {
    public static final void LIZ(String str) {
        LIZJ(6, str, null);
    }

    public static final void LIZIZ(String str, Throwable th) {
        LIZJ(4, str, th);
    }

    public static final void LJ(String str) {
        LJFF(6, str, null);
    }

    public static String LIZLLL(String str) {
        if (u.LJJIIJZLJL(str, "[PIA]", false)) {
            return str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[PIA] ");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJI(String str) {
        String strLIZLLL = LIZLLL(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZLLL);
        sbLIZ.append(Log.getStackTraceString(null));
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogV("PiaCore", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZJ(int i, String str, Throwable th) {
        String str2 = null;
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            str2 = "PiaCore";
        }
        String strLIZLLL = LIZLLL(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZLLL);
        sbLIZ.append(Log.getStackTraceString(th));
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE(str2, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJFF(int i, String str, Throwable th) {
        String str2 = null;
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            str2 = "PiaCore";
        }
        String strLIZLLL = LIZLLL(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZLLL);
        sbLIZ.append(Log.getStackTraceString(th));
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI(str2, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJII(int i, String str, Throwable th) {
        String str2 = null;
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            str2 = "PiaCore";
        }
        String strLIZLLL = LIZLLL(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZLLL);
        sbLIZ.append(Log.getStackTraceString(th));
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogW(str2, C2188811AlT.LIZIZ(sbLIZ));
    }
}
