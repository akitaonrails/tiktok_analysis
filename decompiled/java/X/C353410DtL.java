package X;

import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* JADX INFO: renamed from: X.0DtL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C353410DtL {
    public static C368430EcT LIZ(NLESegmentVideo nLESegmentVideo, NLETrackSlot nLETrackSlot) {
        long transitionDuration;
        NLEResType resourceType;
        boolean z;
        long timeClipStart = nLESegmentVideo.getTimeClipStart();
        long duration = nLESegmentVideo.getDuration();
        float fLIZ = C351220Dpo.LIZ(nLESegmentVideo);
        NLESegmentTransition endTransition = nLETrackSlot.getEndTransition();
        if (endTransition != null && C347020Dj2.LIZ(endTransition)) {
            transitionDuration = endTransition.getTransitionDuration();
        } else {
            transitionDuration = 0;
        }
        C370720EgA.LIZ.getClass();
        String strLIZIZ = C370720EgA.LIZIZ(nLETrackSlot);
        long startTime = nLETrackSlot.getStartTime();
        long endTime = nLETrackSlot.getEndTime();
        NLEResourceNode resource = nLESegmentVideo.getResource();
        if (resource != null) {
            resourceType = resource.getResourceType();
        } else {
            resourceType = null;
        }
        if (resourceType == NLEResType.IMAGE) {
            z = true;
        } else {
            z = false;
        }
        return new C368430EcT(nLESegmentVideo, timeClipStart, duration, strLIZIZ, fLIZ, transitionDuration, startTime, endTime, z);
    }
}
