package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DmM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349080DmM {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(NLEModel nLEModel) {
        VecNLETrackSlotSPtr slots;
        if (nLEModel == null) {
            return;
        }
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
            Iterator<NLETrackSlot> it2 = slots.iterator();
            while (it2.hasNext()) {
                C349070DmL.LIZ(nLEModel, it2.next(), true);
            }
        }
        Iterator it3 = ((ArrayList) LJI(nLEModel)).iterator();
        while (it3.hasNext()) {
            LJ((NLETrackSlot) it3.next());
        }
        LJIIIIZZ(nLEModel);
    }

    public static void LIZLLL(NLEModel nLEModel) {
        VecNLETrackSlotSPtr slots;
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
            Iterator<NLETrackSlot> it2 = slots.iterator();
            while (it2.hasNext()) {
                C349070DmL.LIZ(nLEModel, it2.next(), false);
            }
        }
        Iterator it3 = ((ArrayList) LJFF(nLEModel)).iterator();
        while (it3.hasNext()) {
            LJ((NLETrackSlot) it3.next());
        }
        Iterator it4 = ((ArrayList) LJI(nLEModel)).iterator();
        while (it4.hasNext()) {
            LJ((NLETrackSlot) it4.next());
        }
        LJIIIIZZ(nLEModel);
    }

    public static void LJ(NLETrackSlot nLETrackSlot) {
        NLEResourceNode resource;
        if (nLETrackSlot.hasExtra("extra_origin_voice_file_path")) {
            String extra = nLETrackSlot.getExtra("extra_origin_voice_file_path");
            NLESegment mainSegment = nLETrackSlot.getMainSegment();
            if (mainSegment != null && (resource = mainSegment.getResource()) != null) {
                resource.setResourceFile(extra);
            }
            nLETrackSlot.removeExtraWithKey("extra_origin_voice_file_path");
            nLETrackSlot.removeExtraWithKey("extra_voice_change_effect_name");
            nLETrackSlot.removeExtraWithKey("extra_voice_chang_effect_id");
            nLETrackSlot.removeExtraWithKey("extra_voice_chang_effect_anchor_name");
            nLETrackSlot.removeExtraWithKey("extra_voice_chang_effect_icon_url");
            nLETrackSlot.removeExtraWithKey("extra_voice_chang_effect_resource_id");
            nLETrackSlot.removeExtraWithKey("extra_voice_change_creator_id");
            nLETrackSlot.removeExtraWithKey("extra_voice_change_creator_username");
            nLETrackSlot.removeExtraWithKey("extra_voice_change_from");
            nLETrackSlot.removeExtraWithKey("is_aigc_content");
        }
        if (nLETrackSlot.hasExtra("volume_before_enhance") && nLETrackSlot.hasExtra("volume_enhance_rate")) {
            float fLIZ = C0CH4.LIZ();
            nLETrackSlot.setExtra("volume_enhance_rate", String.valueOf(fLIZ));
            Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ(nLETrackSlot.getExtra("volume_before_enhance"));
            if (fLJIIIIZZ != null) {
                float fFloatValue = fLJIIIIZZ.floatValue();
                NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
                if (nLESegmentAudioDynamicCast != null) {
                    nLESegmentAudioDynamicCast.setVolume(fFloatValue * fLIZ);
                }
            }
        }
    }

    public static List LJFF(NLEModel nLEModel) {
        VecNLETrackSPtr sortedTracks = nLEModel.getSortedTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : sortedTracks) {
            if (Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "DUB")) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSortedSlots(), arrayList2);
        }
        return arrayList2;
    }

    public static List LJI(NLEModel nLEModel) {
        VecNLETrackSPtr sortedTracks = nLEModel.getSortedTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : sortedTracks) {
            if (C351220Dpo.LLILL(nLETrack)) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSortedSlots(), arrayList2);
        }
        return arrayList2;
    }

    public static List LJII(NLEModel nLEModel) {
        VecNLETrackSlotSPtr slots;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) LJFF(nLEModel)).iterator();
        while (true) {
            String str = "";
            if (!it2.hasNext()) {
                break;
            }
            String extra = ((NLENode) it2.next()).getExtra("extra_voice_chang_effect_id");
            if (extra != null) {
                str = extra;
            }
            if (str.length() > 0 && !arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        Iterator it3 = ((ArrayList) LJI(nLEModel)).iterator();
        while (it3.hasNext()) {
            String extra2 = ((NLENode) it3.next()).getExtra("extra_voice_chang_effect_id");
            if (extra2 == null) {
                extra2 = "";
            }
            if (extra2.length() > 0 && !arrayList.contains(extra2)) {
                arrayList.add(extra2);
            }
        }
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
            Iterator<NLETrackSlot> it4 = slots.iterator();
            while (it4.hasNext()) {
                String extra3 = it4.next().getExtra("extra_voice_chang_effect_id");
                if (extra3 == null) {
                    extra3 = "";
                }
                if (extra3.length() > 0 && !arrayList.contains(extra3)) {
                    arrayList.add(extra3);
                }
            }
        }
        return arrayList;
    }

    public static void LJIIIIZZ(NLEModel nLEModel) {
        NLETrack nLETrack;
        NLETrack next;
        if (C348520DlS.LJI(nLEModel)) {
            NLETrack mainTrack = nLEModel.getMainTrack();
            Iterator<NLETrack> it2 = nLEModel.getTracks().iterator();
            while (true) {
                nLETrack = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    NLETrack nLETrack2 = next;
                    if (Intrinsics.LJFF(C348350DlB.LJIIIIZZ(nLETrack2), "VIDEO") && nLETrack2.hasMainTrack()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            LJIIIZ(mainTrack, next);
            NLETrack nLETrackLIZ = C346780Die.LIZ(nLEModel);
            Iterator<NLETrack> it3 = nLEModel.getTracks().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                NLETrack next2 = it3.next();
                NLETrack nLETrack3 = next2;
                if (Intrinsics.LJFF(C348350DlB.LJIIIIZZ(nLETrack3), "AUDIO") && Intrinsics.LJFF(nLETrack3.getExtra("AudioTrackType"), "REVERSE_AUDIO")) {
                    nLETrack = next2;
                    break;
                }
            }
            LJIIIZ(nLETrackLIZ, nLETrack);
        }
    }

    public static void LIZ(C19536311c1 c19536311c1, EnumC356240Dxu enumC356240Dxu) {
        NLEResourceNode resource;
        NLEResourceNode resource2;
        String resourceFile;
        NLETrackSlot nLETrackSlot = c19536311c1.LIZ;
        if (nLETrackSlot == null) {
            return;
        }
        if (!nLETrackSlot.hasExtra("extra_origin_voice_file_path")) {
            NLESegment mainSegment = c19536311c1.LIZ.getMainSegment();
            if (mainSegment != null && (resource2 = mainSegment.getResource()) != null && (resourceFile = resource2.getResourceFile()) != null) {
                nLETrackSlot.setExtra("extra_origin_voice_file_path", resourceFile);
            } else {
                return;
            }
        }
        NLESegment mainSegment2 = nLETrackSlot.getMainSegment();
        if (mainSegment2 != null && (resource = mainSegment2.getResource()) != null) {
            resource.setResourceFile(c19536311c1.LJ);
        }
        nLETrackSlot.setExtra("extra_voice_chang_effect_id", c19536311c1.LIZJ.getEffectId());
        nLETrackSlot.setExtra("extra_voice_change_effect_name", c19536311c1.LIZJ.getName());
        List<String> urlList = c19536311c1.LIZJ.getIconUrl().getUrlList();
        if (urlList != null && !urlList.isEmpty()) {
            nLETrackSlot.setExtra("extra_voice_chang_effect_icon_url", (String) ListProtector.get(c19536311c1.LIZJ.getIconUrl().getUrlList(), 0));
        }
        nLETrackSlot.setExtra("extra_voice_chang_effect_resource_id", c19536311c1.LIZJ.getResource_id());
        Effect effect = c19536311c1.LIZJ;
        C1446130njf c1446130njf = C1446130njf.LIZ;
        c1446130njf.getClass();
        String strLJFF = C1446130njf.LJFF(effect, "vc_anchor_name");
        String str = "";
        if (strLJFF == null) {
            strLJFF = "";
        }
        nLETrackSlot.setExtra("extra_voice_chang_effect_anchor_name", strLJFF);
        Effect effect2 = c19536311c1.LIZJ;
        c1446130njf.getClass();
        String strLJFF2 = C1446130njf.LJFF(effect2, "vc_creator_user_id");
        if (strLJFF2 == null) {
            strLJFF2 = "";
        }
        nLETrackSlot.setExtra("extra_voice_change_creator_id", strLJFF2);
        Effect effect3 = c19536311c1.LIZJ;
        c1446130njf.getClass();
        String strLJFF3 = C1446130njf.LJFF(effect3, "vc_creator_name");
        if (strLJFF3 != null) {
            str = strLJFF3;
        }
        nLETrackSlot.setExtra("extra_voice_change_creator_username", str);
        nLETrackSlot.setExtra("extra_voice_change_from", enumC356240Dxu.name());
        nLETrackSlot.setExtra("is_aigc_content", C2378709Tt.LIZIZ(c19536311c1.LIZJ));
        if (nLETrackSlot.hasExtra("volume_before_enhance") && nLETrackSlot.hasExtra("volume_enhance_rate")) {
            nLETrackSlot.setExtra("volume_enhance_rate", "1.0");
            Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ(nLETrackSlot.getExtra("volume_before_enhance"));
            if (fLJIIIIZZ != null) {
                float fFloatValue = fLJIIIIZZ.floatValue();
                NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
                if (nLESegmentAudioDynamicCast != null) {
                    nLESegmentAudioDynamicCast.setVolume(fFloatValue);
                }
            }
        }
    }

    public static void LJIIIZ(NLETrack nLETrack, NLETrack nLETrack2) {
        NLESegment mainSegment;
        NLESegment mainSegment2;
        if (nLETrack == null || nLETrack2 == null || nLETrack.getSlots().size() != nLETrack2.getSlots().size()) {
            return;
        }
        VecNLETrackSlotSPtr slots = nLETrack2.getSlots();
        int i = 0;
        for (NLETrackSlot nLETrackSlot : nLETrack.getSlots()) {
            int i2 = i + 1;
            if (i >= 0) {
                NLETrackSlot nLETrackSlot2 = nLETrackSlot;
                if (nLETrackSlot2 != null && (mainSegment = nLETrackSlot2.getMainSegment()) != null) {
                    float fLJLLLL = C351220Dpo.LJLLLL(mainSegment);
                    NLETrackSlot nLETrackSlot3 = (NLETrackSlot) C13LP.LJJJLZIJ(i, slots);
                    if (nLETrackSlot3 != null && (mainSegment2 = nLETrackSlot3.getMainSegment()) != null) {
                        C351220Dpo.LLLLLL(mainSegment2, fLJLLLL);
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public static void LJIIJ(NLEModel nLEModel, float f) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "ORIGIN_VOICE_CONVERSION")) {
                arrayList.add(nLETrack);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            for (NLETrackSlot nLETrackSlot : ((NLETrack) it2.next()).getSortedSlots()) {
                if (nLETrackSlot.hasExtra("extra_is_vc_slot_mute")) {
                    nLETrackSlot.removeExtraWithKey("extra_is_vc_slot_mute");
                    NLESegment mainSegment = nLETrackSlot.getMainSegment();
                    if (mainSegment != null) {
                        C351220Dpo.LLLLLL(mainSegment, f);
                    }
                }
            }
        }
    }

    public static void LIZIZ(C19536311c1 c19536311c1, NLEEditor nLEEditor, EnumC356240Dxu enumC356240Dxu, boolean z) {
        VecNLETrackSPtr tracks;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        NLEResType resourceType;
        NLETrackSlot nLETrackSlotLIZJ;
        NLEResType resourceType2;
        NLETrack next;
        NLETrackSlot next2;
        NLESegment mainSegment;
        NLEResourceNode resource;
        NLESegmentVideo nLESegmentVideoDynamicCast;
        NLEFilter nLEFilterLJJLL;
        NLETrackSlot nLETrackSlot2;
        NLESegmentAudio nLESegmentAudioDynamicCast;
        NLEResourceNode resource2;
        NLEResourceNode resource3;
        NLEResourceNode resource4;
        NLEModel nLEModel = c19536311c1.LIZIZ;
        if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
            boolean z2 = false;
            NLETrack nLETrack = (NLETrack) C13LP.LJJJLZIJ(0, tracks);
            if (nLETrack != null && (slots = nLETrack.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, slots)) != null) {
                NLESegment mainSegment2 = nLETrackSlot.getMainSegment();
                NLETrackSlot nLETrackSlot3 = null;
                if (mainSegment2 != null && (resource4 = mainSegment2.getResource()) != null) {
                    resourceType = resource4.getResourceType();
                } else {
                    resourceType = null;
                }
                NLEResType nLEResType = NLEResType.AUDIO;
                if (resourceType == nLEResType) {
                    nLETrackSlotLIZJ = C349070DmL.LIZLLL(nLEEditor.getModel(), nLETrackSlot);
                    if (nLETrackSlotLIZJ == null) {
                        return;
                    }
                } else {
                    nLETrackSlotLIZJ = C349070DmL.LIZJ(nLEEditor.getModel(), nLETrackSlot);
                    if (nLETrackSlotLIZJ == null) {
                        return;
                    }
                }
                NLESegment mainSegment3 = nLETrackSlotLIZJ.getMainSegment();
                if (mainSegment3 != null && (resource3 = mainSegment3.getResource()) != null) {
                    resourceType2 = resource3.getResourceType();
                } else {
                    resourceType2 = null;
                }
                if (resourceType2 == nLEResType) {
                    NLESegment mainSegment4 = nLETrackSlotLIZJ.getMainSegment();
                    if (mainSegment4 != null) {
                        C351220Dpo.LLLLLL(mainSegment4, 0.0f);
                    }
                    nLETrackSlotLIZJ.clearKeyframe();
                    nLETrackSlotLIZJ.clearSwingKeyframe();
                    nLETrackSlotLIZJ = C349070DmL.LIZJ(nLEEditor.getModel(), nLETrackSlotLIZJ);
                    if (nLETrackSlotLIZJ == null) {
                        return;
                    }
                }
                Iterator<NLETrack> it2 = nLEEditor.getModel().getTracks().iterator();
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
                NLETrack nLETrack2 = next;
                long duration = 0;
                if (nLETrack2 == null) {
                    nLETrack2 = new NLETrack();
                    nLETrack2.setExtra("AudioTrackType", "ORIGIN_VOICE_CONVERSION");
                    nLETrack2.setStartTime(0L);
                    nLETrack2.setEndTime(-2L);
                    nLEEditor.getModel().addTrack(nLETrack2);
                }
                String extra = nLETrackSlotLIZJ.getExtra("extra_associated_vc_slot_id");
                if (extra.length() == 0) {
                    String str = c19536311c1.LJ;
                    if (str != null) {
                        NLESegment mainSegment5 = nLETrackSlotLIZJ.getMainSegment();
                        if (mainSegment5 != null && (resource2 = mainSegment5.getResource()) != null) {
                            duration = resource2.getDuration();
                        }
                        NLESegmentVideo nLESegmentVideoDynamicCast2 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotLIZJ.getMainSegment());
                        if (nLESegmentVideoDynamicCast2 == null) {
                            nLETrackSlot2 = null;
                        } else {
                            nLETrackSlot2 = new NLETrackSlot();
                            NLESegmentAudio nLESegmentAudio = new NLESegmentAudio();
                            NLEResourceAV nLEResourceAV = new NLEResourceAV();
                            nLEResourceAV.setResourceType(NLEResType.AUDIO);
                            nLEResourceAV.setDuration(duration);
                            nLEResourceAV.setResourceFile(str);
                            nLESegmentAudio.setAVFile(nLEResourceAV);
                            nLESegmentAudio.setTimeClipStart(nLESegmentVideoDynamicCast2.getTimeClipStart());
                            nLESegmentAudio.setTimeClipEnd(nLESegmentVideoDynamicCast2.getTimeClipEnd());
                            nLESegmentAudio.setVolume(nLESegmentVideoDynamicCast2.getVolume());
                            nLESegmentAudio.setKeepTone(true);
                            nLESegmentAudio.setSpeed(nLESegmentVideoDynamicCast2.getSpeed());
                            nLETrackSlot2.setMainSegment(nLESegmentAudio);
                            nLETrackSlot2.setStartTime(nLETrackSlotLIZJ.getStartTime());
                            nLETrackSlot2.setEndTime(nLETrackSlotLIZJ.getEndTime());
                            nLETrackSlotLIZJ.setExtra("extra_associated_vc_slot_id", nLETrackSlot2.getUUID());
                            C349070DmL.LIZIZ(nLETrackSlot2, nLETrackSlotLIZJ);
                            if (c19536311c1.LJII != 1.0f && nLETrackSlot2.getMainSegment() != null && (nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot2.getMainSegment())) != null) {
                                float f = c19536311c1.LJII;
                                nLESegmentAudioDynamicCast.setSpeed(f);
                                nLESegmentAudioDynamicCast.setTimeClipEnd(((long) ((nLESegmentAudioDynamicCast.getTimeClipEnd() - nLESegmentAudioDynamicCast.getTimeClipStart()) * f)) + nLESegmentAudioDynamicCast.getTimeClipStart());
                                nLETrackSlot2.setExtra("extra_svc_speed", String.valueOf(f));
                            }
                        }
                        nLETrack2.addSlot(nLETrackSlot2);
                    }
                } else {
                    Iterator<NLETrackSlot> it3 = nLETrack2.getSlots().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            if (Intrinsics.LJFF(next2.getUUID(), extra)) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    NLETrackSlot nLETrackSlot4 = next2;
                    if (nLETrackSlot4 != null && (mainSegment = nLETrackSlot4.getMainSegment()) != null && (resource = mainSegment.getResource()) != null) {
                        resource.setResourceFile(c19536311c1.LJ);
                    }
                }
                String extra2 = nLETrackSlotLIZJ.getExtra("extra_associated_vc_slot_id");
                Iterator<NLETrackSlot> it4 = nLETrack2.getSlots().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    NLETrackSlot next3 = it4.next();
                    if (Intrinsics.LJFF(next3.getUUID(), extra2)) {
                        nLETrackSlot3 = next3;
                        break;
                    }
                }
                NLETrackSlot nLETrackSlot5 = nLETrackSlot3;
                if (nLETrackSlot5 != null && (nLEFilterLJJLL = C351220Dpo.LJJLL(nLETrackSlotLIZJ)) != null && C351220Dpo.LJJLL(nLETrackSlot5) == null) {
                    nLETrackSlot5.addFilter(nLEFilterLJJLL);
                }
                nLETrackSlotLIZJ.setExtra("extra_voice_change_effect_name", c19536311c1.LIZJ.getName());
                nLETrackSlotLIZJ.setExtra("extra_voice_chang_effect_id", c19536311c1.LIZJ.getEffectId());
                List<String> urlList = c19536311c1.LIZJ.getIconUrl().getUrlList();
                if (urlList != null && !urlList.isEmpty()) {
                    nLETrackSlotLIZJ.setExtra("extra_voice_chang_effect_icon_url", (String) ListProtector.get(c19536311c1.LIZJ.getIconUrl().getUrlList(), 0));
                }
                nLETrackSlotLIZJ.setExtra("extra_voice_chang_effect_resource_id", c19536311c1.LIZJ.getResource_id());
                Effect effect = c19536311c1.LIZJ;
                C1446130njf c1446130njf = C1446130njf.LIZ;
                c1446130njf.getClass();
                String strLJFF = C1446130njf.LJFF(effect, "vc_anchor_name");
                String str2 = "";
                if (strLJFF == null) {
                    strLJFF = "";
                }
                nLETrackSlotLIZJ.setExtra("extra_voice_chang_effect_anchor_name", strLJFF);
                Effect effect2 = c19536311c1.LIZJ;
                c1446130njf.getClass();
                String strLJFF2 = C1446130njf.LJFF(effect2, "vc_creator_user_id");
                if (strLJFF2 == null) {
                    strLJFF2 = "";
                }
                nLETrackSlotLIZJ.setExtra("extra_voice_change_creator_id", strLJFF2);
                Effect effect3 = c19536311c1.LIZJ;
                c1446130njf.getClass();
                String strLJFF3 = C1446130njf.LJFF(effect3, "vc_creator_name");
                if (strLJFF3 != null) {
                    str2 = strLJFF3;
                }
                nLETrackSlotLIZJ.setExtra("extra_voice_change_creator_username", str2);
                nLETrackSlotLIZJ.setExtra("extra_voice_change_from", enumC356240Dxu.name());
                nLETrackSlotLIZJ.setExtra("is_aigc_content", C2378709Tt.LIZIZ(c19536311c1.LIZJ));
                if (z) {
                    NLETrackSlot nLETrackSlotLIZLLL = C349070DmL.LIZLLL(nLEEditor.getModel(), nLETrackSlotLIZJ);
                    NLESegmentVideo nLESegmentVideoDynamicCast3 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotLIZJ.getMainSegment());
                    if (nLESegmentVideoDynamicCast3 != null) {
                        if (nLETrackSlotLIZLLL != null) {
                            z2 = true;
                        }
                        nLESegmentVideoDynamicCast3.setEnableAudio(z2);
                        return;
                    }
                    return;
                }
                if ((!nLETrackSlotLIZJ.getKeyframes().isEmpty() || C351220Dpo.LLIIIJ(nLETrackSlotLIZJ)) && (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotLIZJ.getMainSegment())) != null) {
                    nLESegmentVideoDynamicCast.setEnableAudio(false);
                }
                NLESegment mainSegment6 = nLETrackSlotLIZJ.getMainSegment();
                if (mainSegment6 != null) {
                    C351220Dpo.LLLLLL(mainSegment6, 0.0f);
                }
            }
        }
    }
}
