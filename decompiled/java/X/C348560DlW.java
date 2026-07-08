package X;

import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DlW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348560DlW {
    public static final NLETrackType LIZ(NLETrack nLETrack) {
        if (nLETrack == null) {
            return NLETrackType.NONE;
        }
        NLETrackType trackType = nLETrack.getTrackType();
        NLETrackType extraTrackType = nLETrack.getExtraTrackType();
        NLETrackType nLETrackType = NLETrackType.NONE;
        if (trackType != nLETrackType && trackType != NLETrackType.FILTER) {
            return trackType;
        }
        if (extraTrackType != nLETrackType) {
            return extraTrackType;
        }
        return nLETrackType;
    }

    public static final boolean LIZIZ(NLETrack nLETrack) {
        if (nLETrack == null || LIZ(nLETrack) != NLETrackType.EFFECT || !Intrinsics.LJFF(nLETrack.getExtra("EffectTrackType"), "VIDEO_ANIM")) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(NLETrack nLETrack) {
        if (nLETrack == null || !nLETrack.getEnable() || LIZ(nLETrack) != NLETrackType.EFFECT || !Intrinsics.LJFF(nLETrack.getExtra("EffectTrackType"), "NORMAL")) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(NLETrack nLETrack) {
        if (nLETrack != null && nLETrack.getEnable() && LIZ(nLETrack) == NLETrackType.STICKER) {
            if (!Intrinsics.LJFF(nLETrack.getExtra("StickerTrackType"), "TEXT")) {
                VecNLETrackSlotSPtr slots = nLETrack.getSlots();
                if (!(slots instanceof Collection) || !slots.isEmpty()) {
                    Iterator<NLETrackSlot> it2 = slots.iterator();
                    while (it2.hasNext()) {
                        if (NLESegmentTextSticker.dynamicCast((NLENode) it2.next().getMainSegment()) != null) {
                            return true;
                        }
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static final NLETrackType LJ(NLETrack nLETrack) {
        if (nLETrack == null) {
            return NLETrackType.NONE;
        }
        NLETrackType trackType = nLETrack.getTrackType();
        NLETrackType extraTrackType = nLETrack.getExtraTrackType();
        NLETrackType nLETrackType = NLETrackType.NONE;
        if (trackType != nLETrackType && trackType != NLETrackType.FILTER) {
            return trackType;
        }
        if (extraTrackType != nLETrackType) {
            return extraTrackType;
        }
        return nLETrackType;
    }

    public static final boolean LJFF(NLETrackSlot nLETrackSlot) {
        String extra;
        if (nLETrackSlot == null || !nLETrackSlot.getEnable() || (extra = nLETrackSlot.getExtra("slot_extra_is_favorite_resource")) == null || !Boolean.parseBoolean(extra)) {
            return false;
        }
        return true;
    }
}
