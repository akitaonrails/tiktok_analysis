package X;

import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* JADX INFO: renamed from: X.0DjM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347220DjM {
    public static float LIZIZ(NLESegment nLESegment) {
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLESegment);
        if (nLESegmentVideoDynamicCast != null) {
            return nLESegmentVideoDynamicCast.getVolume();
        }
        NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLESegment);
        if (nLESegmentAudioDynamicCast != null) {
            return nLESegmentAudioDynamicCast.getVolume();
        }
        return 1.0f;
    }

    public static Float LIZ(long j, NLETrackSlot nLETrackSlot) {
        float f;
        Float fValueOf;
        Float fValueOf2;
        float fFloatValue;
        NLESegmentVideo nLESegmentVideo;
        NLESegmentVideo nLESegmentVideo2;
        NLESegment mainSegment;
        NLESegment mainSegment2;
        if (nLETrackSlot.getKeyframes().size() < 2) {
            return null;
        }
        long j2 = -1;
        long j3 = Long.MAX_VALUE;
        int i = 0;
        NLETrackSlot nLETrackSlot2 = null;
        NLETrackSlot nLETrackSlot3 = null;
        for (NLETrackSlot nLETrackSlot4 : nLETrackSlot.getKeyframes()) {
            int i2 = i + 1;
            if (i >= 0) {
                NLETrackSlot nLETrackSlot5 = nLETrackSlot4;
                long startTime = nLETrackSlot.getStartTime() + nLETrackSlot5.getStartTime();
                if (j2 <= startTime && startTime <= j) {
                    nLETrackSlot2 = nLETrackSlot5;
                    j2 = startTime;
                } else if (j <= startTime && startTime <= j3) {
                    nLETrackSlot3 = nLETrackSlot5;
                    j3 = startTime;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (nLETrackSlot2 != null && nLETrackSlot3 != null) {
            f = (j - j2) / (j3 - j2);
        } else {
            f = 1.0f;
        }
        if (nLETrackSlot2 != null && (mainSegment2 = nLETrackSlot2.getMainSegment()) != null) {
            fValueOf = Float.valueOf(LIZIZ(mainSegment2));
        } else {
            fValueOf = null;
        }
        if (nLETrackSlot3 != null && (mainSegment = nLETrackSlot3.getMainSegment()) != null) {
            fValueOf2 = Float.valueOf(LIZIZ(mainSegment));
        } else {
            fValueOf2 = null;
        }
        float fFloatValue2 = 0.0f;
        if (fValueOf != null && nLETrackSlot2 != null && (nLESegmentVideo2 = (NLESegmentVideo) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot2.getMainSegment())) != null && !nLESegmentVideo2.getEnableAudio()) {
            fValueOf = Float.valueOf(0.0f);
        }
        if (fValueOf2 != null && nLETrackSlot3 != null && (nLESegmentVideo = (NLESegmentVideo) NLESegmentVideo.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot3.getMainSegment())) != null && !nLESegmentVideo.getEnableAudio()) {
            fValueOf2 = Float.valueOf(0.0f);
        }
        if (fValueOf != null) {
            if (fValueOf2 != null) {
                return Float.valueOf(((fValueOf2.floatValue() - fValueOf.floatValue()) * f) + fValueOf.floatValue());
            }
            fFloatValue = fValueOf.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        if (fValueOf2 != null) {
            fFloatValue2 = fValueOf2.floatValue();
        }
        return Float.valueOf(fFloatValue + fFloatValue2);
    }
}
