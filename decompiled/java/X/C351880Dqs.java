package X;

import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* JADX INFO: renamed from: X.0Dqs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C351880Dqs {
    public static final void LIZ(NLETrackSlot nLETrackSlot) {
        NLEResourceNode resource;
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast == null || (resource = nLESegmentVideoDynamicCast.getResource()) == null) {
            return;
        }
        String extra = resource.getExtra("slot_extra_origin_resource_file");
        if (extra != null && extra.length() != 0) {
            return;
        }
        nLETrackSlot.setExtra("slot_extra_origin_duration", String.valueOf(nLETrackSlot.getDuration()));
        nLESegmentVideoDynamicCast.setExtra("slot_extra_origin_clip_start_time", String.valueOf(nLESegmentVideoDynamicCast.getTimeClipStart()));
        nLESegmentVideoDynamicCast.setExtra("slot_extra_origin_clip_end_time", String.valueOf(nLESegmentVideoDynamicCast.getTimeClipEnd()));
        resource.setExtra("slot_extra_origin_resource_file", resource.getResourceFile());
        resource.setExtra("slot_extra_origin_resource_width", String.valueOf(resource.getWidth()));
        resource.setExtra("slot_extra_origin_resource_height", String.valueOf(resource.getHeight()));
    }
}
