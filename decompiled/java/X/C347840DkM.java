package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackType;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DkM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347840DkM {
    public static final /* synthetic */ int LIZ = 0;

    public static final long LIZIZ(NLEModel nLEModel) {
        return nLEModel.getMaxTargetEnd(new VecNLETrackType(new NLETrackType[]{NLETrackType.AUDIO, NLETrackType.STICKER, NLETrackType.FILTER})) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public static void LIZJ(NLEModel nLEModel) {
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        if (nLEModel != null && (mainTrack = nLEModel.getMainTrack()) != null && (slots = mainTrack.getSlots()) != null) {
            Iterator<NLETrackSlot> it2 = slots.iterator();
            while (it2.hasNext()) {
                NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) it2.next().getMainSegment());
                if (nLESegmentVideoDynamicCast != null) {
                    nLESegmentVideoDynamicCast.setVolume(0.0f);
                }
            }
        }
    }

    public static final Effect LIZ(NLETrack nLETrack, C389400FOo c389400FOo) {
        boolean z;
        NLETrackSlot nLETrackSlot;
        NLESegment mainSegment;
        NLEResourceNode resource;
        String first;
        if (nLETrack.getTrackType() == NLETrackType.FILTER && !Intrinsics.LJFF(nLETrack.getExtra("biz_extra_type"), "normal_effect")) {
            z = true;
        } else {
            z = false;
        }
        String second = null;
        if (!z || (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, nLETrack.getSlots())) == null || (mainSegment = nLETrackSlot.getMainSegment()) == null || (resource = mainSegment.getResource()) == null) {
            return null;
        }
        Pair<String, String> pairLIZJ = C0FGD.LIZJ(resource.getResourceId());
        if (pairLIZJ != null) {
            first = pairLIZJ.getFirst();
            second = pairLIZJ.getSecond();
        } else {
            first = null;
        }
        return c389400FOo.LIZIZ(first, second);
    }
}
