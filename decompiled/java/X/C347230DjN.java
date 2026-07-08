package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DjN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347230DjN {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    public static final void LIZ(NLEModel nLEModel) {
        NLETrack next;
        ?? arrayList;
        NLETrack next2;
        List sortedSlots;
        VecNLETrackSlotSPtr sortedSlots2;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot next3;
        NLESegmentAudio nLESegmentAudio;
        Iterator<NLETrack> it2 = nLEModel.getTracks().iterator();
        while (true) {
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
        if (nLETrack != null) {
            if (!nLETrack.getSlots().isEmpty()) {
                NLETrack mainTrack = nLEModel.getMainTrack();
                if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
                    for (NLETrackSlot nLETrackSlot : slots) {
                        if (nLETrackSlot.hasExtra("extra_associated_vc_slot_id") && nLETrackSlot.hasExtra("extra_associated_vc_slot_id")) {
                            String extra = nLETrackSlot.getExtra("extra_associated_vc_slot_id");
                            Iterator<NLETrackSlot> it3 = nLETrack.getSlots().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    next3 = it3.next();
                                    if (Intrinsics.LJFF(next3.getUUID(), extra)) {
                                        break;
                                    }
                                } else {
                                    next3 = null;
                                    break;
                                }
                            }
                            NLETrackSlot nLETrackSlot2 = next3;
                            if (nLETrackSlot2 != null && (nLESegmentAudio = (NLESegmentAudio) NLESegmentAudio.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot2.getMainSegment())) != null) {
                                float volume = nLESegmentAudio.getVolume();
                                NLESegmentAudio nLESegmentAudio2 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot.getMainSegment());
                                if (nLESegmentAudio2 != null) {
                                    nLESegmentAudio2.setVolume(volume);
                                }
                            }
                        }
                    }
                }
                NLETrack mainTrack2 = nLEModel.getMainTrack();
                if (mainTrack2 != null && (sortedSlots2 = mainTrack2.getSortedSlots()) != null) {
                    arrayList = new ArrayList();
                    for (NLETrackSlot nLETrackSlot3 : sortedSlots2) {
                        String extra2 = nLETrackSlot3.getExtra("has_origin_audio_slot");
                        if (extra2 != null && Boolean.parseBoolean(extra2)) {
                            arrayList.add(nLETrackSlot3);
                        }
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                Iterator<NLETrack> it4 = nLEModel.getTracks().iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next2 = it4.next();
                        if (Intrinsics.LJFF(next2.getExtra("AudioTrackType"), "ORIGIN")) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                NLETrack nLETrack2 = next2;
                if (nLETrack2 == null || (sortedSlots = nLETrack2.getSortedSlots()) == null) {
                    sortedSlots = C13BV.INSTANCE;
                }
                if (arrayList.size() == sortedSlots.size()) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        if (((NLENode) ListProtector.get(arrayList, i)).hasExtra("extra_associated_vc_slot_id")) {
                            NLESegmentAudio nLESegmentAudio3 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("dynamicCast", NLENode.class).invoke(null, ((NLETrackSlot) ListProtector.get(arrayList, i)).getMainSegment());
                            if (nLESegmentAudio3 != null) {
                                float volume2 = nLESegmentAudio3.getVolume();
                                NLESegmentAudio nLESegmentAudio4 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("dynamicCast", NLENode.class).invoke(null, ((NLETrackSlot) ListProtector.get(sortedSlots, i)).getMainSegment());
                                if (nLESegmentAudio4 != null) {
                                    nLESegmentAudio4.setVolume(volume2);
                                }
                            }
                        }
                    }
                }
            }
            nLEModel.removeTrack(nLETrack);
        }
    }
}
