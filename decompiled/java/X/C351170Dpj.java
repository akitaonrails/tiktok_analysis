package X;

import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* JADX INFO: renamed from: X.0Dpj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C351170Dpj {
    public static final NLESegmentVideo LIZ(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot != null) {
            return NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        }
        return null;
    }
}
