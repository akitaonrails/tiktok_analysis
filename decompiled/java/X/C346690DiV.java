package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentImageVideoAnimation;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DiV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C346690DiV extends AbstractC348060Dki {
    public final C348390DlF LIZIZ;

    public C346690DiV(C348390DlF c348390DlF) {
        this.LIZIZ = c348390DlF;
    }

    @Override // X.AbstractC348060Dki
    public final void LIZJ(NLEEditor nLEEditor) {
        NLETrack mainTrack;
        NLEModel model = nLEEditor.getModel();
        if (model != null) {
            mainTrack = model.getMainTrack();
        } else {
            mainTrack = null;
        }
        LJII(mainTrack);
    }

    public final void LJII(NLETrack nLETrack) {
        VecNLETrackSlotSPtr sortedSlots;
        NLESegmentVideo nLESegmentVideoDynamicCast;
        if (nLETrack != null && (sortedSlots = nLETrack.getSortedSlots()) != null) {
            for (NLETrackSlot nLETrackSlot : sortedSlots) {
                for (C574140MfU c574140MfU : this.LIZIZ.LIZ) {
                    C346700DiW c346700DiW = c574140MfU.LJIILL;
                    if (c346700DiW != null && (Intrinsics.LJFF(nLETrackSlot.getName(), c574140MfU.LIZ) || ((nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) != null && nLESegmentVideoDynamicCast.getAVFile().getResourceFile().equals(c574140MfU.LJIILIIL)))) {
                        NLEVideoAnimation nLEVideoAnimation = new NLEVideoAnimation();
                        nLEVideoAnimation.setStartTime(0L);
                        nLEVideoAnimation.setEndTime(c346700DiW.LIZ * 1000);
                        NLESegmentImageVideoAnimation nLESegmentImageVideoAnimation = new NLESegmentImageVideoAnimation();
                        nLESegmentImageVideoAnimation.setBeginScale(c346700DiW.LIZIZ);
                        nLESegmentImageVideoAnimation.setEndScale(c346700DiW.LIZJ);
                        nLEVideoAnimation.setSegment(nLESegmentImageVideoAnimation);
                        nLETrackSlot.addVideoAnim(nLEVideoAnimation);
                    }
                }
            }
        }
    }
}
