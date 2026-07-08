package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.landscape.trafficincentives.OneMinuteTrafficIncentivesSettings;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.11XE, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11XE {
    public static String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("one_minute_traffic_incentives_");
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        sbLIZ.append(iAccountUserServiceLJFF != null ? ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurSecUserId() : null);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LIZIZ() {
        String str;
        String str2;
        String str3;
        Integer num;
        Integer num2;
        Integer num3;
        OneMinuteTrafficIncentivesSettings.OneMinuteTrafficProfileConfig oneMinuteTrafficProfileConfig = (OneMinuteTrafficIncentivesSettings.OneMinuteTrafficProfileConfig) SettingsManager.LIZLLL().LJIIIIZZ("1min_traffic_profile_config", OneMinuteTrafficIncentivesSettings.OneMinuteTrafficProfileConfig.class, OneMinuteTrafficIncentivesSettings.LIZ);
        Keva repo = Keva.getRepo(LIZ());
        if (oneMinuteTrafficProfileConfig == null || !Intrinsics.LJFF(oneMinuteTrafficProfileConfig.eligible, Boolean.TRUE) || (str = oneMinuteTrafficProfileConfig.h5Url) == null || str.length() == 0 || oneMinuteTrafficProfileConfig.maxShowTimes == null || oneMinuteTrafficProfileConfig.maxCloseTimes == null || oneMinuteTrafficProfileConfig.maxEnterTimes == null || oneMinuteTrafficProfileConfig.timeIntervalForAutoDismiss == null || (str2 = oneMinuteTrafficProfileConfig.text) == null || str2.length() == 0 || (str3 = oneMinuteTrafficProfileConfig.highlightText) == null || str3.length() == 0 || !a0.LJJIIZI(oneMinuteTrafficProfileConfig.text, oneMinuteTrafficProfileConfig.highlightText, false)) {
            return false;
        }
        if (repo.getInt("traffic_incentives_popup_show", 0) >= ((oneMinuteTrafficProfileConfig == null || (num3 = oneMinuteTrafficProfileConfig.maxShowTimes) == null) ? 0 : num3.intValue())) {
            return false;
        }
        if (repo.getInt("traffic_incentives_learn_more", 0) < ((oneMinuteTrafficProfileConfig == null || (num2 = oneMinuteTrafficProfileConfig.maxEnterTimes) == null) ? 0 : num2.intValue())) {
            return repo.getInt("traffic_incentives_close_click", 0) < ((oneMinuteTrafficProfileConfig == null || (num = oneMinuteTrafficProfileConfig.maxCloseTimes) == null) ? 0 : num.intValue());
        }
        return false;
    }
}
