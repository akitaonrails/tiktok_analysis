package X;

import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* JADX INFO: renamed from: X.0DjV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347310DjV {
    public static final C348660Dlg LIZ(NLETrackSlot nLETrackSlot) {
        NLESegmentAudio nLESegmentAudio = (NLESegmentAudio) NLESegmentAudio.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot.getMainSegment());
        if (nLESegmentAudio == null) {
            return null;
        }
        return new C348660Dlg(nLETrackSlot.getStartTime(), nLETrackSlot.getEndTime(), nLESegmentAudio.getAVFile().getResourceFile(), nLESegmentAudio.getTimeClipStart(), nLESegmentAudio.getTimeClipEnd(), nLESegmentAudio.getVolume(), C351220Dpo.LLLFFI(nLETrackSlot));
    }
}
