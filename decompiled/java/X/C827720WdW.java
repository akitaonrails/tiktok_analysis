package X;

import com.ss.android.agilelogger.ALog;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0WdW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C827720WdW {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZ(int i, String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str.length() + 100);
        sb.append(e3.e);
        sb.append(str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i);
        sb.append(e3.f);
        sb.append(str);
        String string = sb.toString();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("web_");
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        switch (str3.hashCode()) {
            case 3237038:
                if (str3.equals("info")) {
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI(strLIZIZ, string);
                    return;
                }
                break;
            case 3641990:
                if (str3.equals("warn")) {
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogW(strLIZIZ, string);
                    return;
                }
                break;
            case 95458899:
                if (str3.equals("debug")) {
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD(strLIZIZ, string);
                    return;
                }
                break;
            case 96784904:
                if (str3.equals("error")) {
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE(strLIZIZ, string);
                    return;
                }
                break;
            case 351107458:
                if (str3.equals("verbose")) {
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogV(strLIZIZ, string);
                    return;
                }
                break;
        }
        throw new IllegalArgumentException("Illegal level!");
    }
}
