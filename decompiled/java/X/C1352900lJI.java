package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lJI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1352900lJI {
    public static final void LIZ(long j, Aweme aweme, String str, String str2) {
        int i;
        String imprId;
        if (aweme.getStatistics() == null) {
            return;
        }
        int iLJII = Intrinsics.LJII(j, aweme.getStatistics().getCommentCount());
        if (iLJII == 0) {
            i = 0;
        } else if (iLJII > 0) {
            i = 1;
        } else {
            i = 2;
        }
        String aid = aweme.getAid();
        int iLJII2 = Intrinsics.LJII(j, aweme.getStatistics().getCommentCount());
        long commentCount = aweme.getStatistics().getCommentCount();
        long createTime = aweme.getCreateTime() * 1000;
        long jCurrentTimeMillis = System.currentTimeMillis() - (aweme.getCreateTime() * 1000);
        LogPbBean logPbBean = aweme.getLogPbBean();
        if (logPbBean == null || (imprId = logPbBean.getImprId()) == null) {
            imprId = "";
        }
        C1344740l68.LIZ(i, commentCount, j, aid, createTime, iLJII2, jCurrentTimeMillis, "comment", str, imprId, str2);
    }

    public static final void LIZIZ(long j, Aweme aweme, String str, String str2) {
        int i;
        String imprId;
        if (aweme.getStatistics() == null) {
            return;
        }
        int iLJII = Intrinsics.LJII(j, aweme.getStatistics().getDiggCount());
        if (iLJII == 0) {
            i = 0;
        } else if (iLJII > 0) {
            i = 1;
        } else {
            i = 2;
        }
        String aid = aweme.getAid();
        int iLJII2 = Intrinsics.LJII(j, aweme.getStatistics().getDiggCount());
        long diggCount = aweme.getStatistics().getDiggCount();
        long createTime = aweme.getCreateTime() * 1000;
        long jCurrentTimeMillis = System.currentTimeMillis() - (aweme.getCreateTime() * 1000);
        LogPbBean logPbBean = aweme.getLogPbBean();
        if (logPbBean == null || (imprId = logPbBean.getImprId()) == null) {
            imprId = "";
        }
        C1344740l68.LIZ(i, diggCount, j, aid, createTime, iLJII2, jCurrentTimeMillis, "reaction", str, imprId, str2);
    }
}
