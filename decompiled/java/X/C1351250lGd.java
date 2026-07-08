package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.experiment.QuickCommentV2Config;
import com.ss.android.ugc.aweme.experiment.SocialQuickCommentStrategyAdjustConfig;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.Feed0CommentControlInfo;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.SocialCommentControlData;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.SocialCommentControlInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeCommentConfig;
import com.ss.android.ugc.aweme.feed.model.AwemeControl;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.QuickCommentConfig;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lGd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1351250lGd {
    public static final C1351250lGd LIZ = new C1351250lGd();
    public static final List<C1351320lGk> LIZIZ = new ArrayList();
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1351310lGj());
    public static final Map<String, SocialCommentControlInfo> LIZLLL = new LinkedHashMap();
    public static long LJ;
    public static int LJFF;
    public static Feed0CommentControlInfo LJI;

    public static Feed0CommentControlInfo LIZJ() {
        Feed0CommentControlInfo feed0CommentControlInfo = LJI;
        if (feed0CommentControlInfo != null) {
            return feed0CommentControlInfo;
        }
        Keva kevaLJFF = LJFF();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("feed_0_quick_comment_");
        sbLIZ.append(C461720I8s.LIZIZ());
        String string = kevaLJFF.getString(C2188811AlT.LIZIZ(sbLIZ), "");
        if (C866950Xzh.LIZ(string)) {
            try {
                LJI = (Feed0CommentControlInfo) C051M.LIZIZ(Feed0CommentControlInfo.class, string);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            LJI = new Feed0CommentControlInfo(0, 0L, 0, 0L, 0, 0);
        }
        return LJI;
    }

    public static Keva LJFF() {
        return (Keva) LIZJ.getValue();
    }

    public static int LJI() {
        int i = LJFF;
        if (i != 0) {
            return i;
        }
        Keva kevaLJFF = LJFF();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("social_comment_appear_times_");
        sbLIZ.append(C461720I8s.LIZIZ());
        int i2 = kevaLJFF.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
        LJFF = i2;
        return i2;
    }

    public static long LJII() {
        long j = LJ;
        if (j != 0) {
            return j;
        }
        Keva kevaLJFF = LJFF();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("social_comment_appear_timestamp_");
        sbLIZ.append(C461720I8s.LIZIZ());
        long j2 = kevaLJFF.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
        LJ = j2;
        return j2;
    }

    public static void LJJIFFI() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LJ = jCurrentTimeMillis;
        Keva kevaLJFF = LJFF();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("social_comment_appear_timestamp_");
        sbLIZ.append(C461720I8s.LIZIZ());
        kevaLJFF.storeLong(C2188811AlT.LIZIZ(sbLIZ), jCurrentTimeMillis);
    }

    public static boolean LIZIZ(Aweme aweme) {
        if (aweme == null || !((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return false;
        }
        AwemeControl awemeControl = aweme.getAwemeControl();
        if ((awemeControl != null && !awemeControl.canComment()) || aweme.isCmtSwt() || AwemeExtKt.isScheduleVideo(aweme)) {
            return false;
        }
        VideoControl videoControl = aweme.getVideoControl();
        if (videoControl != null && videoControl.timerStatus == 0) {
            return false;
        }
        CommentService.LIZ.getClass();
        CommentService commentServiceLIZ = C523420Kfs.LIZ();
        if (commentServiceLIZ.LJIILLIIL(aweme) || !commentServiceLIZ.LJJIJIIJIL(aweme)) {
            return false;
        }
        C735280Sso.LIZ.getClass();
        if (C735280Sso.LJFF(aweme) || C10EU.LJIIIIZZ()) {
            return false;
        }
        return true;
    }

    public static SocialCommentControlInfo LJIIIIZZ(String str) {
        Map<String, SocialCommentControlInfo> map = LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C461720I8s.LIZIZ());
        sbLIZ.append('_');
        sbLIZ.append(str);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        if (linkedHashMap.get(C2188811AlT.LIZIZ(sbLIZ)) != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C461720I8s.LIZIZ());
            sbLIZ2.append('_');
            sbLIZ2.append(str);
            return (SocialCommentControlInfo) linkedHashMap.get(C2188811AlT.LIZIZ(sbLIZ2));
        }
        Keva kevaLJFF = LJFF();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("social_quick_comment_");
        sbLIZ3.append(C461720I8s.LIZIZ());
        sbLIZ3.append('_');
        sbLIZ3.append(str);
        String string = kevaLJFF.getString(C2188811AlT.LIZIZ(sbLIZ3), "");
        if (C866950Xzh.LIZ(string)) {
            try {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(C461720I8s.LIZIZ());
                sbLIZ4.append('_');
                sbLIZ4.append(str);
                map.put(C2188811AlT.LIZIZ(sbLIZ4), (SocialCommentControlInfo) C051M.LIZIZ(SocialCommentControlInfo.class, string));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(C461720I8s.LIZIZ());
            sbLIZ5.append('_');
            sbLIZ5.append(str);
            map.put(C2188811AlT.LIZIZ(sbLIZ5), new SocialCommentControlInfo(0, 0L, 0));
        }
        Map<String, SocialCommentControlInfo> map2 = LIZLLL;
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append(C461720I8s.LIZIZ());
        sbLIZ6.append('_');
        sbLIZ6.append(str);
        return (SocialCommentControlInfo) ((LinkedHashMap) map2).get(C2188811AlT.LIZIZ(sbLIZ6));
    }

    public static EnumC1351150lGT LJIIIZ(Aweme aweme) {
        Object next;
        EnumC1351150lGT enumC1351150lGT;
        if (aweme == null) {
            return EnumC1351150lGT.DEFAULT;
        }
        Iterator it2 = ((ArrayList) LIZIZ).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((C1351320lGk) next).LIZ, aweme)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1351320lGk c1351320lGk = (C1351320lGk) next;
        if (c1351320lGk != null && (enumC1351150lGT = c1351320lGk.LIZIZ) != null) {
            return enumC1351150lGT;
        }
        return EnumC1351150lGT.DEFAULT;
    }

    public static boolean LJIIJ(Aweme aweme) {
        String aid;
        CommentService.LIZ.getClass();
        C523420Kfs.LIZ().LJZL();
        C1351200lGY c1351200lGY = C1351200lGY.LIZ;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        return c1351200lGY.get(aid).LIZIZ;
    }

    public static boolean LJIIJJI(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        for (Object obj : (ArrayList) LIZIZ) {
            if (Intrinsics.LJFF(((C1351320lGk) obj).LIZ, aweme)) {
                if (obj == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static boolean LJIIZILJ(Aweme aweme) {
        PhotoModeImageInfo photoModeImageInfo;
        if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && photoModeImageInfo.getHelpPostInfo() != null) {
            return true;
        }
        return false;
    }

    public static void LJJ(Feed0CommentControlInfo feed0CommentControlInfo) {
        Keva kevaLJFF = LJFF();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("feed_0_quick_comment_");
        sbLIZ.append(C461720I8s.LIZIZ());
        kevaLJFF.storeString(C2188811AlT.LIZIZ(sbLIZ), C051M.LJ(feed0CommentControlInfo, false));
    }

    public static void LJJI(int i) {
        LJFF = i;
        Keva kevaLJFF = LJFF();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("social_comment_appear_times_");
        sbLIZ.append(C461720I8s.LIZIZ());
        kevaLJFF.storeInt(C2188811AlT.LIZIZ(sbLIZ), i);
    }

    public static void LIZ(Aweme aweme, EnumC1351150lGT enumC1351150lGT) {
        if (aweme == null || aweme.getAid() == null) {
            return;
        }
        ((ArrayList) LIZIZ).add(new C1351320lGk(aweme, enumC1351150lGT));
    }

    public static String LIZLLL(Aweme aweme, String str) {
        int i;
        int i2;
        long j;
        int i3;
        int i4;
        if (!LJIIL(aweme, str)) {
            return null;
        }
        Feed0CommentControlInfo feed0CommentControlInfoLIZJ = LIZJ();
        int i5 = 0;
        if (feed0CommentControlInfoLIZJ != null) {
            i = feed0CommentControlInfoLIZJ.feed0CommentExit;
        } else {
            i = 0;
        }
        QuickCommentV2Config quickCommentV2ConfigLIZ = C1351290lGh.LIZ();
        if (quickCommentV2ConfigLIZ != null) {
            i2 = quickCommentV2ConfigLIZ.feed0CommentMaxExitTimes;
        } else {
            i2 = 0;
        }
        if (i >= i2) {
            return "qc_feed0_max_exit";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Feed0CommentControlInfo feed0CommentControlInfoLIZJ2 = LIZJ();
        long j2 = 0;
        if (feed0CommentControlInfoLIZJ2 != null) {
            j = feed0CommentControlInfoLIZJ2.feed0CommentExitTimestamp;
        } else {
            j = 0;
        }
        long j3 = jCurrentTimeMillis - j;
        QuickCommentV2Config quickCommentV2ConfigLIZ2 = C1351290lGh.LIZ();
        if (quickCommentV2ConfigLIZ2 != null) {
            i3 = quickCommentV2ConfigLIZ2.feed0CommentExitDays;
        } else {
            i3 = 0;
        }
        if (j3 <= ((long) i3) * 86400000) {
            return "qc_feed0_exit_cooldown";
        }
        Feed0CommentControlInfo feed0CommentControlInfoLIZJ3 = LIZJ();
        if (feed0CommentControlInfoLIZJ3 != null) {
            j2 = feed0CommentControlInfoLIZJ3.feed0CommentAppearTimestamp;
        }
        Feed0CommentControlInfo feed0CommentControlInfoLIZJ4 = LIZJ();
        if (feed0CommentControlInfoLIZJ4 != null) {
            i4 = feed0CommentControlInfoLIZJ4.feed0CommentAppearTimes;
        } else {
            i4 = 0;
        }
        QuickCommentV2Config quickCommentV2ConfigLIZ3 = C1351290lGh.LIZ();
        if (quickCommentV2ConfigLIZ3 != null) {
            i5 = quickCommentV2ConfigLIZ3.feed0CommentMaxAppearTimes;
        }
        if (i4 < i5 || System.currentTimeMillis() - j2 > 86400000) {
            return null;
        }
        return "qc_feed0_daily_cap";
    }

    public static List LJ(Context context, Aweme aweme) {
        boolean z;
        if (C418440Gaw.LJFF(C497820Jfg.LIZIZ(context), context) <= 360) {
            z = true;
        } else {
            z = false;
        }
        if (C1351290lGh.LIZIZ()) {
            CommentService.LIZ.getClass();
            return new ArrayList(C523420Kfs.LIZ().LJZ(aweme, z));
        }
        CommentService.LIZ.getClass();
        return new ArrayList(C523420Kfs.LIZ().LJLJL(z));
    }

    public static boolean LJIIL(Aweme aweme, String str) {
        if (!C1351290lGh.LIZLLL() || !Intrinsics.LJFF(str, "homepage_hot") || aweme == null) {
            return false;
        }
        User author = aweme.getAuthor();
        if (author != null && author.getFollowStatus() == 2 && (!C294360BgI.LIZ() || aweme == null)) {
            return false;
        }
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics == null || statistics.getCommentCount() != 0) {
            AwemeStatistics statistics2 = aweme.getStatistics();
            if (statistics2 == null) {
                return false;
            }
            long commentCount = statistics2.getCommentCount();
            if (((Number) C0AE8.LIZ.getValue()).intValue() <= 0 || commentCount > ((Number) r1.getValue()).intValue()) {
                return false;
            }
        }
        if (C729510SjV.LJJIIZ(aweme) || C729510SjV.LJJ(aweme)) {
            return false;
        }
        return true;
    }

    public static boolean LJIILJJIL(Aweme aweme, String str) {
        User author;
        if (!C1351290lGh.LJ() || !Intrinsics.LJFF(str, "homepage_hot") || aweme == null || (author = aweme.getAuthor()) == null || author.getFollowStatus() != 2 || C729510SjV.LJJIIZ(aweme) || C729510SjV.LJJ(aweme)) {
            return false;
        }
        return true;
    }

    public static boolean LJIILLIIL(Aweme aweme, String str) {
        AwemeStatistics statistics;
        if (!C1351270lGf.LIZLLL() || !LJIILJJIL(aweme, str) || (aweme != null && (statistics = aweme.getStatistics()) != null && statistics.getCommentCount() == 0)) {
            return false;
        }
        return true;
    }

    public static boolean LJIJI(String str, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        SocialCommentControlInfo socialCommentControlInfoLJIIIIZZ;
        SocialCommentControlInfo socialCommentControlInfoLJIIIIZZ2;
        SocialCommentControlInfo socialCommentControlInfoLJIIIIZZ3;
        SocialCommentControlInfo socialCommentControlInfoLJIIIIZZ4;
        if (str != null && (socialCommentControlInfoLJIIIIZZ4 = LJIIIIZZ(str)) != null) {
            i = socialCommentControlInfoLJIIIIZZ4.socialCommentExit;
        } else {
            i = 0;
        }
        QuickCommentV2Config quickCommentV2ConfigLIZ = C1351290lGh.LIZ();
        if (quickCommentV2ConfigLIZ != null) {
            i2 = quickCommentV2ConfigLIZ.socialCommentMaxExitTimes;
        } else {
            i2 = 0;
        }
        if (i >= i2) {
            return true;
        }
        if (str != null && (socialCommentControlInfoLJIIIIZZ3 = LJIIIIZZ(str)) != null) {
            i3 = socialCommentControlInfoLJIIIIZZ3.socialCommentNoClick;
        } else {
            i3 = 0;
        }
        QuickCommentV2Config quickCommentV2ConfigLIZ2 = C1351290lGh.LIZ();
        if (quickCommentV2ConfigLIZ2 != null) {
            i4 = quickCommentV2ConfigLIZ2.socialCommentClickExitLimit;
        } else {
            i4 = 0;
        }
        if (i3 >= i4 && z) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (str != null) {
                SocialCommentControlInfo socialCommentControlInfoLJIIIIZZ5 = LJIIIIZZ(str);
                if (socialCommentControlInfoLJIIIIZZ5 != null) {
                    socialCommentControlInfoLJIIIIZZ5.socialCommentExitTimestamp = jCurrentTimeMillis;
                    LIZ.getClass();
                    LJJII(str, socialCommentControlInfoLJIIIIZZ5);
                }
                int i7 = i + 1;
                if (str != null && (socialCommentControlInfoLJIIIIZZ2 = LJIIIIZZ(str)) != null) {
                    socialCommentControlInfoLJIIIIZZ2.socialCommentExit = i7;
                    LIZ.getClass();
                    LJJII(str, socialCommentControlInfoLJIIIIZZ2);
                }
            }
            LJJIII(0, str);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j = 0;
        if (str != null && (socialCommentControlInfoLJIIIIZZ = LJIIIIZZ(str)) != null) {
            j = socialCommentControlInfoLJIIIIZZ.socialCommentExitTimestamp;
        }
        long j2 = jCurrentTimeMillis2 - j;
        QuickCommentV2Config quickCommentV2ConfigLIZ3 = C1351290lGh.LIZ();
        if (quickCommentV2ConfigLIZ3 != null) {
            i5 = quickCommentV2ConfigLIZ3.socialCommentExitDays;
        } else {
            i5 = 0;
        }
        if (j2 <= ((long) i5) * 86400000) {
            return true;
        }
        long jLJII = LJII();
        int iLJI = LJI();
        QuickCommentV2Config quickCommentV2ConfigLIZ4 = C1351290lGh.LIZ();
        if (quickCommentV2ConfigLIZ4 != null) {
            i6 = quickCommentV2ConfigLIZ4.socialCommentMaxAppearTimes;
        } else {
            i6 = 0;
        }
        if (iLJI >= i6 && System.currentTimeMillis() - jLJII <= 86400000) {
            return true;
        }
        if (System.currentTimeMillis() - jLJII > 86400000 && z) {
            LJJI(0);
        }
        return false;
    }

    public static boolean LJIJJ(Aweme aweme, String str) {
        QuickCommentConfig quickCommentConfig;
        if (aweme == null || !C295380Bhw.LIZ() || aweme.isAd() || LJIIJ(aweme) || ComplianceServiceProvider.LJFF().LIZJ(3) || ComplianceServiceProvider.LJFF().LJFF() || !LIZIZ(aweme) || AwemeBizExtKt.getSharer(aweme) != null) {
            return false;
        }
        if (LJIIZILJ(aweme)) {
            return true;
        }
        AwemeCommentConfig commentConfig = aweme.getCommentConfig();
        if (commentConfig != null && (quickCommentConfig = commentConfig.quickCommentConfig) != null && Intrinsics.LJFF(quickCommentConfig.enabled, Boolean.FALSE)) {
            return false;
        }
        if (C1351290lGh.LIZIZ() && Intrinsics.LJFF(str, "homepage_hot")) {
            if (C294360BgI.LIZ()) {
                if (LJIILIIL(aweme, str, true) || LJIILL(aweme, str, true)) {
                    return true;
                }
            } else if (LJIILL(aweme, str, true) || LJIILIIL(aweme, str, true)) {
                return true;
            }
        } else {
            User author = aweme.getAuthor();
            if (author != null && author.getFollowStatus() == 2) {
                return true;
            }
        }
        return false;
    }

    public static void LJIJJLI(Aweme aweme, String str) {
        Feed0CommentControlInfo feed0CommentControlInfoLIZJ;
        String authorUid;
        SocialCommentControlInfo socialCommentControlInfoLJIIIIZZ;
        String authorUid2;
        SocialCommentControlInfo socialCommentControlInfoLJIIIIZZ2;
        if (C1351290lGh.LIZIZ() && C294360BgI.LIZ() && Intrinsics.LJFF(str, "homepage_hot")) {
            C1351250lGd c1351250lGd = LIZ;
            c1351250lGd.getClass();
            EnumC1351150lGT enumC1351150lGTLJIIIZ = LJIIIZ(aweme);
            if (enumC1351150lGTLJIIIZ == EnumC1351150lGT.ZERO_COMMENT) {
                Feed0CommentControlInfo feed0CommentControlInfoLIZJ2 = LIZJ();
                if (feed0CommentControlInfoLIZJ2 != null) {
                    feed0CommentControlInfoLIZJ2.feed0CommentNoClick = 0;
                    feed0CommentControlInfoLIZJ2.feed0CommentExitTimestamp = 0L;
                    feed0CommentControlInfoLIZJ2.feed0CommentExit = 0;
                    c1351250lGd.getClass();
                    LJJ(feed0CommentControlInfoLIZJ2);
                    return;
                }
                return;
            }
            if (enumC1351150lGTLJIIIZ != EnumC1351150lGT.DOUBLE_FOLLOW) {
                return;
            }
            if (LJIILLIIL(aweme, str)) {
                SocialCommentControlData socialCommentControlDataLIZ = C1351260lGe.LIZ();
                if (socialCommentControlDataLIZ == null) {
                    return;
                }
                socialCommentControlDataLIZ.socialCommentUnclickedAwemeList.clear();
                C1351260lGe.LJ(socialCommentControlDataLIZ);
                return;
            }
            if (aweme == null || (authorUid2 = AwemeExtKt.getAuthorUid(aweme)) == null || (socialCommentControlInfoLJIIIIZZ2 = LJIIIIZZ(authorUid2)) == null) {
                return;
            }
            socialCommentControlInfoLJIIIIZZ2.socialCommentNoClick = 0;
            socialCommentControlInfoLJIIIIZZ2.socialCommentExitTimestamp = 0L;
            socialCommentControlInfoLJIIIIZZ2.socialCommentExit = 0;
            c1351250lGd.getClass();
            LJJII(authorUid2, socialCommentControlInfoLJIIIIZZ2);
            return;
        }
        if (LJIILJJIL(aweme, str)) {
            if (LJIILLIIL(aweme, str)) {
                SocialCommentControlData socialCommentControlDataLIZ2 = C1351260lGe.LIZ();
                if (socialCommentControlDataLIZ2 == null) {
                    return;
                }
                socialCommentControlDataLIZ2.socialCommentUnclickedAwemeList.clear();
                C1351260lGe.LJ(socialCommentControlDataLIZ2);
                return;
            }
            if (aweme == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null || (socialCommentControlInfoLJIIIIZZ = LJIIIIZZ(authorUid)) == null) {
                return;
            }
            socialCommentControlInfoLJIIIIZZ.socialCommentNoClick = 0;
            socialCommentControlInfoLJIIIIZZ.socialCommentExitTimestamp = 0L;
            socialCommentControlInfoLJIIIIZZ.socialCommentExit = 0;
            LIZ.getClass();
            LJJII(authorUid, socialCommentControlInfoLJIIIIZZ);
            return;
        }
        if (!LJIIL(aweme, str) || (feed0CommentControlInfoLIZJ = LIZJ()) == null) {
            return;
        }
        feed0CommentControlInfoLIZJ.feed0CommentNoClick = 0;
        feed0CommentControlInfoLIZJ.feed0CommentExitTimestamp = 0L;
        feed0CommentControlInfoLIZJ.feed0CommentExit = 0;
        LIZ.getClass();
        LJJ(feed0CommentControlInfoLIZJ);
    }

    public static String LJIL(Aweme aweme, String str) {
        int i;
        int i2;
        int i3;
        SocialCommentControlInfo socialCommentControlInfoLJIIIIZZ;
        SocialCommentControlInfo socialCommentControlInfoLJIIIIZZ2;
        List arrayList;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        int i8;
        long j2 = 0;
        int i9 = 0;
        if (LJIILLIIL(aweme, str)) {
            String aid = aweme.getAid();
            if (aid == null || aid.length() == 0) {
                return "qc_social_freq_unknown";
            }
            LIZ.getClass();
            if (!LJIILLIIL(aweme, str)) {
                return "qc_social_freq_unknown";
            }
            if (!C1351260lGe.LIZLLL(aweme, str) && !C1351260lGe.LIZJ(aweme)) {
                return "qc_freq_interval";
            }
            SocialCommentControlData socialCommentControlDataLIZ = C1351260lGe.LIZ();
            if (socialCommentControlDataLIZ == null || (arrayList = socialCommentControlDataLIZ.socialCommentUnclickedAwemeList) == null) {
                arrayList = new ArrayList();
            }
            boolean zLJIIJJI = LJIIJJI(aweme);
            SocialCommentControlData socialCommentControlDataLIZ2 = C1351260lGe.LIZ();
            if (socialCommentControlDataLIZ2 != null) {
                i4 = socialCommentControlDataLIZ2.socialCommentExitCount;
            } else {
                i4 = 0;
            }
            SocialQuickCommentStrategyAdjustConfig socialQuickCommentStrategyAdjustConfigLIZJ = C1351270lGf.LIZJ();
            if (socialQuickCommentStrategyAdjustConfigLIZJ != null) {
                i5 = socialQuickCommentStrategyAdjustConfigLIZJ.socialCommentMaxExitTimes;
            } else {
                i5 = 0;
            }
            if (i4 >= i5 && !zLJIIJJI) {
                return "qc_freq_max_exit";
            }
            SocialQuickCommentStrategyAdjustConfig socialQuickCommentStrategyAdjustConfigLIZJ2 = C1351270lGf.LIZJ();
            if (socialQuickCommentStrategyAdjustConfigLIZJ2 != null) {
                i6 = socialQuickCommentStrategyAdjustConfigLIZJ2.socialCommentClickExitLimit;
            } else {
                i6 = 0;
            }
            if (arrayList.size() >= i6 && !zLJIIJJI) {
                SocialCommentControlData socialCommentControlDataLIZ3 = C1351260lGe.LIZ();
                if (socialCommentControlDataLIZ3 != null) {
                    j = socialCommentControlDataLIZ3.socialCommentExitTimestamp;
                } else {
                    j = 0;
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - j;
                SocialQuickCommentStrategyAdjustConfig socialQuickCommentStrategyAdjustConfigLIZJ3 = C1351270lGf.LIZJ();
                if (socialQuickCommentStrategyAdjustConfigLIZJ3 != null) {
                    i8 = socialQuickCommentStrategyAdjustConfigLIZJ3.socialCommentExitDays;
                } else {
                    i8 = 0;
                }
                if (jCurrentTimeMillis < ((long) i8) * 86400000) {
                    return "qc_freq_exit_cooldown";
                }
            }
            SocialCommentControlData socialCommentControlDataLIZ4 = C1351260lGe.LIZ();
            if (socialCommentControlDataLIZ4 != null) {
                j2 = socialCommentControlDataLIZ4.socialCommentDailyFirstAppearTimestamp;
            }
            SocialCommentControlData socialCommentControlDataLIZ5 = C1351260lGe.LIZ();
            if (socialCommentControlDataLIZ5 != null) {
                i7 = socialCommentControlDataLIZ5.socialCommentDailyAppearTimes;
            } else {
                i7 = 0;
            }
            SocialQuickCommentStrategyAdjustConfig socialQuickCommentStrategyAdjustConfigLIZJ4 = C1351270lGf.LIZJ();
            if (socialQuickCommentStrategyAdjustConfigLIZJ4 != null) {
                i9 = socialQuickCommentStrategyAdjustConfigLIZJ4.socialCommentMaxAppearTimes;
            }
            if (i7 < i9 || System.currentTimeMillis() - j2 >= 86400000) {
                return "qc_social_freq_unknown";
            }
            return "qc_freq_daily_cap";
        }
        String authorUid = AwemeExtKt.getAuthorUid(aweme);
        if (authorUid != null && (socialCommentControlInfoLJIIIIZZ2 = LJIIIIZZ(authorUid)) != null) {
            i = socialCommentControlInfoLJIIIIZZ2.socialCommentExit;
        } else {
            i = 0;
        }
        QuickCommentV2Config quickCommentV2ConfigLIZ = C1351290lGh.LIZ();
        if (quickCommentV2ConfigLIZ != null) {
            i2 = quickCommentV2ConfigLIZ.socialCommentMaxExitTimes;
        } else {
            i2 = 0;
        }
        if (i >= i2) {
            return "qc_legacy_social_max_exit";
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (authorUid != null && (socialCommentControlInfoLJIIIIZZ = LJIIIIZZ(authorUid)) != null) {
            j2 = socialCommentControlInfoLJIIIIZZ.socialCommentExitTimestamp;
        }
        long j3 = jCurrentTimeMillis2 - j2;
        QuickCommentV2Config quickCommentV2ConfigLIZ2 = C1351290lGh.LIZ();
        if (quickCommentV2ConfigLIZ2 != null) {
            i3 = quickCommentV2ConfigLIZ2.socialCommentExitDays;
        } else {
            i3 = 0;
        }
        if (j3 <= ((long) i3) * 86400000) {
            return "qc_legacy_social_cooldown";
        }
        long jLJII = LJII();
        int iLJI = LJI();
        QuickCommentV2Config quickCommentV2ConfigLIZ3 = C1351290lGh.LIZ();
        if (quickCommentV2ConfigLIZ3 != null) {
            i9 = quickCommentV2ConfigLIZ3.socialCommentMaxAppearTimes;
        }
        if (iLJI < i9 || System.currentTimeMillis() - jLJII > 86400000) {
            return "qc_social_freq_unknown";
        }
        return "qc_legacy_social_daily_cap";
    }

    public static void LJJII(String str, SocialCommentControlInfo socialCommentControlInfo) {
        Keva kevaLJFF = LJFF();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("social_quick_comment_");
        sbLIZ.append(C461720I8s.LIZIZ());
        sbLIZ.append('_');
        sbLIZ.append(str);
        kevaLJFF.storeString(C2188811AlT.LIZIZ(sbLIZ), C051M.LJ(socialCommentControlInfo, false));
    }

    public static void LJJIII(int i, String str) {
        SocialCommentControlInfo socialCommentControlInfoLJIIIIZZ;
        if (str != null && (socialCommentControlInfoLJIIIIZZ = LJIIIIZZ(str)) != null) {
            socialCommentControlInfoLJIIIIZZ.socialCommentNoClick = i;
            LIZ.getClass();
            LJJII(str, socialCommentControlInfoLJIIIIZZ);
        }
    }

    public static void LJJIIJ(Aweme aweme, String str) {
        SocialCommentControlInfo socialCommentControlInfoLJIIIIZZ;
        int i;
        Feed0CommentControlInfo feed0CommentControlInfoLIZJ;
        if (!LJIIZILJ(aweme) && C1351290lGh.LIZIZ() && Intrinsics.LJFF(str, "homepage_hot") && !LJIIJJI(aweme)) {
            LIZ(aweme, EnumC1351150lGT.DEFAULT);
            int i2 = 0;
            if (LJIIL(aweme, str)) {
                Feed0CommentControlInfo feed0CommentControlInfoLIZJ2 = LIZJ();
                if (feed0CommentControlInfoLIZJ2 != null) {
                    i = feed0CommentControlInfoLIZJ2.feed0CommentNoClick;
                } else {
                    i = 0;
                }
                int i3 = i + 1;
                Feed0CommentControlInfo feed0CommentControlInfoLIZJ3 = LIZJ();
                if (feed0CommentControlInfoLIZJ3 != null) {
                    feed0CommentControlInfoLIZJ3.feed0CommentNoClick = i3;
                    LIZ.getClass();
                    LJJ(feed0CommentControlInfoLIZJ3);
                }
                Feed0CommentControlInfo feed0CommentControlInfoLIZJ4 = LIZJ();
                if ((feed0CommentControlInfoLIZJ4 == null || (i2 = feed0CommentControlInfoLIZJ4.feed0CommentAppearTimes) == 0) && (feed0CommentControlInfoLIZJ = LIZJ()) != null) {
                    feed0CommentControlInfoLIZJ.feed0CommentAppearTimestamp = System.currentTimeMillis();
                    LIZ.getClass();
                    LJJ(feed0CommentControlInfoLIZJ);
                }
                int i4 = i2 + 1;
                Feed0CommentControlInfo feed0CommentControlInfoLIZJ5 = LIZJ();
                if (feed0CommentControlInfoLIZJ5 != null) {
                    feed0CommentControlInfoLIZJ5.feed0CommentAppearTimes = i4;
                    LIZ.getClass();
                    LJJ(feed0CommentControlInfoLIZJ5);
                    return;
                }
                return;
            }
            if (!LJIILJJIL(aweme, str)) {
                return;
            }
            if (LJIILLIIL(aweme, str)) {
                C1351260lGe.LJFF(aweme);
                return;
            }
            String authorUid = null;
            if (aweme != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme);
                String authorUid2 = AwemeExtKt.getAuthorUid(aweme);
                if (authorUid2 != null && (socialCommentControlInfoLJIIIIZZ = LJIIIIZZ(authorUid2)) != null) {
                    i2 = socialCommentControlInfoLJIIIIZZ.socialCommentNoClick;
                }
            }
            LJJIII(i2 + 1, authorUid);
            int iLJI = LJI();
            if (iLJI == 0) {
                LJJIFFI();
            }
            LJJI(iLJI + 1);
        }
    }

    public static void LJJIIZ(Aweme aweme, EnumC1351150lGT enumC1351150lGT) {
        if (aweme == null || aweme.getAid() == null) {
            return;
        }
        List<C1351320lGk> list = LIZIZ;
        C19719612Di.LJJIIJ(list, new AwS600S0100000_21(aweme, 290), true);
        ((ArrayList) list).add(new C1351320lGk(aweme, enumC1351150lGT));
    }

    public static boolean LJIILIIL(Aweme aweme, String str, boolean z) {
        if (LJIIL(aweme, str) && !LJIJ(aweme, str, z)) {
            return true;
        }
        return false;
    }

    public static boolean LJIILL(Aweme aweme, String str, boolean z) {
        String authorUid;
        boolean zLJIJI;
        if (LJIILJJIL(aweme, str)) {
            if (LJIILLIIL(aweme, str)) {
                zLJIJI = C1351260lGe.LIZIZ(aweme, str);
            } else {
                if (aweme != null) {
                    authorUid = AwemeExtKt.getAuthorUid(aweme);
                } else {
                    authorUid = null;
                }
                zLJIJI = LJIJI(authorUid, z);
            }
            if (!zLJIJI) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJIJ(Aweme aweme, String str, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        int i7;
        Feed0CommentControlInfo feed0CommentControlInfoLIZJ;
        int i8;
        String aid;
        String authorUid;
        String string;
        String str2;
        int i9;
        User author;
        String string2;
        AwemeStatistics statistics;
        User author2;
        Feed0CommentControlInfo feed0CommentControlInfoLIZJ2 = LIZJ();
        if (feed0CommentControlInfoLIZJ2 != null) {
            i = feed0CommentControlInfoLIZJ2.feed0CommentExit;
        } else {
            i = 0;
        }
        QuickCommentV2Config quickCommentV2ConfigLIZ = C1351290lGh.LIZ();
        if (quickCommentV2ConfigLIZ != null) {
            i2 = quickCommentV2ConfigLIZ.feed0CommentMaxExitTimes;
        } else {
            i2 = 0;
        }
        if (i >= i2) {
            return true;
        }
        Feed0CommentControlInfo feed0CommentControlInfoLIZJ3 = LIZJ();
        if (feed0CommentControlInfoLIZJ3 != null) {
            i3 = feed0CommentControlInfoLIZJ3.feed0CommentNoClick;
        } else {
            i3 = 0;
        }
        QuickCommentV2Config quickCommentV2ConfigLIZ2 = C1351290lGh.LIZ();
        if (quickCommentV2ConfigLIZ2 != null) {
            i4 = quickCommentV2ConfigLIZ2.feed0CommentClickExitLimit;
        } else {
            i4 = 0;
        }
        long j2 = 0;
        if (i3 >= i4 && z) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Feed0CommentControlInfo feed0CommentControlInfoLIZJ4 = LIZJ();
            if (feed0CommentControlInfoLIZJ4 != null) {
                feed0CommentControlInfoLIZJ4.feed0CommentExitTimestamp = jCurrentTimeMillis;
                LIZ.getClass();
                LJJ(feed0CommentControlInfoLIZJ4);
            }
            int i10 = i + 1;
            Feed0CommentControlInfo feed0CommentControlInfoLIZJ5 = LIZJ();
            if (feed0CommentControlInfoLIZJ5 != null) {
                feed0CommentControlInfoLIZJ5.feed0CommentExit = i10;
                LIZ.getClass();
                LJJ(feed0CommentControlInfoLIZJ5);
            }
            Feed0CommentControlInfo feed0CommentControlInfoLIZJ6 = LIZJ();
            if (feed0CommentControlInfoLIZJ6 != null) {
                feed0CommentControlInfoLIZJ6.feed0CommentNoClick = 0;
                LIZ.getClass();
                LJJ(feed0CommentControlInfoLIZJ6);
            }
            Feed0CommentControlInfo feed0CommentControlInfoLIZJ7 = LIZJ();
            if (feed0CommentControlInfoLIZJ7 != null) {
                i8 = feed0CommentControlInfoLIZJ7.feed0CommentTriggerThreshold;
            } else {
                i8 = 0;
            }
            int i11 = i8 + 1;
            Feed0CommentControlInfo feed0CommentControlInfoLIZJ8 = LIZJ();
            if (feed0CommentControlInfoLIZJ8 != null) {
                feed0CommentControlInfoLIZJ8.feed0CommentTriggerThreshold = i11;
                LIZ.getClass();
                LJJ(feed0CommentControlInfoLIZJ8);
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            String str3 = "";
            if (str == null) {
                str = "";
            }
            c2344009Gk.LJIIIIZZ("enter_from", str);
            if (aweme == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            c2344009Gk.LJIIIIZZ("group_id", aid);
            if (aweme == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
                authorUid = "";
            }
            c2344009Gk.LJIIIIZZ("author_id", authorUid);
            if (aweme == null || (author2 = aweme.getAuthor()) == null || (string = Integer.valueOf(author2.getFollowStatus()).toString()) == null) {
                string = "";
            }
            c2344009Gk.LJIIIIZZ("follow_status", string);
            if (aweme != null && (statistics = aweme.getStatistics()) != null && statistics.getCommentCount() == 0) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("is_zero_comment", str2);
            if (aweme != null && (author = aweme.getAuthor()) != null && (string2 = Integer.valueOf(author.getFollowerStatus()).toString()) != null) {
                str3 = string2;
            }
            c2344009Gk.LJIIIIZZ("relation_tag", str3);
            String predictedAgeGroup = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getPredictedAgeGroup();
            if (predictedAgeGroup == null) {
                predictedAgeGroup = "-1";
            }
            c2344009Gk.LJIIIIZZ("user_level", predictedAgeGroup);
            Feed0CommentControlInfo feed0CommentControlInfoLIZJ9 = LIZJ();
            if (feed0CommentControlInfoLIZJ9 != null) {
                i9 = feed0CommentControlInfoLIZJ9.feed0CommentTriggerThreshold;
            } else {
                i9 = 0;
            }
            c2344009Gk.LIZJ(i9, "activate_cnt");
            C20684815ws.LJIILLIIL("quick_comment_threshold_activate", c2344009Gk.LIZ);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        Feed0CommentControlInfo feed0CommentControlInfoLIZJ10 = LIZJ();
        if (feed0CommentControlInfoLIZJ10 != null) {
            j = feed0CommentControlInfoLIZJ10.feed0CommentExitTimestamp;
        } else {
            j = 0;
        }
        long j3 = jCurrentTimeMillis2 - j;
        QuickCommentV2Config quickCommentV2ConfigLIZ3 = C1351290lGh.LIZ();
        if (quickCommentV2ConfigLIZ3 != null) {
            i5 = quickCommentV2ConfigLIZ3.feed0CommentExitDays;
        } else {
            i5 = 0;
        }
        if (j3 <= ((long) i5) * 86400000) {
            return true;
        }
        Feed0CommentControlInfo feed0CommentControlInfoLIZJ11 = LIZJ();
        if (feed0CommentControlInfoLIZJ11 != null) {
            j2 = feed0CommentControlInfoLIZJ11.feed0CommentAppearTimestamp;
        }
        Feed0CommentControlInfo feed0CommentControlInfoLIZJ12 = LIZJ();
        if (feed0CommentControlInfoLIZJ12 != null) {
            i6 = feed0CommentControlInfoLIZJ12.feed0CommentAppearTimes;
        } else {
            i6 = 0;
        }
        QuickCommentV2Config quickCommentV2ConfigLIZ4 = C1351290lGh.LIZ();
        if (quickCommentV2ConfigLIZ4 != null) {
            i7 = quickCommentV2ConfigLIZ4.feed0CommentMaxAppearTimes;
        } else {
            i7 = 0;
        }
        if (i6 >= i7 && System.currentTimeMillis() - j2 <= 86400000) {
            return true;
        }
        if (System.currentTimeMillis() - j2 > 86400000 && z && (feed0CommentControlInfoLIZJ = LIZJ()) != null) {
            feed0CommentControlInfoLIZJ.feed0CommentAppearTimes = 0;
            LIZ.getClass();
            LJJ(feed0CommentControlInfoLIZJ);
        }
        return false;
    }

    public static void LJJIIJZLJL(Aweme aweme, String str, EnumC1351150lGT enumC1351150lGT) {
        boolean z;
        EnumC1351150lGT enumC1351150lGT2;
        SocialCommentControlInfo socialCommentControlInfoLJIIIIZZ;
        EnumC1351150lGT enumC1351150lGT3;
        int i;
        Feed0CommentControlInfo feed0CommentControlInfoLIZJ;
        if (!LJIIZILJ(aweme) && C1351290lGh.LIZIZ() && Intrinsics.LJFF(str, "homepage_hot")) {
            int i2 = 0;
            if (enumC1351150lGT != LJIIIZ(aweme)) {
                z = true;
            } else {
                z = false;
            }
            if (LJIILIIL(aweme, str, false) && enumC1351150lGT == (enumC1351150lGT3 = EnumC1351150lGT.ZERO_COMMENT)) {
                if (z) {
                    Feed0CommentControlInfo feed0CommentControlInfoLIZJ2 = LIZJ();
                    if (feed0CommentControlInfoLIZJ2 != null) {
                        i = feed0CommentControlInfoLIZJ2.feed0CommentNoClick;
                    } else {
                        i = 0;
                    }
                    int i3 = i + 1;
                    Feed0CommentControlInfo feed0CommentControlInfoLIZJ3 = LIZJ();
                    if (feed0CommentControlInfoLIZJ3 != null) {
                        feed0CommentControlInfoLIZJ3.feed0CommentNoClick = i3;
                        LIZ.getClass();
                        LJJ(feed0CommentControlInfoLIZJ3);
                    }
                    Feed0CommentControlInfo feed0CommentControlInfoLIZJ4 = LIZJ();
                    if ((feed0CommentControlInfoLIZJ4 == null || (i2 = feed0CommentControlInfoLIZJ4.feed0CommentAppearTimes) == 0) && (feed0CommentControlInfoLIZJ = LIZJ()) != null) {
                        feed0CommentControlInfoLIZJ.feed0CommentAppearTimestamp = System.currentTimeMillis();
                        LIZ.getClass();
                        LJJ(feed0CommentControlInfoLIZJ);
                    }
                    int i4 = i2 + 1;
                    Feed0CommentControlInfo feed0CommentControlInfoLIZJ5 = LIZJ();
                    if (feed0CommentControlInfoLIZJ5 != null) {
                        feed0CommentControlInfoLIZJ5.feed0CommentAppearTimes = i4;
                        LIZ.getClass();
                        LJJ(feed0CommentControlInfoLIZJ5);
                    }
                    LIZ(aweme, enumC1351150lGT3);
                    return;
                }
                LJJIIZ(aweme, enumC1351150lGT);
                return;
            }
            if (!LJIILJJIL(aweme, str) || enumC1351150lGT != (enumC1351150lGT2 = EnumC1351150lGT.DOUBLE_FOLLOW)) {
                return;
            }
            if (z) {
                LIZ(aweme, enumC1351150lGT2);
                if (LJIILLIIL(aweme, str)) {
                    C1351260lGe.LJFF(aweme);
                    return;
                }
                String authorUid = null;
                if (aweme != null) {
                    authorUid = AwemeExtKt.getAuthorUid(aweme);
                    String authorUid2 = AwemeExtKt.getAuthorUid(aweme);
                    if (authorUid2 != null && (socialCommentControlInfoLJIIIIZZ = LJIIIIZZ(authorUid2)) != null) {
                        i2 = socialCommentControlInfoLJIIIIZZ.socialCommentNoClick;
                    }
                }
                LJJIII(i2 + 1, authorUid);
                int iLJI = LJI();
                if (iLJI == 0) {
                    LJJIFFI();
                }
                LJJI(iLJI + 1);
                return;
            }
            LJJIIZ(aweme, enumC1351150lGT);
        }
    }
}
