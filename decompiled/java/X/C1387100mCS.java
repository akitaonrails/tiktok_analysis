package X;

import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.AwemeStatisticsBackup;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0mCS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387100mCS {
    public static final C1387100mCS LIZ = new C1387100mCS();

    /* JADX WARN: Removed duplicated region for block: B:108:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3 A[Catch: all -> 0x00fa, TryCatch #0 {all -> 0x00fa, blocks: (B:5:0x0020, B:7:0x0030, B:9:0x0036, B:12:0x0042, B:14:0x004c, B:31:0x0098, B:33:0x00a3, B:35:0x00ab, B:37:0x00b3, B:40:0x00cc, B:42:0x00e2, B:44:0x00e8, B:45:0x00eb, B:47:0x00f1, B:39:0x00bb, B:19:0x005d, B:21:0x0067, B:23:0x0071, B:26:0x0080, B:28:0x008a, B:48:0x00f4), top: B:99:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb A[Catch: all -> 0x00fa, TryCatch #0 {all -> 0x00fa, blocks: (B:5:0x0020, B:7:0x0030, B:9:0x0036, B:12:0x0042, B:14:0x004c, B:31:0x0098, B:33:0x00a3, B:35:0x00ab, B:37:0x00b3, B:40:0x00cc, B:42:0x00e2, B:44:0x00e8, B:45:0x00eb, B:47:0x00f1, B:39:0x00bb, B:19:0x005d, B:21:0x0067, B:23:0x0071, B:26:0x0080, B:28:0x008a, B:48:0x00f4), top: B:99:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2 A[Catch: all -> 0x00fa, TryCatch #0 {all -> 0x00fa, blocks: (B:5:0x0020, B:7:0x0030, B:9:0x0036, B:12:0x0042, B:14:0x004c, B:31:0x0098, B:33:0x00a3, B:35:0x00ab, B:37:0x00b3, B:40:0x00cc, B:42:0x00e2, B:44:0x00e8, B:45:0x00eb, B:47:0x00f1, B:39:0x00bb, B:19:0x005d, B:21:0x0067, B:23:0x0071, B:26:0x0080, B:28:0x008a, B:48:0x00f4), top: B:99:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(java.lang.String r18, java.util.List r19) {
        /*
            Method dump skipped, instruction units count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1387100mCS.LIZ(java.lang.String, java.util.List):void");
    }

    public static final void LIZLLL(AwemeStatisticsBackup awemeStatisticsBackup, int i) {
        Long collectCount;
        if (awemeStatisticsBackup == null) {
            return;
        }
        String aid = awemeStatisticsBackup.getAid();
        Aweme awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(aid);
        if (awemeLLILZ == null) {
            C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FeedBackupHelper find that aweme is null!");
            sbLIZ.append(aid);
            c2276411E8h.LIZJ("common_feed", 4, "FeedBackupHelper", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C2276411E8h c2276411E8h2 = C2276411E8h.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("FeedBackupHelper start to update this aweme:");
        sbLIZ2.append(awemeStatisticsBackup);
        c2276411E8h2.LIZJ("common_feed", 4, "FeedBackupHelper", C2188811AlT.LIZIZ(sbLIZ2));
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
            } else {
                if (awemeLLILZ.getStatistics() == null) {
                    awemeLLILZ.setStatistics(new AwemeStatistics());
                }
                if (awemeStatisticsBackup.getCommentCount().longValue() <= 0) {
                    return;
                }
                awemeLLILZ.getStatistics().setAid(aid);
                awemeLLILZ.getStatistics().setCommentCount(awemeStatisticsBackup.getCommentCount().longValue());
                return;
            }
        }
        if (awemeLLILZ.getStatistics() == null) {
            awemeLLILZ.setStatistics(new AwemeStatistics());
        }
        AwemeStatistics statistics = awemeLLILZ.getStatistics();
        if (statistics == null) {
            return;
        }
        statistics.setAid(awemeStatisticsBackup.getAid());
        if (awemeStatisticsBackup.getCommentCount().longValue() > 0) {
            statistics.setCommentCount(awemeStatisticsBackup.getCommentCount().longValue());
        }
        if (awemeStatisticsBackup.getDiggCount().longValue() > 0) {
            statistics.setDiggCount(awemeStatisticsBackup.getDiggCount().longValue());
        }
        if (((Boolean) C0BBZ.LIZ.getValue()).booleanValue() && (collectCount = awemeStatisticsBackup.getCollectCount()) != null) {
            long jLongValue = collectCount.longValue();
            if (jLongValue > 0) {
                statistics.setCollectCount(jLongValue);
            }
        }
        if (awemeStatisticsBackup.getPlayCount().longValue() > 0) {
            statistics.setPlayCount(awemeStatisticsBackup.getPlayCount().longValue());
        }
        if (awemeStatisticsBackup.getDownloadCount().longValue() > 0) {
            statistics.setDownloadCount(awemeStatisticsBackup.getDownloadCount().longValue());
        }
        if (awemeStatisticsBackup.getShareCount().longValue() > 0) {
            statistics.setShareCount(awemeStatisticsBackup.getShareCount().longValue());
        }
        if (awemeStatisticsBackup.getForwardCount().longValue() <= 0) {
            return;
        }
        statistics.setForwardCount(awemeStatisticsBackup.getForwardCount().longValue());
    }

    public static void LIZIZ(int i, String str, String str2) {
        C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedBackupHelper monitorLoseCount aid: ");
        sbLIZ.append(str);
        sbLIZ.append(", loseCount: ");
        sbLIZ.append(i);
        c2276411E8h.LIZJ("common_feed", 4, "FeedBackupHelper", C2188811AlT.LIZIZ(sbLIZ));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("lose_count", String.valueOf(i));
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("group_id", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("log_id", str2);
        C20684815ws.LJIILLIIL("lose_count_inconsistency", linkedHashMap);
    }

    public static void LIZJ(int i, String str, boolean z, boolean z2, boolean z3) {
        if (i == 2) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(z ? 1 : 0));
        linkedHashMap.put("is_empty", String.valueOf(z2 ? 1 : 0));
        linkedHashMap.put("has_all_zero", String.valueOf(z3 ? 1 : 0));
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("log_id", str);
        C20684815ws.LJIILLIIL("aweme_statistics_api", linkedHashMap);
    }
}
