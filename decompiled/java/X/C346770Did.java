package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Did, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C346770Did {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(NLEModel nLEModel) {
        if (nLEModel == null) {
            return;
        }
        for (NLETrack nLETrack : nLEModel.getTracks()) {
            if (nLETrack != null) {
                VecNLETrackSlotSPtr keyframeSlots = nLETrack.getKeyframeSlots();
                for (NLETrackSlot nLETrackSlot : nLETrack.getSlots()) {
                    NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
                    if (nLESegmentAudioDynamicCast != null) {
                        ArrayList arrayList = new ArrayList();
                        if (keyframeSlots != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (NLETrackSlot nLETrackSlot2 : keyframeSlots) {
                                if (nLETrackSlot.getKeyframesUUIDList().contains(nLETrackSlot2.getUUID())) {
                                    arrayList2.add(nLETrackSlot2);
                                }
                            }
                            arrayList.addAll(arrayList2);
                        }
                        VecNLETrackSlotSPtr keyframes = nLETrackSlot.getKeyframes();
                        if (keyframes != null) {
                            arrayList.addAll(keyframes);
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            NLESegmentAudio nLESegmentAudioDynamicCast2 = NLESegmentAudio.dynamicCast(((NLETrackSlot) it2.next()).getMainSegment());
                            if (nLESegmentAudioDynamicCast2 != null) {
                                nLESegmentAudioDynamicCast2.setVolume(nLESegmentAudioDynamicCast.getVolume());
                            }
                        }
                    }
                }
            }
        }
    }

    public static void LIZIZ(NLEModel nLEModel, boolean z) {
        VecNLETrackSPtr tracks;
        NLESegmentAudio nLESegmentAudioDynamicCast;
        if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
            ArrayList<NLETrack> arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                if (nLETrack.getTrackType() == NLETrackType.AUDIO) {
                    arrayList.add(nLETrack);
                }
            }
            for (NLETrack nLETrack2 : arrayList) {
                if (nLETrack2.getKeyframeSlots().size() > 0) {
                    nLETrack2.clearKeyframeSlot();
                    for (NLETrackSlot nLETrackSlot : nLETrack2.getSlots()) {
                        if (!z && (nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment())) != null) {
                            nLESegmentAudioDynamicCast.setVolume(1.0f);
                        }
                    }
                }
            }
        }
    }

    public static void LIZJ(float f, NLEModel nLEModel, boolean z) {
        for (NLETrack nLETrack : nLEModel.getTracks()) {
            if (Intrinsics.LJFF(C348350DlB.LIZLLL(nLETrack), "cutsame")) {
                for (NLETrackSlot nLETrackSlot : nLETrack.getSlots()) {
                    NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
                    if (nLESegmentAudioDynamicCast != null) {
                        nLESegmentAudioDynamicCast.setVolume(f);
                    }
                    NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                    if (nLESegmentVideoDynamicCast != null && Intrinsics.LJFF(nLESegmentVideoDynamicCast.getExtra("is_mutable"), "true")) {
                        nLESegmentVideoDynamicCast.setVolume(0.0f);
                        if (!z) {
                            nLETrackSlot.setExtra("AudioTrackType", "CUTSAME_USER");
                        }
                    }
                }
            }
        }
        if (z) {
            LIZ(nLEModel);
        }
    }
}
