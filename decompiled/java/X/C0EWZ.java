package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;

/* JADX INFO: renamed from: X.0EWZ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EWZ {
    public static final boolean LIZ(NLEModel nLEModel, EditorProModel editorProModel) {
        Boolean boolIsOriginalUploadPage;
        if (editorProModel != null && (boolIsOriginalUploadPage = editorProModel.isOriginalUploadPage()) != null && boolIsOriginalUploadPage.booleanValue()) {
            return boolIsOriginalUploadPage.booleanValue();
        }
        boolean zLLII = C351220Dpo.LLII(nLEModel);
        return !zLLII;
    }
}
