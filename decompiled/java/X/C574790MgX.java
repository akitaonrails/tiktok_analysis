package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VETimelineParams;
import com.ss.android.vesdk.VEUtils;
import java.util.Arrays;
import java.util.List;
import kotlin.text.u;
import pyl.s;

/* JADX INFO: renamed from: X.0MgX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C574790MgX {
    public static final VEUtils.VEVideoFileInfo LIZJ(String str) {
        C0CHQ.LIZ().LJJIZ();
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str);
        if (videoFileInfo != null && videoFileInfo.rotation % 180 != 0) {
            int i = videoFileInfo.height;
            videoFileInfo.height = videoFileInfo.width;
            videoFileInfo.width = i;
        }
        return videoFileInfo;
    }

    public static final void LIZ(VETimelineParams vETimelineParams, List<? extends VideoSegment> list) {
        if (list != null && !list.isEmpty()) {
            int length = vETimelineParams.vTrimIn.length;
            int size = list.size() + length;
            vETimelineParams.vTrimIn = Arrays.copyOf(vETimelineParams.vTrimIn, size);
            vETimelineParams.vTrimOut = Arrays.copyOf(vETimelineParams.vTrimOut, size);
            vETimelineParams.speed = Arrays.copyOf(vETimelineParams.speed, size);
            vETimelineParams.enable = Arrays.copyOf(vETimelineParams.enable, size);
            vETimelineParams.rotate = (ROTATE_DEGREE[]) Arrays.copyOf(vETimelineParams.rotate, size);
            vETimelineParams.videoFilePaths = (String[]) Arrays.copyOf(vETimelineParams.videoFilePaths, size);
            vETimelineParams.videoFileIndex = Arrays.copyOf(vETimelineParams.videoFileIndex, size);
            int i = 0;
            for (VideoSegment videoSegment : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    VideoSegment videoSegment2 = videoSegment;
                    int i3 = i + length;
                    vETimelineParams.vTrimIn[i3] = (int) videoSegment2.LJII();
                    vETimelineParams.vTrimOut[i3] = (int) videoSegment2.LIZLLL();
                    vETimelineParams.speed[i3] = s.NORMAL.value();
                    vETimelineParams.enable[i3] = true;
                    vETimelineParams.rotate[i3] = ROTATE_DEGREE.ROTATE_NONE;
                    String[] strArr = vETimelineParams.videoFilePaths;
                    String strLJFF = videoSegment2.LJFF(false);
                    strLJFF.toString();
                    strArr[i3] = strLJFF;
                    vETimelineParams.videoFileIndex[i3] = videoSegment2.videoIndex;
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public static final int LIZIZ(String str, int[] iArr) {
        C201955140j.LJIIL("start getVideoFileInfoWithRotation");
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("enable_convert_uri_path", false) && u.LJJIIJZLJL(str, "content://", false)) {
            str = C09N5.LIZ(C0CHQ.LIZ, C2471909mP.LJIILIIL(str));
        }
        C0CHQ.LIZ().LJJIZ();
        int videoFileInfo = VEUtils.getVideoFileInfo(str, iArr);
        if (videoFileInfo == 0 && iArr[2] % 180 != 0) {
            int i = iArr[1];
            iArr[1] = iArr[0];
            iArr[0] = i;
        }
        C201955140j.LJIIL("end getVideoFileInfoWithRotation");
        return videoFileInfo;
    }

    public static final void LIZLLL(VETimelineParams vETimelineParams, int i, VideoSegment videoSegment) {
        boolean z;
        int length = vETimelineParams.enable.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            boolean[] zArr = vETimelineParams.enable;
            if (i == i3) {
                z = true;
            } else {
                z = false;
            }
            zArr[i3] = z;
            i2++;
            i3 = i4;
        }
        vETimelineParams.speed[i] = videoSegment.LJI();
        vETimelineParams.vTrimIn[i] = 0;
        vETimelineParams.vTrimOut[i] = (int) videoSegment.duration;
        vETimelineParams.rotate[i] = C571620MbQ.LIZJ(videoSegment.rotate);
    }

    public static final void LJ(VETimelineParams vETimelineParams, List<? extends VideoSegment> list, int[] iArr, int[] iArr2, float[] fArr, int[] iArr3) {
        if (list != null && (!list.isEmpty())) {
            int i = 0;
            for (VideoSegment videoSegment : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    vETimelineParams.enable[i] = !videoSegment.isDeleted;
                    vETimelineParams.vTrimIn[i] = iArr[i];
                    vETimelineParams.vTrimOut[i] = iArr2[i];
                    vETimelineParams.speed[i] = fArr[i];
                    vETimelineParams.rotate[i] = C571620MbQ.LIZJ(iArr3[i]);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }
}
