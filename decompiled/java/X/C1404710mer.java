package X;

import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.vesdk.VEUtils;

/* JADX INFO: renamed from: X.0mer, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404710mer {
    public static int LIZ(String str) {
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str);
        if (videoFileInfo == null) {
            return 0;
        }
        return videoFileInfo.bitrate;
    }

    public static int[] LIZIZ(String str) {
        int[] iArr = new int[10];
        if (VEUtils.getVideoFileInfo(str, iArr) != 0) {
            return null;
        }
        return iArr;
    }

    public static VideoFileInfo LIZJ(String str) {
        int[] iArrLIZIZ = LIZIZ(str);
        if (iArrLIZIZ == null) {
            return null;
        }
        return new VideoFileInfo(iArrLIZIZ[0], iArrLIZIZ[1], iArrLIZIZ[3], iArrLIZIZ[7], iArrLIZIZ[6], iArrLIZIZ[8], iArrLIZIZ[9]);
    }
}
