package X;

import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* JADX INFO: renamed from: X.0Dn1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349490Dn1 {
    public static final long LIZ(NLETrackSlot nLETrackSlot) {
        NLEResourceAV aVFile;
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        C351510DqH.LIZ.getClass();
        if (C351510DqH.LJJIL(nLETrackSlot)) {
            NLEResourceAV nLEResourceAVLJJIIJZLJL = C351510DqH.LJJIIJZLJL(nLETrackSlot);
            if (nLEResourceAVLJJIIJZLJL != null) {
                return nLEResourceAVLJJIIJZLJL.getDuration();
            }
            return 0L;
        }
        if (nLETrackSlot.getRewind()) {
            aVFile = nLESegmentVideoDynamicCast.getReversedAVFile();
        } else {
            aVFile = nLESegmentVideoDynamicCast.getAVFile();
        }
        return aVFile.getDuration();
    }
}
