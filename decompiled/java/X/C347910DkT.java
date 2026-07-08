package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentInfoSticker;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* JADX INFO: renamed from: X.0DkT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347910DkT extends AbstractC348060Dki {
    public final C348460DlM LIZIZ;

    public C347910DkT(C348460DlM c348460DlM) {
        this.LIZIZ = c348460DlM;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" 0.init ");
        sbLIZ.append(c348460DlM);
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
        if (NLESegmentInfoSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) != null) {
            if (this.LIZIZ.LJIJ != null) {
                if (nLETrackSlot.getPinAlgorithmFile() == null) {
                    nLETrackSlot.setPinAlgorithmFile(new NLEResourceNode());
                }
                nLETrackSlot.getPinAlgorithmFile().setResourceFile(this.LIZIZ.LJIJ);
            } else {
                nLETrackSlot.setPinAlgorithmFile(null);
            }
            if (this.LIZIZ.LJIJI != null) {
                if (nLETrackSlot.getPinMappingAlgorithmFile() == null) {
                    nLETrackSlot.setPinMappingAlgorithmFile(new NLEResourceNode());
                }
                nLETrackSlot.getPinMappingAlgorithmFile().setResourceFile(this.LIZIZ.LJIJI);
            } else if (nLETrackSlot.getPinMappingAlgorithmFile() != null) {
                nLETrackSlot.setPinMappingAlgorithmFile(null);
            }
        }
        new C347970DkZ(this.LIZIZ).LJII(nLETrackSlot);
    }
}
