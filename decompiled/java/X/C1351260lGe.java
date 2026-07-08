package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.SocialQuickCommentStrategyAdjustConfig;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.SocialCommentControlData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0lGe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1351260lGe {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(494));
    public static final Map<String, SocialCommentControlData> LIZIZ = new LinkedHashMap();

    static {
        new LinkedHashMap();
    }

    public static SocialCommentControlData LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("social_quick_comment_");
        sbLIZ.append(C461720I8s.LIZIZ());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Map<String, SocialCommentControlData> map = LIZIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        if (linkedHashMap.get(strLIZIZ) != null) {
            return (SocialCommentControlData) linkedHashMap.get(strLIZIZ);
        }
        String string = ((Keva) LIZ.getValue()).getString(strLIZIZ, "");
        if (C1533950q1J.LJ(string)) {
            try {
                map.put(strLIZIZ, (SocialCommentControlData) C051M.LIZIZ(SocialCommentControlData.class, string));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getSocialCommentControlData error: ");
                sbLIZ2.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ2);
            }
        } else {
            map.put(strLIZIZ, new SocialCommentControlData(0L, 0, 0L, 0, 0L, 0, new ArrayList(), 0L));
        }
        return (SocialCommentControlData) ((LinkedHashMap) LIZIZ).get(strLIZIZ);
    }

    public static boolean LIZJ(Aweme aweme) {
        long j;
        int i;
        String aid;
        User author;
        SocialCommentControlData socialCommentControlDataLIZ = LIZ();
        if (socialCommentControlDataLIZ != null) {
            j = socialCommentControlDataLIZ.lastShowTimestamp;
        } else {
            j = 0;
        }
        C1351250lGd.LIZ.getClass();
        boolean zLJIIJJI = C1351250lGd.LJIIJJI(aweme);
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        SocialQuickCommentStrategyAdjustConfig socialQuickCommentStrategyAdjustConfigLIZJ = C1351270lGf.LIZJ();
        if (socialQuickCommentStrategyAdjustConfigLIZJ != null) {
            i = socialQuickCommentStrategyAdjustConfigLIZJ.socialCommentDisplayInterval;
        } else {
            i = 0;
        }
        if (jCurrentTimeMillis < ((long) i) * 1000 && !zLJIIJJI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("intercept,aid:");
            String nickname = null;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            sbLIZ.append(",nickName:");
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                nickname = author.getNickname();
            }
            sbLIZ.append(nickname);
            sbLIZ.append(",return,less than display interval");
            C2188811AlT.LIZIZ(sbLIZ);
            return false;
        }
        return true;
    }

    public static void LJ(SocialCommentControlData socialCommentControlData) {
        try {
            Keva keva = (Keva) LIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("social_quick_comment_");
            sbLIZ.append(C461720I8s.LIZIZ());
            keva.storeString(C2188811AlT.LIZIZ(sbLIZ), C051M.LJ(socialCommentControlData, false));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJFF(Aweme aweme) {
        long j;
        List<String> arrayList;
        SocialCommentControlData socialCommentControlDataLIZ;
        String nickname;
        if (aweme != null && aweme.getAid() != null) {
            aweme.getAid();
            SocialCommentControlData socialCommentControlDataLIZ2 = LIZ();
            if (socialCommentControlDataLIZ2 != null) {
                socialCommentControlDataLIZ2.lastShowTimestamp = System.currentTimeMillis();
                LJ(socialCommentControlDataLIZ2);
            }
            SocialCommentControlData socialCommentControlDataLIZ3 = LIZ();
            if (socialCommentControlDataLIZ3 != null) {
                j = socialCommentControlDataLIZ3.socialCommentDailyFirstAppearTimestamp;
            } else {
                j = 0;
            }
            int i = 0;
            if (System.currentTimeMillis() - j >= 86400000) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                SocialCommentControlData socialCommentControlDataLIZ4 = LIZ();
                if (socialCommentControlDataLIZ4 != null) {
                    socialCommentControlDataLIZ4.socialCommentDailyFirstAppearTimestamp = jCurrentTimeMillis;
                    LJ(socialCommentControlDataLIZ4);
                }
                SocialCommentControlData socialCommentControlDataLIZ5 = LIZ();
                if (socialCommentControlDataLIZ5 != null) {
                    socialCommentControlDataLIZ5.socialCommentDailyAppearTimes = 0;
                    LJ(socialCommentControlDataLIZ5);
                }
            }
            SocialCommentControlData socialCommentControlDataLIZ6 = LIZ();
            if (socialCommentControlDataLIZ6 != null) {
                socialCommentControlDataLIZ6.socialCommentDailyAppearTimes++;
                LJ(socialCommentControlDataLIZ6);
            }
            SocialCommentControlData socialCommentControlDataLIZ7 = LIZ();
            if (socialCommentControlDataLIZ7 == null || (arrayList = socialCommentControlDataLIZ7.socialCommentUnclickedAwemeList) == null) {
                arrayList = new ArrayList<>();
            }
            if (arrayList.contains(aweme.getAid())) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("already contains,return,aid:");
                sbLIZ.append(aweme.getAid());
                sbLIZ.append(",nickName:");
                User author = aweme.getAuthor();
                if (author != null) {
                    nickname = author.getNickname();
                } else {
                    nickname = null;
                }
                sbLIZ.append(nickname);
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            arrayList.add(aweme.getAid());
            SocialCommentControlData socialCommentControlDataLIZ8 = LIZ();
            if (socialCommentControlDataLIZ8 != null) {
                socialCommentControlDataLIZ8.socialCommentUnclickedAwemeList = arrayList;
                LJ(socialCommentControlDataLIZ8);
            }
            int size = arrayList.size();
            SocialQuickCommentStrategyAdjustConfig socialQuickCommentStrategyAdjustConfigLIZJ = C1351270lGf.LIZJ();
            if (socialQuickCommentStrategyAdjustConfigLIZJ != null) {
                i = socialQuickCommentStrategyAdjustConfigLIZJ.socialCommentClickExitLimit;
            }
            if (size >= i && (socialCommentControlDataLIZ = LIZ()) != null) {
                socialCommentControlDataLIZ.socialCommentExitTimestamp = System.currentTimeMillis();
                LJ(socialCommentControlDataLIZ);
            }
        }
    }

    public static boolean LIZIZ(Aweme aweme, String str) {
        List arrayList;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        SocialCommentControlData socialCommentControlDataLIZ;
        long j;
        int i6;
        if (aweme != null && aweme.getAid() != null) {
            if (!LIZLLL(aweme, str) && !LIZJ(aweme)) {
                return true;
            }
            SocialCommentControlData socialCommentControlDataLIZ2 = LIZ();
            if (socialCommentControlDataLIZ2 == null || (arrayList = socialCommentControlDataLIZ2.socialCommentUnclickedAwemeList) == null) {
                arrayList = new ArrayList();
            }
            C1351250lGd.LIZ.getClass();
            boolean zLJIIJJI = C1351250lGd.LJIIJJI(aweme);
            SocialCommentControlData socialCommentControlDataLIZ3 = LIZ();
            if (socialCommentControlDataLIZ3 != null) {
                i = socialCommentControlDataLIZ3.socialCommentExitCount;
            } else {
                i = 0;
            }
            SocialQuickCommentStrategyAdjustConfig socialQuickCommentStrategyAdjustConfigLIZJ = C1351270lGf.LIZJ();
            if (socialQuickCommentStrategyAdjustConfigLIZJ != null) {
                i2 = socialQuickCommentStrategyAdjustConfigLIZJ.socialCommentMaxExitTimes;
            } else {
                i2 = 0;
            }
            if (i >= i2 && !zLJIIJJI) {
                return true;
            }
            int size = arrayList.size();
            SocialQuickCommentStrategyAdjustConfig socialQuickCommentStrategyAdjustConfigLIZJ2 = C1351270lGf.LIZJ();
            if (socialQuickCommentStrategyAdjustConfigLIZJ2 != null) {
                i3 = socialQuickCommentStrategyAdjustConfigLIZJ2.socialCommentClickExitLimit;
            } else {
                i3 = 0;
            }
            long j2 = 0;
            if (size >= i3 && !zLJIIJJI) {
                SocialCommentControlData socialCommentControlDataLIZ4 = LIZ();
                if (socialCommentControlDataLIZ4 != null) {
                    j = socialCommentControlDataLIZ4.socialCommentExitTimestamp;
                } else {
                    j = 0;
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - j;
                SocialQuickCommentStrategyAdjustConfig socialQuickCommentStrategyAdjustConfigLIZJ3 = C1351270lGf.LIZJ();
                if (socialQuickCommentStrategyAdjustConfigLIZJ3 != null) {
                    i6 = socialQuickCommentStrategyAdjustConfigLIZJ3.socialCommentExitDays;
                } else {
                    i6 = 0;
                }
                if (jCurrentTimeMillis < ((long) i6) * 86400000) {
                    return true;
                }
                SocialCommentControlData socialCommentControlDataLIZ5 = LIZ();
                if (socialCommentControlDataLIZ5 != null) {
                    socialCommentControlDataLIZ5.socialCommentUnclickedAwemeList.clear();
                    socialCommentControlDataLIZ5.lastShowTimestamp = 0L;
                    socialCommentControlDataLIZ5.socialCommentExitCount++;
                    LJ(socialCommentControlDataLIZ5);
                }
            }
            SocialCommentControlData socialCommentControlDataLIZ6 = LIZ();
            if (socialCommentControlDataLIZ6 != null) {
                j2 = socialCommentControlDataLIZ6.socialCommentDailyFirstAppearTimestamp;
            }
            SocialCommentControlData socialCommentControlDataLIZ7 = LIZ();
            if (socialCommentControlDataLIZ7 != null) {
                i4 = socialCommentControlDataLIZ7.socialCommentDailyAppearTimes;
            } else {
                i4 = 0;
            }
            SocialQuickCommentStrategyAdjustConfig socialQuickCommentStrategyAdjustConfigLIZJ4 = C1351270lGf.LIZJ();
            if (socialQuickCommentStrategyAdjustConfigLIZJ4 != null) {
                i5 = socialQuickCommentStrategyAdjustConfigLIZJ4.socialCommentMaxAppearTimes;
            } else {
                i5 = 0;
            }
            if (i4 >= i5 && System.currentTimeMillis() - j2 < 86400000) {
                return true;
            }
            if (System.currentTimeMillis() - j2 >= 86400000 && (socialCommentControlDataLIZ = LIZ()) != null) {
                socialCommentControlDataLIZ.socialCommentDailyAppearTimes = 0;
                LJ(socialCommentControlDataLIZ);
            }
        }
        return false;
    }

    public static boolean LIZLLL(Aweme aweme, String str) {
        C1351250lGd.LIZ.getClass();
        if (!C1351250lGd.LJIILLIIL(aweme, str)) {
            return false;
        }
        if (!C1351270lGf.LIZ() && !C1351270lGf.LIZIZ()) {
            return false;
        }
        return true;
    }
}
