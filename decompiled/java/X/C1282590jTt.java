package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.pusher.core.params.MediaCodecOmx;
import com.ss.pusher.core.utils.AVLog;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jTt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1282590jTt {
    public static final String LIZ = "video/hevc";
    public static String[] LIZIZ = {"OMX.google.", "OMX.android.", "OMX.Nvidia.", "OMX.Intel.", "OMX.TI.DUCATI1.VIDEO.H264E", "c2.google.", "c2.android."};
    public static List<MediaCodecOmx> LIZJ = Collections.emptyList();
    public static boolean LIZLLL = false;
    public static final C1272080jCw LJ = new C1272080jCw();
    public static final List<String> LJFF = Arrays.asList("SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4");
    public static final int[] LJI = {19, 21, 2141391872, 2141391876};
    public static final int[] LJII = {2130708361};

    public static boolean LIZ(String str) {
        for (String str2 : LIZIZ) {
            if (str.toLowerCase().startsWith(str2.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public static MediaCodecInfo LIZJ(String str) {
        MediaCodecInfo[] codecInfos;
        boolean z;
        if (str != null && !str.isEmpty() && (codecInfos = new MediaCodecList(1).getCodecInfos()) != null && codecInfos.length != 0) {
            for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                if (mediaCodecInfo != null && mediaCodecInfo.isEncoder()) {
                    String name = mediaCodecInfo.getName();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("MediaCodecInfo ");
                    sbLIZ.append(LJ(mediaCodecInfo));
                    AVLog.d("MediaCodecUtils", C2188811AlT.LIZIZ(sbLIZ));
                    if (!TextUtils.isEmpty(name) && !LIZ(name) && LIZIZ(mediaCodecInfo, str)) {
                        if (!str.equalsIgnoreCase("audio/mp4a-latm") || mediaCodecInfo.getName().startsWith("OMX.google.")) {
                            if ((str.equalsIgnoreCase("video/avc") || str.equalsIgnoreCase(LIZ)) && !LJFF.contains(Build.MODEL)) {
                                String name2 = mediaCodecInfo.getName();
                                if (name2.startsWith("OMX.qcom.") || name2.startsWith("OMX.Exynos.") || name2.startsWith("OMX.MTK.") || name2.startsWith("OMX.hisi.") || name2.startsWith("OMX.rk.") || ((name2.startsWith("c2.qti.") && Build.VERSION.SDK_INT >= 29) || ((name2.startsWith("c2.mtk.") && Build.VERSION.SDK_INT >= 29) || (name2.startsWith("c2.rk.") && Build.VERSION.SDK_INT >= 29)))) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                for (MediaCodecOmx mediaCodecOmx : LIZJ) {
                                    if (!z) {
                                        if (name2.startsWith(mediaCodecOmx.prefix) && Build.VERSION.SDK_INT >= mediaCodecOmx.versionCode) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                    }
                                }
                                if (!z) {
                                    if (LIZLLL && Build.VERSION.SDK_INT >= 29 && mediaCodecInfo.isHardwareAccelerated()) {
                                        C1272080jCw c1272080jCw = LJ;
                                        if (c1272080jCw.LIZ) {
                                            c1272080jCw.LIZ = false;
                                            AVLog.logKibana(5, "MediaCodecUtils", "using correction value", null);
                                        }
                                    }
                                }
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("skip codec ");
                            sbLIZ2.append(LJ(mediaCodecInfo));
                            AVLog.ioi("MediaCodecUtils", C2188811AlT.LIZIZ(sbLIZ2));
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("find codec ");
                        sbLIZ3.append(LJ(mediaCodecInfo));
                        AVLog.ioi("MediaCodecUtils", C2188811AlT.LIZIZ(sbLIZ3));
                        return mediaCodecInfo;
                    }
                }
            }
        }
        return null;
    }

    public static JSONObject LJ(MediaCodecInfo mediaCodecInfo) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("codecName", mediaCodecInfo.getName());
            if (Build.VERSION.SDK_INT >= 29) {
                jSONObject.put("hardware", mediaCodecInfo.isHardwareAccelerated());
                jSONObject.put("softwareOnly", mediaCodecInfo.isSoftwareOnly());
                jSONObject.put("isVendor", mediaCodecInfo.isVendor());
                return jSONObject;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONObject;
    }

    public static boolean LIZIZ(MediaCodecInfo mediaCodecInfo, String str) {
        for (String str2 : mediaCodecInfo.getSupportedTypes()) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static Integer LIZLLL(int[] iArr, MediaCodecInfo.CodecCapabilities codecCapabilities, String str) {
        if (iArr == LJI && str.startsWith("OMX.hisi.")) {
            return 21;
        }
        for (int i : iArr) {
            for (int i2 : codecCapabilities.colorFormats) {
                if (i2 == i) {
                    return Integer.valueOf(i2);
                }
            }
        }
        return null;
    }
}
