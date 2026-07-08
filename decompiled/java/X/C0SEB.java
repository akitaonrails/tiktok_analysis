package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: renamed from: X.0SEB, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SEB {
    public static boolean LIZ(VideoItemParams videoItemParams) {
        boolean z;
        if (!C730150SkX.LIZIZ(videoItemParams.getAweme()) && !C730150SkX.LIZ(videoItemParams.getAweme())) {
            z = false;
        } else {
            z = true;
        }
        if (!C0BWN.LIZ() || !z) {
            return false;
        }
        return true;
    }
}
