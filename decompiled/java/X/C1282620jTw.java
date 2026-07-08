package X;

import Y.AComparatorS517S0100000_20;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0jTw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1282620jTw {
    public final String LIZ;
    public final List<MediaCodecInfo> LIZIZ = new ArrayList();

    public C1282620jTw(String str) {
        this.LIZ = str;
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt != null && codecInfoAt.isEncoder()) {
                String name = codecInfoAt.getName();
                if ((name.toLowerCase().startsWith("omx.") || name.toLowerCase().startsWith("c2.")) && !C1282590jTt.LIZ(name) && C1282590jTt.LIZIZ(codecInfoAt, this.LIZ)) {
                    this.LIZIZ.add(codecInfoAt);
                }
            }
        }
        Collections.sort(this.LIZIZ, new AComparatorS517S0100000_20(this, 2));
    }

    public static int LIZ(MediaCodecInfo mediaCodecInfo) {
        String lowerCase = mediaCodecInfo.getName().toLowerCase();
        String[] strArr = {"OMX.qcom.".toLowerCase(), "OMX.hisi.".toLowerCase(), "OMX.MTK.".toLowerCase(), "OMX.Exynos.".toLowerCase()};
        int i = 0;
        do {
            String str = strArr[i];
            if (lowerCase.startsWith(str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("video.encoder.avc");
                if (!lowerCase.equals(C2188811AlT.LIZIZ(sbLIZ))) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append("video.encoder.hevc");
                    if (!lowerCase.equals(C2188811AlT.LIZIZ(sbLIZ2))) {
                        return 40;
                    }
                    return 45;
                }
                return 45;
            }
            i++;
        } while (i < 4);
        String[] strArr2 = {"c2.qti.".toLowerCase(), "c2.hisi.".toLowerCase(), "c2.mtk.".toLowerCase(), "c2.exynos.".toLowerCase()};
        int i2 = 0;
        do {
            String str2 = strArr2[i2];
            if (lowerCase.startsWith(str2)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str2);
                sbLIZ3.append("avc.encoder");
                if (!lowerCase.equals(C2188811AlT.LIZIZ(sbLIZ3))) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(str2);
                    sbLIZ4.append("hevc.encoder");
                    if (!lowerCase.equals(C2188811AlT.LIZIZ(sbLIZ4))) {
                        return 30;
                    }
                    return 35;
                }
                return 35;
            }
            i2++;
        } while (i2 < 4);
        if (lowerCase.toLowerCase().startsWith("omx.")) {
            return 20;
        }
        if (!lowerCase.toLowerCase().startsWith("c2.")) {
            return 0;
        }
        return 10;
    }
}
