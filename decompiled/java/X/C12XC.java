package X;

import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;

/* JADX INFO: renamed from: X.12XC, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12XC {
    public static boolean LIZ(VideoSegment videoSegment) {
        if (videoSegment == null) {
            return false;
        }
        int i = videoSegment.width;
        int i2 = videoSegment.height;
        if (i > i2) {
            i2 = i;
            i = i2;
        }
        if (i < 1080) {
            if (i2 >= 1920) {
            }
            return true;
        }
        if (i > 1080) {
            return false;
        }
        if (i2 > 1920 || videoSegment.LJ() >= 35) {
            return false;
        }
        return true;
    }
}
