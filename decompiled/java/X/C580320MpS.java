package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MpS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C580320MpS {
    public static final Pair<Long, Long> LIZJ(VideoPublishEditModel videoPublishEditModel, String str) {
        List<MultiEditVideoSegmentRecordData> listLJII = C574800MgY.LJII(videoPublishEditModel.getCurMultiEditVideoRecordData());
        if (videoPublishEditModel.getFinalVideoList().size() == ((ArrayList) listLJII).size()) {
            int size = videoPublishEditModel.getFinalVideoList().size();
            for (int i = 0; i < size; i++) {
                MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) ListProtector.get(listLJII, i);
                if (Intrinsics.LJFF(str, ((TimeSpeedModelExtension) ListProtector.get(videoPublishEditModel.getFinalVideoList(), i)).getIdentityKey())) {
                    return new Pair<>(Long.valueOf(multiEditVideoSegmentRecordData.getStartTime()), Long.valueOf(multiEditVideoSegmentRecordData.getEndTime()));
                }
            }
            return null;
        }
        return null;
    }

    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, ExtractFramesModel extractFramesModel, boolean z) {
        Pair<Long, Long> pairLIZJ;
        ArrayList<TimeSpeedModelExtension> arrayList;
        if (C578780Mmy.LIZ() && extractFramesModel != null && extractFramesModel.getSegmentEffectPhoto() != null) {
            ArrayList<TimeSpeedModelExtension> finalVideoList = videoPublishEditModel.getFinalVideoList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<TimeSpeedModelExtension> it2 = finalVideoList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    TimeSpeedModelExtension next = it2.next();
                    if (next.getIdentityKey() == null) {
                        break;
                    } else {
                        linkedHashSet.add(next.getIdentityKey());
                    }
                } else {
                    HashMap<String, List<String>> segmentEffectPhoto = extractFramesModel.getSegmentEffectPhoto();
                    if (segmentEffectPhoto != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, List<String>> entry : segmentEffectPhoto.entrySet()) {
                            if (linkedHashSet.contains(entry.getKey())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = linkedHashMap.entrySet().iterator();
                        while (it3.hasNext()) {
                            C19719612Di.LJJI((Iterable) ((Map.Entry) it3.next()).getValue(), arrayList2);
                        }
                        HashSet hashSetLLIFFJFJJ = C13LP.LLIFFJFJJ(arrayList2);
                        HashMap<Integer, List<String>> multiStickers = extractFramesModel.getMultiStickers();
                        if (multiStickers != null) {
                            ArrayList arrayList3 = new ArrayList();
                            Iterator<Map.Entry<Integer, List<String>>> it4 = multiStickers.entrySet().iterator();
                            while (it4.hasNext()) {
                                C19719612Di.LJJI(it4.next().getValue(), arrayList3);
                            }
                            ArrayList<String> arrayList4 = new ArrayList();
                            for (Object obj : arrayList3) {
                                if (!hashSetLLIFFJFJJ.contains(obj)) {
                                    arrayList4.add(obj);
                                }
                            }
                            for (String str : arrayList4) {
                                if (new C0VSJ(str).exists() && C2486109oh.LIZIZ(str)) {
                                    C20012413Ry.LJFF(str);
                                }
                            }
                        }
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            }
        }
        if (videoPublishEditModel.isStitchMode()) {
            if (extractFramesModel != null && extractFramesModel.getFramesV1() != null && extractFramesModel.getSegmentFrameKeys() != null) {
                Iterator<Map.Entry<Integer, String>> it5 = extractFramesModel.getSegmentFrameKeys().entrySet().iterator();
                while (it5.hasNext()) {
                    Map.Entry<Integer, String> next2 = it5.next();
                    if (!LIZIZ(videoPublishEditModel, next2.getValue(), z)) {
                        HashMap<Integer, ArrayList<FrameItem>> framesV1 = extractFramesModel.getFramesV1();
                        if (framesV1 != null) {
                            framesV1.remove(next2.getKey());
                        }
                        HashMap<Integer, List<String>> multiStickers2 = extractFramesModel.getMultiStickers();
                        if (multiStickers2 != null) {
                            multiStickers2.remove(next2.getKey());
                        }
                        it5.remove();
                    }
                }
                return;
            }
            return;
        }
        if (videoPublishEditModel.isMultiVideoEdit() && extractFramesModel != null && extractFramesModel.getFramesV1() != null && extractFramesModel.getSegmentFrameKeys() != null) {
            if (!videoPublishEditModel.isCurrentAutoCutMode()) {
                Iterator<Map.Entry<Integer, String>> it6 = extractFramesModel.getSegmentFrameKeys().entrySet().iterator();
                while (it6.hasNext()) {
                    Map.Entry<Integer, String> next3 = it6.next();
                    if (!LIZIZ(videoPublishEditModel, next3.getValue(), z)) {
                        HashMap<Integer, ArrayList<FrameItem>> framesV12 = extractFramesModel.getFramesV1();
                        if (framesV12 != null) {
                            framesV12.remove(next3.getKey());
                        }
                        HashMap<Integer, List<String>> multiStickers3 = extractFramesModel.getMultiStickers();
                        if (multiStickers3 != null) {
                            multiStickers3.remove(next3.getKey());
                        }
                        it6.remove();
                    }
                }
            }
            EditorProModel editorProModel = videoPublishEditModel.getEditorProModel();
            if (editorProModel != null && editorProModel.isAdvancedEditDraft()) {
                HashMap<Integer, ArrayList<FrameItem>> framesV13 = extractFramesModel.getFramesV1();
                if (framesV13 != null) {
                    for (Map.Entry<Integer, ArrayList<FrameItem>> entry2 : framesV13.entrySet()) {
                        String str2 = extractFramesModel.getSegmentFrameKeys().get(entry2.getKey());
                        if (str2 != null && str2.length() != 0) {
                            ArrayList arrayList5 = new ArrayList();
                            if (videoPublishEditModel.getCurMultiEditVideoRecordData().segmentDataList != null) {
                                List<MultiEditVideoSegmentRecordData> list = videoPublishEditModel.getCurMultiEditVideoRecordData().segmentDataList;
                                MultiEditVideoStatusRecordData multiEditVideoRecordData = videoPublishEditModel.getMultiEditVideoRecordData();
                                if (multiEditVideoRecordData != null && (arrayList = multiEditVideoRecordData.editSegments) != null) {
                                    int i = 0;
                                    for (TimeSpeedModelExtension timeSpeedModelExtension : arrayList) {
                                        int i2 = i + 1;
                                        if (i >= 0) {
                                            TimeSpeedModelExtension timeSpeedModelExtension2 = timeSpeedModelExtension;
                                            if (list.size() > i && Intrinsics.LJFF(timeSpeedModelExtension2.getIdentityKey(), str2)) {
                                                long startTime = ((MultiEditVideoSegmentRecordData) ListProtector.get(list, i)).getStartTime();
                                                long endTime = ((MultiEditVideoSegmentRecordData) ListProtector.get(list, i)).getEndTime();
                                                timeSpeedModelExtension2.getSpeed();
                                                arrayList5.add(new C580330MpT(startTime, endTime));
                                            }
                                            i = i2;
                                        } else {
                                            C1697810uHb.LJIJI();
                                            throw null;
                                        }
                                    }
                                }
                            }
                            if (arrayList5.isEmpty()) {
                                entry2.getValue().clear();
                            } else {
                                for (int size = entry2.getValue().size() - 1; -1 < size; size--) {
                                    Iterator it7 = arrayList5.iterator();
                                    while (true) {
                                        if (!it7.hasNext()) {
                                            break;
                                        }
                                        Object next4 = it7.next();
                                        C580330MpT c580330MpT = (C580330MpT) next4;
                                        long j = ((FrameItem) ListProtector.get(entry2.getValue(), size)).timeStamp / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                                        if (j >= c580330MpT.LIZ && j <= c580330MpT.LIZIZ) {
                                            if (next4 == null) {
                                                break;
                                            }
                                        }
                                    }
                                    ListProtector.remove(entry2.getValue(), size);
                                }
                            }
                        }
                    }
                    return;
                }
                return;
            }
            HashMap<Integer, ArrayList<FrameItem>> framesV14 = extractFramesModel.getFramesV1();
            if (framesV14 != null) {
                for (Map.Entry<Integer, ArrayList<FrameItem>> entry3 : framesV14.entrySet()) {
                    String str3 = extractFramesModel.getSegmentFrameKeys().get(entry3.getKey());
                    if (str3 != null && str3.length() != 0 && (pairLIZJ = LIZJ(videoPublishEditModel, str3)) != null) {
                        C19719612Di.LJJIIJ(entry3.getValue(), new AwS582S0100000_3(pairLIZJ, (Pair<Long, Long>) 57), true);
                    }
                }
            }
        }
    }

    public static final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel, String str, boolean z) {
        ArrayList<TimeSpeedModelExtension> arrayList;
        MultiEditVideoStatusRecordData multiEditVideoRecordData;
        ArrayList<TimeSpeedModelExtension> arrayList2;
        TimeSpeedModelExtension timeSpeedModelExtension = null;
        if (videoPublishEditModel.getEditorProModel().isAdvancedEditDraft()) {
            if (str == null) {
                return true;
            }
            MultiEditVideoStatusRecordData multiEditVideoRecordData2 = videoPublishEditModel.getMultiEditVideoRecordData();
            if (multiEditVideoRecordData2 != null && (arrayList = multiEditVideoRecordData2.editSegments) != null && !arrayList.isEmpty() && (multiEditVideoRecordData = videoPublishEditModel.getMultiEditVideoRecordData()) != null && (arrayList2 = multiEditVideoRecordData.editSegments) != null) {
                Iterator<TimeSpeedModelExtension> it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    TimeSpeedModelExtension next = it2.next();
                    TimeSpeedModelExtension timeSpeedModelExtension2 = next;
                    if (timeSpeedModelExtension2.getIdentityKey() != null && Intrinsics.LJFF(timeSpeedModelExtension2.getIdentityKey(), str)) {
                        timeSpeedModelExtension = next;
                        break;
                    }
                }
                TimeSpeedModelExtension timeSpeedModelExtension3 = timeSpeedModelExtension;
                if (timeSpeedModelExtension3 != null) {
                    if (videoPublishEditModel.hasUploadFrameConditionInEdit()) {
                        return true;
                    }
                    String stickerId = timeSpeedModelExtension3.getStickerId();
                    if (stickerId != null && stickerId.length() != 0) {
                        return true;
                    }
                    List<String> pipResourcePaths = videoPublishEditModel.getEditorProModel().getPipResourcePaths();
                    if ((pipResourcePaths != null && !pipResourcePaths.isEmpty()) || z) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        if (str == null) {
            return true;
        }
        Iterator<TimeSpeedModelExtension> it3 = videoPublishEditModel.getFinalVideoList().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            TimeSpeedModelExtension next2 = it3.next();
            String identityKey = next2.getIdentityKey();
            if (identityKey != null && Intrinsics.LJFF(identityKey, str)) {
                timeSpeedModelExtension = next2;
                break;
            }
        }
        TimeSpeedModelExtension timeSpeedModelExtension4 = timeSpeedModelExtension;
        if (timeSpeedModelExtension4 == null) {
            return false;
        }
        if (videoPublishEditModel.hasUploadFrameConditionInEdit()) {
            return true;
        }
        String stickerId2 = timeSpeedModelExtension4.getStickerId();
        if ((stickerId2 != null && stickerId2.length() != 0) || z) {
            return true;
        }
        return false;
    }
}
