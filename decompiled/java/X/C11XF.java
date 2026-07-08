package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.landscape.weeklyreport.WeeklyReportIncentivesSettings;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.11XF, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11XF {
    public static String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("weekly_report_incentives_");
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        sbLIZ.append(iAccountUserServiceLJFF != null ? ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurSecUserId() : null);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LIZIZ() {
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        Integer num2;
        Integer num3;
        WeeklyReportIncentivesSettings.WeeklyReportProfileConfig weeklyReportProfileConfig = (WeeklyReportIncentivesSettings.WeeklyReportProfileConfig) SettingsManager.LIZLLL().LJIIIIZZ("1min_traffic_weekly_report_profile_config", WeeklyReportIncentivesSettings.WeeklyReportProfileConfig.class, WeeklyReportIncentivesSettings.LIZ);
        Keva repo = Keva.getRepo(LIZ());
        String str5 = weeklyReportProfileConfig != null ? weeklyReportProfileConfig.date : null;
        if (!(str5 == null || str5.length() == 0)) {
            if (!Intrinsics.LJFF(repo.getString("weekly_report_date", ""), weeklyReportProfileConfig != null ? weeklyReportProfileConfig.date : null)) {
                repo.storeString("weekly_report_date", weeklyReportProfileConfig != null ? weeklyReportProfileConfig.date : null);
                repo.storeInt("weekly_report_popup_show", 0);
                repo.storeInt("weekly_report_learn_more", 0);
                repo.storeInt("weekly_report_close_click", 0);
            }
        }
        if (weeklyReportProfileConfig == null || !Intrinsics.LJFF(weeklyReportProfileConfig.eligible, Boolean.TRUE) || (str = weeklyReportProfileConfig.h5Url) == null || str.length() == 0 || (str2 = weeklyReportProfileConfig.date) == null || str2.length() == 0 || weeklyReportProfileConfig.maxShowTimes == null || weeklyReportProfileConfig.maxCloseTimes == null || weeklyReportProfileConfig.maxEnterTimes == null || weeklyReportProfileConfig.timeIntervalForAutoDismiss == null || (str3 = weeklyReportProfileConfig.text) == null || str3.length() == 0 || (str4 = weeklyReportProfileConfig.highlightText) == null || str4.length() == 0 || !a0.LJJIIZI(weeklyReportProfileConfig.text, weeklyReportProfileConfig.highlightText, false)) {
            return false;
        }
        if (repo.getInt("weekly_report_popup_show", 0) >= ((weeklyReportProfileConfig == null || (num3 = weeklyReportProfileConfig.maxShowTimes) == null) ? 0 : num3.intValue())) {
            return false;
        }
        if (repo.getInt("weekly_report_learn_more", 0) < ((weeklyReportProfileConfig == null || (num2 = weeklyReportProfileConfig.maxEnterTimes) == null) ? 0 : num2.intValue())) {
            return repo.getInt("weekly_report_close_click", 0) < ((weeklyReportProfileConfig == null || (num = weeklyReportProfileConfig.maxCloseTimes) == null) ? 0 : num.intValue());
        }
        return false;
    }
}
