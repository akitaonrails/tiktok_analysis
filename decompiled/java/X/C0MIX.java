package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.aime.MobModule;
import com.ss.android.ugc.aweme.creative.model.AISelfModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.LandingModel;
import com.ss.android.ugc.aweme.creative.model.ModelPictureUploadedResultWrapper;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0MIX, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MIX {
    public static final C0MIX LIZ = new C0MIX();

    public static ArrayList LIZIZ(Bundle bundle, String str) {
        ArrayList arrayList = new ArrayList();
        Serializable serializable = bundle.getSerializable(str);
        if (serializable instanceof ArrayList) {
            for (Object obj : (ArrayList) serializable) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public static void LIZ(Bundle bundle, CreativeModel creativeModel, ShortVideoContext shortVideoContext) {
        AISelfModel aISelfModel = creativeModel.aiSelfModel;
        aISelfModel.originalEditEffectIds = LIZIZ(bundle, "ai_self_edit_effect_id");
        aISelfModel.templateIds = LIZIZ(bundle, "ai_self_template_ids");
        aISelfModel.taskId = bundle.getString("ai_self_model_task_id");
        aISelfModel.styleSelectedFrom = bundle.getString("style_selected_from", "");
        aISelfModel.isChildStyle = Boolean.valueOf(bundle.getBoolean("ai_self_model_is_child_style", false));
        String string = bundle.getString("ai_self_model_root_resource_id");
        if (!TextUtils.isEmpty(string)) {
            aISelfModel.styleResourceId = string;
        }
        aISelfModel.isTemplateStyle = bundle.getBoolean("is_template_style", false);
        creativeModel.aiSelfScanFaceModel.aiSelfScanFaceEntry = bundle.getBoolean("scan_face_entry", false);
        aISelfModel.aimeEntrance = ((MobModule) ServiceManager.get().getService(MobModule.class)).LIZLLL();
        if (C527780Kmu.LIZ) {
            String string2 = bundle.getString("music_id");
            if (string2 != null && string2.length() != 0) {
                aISelfModel.musicId = string2;
            }
            aISelfModel.challengeId = bundle.getString("challenge_id");
        }
        boolean z = bundle.getBoolean("ai_self_model_is_ultra_fast_style_generation");
        boolean z2 = bundle.getBoolean("ai_self_model_is_ultra_fast_model_creation");
        if (!z && !z2) {
            String string3 = bundle.getString("ai_self_model_style_id");
            String string4 = bundle.getString("ai_self_model_style_parent_id");
            String string5 = bundle.getString("ai_self_model_style_name");
            String string6 = bundle.getString("ai_self_model_style_icon_uri");
            String string7 = bundle.getString("ai_self_model_customized_prompt_text");
            String string8 = bundle.getString("ai_self_model_anchor_icon_uri");
            int i = bundle.getInt("EXTRA_AI_SELF_IS_MAIN_COVER");
            if (!TextUtils.isEmpty(string3) && !TextUtils.isEmpty(string5) && !TextUtils.isEmpty(string6) && string7 != null) {
                AISelfModel aISelfModel2 = creativeModel.aiSelfModel;
                aISelfModel2.styleId = string3;
                aISelfModel2.styleName = string5;
                String absolutePath = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.UGC_TEMPLATE, "template_cache", true).getAbsolutePath();
                String strLIZ = C1449640npK.LIZ(".jpg");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(absolutePath);
                sbLIZ.append('/');
                sbLIZ.append(strLIZ);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C2286708xd.LJFF(string6, strLIZIZ);
                AISelfModel aISelfModel3 = creativeModel.aiSelfModel;
                aISelfModel3.styleIconUri = strLIZIZ;
                aISelfModel3.styleCustomizedPromptText = string7;
                aISelfModel3.anchorIconUri = string8;
                aISelfModel3.isFromMainCover = i;
                if (!TextUtils.isEmpty(string4)) {
                    creativeModel.aiSelfModel.styleParentId = string4;
                }
            }
        } else {
            int i2 = bundle.getInt("EXTRA_AI_SELF_IS_MAIN_COVER");
            AISelfModel aISelfModel4 = creativeModel.aiSelfModel;
            aISelfModel4.isFromMainCover = i2;
            aISelfModel4.isUltraFastStyleGeneration = z;
            aISelfModel4.isUltraFastModelCreation = z2;
            String string9 = bundle.getString("ai_self_model_style_id");
            int i3 = bundle.getInt("ai_self_model_quota", -1);
            if (i3 != -1) {
                creativeModel.aiSelfModel.quota = Integer.valueOf(i3);
            }
            int i4 = bundle.getInt("ai_self_model_quota_remain", -1);
            if (i4 != -1) {
                creativeModel.aiSelfModel.quotaRemain = Integer.valueOf(i4);
            }
            ModelPictureUploadedResultWrapper modelPictureUploadedResultWrapper = (ModelPictureUploadedResultWrapper) bundle.getParcelable("ai_self_model_model_creation_picture_upload_result");
            creativeModel.aiSelfModel.styleId = string9;
            String string10 = bundle.getString("ai_self_model_style_parent_id");
            AISelfModel aISelfModel5 = creativeModel.aiSelfModel;
            aISelfModel5.styleParentId = string10;
            aISelfModel5.modelPictureUploadedResultWrapper = modelPictureUploadedResultWrapper;
        }
        AISelfModel aISelfModel6 = creativeModel.aiSelfModel;
        if (aISelfModel6.styleName != null || aISelfModel6.isUltraFastModelCreation || aISelfModel6.isUltraFastStyleGeneration) {
            boolean z3 = bundle.getBoolean("is_from_editor_tab", false);
            boolean z4 = bundle.getBoolean("arg_is_editor_pro_outlinker", false);
            String string11 = bundle.getString("arg_editor_pro_outlinker", "");
            if (z4) {
                LandingModel landingModel = creativeModel.landingModel;
                landingModel.landingTab = "editor_tab";
                landingModel.dataComeFrom = string11;
                landingModel.isFromExternalLink = Boolean.TRUE;
            }
            creativeModel.aiSelfModel.aiSelfIsFromAlbumAiTab = bundle.getInt("ai_self_is_from_album_ai_tab", 0);
            if (z3) {
                if (creativeModel.creativeFlowData.getEditorProModel() == null) {
                    EditorProModel editorProModel = new EditorProModel(false, null, false, false, "", false, 0L, null, null, false, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), false, false, false, 0, false, false, false, false, 0, false, false, null, true, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), false, -1, -1, "", false, false, null, null, new ArrayList(), null, new ArrayList(), new ArrayList(), new ArrayList(), new LinkedHashMap(), new ArrayList(), new ArrayList(), new ArrayList(), null, null, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), null, new ArrayList(), new ConcurrentHashMap(), new ArrayList(), false, false, "", false, -1L, false, null);
                    editorProModel.setOldEffectDraft(false);
                    editorProModel.setFromEditorProEntranceInAlbum(false);
                    creativeModel.creativeFlowData.setEditorProModel(editorProModel);
                }
                EditorProModel editorProModel2 = creativeModel.creativeFlowData.getEditorProModel();
                if (editorProModel2 != null) {
                    editorProModel2.setOpenEditToolType("aiself");
                }
                creativeModel.isFromEditTab = true;
                if (shortVideoContext != null) {
                    if (shortVideoContext.creativeFlowData.getEditorProModel() == null) {
                        shortVideoContext.creativeFlowData.setEditorProModel(creativeModel.creativeFlowData.getEditorProModel());
                        return;
                    }
                    EditorProModel editorProModel3 = shortVideoContext.creativeFlowData.getEditorProModel();
                    if (editorProModel3 == null) {
                        return;
                    }
                    editorProModel3.setOpenEditToolType("aiself");
                }
            }
        }
    }
}
