package X;

import com.ss.android.ugc.aweme.im.common.setting.ActivityStatusConfig;
import com.ss.android.ugc.aweme.im.common.setting.ActivityStatusPerformanceConfig;
import com.ss.android.ugc.aweme.im.common.setting.IMUserPortraitDowngradeConfig;

/* JADX INFO: renamed from: X.1E8E, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E8E implements InterfaceC15512065m {
    public static final C1E8E LIZ = new C1E8E();
    public static boolean LIZIZ;

    static {
        ActivityStatusConfig activityStatusConfigLIZJ = LIZJ();
        Long l = LIZLLL().uiRefreshStatusInterval;
        long jLongValue = l != null ? l.longValue() : LIZJ().uiRefreshStatusInterval;
        Long l2 = LIZLLL().uiHighPriorityRefreshStatusInterval;
        long jLongValue2 = l2 != null ? l2.longValue() : LIZJ().uiHighPriorityRefreshStatusInterval;
        Long l3 = LIZLLL().statusReportInterval;
        long jLongValue3 = l3 != null ? l3.longValue() : LIZJ().statusReportInterval;
        Long l4 = LIZLLL().statusReportRequestDebounceInterval;
        long jLongValue4 = l4 != null ? l4.longValue() : LIZJ().statusReportRequestDebounceInterval;
        Long l5 = LIZLLL().statusCacheOfflineStatusExpireThreshold;
        long jLongValue5 = l5 != null ? l5.longValue() : LIZJ().statusCacheOfflineStatusExpireThreshold;
        Long l6 = LIZLLL().statusCacheOnlineStatusExpireThreshold;
        long jLongValue6 = l6 != null ? l6.longValue() : LIZJ().statusCacheOnlineStatusExpireThreshold;
        Long l7 = LIZLLL().statusCacheUnavailableStatusExpireThreshold;
        long jLongValue7 = l7 != null ? l7.longValue() : LIZJ().statusCacheUnavailableStatusExpireThreshold;
        Long l8 = LIZLLL().statusCacheRequestDebounceInterval;
        new ActivityStatusConfig(activityStatusConfigLIZJ.maxCacheSize, activityStatusConfigLIZJ.remoteBatchSize, activityStatusConfigLIZJ.numOfInboxSkyLightStatusLimitCount, jLongValue, jLongValue2, activityStatusConfigLIZJ.activeThreshold, activityStatusConfigLIZJ.statusCopyDisplayDateThreshold, activityStatusConfigLIZJ.statusCopyDisplayHourThreshold, activityStatusConfigLIZJ.statusCopyDisplayMinThreshold, activityStatusConfigLIZJ.statusCopyDisplayMsgTimeThreshold, jLongValue3, jLongValue4, jLongValue5, jLongValue6, jLongValue7, l8 != null ? l8.longValue() : LIZJ().statusCacheRequestDebounceInterval, activityStatusConfigLIZJ.inactiveThreshold, activityStatusConfigLIZJ.activityStatusChatPageCheckSamplingRate, activityStatusConfigLIZJ.activityStatusAccuracyAnalyticsEnable, activityStatusConfigLIZJ.mufLocalManageLimit, activityStatusConfigLIZJ.groupSentMessagePreviewThreshold, activityStatusConfigLIZJ.recentlyActiveThreshold, activityStatusConfigLIZJ.enableFetchAsReport);
    }

    public static ActivityStatusConfig LIZJ() {
        return (ActivityStatusConfig) C1E8F.LIZIZ.getValue();
    }

    public static ActivityStatusPerformanceConfig LIZLLL() {
        return LIZIZ ? ((IMUserPortraitDowngradeConfig) C0Z5N.LIZIZ.getValue()).activityStatusPerformanceConfig : (ActivityStatusPerformanceConfig) C1E8G.LIZIZ.getValue();
    }

    public static final long LIZIZ() {
        return LIZJ().activeThreshold;
    }

    public static final long LJ() {
        return LIZJ().statusCopyDisplayHourThreshold;
    }

    public static final long LJFF() {
        return LIZJ().statusCopyDisplayMinThreshold;
    }

    @Override // X.InterfaceC15512065m
    public final long LIZ() {
        return LIZJ().statusCopyDisplayDateThreshold;
    }
}
