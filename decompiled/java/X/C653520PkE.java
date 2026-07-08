package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.TopFrameSummary;

/* JADX INFO: renamed from: X.0PkE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C653520PkE {
    public static int LIZ(Aweme aweme) {
        int i;
        TopFrameSummary topFrameSummary;
        LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme);
        if (newLiveRoomDataExt != null) {
            i = newLiveRoomDataExt.user_count;
        } else {
            i = 0;
        }
        LiveRoomStruct newLiveRoomDataExt2 = AwemeExtKt.getNewLiveRoomDataExt(aweme);
        if (newLiveRoomDataExt2 != null && (topFrameSummary = newLiveRoomDataExt2.topFrameSummary) != null && topFrameSummary.getId() != 0) {
            LiveRoomStruct newLiveRoomDataExt3 = AwemeExtKt.getNewLiveRoomDataExt(aweme);
            if (newLiveRoomDataExt3 == null) {
                return 0;
            }
            return newLiveRoomDataExt3.total_user;
        }
        return i;
    }
}
