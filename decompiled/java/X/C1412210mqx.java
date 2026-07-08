package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.SelectedMaterialItem;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.TemplateMobParams;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0mqx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1412210mqx {
    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        TemplateMobParams templateMobParams = videoPublishEditModel.creativeModel.mixEditingModel.templateMobParams;
        if (templateMobParams == null) {
            return;
        }
        c0lab.LJ("autocut_click_from", templateMobParams.autocutClickFrom);
        c0lab.LJ("autocut_resource_id", templateMobParams.templateResourceId);
        c0lab.LJ("autocut_template_id", templateMobParams.autocutTemplateId);
        c0lab.LIZ(templateMobParams.autocutTemplateType, "autocut_template_type");
        c0lab.LJ("tt_template_type", C1416310mxZ.LJJIJIIJI(videoPublishEditModel, null, true));
        SelectedMaterialItem selectedMaterialItem = videoPublishEditModel.creativeModel.mixEditingModel.selectedMaterialItem;
        if (selectedMaterialItem != null) {
            Integer numValueOf = Integer.valueOf(selectedMaterialItem.materialPosition);
            if (numValueOf.intValue() > 0) {
                c0lab.LIZ(numValueOf.intValue(), "autocut_style_order");
            }
        }
    }

    public static final void LIZIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        C0MJ9 c0mj9LIZIZ;
        TemplateMobParams templateMobParams;
        SelectedMaterialItem selectedMaterialItem = videoPublishEditModel.creativeModel.mixEditingModel.selectedMaterialItem;
        if (selectedMaterialItem != null) {
            c0lab.LJ("auto_edit_id", selectedMaterialItem.materialId);
            c0lab.LIZ(selectedMaterialItem.materialPosition, "auto_edit_rank");
            c0lab.LJ("auto_edit_type", selectedMaterialItem.materialType.getDescription());
            c0lab.LIZ(selectedMaterialItem.fromMixEditingRecommend ? 1 : 0, "is_auto_edit_recommend");
        }
        AutoCutModel autoCutModel = videoPublishEditModel.creativeModel.autoCutModel;
        AutoCutThemeData autoCutThemeData = (AutoCutThemeData) C13LP.LJJJLZIJ(autoCutModel.curIndexFromSource, autoCutModel.templateList);
        if (autoCutThemeData != null) {
            c0mj9LIZIZ = autoCutThemeData.LIZIZ();
        } else {
            c0mj9LIZIZ = null;
        }
        if ((c0mj9LIZIZ == C0MJ9.MIX_EDITING || c0mj9LIZIZ == C0MJ9.SOUND_SYNC) && (templateMobParams = videoPublishEditModel.creativeModel.mixEditingModel.templateMobParams) != null) {
            c0lab.LJ("autocut_click_from", templateMobParams.autocutClickFrom);
            c0lab.LJ("autocut_resource_id", templateMobParams.templateResourceId);
            c0lab.LJ("autocut_template_id", templateMobParams.autocutTemplateId);
            c0lab.LIZ(templateMobParams.autocutTemplateType, "autocut_template_type");
            c0lab.LJ("template_group_id", templateMobParams.autocutTemplateGroupId);
        }
        c0lab.LJ("mix_request_id", videoPublishEditModel.creativeModel.mixEditingModel.requestId);
    }
}
