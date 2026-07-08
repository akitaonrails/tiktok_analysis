package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0oM6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1469960oM6 {
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZ(java.lang.Integer r3) {
        /*
            if (r3 == 0) goto L7e
            int r0 = r3.intValue()
            if (r0 != 0) goto L1f
            java.lang.String r2 = "FF_PROFILE_AAC_MAIN"
        La:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r0 = 95
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            return r0
        L1f:
            int r1 = r3.intValue()
            r0 = 1
            if (r1 != r0) goto L29
            java.lang.String r2 = "FF_PROFILE_AAC_LOW"
            goto La
        L29:
            int r1 = r3.intValue()
            r0 = 2
            if (r1 != r0) goto L33
            java.lang.String r2 = "FF_PROFILE_AAC_SSR"
            goto La
        L33:
            int r1 = r3.intValue()
            r0 = 3
            if (r1 != r0) goto L3d
            java.lang.String r2 = "FF_PROFILE_AAC_LTP"
            goto La
        L3d:
            int r1 = r3.intValue()
            r0 = 4
            if (r1 != r0) goto L47
            java.lang.String r2 = "FF_PROFILE_AAC_HE"
            goto La
        L47:
            int r1 = r3.intValue()
            r0 = 22
            if (r1 != r0) goto L52
            java.lang.String r2 = "FF_PROFILE_AAC_LD"
            goto La
        L52:
            int r1 = r3.intValue()
            r0 = 28
            if (r1 != r0) goto L5d
            java.lang.String r2 = "FF_PROFILE_AAC_HE_V2"
            goto La
        L5d:
            int r1 = r3.intValue()
            r0 = 38
            if (r1 != r0) goto L68
            java.lang.String r2 = "FF_PROFILE_AAC_ELD"
            goto La
        L68:
            int r1 = r3.intValue()
            r0 = 128(0x80, float:1.8E-43)
            if (r1 != r0) goto L73
            java.lang.String r2 = "FF_PROFILE_MPEG2_AAC_LOW"
            goto La
        L73:
            int r1 = r3.intValue()
            r0 = 131(0x83, float:1.84E-43)
            if (r1 != r0) goto L7e
            java.lang.String r2 = "FF_PROFILE_MPEG2_AAC_HE"
            goto La
        L7e:
            java.lang.String r2 = "Unknown"
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1469960oM6.LIZ(java.lang.Integer):java.lang.String");
    }

    public static final Map<String, Object> LIZIZ(C1472250oPn c1472250oPn) {
        Map<String, Object> map;
        C1472150oPd player = c1472250oPn.LLLFFI.LLILLJJLI.getPlayer();
        if (player == null || player.LJJJLL() == null || player.LJJJLL().LJIIL() == null || !(player.LJJJLL().LJIIL().get("req_phase_cost") instanceof Map) || (map = (Map) player.LJJJLL().LJIIL().get("req_phase_cost")) == null) {
            return new HashMap();
        }
        return map;
    }

    public static final String LIZJ(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return "mp4";
            }
            if (num.intValue() == 2) {
                return "flv";
            }
            if (num.intValue() == 3) {
                return "cmaf";
            }
            if (num.intValue() == 4) {
                return "hls";
            }
            if (num.intValue() == 5) {
                return "dash";
            }
            if (num.intValue() == 6) {
                return "bash";
            }
            if (num.intValue() == 7) {
                return "mp3";
            }
            if (num.intValue() == 8) {
                return "avph";
            }
            if (num.intValue() == 9) {
                return "llash";
            }
            if (num.intValue() == 10) {
                return "webrtc";
            }
            if (num.intValue() == 11) {
                return "live";
            }
            return "NotInEnum";
        }
        return "NotInEnum";
    }
}
