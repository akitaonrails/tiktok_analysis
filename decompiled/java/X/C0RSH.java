package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RSH, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RSH {
    public static boolean LIZ(C0RSR c0rsr, VideoItemParams videoItemParams) {
        String aid;
        if (c0rsr == null) {
            return false;
        }
        String str = c0rsr.LIZJ;
        Aweme aweme = videoItemParams.getAweme();
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(str, aid) || c0rsr.LIZLLL.length() == 0 || c0rsr.LIZ != 1) {
            return false;
        }
        return true;
    }
}
