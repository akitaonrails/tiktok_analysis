package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.NLEInfoModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;

/* JADX INFO: renamed from: X.0MZk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570580MZk {
    public static final C570580MZk LIZ = new C570580MZk();

    public static final void LIZIZ(AwemeDraft awemeDraft, InterfaceC570740Ma0 interfaceC570740Ma0) {
        if (awemeDraft == null) {
            interfaceC570740Ma0.onFinish(awemeDraft);
        } else {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C570600MZm(awemeDraft, interfaceC570740Ma0, null), 3);
        }
    }

    public static void LIZJ(AwemeDraft awemeDraft, InterfaceC570740Ma0 interfaceC570740Ma0) {
        boolean zIsAdvancedEditDraft;
        String str;
        EditorProModel editorProModel;
        CreativeFlowData creativeFlowData = awemeDraft.LJJJJIZL.creativeFlowData;
        if (creativeFlowData != null && creativeFlowData.getEditorProModel() != null) {
            CreativeFlowData creativeFlowData2 = awemeDraft.LJJJJIZL.creativeFlowData;
            if (creativeFlowData2 != null && (editorProModel = creativeFlowData2.getEditorProModel()) != null) {
                zIsAdvancedEditDraft = editorProModel.isAdvancedEditDraft();
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            zIsAdvancedEditDraft = false;
        }
        if (awemeDraft.LJIILIIL()) {
            if (interfaceC570740Ma0 != null) {
                interfaceC570740Ma0.onFinish(awemeDraft);
                return;
            }
            return;
        }
        if (!TextUtils.isEmpty(awemeDraft.LIZ.nleInfoModel.nleDataPath)) {
            str = awemeDraft.LIZ.nleInfoModel.nleDataPath;
        } else {
            str = awemeDraft.LJJJJIZL.nleDataPath;
        }
        NLEInfoModel nLEInfoModel = awemeDraft.LIZ.nleInfoModel;
        nLEInfoModel.nleDataVersion = C349900Dng.LIZ(nLEInfoModel.nleDataVersion, str, zIsAdvancedEditDraft).getSecond().intValue();
        if (TextUtils.isEmpty(awemeDraft.LJIIJJI) && !TextUtils.isEmpty(str)) {
            awemeDraft.LJIJJ(C2354709Kn.LJIJ(str));
        }
        if (interfaceC570740Ma0 == null) {
            return;
        }
        interfaceC570740Ma0.onFinish(awemeDraft);
    }

    public static C570730MZz LIZ(C570580MZk c570580MZk, int i, String str, C0LBJ c0lbj, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        if ((i2 & 4) != 0) {
            c0lbj = null;
        }
        c570580MZk.getClass();
        return new C570730MZz(i, c0lbj, str);
    }
}
