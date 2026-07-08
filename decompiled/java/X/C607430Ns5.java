package X;

import Y.ARunnableS109S0100000_9;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizOptExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;

/* JADX INFO: renamed from: X.0Ns5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C607430Ns5 {
    public static final boolean LIZ(Aweme aweme) {
        if (AwemeSaaSExtKt.isLive(aweme) || AwemeExtKt.isAdTraffic(aweme) || AwemeBizOptExtKt.getAwemeCacheType(aweme) == 1 || aweme.getCardInsertInfo() != null || aweme.getAwemeType() == 104 || aweme.getAwemeType() == 105 || aweme.getAwemeType() != 0) {
            return true;
        }
        return false;
    }

    public static final String LIZIZ(Aweme aweme) {
        String aid;
        String groupId = aweme.getGroupId();
        if (groupId != null && groupId.length() != 0) {
            aid = aweme.getGroupId();
        } else {
            String aid2 = aweme.getAid();
            if (aid2 != null && aid2.length() != 0) {
                aid = aweme.getAid();
            } else {
                if (C0SRA.LIZ) {
                    C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS109S0100000_9(aweme, 2));
                }
                aid = "default_unknown_aid";
            }
        }
        if (LIZ(aweme)) {
            String requestId = aweme.getRequestId();
            if ((requestId == null || requestId.length() == 0) && C0SRA.LIZ) {
                C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS109S0100000_9(aweme, 3));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(aweme.getRequestId());
            sbLIZ.append(aid);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return aid;
    }
}
