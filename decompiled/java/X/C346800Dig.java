package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;

/* JADX INFO: renamed from: X.0Dig, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C346800Dig {
    public static final long LIZ = C530010KqV.LIZ() * 1000;
    public static final /* synthetic */ int LIZIZ = 0;

    public static boolean LIZ(NLEModel nLEModel) {
        if (nLEModel.getDuration() <= LIZ) {
            return false;
        }
        for (NLETrack nLETrack : nLEModel.getTracks()) {
            VecNLETrackSlotSPtr sortedSlots = nLETrack.getSortedSlots();
            if (sortedSlots != null) {
                for (NLETrackSlot nLETrackSlot : sortedSlots) {
                    long endTime = nLETrackSlot.getEndTime();
                    long j = LIZ;
                    if (endTime > j) {
                        nLETrackSlot.setExtra("starttime_before_exceed_limit_cut", String.valueOf(nLETrackSlot.getStartTime()));
                        if (nLETrack.getTrackType() == NLETrackType.STICKER) {
                            if (nLETrackSlot.getStartTime() < j) {
                                nLETrackSlot.setEndTime(j);
                            } else {
                                nLETrackSlot.setEnable(false);
                                nLETrackSlot.setExtra("endtime_before_exceed_limit_cut", String.valueOf(nLETrackSlot.getEndTime()));
                            }
                        } else if (nLETrackSlot.getStartTime() < j) {
                            NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
                            if (nLESegmentAudioDynamicCast != null) {
                                nLETrackSlot.setExtra("clip_endtime_before_exceed_limit_cut", String.valueOf(nLESegmentAudioDynamicCast.getTimeClipEnd()));
                                nLESegmentAudioDynamicCast.setTimeClipEnd((long) (((j - nLETrackSlot.getStartTime()) * nLESegmentAudioDynamicCast.getSpeed()) + nLESegmentAudioDynamicCast.getTimeClipStart()));
                                nLETrackSlot.setEndTime(j);
                            }
                        } else {
                            nLETrackSlot.setEnable(false);
                            nLETrackSlot.setExtra("endtime_before_exceed_limit_cut", String.valueOf(nLETrackSlot.getEndTime()));
                        }
                    }
                }
            }
        }
        nLEModel.setExtra("cut_by_time_limit", "true");
        return true;
    }

    public static void LIZJ(NLEModel nLEModel) {
        Long lLIZIZ;
        if (nLEModel.getMaxTargetEndExcludeDisabledNode(true) == LIZ && nLEModel.hasExtra("cut_by_time_limit")) {
            for (NLETrack nLETrack : nLEModel.getTracks()) {
                for (NLETrackSlot nLETrackSlot : nLETrack.getSlots()) {
                    if (nLETrack.getTrackType() != NLETrackType.STICKER && (lLIZIZ = LIZIZ(nLETrackSlot, "clip_endtime_before_exceed_limit_cut")) != null) {
                        NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment()).setTimeClipEnd(lLIZIZ.longValue());
                        nLETrackSlot.removeExtraWithKey("clip_endtime_before_exceed_limit_cut");
                    }
                    Long lLIZIZ2 = LIZIZ(nLETrackSlot, "starttime_before_exceed_limit_cut");
                    if (lLIZIZ2 != null) {
                        nLETrackSlot.setStartTime(lLIZIZ2.longValue());
                        nLETrackSlot.removeExtraWithKey("starttime_before_exceed_limit_cut");
                    }
                    Long lLIZIZ3 = LIZIZ(nLETrackSlot, "endtime_before_exceed_limit_cut");
                    if (lLIZIZ3 != null) {
                        lLIZIZ3.longValue();
                        nLETrackSlot.setEnable(true);
                        nLETrackSlot.removeExtraWithKey("endtime_before_exceed_limit_cut");
                    }
                }
            }
            nLEModel.removeExtraWithKey("cut_by_time_limit");
        }
    }

    public static Long LIZIZ(NLETrackSlot nLETrackSlot, String str) {
        if (!nLETrackSlot.hasExtra(str)) {
            return null;
        }
        return Long.valueOf(CastLongProtector.parseLong(nLETrackSlot.getExtra(str)));
    }
}
