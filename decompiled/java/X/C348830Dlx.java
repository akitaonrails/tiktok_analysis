package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dlx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348830Dlx {
    public static List LIZIZ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (nLETrack2.getMainTrack() || Intrinsics.LJFF(nLETrack2.getExtra("AudioTrackType"), "ORIGIN") || Intrinsics.LJFF(nLETrack2.getExtra("AudioTrackType"), "REVERSE_AUDIO")) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (NLESegmentAudio.dynamicCast(((NLETrackSlot) obj).getMainSegment()) != null) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }

    public static List LIZJ(NLEModel nLEModel) {
        List<NLETrack> listLJJLIIIJLJLI = C351220Dpo.LJJLIIIJLJLI(nLEModel);
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it2 = listLJJLIIIJLJLI.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().getSlots(), arrayList);
        }
        return arrayList;
    }

    public static void LIZLLL(NLEModel nLEModel) {
        VecNLETrackSlotSPtr slots;
        NLETrackSlot next;
        NLESegment mainSegment;
        C013C c013c = new C013C();
        boolean z = true;
        c013c.element = true;
        VecNLETrackSlotSPtr slots2 = nLEModel.getMainTrack().getSlots();
        ArrayList arrayList = new ArrayList();
        for (NLETrackSlot nLETrackSlot : slots2) {
            if (C351220Dpo.LLI(nLETrackSlot)) {
                arrayList.add(nLETrackSlot);
            }
        }
        boolean z2 = !arrayList.isEmpty();
        c013c.element = z2;
        if (z2) {
            NLETrack nLETrackLIZ = C346960Diw.LIZ(nLEModel);
            if (nLETrackLIZ != null) {
                for (NLETrackSlot nLETrackSlot2 : nLEModel.getMainTrack().getSlots()) {
                    if (nLETrackSlot2.hasExtra("extra_associated_vc_slot_id")) {
                        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot2.getMainSegment());
                        if (nLESegmentVideoDynamicCast != null) {
                            nLESegmentVideoDynamicCast.setEnableAudio(false);
                        }
                        String extra = nLETrackSlot2.getExtra("extra_associated_vc_slot_id");
                        Iterator<NLETrackSlot> it2 = nLETrackLIZ.getSlots().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (Intrinsics.LJFF(next.getUUID(), extra)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        NLETrackSlot nLETrackSlot3 = next;
                        if (nLETrackSlot3 != null && (mainSegment = nLETrackSlot3.getMainSegment()) != null) {
                            C351220Dpo.LLLLLL(nLETrackSlot2.getMainSegment(), C351220Dpo.LJLLLL(mainSegment));
                        }
                    }
                }
            }
            NLETrack mainTrack = nLEModel.getMainTrack();
            if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
                for (NLETrackSlot nLETrackSlot4 : slots) {
                    if (C351220Dpo.LLI(nLETrackSlot4) && !C351220Dpo.LLLFZ(nLETrackSlot4)) {
                        z = false;
                        break;
                    }
                }
            }
        } else {
            z = false;
            break;
        }
        nLEModel.getMainTrack().setExtra("is_maintrack_mute", String.valueOf(z));
        nLEModel.getMainTrack().setExtra("is_maintrack_mute_enable", String.valueOf(c013c.element));
    }

    public static Pair LJ(NLETrack nLETrack, List list, List list2) {
        boolean z;
        boolean z2;
        float volume;
        String extra = null;
        if (list == null && (nLETrack == null || (list = nLETrack.getSlots()) == null)) {
            list = C13BV.INSTANCE;
        }
        Iterator it2 = list2.iterator();
        while (true) {
            z = false;
            if (it2.hasNext()) {
                NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(((NLETrackSlot) it2.next()).getMainSegment());
                if (nLESegmentAudioDynamicCast != null && nLESegmentAudioDynamicCast.getVolume() != 0.0f) {
                    z2 = false;
                    break;
                }
            } else {
                z2 = true;
                break;
            }
        }
        if (nLETrack != null) {
            extra = nLETrack.getExtra("is_maintrack_mute");
        }
        boolean z3 = Boolean.parseBoolean(extra);
        if (z2 && z3) {
            z = true;
        }
        float volume2 = 0.0f;
        for (NLETrackSlot nLETrackSlot : list) {
            NLESegmentAudio nLESegmentAudioDynamicCast2 = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
            if (nLESegmentAudioDynamicCast2 != null) {
                if (z) {
                    Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ(nLETrackSlot.getExtra("slot_mute_volume"));
                    if (fLJIIIIZZ != null) {
                        volume = fLJIIIIZZ.floatValue();
                    } else {
                        volume = 0.0f;
                    }
                } else {
                    volume = nLESegmentAudioDynamicCast2.getVolume();
                }
                if (volume > volume2) {
                    volume2 = volume;
                }
            }
        }
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            NLESegmentAudio nLESegmentAudioDynamicCast3 = NLESegmentAudio.dynamicCast(((NLETrackSlot) it3.next()).getMainSegment());
            if (nLESegmentAudioDynamicCast3 != null && nLESegmentAudioDynamicCast3.getVolume() > volume2) {
                volume2 = nLESegmentAudioDynamicCast3.getVolume();
            }
        }
        return new Pair(Float.valueOf(volume2), Boolean.valueOf(z));
    }

    public static void LIZ(NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel, InterfaceC347150DjF interfaceC347150DjF, InterfaceC347150DjF interfaceC347150DjF2) {
        List<NLETrackSlot> listLIZIZ;
        List<NLETrackSlot> listLIZJ;
        float f;
        if (videoPublishEditModel == null) {
            return;
        }
        if (interfaceC347150DjF == null || (listLIZIZ = interfaceC347150DjF.LIZ()) == null) {
            listLIZIZ = LIZIZ(nLEModel);
        }
        if (interfaceC347150DjF2 == null || (listLIZJ = interfaceC347150DjF2.LIZ()) == null) {
            listLIZJ = LIZJ(nLEModel);
        }
        Pair pairLJ = LJ(nLEModel.getMainTrack(), listLIZIZ, listLIZJ);
        float fFloatValue = ((Number) pairLJ.getFirst()).floatValue();
        boolean zBooleanValue = ((Boolean) pairLJ.getSecond()).booleanValue();
        if (zBooleanValue) {
            f = 0.0f;
        } else {
            f = fFloatValue;
        }
        videoPublishEditModel.setVoiceVolume(f);
        videoPublishEditModel.getEditorProModel().setModelMute(zBooleanValue);
        LJFF(nLEModel, listLIZIZ, listLIZJ, fFloatValue, zBooleanValue);
    }

    public static void LJFF(NLEModel nLEModel, List list, List list2, float f, boolean z) {
        NLESegmentVideo nLESegmentVideoDynamicCast;
        float f2;
        float volume;
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null) {
            mainTrack.setExtra("slot_mute_volume", String.valueOf(f));
        }
        Iterator it2 = list.iterator();
        while (true) {
            float f3 = 1.0f;
            if (!it2.hasNext()) {
                break;
            }
            NLETrackSlot nLETrackSlot = (NLETrackSlot) it2.next();
            NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
            if (nLESegmentAudioDynamicCast != null) {
                if (z) {
                    Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ(nLETrackSlot.getExtra("slot_mute_volume"));
                    if (fLJIIIIZZ != null) {
                        volume = fLJIIIIZZ.floatValue();
                    } else {
                        volume = 0.0f;
                    }
                } else {
                    volume = nLESegmentAudioDynamicCast.getVolume();
                }
                if (f != 0.0f) {
                    f3 = volume / f;
                }
                nLETrackSlot.setExtra("multi_original_voice_rate", String.valueOf(f3));
            }
        }
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            NLETrackSlot nLETrackSlot2 = (NLETrackSlot) it3.next();
            NLESegmentAudio nLESegmentAudioDynamicCast2 = NLESegmentAudio.dynamicCast(nLETrackSlot2.getMainSegment());
            if (nLESegmentAudioDynamicCast2 != null) {
                float volume2 = nLESegmentAudioDynamicCast2.getVolume();
                if (f == 0.0f) {
                    f2 = 1.0f;
                } else {
                    f2 = volume2 / f;
                }
                nLETrackSlot2.setExtra("multi_original_voice_rate", String.valueOf(f2));
            }
        }
        if (C346960Diw.LIZ(nLEModel) != null) {
            for (NLETrackSlot nLETrackSlot3 : nLEModel.getMainTrack().getSlots()) {
                if (nLETrackSlot3.hasExtra("extra_associated_vc_slot_id")) {
                    if ((nLETrackSlot3.getKeyframes().isEmpty() || !C351220Dpo.LLIIIJ(nLETrackSlot3)) && (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot3.getMainSegment())) != null) {
                        nLESegmentVideoDynamicCast.setEnableAudio(true);
                    }
                    NLESegment mainSegment = nLETrackSlot3.getMainSegment();
                    if (mainSegment != null) {
                        C351220Dpo.LLLLLL(mainSegment, 0.0f);
                    }
                }
            }
        }
    }
}
