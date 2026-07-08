package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProEffectInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0E4M, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E4M {
    public static final /* synthetic */ int LIZ = 0;

    public static final LinkedHashMap<String, String> LIZ(VideoPublishEditModel videoPublishEditModel) {
        String nleData;
        NLEResType type;
        boolean z;
        NLEResType type2;
        boolean z2;
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        if (videoPublishEditModel.getEditorProModel().isAdvancedEditDraft() && (nleData = videoPublishEditModel.getNleData()) != null && nleData.length() != 0) {
            linkedHashMap.put("editorpro_click_from", videoPublishEditModel.getEditorProModel().getClickFrom());
            C0CHQ.LIZ().LJJIZ();
            C0FGC.LIZ(2);
            NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
            nLEEditorLIZ.restore(videoPublishEditModel.getNleData());
            NLEModel model = nLEEditorLIZ.getModel();
            if (model != null) {
                ArrayList<NLETrackSlot> arrayList = new ArrayList();
                VecNLETrackSPtr sortedTracks = model.getSortedTracks();
                if (sortedTracks != null) {
                    Iterator<NLETrack> it2 = sortedTracks.iterator();
                    while (it2.hasNext()) {
                        arrayList.addAll(it2.next().getSortedSlots());
                    }
                }
                LJII(linkedHashMap, model, arrayList, "is_editorpro_trim_video_length");
                LJII(linkedHashMap, model, arrayList, "is_editorpro_split_video");
                LJII(linkedHashMap, model, arrayList, "is_editorpro_adjust_video_speed");
                LJII(linkedHashMap, model, arrayList, "is_editor_pro_curve_speed_used");
                LJII(linkedHashMap, model, arrayList, "is_editorpro_rotate_video");
                LJII(linkedHashMap, model, arrayList, "is_editorpro_add_video_material");
                LJII(linkedHashMap, model, arrayList, "is_editorpro_add_library_material");
                LJII(linkedHashMap, model, arrayList, "is_editorpro_adjust_video_volume");
                LJII(linkedHashMap, model, arrayList, "is_editorpro_crop_video");
                LJII(linkedHashMap, model, arrayList, "is_editorpro_adjust_video_order");
                LJII(linkedHashMap, model, arrayList, "is_editorpro_start_over");
                LJII(linkedHashMap, model, arrayList, "is_editorpro_trim_music_length");
                LJII(linkedHashMap, model, arrayList, "is_editorpro_add_music_material");
                LJII(linkedHashMap, model, arrayList, "is_editorpro_add_sound_effect");
                LJII(linkedHashMap, model, arrayList, "is_editorpro_adjust_music_volume");
                StringBuilder sb = new StringBuilder();
                Iterator it3 = arrayList.iterator();
                while (true) {
                    NLEResType type3 = null;
                    if (!it3.hasNext()) {
                        break;
                    }
                    NLETrackSlot nLETrackSlot = (NLETrackSlot) it3.next();
                    NLESegment mainSegment = nLETrackSlot.getMainSegment();
                    if (mainSegment != null) {
                        type3 = mainSegment.getType();
                    }
                    if (type3 == NLEResType.AUDIO) {
                        sb.append(nLETrackSlot.getExtra("d_bgmId"));
                    }
                }
                if (sb.length() > 0) {
                    linkedHashMap.put("editorpro_music_id", sb.toString());
                }
                StringBuilder sb2 = new StringBuilder();
                for (NLETrackSlot nLETrackSlot2 : arrayList) {
                    NLESegment mainSegment2 = nLETrackSlot2.getMainSegment();
                    if (mainSegment2 != null) {
                        type2 = mainSegment2.getType();
                    } else {
                        type2 = null;
                    }
                    if (type2 == NLEResType.SOUND) {
                        if (sb2.length() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            sb2.append(nLETrackSlot2.getExtra("ep_audio_music_id"));
                        } else {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(',');
                            sbLIZ.append(nLETrackSlot2.getExtra("ep_audio_music_id"));
                            sb2.append(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                }
                if (sb2.length() > 0) {
                    linkedHashMap.put("editorpro_sound_effect_id", sb2.toString());
                }
                C0EMD.LIZ.getClass();
                C0EMD.LJ(model, videoPublishEditModel, linkedHashMap, false);
                LJII(linkedHashMap, model, arrayList, "is_editorpro_effect");
                LJII(linkedHashMap, model, arrayList, "is_editorpro_trim_effect");
                StringBuilder sb3 = new StringBuilder();
                for (NLETrackSlot nLETrackSlot3 : arrayList) {
                    NLESegment mainSegment3 = nLETrackSlot3.getMainSegment();
                    if (mainSegment3 != null) {
                        type = mainSegment3.getType();
                    } else {
                        type = null;
                    }
                    if (type == NLEResType.EFFECT) {
                        if (sb3.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            sb3.append(nLETrackSlot3.getMainSegment().getExtra("nleExtraEffectKey"));
                        } else {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(',');
                            sbLIZ2.append(nLETrackSlot3.getMainSegment().getExtra("nleExtraEffectKey"));
                            sb3.append(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    }
                }
                Iterator<EditorProEffectInfo> it4 = videoPublishEditModel.getEditorProModel().getVideoSegmentEffects().iterator();
                while (it4.hasNext()) {
                    String key = it4.next().getKey();
                    if (key != null && key.length() != 0) {
                        if (sb3.length() != 0) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(',');
                            sbLIZ3.append(key);
                            key = C2188811AlT.LIZIZ(sbLIZ3);
                        }
                        sb3.append(key);
                    }
                }
                if (sb3.length() > 0) {
                    linkedHashMap.put("editorpro_effect_id", sb3.toString());
                }
            }
        }
        return linkedHashMap;
    }

    public static boolean LIZJ(NLEModel nLEModel) {
        VecNLETrackSPtr tracks;
        if (nLEModel == null || (tracks = nLEModel.getTracks()) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (Intrinsics.LJFF("BGM", nLETrack2.getExtra("AudioTrackType")) || Intrinsics.LJFF("EDITOR_MUSIC", nLETrack2.getExtra("AudioTrackType"))) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            VecNLETrackSlotSPtr slots = ((NLETrack) it2.next()).getSlots();
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(slots, 10));
            Iterator<NLETrackSlot> it3 = slots.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Boolean.valueOf(LIZLLL(it3.next())));
            }
            C19719612Di.LJJI(arrayList3, arrayList2);
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            if (((Boolean) it4.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZLLL(NLETrackSlot nLETrackSlot) {
        int i;
        if (nLETrackSlot.hasExtra("audio_stick_points") && nLETrackSlot.hasExtra("beats_source")) {
            if (nLETrackSlot.hasExtra("sound_sync_beats_count")) {
                i = CastIntegerProtector.parseInt(nLETrackSlot.getExtra("sound_sync_beats_count"));
            } else {
                i = 0;
            }
            List listLJ = LJ(nLETrackSlot.getExtra("audio_stick_points"));
            List listLJ2 = LJ(nLETrackSlot.getExtra("beats_source"));
            if (!(listLJ2 instanceof Collection) || !listLJ2.isEmpty()) {
                Iterator it2 = listLJ2.iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((Number) it2.next()).intValue();
                    if (iIntValue == 0 || iIntValue == 1) {
                        return true;
                    }
                }
            }
            if (listLJ.size() != i) {
                return true;
            }
        }
        return false;
    }

    public static List LJ(String str) {
        if (str.length() == 0) {
            return C13BV.INSTANCE;
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listLJJLIIIJILLIZJL.iterator();
        while (it2.hasNext()) {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(a0.LJLIIIL((String) it2.next()).toString());
            if (numLJIIJJI != null) {
                arrayList.add(numLJIIJJI);
            }
        }
        return arrayList;
    }

    public static final LinkedHashMap<String, String> LIZIZ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        String nleData;
        long maxEnd;
        boolean z2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        NLETrack mainTrack;
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        if (videoPublishEditModel.getEditorProModel().isAdvancedEditDraft() && (nleData = videoPublishEditModel.getNleData()) != null && nleData.length() != 0) {
            C0CHQ.LIZ().LJJIZ();
            C0FGC.LIZ(2);
            NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
            nLEEditorLIZ.restore(videoPublishEditModel.getNleData());
            NLEModel model = nLEEditorLIZ.getModel();
            if (model != null) {
                ArrayList arrayList = new ArrayList();
                VecNLETrackSPtr sortedTracks = model.getSortedTracks();
                if (sortedTracks != null) {
                    Iterator<NLETrack> it2 = sortedTracks.iterator();
                    while (it2.hasNext()) {
                        arrayList.addAll(it2.next().getSortedSlots());
                    }
                }
                LJFF(linkedHashMap, model, arrayList, "is_editor_pro_sync_used");
                LJFF(linkedHashMap, model, arrayList, "is_editor_pro_add_sound_used");
                LJFF(linkedHashMap, model, arrayList, "is_editor_pro_sound_effect_used");
                LJFF(linkedHashMap, model, arrayList, "is_editor_pro_add_text_used");
                LJFF(linkedHashMap, model, arrayList, "is_editor_pro_tts_used");
                LJFF(linkedHashMap, model, arrayList, "is_editor_pro_split_used");
                LJFF(linkedHashMap, model, arrayList, "is_editor_pro_copy_used");
                LJFF(linkedHashMap, model, arrayList, "is_editor_pro_speed_used");
                LJFF(linkedHashMap, model, arrayList, "is_editor_pro_curve_speed_used");
                LJFF(linkedHashMap, model, arrayList, "is_editor_pro_rotate_used");
            }
            if (z) {
                NLEModel model2 = nLEEditorLIZ.getModel();
                long maxTargetEnd = 0;
                if (model2 != null && (mainTrack = model2.getMainTrack()) != null) {
                    maxEnd = mainTrack.getMaxEnd();
                } else {
                    maxEnd = 0;
                }
                NLEModel model3 = nLEEditorLIZ.getModel();
                if (model3 != null) {
                    maxTargetEnd = model3.getMaxTargetEnd();
                }
                if (maxEnd < maxTargetEnd) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String str9 = CardStruct.IStatusCode.DEFAULT;
                if (z2) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("has_black_screen", str);
                boolean zHasExtra = nLEEditorLIZ.getModel().hasExtra("is_audio_record_edited");
                boolean zLJFF = Intrinsics.LJFF(nLEEditorLIZ.getModel().getExtra("is_audio_record_overlap"), "1");
                if (zHasExtra) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_editorpro_add_voiceover", str2);
                if (zLJFF) {
                    str3 = "1";
                } else {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_record_overlapping", str3);
                if (C357540E0a.LJIJJLI(nLEEditorLIZ.getModel())) {
                    boolean zHasExtra2 = nLEEditorLIZ.getModel().hasExtra("is_editorpro_transition");
                    List listLJIIIIZZ = C357540E0a.LJIIIIZZ(nLEEditorLIZ.getModel());
                    if (zHasExtra2) {
                        str7 = "1";
                    } else {
                        str7 = CardStruct.IStatusCode.DEFAULT;
                    }
                    linkedHashMap.put("is_editorpro_transition", str7);
                    linkedHashMap.put("transition_list", String.valueOf(listLJIIIIZZ));
                    if (C361680EFy.LJJI(nLEEditorLIZ.getModel())) {
                        str8 = "1";
                    } else {
                        str8 = CardStruct.IStatusCode.DEFAULT;
                    }
                    linkedHashMap.put("is_edit_transition_duration", str8);
                }
                NLEModel model4 = nLEEditorLIZ.getModel();
                if (model4 != null) {
                    C351370Dq3.LIZ(model4, linkedHashMap);
                }
                NLEModel model5 = nLEEditorLIZ.getModel();
                if (model5 != null) {
                    C377120EqU.LIZ.getClass();
                    C377120EqU.LIZIZ(model5, videoPublishEditModel, linkedHashMap);
                }
                if (C357540E0a.LJIIZILJ(nLEEditorLIZ.getModel()) || C357540E0a.LJIJ(nLEEditorLIZ.getModel())) {
                    str4 = "1";
                } else {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_editorpro_cutout", str4);
                if (C357540E0a.LJIJ(nLEEditorLIZ.getModel())) {
                    str5 = "1";
                } else {
                    str5 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_editorpro_chroma_key_cutout", str5);
                if (C357540E0a.LJIL(nLEEditorLIZ.getModel())) {
                    str6 = "1";
                } else {
                    str6 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_editorpro_background", str6);
                if (C357540E0a.LJIJJ(nLEEditorLIZ.getModel())) {
                    str9 = "1";
                }
                linkedHashMap.put("is_editor_pro_smart_trim", str9);
                linkedHashMap.putAll(C361680EFy.LJJL(nLEEditorLIZ.getModel()));
                linkedHashMap.put("editor_pro_curve_speed_used_list", C357540E0a.LJFF(nLEEditorLIZ.getModel()));
                return linkedHashMap;
            }
        }
        return linkedHashMap;
    }

    public static void LJFF(LinkedHashMap linkedHashMap, NLEModel nLEModel, List list, String str) {
        if (!nLEModel.hasExtra(str) || !Boolean.parseBoolean(nLEModel.getExtra(str))) {
            if (!((ArrayList) list).isEmpty()) {
                for (NLENode nLENode : (ArrayList) list) {
                    if (!nLENode.hasExtra(str) || !Boolean.parseBoolean(nLENode.getExtra(str))) {
                    }
                }
            }
            linkedHashMap.put(str, CardStruct.IStatusCode.DEFAULT);
            return;
        }
        linkedHashMap.put(str, "1");
    }

    public static void LJI(LinkedHashMap linkedHashMap, NLEModel nLEModel, List list, String str) {
        if (!nLEModel.hasExtra(str) || !Boolean.parseBoolean(nLEModel.getExtra(str))) {
            if (!((ArrayList) list).isEmpty()) {
                for (NLENode nLENode : (ArrayList) list) {
                    if (!nLENode.hasExtra(str) || !Intrinsics.LJFF(nLENode.getExtra(str), "1")) {
                    }
                }
            }
            linkedHashMap.put(str, CardStruct.IStatusCode.DEFAULT);
            return;
        }
        linkedHashMap.put(str, "1");
    }

    public static void LJII(LinkedHashMap linkedHashMap, NLEModel nLEModel, List list, String str) {
        if (!nLEModel.hasExtra(str) || !Boolean.parseBoolean(nLEModel.getExtra(str))) {
            if (!((ArrayList) list).isEmpty()) {
                for (NLENode nLENode : (ArrayList) list) {
                    if (!nLENode.hasExtra(str) || !Intrinsics.LJFF(nLENode.getExtra(str), "1")) {
                    }
                }
                return;
            }
            return;
        }
        linkedHashMap.put(str, "1");
    }
}
