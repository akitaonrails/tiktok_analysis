package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.model.MentionQueryPagination;
import com.ss.android.ugc.aweme.model.MentionQueryPaginationParam;
import com.ss.android.ugc.aweme.model.MentionRecommendQueryRequest;

/* JADX INFO: renamed from: X.0Cam, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C316420Cam {
    public static final String LIZIZ(boolean z) {
        MentionQueryPagination mentionQueryPagination;
        if (z) {
            mentionQueryPagination = new MentionQueryPagination(new MentionQueryPaginationParam(false, 0L), new MentionQueryPaginationParam(false, 0L), new MentionQueryPaginationParam(false, 0L), new MentionQueryPaginationParam(false, 0L), new MentionQueryPaginationParam(true, 0L));
        } else {
            mentionQueryPagination = new MentionQueryPagination(new MentionQueryPaginationParam(true, 0L), new MentionQueryPaginationParam(true, 0L), new MentionQueryPaginationParam(true, 0L), new MentionQueryPaginationParam(true, 0L), new MentionQueryPaginationParam(false, 0L));
        }
        try {
            return C08JS.LIZLLL(mentionQueryPagination);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static MentionRecommendQueryRequest LIZ(long j, MentionQueryPaginationParam mentionQueryPaginationParam, MentionQueryPaginationParam mentionQueryPaginationParam2, MentionQueryPaginationParam mentionQueryPaginationParam3, MentionQueryPaginationParam mentionQueryPaginationParam4, MentionQueryPaginationParam mentionQueryPaginationParam5, String str, long j2, int i) {
        long j3 = j2;
        String str2 = str;
        MentionQueryPaginationParam mentionQueryPaginationParam6 = mentionQueryPaginationParam5;
        MentionQueryPaginationParam mentionQueryPaginationParam7 = mentionQueryPaginationParam4;
        MentionQueryPaginationParam mentionQueryPaginationParam8 = mentionQueryPaginationParam3;
        MentionQueryPaginationParam mentionQueryPaginationParam9 = mentionQueryPaginationParam2;
        MentionQueryPaginationParam mentionQueryPaginationParam10 = mentionQueryPaginationParam;
        if ((i & 2) != 0) {
            mentionQueryPaginationParam10 = null;
        }
        if ((i & 4) != 0) {
            mentionQueryPaginationParam9 = null;
        }
        if ((i & 8) != 0) {
            mentionQueryPaginationParam8 = null;
        }
        if ((i & 16) != 0) {
            mentionQueryPaginationParam7 = null;
        }
        if ((i & 32) != 0) {
            mentionQueryPaginationParam6 = null;
        }
        if ((i & 64) != 0) {
            str2 = null;
        }
        if ((i & 128) != 0) {
            j3 = 0;
        }
        if (C054F.LIZ.contains(Long.valueOf(j))) {
            if (mentionQueryPaginationParam6 == null) {
                return new MentionRecommendQueryRequest(j, LIZIZ(true), str2, j3);
            }
            MentionQueryPagination mentionQueryPagination = new MentionQueryPagination(new MentionQueryPaginationParam(true, 0L), new MentionQueryPaginationParam(true, 0L), new MentionQueryPaginationParam(true, 0L), new MentionQueryPaginationParam(true, 0L), new MentionQueryPaginationParam(mentionQueryPaginationParam6.need, mentionQueryPaginationParam6.offset));
            try {
                C1227904rF.LIZ.getClass();
                return new MentionRecommendQueryRequest(j, C1227904rF.LJ().LJIILL(mentionQueryPagination), str2, j3);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        if (mentionQueryPaginationParam10 == null || mentionQueryPaginationParam9 == null || mentionQueryPaginationParam8 == null || mentionQueryPaginationParam7 == null) {
            String strLIZIZ = LIZIZ(false);
            if (strLIZIZ.length() <= 0) {
                return null;
            }
            return new MentionRecommendQueryRequest(j, strLIZIZ, str2, j3);
        }
        try {
            return new MentionRecommendQueryRequest(j, C08JS.LIZLLL(new MentionQueryPagination(new MentionQueryPaginationParam(mentionQueryPaginationParam10.need, mentionQueryPaginationParam10.offset), new MentionQueryPaginationParam(mentionQueryPaginationParam9.need, mentionQueryPaginationParam9.offset), new MentionQueryPaginationParam(mentionQueryPaginationParam8.need, mentionQueryPaginationParam8.offset), new MentionQueryPaginationParam(mentionQueryPaginationParam7.need, mentionQueryPaginationParam7.offset), new MentionQueryPaginationParam(true, 0L))), str2, j3);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }
}
