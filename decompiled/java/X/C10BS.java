package X;

import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commerce.model.MissionItemStatus;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Set;

/* JADX INFO: renamed from: X.10BS, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10BS {
    public static final boolean LIZ(Aweme aweme) {
        MissionItemStatus missionItemStatusEnum;
        AwemeCommerceStruct commerceVideoAuthInfo;
        Set setLJLIIL = C13LQ.LJLIIL(new MissionItemStatus[]{MissionItemStatus.IN_REVIEW, MissionItemStatus.PASS_BY_MACHINE, MissionItemStatus.PASS_BY_AUDIT, MissionItemStatus.GREY});
        if (aweme != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null) {
            missionItemStatusEnum = commerceVideoAuthInfo.getMissionItemStatusEnum();
        } else {
            missionItemStatusEnum = null;
        }
        return C13LP.LJJJJ(missionItemStatusEnum, setLJLIIL);
    }
}
