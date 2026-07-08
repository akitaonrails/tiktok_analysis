package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jTu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1282600jTu {
    public static final String LIZ = "video/hevc";
    public static final String[] LIZIZ = {"OMX.google.", "OMX.android.", "OMX.Nvidia.", "OMX.Intel.", "OMX.TI.DUCATI1.VIDEO.H264E", "c2.google.", "c2.android."};
    public static final JSONArray LIZJ = new JSONArray();
    public static JSONArray LIZLLL = new JSONArray();
    public static final List<String> LJ;
    public static final int[] LJFF;
    public static final int[] LJI;

    static {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt != null && codecInfoAt.isEncoder() && !codecInfoAt.getName().startsWith("OMX.google.") && (LIZIZ(codecInfoAt, "video/avc") || LIZIZ(codecInfoAt, LIZ) || LIZIZ(codecInfoAt, "audio/mp4a-latm"))) {
                LIZJ.put(LJ(codecInfoAt));
            }
        }
        LJ = Arrays.asList("SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4");
        LJFF = new int[]{19, 21, 2141391872, 2141391876};
        LJI = new int[]{2130708361};
    }

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
                            if ((str.equalsIgnoreCase("video/avc") || str.equalsIgnoreCase(LIZ)) && !LJ.contains(Build.MODEL)) {
                                String name2 = mediaCodecInfo.getName();
                                if (name2.startsWith("OMX.qcom.") || name2.startsWith("OMX.Exynos.") || name2.startsWith("OMX.MTK.") || name2.startsWith("OMX.hisi.") || name2.startsWith("OMX.rk.") || ((name2.startsWith("c2.qti.") && Build.VERSION.SDK_INT >= 29) || (name2.startsWith("c2.mtk.") && Build.VERSION.SDK_INT >= 29))) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                for (int i = 0; i < LIZLLL.length(); i++) {
                                    try {
                                        if (!z) {
                                            JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(LIZLLL, i);
                                            String string = JSONObjectProtectorUtils.getString(jSONObject, "prefix");
                                            int i2 = JSONObjectProtectorUtils.getInt(jSONObject, "version");
                                            if (name2.startsWith(string) && Build.VERSION.SDK_INT >= i2) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                        }
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                }
                                if (z) {
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
            return null;
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
        if (iArr == LJFF && str.startsWith("OMX.hisi.")) {
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
