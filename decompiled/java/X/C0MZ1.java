package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;

/* JADX INFO: renamed from: X.0MZ1, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MZ1 {
    public static final int LIZ(AwemeDraft awemeDraft) {
        CreativeFlowData creativeFlowData;
        EditorProModel editorProModel;
        EditorProModel editorProModel2;
        CreativeFlowData creativeFlowData2 = awemeDraft.LJJJJIZL.creativeFlowData;
        if ((creativeFlowData2 != null && (editorProModel2 = creativeFlowData2.getEditorProModel()) != null && editorProModel2.isAdvancedEdit()) || ((creativeFlowData = awemeDraft.LJJJJIZL.creativeFlowData) != null && (editorProModel = creativeFlowData.getEditorProModel()) != null && editorProModel.isAdvancedEditDraft())) {
            return 10;
        }
        if (awemeDraft.LJJJJIZL.isStoryDraft) {
            return 4;
        }
        if (awemeDraft.LJIIZILJ()) {
            return 5;
        }
        AVDraftExtras aVDraftExtras = awemeDraft.LJJJJIZL;
        if (aVDraftExtras.statusCreateVideoData != null) {
            return 6;
        }
        if (aVDraftExtras.stitchParams != null) {
            return 7;
        }
        if (!TextUtils.isEmpty(awemeDraft.LJJIZ)) {
            return 8;
        }
        AVDraftExtras aVDraftExtras2 = awemeDraft.LJJJJIZL;
        if (aVDraftExtras2.isFastImport) {
            return 3;
        }
        if (awemeDraft.LJIILLIIL == 0) {
            return 2;
        }
        if (aVDraftExtras2.recordMode != 1) {
            return 0;
        }
        return 9;
    }
}
