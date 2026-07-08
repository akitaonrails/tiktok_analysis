package X;

import Y.AComparatorS24S0000000_5;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParamType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCInfoModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModelStatus;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.MagicI2InfoModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.TaskInfoInCreativeModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EqX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377150EqX {
    public static final C377150EqX LIZ = new C377150EqX();
    public static final Set<AIGCGenerationParamType> LIZIZ;
    public static final Set<AIGCGenerationParamType> LIZJ;
    public static final Set<AIGCGenerationParamType> LIZLLL;

    static {
        Set<AIGCGenerationParamType> setLJLIIL = C13LQ.LJLIIL(new AIGCGenerationParamType[]{AIGCGenerationParamType.T2I_TYPE, AIGCGenerationParamType.I2I_TYPE});
        LIZIZ = setLJLIIL;
        Set<AIGCGenerationParamType> setLJLIIL2 = C13LQ.LJLIIL(new AIGCGenerationParamType[]{AIGCGenerationParamType.T2V_TYPE, AIGCGenerationParamType.I2V_TYPE, AIGCGenerationParamType.FL2V_TYPE, AIGCGenerationParamType.V2V_TYPE});
        LIZJ = setLJLIIL2;
        LIZLLL = C15442062u.LJIIIZ(setLJLIIL, setLJLIIL2);
        C1446930nkx.LIZIZ("tiktok_ep_ai_create", new C377160EqY());
        C1446930nkx.LJI("tiktok_ep_ai_create", AFwS234S0000000_5.get$arr$(484));
    }

    public static List LJ(NLEModel nLEModel) {
        ArrayList arrayList = new ArrayList();
        if (nLEModel == null) {
            return arrayList;
        }
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList2 = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (nLETrack2.getMainTrack() || C351220Dpo.LLLIIL(nLETrack2)) {
                arrayList2.add(nLETrack);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList3);
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            String strLIZJ = C377740ErU.LIZJ((NLETrackSlot) it3.next());
            if (strLIZJ != null && strLIZJ.length() > 0) {
                arrayList.add(strLIZJ);
            }
        }
        return arrayList;
    }

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, EditorProAIGCMediaItemModel editorProAIGCMediaItemModel) {
        CreativeModel creativeModel;
        EditorProAIGCInfoModel editorProAIGCInfoModel;
        ArrayList<EditorProAIGCMediaItemModel> arrayList;
        C538950LBt c538950LBt = C538950LBt.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addNewMediaItemModel: ");
        sbLIZ.append(editorProAIGCMediaItemModel);
        C201955140j.LIZJ(c538950LBt, C2188811AlT.LIZIZ(sbLIZ));
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (editorProAIGCInfoModel = creativeModel.editorProAIGCInfoModel) != null && (arrayList = editorProAIGCInfoModel.editorProAIGCMediaItemModelList) != null) {
            arrayList.add(editorProAIGCMediaItemModel);
        }
    }

    public static boolean LIZIZ(VideoPublishEditModel videoPublishEditModel, NLETrackSlot nLETrackSlot) {
        CreativeModel creativeModel;
        EditorProAIGCInfoModel editorProAIGCInfoModel;
        HashMap<String, MagicI2InfoModel> map;
        C351510DqH.LIZ.getClass();
        String strLJJIFFI = C351510DqH.LJJIFFI(nLETrackSlot);
        if (!C123100dR.LIZ(strLJJIFFI) || videoPublishEditModel == null || (creativeModel = videoPublishEditModel.creativeModel) == null || (editorProAIGCInfoModel = creativeModel.editorProAIGCInfoModel) == null || (map = editorProAIGCInfoModel.magicI2IInfoModelMap) == null || !map.containsKey(strLJJIFFI) || !C286440BKo.LIZ()) {
            return false;
        }
        C354260Dui.LIZ.getClass();
        if (!C354260Dui.LJIILIIL(nLETrackSlot)) {
            return false;
        }
        return true;
    }

    public static List LJFF(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) LJ(nLEModel)).iterator();
        while (it2.hasNext()) {
            EditorProAIGCMediaItemModel editorProAIGCMediaItemModelLJIIIZ = LJIIIZ(videoPublishEditModel, (String) it2.next());
            if (editorProAIGCMediaItemModelLJIIIZ != null) {
                arrayList.add(editorProAIGCMediaItemModelLJIIIZ);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            it3.next();
            C538950LBt c538950LBt = C538950LBt.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getAllUsedMediaItemList: \n model: ");
            sbLIZ.append(arrayList);
            C2188811AlT.LIZIZ(sbLIZ);
            boolean z = C201955140j.LIZ;
        }
        return arrayList;
    }

    public static NLETrackSlot LJI(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        NLETrackSlot nLETrackSlot;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        NLEResourceNode resource;
        String resourceFile;
        NLETrack mainTrack2;
        VecNLETrackSlotSPtr slots2;
        NLETrackSlot next;
        String resourceFile2;
        String strLJIILJJIL;
        CreativeInfo creativeInfo;
        NLEResourceNode resource2;
        NLETrackSlot nLETrackSlot2 = null;
        if (nLEModel != null && (mainTrack2 = nLEModel.getMainTrack()) != null && (slots2 = mainTrack2.getSlots()) != null) {
            Iterator<NLETrackSlot> it2 = slots2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    NLESegment mainSegment = next.getMainSegment();
                    if (mainSegment != null && (resource2 = mainSegment.getResource()) != null) {
                        resourceFile2 = resource2.getResourceFile();
                    } else {
                        resourceFile2 = null;
                    }
                    if (videoPublishEditModel != null && (creativeInfo = videoPublishEditModel.getCreativeInfo()) != null) {
                        strLJIILJJIL = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIILJJIL(creativeInfo, EnumC20228214Cy.EDITOR_PRO_AIGC, "grey_editor_bg.png", false);
                    } else {
                        strLJIILJJIL = null;
                    }
                    if (Intrinsics.LJFF(resourceFile2, strLJIILJJIL)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            nLETrackSlot = next;
        } else {
            nLETrackSlot = null;
        }
        if (videoPublishEditModel != null && C1416310mxZ.LJJ(videoPublishEditModel) && nLETrackSlot == null) {
            if (nLEModel == null || (mainTrack = nLEModel.getMainTrack()) == null || (slots = mainTrack.getSlots()) == null) {
                return null;
            }
            Iterator<NLETrackSlot> it3 = slots.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                NLETrackSlot next2 = it3.next();
                NLESegment mainSegment2 = next2.getMainSegment();
                if (mainSegment2 != null && (resource = mainSegment2.getResource()) != null && (resourceFile = resource.getResourceFile()) != null && a0.LJJIIZI(resourceFile, "grey_editor_bg.png", false)) {
                    nLETrackSlot2 = next2;
                    break;
                }
            }
            return nLETrackSlot2;
        }
        return nLETrackSlot;
    }

    public static List LJII(VideoPublishEditModel videoPublishEditModel, String str) {
        CreativeModel creativeModel;
        EditorProAIGCInfoModel editorProAIGCInfoModel;
        ArrayList<EditorProAIGCMediaItemModel> arrayList;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (editorProAIGCInfoModel = creativeModel.editorProAIGCInfoModel) != null && (arrayList = editorProAIGCInfoModel.editorProAIGCMediaItemModelList) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (EditorProAIGCMediaItemModel editorProAIGCMediaItemModel : arrayList) {
                if (Intrinsics.LJFF(editorProAIGCMediaItemModel.epAIGCId, str)) {
                    arrayList2.add(editorProAIGCMediaItemModel);
                }
            }
            for (Object obj : arrayList2) {
                C538950LBt c538950LBt = C538950LBt.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getMediaItemModelByAsyncEPId: epID：");
                sbLIZ.append(str);
                sbLIZ.append(" \n model: ");
                sbLIZ.append(obj);
                C2188811AlT.LIZIZ(sbLIZ);
                boolean z = C201955140j.LIZ;
            }
            return arrayList2;
        }
        return null;
    }

    public static List LJIIIIZZ(VideoPublishEditModel videoPublishEditModel, String str) {
        CreativeModel creativeModel;
        EditorProAIGCInfoModel editorProAIGCInfoModel;
        ArrayList<EditorProAIGCMediaItemModel> arrayList;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (editorProAIGCInfoModel = creativeModel.editorProAIGCInfoModel) != null && (arrayList = editorProAIGCInfoModel.editorProAIGCMediaItemModelList) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (EditorProAIGCMediaItemModel editorProAIGCMediaItemModel : arrayList) {
                if (Intrinsics.LJFF(editorProAIGCMediaItemModel.epAIGCAsyncTaskId, str)) {
                    arrayList2.add(editorProAIGCMediaItemModel);
                }
            }
            for (Object obj : arrayList2) {
                C538950LBt c538950LBt = C538950LBt.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getMediaItemModelByAsyncTaskId: asyncTaskId：");
                sbLIZ.append(str);
                sbLIZ.append(" \n model: ");
                sbLIZ.append(obj);
                C2188811AlT.LIZIZ(sbLIZ);
                boolean z = C201955140j.LIZ;
            }
            return arrayList2;
        }
        return null;
    }

    public static EditorProAIGCMediaItemModel LJIIIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        CreativeModel creativeModel;
        EditorProAIGCInfoModel editorProAIGCInfoModel;
        ArrayList<EditorProAIGCMediaItemModel> arrayList;
        EditorProAIGCMediaItemModel next;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (editorProAIGCInfoModel = creativeModel.editorProAIGCInfoModel) != null && (arrayList = editorProAIGCInfoModel.editorProAIGCMediaItemModelList) != null) {
            Iterator<EditorProAIGCMediaItemModel> it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.itemID, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            EditorProAIGCMediaItemModel editorProAIGCMediaItemModel = next;
            if (editorProAIGCMediaItemModel != null) {
                C538950LBt c538950LBt = C538950LBt.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getMediaItemModelByMediaID: \n model: ");
                sbLIZ.append(editorProAIGCMediaItemModel);
                C2188811AlT.LIZIZ(sbLIZ);
                boolean z = C201955140j.LIZ;
                return editorProAIGCMediaItemModel;
            }
        }
        return null;
    }

    public static List LJIILIIL(VideoPublishEditModel videoPublishEditModel, String str) {
        return LIZLLL(videoPublishEditModel, str, AIGCGenerationParamType.T2I_TYPE, C1697810uHb.LJIIJJI(EditorProAIGCMediaItemModelStatus.LOADING, EditorProAIGCMediaItemModelStatus.COMPLETE, EditorProAIGCMediaItemModelStatus.ERROR));
    }

    public static boolean LJIJ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        Iterator it2 = ((ArrayList) LJFF(videoPublishEditModel, nLEModel)).iterator();
        while (it2.hasNext()) {
            if (((EditorProAIGCMediaItemModel) it2.next()).status == EditorProAIGCMediaItemModelStatus.ERROR) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIJJ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        Iterator it2 = ((ArrayList) LJFF(videoPublishEditModel, nLEModel)).iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((EditorProAIGCMediaItemModel) it2.next()).status == EditorProAIGCMediaItemModelStatus.LOADING) {
                    break;
                }
            } else if (!LJIJ(videoPublishEditModel, nLEModel)) {
                return false;
            }
        }
        return true;
    }

    public final boolean LJIJI(VideoPublishEditModel videoPublishEditModel, NLETrackSlot nLETrackSlot) {
        String strLIZIZ;
        if (nLETrackSlot != null && (strLIZIZ = C377740ErU.LIZIZ(nLETrackSlot)) != null) {
            if ((!((ArrayList) LJIILL(this, videoPublishEditModel, strLIZIZ)).isEmpty()) || (!((ArrayList) LJIIZILJ(this, videoPublishEditModel, strLIZIZ)).isEmpty())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LIZJ(VideoPublishEditModel videoPublishEditModel, NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
        String strLIZIZ;
        String strLIZ = C1017903yT.LIZ();
        strLIZ.toString();
        nLETrackSlot2.setExtra("ep_aigc_id", strLIZ);
        if (nLETrackSlot == null || (strLIZIZ = C377740ErU.LIZIZ(nLETrackSlot)) == null) {
            strLIZIZ = "";
        }
        List listLJII = LJII(videoPublishEditModel, strLIZIZ);
        if (listLJII != null) {
            ArrayList<EditorProAIGCMediaItemModel> arrayList = new ArrayList();
            for (Object obj : listLJII) {
                if (((EditorProAIGCMediaItemModel) obj).status == EditorProAIGCMediaItemModelStatus.COMPLETE) {
                    arrayList.add(obj);
                }
            }
            for (EditorProAIGCMediaItemModel editorProAIGCMediaItemModel : arrayList) {
                EditorProAIGCMediaItemModel editorProAIGCMediaItemModel2 = new EditorProAIGCMediaItemModel(C1017903yT.LIZ(), editorProAIGCMediaItemModel.slotId, strLIZ, editorProAIGCMediaItemModel.epAIGCAsyncTaskId, editorProAIGCMediaItemModel.progress, editorProAIGCMediaItemModel.type, editorProAIGCMediaItemModel.previousStatus, editorProAIGCMediaItemModel.status, editorProAIGCMediaItemModel.param, editorProAIGCMediaItemModel.creationTime, editorProAIGCMediaItemModel.mediaFilePath, editorProAIGCMediaItemModel.holderPicturePath, editorProAIGCMediaItemModel.isSelected, editorProAIGCMediaItemModel.serverDownloadUrl, editorProAIGCMediaItemModel.referenceImagePath, editorProAIGCMediaItemModel.referenceImagePathList, editorProAIGCMediaItemModel.uriMigrationMap, editorProAIGCMediaItemModel.t2iBgFilePath, editorProAIGCMediaItemModel.serverTaskId, editorProAIGCMediaItemModel.faceCountList, editorProAIGCMediaItemModel.algoRequestKey, editorProAIGCMediaItemModel.maskCoverPath, editorProAIGCMediaItemModel.failedWatermarkPath, editorProAIGCMediaItemModel.businessType);
                LIZ(videoPublishEditModel, editorProAIGCMediaItemModel2);
                if (editorProAIGCMediaItemModel2.isSelected) {
                    nLETrackSlot2.setExtra("ep_aigc_media_item_id", editorProAIGCMediaItemModel2.itemID);
                }
            }
        }
    }

    public static List LJIIJ(VideoPublishEditModel videoPublishEditModel, String str, List list) {
        CreativeModel creativeModel;
        EditorProAIGCInfoModel editorProAIGCInfoModel;
        ArrayList<EditorProAIGCMediaItemModel> arrayList;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (editorProAIGCInfoModel = creativeModel.editorProAIGCInfoModel) != null && (arrayList = editorProAIGCInfoModel.editorProAIGCMediaItemModelList) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (EditorProAIGCMediaItemModel editorProAIGCMediaItemModel : arrayList) {
                EditorProAIGCMediaItemModel editorProAIGCMediaItemModel2 = editorProAIGCMediaItemModel;
                if (Intrinsics.LJFF(editorProAIGCMediaItemModel2.epAIGCAsyncTaskId, str) && list.contains(editorProAIGCMediaItemModel2.status)) {
                    arrayList2.add(editorProAIGCMediaItemModel);
                }
            }
            List listLJLLLL = C13LP.LJLLLL(new AComparatorS24S0000000_5(99), arrayList2);
            if (listLJLLLL != null) {
                for (Object obj : listLJLLLL) {
                    C538950LBt c538950LBt = C538950LBt.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getMediaModelItemByAsyncTaskId: taskID：");
                    sbLIZ.append(str);
                    sbLIZ.append(" \n model: ");
                    sbLIZ.append(obj);
                    C2188811AlT.LIZIZ(sbLIZ);
                    boolean z = C201955140j.LIZ;
                }
                return listLJLLLL;
            }
        }
        return C13BV.INSTANCE;
    }

    public static List LJIILL(C377150EqX c377150EqX, VideoPublishEditModel videoPublishEditModel, String str) {
        List listLJIIJJI = C1697810uHb.LJIIJJI(EditorProAIGCMediaItemModelStatus.LOADING, EditorProAIGCMediaItemModelStatus.COMPLETE, EditorProAIGCMediaItemModelStatus.ERROR);
        c377150EqX.getClass();
        List listLIZLLL = LIZLLL(videoPublishEditModel, str, null, listLJIIJJI);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLIZLLL) {
            if (LIZIZ.contains(((EditorProAIGCMediaItemModel) obj).type)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List LJIILLIIL(VideoPublishEditModel videoPublishEditModel, String str, List list) {
        List listLIZLLL = LIZLLL(videoPublishEditModel, str, null, list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLIZLLL) {
            if (LIZJ.contains(((EditorProAIGCMediaItemModel) obj).type)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List LJIIZILJ(C377150EqX c377150EqX, VideoPublishEditModel videoPublishEditModel, String str) {
        List listLJIIJJI = C1697810uHb.LJIIJJI(EditorProAIGCMediaItemModelStatus.LOADING, EditorProAIGCMediaItemModelStatus.COMPLETE, EditorProAIGCMediaItemModelStatus.ERROR);
        c377150EqX.getClass();
        return LJIILLIIL(videoPublishEditModel, str, listLJIIJJI);
    }

    public static void LJIJJLI(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, Integer num) {
        CreativeModel creativeModel;
        EditorProAIGCInfoModel editorProAIGCInfoModel;
        TaskInfoInCreativeModel taskInfoInCreativeModel;
        EditorProAIGCInfoModel editorProAIGCInfoModel2;
        TaskInfoInCreativeModel taskInfoInCreativeModel2;
        EditorProAIGCInfoModel editorProAIGCInfoModel3;
        TaskInfoInCreativeModel taskInfoInCreativeModel3;
        if (videoPublishEditModel != null) {
            CreativeModel creativeModel2 = videoPublishEditModel.creativeModel;
            if (creativeModel2 != null && (editorProAIGCInfoModel3 = creativeModel2.editorProAIGCInfoModel) != null && (taskInfoInCreativeModel3 = editorProAIGCInfoModel3.taskInfoInCreativeModel) != null) {
                taskInfoInCreativeModel3.needBlockLeaveEditorPro = LJIJJ(videoPublishEditModel, nLEModel);
            }
            CreativeModel creativeModel3 = videoPublishEditModel.creativeModel;
            if (creativeModel3 != null && (editorProAIGCInfoModel2 = creativeModel3.editorProAIGCInfoModel) != null && (taskInfoInCreativeModel2 = editorProAIGCInfoModel2.taskInfoInCreativeModel) != null) {
                taskInfoInCreativeModel2.isBlockByLoading = !LJIJ(videoPublishEditModel, nLEModel);
            }
        }
        if (num != null) {
            int iIntValue = num.intValue();
            if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (editorProAIGCInfoModel = creativeModel.editorProAIGCInfoModel) != null && (taskInfoInCreativeModel = editorProAIGCInfoModel.taskInfoInCreativeModel) != null) {
                taskInfoInCreativeModel.uncompletedTasksSize = iIntValue;
            }
        }
    }

    public static List LIZLLL(VideoPublishEditModel videoPublishEditModel, String str, AIGCGenerationParamType aIGCGenerationParamType, List list) {
        CreativeModel creativeModel;
        EditorProAIGCInfoModel editorProAIGCInfoModel;
        ArrayList<EditorProAIGCMediaItemModel> arrayList;
        if (str.length() == 0) {
            return C13BV.INSTANCE;
        }
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (editorProAIGCInfoModel = creativeModel.editorProAIGCInfoModel) != null && (arrayList = editorProAIGCInfoModel.editorProAIGCMediaItemModelList) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (EditorProAIGCMediaItemModel editorProAIGCMediaItemModel : arrayList) {
                EditorProAIGCMediaItemModel editorProAIGCMediaItemModel2 = editorProAIGCMediaItemModel;
                if (Intrinsics.LJFF(editorProAIGCMediaItemModel2.epAIGCId, str) && list.contains(editorProAIGCMediaItemModel2.status)) {
                    arrayList2.add(editorProAIGCMediaItemModel);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (((EditorProAIGCMediaItemModel) obj).type == aIGCGenerationParamType || aIGCGenerationParamType == null) {
                    arrayList3.add(obj);
                }
            }
            List listLJLLLL = C13LP.LJLLLL(new AComparatorS24S0000000_5(98), arrayList3);
            if (listLJLLLL != null) {
                for (Object obj2 : listLJLLLL) {
                    C538950LBt c538950LBt = C538950LBt.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getAIGCHistoryList: epId: ");
                    sbLIZ.append(str);
                    sbLIZ.append(" \n type : ");
                    sbLIZ.append(aIGCGenerationParamType);
                    sbLIZ.append("  \n statusList: ");
                    sbLIZ.append(list);
                    sbLIZ.append("\n model: ");
                    sbLIZ.append(obj2);
                    C2188811AlT.LIZIZ(sbLIZ);
                    boolean z = C201955140j.LIZ;
                }
                return listLJLLLL;
            }
        }
        return C13BV.INSTANCE;
    }

    public static EditorProAIGCMediaItemModel LJIIJJI(VideoPublishEditModel videoPublishEditModel, String str, AIGCGenerationParamType aIGCGenerationParamType, List list) {
        Object next;
        Iterator it2 = LIZLLL(videoPublishEditModel, str, aIGCGenerationParamType, list).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((EditorProAIGCMediaItemModel) next).isSelected) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (EditorProAIGCMediaItemModel) next;
    }

    public static List LJIILJJIL(VideoPublishEditModel videoPublishEditModel, String str, AIGCGenerationParamType aIGCGenerationParamType, int i) {
        List listLJIIJJI;
        if ((i & 4) != 0) {
            aIGCGenerationParamType = AIGCGenerationParamType.T2V_TYPE;
        }
        if ((i & 8) != 0) {
            listLJIIJJI = C1697810uHb.LJIIJJI(EditorProAIGCMediaItemModelStatus.LOADING, EditorProAIGCMediaItemModelStatus.COMPLETE, EditorProAIGCMediaItemModelStatus.ERROR);
        } else {
            listLJIIJJI = null;
        }
        return LIZLLL(videoPublishEditModel, str, aIGCGenerationParamType, listLJIIJJI);
    }

    public static List LJIL(VideoPublishEditModel videoPublishEditModel, String str, EditorProAIGCMediaItemModelStatus editorProAIGCMediaItemModelStatus, boolean z) {
        CreativeModel creativeModel;
        EditorProAIGCInfoModel editorProAIGCInfoModel;
        ArrayList<EditorProAIGCMediaItemModel> arrayList;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (editorProAIGCInfoModel = creativeModel.editorProAIGCInfoModel) != null && (arrayList = editorProAIGCInfoModel.editorProAIGCMediaItemModelList) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (EditorProAIGCMediaItemModel editorProAIGCMediaItemModel : arrayList) {
                if (Intrinsics.LJFF(editorProAIGCMediaItemModel.epAIGCAsyncTaskId, str) && editorProAIGCMediaItemModel.status != editorProAIGCMediaItemModelStatus) {
                    C538950LBt c538950LBt = C538950LBt.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updateMediaItemStatus : asyncTaskId: ");
                    sbLIZ.append(str);
                    sbLIZ.append(" || update to status ");
                    sbLIZ.append(editorProAIGCMediaItemModelStatus);
                    sbLIZ.append("  \n model: ");
                    sbLIZ.append(LIZ);
                    C201955140j.LIZJ(c538950LBt, C2188811AlT.LIZIZ(sbLIZ));
                    EditorProAIGCMediaItemModelStatus editorProAIGCMediaItemModelStatus2 = EditorProAIGCMediaItemModelStatus.CANCEL;
                    if (editorProAIGCMediaItemModelStatus == editorProAIGCMediaItemModelStatus2) {
                        editorProAIGCMediaItemModel.previousStatus = editorProAIGCMediaItemModel.status;
                    }
                    if (!z || editorProAIGCMediaItemModel.status != EditorProAIGCMediaItemModelStatus.COMPLETE || editorProAIGCMediaItemModelStatus != editorProAIGCMediaItemModelStatus2) {
                        editorProAIGCMediaItemModel.status = editorProAIGCMediaItemModelStatus;
                    }
                    arrayList2.add(editorProAIGCMediaItemModel);
                }
            }
            return arrayList2;
        }
        return C13BV.INSTANCE;
    }
}
