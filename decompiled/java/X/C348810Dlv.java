package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.AFwS288S0000000_5;

/* JADX INFO: renamed from: X.0Dlv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348810Dlv extends AbstractC350210DoB implements InterfaceC350250DoF {
    public final C348760Dlq LLILLJJLI = C350200DoA.LIZ(this, AFwS288S0000000_5.get$arr$(10));

    @Override // X.InterfaceC350250DoF
    public final void LJFF(C348820Dlw c348820Dlw) {
        NLETrack nLETrack;
        C0E48 c0e48 = c348820Dlw.LIZ;
        if ((c0e48 == null || !C349940Dnk.LIZ(c0e48, c348820Dlw.LIZIZ)) && (nLETrack = (NLETrack) C13LP.LJJJLL(this.LLILLJJLI.LIZIZ)) != null && nLETrack.getSortedSlots().size() > 1) {
            int i = 0;
            for (NLETrackSlot nLETrackSlot : nLETrack.getSortedSlots()) {
                int i2 = i + 1;
                if (i >= 0) {
                    NLETrackSlot nLETrackSlot2 = nLETrackSlot;
                    if (i == 0) {
                        NLESegmentAudio nLESegmentAudio = (NLESegmentAudio) NLESegmentAudio.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot2.getMainSegment());
                        if (nLESegmentAudio != null) {
                            nLESegmentAudio.setRepeatCount(NLEEditorJniJNI.NLESegmentAudio_REPEAT_INFINITE_get());
                        }
                    } else {
                        nLETrack.removeSlot(nLETrackSlot2);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }
}
