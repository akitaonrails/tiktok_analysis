package X;

import android.util.Size;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.components.base.api.IPreviewService;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ELg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C363060ELg implements InterfaceC351060DpY {
    @Override // X.InterfaceC351060DpY
    public final float LIZ(NLETrackSlot nLETrackSlot) {
        NLEResourceNode resource;
        String resourceFile;
        float width;
        float height;
        InterfaceC361710EGb previewPanelApi;
        LiveState<Size> canvasSize;
        Size sizeLIZJ;
        LiveState<Size> canvasSize2;
        Size sizeLIZJ2;
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        if (mainSegment != null && (resource = mainSegment.getResource()) != null && (resourceFile = resource.getResourceFile()) != null) {
            C1452210ntT c1452210ntTLIZ = C20137513qn.LIZ.LIZ(resourceFile);
            int i = c1452210ntTLIZ.LIZ;
            int i2 = c1452210ntTLIZ.LIZIZ;
            int i3 = c1452210ntTLIZ.LIZJ;
            if (i3 == 90 || i3 == 270) {
                i2 = i;
                i = i2;
            }
            Pair pair = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
            int iIntValue = ((Number) pair.getFirst()).intValue();
            int iIntValue2 = ((Number) pair.getSecond()).intValue();
            IPreviewService iPreviewServiceLIZ = C357280Dza.LIZ();
            InterfaceC361710EGb previewPanelApi2 = null;
            if (iPreviewServiceLIZ != null) {
                previewPanelApi2 = iPreviewServiceLIZ.getPreviewPanelApi();
            }
            if (previewPanelApi2 != null && (canvasSize2 = previewPanelApi2.getCanvasSize()) != null && (sizeLIZJ2 = canvasSize2.LIZJ()) != null) {
                width = sizeLIZJ2.getWidth();
            } else {
                width = 0.0f;
            }
            IPreviewService iPreviewServiceLIZ2 = C357280Dza.LIZ();
            if (iPreviewServiceLIZ2 != null && (previewPanelApi = iPreviewServiceLIZ2.getPreviewPanelApi()) != null && (canvasSize = previewPanelApi.getCanvasSize()) != null && (sizeLIZJ = canvasSize.LIZJ()) != null) {
                height = sizeLIZJ.getHeight();
            } else {
                height = 0.0f;
            }
            if (iIntValue2 != 0 && width > 0.0f && height > 0.0f) {
                if (iIntValue / iIntValue2 < 1.0f) {
                    return (height - C390810FTz.LIZ(48.0f)) / height;
                }
                return (width - C390810FTz.LIZ(24.0f)) / width;
            }
            return 0.8f;
        }
        return 0.8f;
    }
}
