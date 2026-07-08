package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.AutoCutAnchorModel;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0LFr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C539970LFr {
    public static final String LIZ(VideoPublishEditModel videoPublishEditModel) throws Throwable {
        NLEModel nLEModelLIZIZ = LIZIZ(videoPublishEditModel);
        if (nLEModelLIZIZ == null || ((ArrayList) s.LJIIZILJ(nLEModelLIZIZ)).size() > 35) {
            return null;
        }
        String strLIZJ = C0E3A.LIZJ(videoPublishEditModel.creativeModel.autoCutAnchorModel.templateId, EnumC20228014Cw.AUTOCUT_TEMPLATE_ZIP, nLEModelLIZIZ, videoPublishEditModel, null, false, false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutTemplateHelper#buildAutoCutTemplateZip success: ");
        sbLIZ.append(strLIZJ);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        return strLIZJ;
    }

    public static final NLEModel LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        String str;
        boolean zIsAdvancedEditDraft;
        EditorProModel editorProModel;
        C0FGC.LIZ(2);
        NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
        AutoCutAnchorModel autoCutAnchorModel = videoPublishEditModel.creativeModel.autoCutAnchorModel;
        if (!C123100dR.LIZ(autoCutAnchorModel.nleData) && (str = autoCutAnchorModel.nleDataPath) != null && str.length() != 0 && C2354709Kn.LIZIZ(str)) {
            int i = autoCutAnchorModel.nleDataVersion;
            CreativeFlowData creativeFlowData = videoPublishEditModel.getCreativeFlowData();
            if (creativeFlowData != null && (editorProModel = creativeFlowData.getEditorProModel()) != null) {
                zIsAdvancedEditDraft = editorProModel.isAdvancedEditDraft();
            } else {
                zIsAdvancedEditDraft = false;
            }
            autoCutAnchorModel.nleDataVersion = C349900Dng.LIZ(i, str, zIsAdvancedEditDraft).getSecond().intValue();
            autoCutAnchorModel.nleData = C2354709Kn.LJIJ(str);
        }
        String str2 = videoPublishEditModel.creativeModel.autoCutAnchorModel.nleData;
        if (str2 != null && str2.length() != 0) {
            nLEEditorLIZ.restore(videoPublishEditModel.creativeModel.autoCutAnchorModel.nleData);
            NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(nLEEditorLIZ.getModel().deepClone());
            for (NLEResourceNode nLEResourceNode : nLEModelDynamicCast.getAllResources()) {
                if (nLEResourceNode.getResourceType() == NLEResType.VIDEO || nLEResourceNode.getResourceType() == NLEResType.IMAGE) {
                    nLEResourceNode.setResourceFile("");
                }
            }
            return nLEModelDynamicCast;
        }
        return null;
    }
}
