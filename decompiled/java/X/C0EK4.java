package X;

import Y.AComparatorS24S0000000_5;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLESetting;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EK4, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EK4 {
    public final C0EGB LIZ;

    public final C0E48 LIZ() {
        return this.LIZ.O3();
    }

    public final VideoPublishEditModel LIZIZ() {
        return this.LIZ.B3();
    }

    public final void LIZJ() {
        C372480Ej0 c372480Ej0;
        C0EGE c0ege;
        InterfaceC363820EOe interfaceC363820EOeP4;
        CreativeModel creativeModel;
        InfoStickerModel infoStickerModel;
        List<StickerItemModel> list;
        Object next;
        boolean z;
        int i;
        CreativeModel creativeModel2;
        StickerNewEngineModel stickerNewEngineModel;
        List<TextStickerModel> list2;
        VecNLETrackSlotSPtr slots;
        VecNLETrackSlotSPtr slots2;
        NLETrackSlot nLETrackSlot;
        Object next2;
        String str;
        String str2;
        String str3;
        Map<String, String> map;
        StickerNewEngineModel stickerNewEngineModel2;
        List<TextStickerModel> list3;
        Object next3;
        NLETrack trackBySlot;
        StickerNewEngineModel stickerNewEngineModel3;
        List<TextStickerModel> list4;
        C0EHI value = this.LIZ.o4().zu2().getValue();
        if (value == null || (c0ege = (c372480Ej0 = this.LIZ.LLILZ).LLLILZ) == null || c0ege.LJIIIZ == null) {
            return;
        }
        C0ELJ c0elj = value.LJ;
        C360770ECl c360770EClWq = c372480Ej0.Wq();
        C0E48 c0e48LIZ = LIZ();
        if (c0e48LIZ != null) {
            if (!c0elj.isRestoreData()) {
                C0EKO c0eko = C0EKO.LIZ;
                VideoPublishEditModel videoPublishEditModelLIZIZ = LIZIZ();
                NLEModel nLEModelLJI = C350870DpF.LJI(c0e48LIZ);
                boolean zIsRestoreData = value.LJ.isRestoreData();
                c0eko.getClass();
                if (videoPublishEditModelLIZIZ != null && (creativeModel2 = videoPublishEditModelLIZIZ.creativeModel) != null && (stickerNewEngineModel = creativeModel2.stickerModel) != null && (list2 = stickerNewEngineModel.textStickerModels) != null) {
                    ArrayList arrayList = new ArrayList(list2);
                    CreativeModel creativeModel3 = videoPublishEditModelLIZIZ.creativeModel;
                    if (creativeModel3 != null && (stickerNewEngineModel3 = creativeModel3.stickerModel) != null && (list4 = stickerNewEngineModel3.textStickerModels) != null) {
                        list4.clear();
                    }
                    EditorProModel editorProModel = videoPublishEditModelLIZIZ.getEditorProModel();
                    if ((editorProModel == null || editorProModel.isCaptionMixTrackUsed()) ? false : true) {
                        ArrayList arrayList2 = new ArrayList();
                        for (NLETrack nLETrack : (ArrayList) C349560Dn8.LJ(nLEModelLJI)) {
                            for (NLETrackSlot nLETrackSlot2 : nLETrack.getSlots()) {
                                Iterator it2 = arrayList.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        Object next4 = it2.next();
                                        TextStickerModel textStickerModel = (TextStickerModel) next4;
                                        if (Intrinsics.LJFF(textStickerModel.getUuid(), nLETrackSlot2.getUUID()) && textStickerModel.getCaptionModel() != null) {
                                            if (next4 != null) {
                                                arrayList2.add(nLETrackSlot2);
                                                nLETrack.removeSlot(nLETrackSlot2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            NLETrack nLETrackLIZ = C349560Dn8.LIZ(nLEModelLJI);
                            if (nLETrackLIZ == null) {
                                Iterator it3 = ((ArrayList) C351220Dpo.LJLLI(nLEModelLJI)).iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    Object next5 = it3.next();
                                    if (((NLETimeSpaceNode) next5).getLayer() == 0) {
                                        if (next5 != null) {
                                            for (NLETimeSpaceNode nLETimeSpaceNode : new ArrayList(C349560Dn8.LJ(nLEModelLJI))) {
                                                nLETimeSpaceNode.setLayer(nLETimeSpaceNode.getLayer() + 1);
                                            }
                                        }
                                    }
                                }
                                nLETrackLIZ = new NLETrack();
                                nLETrackLIZ.setExtra("track_type", "sticker");
                                C351220Dpo.LLLLJI(nLETrackLIZ);
                                nLETrackLIZ.setLayer(0);
                                nLETrackLIZ.setExtraTrackType(NLETrackType.STICKER);
                                nLETrackLIZ.setExtra("StickerTrackType", "TEXT");
                                nLEModelLJI.addTrack(nLETrackLIZ);
                            }
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                nLETrackLIZ.addSlot((NLETrackSlot) it4.next());
                            }
                        }
                    }
                    List<NLETrack> listLJ = C349560Dn8.LJ(nLEModelLJI);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : (ArrayList) listLJ) {
                        if (((NLETrack) obj).getSlots().isEmpty()) {
                            arrayList3.add(obj);
                        }
                    }
                    Iterator it5 = arrayList3.iterator();
                    while (it5.hasNext()) {
                        nLEModelLJI.removeTrack((NLETrack) it5.next());
                    }
                    ArrayList<TextStickerModel> arrayList4 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (!((TextStickerModel) obj2).isNotEmptyModel()) {
                            arrayList4.add(obj2);
                        }
                    }
                    for (TextStickerModel textStickerModel2 : arrayList4) {
                        VecNLETrackSPtr tracks = nLEModelLJI.getTracks();
                        ArrayList arrayList5 = new ArrayList();
                        Iterator<NLETrack> it6 = tracks.iterator();
                        while (it6.hasNext()) {
                            C19719612Di.LJJI(it6.next().getSlots(), arrayList5);
                        }
                        Iterator it7 = arrayList5.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                next3 = it7.next();
                                if (Intrinsics.LJFF(((NLENode) next3).getUUID(), textStickerModel2.getUuid())) {
                                    break;
                                }
                            } else {
                                next3 = null;
                                break;
                            }
                        }
                        NLETrackSlot nLETrackSlot3 = (NLETrackSlot) next3;
                        if (nLETrackSlot3 != null && (trackBySlot = nLEModelLJI.getTrackBySlot(nLETrackSlot3)) != null) {
                            trackBySlot.removeSlot(nLETrackSlot3);
                            if (trackBySlot.getSlots().isEmpty()) {
                                nLEModelLJI.removeTrack(trackBySlot);
                            }
                        }
                    }
                    long maxTargetEnd = nLEModelLJI.getMaxTargetEnd();
                    int i2 = 0;
                    for (Object obj3 : C13LP.LJLLLL(new AComparatorS24S0000000_5(79), C349560Dn8.LJ(nLEModelLJI))) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                        NLETrack nLETrack2 = (NLETrack) obj3;
                        nLETrack2.setLayer(i2);
                        for (NLETrackSlot nLETrackSlot4 : nLETrack2.getSlots()) {
                            Iterator it8 = arrayList.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    next2 = it8.next();
                                    if (Intrinsics.LJFF(((TextStickerModel) next2).getUuid(), nLETrackSlot4.getUUID())) {
                                        break;
                                    }
                                } else {
                                    next2 = null;
                                    break;
                                }
                            }
                            TextStickerModel textStickerModel3 = (TextStickerModel) next2;
                            if (textStickerModel3 != null) {
                                NLESetting setting = nLEModelLJI.getSetting();
                                boolean z2 = setting != null && setting.getFreeRenderLayer();
                                boolean zIsFromPugcTemplate = textStickerModel3.getCompatModel().isFromPugcTemplate();
                                if (!z2 && !zIsFromPugcTemplate) {
                                    nLETrackSlot4.setLayer(nLETrack2.getLayer() + 1 + 2000);
                                }
                                CreativeModel creativeModel4 = videoPublishEditModelLIZIZ.creativeModel;
                                if (creativeModel4 != null && (stickerNewEngineModel2 = creativeModel4.stickerModel) != null && (list3 = stickerNewEngineModel2.textStickerModels) != null) {
                                    list3.add(TextStickerModel.copy$default(textStickerModel3, BaseStickerModel.copy$default(textStickerModel3.getBaseStickerModel(), 0, nLETrackSlot4.getLayer(), null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -3, 15, null), null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -2, 65535, null));
                                }
                                nLETrack2.setEnable(true);
                                nLETrack2.setExtra("StickerTrackType", "TEXT");
                                nLETrack2.setExtra("track_type", "sticker");
                                nLETrack2.setExtraTrackType(NLETrackType.STICKER);
                                nLETrackSlot4.setExtra("text_slot_type", textStickerModel3.getCaptionModel() != null ? "SUBTITLE" : C0F8Y.LJII(textStickerModel3) ? "AI_CAPTION" : "TEXT_STICKER");
                                nLETrackSlot4.setExtra("is_editorpro_text", textStickerModel3.getSourceType() == C0F7S.EDITOR_PRO ? "1" : CardStruct.IStatusCode.DEFAULT);
                                nLETrackSlot4.setExtra("bg_mode", String.valueOf(textStickerModel3.getMode()));
                                nLETrackSlot4.setExtra("align", String.valueOf(textStickerModel3.getAlign()));
                                nLETrackSlot4.setExtra("color", String.valueOf(textStickerModel3.getColor()));
                                nLETrackSlot4.setExtra("lineSpacingExtra", String.valueOf(textStickerModel3.getLineSpacingExtra()));
                                nLETrackSlot4.setExtra("font_size", String.valueOf(textStickerModel3.getFontModel().fontSize));
                                nLETrackSlot4.setExtra("font_type", textStickerModel3.getFontModel().fileName);
                                nLETrackSlot4.setExtra("text", textStickerModel3.getTextStr());
                                C0EKO.LIZ.getClass();
                                C0EKO.LIZIZ(nLETrackSlot4, textStickerModel3);
                                nLETrackSlot4.setExtra("text_wrap_list", C363430EMr.LJ(C123P.LIZLLL(textStickerModel3.getTextStrWithLineBreak())));
                                TTSModel ttsModel = textStickerModel3.getTtsModel();
                                nLETrackSlot4.setExtra("is_meme_audio", (ttsModel == null || (map = ttsModel.ttsExtraMap) == null) ? null : map.get("is_meme_audio"));
                                nLETrackSlot4.setExtra("is_ai_meme", C0F7U.LIZJ(textStickerModel3).isAICaption() ? "1" : CardStruct.IStatusCode.DEFAULT);
                                nLETrackSlot4.setExtra("text_sticker_data", C363430EMr.LIZLLL(C0F7U.LIZJ(textStickerModel3)));
                                NLESegmentSticker nLESegmentStickerDynamicCast = NLESegmentSticker.dynamicCast(nLETrackSlot4.getMainSegment());
                                if (nLESegmentStickerDynamicCast != null && nLESegmentStickerDynamicCast.getAnimation() != null) {
                                    TextMotionModel textMotionModel = textStickerModel3.getTextMotionModel();
                                    nLETrackSlot4.setExtra("motion_id", textMotionModel.motionId);
                                    nLETrackSlot4.setExtra("motion_res_id", textMotionModel.motionResId);
                                    nLETrackSlot4.setExtra("animation_type", String.valueOf(textMotionModel.motionType));
                                    nLETrackSlot4.setExtra("animation_duration", String.valueOf(textMotionModel.motionDuration));
                                    nLETrackSlot4.setExtra("motion_enabled_on_last_use", textMotionModel.lastMotionEnabledState ? "1" : CardStruct.IStatusCode.DEFAULT);
                                }
                                nLETrackSlot4.setExtra("ep_slot_add_order", String.valueOf(C351220Dpo.LJLJLLL(nLEModelLJI)));
                                TTSModel ttsModel2 = textStickerModel3.getTtsModel();
                                if (TextUtils.isEmpty(ttsModel2 != null ? ttsModel2.nleUuid : null)) {
                                    nLETrackSlot4.removeExtraWithKey("text_tts_id");
                                    nLETrackSlot4.removeExtraWithKey("ep_text_tts_content");
                                    nLETrackSlot4.removeExtraWithKey("text_tts_duration");
                                    nLETrackSlot4.removeExtraWithKey("tts_audio_path");
                                    nLETrackSlot4.removeExtraWithKey("ep_text_tts_speaker_id");
                                } else {
                                    TTSModel ttsModel3 = textStickerModel3.getTtsModel();
                                    nLETrackSlot4.setExtra("text_tts_id", ttsModel3 != null ? ttsModel3.nleUuid : null);
                                    TTSModel ttsModel4 = textStickerModel3.getTtsModel();
                                    String str4 = "";
                                    if (ttsModel4 == null || (str = ttsModel4.audioText) == null) {
                                        str = "";
                                    }
                                    nLETrackSlot4.setExtra("ep_text_tts_content", str);
                                    TTSModel ttsModel5 = textStickerModel3.getTtsModel();
                                    nLETrackSlot4.setExtra("text_tts_duration", String.valueOf(ttsModel5 != null ? Integer.valueOf(ttsModel5.audioTrackDuration) : null));
                                    TTSModel ttsModel6 = textStickerModel3.getTtsModel();
                                    if (ttsModel6 == null || (str2 = ttsModel6.audioTrackFilePath) == null) {
                                        str2 = "";
                                    }
                                    nLETrackSlot4.setExtra("tts_audio_path", str2);
                                    TTSModel ttsModel7 = textStickerModel3.getTtsModel();
                                    if (ttsModel7 != null && (str3 = ttsModel7.speakerID) != null) {
                                        str4 = str3;
                                    }
                                    nLETrackSlot4.setExtra("ep_text_tts_speaker_id", str4);
                                }
                                if (!textStickerModel3.isVERenderSticker()) {
                                    if (nLETrackSlot4.getMainSegment() == null) {
                                        nLETrackSlot4.setMainSegment(new NLESegmentTextSticker());
                                    } else {
                                        NLENode nLENodeDeepCloneWithUUID = new NLESegmentTextSticker().deepCloneWithUUID(nLETrackSlot4.getMainSegment().getUUID());
                                        if (nLENodeDeepCloneWithUUID != null) {
                                            NLESegmentTextSticker nLESegmentTextStickerDynamicCast = NLESegmentTextSticker.dynamicCast(nLENodeDeepCloneWithUUID);
                                            if (nLESegmentTextStickerDynamicCast != null) {
                                                nLESegmentTextStickerDynamicCast.setAlpha(textStickerModel3.getBaseStickerModel().getAlpha());
                                            } else {
                                                nLESegmentTextStickerDynamicCast = null;
                                            }
                                            nLETrackSlot4.setMainSegment(nLESegmentTextStickerDynamicCast);
                                        }
                                    }
                                    nLETrackSlot4.setStartTime(((long) textStickerModel3.getBaseStickerModel().getStartTime()) * 1000);
                                    nLETrackSlot4.setEndTime(Math.min(maxTargetEnd, ((long) textStickerModel3.getBaseStickerModel().getEndTime()) * 1000));
                                    if (textStickerModel3.getBaseStickerModel().getEndTime() > 0.0f) {
                                        textStickerModel3.getBaseStickerModel().setEndTime(nLETrackSlot4.getEndTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                                    }
                                    nLETrackSlot4.setTransformX(textStickerModel3.getBaseStickerModel().getTranslateX());
                                    nLETrackSlot4.setTransformY(textStickerModel3.getBaseStickerModel().getTranslateY());
                                    nLETrackSlot4.setScale(textStickerModel3.getBaseStickerModel().getScale());
                                    nLETrackSlot4.setRotation(textStickerModel3.getBaseStickerModel().getRotation());
                                }
                            } else if (!zIsRestoreData) {
                                nLETrack2.removeSlot(nLETrackSlot4);
                                if (nLETrack2.getSlots().isEmpty()) {
                                    nLEModelLJI.removeTrack(nLETrack2);
                                }
                            }
                        }
                        i2 = i3;
                    }
                    C0EKO.LIZJ(nLEModelLJI);
                    if (nLEModelLJI.hasExtra("is_apply_to_all")) {
                        boolean z3 = Boolean.parseBoolean(nLEModelLJI.getExtra("is_apply_to_all"));
                        if (z3 != new C0EKG().LIZ()) {
                            new C0EKG().LIZIZ(z3);
                        }
                    } else {
                        nLEModelLJI.setExtra("is_apply_to_all", String.valueOf(new C0EKG().LIZ()));
                    }
                    if (C376950EqD.LIZ(videoPublishEditModelLIZIZ)) {
                        int i4 = 0;
                        for (Object obj4 : (ArrayList) C349560Dn8.LJ(nLEModelLJI)) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                            NLETrack nLETrack3 = (NLETrack) obj4;
                            if (nLETrack3.getLayer() != 0) {
                                int i6 = 0;
                                for (NLETrackSlot nLETrackSlot5 : nLETrack3.getSortedSlots()) {
                                    int i7 = i6 + 1;
                                    if (i6 < 0) {
                                        C1697810uHb.LJIJI();
                                        throw null;
                                    }
                                    NLETrackSlot nLETrackSlot6 = nLETrackSlot5;
                                    ArrayList arrayList6 = new ArrayList();
                                    VecNLETrackSPtr tracks2 = nLEModelLJI.getTracks();
                                    ArrayList arrayList7 = new ArrayList();
                                    for (NLETrack nLETrack4 : tracks2) {
                                        NLETrack nLETrack5 = nLETrack4;
                                        if (C351220Dpo.LLLJL(nLETrack5) && (nLETrack5.getLayer() != 0 || (((slots = nLETrack5.getSlots()) != null && slots.size() == 0) || (slots2 = nLETrack5.getSlots()) == null || (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, slots2)) == null || !C349550Dn7.LJFF(nLETrackSlot)))) {
                                            if (nLETrack5.getLayer() < nLETrack3.getLayer()) {
                                                arrayList7.add(nLETrack4);
                                            }
                                        }
                                    }
                                    arrayList6.addAll(arrayList7);
                                    C351510DqH c351510DqH = C351510DqH.LIZ;
                                    Pair pair = new Pair(Long.valueOf(nLETrackSlot6.getStartTime()), Long.valueOf(nLETrackSlot6.getEndTime()));
                                    c351510DqH.getClass();
                                    NLETrack nLETrackLJIILL = C351510DqH.LJIILL(pair, arrayList6);
                                    if (nLETrackLJIILL != null) {
                                        nLETrack3.removeSlot(nLETrackSlot6);
                                        nLETrackLJIILL.addSlot(nLETrackSlot6);
                                    }
                                    i6 = i7;
                                }
                            }
                            i4 = i5;
                        }
                        C351510DqH c351510DqH2 = C351510DqH.LIZ;
                        NLETrackType nLETrackType = NLETrackType.STICKER;
                        c351510DqH2.getClass();
                        C351510DqH.LJIIJJI(nLEModelLJI, nLETrackType, "TEXT");
                    }
                }
            }
            VideoPublishEditModel videoPublishEditModelLIZIZ2 = LIZIZ();
            NLEModel nLEModelLJI2 = C350870DpF.LJI(c0e48LIZ);
            if (videoPublishEditModelLIZIZ2 != null && (creativeModel = videoPublishEditModelLIZIZ2.creativeModel) != null && (infoStickerModel = creativeModel.infoStickerModel) != null && (list = infoStickerModel.stickers) != null) {
                ArrayList arrayList8 = new ArrayList(list);
                List<NLETrack> listLJJJLL = C351220Dpo.LJJJLL(nLEModelLJI2);
                ArrayList arrayList9 = new ArrayList();
                for (Object obj5 : (ArrayList) listLJJJLL) {
                    if (((NLETrack) obj5).getSlots().isEmpty()) {
                        arrayList9.add(obj5);
                    }
                }
                Iterator it9 = arrayList9.iterator();
                while (it9.hasNext()) {
                    nLEModelLJI2.removeTrack((NLETrack) it9.next());
                }
                VecNLETrackSPtr tracks3 = nLEModelLJI2.getTracks();
                ArrayList<NLETrack> arrayList10 = new ArrayList();
                for (NLETrack nLETrack6 : tracks3) {
                    if (C351220Dpo.LLJLILLLLZIIL(nLETrack6)) {
                        arrayList10.add(nLETrack6);
                    }
                }
                for (NLETrack nLETrack7 : arrayList10) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (NLETrackSlot nLETrackSlot7 : nLETrack7.getSlots()) {
                        Integer numValueOf = Integer.valueOf(nLETrackSlot7.getLayer());
                        Object arrayList11 = linkedHashMap.get(numValueOf);
                        if (arrayList11 == null) {
                            arrayList11 = new ArrayList();
                            linkedHashMap.put(numValueOf, arrayList11);
                        }
                        C1717206ny.LIZ(nLETrackSlot7, (List) arrayList11);
                    }
                    for (List<NLETrackSlot> list5 : C13LP.LJJJJIZL(linkedHashMap.values(), 1)) {
                        NLETrack nLETrack8 = new NLETrack();
                        nLEModelLJI2.addTrack(nLETrack8);
                        C351220Dpo.LLLLJI(nLETrack8);
                        nLETrack8.setExtra("track_type", "sticker");
                        nLETrack8.setExtra("StickerTrackType", "INFO");
                        nLETrack8.setExtraTrackType(NLETrackType.STICKER);
                        for (NLETrackSlot nLETrackSlot8 : list5) {
                            nLETrack7.removeSlot(nLETrackSlot8);
                            nLETrack8.addSlot(nLETrackSlot8);
                        }
                    }
                }
                final boolean zLIZLLL = C351420Dq8.LIZLLL(nLEModelLJI2);
                int i8 = 0;
                for (Object obj6 : C13LP.LJLLLL(new Comparator() { // from class: X.0DlR
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        int layer;
                        NLETrack nLETrack9 = (NLETrack) t;
                        int layer2 = 0;
                        if (zLIZLLL) {
                            layer = nLETrack9.getLayer();
                        } else {
                            NLETimeSpaceNode nLETimeSpaceNode2 = (NLETimeSpaceNode) C13LP.LJJJLZIJ(0, nLETrack9.getSlots());
                            if (nLETimeSpaceNode2 != null) {
                                layer = nLETimeSpaceNode2.getLayer();
                            } else {
                                layer = 0;
                            }
                        }
                        Integer numValueOf2 = Integer.valueOf(layer);
                        NLETrack nLETrack10 = (NLETrack) t2;
                        if (zLIZLLL) {
                            layer2 = nLETrack10.getLayer();
                        } else {
                            NLETimeSpaceNode nLETimeSpaceNode3 = (NLETimeSpaceNode) C13LP.LJJJLZIJ(0, nLETrack10.getSlots());
                            if (nLETimeSpaceNode3 != null) {
                                layer2 = nLETimeSpaceNode3.getLayer();
                            }
                        }
                        return C20085613iQ.LIZIZ(numValueOf2, Integer.valueOf(layer2));
                    }
                }, C351220Dpo.LJJJLL(nLEModelLJI2))) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                    NLETrack nLETrack9 = (NLETrack) obj6;
                    nLETrack9.setLayer(i8);
                    for (NLETrackSlot nLETrackSlot9 : nLETrack9.getSlots()) {
                        Iterator it10 = arrayList8.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                next = it10.next();
                                if (Intrinsics.LJFF(((StickerItemModel) next).uuid, nLETrackSlot9.getUUID())) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        StickerItemModel stickerItemModel = (StickerItemModel) next;
                        if (stickerItemModel != null) {
                            if (zLIZLLL) {
                                z = true;
                            } else {
                                z = true;
                                nLETrackSlot9.setLayer(nLETrack9.getLayer() + 1);
                            }
                            nLETrack9.setEnable(z);
                            if (stickerItemModel.endTime != ((int) (nLETrackSlot9.getEndTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT))) && (i = stickerItemModel.endTime) > 0) {
                                nLETrackSlot9.setEndTime(((long) i) * 1000);
                            }
                            nLETrackSlot9.setExtra("ep_slot_add_order", String.valueOf(C351220Dpo.LJJJJZ(nLEModelLJI2)));
                        }
                    }
                    i8 = i9;
                }
            }
        }
        C0EOK c0eokH5 = this.LIZ.H5();
        if (c0eokH5 != null) {
            FrameLayout frameLayout = (FrameLayout) this.LIZ.LLILZ.requireViewById(R.id.w60);
            VideoPublishEditModel videoPublishEditModelLIZIZ3 = LIZIZ();
            c0eokH5.ch1(c360770EClWq, frameLayout, videoPublishEditModelLIZIZ3 != null ? videoPublishEditModelLIZIZ3.getCreativeInfo() : null, this.LIZ.C5(), value.LJ.isRestoreData());
        }
        C0EJ3 c0ej3M5 = this.LIZ.M5();
        if (c0ej3M5 != null) {
            c0ej3M5.Kx2(c0elj.getInlineCaptionCaches(), c0elj.isRestoreData());
        }
        VideoPublishEditModel videoPublishEditModelLIZIZ4 = LIZIZ();
        C0E48 c0e48LIZ2 = LIZ();
        if (C0EKP.LIZIZ(videoPublishEditModelLIZIZ4, c0e48LIZ2 != null ? C350870DpF.LJI(c0e48LIZ2) : null) && (interfaceC363820EOeP4 = this.LIZ.P4()) != null) {
            interfaceC363820EOeP4.N(c0elj.isRestoreData());
        }
        C0EHC c0ehcK5 = this.LIZ.k5();
        if (c0ehcK5 != null) {
            c0ehcK5.nD1();
        }
        int visibility = c360770EClWq.getVisibility();
        c360770EClWq.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c360770EClWq);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            r5 = this;
            X.0EGB r0 = r5.LIZ
            X.0EY2 r0 = r0.o4()
            androidx.lifecycle.LiveData r0 = r0.zu2()
            java.lang.Object r0 = r0.getValue()
            X.0EHI r0 = (X.C0EHI) r0
            if (r0 == 0) goto L4d
            X.0ELJ r0 = r0.LJ
            if (r0 == 0) goto L4d
            boolean r0 = r0.getEffectMultiTrackMode()
            r4 = 1
            if (r0 != r4) goto L4d
        L1d:
            X.0EGB r3 = r5.LIZ
            X.0Dwp r0 = r3.LLIZLLLIL
            if (r0 != 0) goto L44
            X.0Dwp r2 = new X.0Dwp
            X.19GS r1 = r3.L7()
            X.0E48 r0 = r5.LIZ()
            r2.<init>(r1, r0, r4)
            r3.LLIZLLLIL = r2
            X.0EGB r0 = r5.LIZ
            X.0Dwp r1 = r0.LLIZLLLIL
            if (r1 == 0) goto L44
            X.0E1T r0 = com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider.Companion
            r0.getClass()
            com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider r0 = X.C0E1T.LIZ()
            r0.setVideoGlobalEffectController$tools_camera_edit_release(r1)
        L44:
            X.0EGB r0 = r5.LIZ
            X.0Dwp r0 = r0.LLIZLLLIL
            if (r0 == 0) goto L4c
            r0.LIZJ = r4
        L4c:
            return
        L4d:
            r4 = 0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EK4.LIZLLL():void");
    }

    public final void LJI() {
        C0EL0 c0el0;
        C0EGC c0egc;
        C0EHI value = this.LIZ.o4().zu2().getValue();
        if (value != null && (c0el0 = value.LIZLLL) != null && (c0egc = this.LIZ.LLJI) != null) {
            c0egc.f1(c0el0);
        }
        C0EGC c0egc2 = this.LIZ.LLJI;
        if (c0egc2 != null) {
            c0egc2.U0();
        }
    }

    public C0EK4(C0EGB c0egb) {
        this.LIZ = c0egb;
    }

    public final void LJFF(InterfaceC2257101DWa interfaceC2257101DWa) {
        C0EGE c0ege = this.LIZ.LLILZ.LLLILZ;
        if (c0ege != null && c0ege.LJII.getVisibility() == 0) {
            C786410Ut5.LLZZLLIL(c0ege.LJI, 0);
            C786410Ut5.LLLLZLL(c0ege.LJFF, 0);
            c0ege.LJFF.setText(interfaceC2257101DWa.getNickname());
            C1324750kZt.LJI(c0ege.LJI, interfaceC2257101DWa.getAvatarThumb(), -1, -1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0EGP] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJ(C0EC6 c0ec6, boolean z) {
        C1403470mcr.LJI(LIZIZ(), true, "ai_panel", c0ec6, Boolean.valueOf(z));
        if (C311350CIj.LIZ()) {
            C0EGB c0egb = this.LIZ;
            C0EGC c0egc = c0egb.LLJI;
            if (c0egc != null) {
                C1465100oEG c1465100oEG = c0egb.LLLIIIIL;
                if (c1465100oEG == null) {
                    c0egb.LLLIIIIL = new C1465100oEG(c0egb.LLILZ, c0egc, LIZ(), c0ec6);
                    C1465100oEG c1465100oEG2 = this.LIZ.LLLIIIIL;
                    if (c1465100oEG2 != null) {
                        c1465100oEG2.LIZ(z);
                        return;
                    }
                    return;
                }
                c1465100oEG.LIZ(z);
                return;
            }
            return;
        }
        C0EGC c0egc2 = this.LIZ.LLJI;
        if (c0egc2 != 0) {
            c0egc2.Z0(new Object() { // from class: X.0EGP
            }, c0ec6, null, z, null);
        }
    }
}
