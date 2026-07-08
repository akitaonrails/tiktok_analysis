package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.vesdk.VEUtils;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Kyb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C535030Kyb {
    public static C535020Kya LIZ(C535020Kya c535020Kya) {
        boolean z;
        String strSubstring;
        String lastPathSegment;
        int iLJJJJ;
        Pair<Integer, Integer> pair;
        int i = 0;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LJI(null)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ve plugin not installed, skip transfer ");
            sbLIZ.append(c535020Kya);
            C537680L6w.LIZ(c552700Lm0, "AlbumAiContentFileManager", C2188811AlT.LIZIZ(sbLIZ), null);
            return null;
        }
        if (c535020Kya.LIZLLL == 0) {
            C552700Lm0 c552700Lm02 = C552700Lm0.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("failed to transfer ");
            sbLIZ2.append(c535020Kya);
            sbLIZ2.append(": unknown mediaType");
            C537680L6w.LIZ(c552700Lm02, "AlbumAiContentFileManager", C2188811AlT.LIZIZ(sbLIZ2), null);
            return null;
        }
        String absolutePath = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.ALBUM_AI, C0LO4.LIZ(c535020Kya.LIZJ), true).getAbsolutePath();
        if (absolutePath == null) {
            return c535020Kya;
        }
        if (!C538760LBa.LIZ(c535020Kya.LJII)) {
            C552700Lm0 c552700Lm03 = C552700Lm0.LIZIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("failed to transfer ");
            sbLIZ3.append(c535020Kya);
            sbLIZ3.append(": src uri not existed");
            C537680L6w.LIZ(c552700Lm03, "AlbumAiContentFileManager", C2188811AlT.LIZIZ(sbLIZ3), null);
            return null;
        }
        String str = c535020Kya.LJIIIIZZ;
        String str2 = c535020Kya.LJII;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(c535020Kya.LIZ);
        sbLIZ4.append("_ai_local_uri");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        if (str2 != null) {
            int iLJJJJ2 = a0.LJJJJ(str2, '.', 0, 6);
            String strSubstring2 = "";
            if (iLJJJJ2 == -1) {
                strSubstring = "";
            } else {
                strSubstring = str2.substring(iLJJJJ2);
            }
            if ((Intrinsics.LJFF(strSubstring, ".cnt") || Intrinsics.LJFF(strSubstring, ".tmp")) && (lastPathSegment = UriProtector.parse(str).getLastPathSegment()) != null && (((iLJJJJ = a0.LJJJJ(lastPathSegment, '.', 0, 6)) == -1 || (strSubstring2 = lastPathSegment.substring(iLJJJJ)) != null) && strSubstring2.length() > 0)) {
                strSubstring = strSubstring2;
            }
            String str3 = absolutePath + '/' + strLIZIZ + strSubstring;
            if (!Intrinsics.LJFF(str2, str3)) {
                C2286708xd.LJFF(str2, str3);
            }
            if (str3 != null && C538760LBa.LIZ(str3)) {
                int i2 = c535020Kya.LIZLLL;
                if (i2 == 2) {
                    VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str3);
                    if (videoFileInfo != null) {
                        i = videoFileInfo.duration;
                    }
                    if (videoFileInfo != null) {
                        pair = new Pair<>(Integer.valueOf(videoFileInfo.width), Integer.valueOf(videoFileInfo.height));
                    } else {
                        pair = new Pair<>(0, 0);
                    }
                } else if (i2 == 1) {
                    pair = C371780Ehs.LJIIJ(str3);
                } else {
                    pair = new Pair<>(0, 0);
                }
                int iIntValue = pair.getFirst().intValue();
                int iIntValue2 = pair.getSecond().intValue();
                if (iIntValue > 0 && iIntValue2 > 0) {
                    C535020Kya c535020KyaLIZ = C535020Kya.LIZ(c535020Kya, iIntValue, iIntValue2, i, str3, false, 0, 65295);
                    C552700Lm0 c552700Lm04 = C552700Lm0.LIZIZ;
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("transfer from ");
                    sbLIZ5.append(c535020Kya);
                    sbLIZ5.append(" to ");
                    sbLIZ5.append(c535020KyaLIZ);
                    C201955140j.LIZLLL(c552700Lm04, "AlbumAiContentFileManager", C2188811AlT.LIZIZ(sbLIZ5));
                    return c535020KyaLIZ;
                }
                C552700Lm0 c552700Lm05 = C552700Lm0.LIZIZ;
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("failed to transfer ");
                sbLIZ6.append(c535020Kya);
                sbLIZ6.append(": unknown size");
                C537680L6w.LIZ(c552700Lm05, "AlbumAiContentFileManager", C2188811AlT.LIZIZ(sbLIZ6), null);
                return null;
            }
        }
        C552700Lm0 c552700Lm06 = C552700Lm0.LIZIZ;
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("failed to transfer ");
        sbLIZ7.append(c535020Kya);
        sbLIZ7.append(": transferred uri not existed");
        C537680L6w.LIZ(c552700Lm06, "AlbumAiContentFileManager", C2188811AlT.LIZIZ(sbLIZ7), null);
        return null;
    }
}
