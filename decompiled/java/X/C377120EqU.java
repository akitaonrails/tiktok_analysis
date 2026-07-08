package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundMobService;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParamType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationSubType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModelStatus;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel;
import com.ss.ugc.android.editor.core.vm.BaseViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EqU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377120EqU {
    public static final C377120EqU LIZ = new C377120EqU();

    public static String LIZLLL(C0E48 c0e48) {
        List<String> list;
        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        BaseViewModel baseViewModel = (BaseViewModel) C364210EPr.LIZLLL(AsyncTasksPanelViewModel.class);
        if (c0e48 != null && baseViewModel != null) {
            baseViewModel.editorContext = c0e48;
        }
        AsyncTasksPanelViewModel asyncTasksPanelViewModel = (AsyncTasksPanelViewModel) baseViewModel;
        if (asyncTasksPanelViewModel != null && (list = asyncTasksPanelViewModel.LL) != null && !list.isEmpty()) {
            return C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
        }
        return "";
    }

    public static C0LAB LIZJ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48) {
        NLEModel nLEModelLJI;
        C0E55 player;
        Long lValueOf = null;
        if (c0e48 != null) {
            nLEModelLJI = C350870DpF.LJI(c0e48);
        } else {
            nLEModelLJI = null;
        }
        int i = 0;
        Pair<Integer, Integer> pairLJJII = u4.LJJII(nLEModelLJI, false);
        int iIntValue = pairLJJII.getFirst().intValue();
        int iIntValue2 = pairLJJII.getSecond().intValue();
        if (c0e48 != null && (player = c0e48.getPlayer()) != null) {
            lValueOf = Long.valueOf(player.qq());
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", videoPublishEditModel.getEnterFrom());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("is_editor_pro", "1");
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LIZLLL(lValueOf, "creation_duration");
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LIZ(videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate ? 1 : 0, "is_from_create_template");
        c0lab.LJ("music_selected_from", videoPublishEditModel.getMusicOriginWithCheck());
        if (iIntValue + iIntValue2 > 1) {
            i = 1;
        }
        c0lab.LIZ(i, "is_multi_content");
        c0lab.LIZ(iIntValue, "video_cnt");
        c0lab.LIZ(iIntValue2, "pic_cnt");
        c0lab.LIZ(videoPublishEditModel.getEditorProModel().getFromPhotoCanvas() ? 1 : 0, "is_from_photo_canvas");
        c0lab.LIZ(u4.LJJIL(videoPublishEditModel) ? 1 : 0, "is_from_edit_tab");
        if (videoPublishEditModel.mDraftToEditFrom == 0) {
            c0lab.LJ("draft_way", "general_draft_list");
            return c0lab;
        }
        c0lab.LJ("draft_way", "");
        return c0lab;
    }

    public static void LIZ(NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel, C1403560md0 c1403560md0) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZIZ(nLEModel, videoPublishEditModel, linkedHashMap);
        c1403560md0.LJI(linkedHashMap);
    }

    public static void LIZIZ(NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel, Map map) {
        Object obj;
        boolean z;
        String str;
        String strLJJLIIIJ;
        Object obj2;
        String strLJJLIIIJ2;
        String strLJJLIIIJ3;
        String strLJJLIIIJ4;
        Object obj3;
        Object obj4;
        int size;
        String str2;
        boolean zLJ = C377130EqV.LJ(nLEModel);
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (zLJ) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_editorpro_ai_create", obj);
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().getSlots(), arrayList);
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (it3.hasNext()) {
                String strLIZIZ = C377740ErU.LIZIZ((NLETrackSlot) it3.next());
                if (strLIZIZ != null && strLIZIZ.length() > 0 && C377130EqV.LIZJ(videoPublishEditModel, strLIZIZ)) {
                    C377150EqX c377150EqX = C377150EqX.LIZ;
                    if (!C377150EqX.LIZLLL(videoPublishEditModel, strLIZIZ, AIGCGenerationParamType.T2I_TYPE, Collections.singletonList(EditorProAIGCMediaItemModelStatus.COMPLETE)).isEmpty()) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
        }
        VecNLETrackSPtr tracks2 = nLEModel.getTracks();
        ArrayList arrayList2 = new ArrayList();
        Iterator<NLETrack> it4 = tracks2.iterator();
        while (it4.hasNext()) {
            C19719612Di.LJJI(it4.next().getSlots(), arrayList2);
        }
        Iterator it5 = arrayList2.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it5.hasNext()) {
            String strLIZIZ2 = C377740ErU.LIZIZ((NLETrackSlot) it5.next());
            if (strLIZIZ2 != null) {
                if (!z2) {
                    C377150EqX c377150EqX2 = C377150EqX.LIZ;
                    if (C377150EqX.LJIIJJI(videoPublishEditModel, strLIZIZ2, AIGCGenerationParamType.T2I_TYPE, Collections.singletonList(EditorProAIGCMediaItemModelStatus.COMPLETE)) != null) {
                        z2 = true;
                    }
                }
                if (!z3 && C377130EqV.LIZJ(videoPublishEditModel, strLIZIZ2)) {
                    z3 = true;
                }
            }
        }
        String strLJJLIIIJ5 = "";
        if ((!z2 || !z3) && !z) {
            if (z2) {
                str = "ai_image";
            } else if (!z3) {
                str = "";
            } else {
                str = "ai_video";
            }
        } else {
            str = "ai_image_and_ai_video";
        }
        map.put("ai_create_content_type", str);
        List listLIZ = C377130EqV.LIZ(nLEModel, videoPublishEditModel, AIGCGenerationParamType.T2I_TYPE);
        ArrayList arrayList3 = (ArrayList) listLIZ;
        if (!(!arrayList3.isEmpty())) {
            strLJJLIIIJ = "";
        } else {
            strLJJLIIIJ = C13LP.LJJLIIIJ(listLIZ, ",", null, null, 0, null, null, 62);
        }
        map.put("ai_create_image_num", String.valueOf(arrayList3.size()));
        map.put("ai_create_image_id", strLJJLIIIJ);
        List<NLETrack> listLJJLIIIJLJLI = C351220Dpo.LJJLIIIJLJLI(nLEModel);
        ArrayList arrayList4 = new ArrayList();
        Iterator<NLETrack> it6 = listLJJLIIIJLJLI.iterator();
        while (it6.hasNext()) {
            C19719612Di.LJJI(it6.next().getSlots(), arrayList4);
        }
        if (!arrayList4.isEmpty()) {
            Iterator it7 = arrayList4.iterator();
            while (it7.hasNext()) {
                if (C0E5J.LIZ((NLETrackSlot) it7.next())) {
                    obj2 = "1";
                    break;
                }
            }
            obj2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_editorpro_pip_ai_create", obj2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        VecNLETrackSPtr tracks3 = nLEModel.getTracks();
        ArrayList arrayList5 = new ArrayList();
        Iterator<NLETrack> it8 = tracks3.iterator();
        while (it8.hasNext()) {
            C19719612Di.LJJI(it8.next().getSortedSlots(), arrayList5);
        }
        Iterator it9 = arrayList5.iterator();
        while (it9.hasNext()) {
            String strLIZIZ3 = C377740ErU.LIZIZ((NLETrackSlot) it9.next());
            if (strLIZIZ3 != null && strLIZIZ3.length() > 0) {
                C377150EqX c377150EqX3 = C377150EqX.LIZ;
                EditorProAIGCMediaItemModel editorProAIGCMediaItemModelLJIIJJI = C377150EqX.LJIIJJI(videoPublishEditModel, strLIZIZ3, null, Collections.singletonList(EditorProAIGCMediaItemModelStatus.COMPLETE));
                if (editorProAIGCMediaItemModelLJIIJJI != null && editorProAIGCMediaItemModelLJIIJJI.algoRequestKey.length() > 0) {
                    linkedHashSet.add(editorProAIGCMediaItemModelLJIIJJI.algoRequestKey);
                }
            }
        }
        List listLLIIII = C13LP.LLIIII(linkedHashSet);
        if (!(!listLLIIII.isEmpty())) {
            strLJJLIIIJ2 = "";
        } else {
            strLJJLIIIJ2 = C13LP.LJJLIIIJ(listLLIIII, ",", null, null, 0, null, null, 62);
        }
        map.put("ai_create_req_key", strLJJLIIIJ2);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        VecNLETrackSPtr tracks4 = nLEModel.getTracks();
        ArrayList arrayList6 = new ArrayList();
        Iterator<NLETrack> it10 = tracks4.iterator();
        while (it10.hasNext()) {
            C19719612Di.LJJI(it10.next().getSortedSlots(), arrayList6);
        }
        Iterator it11 = arrayList6.iterator();
        while (it11.hasNext()) {
            String strLIZIZ4 = C377740ErU.LIZIZ((NLETrackSlot) it11.next());
            if (strLIZIZ4 != null && strLIZIZ4.length() > 0) {
                C377150EqX c377150EqX4 = C377150EqX.LIZ;
                EditorProAIGCMediaItemModel editorProAIGCMediaItemModelLJIIJJI2 = C377150EqX.LJIIJJI(videoPublishEditModel, strLIZIZ4, null, Collections.singletonList(EditorProAIGCMediaItemModelStatus.COMPLETE));
                if (editorProAIGCMediaItemModelLJIIJJI2 != null) {
                    switch (C377140EqW.LIZ[editorProAIGCMediaItemModelLJIIJJI2.param.mediaType.ordinal()]) {
                        case 1:
                            if (editorProAIGCMediaItemModelLJIIJJI2.param.subGenerateType == AIGCGenerationSubType.AI_TRANSITION) {
                                str2 = "ai_transition";
                            } else {
                                str2 = "fl2video";
                            }
                            break;
                        case 2:
                            str2 = "image2video";
                            break;
                        case 3:
                            str2 = "text2video";
                            break;
                        case 4:
                            str2 = "image2image";
                            break;
                        case 5:
                            str2 = "text2image";
                            break;
                        case 6:
                            str2 = "video2video";
                            break;
                        default:
                            str2 = "";
                            break;
                    }
                    linkedHashSet2.add(str2);
                }
            }
        }
        List listLLIIII2 = C13LP.LLIIII(linkedHashSet2);
        if (!(!listLLIIII2.isEmpty())) {
            strLJJLIIIJ3 = "";
        } else {
            strLJJLIIIJ3 = C13LP.LJJLIIIJ(listLLIIII2, ",", null, null, 0, null, null, 62);
        }
        map.put("ai_create_task_type", strLJJLIIIJ3);
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        VecNLETrackSPtr tracks5 = nLEModel.getTracks();
        ArrayList arrayList7 = new ArrayList();
        Iterator<NLETrack> it12 = tracks5.iterator();
        while (it12.hasNext()) {
            C19719612Di.LJJI(it12.next().getSortedSlots(), arrayList7);
        }
        Iterator it13 = arrayList7.iterator();
        while (it13.hasNext()) {
            String strLIZIZ5 = C377740ErU.LIZIZ((NLETrackSlot) it13.next());
            if (strLIZIZ5 != null && strLIZIZ5.length() > 0) {
                C377150EqX c377150EqX5 = C377150EqX.LIZ;
                EditorProAIGCMediaItemModel editorProAIGCMediaItemModelLJIIJJI3 = C377150EqX.LJIIJJI(videoPublishEditModel, strLIZIZ5, null, Collections.singletonList(EditorProAIGCMediaItemModelStatus.COMPLETE));
                if (editorProAIGCMediaItemModelLJIIJJI3 != null && !C377130EqV.LIZLLL(editorProAIGCMediaItemModelLJIIJJI3)) {
                    linkedHashSet3.add(editorProAIGCMediaItemModelLJIIJJI3.param.modelName);
                }
            }
        }
        List listLLIIII3 = C13LP.LLIIII(linkedHashSet3);
        ArrayList arrayList8 = new ArrayList();
        for (Object obj5 : listLLIIII3) {
            if (((String) obj5).length() > 0) {
                arrayList8.add(obj5);
            }
        }
        if (!arrayList8.isEmpty()) {
            map.put("ai_create_model", C13LP.LJJLIIIJ(arrayList8, ",", null, null, 0, null, null, 62));
        }
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        VecNLETrackSPtr tracks6 = nLEModel.getTracks();
        ArrayList arrayList9 = new ArrayList();
        Iterator<NLETrack> it14 = tracks6.iterator();
        while (it14.hasNext()) {
            C19719612Di.LJJI(it14.next().getSortedSlots(), arrayList9);
        }
        Iterator it15 = arrayList9.iterator();
        while (it15.hasNext()) {
            String strLIZIZ6 = C377740ErU.LIZIZ((NLETrackSlot) it15.next());
            if (strLIZIZ6 != null && strLIZIZ6.length() > 0) {
                C377150EqX c377150EqX6 = C377150EqX.LIZ;
                EditorProAIGCMediaItemModel editorProAIGCMediaItemModelLJIIJJI4 = C377150EqX.LJIIJJI(videoPublishEditModel, strLIZIZ6, null, Collections.singletonList(EditorProAIGCMediaItemModelStatus.COMPLETE));
                if (editorProAIGCMediaItemModelLJIIJJI4 != null && !C377130EqV.LIZLLL(editorProAIGCMediaItemModelLJIIJJI4)) {
                    linkedHashSet4.add(editorProAIGCMediaItemModelLJIIJJI4.param.rewriteType);
                }
            }
        }
        List listLLIIII4 = C13LP.LLIIII(linkedHashSet4);
        ArrayList arrayList10 = new ArrayList();
        for (Object obj6 : listLLIIII4) {
            if (((String) obj6).length() > 0) {
                arrayList10.add(obj6);
            }
        }
        if (!arrayList10.isEmpty()) {
            map.put("ai_create_rewrite_prompt", C13LP.LJJLIIIJ(arrayList10, ",", null, null, 0, null, null, 62));
        }
        ArrayList arrayList11 = new ArrayList();
        VecNLETrackSPtr tracks7 = nLEModel.getTracks();
        ArrayList arrayList12 = new ArrayList();
        Iterator<NLETrack> it16 = tracks7.iterator();
        while (it16.hasNext()) {
            C19719612Di.LJJI(it16.next().getSlots(), arrayList12);
        }
        Iterator it17 = arrayList12.iterator();
        while (it17.hasNext()) {
            String strLIZIZ7 = C377740ErU.LIZIZ((NLETrackSlot) it17.next());
            if (strLIZIZ7 != null && strLIZIZ7.length() > 0) {
                C377150EqX c377150EqX7 = C377150EqX.LIZ;
                EditorProAIGCMediaItemModel editorProAIGCMediaItemModelLJIIJJI5 = C377150EqX.LJIIJJI(videoPublishEditModel, strLIZIZ7, null, Collections.singletonList(EditorProAIGCMediaItemModelStatus.COMPLETE));
                if (editorProAIGCMediaItemModelLJIIJJI5 != null) {
                    if (!editorProAIGCMediaItemModelLJIIJJI5.param.imagePathList.isEmpty()) {
                        size = editorProAIGCMediaItemModelLJIIJJI5.param.imagePathList.size();
                    } else if (editorProAIGCMediaItemModelLJIIJJI5.param.imagePath.length() > 0) {
                        size = 1;
                    } else {
                        size = 0;
                    }
                    arrayList11.add(String.valueOf(size));
                }
            }
        }
        if (!(!arrayList11.isEmpty())) {
            strLJJLIIIJ4 = "";
        } else {
            strLJJLIIIJ4 = C13LP.LJJLIIIJ(arrayList11, ",", null, null, 0, null, null, 62);
        }
        map.put("ai_create_ref_image_num", strLJJLIIIJ4);
        List listLIZIZ = C377130EqV.LIZIZ(videoPublishEditModel, nLEModel);
        boolean z4 = !listLIZIZ.isEmpty();
        if (z4) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_editorpro_ai_create_transition", obj3);
        if (z4) {
            map.put("is_editorpro_transition", "1");
            Collection collectionLJIIIIZZ = C357540E0a.LJIIIIZZ(nLEModel);
            if (collectionLJIIIIZZ == null) {
                collectionLJIIIIZZ = C13BV.INSTANCE;
            }
            map.put("transition_list", C13LP.LJJLIIIJ(C13LP.LJLIL(listLIZIZ, collectionLJIIIIZZ), ",", null, null, 0, null, null, 62));
        }
        List listLIZ2 = C377130EqV.LIZ(nLEModel, videoPublishEditModel, AIGCGenerationParamType.T2V_TYPE);
        ArrayList arrayList13 = (ArrayList) listLIZ2;
        if (!arrayList13.isEmpty()) {
            strLJJLIIIJ5 = C13LP.LJJLIIIJ(listLIZ2, ",", null, null, 0, null, null, 62);
        }
        map.put("ai_create_video_num", String.valueOf(arrayList13.size()));
        map.put("ai_create_video_id", strLJJLIIIJ5);
        VecNLETrackSPtr tracks8 = nLEModel.getTracks();
        ArrayList arrayList14 = new ArrayList();
        Iterator<NLETrack> it18 = tracks8.iterator();
        while (it18.hasNext()) {
            C19719612Di.LJJI(it18.next().getSlots(), arrayList14);
        }
        Iterator it19 = arrayList14.iterator();
        while (true) {
            if (it19.hasNext()) {
                String strLIZIZ8 = C377740ErU.LIZIZ((NLETrackSlot) it19.next());
                if (strLIZIZ8 != null && strLIZIZ8.length() > 0) {
                    C377150EqX c377150EqX8 = C377150EqX.LIZ;
                    if (C377150EqX.LJIIJJI(videoPublishEditModel, strLIZIZ8, AIGCGenerationParamType.T2V_TYPE, Collections.singletonList(EditorProAIGCMediaItemModelStatus.COMPLETE)) != null) {
                        obj4 = "1";
                    }
                }
            } else {
                obj4 = CardStruct.IStatusCode.DEFAULT;
            }
        }
        map.put("is_ai_create_t2v_content", obj4);
        VecNLETrackSPtr tracks9 = nLEModel.getTracks();
        ArrayList arrayList15 = new ArrayList();
        Iterator<NLETrack> it20 = tracks9.iterator();
        while (it20.hasNext()) {
            C19719612Di.LJJI(it20.next().getSlots(), arrayList15);
        }
        Iterator it21 = arrayList15.iterator();
        while (it21.hasNext()) {
            String strLIZIZ9 = C377740ErU.LIZIZ((NLETrackSlot) it21.next());
            if (strLIZIZ9 != null && strLIZIZ9.length() > 0) {
                C377150EqX c377150EqX9 = C377150EqX.LIZ;
                AIGCGenerationParamType aIGCGenerationParamType = AIGCGenerationParamType.I2V_TYPE;
                EditorProAIGCMediaItemModelStatus editorProAIGCMediaItemModelStatus = EditorProAIGCMediaItemModelStatus.COMPLETE;
                EditorProAIGCMediaItemModel editorProAIGCMediaItemModelLJIIJJI6 = C377150EqX.LJIIJJI(videoPublishEditModel, strLIZIZ9, aIGCGenerationParamType, Collections.singletonList(editorProAIGCMediaItemModelStatus));
                EditorProAIGCMediaItemModel editorProAIGCMediaItemModelLJIIJJI7 = C377150EqX.LJIIJJI(videoPublishEditModel, strLIZIZ9, AIGCGenerationParamType.FL2V_TYPE, Collections.singletonList(editorProAIGCMediaItemModelStatus));
                EditorProAIGCMediaItemModel editorProAIGCMediaItemModelLJIIJJI8 = C377150EqX.LJIIJJI(videoPublishEditModel, strLIZIZ9, AIGCGenerationParamType.V2V_TYPE, Collections.singletonList(editorProAIGCMediaItemModelStatus));
                if (editorProAIGCMediaItemModelLJIIJJI6 != null || editorProAIGCMediaItemModelLJIIJJI7 != null || editorProAIGCMediaItemModelLJIIJJI8 != null) {
                    str3 = "1";
                    map.put("is_ai_create_i2v_content", str3);
                }
            }
        }
        map.put("is_ai_create_i2v_content", str3);
    }

    public static void LJ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str) {
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, c0e48);
        c0labLIZJ.LJ("click_button_name", str);
        C20684815ws.LJIILLIIL("ai_create_authorized_popup_click", c0labLIZJ.LIZ);
    }

    public static void LJII(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, EnumC362400EIs enumC362400EIs) {
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, c0e48);
        c0labLIZJ.LJ("action_type", enumC362400EIs.getAction());
        C20684815ws.LJIILLIIL("ai_transition_guidance", c0labLIZJ.LIZ);
    }

    public static void LJIIIIZZ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str) {
        if (videoPublishEditModel == null) {
            return;
        }
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, c0e48);
        c0labLIZJ.LJ("async_function_list", LIZLLL(c0e48));
        c0labLIZJ.LJ("click_button_name", str);
        C20684815ws.LJIILLIIL("apply_magic_popup_click", c0labLIZJ.LIZ);
    }

    public static void LJIILJJIL(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str) {
        String str2;
        if (videoPublishEditModel == null) {
            return;
        }
        int i = videoPublishEditModel.creativeModel.editorProAIGCInfoModel.taskInfoInCreativeModel.uncompletedTasksSize;
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, c0e48);
        c0labLIZJ.LJ("exit_type", str);
        if (i > 0) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLIZJ.LJ("is_ai_create_generating", str2);
        c0labLIZJ.LIZ(i, "ai_create_task_num");
        c0labLIZJ.LJ("async_function_list", LIZLLL(c0e48));
        C20684815ws.LJIILLIIL("exit_editor_pro_popup_show", c0labLIZJ.LIZ);
    }

    public static void LJFF(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str, boolean z) {
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, c0e48);
        c0labLIZJ.LJ("enter_source", str);
        c0labLIZJ.LIZ(z ? 1 : 0, "is_from_pip");
        C20684815ws.LJIILLIIL("ai_create_option_page_show", c0labLIZJ.LIZ);
    }

    public static void LJI(int i, long j, int i2, String str) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(i));
        c0lab.LJ(Scene.SCENE_SERVICE, str);
        c0lab.LIZ(i2, "error_code");
        c0lab.LJ("error_domain", "");
        c0lab.LJ("duration", String.valueOf(j));
        C20684815ws.LJIILLIIL("ai_transition_extract_frames", c0lab.LIZ);
    }

    public static void LJIILL(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str, String str2) {
        String str3;
        if (videoPublishEditModel == null) {
            return;
        }
        int i = videoPublishEditModel.creativeModel.editorProAIGCInfoModel.taskInfoInCreativeModel.uncompletedTasksSize;
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, c0e48);
        c0labLIZJ.LJ("exit_type", str);
        if (i > 0) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLIZJ.LJ("is_ai_create_generating", str3);
        c0labLIZJ.LIZ(i, "ai_create_task_num");
        c0labLIZJ.LJ("click_button_name", str2);
        c0labLIZJ.LJ("async_function_list", LIZLLL(c0e48));
        C20684815ws.LJIILLIIL("exit_editor_pro_toast_click", c0labLIZJ.LIZ);
    }

    public static void LJIJ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str, String str2, boolean z, boolean z2) {
        int i;
        AIGenerationType aIGenerationTypeLIZJ;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        if (str2 == null) {
            if (Intrinsics.LJFF(str, "ep_transition")) {
                str2 = "transition";
            } else {
                str2 = "ai_create";
            }
        }
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, c0e48);
        c0labLIZJ.LJ("enter_source", str);
        int i2 = 1;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        c0labLIZJ.LIZ(i, "is_from_result_page");
        if (!z2) {
            i2 = 0;
        }
        c0labLIZJ.LIZ(i2, "is_first_authorized");
        c0labLIZJ.LJ("scenerio", str2);
        IAIPlaygroundMobService iAIPlaygroundMobServiceLIZ = C07OF.LIZ();
        if (iAIPlaygroundMobServiceLIZ == null || (aIGenerationTypeLIZJ = iAIPlaygroundMobServiceLIZ.LIZJ(videoPublishEditModel)) == null) {
            aIGenerationTypeLIZJ = AIGenerationType.NONE;
        }
        if (aIGenerationTypeLIZJ != AIGenerationType.NONE) {
            if (c0e48 != null) {
                nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL();
            } else {
                nLETrackSlotLLLLLLIL = null;
            }
            if (C0E5J.LJFF(nLETrackSlotLLLLLLIL)) {
                c0labLIZJ.LJ("ai_video_tool_name", C380220EvU.LIZ(aIGenerationTypeLIZJ));
            }
        }
        C20684815ws.LJIILLIIL("text_to_video_panel_show", c0labLIZJ.LIZ);
    }

    public static void LJIIJJI(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str, boolean z, String str2, String str3, String str4, String str5, int i, String str6, String str7, boolean z2, String str8, Integer num, String str9, String str10) {
        if (Intrinsics.LJFF(str2, "keep_ratio")) {
            str2 = "original";
        }
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, c0e48);
        c0labLIZJ.LJ("enter_source", str);
        c0labLIZJ.LIZ(z ? 1 : 0, "is_from_result_page");
        c0labLIZJ.LJ("aspect_ratio", str2);
        c0labLIZJ.LJ("prompt_content", str3);
        c0labLIZJ.LJ("ai_image_style_resource_id", str4);
        c0labLIZJ.LJ("ai_image_style_resource_name", str5);
        c0labLIZJ.LIZ(i, "left_generate_times");
        c0labLIZJ.LJ("generate_type", str6);
        c0labLIZJ.LJ("task_id", str7);
        c0labLIZJ.LIZ(z2 ? 1 : 0, "is_upload_reference_image");
        if (str8 == null) {
            str8 = "";
        }
        c0labLIZJ.LJ("reference_image_source", str8);
        if (num != null) {
            c0labLIZJ.LIZ(num.intValue(), "ref_image_num");
        }
        if (str9 != null) {
            c0labLIZJ.LJ("ai_create_req_key", str9);
        }
        if (str10 != null) {
            c0labLIZJ.LJ("model", str10);
        }
        C20684815ws.LJIILLIIL("enter_text_to_image_generate", c0labLIZJ.LIZ);
    }

    public static void LJIIIZ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str, boolean z, boolean z2, String str2, String str3, String str4, int i, String str5, int i2, String str6, int i3, int i4, String str7, String str8, String str9, String str10, String str11) {
        AIGenerationType aIGenerationTypeLIZJ;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        String str12 = str11;
        if (Intrinsics.LJFF(str2, "keep_ratio")) {
            str2 = "original";
        }
        if (str12 == null) {
            if (Intrinsics.LJFF(str, "ep_transition")) {
                str12 = "transition";
            } else {
                str12 = "ai_create";
            }
        }
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, c0e48);
        c0labLIZJ.LJ("enter_source", str);
        c0labLIZJ.LIZ(z ? 1 : 0, "is_from_result_page");
        c0labLIZJ.LIZ(z2 ? 1 : 0, "is_first_authorized");
        c0labLIZJ.LJ("aspect_ratio", str2);
        c0labLIZJ.LJ("prompt_content", str3);
        c0labLIZJ.LJ("duration", str4);
        c0labLIZJ.LJ("server_generate_times_status", "success");
        c0labLIZJ.LIZ(i, "left_generate_times");
        c0labLIZJ.LJ("generate_button_status", str5);
        c0labLIZJ.LIZ(i2, "is_upload_reference_image");
        c0labLIZJ.LJ("reference_image_source", str6);
        c0labLIZJ.LIZ(i3, "is_reference_image_aigc");
        c0labLIZJ.LIZ(i4, "ref_image_num");
        c0labLIZJ.LJ("scenerio", str12);
        if (str7 != null) {
            c0labLIZJ.LJ("prompt_type", str7);
        }
        IAIPlaygroundMobService iAIPlaygroundMobServiceLIZ = C07OF.LIZ();
        if (iAIPlaygroundMobServiceLIZ == null || (aIGenerationTypeLIZJ = iAIPlaygroundMobServiceLIZ.LIZJ(videoPublishEditModel)) == null) {
            aIGenerationTypeLIZJ = AIGenerationType.NONE;
        }
        if (aIGenerationTypeLIZJ != AIGenerationType.NONE) {
            if (c0e48 != null) {
                nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL();
            } else {
                nLETrackSlotLLLLLLIL = null;
            }
            if (C0E5J.LJFF(nLETrackSlotLLLLLLIL)) {
                c0labLIZJ.LJ("ai_video_tool_name", C380220EvU.LIZ(aIGenerationTypeLIZJ));
            }
        }
        if (str8 != null) {
            c0labLIZJ.LJ("ai_create_req_key", str8);
        }
        if (str9 != null) {
            c0labLIZJ.LJ("model", str9);
        }
        if (str10 != null) {
            c0labLIZJ.LJ("rewrite_prompt", str10);
        }
        C20684815ws.LJIILLIIL("click_text_to_video_generate", c0labLIZJ.LIZ);
    }

    public static void LJIIL(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str, boolean z, String str2, String str3, String str4, int i, String str5, String str6, int i2, String str7, int i3, int i4, String str8, String str9, String str10, String str11, String str12) {
        String str13 = str12;
        if (Intrinsics.LJFF(str2, "keep_ratio")) {
            str2 = "original";
        }
        if (str13 == null) {
            if (Intrinsics.LJFF(str, "ep_transition")) {
                str13 = "transition";
            } else {
                str13 = "ai_create";
            }
        }
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, c0e48);
        c0labLIZJ.LJ("enter_source", str);
        c0labLIZJ.LIZ(z ? 1 : 0, "is_from_result_page");
        c0labLIZJ.LJ("aspect_ratio", str2);
        c0labLIZJ.LJ("prompt_content", str3);
        c0labLIZJ.LJ("duration", str4);
        c0labLIZJ.LIZ(i, "left_generate_times");
        c0labLIZJ.LJ("generate_type", str5);
        c0labLIZJ.LJ("task_id", str6);
        c0labLIZJ.LIZ(i2, "is_upload_reference_image");
        c0labLIZJ.LJ("reference_image_source", str7);
        c0labLIZJ.LIZ(i3, "is_reference_image_aigc");
        c0labLIZJ.LIZ(i4, "ref_image_num");
        c0labLIZJ.LJ("scenerio", str13);
        if (str8 != null) {
            c0labLIZJ.LJ("prompt_type", str8);
        }
        if (str9 != null) {
            c0labLIZJ.LJ("ai_create_req_key", str9);
        }
        if (str10 != null) {
            c0labLIZJ.LJ("model", str10);
        }
        if (str11 != null) {
            c0labLIZJ.LJ("rewrite_prompt", str11);
        }
        C20684815ws.LJIILLIIL("enter_text_to_video_generate", c0labLIZJ.LIZ);
    }

    public static void LJIILLIIL(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str, boolean z, String str2, String str3, String str4, String str5, int i, String str6, String str7, long j, String str8, String str9, boolean z2, String str10, Integer num, String str11, String str12) {
        String str13 = str10;
        if (Intrinsics.LJFF(str2, "keep_ratio")) {
            str2 = "original";
        }
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, c0e48);
        c0labLIZJ.LJ("enter_source", str);
        c0labLIZJ.LIZ(z ? 1 : 0, "is_from_result_page");
        c0labLIZJ.LJ("aspect_ratio", str2);
        c0labLIZJ.LJ("prompt_content", str3);
        c0labLIZJ.LJ("ai_image_style_resource_id", str4);
        c0labLIZJ.LJ("ai_image_style_resource_name", str5);
        c0labLIZJ.LIZ(i, "left_generate_times");
        c0labLIZJ.LJ("generate_type", "generate");
        c0labLIZJ.LJ("task_id", str6);
        c0labLIZJ.LJ("generate_status", str7);
        c0labLIZJ.LIZIZ(j, "generate_time");
        c0labLIZJ.LJ("error_code", str8);
        c0labLIZJ.LJ("error_msg", str9);
        c0labLIZJ.LIZ(z2 ? 1 : 0, "is_upload_reference_image");
        if (str13 == null) {
            str13 = "";
        }
        c0labLIZJ.LJ("reference_image_source", str13);
        if (num != null) {
            c0labLIZJ.LIZ(num.intValue(), "ref_image_num");
        }
        if (str11 != null) {
            c0labLIZJ.LJ("ai_create_req_key", str11);
        }
        if (str12 != null) {
            c0labLIZJ.LJ("model", str12);
        }
        C20684815ws.LJIILLIIL("text_to_image_generate_status", c0labLIZJ.LIZ);
    }

    public static void LJIIZILJ(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, String str, boolean z, String str2, String str3, String str4, int i, String str5, int i2, String str6, int i3, String str7, long j, String str8, String str9, int i4, boolean z2, String str10, String str11, String str12, String str13, String str14) {
        String str15 = str14;
        if (Intrinsics.LJFF(str2, "keep_ratio")) {
            str2 = "original";
        }
        if (str15 == null) {
            if (z2) {
                str15 = "transition";
            } else {
                str15 = "ai_create";
            }
        }
        C0LAB c0labLIZJ = LIZJ(videoPublishEditModel, c0e48);
        c0labLIZJ.LJ("enter_source", str);
        c0labLIZJ.LIZ(z ? 1 : 0, "is_from_result_page");
        c0labLIZJ.LJ("aspect_ratio", str2);
        c0labLIZJ.LJ("prompt_content", str3);
        c0labLIZJ.LJ("duration", str4);
        c0labLIZJ.LIZ(i, "left_generate_times");
        c0labLIZJ.LJ("generate_type", "generate");
        c0labLIZJ.LJ("task_id", str5);
        c0labLIZJ.LIZ(i2, "is_upload_reference_image");
        c0labLIZJ.LJ("reference_image_source", str6);
        c0labLIZJ.LIZ(i3, "is_reference_image_aigc");
        c0labLIZJ.LJ("generate_status", str7);
        c0labLIZJ.LIZIZ(j, "generate_time");
        c0labLIZJ.LJ("error_code", str8);
        c0labLIZJ.LJ("error_msg", str9);
        c0labLIZJ.LIZ(i4, "ref_image_num");
        c0labLIZJ.LJ("scenerio", str15);
        if (str10 != null) {
            c0labLIZJ.LJ("prompt_type", str10);
        }
        if (str11 != null) {
            c0labLIZJ.LJ("ai_create_req_key", str11);
        }
        if (!Intrinsics.LJFF(str15, "ai_extend") && str12 != null) {
            c0labLIZJ.LJ("model", str12);
        }
        if (str13 != null) {
            c0labLIZJ.LJ("rewrite_prompt", str13);
        }
        C20684815ws.LJIILLIIL("text_to_video_generate_status", c0labLIZJ.LIZ);
    }
}
