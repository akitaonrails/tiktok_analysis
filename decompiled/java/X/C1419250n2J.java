package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import java.util.Map;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0n2J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1419250n2J extends AbstractC1427680nFu {
    public String LLJJ;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 970));

    @Override // X.AbstractC1427680nFu
    public final String LJJ() {
        return "autocut";
    }

    @Override // X.AbstractC1427680nFu
    public final InterfaceC1427650nFr LJIJI() {
        return (InterfaceC1427650nFr) this.LLJJI.getValue();
    }

    @Override // X.AbstractC1427680nFu
    public final boolean LJIILL() {
        return C1394310mO5.LIZ();
    }

    @Override // X.AbstractC1427680nFu
    public final String LJIILLIIL() {
        C1412390mrF c1412390mrFLIZ;
        if (!C298890Bnb.LIZ()) {
            return "autocut";
        }
        if (!C298890Bnb.LIZ() || (c1412390mrFLIZ = C1412380mrE.LIZ(LJIIZILJ())) == null) {
            return null;
        }
        return c1412390mrFLIZ.LIZ;
    }

    @Override // X.AbstractC1434490nQt
    public final EnumC1434810nRP LJIIJJI() {
        return EnumC1434810nRP.AUTOCUT_TEMPLATE_UPLOAD;
    }

    @Override // X.AbstractC1427680nFu
    public final String LJIILJJIL(VideoPublishEditModel videoPublishEditModel) {
        if (!s.LJJLIIIJILLIZJL(videoPublishEditModel)) {
            return null;
        }
        return C539970LFr.LIZ(videoPublishEditModel);
    }

    @Override // X.AbstractC1427680nFu
    public final String LJIL(VideoPublishEditModel videoPublishEditModel) {
        return videoPublishEditModel.creativeModel.autoCutAnchorModel.templateZipPath;
    }

    @Override // X.AbstractC1427680nFu
    public final String LJIJ(CreateAwemeResponse createAwemeResponse, VideoPublishEditModel videoPublishEditModel) {
        String str;
        AutoCutModel autoCutModel = videoPublishEditModel.creativeModel.autoCutModel;
        AutoCutThemeData autoCutThemeDataLJJIII = s.LJJIII(autoCutModel.curIndexFromSource, autoCutModel, C1416110mxF.LJIIJJI(autoCutModel.curSource));
        if (autoCutThemeDataLJJIII == null || (str = autoCutThemeDataLJJIII.musicId) == null) {
            return "";
        }
        return str;
    }

    public final void LJJI(long j, Integer num, String str, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobTemplateBinding: success: ");
        sbLIZ.append(z);
        sbLIZ.append(", duration: ");
        sbLIZ.append(j);
        sbLIZ.append(", errCode = ");
        sbLIZ.append(num);
        sbLIZ.append(", errMsg = ");
        sbLIZ.append(str);
        sbLIZ.append(", itemId = ");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", vid = ");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", musicId = ");
        sbLIZ.append(this.LLJIJIL);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(!z ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZLLL(num, "error_code");
        c0lab.LJ("error_msg", str);
        c0lab.LIZIZ(j, "duration");
        c0lab.LJ("creation_id", this.LLILZLL);
        c0lab.LJ("item_id", this.LLJ);
        c0lab.LJ("vid", this.LLJI);
        c0lab.LJ("track_id", this.LLJIJIL);
        C20684815ws.LJIILLIIL("tool_performance_autocut_template_binding", c0lab.LIZ);
    }

    public final void LJJIFFI(long j, Integer num, String str, boolean z) {
        Object objValueOf;
        if (this.LLJJ != null) {
            objValueOf = Float.valueOf(new C0VSJ(r1).length() / 1024.0f);
        } else {
            objValueOf = -1;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobTemplateUpload: success: ");
        sbLIZ.append(z);
        sbLIZ.append(", duration: ");
        sbLIZ.append(j);
        sbLIZ.append(", size = ");
        sbLIZ.append(objValueOf);
        sbLIZ.append(", errCode = ");
        sbLIZ.append(num);
        sbLIZ.append(", errMsg = ");
        sbLIZ.append(str);
        sbLIZ.append(", itemId = ");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", vid = ");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", musicId = ");
        sbLIZ.append(this.LLJIJIL);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(!z ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZLLL(num, "error_code");
        c0lab.LJ("error_msg", str);
        c0lab.LIZIZ(j, "duration");
        c0lab.LJ("creation_id", this.LLILZLL);
        c0lab.LJ("item_id", this.LLJ);
        c0lab.LJ("vid", this.LLJI);
        c0lab.LIZLLL(objValueOf, "size");
        Map<String, String> map = c0lab.LIZ;
        C20684815ws.LJIILLIIL("tool_performance_autocut_template_upload", map);
        C1417710mzp.LIZ.getClass();
        C1417710mzp.LJJIZ("tool_performance_autocut_template_upload", map, z);
    }

    public final void LJJII(long j, Integer num, String str, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobUploadTos: success: ");
        sbLIZ.append(z);
        sbLIZ.append(", duration: ");
        sbLIZ.append(j);
        sbLIZ.append(", errCode = ");
        sbLIZ.append(num);
        sbLIZ.append(", errMsg = ");
        sbLIZ.append(str);
        sbLIZ.append(", zipUrl = ");
        sbLIZ.append(this.LLJJ);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(!z ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZLLL(num, "error_code");
        c0lab.LJ("error_msg", str);
        c0lab.LIZIZ(j, "duration");
        c0lab.LJ("zip_url", this.LLJJ);
        c0lab.LJ("creation_id", this.LLILZLL);
        C20684815ws.LJIILLIIL("tool_performance_autocut_template_tos", c0lab.LIZ);
    }
}
