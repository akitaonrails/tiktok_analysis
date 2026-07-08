package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.vesdk.VEUtils;

/* JADX INFO: renamed from: X.0L1n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C536290L1n {
    public static final boolean LIZ(VideoSegment videoSegment) {
        int iIntValue = ((Number) C0ASD.LIZ.getValue()).intValue();
        if (iIntValue == 1) {
            return true;
        }
        if (iIntValue != 2) {
            int iMin = Math.min(videoSegment.width, videoSegment.height);
            int iMax = Math.max(videoSegment.width, videoSegment.height);
            try {
                if (((Boolean) C305960Bz0.LIZ.getValue()).booleanValue()) {
                    if (C297650Blb.LIZ()) {
                        C2356009La c2356009La = C2356009La.LIZ;
                        String strLJFF = videoSegment.LJFF(false);
                        c2356009La.getClass();
                        VEUtils.VEVideoFileInfo vEVideoFileInfoLIZ = C2356009La.LIZ(strLJFF);
                        if (vEVideoFileInfoLIZ != null && vEVideoFileInfoLIZ.bHDR) {
                            return true;
                        }
                    } else {
                        VEUtils.VEVideoFileInfo vEVideoFileInfo = VEUtils.getVEVideoFileInfo(videoSegment.LJFF(false));
                        if (vEVideoFileInfo != null && vEVideoFileInfo.bHDR) {
                            return true;
                        }
                    }
                }
                if ((videoSegment.LIZJ() == 174 || videoSegment.LIZJ() == 28) && iMin <= ((Number) C0ASB.LIZ.getValue()).intValue()) {
                    return true;
                }
                if (((Number) C571570MbL.LIZ(iMin, iMax, videoSegment.LJ(), videoSegment.LIZJ()).getFirst()).intValue() == 0) {
                    return true;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C201955140j.LJ(e.getMessage());
            }
        }
        return false;
    }
}
