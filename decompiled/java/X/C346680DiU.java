package X;

import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0DiU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C346680DiU {
    public static final boolean LIZIZ(NLETrackSlot nLETrackSlot) {
        if (NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) != null) {
            return true;
        }
        return false;
    }

    public static final NLETrackSlot LIZ(NLEModel nLEModel, String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator<NLETrack> it2 = nLEModel.getTracks().iterator();
        while (it2.hasNext()) {
            for (NLETrackSlot nLETrackSlot : it2.next().getSlots()) {
                if (nLETrackSlot.getUUID().equals(str)) {
                    return nLETrackSlot;
                }
            }
        }
        return null;
    }
}
