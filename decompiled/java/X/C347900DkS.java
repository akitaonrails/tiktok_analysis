package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentImageSticker;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* JADX INFO: renamed from: X.0DkS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347900DkS extends AbstractC348060Dki {
    public final C348450DlL LIZIZ;

    public C347900DkS(C348450DlL c348450DlL) {
        this.LIZIZ = c348450DlL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" 0.init ");
        sbLIZ.append(c348450DlL);
        LJFF(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC348060Dki
    public final void LIZJ(NLEEditor nLEEditor) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" 1.executeNLE ");
        sbLIZ.append(this.LIZIZ);
        LJFF(C2188811AlT.LIZIZ(sbLIZ));
        NLETrackSlot nLETrackSlotLIZ = C14LJ.LIZ(nLEEditor.getModel(), this.LIZIZ.LIZIZ);
        if (nLETrackSlotLIZ != null) {
            LJII(nLETrackSlotLIZ);
        }
    }

    public final void LJII(NLETrackSlot nLETrackSlot) {
        if (NLESegmentImageSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) != null) {
            if (this.LIZIZ.LJIILLIIL != null) {
                if (nLETrackSlot.getPinAlgorithmFile() == null) {
                    nLETrackSlot.setPinAlgorithmFile(new NLEResourceNode());
                }
                nLETrackSlot.getPinAlgorithmFile().setResourceFile(this.LIZIZ.LJIILLIIL);
            } else {
                nLETrackSlot.setPinAlgorithmFile(null);
            }
            if (this.LIZIZ.LJIIZILJ != null) {
                if (nLETrackSlot.getPinMappingAlgorithmFile() == null) {
                    nLETrackSlot.setPinMappingAlgorithmFile(new NLEResourceNode());
                }
                nLETrackSlot.getPinMappingAlgorithmFile().setResourceFile(this.LIZIZ.LJIIZILJ);
            } else if (nLETrackSlot.getPinMappingAlgorithmFile() != null) {
                nLETrackSlot.setPinMappingAlgorithmFile(null);
            }
            if (nLETrackSlot.hasRelativeWidth() || nLETrackSlot.hasRelativeHeight()) {
                nLETrackSlot.setRelativeWidth(this.LIZIZ.LJIILIIL);
                nLETrackSlot.setRelativeHeight(this.LIZIZ.LJIILJJIL);
            }
        }
        new C347970DkZ(this.LIZIZ).LJII(nLETrackSlot);
    }
}
