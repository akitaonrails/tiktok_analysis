package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0L4X, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public class C0L4X implements C0L7M {
    public final String LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public long LJFF = -1;
    public long LJI = -1;
    public long LJII = -1;
    public List<? extends MediaModel> LJIIIIZZ = C13BV.INSTANCE;

    @Override // X.C0L7K
    public final void LJFF(C0L7F c0l7f, boolean z) {
    }

    @Override // X.C0L7K
    public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
    }

    @Override // X.C0L7M
    public final void onExit() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutTemplateDownloadMobCallback cancel reuse autocut template: templateId = ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", musicId = ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", duration = ");
        sbLIZ.append(C1417710mzp.LIZLLL(this.LJFF));
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(C1417710mzp.LIZLLL(this.LJFF), "duration");
        c2344009Gk.LJIIIIZZ("creation_id", this.LIZ);
        c2344009Gk.LJIIIIZZ("template_id", this.LIZJ);
        c2344009Gk.LJIIIIZZ("music_id", this.LIZLLL);
        c2344009Gk.LIZJ(this.LJ, "designated_material_count");
        List<? extends MediaModel> list = this.LJIIIIZZ;
        ArrayList arrayList = new ArrayList();
        for (MediaModel mediaModel : list) {
            if (mediaModel.LJIILJJIL()) {
                arrayList.add(mediaModel);
            }
        }
        c2344009Gk.LIZJ(arrayList.size(), "video_count");
        List<? extends MediaModel> list2 = this.LJIIIIZZ;
        ArrayList arrayList2 = new ArrayList();
        for (MediaModel mediaModel2 : list2) {
            if (!mediaModel2.LJIILJJIL()) {
                arrayList2.add(mediaModel2);
            }
        }
        c2344009Gk.LIZJ(arrayList2.size(), "photo_count");
        C20684815ws.LJIILLIIL("tool_performance_autocut_anchor_cancel", c2344009Gk.LIZ);
    }

    @Override // X.C0L7M
    public final void LIZ(List<? extends MediaModel> list) {
        this.LJII = System.currentTimeMillis();
        this.LJIIIIZZ = list;
    }

    @Override // X.C0L7M
    public final void LIZIZ(List<C23179096j> list) {
        LJI(null, null, true);
        this.LJI = System.currentTimeMillis();
    }

    @Override // X.C0L7K
    public void LIZLLL(C0L7B c0l7b, boolean z) {
        if (!z) {
            LJII(null, null, true);
        }
    }

    @Override // X.C0L7K
    public void LIZJ(int i, String str, boolean z) {
        if (z) {
            return;
        }
        if (i == 1001) {
            LJI(Integer.valueOf(i), str, false);
        } else {
            LJII(Integer.valueOf(i), str, false);
        }
    }

    @Override // X.C0L7K
    public final void LJ(String str, String str2, boolean z) {
        this.LJFF = System.currentTimeMillis();
    }

    public final void LJI(Integer num, String str, boolean z) {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutTemplateDownloadMobCallback compress media ");
        if (z) {
            str2 = "success";
        } else {
            str2 = "failure";
        }
        sbLIZ.append(str2);
        sbLIZ.append(": templateId = ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", musicId = ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", errCode = ");
        sbLIZ.append(num);
        sbLIZ.append(", errMsg = ");
        sbLIZ.append(str);
        sbLIZ.append(", duration = ");
        sbLIZ.append(C1417710mzp.LIZLLL(this.LJII));
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(!z ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LJ(num, "error_code");
        c2344009Gk.LJIIIIZZ("error_msg", str);
        c2344009Gk.LIZLLL(C1417710mzp.LIZLLL(this.LJII), "duration");
        c2344009Gk.LJIIIIZZ("creation_id", this.LIZ);
        List<? extends MediaModel> list = this.LJIIIIZZ;
        ArrayList arrayList = new ArrayList();
        for (MediaModel mediaModel : list) {
            if (mediaModel.LJIILJJIL()) {
                arrayList.add(mediaModel);
            }
        }
        c2344009Gk.LIZJ(arrayList.size(), "video_count");
        List<? extends MediaModel> list2 = this.LJIIIIZZ;
        ArrayList arrayList2 = new ArrayList();
        for (MediaModel mediaModel2 : list2) {
            if (!mediaModel2.LJIILJJIL()) {
                arrayList2.add(mediaModel2);
            }
        }
        c2344009Gk.LIZJ(arrayList2.size(), "photo_count");
        C20684815ws.LJIILLIIL("tool_performance_autocut_anchor_compress_media", c2344009Gk.LIZ);
    }

    public final void LJII(Integer num, String str, boolean z) {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutTemplateDownloadMobCallback fetch template ");
        if (z) {
            str2 = "success";
        } else {
            str2 = "failure";
        }
        sbLIZ.append(str2);
        sbLIZ.append(": templateId = ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", musicId = ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", errCode = ");
        sbLIZ.append(num);
        sbLIZ.append(", errMsg = ");
        sbLIZ.append(str);
        sbLIZ.append(", isPreload = ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", duration = ");
        sbLIZ.append(C1417710mzp.LIZLLL(this.LJII));
        sbLIZ.append(", clip num = ");
        sbLIZ.append(this.LJ);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(!z ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c2344009Gk.LJ(num, "error_code");
        c2344009Gk.LJIIIIZZ("error_msg", str);
        c2344009Gk.LIZLLL(C1417710mzp.LIZLLL(this.LJI), "duration");
        c2344009Gk.LJIIIIZZ("creation_id", this.LIZ);
        c2344009Gk.LJIIIIZZ("template_id", this.LIZJ);
        c2344009Gk.LIZJ(!this.LIZIZ ? 1 : 0, "is_preload");
        c2344009Gk.LJIIIIZZ("music_id", this.LIZLLL);
        c2344009Gk.LIZJ(this.LJ, "designated_material_count");
        Map<String, String> map = c2344009Gk.LIZ;
        C20684815ws.LJIILLIIL("tool_performance_autocut_fetch_template", map);
        C1417710mzp.LIZ.getClass();
        C1417710mzp.LJJIZ("tool_performance_autocut_fetch_template", map, z);
    }

    public C0L4X(int i, String str, String str2, String str3, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = i;
    }
}
