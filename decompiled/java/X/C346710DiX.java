package X;

import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DiX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C346710DiX {
    public static final float LIZ(NLESegmentAudio nLESegmentAudio) {
        if (!Intrinsics.LIZIZ(Double.valueOf(nLESegmentAudio.getCurveAveSpeed()), 1.0d)) {
            return (float) nLESegmentAudio.getCurveAveSpeed();
        }
        return nLESegmentAudio.getAbsSpeed();
    }

    public static final boolean LIZIZ(NLETrackSlot nLETrackSlot) {
        NLESegmentAudio nLESegmentAudioDynamicCast;
        if (nLETrackSlot == null || (nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment())) == null) {
            return false;
        }
        if (!(!nLESegmentAudioDynamicCast.getSegCurveSpeedPoints().isEmpty()) && !(!nLESegmentAudioDynamicCast.getCurveSpeedPoints().isEmpty())) {
            return false;
        }
        return true;
    }
}
