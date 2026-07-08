package X;

import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E5J, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E5J {
    public static final boolean LIZ(NLETrackSlot nLETrackSlot) {
        String extra;
        NLEResourceNode resource;
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        if (mainSegment != null && (resource = mainSegment.getResource()) != null) {
            extra = resource.getExtra("ep_ai_generated");
        } else {
            extra = null;
        }
        return Intrinsics.LJFF(extra, "1");
    }

    public static final boolean LIZIZ(NLETrackSlot nLETrackSlot) {
        String extra;
        NLEResourceNode resource;
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        if (mainSegment != null && (resource = mainSegment.getResource()) != null) {
            extra = resource.getExtra("ep_ai_generated");
        } else {
            extra = null;
        }
        if (Intrinsics.LJFF(extra, "1") && nLETrackSlot.hasExtra("freeze_from_uuid") && !nLETrackSlot.hasExtra("ep_aigc_id")) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(NLETrackSlot nLETrackSlot) {
        NLEResourceNode resource;
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        if (mainSegment == null || (resource = mainSegment.getResource()) == null || !resource.hasExtra("ep_ai_generating")) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(NLETrackSlot nLETrackSlot) {
        NLEResourceNode resource;
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        if (mainSegment == null || (resource = mainSegment.getResource()) == null || !resource.hasExtra("ep_ai_generated_fail")) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(NLETrackSlot nLETrackSlot) {
        if (!LIZJ(nLETrackSlot) && !LIZLLL(nLETrackSlot)) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot == null || !LIZ(nLETrackSlot) || !nLETrackSlot.hasExtra("ai_playground_generated")) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot.hasExtra("is_video_apply_photo_magic") && Intrinsics.LJFF(C351220Dpo.LJJII(nLETrackSlot, "is_video_apply_photo_magic", Boolean.FALSE), Boolean.TRUE)) {
            return true;
        }
        return false;
    }
}
