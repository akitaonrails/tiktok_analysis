package X;

import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: renamed from: X.0RKI, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RKI {
    public static boolean LIZ(VideoItemParams videoItemParams) {
        if (AwemeExtKt.isAdTraffic(videoItemParams.getAweme()) || C720360SNm.LJI(videoItemParams.getAweme()) || C0SCS.LIZ(videoItemParams)) {
            return false;
        }
        return true;
    }
}
