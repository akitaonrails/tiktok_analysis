package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.VoiceConversionModel;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EXR, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EXR {
    public static final C0EXR LIZ = new C0EXR();

    public static void LIZIZ(VoiceConversionModel voiceConversionModel, NLEModel nLEModel, boolean z) {
        NLETrack next;
        List slots;
        NLETrack next2;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots2;
        NLETrackSlot next3;
        NLESegment mainSegment;
        NLEResourceNode resource;
        String resourceFile;
        NLEResourceNode resource2;
        String resourceFile2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z) {
            VecNLETrackSPtr tracks = nLEModel.getTracks();
            ArrayList arrayList3 = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                if (C351220Dpo.LLILL(nLETrack)) {
                    arrayList3.add(nLETrack);
                }
            }
            slots = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), slots);
            }
        } else {
            Iterator<NLETrack> it3 = nLEModel.getTracks().iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    if (Intrinsics.LJFF(next.getExtra("AudioTrackType"), "AUDIO_RECORD")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NLETrack nLETrack2 = next;
            if (nLETrack2 == null || (slots = nLETrack2.getSlots()) == null) {
                slots = C13BV.INSTANCE;
            }
        }
        Iterator it4 = slots.iterator();
        while (true) {
            String str = "";
            if (!it4.hasNext()) {
                break;
            }
            NLETrackSlot nLETrackSlot = (NLETrackSlot) it4.next();
            if (nLETrackSlot.hasExtra("extra_origin_voice_file_path")) {
                NLESegment mainSegment2 = nLETrackSlot.getMainSegment();
                if (mainSegment2 != null && (resource2 = mainSegment2.getResource()) != null && (resourceFile2 = resource2.getResourceFile()) != null) {
                    arrayList.add(resourceFile2);
                }
            }
            if (nLETrackSlot.hasExtra("extra_voice_chang_effect_id")) {
                String extra = nLETrackSlot.getExtra("extra_voice_chang_effect_id");
                if (extra != null) {
                    str = extra;
                }
                if (str.length() > 0) {
                    linkedHashSet.add(str);
                }
            }
        }
        Iterator<NLETrack> it5 = nLEModel.getTracks().iterator();
        while (true) {
            if (it5.hasNext()) {
                next2 = it5.next();
                if (Intrinsics.LJFF(next2.getExtra("AudioTrackType"), "ORIGIN_VOICE_CONVERSION")) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        NLETrack nLETrack3 = next2;
        if (nLETrack3 != null && (mainTrack = nLEModel.getMainTrack()) != null && (slots2 = mainTrack.getSlots()) != null) {
            for (NLETrackSlot nLETrackSlot2 : slots2) {
                if (nLETrackSlot2.hasExtra("extra_associated_vc_slot_id")) {
                    String extra2 = nLETrackSlot2.getExtra("extra_associated_vc_slot_id");
                    Iterator<NLETrackSlot> it6 = nLETrack3.getSlots().iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            next3 = it6.next();
                            if (Intrinsics.LJFF(next3.getUUID(), extra2)) {
                                break;
                            }
                        } else {
                            next3 = null;
                            break;
                        }
                    }
                    NLETrackSlot nLETrackSlot3 = next3;
                    if (nLETrackSlot3 != null && (mainSegment = nLETrackSlot3.getMainSegment()) != null && (resource = mainSegment.getResource()) != null && (resourceFile = resource.getResourceFile()) != null) {
                        arrayList2.add(resourceFile);
                    }
                }
                if (nLETrackSlot2.hasExtra("extra_voice_chang_effect_id")) {
                    String extra3 = nLETrackSlot2.getExtra("extra_voice_chang_effect_id");
                    if (extra3 == null) {
                        extra3 = "";
                    }
                    if (extra3.length() > 0) {
                        linkedHashSet.add(extra3);
                    }
                }
            }
        }
        voiceConversionModel.voiceModifyIds = linkedHashSet;
        voiceConversionModel.vcMultiRecordPathList = arrayList;
        voiceConversionModel.vcMultiOriginPathList = arrayList2;
        voiceConversionModel.hasDubVoiceConversion = !arrayList.isEmpty();
        voiceConversionModel.hasOriginVoiceConversion = !arrayList2.isEmpty();
    }

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, VideoPublishEditModel videoPublishEditModel2, NLEModel nLEModel, boolean z) {
        String str;
        boolean z2;
        List<AVChallenge> arrayList;
        List<AVChallenge> arrayList2;
        if (z) {
            str = "AUDIO_RECORD";
        } else {
            str = "DUB";
        }
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList3 = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (true) {
            z2 = false;
            if (!it2.hasNext()) {
                break;
            }
            NLETrack next = it2.next();
            NLETrack nLETrack = next;
            if (nLETrack.getMainTrack() || Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), str)) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it3.next()).getSlots(), arrayList4);
        }
        Iterator it4 = arrayList4.iterator();
        AudioEffectParam audioEffectParam = null;
        String str2 = null;
        boolean z3 = true;
        while (true) {
            if (it4.hasNext()) {
                NLENode nLENode = (NLENode) it4.next();
                if (nLENode.hasExtra("extra_voice_chang_effect_id")) {
                    z3 = false;
                }
                String extra = nLENode.getExtra("extra_voice_chang_effect_id");
                if (str2 == null) {
                    str2 = extra;
                }
                if (!Intrinsics.LJFF(extra, str2)) {
                    break;
                } else {
                    str2 = extra;
                }
            } else {
                z2 = true;
                break;
            }
        }
        if (!z3) {
            if (z2) {
                audioEffectParam = new AudioEffectParam("", 0, 0, "", "", 0, 0, null, null, new ArrayList());
                if (str2 == null) {
                    str2 = "";
                }
                audioEffectParam.setUploadId(str2);
                AudioEffectParam veAudioEffectParam = videoPublishEditModel2.getVeAudioEffectParam();
                if (veAudioEffectParam == null || (arrayList2 = veAudioEffectParam.getChallenges()) == null) {
                    arrayList2 = new ArrayList<>();
                }
                audioEffectParam.setChallenges(arrayList2);
            } else {
                audioEffectParam = new AudioEffectParam("", 0, 0, "", "", 0, 0, null, null, new ArrayList());
                AudioEffectParam veAudioEffectParam2 = videoPublishEditModel2.getVeAudioEffectParam();
                if (veAudioEffectParam2 == null || (arrayList = veAudioEffectParam2.getChallenges()) == null) {
                    arrayList = new ArrayList<>();
                }
                audioEffectParam.setChallenges(arrayList);
            }
        }
        videoPublishEditModel.setVeAudioEffectParam(audioEffectParam);
    }
}
