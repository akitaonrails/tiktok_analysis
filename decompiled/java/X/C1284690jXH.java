package X;

import android.media.MediaCodecInfo;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Locale;

/* JADX INFO: renamed from: X.0jXH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1284690jXH {
    public static Boolean LIZ;
    public static C1284700jXI LIZIZ;
    public static C1284700jXI LIZJ;
    public static String LIZLLL;

    public static int LIZIZ() {
        if (LIZJ == null) {
            LIZJ = LIZ("video/hevc");
        }
        C1284700jXI c1284700jXI = LIZJ;
        if (c1284700jXI != null) {
            return c1284700jXI.LIZJ;
        }
        return -1;
    }

    public static int LIZJ() {
        if (LIZIZ == null) {
            LIZIZ = LIZ("video/avc");
        }
        C1284700jXI c1284700jXI = LIZIZ;
        if (c1284700jXI != null) {
            return c1284700jXI.LIZJ;
        }
        return -1;
    }

    public static C1284700jXI LIZ(String str) {
        C1284700jXI c1284700jXI = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.toLowerCase().equals("video/avc") || str.toLowerCase().equals("video/hevc")) {
            try {
                MediaCodecInfo mediaCodecInfoLIZ = C1284680jXG.LIZ(new C1284710jXJ(), new InterfaceC1284570jX5() { // from class: X.0jWy
                    @Override // X.InterfaceC1284570jX5
                    public final boolean LIZ(MediaCodecInfo mediaCodecInfo) {
                        String lowerCase = mediaCodecInfo.getName().toLowerCase(Locale.US);
                        if (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || ((lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || "omx.qcom.video.decoder.hevcswvdec".equals(lowerCase) || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.") || (!lowerCase.startsWith("omx.") && !lowerCase.startsWith("c2.")))) {
                            return false;
                        }
                        return true;
                    }
                }, new C1284670jXF(str));
                if (mediaCodecInfoLIZ != null) {
                    C1284700jXI c1284700jXI2 = new C1284700jXI();
                    try {
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoLIZ.getCapabilitiesForType(str);
                        c1284700jXI2.LIZJ = ((Integer) capabilitiesForType.getVideoCapabilities().getSupportedHeights().getUpper()).intValue();
                        c1284700jXI2.LIZIZ = ((Integer) capabilitiesForType.getVideoCapabilities().getSupportedWidths().getUpper()).intValue();
                        c1284700jXI2.LIZ = mediaCodecInfoLIZ.getName().toLowerCase(Locale.US);
                        return c1284700jXI2;
                    } catch (Exception e) {
                        e = e;
                        c1284700jXI = c1284700jXI2;
                        TryCatchGuardChecker.doCheck(e);
                        C1481110oe5.LJ("heightUpperLimitForByteVc1", e);
                        return c1284700jXI;
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        return c1284700jXI;
    }
}
