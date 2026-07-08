package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.profile.business.profile.popup.outreach.model.EnterExitRuleInfo;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: renamed from: X.1Civ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238191Civ {
    public static final C2238191Civ LIZ = new C2238191Civ();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(242));

    public static Keva LIZJ() {
        return (Keva) LIZIZ.getValue();
    }

    public static EnterExitRuleInfo LIZIZ(String str) {
        Object c098200Yq;
        Keva kevaLIZJ = LIZJ();
        String strLIZ = LIZ("enter_exit_rule_info", str);
        Object obj = null;
        String string = kevaLIZJ.getString(strLIZ, null);
        if (string == null) {
            return null;
        }
        try {
            c098200Yq = (EnterExitRuleInfo) C1250210idf.LIZ(string, EnterExitRuleInfo.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (EnterExitRuleInfo) obj;
    }

    public static String LIZ(String str, String str2) {
        boolean z;
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
        if (str2 != null && str2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(str2);
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append('_');
        sbLIZ2.append(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static void LIZLLL(EnterExitRuleInfo enterExitRuleInfo, String str) {
        try {
            if (enterExitRuleInfo == null) {
                LIZJ().storeString(LIZ("enter_exit_rule_info", str), null);
            } else {
                LIZJ().storeString(LIZ("enter_exit_rule_info", str), C1250210idf.LIZIZ(enterExitRuleInfo));
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LJ(int i, String str) {
        LIZJ().storeInt(LIZ("not_click_times", str), i);
    }
}
