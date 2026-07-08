package X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0oJM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1468260oJM {
    public static final int[] LIZ = {1, 5, -1, 6, -3};

    public static long LIZIZ(long j) {
        if (j == -2147483648L) {
            return j;
        }
        return (j << 60) | (j >>> 4);
    }

    public static String LIZJ(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String strLIZIZ = "";
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            int i3 = LIZ[i2 % 5];
            if (cCharAt >= 'a') {
                if (cCharAt <= 'z') {
                    cCharAt = (char) (cCharAt + i3);
                    if (cCharAt < 'a') {
                        cCharAt = (char) (cCharAt + 26);
                    }
                    if (cCharAt <= 'z') {
                    }
                    i = cCharAt - 26;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(cCharAt);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                if (cCharAt >= 'A') {
                    if (cCharAt <= 'Z') {
                        cCharAt = (char) (cCharAt + i3);
                        if (cCharAt < 'A') {
                            cCharAt = (char) (cCharAt + 26);
                        }
                        if (cCharAt <= 'Z') {
                        }
                        i = cCharAt - 26;
                    }
                } else if (cCharAt >= '0' && cCharAt <= '9') {
                    cCharAt = (char) (cCharAt + i3);
                    if (cCharAt < '0') {
                        cCharAt = (char) (cCharAt + '\n');
                    }
                    if (cCharAt > '9') {
                        i = cCharAt - '\n';
                    }
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(cCharAt);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            cCharAt = (char) i;
            StringBuilder sbLIZ22 = C2188811AlT.LIZ();
            sbLIZ22.append(strLIZIZ);
            sbLIZ22.append(cCharAt);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ22);
        }
        return strLIZIZ;
    }

    public static Map<String, Object> LIZ(C1468180oJE c1468180oJE, C1468170oJD c1468170oJD) {
        HashMap map = new HashMap();
        C799510VXx.LIZIZ(1, "encrypt_version", map);
        if (c1468180oJE != null) {
            C799510VXx.LIZJ(LIZIZ(c1468180oJE.LJJLIIIJILLIZJL.LIZLLL), "reply_size", map);
            C799510VXx.LIZJ(LIZIZ(c1468180oJE.LJJIIZI), "vs", map);
            C799510VXx.LIZJ(LIZIZ(c1468180oJE.LJJLIIIJILLIZJL.LJFF), "mdl_speed", map);
            C799510VXx.LJ("codec", LIZJ(c1468180oJE.LJJIJ), map);
        }
        C799510VXx.LIZJ(LIZIZ(c1468170oJD.LJJIJLIJ), "vps", map);
        C799510VXx.LIZJ(LIZIZ(c1468170oJD.LJJIL), "vds", map);
        C799510VXx.LIZJ(LIZIZ(c1468170oJD.LJJIZ), "accumulate_vds", map);
        C799510VXx.LIZJ(LIZIZ(c1468170oJD.LLD), "watch_dur", map);
        C799510VXx.LIZJ(LIZIZ(c1468170oJD.LLF), "bg_audio_watch_dur", map);
        C799510VXx.LIZJ(LIZIZ(c1468170oJD.LLLIIII), "vpls", map);
        C799510VXx.LIZJ(LIZIZ(c1468170oJD.LJJIJIIJIL), "bc", map);
        C799510VXx.LIZJ(LIZIZ(c1468170oJD.LJJIIJ), "vt", map);
        C799510VXx.LIZJ(LIZIZ(c1468170oJD.LJJJI), "height", map);
        C799510VXx.LIZJ(LIZIZ(c1468170oJD.LJJJ), "width", map);
        C799510VXx.LIZJ(LIZIZ(c1468170oJD.n0), "mask_download_size", map);
        C799510VXx.LIZJ(LIZIZ(c1468170oJD.f193o0), "subtitle_download_size", map);
        float f = c1468170oJD.LLZIL;
        if (f != Float.MIN_VALUE && f != Float.NaN) {
            f = -f;
        }
        C799510VXx.LIZLLL("st_net_speed", f, map);
        C799510VXx.LJ("initial_resolution", LIZJ(c1468170oJD.LJJJZ), map);
        return map;
    }
}
