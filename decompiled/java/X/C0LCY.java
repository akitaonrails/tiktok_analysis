package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;

/* JADX INFO: renamed from: X.0LCY, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LCY {
    public static final C0LCY LIZ = new C0LCY();

    public static final void LIZ(LogLevel logLevel, String str) {
        int i = C560110Lxx.LIZ[logLevel.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("TemplateDownloadProcess ");
                        sbLIZ.append(str);
                        C201955140j.LJIIZILJ(C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("TemplateDownloadProcess ");
                sbLIZ2.append(str);
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("TemplateDownloadProcess ");
            sbLIZ3.append(str);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("TemplateDownloadProcess ");
        sbLIZ4.append(str);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ4));
    }

    public static void LIZJ(AutoCutThemeData autoCutThemeData, String str) {
        LIZLLL(C1412660mrg.LIZJ(autoCutThemeData.templateType), autoCutThemeData.templateId, autoCutThemeData.musicId, autoCutThemeData.musicUrl, autoCutThemeData.musicPostUnavailable, str);
    }

    public static void LIZLLL(EnumC1412640mre enumC1412640mre, String str, String str2, String str3, Boolean bool, String str4) {
        int i;
        String strLIZLLL;
        if (C0C0A.LIZ() && enumC1412640mre == EnumC1412640mre.CUT_SAME) {
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mob prepareDownloadTemplateMusic: templateId = ");
            sbLIZ.append(str);
            sbLIZ.append(", templateType = ");
            sbLIZ.append(enumC1412640mre);
            sbLIZ.append(", musicId = ");
            sbLIZ.append(str2);
            sbLIZ.append(", musicUrl = ");
            sbLIZ.append(str3);
            sbLIZ.append(", musicPostUnavailable = ");
            sbLIZ.append(bool);
            sbLIZ.append(", sceneName = ");
            sbLIZ.append(str4);
            C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
            if (bool == null) {
                i = 2;
            } else if (bool.booleanValue()) {
                i = 1;
            } else {
                i = 0;
            }
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("template_id", str);
            if (enumC1412640mre != null) {
                strLIZLLL = C1412630mrd.LIZLLL(enumC1412640mre);
            } else {
                strLIZLLL = null;
            }
            c0lab.LJ("template_type", strLIZLLL);
            c0lab.LJ("music_id", str2);
            c0lab.LJ("music_url", str3);
            c0lab.LIZ(i, "music_post_unavailable");
            c0lab.LJ("scene_name", str4);
            C20684815ws.LJIILLIIL("tool_performance_template_prepare_download_music", c0lab.LIZ);
        }
    }
}
