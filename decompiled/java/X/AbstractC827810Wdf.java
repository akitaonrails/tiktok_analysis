package X;

import com.ss.android.agilelogger.ALog;

/* JADX INFO: renamed from: X.0Wdf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC827810Wdf {
    public static volatile AbstractC827810Wdf LIZ;

    public AbstractC827810Wdf() {
        LIZ = this;
    }

    public static void LIZ(String str, String str2) {
        if (LIZ != null) {
            LIZ.getClass();
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD(str, str2);
        }
    }

    public static void LIZIZ(String str, String str2) {
        if (LIZ != null) {
            LIZ.getClass();
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE(str, str2);
        }
    }

    public static void LIZLLL(String str, String str2) {
        if (LIZ != null) {
            LIZ.getClass();
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI(str, str2);
        }
    }

    public static void LJ(String str, String str2) {
        if (LIZ != null) {
            LIZ.getClass();
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogW(str, str2);
        }
    }

    public static void LIZJ(String str, String str2, Throwable th) {
        if (LIZ != null) {
            LIZ.getClass();
            ALog.e(str, str2, th);
        }
    }
}
