package X;

import com.bytedance.ies.nle.editor_jni.NLEKeyframe;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLEKeyframe;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DmL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349070DmL {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
        VecNLETrackSlotSPtr keyframes;
        VecNLEKeyframe swingKeyframes;
        if (C351220Dpo.LLF(nLETrackSlot) || C351220Dpo.LLF(nLETrackSlot2)) {
            if (nLETrackSlot != null) {
                nLETrackSlot.clearKeyframe();
            }
            if (nLETrackSlot2 != null && (keyframes = nLETrackSlot2.getKeyframes()) != null) {
                Iterator<NLETrackSlot> it2 = keyframes.iterator();
                while (it2.hasNext()) {
                    NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(it2.next().deepClone());
                    if (nLETrackSlot != null) {
                        nLETrackSlot.addKeyframe(nLETrackSlotDynamicCast);
                    }
                }
            }
        }
        if (C351220Dpo.LLIIIJ(nLETrackSlot) || C351220Dpo.LLIIIJ(nLETrackSlot2)) {
            if (nLETrackSlot != null) {
                nLETrackSlot.clearSwingKeyframe();
            }
            if (nLETrackSlot2 != null && (swingKeyframes = nLETrackSlot2.getSwingKeyframes()) != null) {
                Iterator<NLEKeyframe> it3 = swingKeyframes.iterator();
                while (it3.hasNext()) {
                    NLEKeyframe nLEKeyframeDynamicCast = NLEKeyframe.dynamicCast(it3.next().deepClone());
                    if (nLETrackSlot != null) {
                        nLETrackSlot.addSwingKeyframe(nLEKeyframeDynamicCast);
                    }
                }
            }
        }
    }

    public static NLETrackSlot LIZJ(NLEModel nLEModel, NLETrackSlot nLETrackSlot) {
        for (NLETrackSlot nLETrackSlot2 : nLEModel.getMainTrack().getSortedSlots()) {
            if (nLETrackSlot2.getStartTime() == nLETrackSlot.getStartTime()) {
                return nLETrackSlot2;
            }
        }
        return null;
    }

    public static NLETrackSlot LIZLLL(NLEModel nLEModel, NLETrackSlot nLETrackSlot) {
        VecNLETrackSlotSPtr sortedSlots;
        NLETrack nLETrackLIZ = C346780Die.LIZ(nLEModel);
        if (nLETrackLIZ != null && (sortedSlots = nLETrackLIZ.getSortedSlots()) != null) {
            for (NLETrackSlot nLETrackSlot2 : sortedSlots) {
                if (nLETrackSlot2.getStartTime() == nLETrackSlot.getStartTime()) {
                    return nLETrackSlot2;
                }
            }
            return null;
        }
        return null;
    }

    public static void LIZ(NLEModel nLEModel, NLETrackSlot nLETrackSlot, boolean z) {
        NLETrackSlot nLETrackSlot2;
        NLETrack next;
        float fLJLLLL;
        NLESegmentVideo nLESegmentVideoDynamicCast;
        NLETrackSlot nLETrackSlotLIZLLL;
        String extra = nLETrackSlot.getExtra("extra_associated_vc_slot_id");
        if (extra.length() == 0) {
            return;
        }
        Iterator<NLETrack> it2 = nLEModel.getTracks().iterator();
        while (true) {
            nLETrackSlot2 = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getExtra("AudioTrackType"), "ORIGIN_VOICE_CONVERSION")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack = next;
        if (nLETrack == null) {
            return;
        }
        Iterator<NLETrackSlot> it3 = nLETrack.getSlots().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            NLETrackSlot next2 = it3.next();
            if (Intrinsics.LJFF(next2.getUUID(), extra)) {
                nLETrackSlot2 = next2;
                break;
            }
        }
        NLETrackSlot nLETrackSlot3 = nLETrackSlot2;
        if (nLETrackSlot3 == null) {
            return;
        }
        nLETrackSlot.removeExtraWithKey("extra_associated_vc_slot_id");
        nLETrackSlot.removeExtraWithKey("extra_voice_change_effect_name");
        nLETrackSlot.removeExtraWithKey("extra_voice_chang_effect_id");
        nLETrackSlot.removeExtraWithKey("extra_voice_chang_effect_anchor_name");
        nLETrackSlot.removeExtraWithKey("extra_voice_chang_effect_icon_url");
        nLETrackSlot.removeExtraWithKey("extra_voice_chang_effect_resource_id");
        nLETrackSlot.removeExtraWithKey("extra_voice_change_creator_id");
        nLETrackSlot.removeExtraWithKey("extra_voice_change_creator_username");
        nLETrackSlot.removeExtraWithKey("extra_voice_change_from");
        nLETrackSlot.removeExtraWithKey("is_aigc_content");
        nLETrack.removeSlot(nLETrackSlot3);
        if (nLETrack.getSlots().isEmpty()) {
            nLEModel.removeTrack(nLETrack);
        }
        if (z) {
            NLESegmentVideo nLESegmentVideoDynamicCast2 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
            if (nLESegmentVideoDynamicCast2 != null) {
                nLESegmentVideoDynamicCast2.setEnableAudio(true);
            }
        } else {
            NLESegment mainSegment = nLETrackSlot3.getMainSegment();
            if (mainSegment != null) {
                fLJLLLL = C351220Dpo.LJLLLL(mainSegment);
            } else {
                fLJLLLL = 0.0f;
            }
            NLESegment mainSegment2 = nLETrackSlot.getMainSegment();
            if (mainSegment2 != null) {
                C351220Dpo.LLLLLL(mainSegment2, fLJLLLL);
            }
        }
        if (((!nLETrackSlot.getKeyframes().isEmpty()) || C351220Dpo.LLIIIJ(nLETrackSlot)) && (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) != null) {
            nLESegmentVideoDynamicCast.setEnableAudio(true);
        }
        if (C351220Dpo.LLIFFJFJJ(nLETrackSlot) && (nLETrackSlotLIZLLL = LIZLLL(nLEModel, nLETrackSlot)) != null) {
            NLESegment mainSegment3 = nLETrackSlotLIZLLL.getMainSegment();
            if (mainSegment3 != null) {
                C351220Dpo.LLLLLL(mainSegment3, C351220Dpo.LJLLLL(nLETrackSlot.getMainSegment()));
            }
            LIZIZ(nLETrackSlotLIZLLL, nLETrackSlot);
        }
    }
}
