package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.AutoSelectedAnchorInfos;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0MHp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C565950MHp {
    public static final C565950MHp LIZ = new C565950MHp();

    public static final void LIZ(VideoPublishEditModel videoPublishEditModel) {
        LIZIZ(videoPublishEditModel, true);
        videoPublishEditModel.creativeModel.postPageModel.isCoverBitmapSet = true;
    }

    public static final void LIZIZ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        String strOptString;
        String str;
        CreativeFlowData creativeFlowData;
        String str2;
        if (videoPublishEditModel == null) {
            C0LAB c0lab = new C0LAB();
            c0lab.LIZ(0, "is_cover_show");
            c0lab.LJ("cover_show_duration", "model is null!");
            c0lab.LJ("shoot_way", "model is null!");
            c0lab.LJ("is_draft", "model is null!");
            c0lab.LJ("is_editor_pro", "model is null!");
            c0lab.LJ("is_video", "model is null!");
            C20684815ws.LJIILLIIL("publish_page_cover_show", c0lab.LIZ);
            return;
        }
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        if (creativeModel.postPageModel.isCoverBitmapSet) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - creativeModel.transientPostPageModel.LJ;
        boolean z2 = videoPublishEditModel.creativeModel.draftInfoModel.isDraft;
        boolean zIsAdvancedEdit = videoPublishEditModel.getEditorProModel().isAdvancedEdit();
        CreativeModel creativeModel2 = videoPublishEditModel.creativeModel;
        int i = 1;
        if (creativeModel2.creationTypeModel.creationMode != 1) {
            i = 0;
        }
        String strOptString2 = "";
        try {
            creativeFlowData = creativeModel2.creativeFlowData;
            str2 = null;
        } catch (Exception e) {
            e = e;
        }
        if (creativeFlowData != null && creativeFlowData.getAutoSelectedAnchorInfos() != null) {
            AutoSelectedAnchorInfos autoSelectedAnchorInfos = creativeFlowData.getAutoSelectedAnchorInfos();
            if (autoSelectedAnchorInfos != null) {
                str2 = autoSelectedAnchorInfos.openPlatFormExtra;
            }
            if (!C2105908Mv.LIZ(str2)) {
                try {
                    strOptString = new JSONObject(str2).optString("ttg_task_mode", "");
                    try {
                        strOptString2 = new JSONObject(str2).optString("ttg_task_id", "");
                    } catch (Exception e2) {
                        e = e2;
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (Exception e3) {
                    e = e3;
                    strOptString = "";
                    TryCatchGuardChecker.doCheck(e);
                    str = strOptString2;
                    strOptString2 = strOptString;
                    C0LAB c0lab2 = new C0LAB();
                    c0lab2.LIZ(z ? 1 : 0, "is_cover_show");
                    c0lab2.LIZIZ(jCurrentTimeMillis, "cover_show_duration");
                    c0lab2.LJ("shoot_way", videoPublishEditModel.mShootWay);
                    c0lab2.LIZ(z2 ? 1 : 0, "is_draft");
                    c0lab2.LIZ(zIsAdvancedEdit ? 1 : 0, "is_editor_pro");
                    c0lab2.LIZ(i, "is_video");
                    c0lab2.LJ("creation_id", videoPublishEditModel.getCreationId());
                    c0lab2.LJ("task_type", strOptString2);
                    c0lab2.LJ("task_id", str);
                    C20684815ws.LJIILLIIL("publish_page_cover_show", c0lab2.LIZ);
                }
                str = strOptString2;
                strOptString2 = strOptString;
                C0LAB c0lab22 = new C0LAB();
                c0lab22.LIZ(z ? 1 : 0, "is_cover_show");
                c0lab22.LIZIZ(jCurrentTimeMillis, "cover_show_duration");
                c0lab22.LJ("shoot_way", videoPublishEditModel.mShootWay);
                c0lab22.LIZ(z2 ? 1 : 0, "is_draft");
                c0lab22.LIZ(zIsAdvancedEdit ? 1 : 0, "is_editor_pro");
                c0lab22.LIZ(i, "is_video");
                c0lab22.LJ("creation_id", videoPublishEditModel.getCreationId());
                c0lab22.LJ("task_type", strOptString2);
                c0lab22.LJ("task_id", str);
                C20684815ws.LJIILLIIL("publish_page_cover_show", c0lab22.LIZ);
            }
        }
        str = "";
        C0LAB c0lab222 = new C0LAB();
        c0lab222.LIZ(z ? 1 : 0, "is_cover_show");
        c0lab222.LIZIZ(jCurrentTimeMillis, "cover_show_duration");
        c0lab222.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab222.LIZ(z2 ? 1 : 0, "is_draft");
        c0lab222.LIZ(zIsAdvancedEdit ? 1 : 0, "is_editor_pro");
        c0lab222.LIZ(i, "is_video");
        c0lab222.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab222.LJ("task_type", strOptString2);
        c0lab222.LJ("task_id", str);
        C20684815ws.LJIILLIIL("publish_page_cover_show", c0lab222.LIZ);
    }
}
