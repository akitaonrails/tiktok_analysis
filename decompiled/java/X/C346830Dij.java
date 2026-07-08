package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLESegmentTimeEffect;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0Dij, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C346830Dij extends AbstractC348060Dki {
    @Override // X.AbstractC348060Dki
    public final void LIZ(INLEMediaSession iNLEMediaSession) {
        iNLEMediaSession.getPlayerApi().prepare();
    }

    @Override // X.AbstractC348060Dki
    public final void LIZJ(NLEEditor nLEEditor) {
        NLETrack next;
        Iterator<NLETrack> it2 = nLEEditor.getModel().getTracks().iterator();
        loop0: while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                NLETrack nLETrack = next;
                if (nLETrack.getExtraTrackType() == NLETrackType.EFFECT) {
                    VecNLETrackSlotSPtr slots = nLETrack.getSlots();
                    if (!(slots instanceof Collection) || !slots.isEmpty()) {
                        Iterator<NLETrackSlot> it3 = slots.iterator();
                        while (it3.hasNext()) {
                            if (NLESegmentTimeEffect.dynamicCast(it3.next().getMainSegment()) != null) {
                                break loop0;
                            }
                        }
                    }
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack2 = next;
        if (nLETrack2 != null) {
            nLEEditor.getModel().removeTrack(nLETrack2);
        }
    }
}
