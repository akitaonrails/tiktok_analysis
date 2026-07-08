package X;

import com.ss.android.ugc.aweme.comment.experiment.VideoViewerMaxFollowersConfig;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.util.Date;

/* JADX INFO: renamed from: X.0TNQ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TNQ {
    public static final C0TNQ LIZ = new C0TNQ();
    public static boolean LIZIZ = true;

    public static final boolean LIZ() {
        int iIntValue = ((Number) C074P.LIZ.getValue()).intValue();
        LIZ.getClass();
        int iLIZJ = C0TSK.LIZJ(4, LJ("local_pop_up_show_frequency"), 0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("autoShowAuthPopUpIfNeed count:");
        sbLIZ.append(iIntValue);
        sbLIZ.append("  local:");
        sbLIZ.append(iLIZJ);
        C2188811AlT.LIZIZ(sbLIZ);
        return iLIZJ < iIntValue;
    }

    public static final boolean LIZJ() {
        C0CNY.LIZ.getClass();
        if (!C0CNY.LIZ()) {
            return false;
        }
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        return (curUser != null ? curUser.historyMaxFollowerCount : 0) < ((VideoViewerMaxFollowersConfig) C0TNS.LIZIZ.getValue()).enabledMaxFollowers && !C1336205Ku.LIZJ().LIZJ();
    }

    public static boolean LJII() {
        long jLIZLLL = C0TSK.LIZLLL(LJ("last_show_time"));
        long jLIZLLL2 = C0TSK.LIZLLL(LJ("last_click_tips_time"));
        boolean z = LIZIZ(jLIZLLL, System.currentTimeMillis()) == 1;
        boolean z2 = LIZIZ(jLIZLLL2, System.currentTimeMillis()) != 1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showTipsIfNeed isTheSameDayAndNotClickYet showInSameDay:[{");
        sbLIZ.append(z);
        sbLIZ.append("}] hasNotClickToday:[");
        sbLIZ.append(z2);
        sbLIZ.append(']');
        C1344030l4z.LIZJ("VideoViewerAuthControlHelper", C2188811AlT.LIZIZ(sbLIZ));
        return z && z2;
    }

    public static final boolean LJIIIZ() {
        C1344030l4z.LIZJ("VideoViewerAuthControlHelper", "showTipsIfNeed");
        if (LIZ()) {
            C1344030l4z.LIZJ("VideoViewerAuthControlHelper", "showTipsIfNeed hasNotShowAuto");
            return false;
        }
        if (!LIZIZ) {
            C1344030l4z.LIZJ("VideoViewerAuthControlHelper", "showTipsIfNeed isFirstBootBeforeShowTips is false");
            return false;
        }
        LIZ.getClass();
        int iLIZJ = C0TSK.LIZJ(4, LJ("local_tips_show_frequency"), 0);
        if (iLIZJ == C0TNR.LIZ().maxTimes && LJII()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("times:[");
            sbLIZ.append(iLIZJ);
            sbLIZ.append("] == maxtime:[");
            sbLIZ.append(C0TNR.LIZ().maxTimes);
            sbLIZ.append("] but isTheSameDayAndNotClickYet");
            C1344030l4z.LIZJ("VideoViewerAuthControlHelper", C2188811AlT.LIZIZ(sbLIZ));
            return true;
        }
        if (iLIZJ >= C0TNR.LIZ().maxTimes) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("showTipsIfNeed over current:[");
            sbLIZ2.append(iLIZJ);
            sbLIZ2.append("]  max:[");
            sbLIZ2.append(C0TNR.LIZ().maxTimes);
            sbLIZ2.append(']');
            C1344030l4z.LIZJ("VideoViewerAuthControlHelper", C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
        if (LJII()) {
            return true;
        }
        if (C0TSK.LIZLLL(LJ("last_show_time")) <= 0) {
            C1344030l4z.LIZJ("VideoViewerAuthControlHelper", "showTipsIfNeed isNeverShowBefore");
            return true;
        }
        long jLIZIZ = LIZIZ(C0TSK.LIZLLL(LJ("last_show_time")), System.currentTimeMillis());
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("inMaxInterval runningDays:[");
        sbLIZ3.append(jLIZIZ);
        sbLIZ3.append("]  intervalDays:[");
        sbLIZ3.append(C0TNR.LIZ().intervalDays);
        sbLIZ3.append(']');
        C1344030l4z.LIZJ("VideoViewerAuthControlHelper", C2188811AlT.LIZIZ(sbLIZ3));
        boolean z = jLIZIZ <= ((long) C0TNR.LIZ().intervalDays);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("showTipsIfNeed interval:");
        sbLIZ4.append(C0TNR.LIZ().intervalDays);
        sbLIZ4.append(" isInterval:");
        sbLIZ4.append(z);
        C2188811AlT.LIZIZ(sbLIZ4);
        return !z;
    }

    public static final boolean LJFF() {
        Integer numLIZ;
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ = ((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LJIIIIZZ();
        return (privacyUserSettingsV2LJIIIIZZ == null || (numLIZ = privacyUserSettingsV2LJIIIIZZ.LIZ("video_view_history")) == null || numLIZ.intValue() != 1) ? false : true;
    }

    public static final long LIZLLL(Aweme aweme) {
        AwemeStatistics statistics;
        if (aweme != null && (statistics = aweme.getStatistics()) != null) {
            return statistics.getPlayCount();
        }
        return 0L;
    }

    public static String LJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final boolean LJI(Aweme aweme) {
        if (aweme == null || !C0XQ7.LJFF().LIZJ(AwemeExtKt.getAuthorUid(aweme))) {
            return false;
        }
        return LIZJ();
    }

    public static final boolean LJIIIIZZ(Aweme aweme) {
        String aid;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Long lValueOf = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(" isVideoWithin7Days createTime: ");
        if (aweme != null) {
            lValueOf = Long.valueOf(aweme.getCreateTime());
        }
        sbLIZ.append(lValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (aweme == null || System.currentTimeMillis() - (aweme.getCreateTime() * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) > 604800000) {
            return false;
        }
        return true;
    }

    public static final long LIZIZ(long j, long j2) {
        long j3 = 86400000;
        long j4 = (j2 - j) / j3;
        long j5 = j4 + 1;
        if (new Date(j + (j3 * j4)).getDay() != new Date(j2).getDay()) {
            return j5 + 1;
        }
        return j5;
    }
}
