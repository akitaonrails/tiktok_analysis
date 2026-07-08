package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0utk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1721460utk {
    public static final Map<Integer, Integer> LIZ = C2097608Jq.LJIIIIZZ(new Pair(Integer.valueOf(R.raw.icon_music_note_s_alt), Integer.valueOf(R.raw.icon_exp_exp_01_icon_music_note_s_alt)), new Pair(Integer.valueOf(R.raw.icon_bookmark), Integer.valueOf(R.raw.icon_exp_exp_01_icon_bookmark)), new Pair(Integer.valueOf(R.raw.icon_bookmark_eye), Integer.valueOf(R.raw.icon_exp_exp_01_icon_bookmark_eye)), new Pair(Integer.valueOf(R.raw.icon_effect), Integer.valueOf(R.raw.icon_exp_exp_03_icon_effect)), new Pair(Integer.valueOf(R.raw.icon_lock_small), Integer.valueOf(R.raw.icon_exp_exp_03_icon_lock_small)));

    public static Integer LIZ(String str, String str2) {
        StringBuilder sb = new StringBuilder("tux://font?");
        if (str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("token=");
            sbLIZ.append(str);
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("&from=profile-");
        sbLIZ2.append(str2);
        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        try {
            C01GW c01gw = C2248361CzK.LIZ;
            return C2248361CzK.LIZIZ(sb.toString());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD(C1721460utk.class.getName(), e.getMessage());
            return null;
        }
    }

    public static Integer LIZIZ(Context context, String str, String str2) {
        StringBuilder sb = new StringBuilder("tux://color?");
        if (str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("token=");
            sbLIZ.append(str);
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("&from=profile-");
        sbLIZ2.append(str2);
        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        try {
            C01GW c01gw = C2248361CzK.LIZ;
            return C2248361CzK.LJ(context, sb.toString());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD(C1721460utk.class.getName(), e.getMessage());
            return null;
        }
    }

    public static C698190Ra5 LIZJ(Context context, String str, String str2, String str3, String str4) {
        int iIntValue;
        StringBuilder sb = new StringBuilder("tux://icon?");
        if (str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("token=");
            sbLIZ.append(str);
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (str2 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("&color=");
            sbLIZ2.append(str2);
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (str3 != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("&from=profile-");
            sbLIZ3.append(str3);
            sb.append(C2188811AlT.LIZIZ(sbLIZ3));
        } else {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("&from=");
            sbLIZ4.append(str4);
            sb.append(C2188811AlT.LIZIZ(sbLIZ4));
        }
        try {
            C01GW c01gw = C2248361CzK.LIZ;
            C698190Ra5 c698190Ra5LJFF = C2248361CzK.LJFF(context, sb.toString());
            if (c698190Ra5LJFF != null) {
                Map<Integer, Integer> map = LIZ;
                if (map.containsKey(Integer.valueOf(c698190Ra5LJFF.LIZ))) {
                    Integer num = map.get(Integer.valueOf(c698190Ra5LJFF.LIZ));
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    return new C698190Ra5(iIntValue, c698190Ra5LJFF.LIZIZ);
                }
            }
            return c698190Ra5LJFF;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD(C1721460utk.class.getName(), e.getMessage());
            return null;
        }
    }
}
