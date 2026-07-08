package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.creative.model.UgcTemplateData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EG7, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EG7 {
    public static final C0EG7 LIZ = new C0EG7();
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("is_editorpro_copy_video_clip", "is_editorpro_replace_video_clip", "is_editorpro_trim_video_length", "is_editorpro_split_video", "is_editorpro_adjust_video_speed", "is_editorpro_rotate_video", "is_editorpro_add_video_material", "is_editorpro_adjust_video_volume", "is_editorpro_adjust_video_order", "is_editorpro_start_over", "is_editorpro_crop_video");
    public static final List<String> LIZJ = C1697810uHb.LJIIJJI("is_editorpro_tts", "is_editorpro_text", "is_editorpro_trim_text_length", "is_editorpro_copy_text", "is_editorpro_adjust_text_style", "is_editorpro_adjust_text_paragraph", "is_editorpro_adjust_text_font", "is_editorpro_adjust_text_color", "is_editorpro_adjust_text_position");
    public static final List<String> LIZLLL = C1697810uHb.LJIIJJI("is_editorpro_trim_music_length", "is_editorpro_add_music_material", "is_editorpro_adjust_music_volume", "is_editorpro_add_sound_beat", "is_editor_pro_sync_used");
    public static final List<String> LJ = Collections.singletonList("is_editorpro_add_sound_effect");
    public static final List<String> LJFF = Collections.singletonList("is_editorpro_keyframe");
    public static final List<String> LJI = Collections.singletonList("is_editorpro_captions");
    public static final List<String> LJII = Collections.singletonList("");
    public static final List<String> LJIIIIZZ = C1697810uHb.LJIIJJI("is_editorpro_effect", "is_editorpro_trim_effect");
    public static final List<String> LJIIIZ = Collections.singletonList("is_editorpro_transition");
    public static final List<String> LJIIJ = Collections.singletonList("is_audio_record_edited");
    public static final Map<String, String> LJIIJJI = C2097608Jq.LJIIIIZZ(new Pair("is_editorpro_trim_video_length", "edit_video_length"), new Pair("is_editorpro_split_video", "split_video"), new Pair("is_editorpro_adjust_video_speed", "change_video_speed"), new Pair("is_editorpro_rotate_video", "rotate_video"), new Pair("is_editorpro_crop_video", "crop_video"), new Pair("is_editorpro_replace_video_clip", "replace_video"), new Pair("is_editorpro_start_over", "start_over"), new Pair("is_editorpro_add_music_material", "add_music"), new Pair("is_editorpro_trim_music_length", "trim_music_length"), new Pair("is_editorpro_add_sound_effect", "add_sound_effect"), new Pair("is_editorpro_text", "add_text"), new Pair("is_editor_pro_sticker", "sticker"), new Pair("is_editorpro_tts", "text_reading"), new Pair("is_editorpro_captions", "auto_subtitle"), new Pair("is_editor_pro_sync_used", "sound_sync"), new Pair("is_editorpro_transition", "transition"), new Pair("is_editorpro_effect", "add_effect"));

    public static final String LIZ(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        UgcTemplateData ugcTemplateData = videoPublishEditModel.creativeModel.ugcTemplateData;
        if (ugcTemplateData.isFromEPTemplateAnchor) {
            return ugcTemplateData.anchorTemplateUsedFunctions;
        }
        String nleData = videoPublishEditModel.getNleData();
        int i = 0;
        if (nleData != null && nleData.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String strLIZIZ = "";
        if (!z) {
            C0CHQ.LIZ().LJJIZ();
            C0FGC.LIZ(2);
            NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
            nLEEditorLIZ.restore(videoPublishEditModel.getNleData());
            NLEModel model = nLEEditorLIZ.getModel();
            if (model != null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                ArrayList arrayList = new ArrayList();
                VecNLETrackSPtr sortedTracks = model.getSortedTracks();
                if (sortedTracks != null) {
                    Iterator<NLETrack> it2 = sortedTracks.iterator();
                    while (it2.hasNext()) {
                        arrayList.addAll(it2.next().getSortedSlots());
                    }
                }
                Iterator<Map.Entry<String, String>> it3 = LJIIJJI.entrySet().iterator();
                while (true) {
                    boolean zHasNext = it3.hasNext();
                    C0EG7 c0eg7 = LIZ;
                    if (!zHasNext) {
                        break;
                    }
                    Map.Entry<String, String> next = it3.next();
                    String key = next.getKey();
                    String value = next.getValue();
                    AFwS234S0000000_5 aFwS234S0000000_5 = AFwS234S0000000_5.get$arr$(502);
                    AFwS234S0000000_5 aFwS234S0000000_52 = AFwS234S0000000_5.get$arr$(503);
                    c0eg7.getClass();
                    if (LIZLLL(key, model, aFwS234S0000000_5, aFwS234S0000000_52)) {
                        linkedHashSet.add(value);
                    }
                }
                if (nLEEditorLIZ.getModel().hasExtra("is_audio_record_edited")) {
                    linkedHashSet.add("dub");
                }
                if (videoPublishEditModel.getVeAudioEffectParam() != null) {
                    linkedHashSet.add("voice_effect");
                }
                List<String> pipResourcePaths = videoPublishEditModel.getEditorProModel().getPipResourcePaths();
                if (pipResourcePaths != null && !pipResourcePaths.isEmpty()) {
                    linkedHashSet.add("pip");
                }
                if (C357540E0a.LJJII(videoPublishEditModel)) {
                    linkedHashSet.add("caption_animation");
                }
                List<TextStickerModel> list = videoPublishEditModel.creativeModel.stickerModel.textStickerModels;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<TextStickerModel> it4 = list.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        TextStickerModel next2 = it4.next();
                        if (!C363290EMd.LIZ(next2.getTextMotionModel()) && next2.getTextMotionModel().motionEnabled == 1) {
                            linkedHashSet.add("text_animation");
                            break;
                        }
                    }
                }
                List<TextStickerModel> list2 = videoPublishEditModel.creativeModel.stickerModel.textStickerModels;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<TextStickerModel> it5 = list2.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        }
                        if (!C385050F7v.LJIIJJI(it5.next())) {
                            linkedHashSet.add("caption_template");
                            break;
                        }
                    }
                }
                if (C357540E0a.LJIJI(model)) {
                    linkedHashSet.add("add_magic");
                }
                if (C357540E0a.LJIJJ(model)) {
                    linkedHashSet.add("smart_trim");
                }
                if (C361680EFy.LJIILJJIL(model) > 0) {
                    linkedHashSet.add("filter");
                }
                if (C351420Dq8.LIZLLL(model)) {
                    linkedHashSet.add("layer");
                }
                if (C351220Dpo.LLFII(model)) {
                    linkedHashSet.add("mask");
                }
                if (C351220Dpo.LL(model)) {
                    linkedHashSet.add("add_stroke");
                }
                if (C357540E0a.LJJI(model)) {
                    linkedHashSet.add("adjust_filter");
                }
                if (C357540E0a.LJFF(model).length() > 0) {
                    linkedHashSet.add("curve_speed");
                }
                if (C361680EFy.LJIJ(model) > 0) {
                    linkedHashSet.add("keyframe");
                }
                if (C357540E0a.LJIIZILJ(model)) {
                    linkedHashSet.add("cutout");
                }
                if (LIZJ(model)) {
                    linkedHashSet.add("beats");
                }
                if (C0EI7.LIZIZ(videoPublishEditModel, model)) {
                    linkedHashSet.add("ai_voice");
                }
                C363500EMy c363500EMy = C363500EMy.LIZ;
                NLEModel nleModel = videoPublishEditModel.getNleModel();
                c363500EMy.getClass();
                if (C363500EMy.LJII(nleModel)) {
                    linkedHashSet.add("cutout");
                    NLEModel nleModel2 = videoPublishEditModel.getNleModel();
                    C362740EKa c362740EKa = C362740EKa.LIZ;
                    c362740EKa.getClass();
                    if (C362740EKa.LJI(nleModel2)) {
                        linkedHashSet.add("auto_cutout");
                    }
                    NLEModel nleModel3 = videoPublishEditModel.getNleModel();
                    c362740EKa.getClass();
                    if (C362740EKa.LJII(nleModel3)) {
                        linkedHashSet.add("manual_cutout");
                    }
                }
                if (C351220Dpo.LLIIIZ(model)) {
                    linkedHashSet.add("opacity");
                }
                if (videoPublishEditModel.creativeModel.publishModel.bindFreezeFrameSlot) {
                    ArrayList arrayList2 = (ArrayList) C346740Dia.LIZ(model);
                    if (!arrayList2.isEmpty()) {
                        Iterator it6 = arrayList2.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                break;
                            }
                            if (C346840Dik.LIZIZ(model, (NLETrackSlot) it6.next())) {
                                linkedHashSet.add("freeze");
                                break;
                            }
                        }
                    }
                }
                if (C351220Dpo.LLIIIILZ(model)) {
                    linkedHashSet.add("reverse");
                }
                if (C346910Dir.LIZ(model)) {
                    linkedHashSet.add("audio_fade");
                }
                if (!arrayList.isEmpty()) {
                    Iterator it7 = arrayList.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            break;
                        }
                        if (!((NLETrackSlot) it7.next()).getVideoAnims().isEmpty()) {
                            linkedHashSet.add("video_animation");
                            break;
                        }
                    }
                }
                if (C377880Eri.LJFF(model) > 0) {
                    linkedHashSet.add("ai_create_stylized_i2v");
                }
                if (C377880Eri.LIZLLL(model) > 0) {
                    linkedHashSet.add("ai_create_i2v");
                }
                if (C377880Eri.LJ(model) > 0) {
                    linkedHashSet.add("ai_create_stylized_fl2v");
                }
                if (C377880Eri.LIZIZ(model) > 0) {
                    linkedHashSet.add("ai_create_fl2v");
                }
                if (C377880Eri.LIZJ(model) > 0) {
                    linkedHashSet.add("ai_create_i2i");
                }
                if (!linkedHashSet.isEmpty()) {
                    for (Object obj : linkedHashSet) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            String strLIZIZ2 = (String) obj;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(strLIZIZ);
                            if (i != linkedHashSet.size() - 1) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(strLIZIZ2);
                                sbLIZ2.append(',');
                                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            }
                            sbLIZ.append(strLIZIZ2);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
                C201955140j.LIZJ(C563650M8t.LIZIZ, "template used functions = " + strLIZIZ);
            }
        }
        return strLIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0 A[EDGE_INSN: B:63:0x00b0->B:31:0x00b0 BREAK  A[LOOP:3: B:34:0x00bd->B:65:?], EDGE_INSN: B:64:0x00b0->B:31:0x00b0 BREAK  A[LOOP:3: B:34:0x00bd->B:65:?]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(com.bytedance.ies.nle.editor_jni.NLEModel r11) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EG7.LIZJ(com.bytedance.ies.nle.editor_jni.NLEModel):boolean");
    }

    public static List LJFF(String str) {
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

    /* JADX WARN: Removed duplicated region for block: B:210:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0663  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r14, boolean r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 1711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EG7.LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, boolean, boolean):java.lang.String");
    }

    public static boolean LIZLLL(String str, NLEModel nLEModel, Function1 function1, Function1 function12) {
        if (Intrinsics.LJFF(nLEModel.getExtra(str), "1") || Boolean.parseBoolean(nLEModel.getExtra(str))) {
            return true;
        }
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        if (tracks == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (((Boolean) function1.invoke(nLETrack)).booleanValue()) {
                arrayList.add(nLETrack);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
        }
        ArrayList<NLENode> arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((Boolean) function12.invoke(obj)).booleanValue()) {
                arrayList3.add(obj);
            }
        }
        if (!arrayList3.isEmpty()) {
            for (NLENode nLENode : arrayList3) {
                if (Intrinsics.LJFF(nLENode.getExtra(str), "1") || Boolean.parseBoolean(nLENode.getExtra(str))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
