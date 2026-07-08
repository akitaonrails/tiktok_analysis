package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mbK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402520mbK {
    public static final C1402520mbK LIZ = new C1402520mbK();

    public static String LIZIZ(String str) {
        if (str != null && str.length() != 0) {
            return "sdk";
        }
        return "system_share";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2) {
        /*
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r2.creativeModel
            com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel r0 = r0.draftInfoModel
            java.lang.String r2 = r0.saveDraftScene
            int r0 = r2.hashCode()
            switch(r0) {
                case -1717523689: goto Le;
                case -521944235: goto L17;
                case 818879405: goto L20;
                case 1676731405: goto L29;
                default: goto Ld;
            }
        Ld:
            return r2
        Le:
            java.lang.String r1 = "editor_pro_add_more"
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto Ld
            return r1
        L17:
            java.lang.String r0 = "ai_livephoto_click_loading_sheet"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L31
            return r2
        L20:
            java.lang.String r0 = "ai_livephoto_cancel_edit_auto_save"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L31
            return r2
        L29:
            java.lang.String r0 = "ai_livephoto_publish_auto_save"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Ld
        L31:
            java.lang.String r2 = "ai_livephoto_autosave"
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1402520mbK.LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):java.lang.String");
    }

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, C1403560md0 c1403560md0) {
        int i = 0;
        C538730LAx.LIZIZ(c1403560md0, videoPublishEditModel, false, false, false, null);
        if (!videoPublishEditModel.isCurrentAutoCutMode()) {
            return;
        }
        AutoCutModel autoCutModel = videoPublishEditModel.creativeModel.autoCutModel;
        c1403560md0.LJ("autocut_style_name", s.LJIILIIL(autoCutModel.curIndexFromSource, autoCutModel, C1416110mxF.LJIIJJI(autoCutModel.curSource)));
        s.LIZ.getClass();
        if (s.LJIILLIIL(autoCutModel, null) == 0) {
            i = 1;
        }
        c1403560md0.LIZ(i, "is_recommend_style");
        c1403560md0.LJ("autocut_click_from", autoCutModel.clickFrom);
        c1403560md0.LIZ(videoPublishEditModel.creativeModel.autoCutModel.curTemplateType, "autocut_template_type");
        c1403560md0.LJ("tt_template_id", videoPublishEditModel.getTTTemplateIdForAutoCut());
        c1403560md0.LJ("autocut_click_from", C1428520nHG.LJJII(videoPublishEditModel, C1416110mxF.LJIIJJI(autoCutModel.curSource), null));
        c1403560md0.LIZ(autoCutModel.curGenerateType, "autocut_generate_type");
        c1403560md0.LIZ(autoCutModel.curTemplateType, "autocut_template_type");
        c1403560md0.LJ("autocut_template_id", autoCutModel.curTemplateId);
        c1403560md0.LJ("autocut_template_group_id", autoCutModel.curTemplateGroupId);
        C1412610mrb.LJFF(c1403560md0, Integer.valueOf(autoCutModel.curTemplateType), autoCutModel.curSceneType);
        c1403560md0.LIZ(!Intrinsics.LJFF("other", s.LJJIIJ(autoCutModel, null, null)) ? 1 : 0, "is_reuse_music");
        c1403560md0.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c1403560md0.LIZ(C1403130mcJ.LIZLLL(autoCutModel.templateList, autoCutModel.curIndexFromSource, C1416110mxF.LJIIJJI(autoCutModel.curSource)) + 1, "autocut_style_order");
    }

    public static void LJFF(int i, VideoPublishEditModel videoPublishEditModel, String str, boolean z, boolean z2) {
        C0LAB c0labLIZ = C1402930mbz.LIZ(videoPublishEditModel, str);
        c0labLIZ.LIZ(z ? 1 : 0, "is_from_draft_popup");
        c0labLIZ.LJ("enter_method_popup", C1402930mbz.LIZIZ(videoPublishEditModel));
        c0labLIZ.LIZ(C1402930mbz.LIZLLL(videoPublishEditModel), "is_from_external");
        c0labLIZ.LJ("enter_method", videoPublishEditModel.getShootEnterMethod());
        c0labLIZ.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0labLIZ.LJ(Scene.SCENE_SERVICE, LIZJ(videoPublishEditModel));
        c0labLIZ.LJ("is_posted_draft", C1402490mbH.LIZ(videoPublishEditModel.creativeModel.draftInfoModel.isPublishedDraft));
        c0labLIZ.LJ("is_auto_save_after_post", C1402490mbH.LIZ(z2));
        c0labLIZ.LIZ(videoPublishEditModel.creativeModel.editPageRestoreActivityModel.isActivityRestored ? 1 : 0, "is_edit_activity_restored");
        C20684815ws.LJIILLIIL("save_draft_result", c0labLIZ.LIZ);
        C1411890mqR c1411890mqR = C1411890mqR.LIZ;
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        c1411890mqR.getClass();
        C1411890mqR.LIZ(creativeModel);
    }

    public static /* synthetic */ void LJI(C1402520mbK c1402520mbK, VideoPublishEditModel videoPublishEditModel, String str, int i, boolean z, int i2) {
        if ((i2 & 8) != 0) {
            z = false;
        }
        c1402520mbK.getClass();
        LJFF(i, videoPublishEditModel, str, z, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:259:0x07e3  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0c43  */
    /* JADX WARN: Type inference failed for: r1v262 */
    /* JADX WARN: Type inference failed for: r1v263, types: [int] */
    /* JADX WARN: Type inference failed for: r1v272 */
    /* JADX WARN: Type inference failed for: r1v273, types: [int] */
    /* JADX WARN: Type inference failed for: r1v367 */
    /* JADX WARN: Type inference failed for: r1v368 */
    /* JADX WARN: Type inference failed for: r2v33, types: [com.ss.android.ugc.aweme.aikit.api.camera.ability.MobService] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0LAB, X.0md0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r90, java.lang.String r91, java.lang.Integer r92, boolean r93, java.lang.Boolean r94, java.lang.String r95, java.lang.String r96, java.lang.String r97, java.util.List<com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct> r98) {
        /*
            Method dump skipped, instruction units count: 3165
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1402520mbK.LIZLLL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.String, java.lang.Integer, boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List):void");
    }
}
