package X;

import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* JADX INFO: renamed from: X.0Dj2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347020Dj2 {
    public static final boolean LIZ(NLESegmentTransition nLESegmentTransition) {
        if (nLESegmentTransition == null || !nLESegmentTransition.hasOverlap() || nLESegmentTransition.hasTimeChange()) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(NLETrackSlot nLETrackSlot) {
        NLESegmentTransition endTransition;
        if (nLETrackSlot != null) {
            endTransition = nLETrackSlot.getEndTransition();
        } else {
            endTransition = null;
        }
        return LIZ(endTransition);
    }
}
