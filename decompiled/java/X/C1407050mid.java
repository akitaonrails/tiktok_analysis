package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioMatrixFilter;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mid, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1407050mid {
    public static final C1407050mid LIZ = new C1407050mid();
    public static long LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, java.lang.String] */
    public static List LIZJ(VideoPublishEditModel videoPublishEditModel) {
        MultiEditVideoRecordData multiEditVideoRecordData;
        List<MultiEditVideoSegmentRecordData> list;
        MultiEditVideoSegmentRecordData next;
        C259800zU c259800zU = new C259800zU();
        ArrayList arrayList = new ArrayList();
        for (EditVideoSegment editVideoSegment : videoPublishEditModel.getPreviewInfo().getVideoList()) {
            if (videoPublishEditModel.realHasOriginalSound()) {
                c259800zU.element = editVideoSegment.getAudioPath();
            } else if (videoPublishEditModel.isCutSameVideoType()) {
                c259800zU.element = editVideoSegment.getVideoPath();
            } else if (videoPublishEditModel.isFastImport()) {
                MultiEditVideoStatusRecordData multiEditVideoRecordData2 = videoPublishEditModel.getMultiEditVideoRecordData();
                T t = 0;
                t = 0;
                t = 0;
                t = 0;
                if (multiEditVideoRecordData2 != null && (multiEditVideoRecordData = multiEditVideoRecordData2.curMultiEditVideoRecordData) != null && (list = multiEditVideoRecordData.segmentDataList) != null) {
                    Iterator<MultiEditVideoSegmentRecordData> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.LJFF(editVideoSegment.getVideoPath(), next.videoPath)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = next;
                    if (multiEditVideoSegmentRecordData != null) {
                        t = multiEditVideoSegmentRecordData.fastImportOriginVideoPath;
                    }
                }
                c259800zU.element = t;
            }
            String str = (String) c259800zU.element;
            if (str != null && str.length() != 0) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static void LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        String str;
        MultiEditVideoStatusRecordData multiEditVideoRecordData;
        MultiEditVideoRecordData multiEditVideoRecordData2;
        List<MultiEditVideoSegmentRecordData> list;
        String audioUrl = null;
        String videoPath = null;
        String videoPath2 = null;
        String audioPath = null;
        for (EditVideoSegment editVideoSegment : videoPublishEditModel.getPreviewInfo().getVideoList()) {
            if (videoPublishEditModel.realHasOriginalSound()) {
                videoPath = editVideoSegment.getAudioPath();
            } else if (videoPublishEditModel.isCutSameVideoType()) {
                videoPath = editVideoSegment.getVideoPath();
            }
            videoPath2 = editVideoSegment.getVideoPath();
            audioPath = editVideoSegment.getAudioPath();
        }
        if (videoPath == null && videoPublishEditModel.isFastImport() && (multiEditVideoRecordData = videoPublishEditModel.getMultiEditVideoRecordData()) != null && (multiEditVideoRecordData2 = multiEditVideoRecordData.curMultiEditVideoRecordData) != null && (list = multiEditVideoRecordData2.segmentDataList) != null) {
            Iterator<MultiEditVideoSegmentRecordData> it2 = list.iterator();
            str = null;
            while (it2.hasNext()) {
                str = it2.next().fastImportOriginVideoPath;
                videoPath = str;
            }
        } else {
            str = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("editModel = ");
        sbLIZ.append(videoPublishEditModel);
        sbLIZ.append(" \ndub audioUrl = ");
        AudioRecorderParam veAudioRecorderParam = videoPublishEditModel.getVeAudioRecorderParam();
        if (veAudioRecorderParam != null) {
            audioUrl = veAudioRecorderParam.getAudioUrl();
        }
        sbLIZ.append(audioUrl);
        sbLIZ.append(" \nfinal filePath = ");
        sbLIZ.append(videoPath);
        sbLIZ.append(" \nvideoPath = ");
        sbLIZ.append(videoPath2);
        sbLIZ.append(" \naudioPath = ");
        sbLIZ.append(audioPath);
        sbLIZ.append(" \nrealHasOriginalSound = ");
        sbLIZ.append(videoPublishEditModel.hasOriginalSound());
        sbLIZ.append(" \nisFastImport = ");
        sbLIZ.append(videoPublishEditModel.isFastImport());
        sbLIZ.append(" \nfastImportVideoPath = ");
        sbLIZ.append(str);
        sbLIZ.append(" \nisCutSameVideoType = ");
        sbLIZ.append(videoPublishEditModel.isCutSameVideoType());
        sbLIZ.append(" \npublished outputFile = ");
        sbLIZ.append(videoPublishEditModel.getOutputFile());
        C560870LzB.LIZ("zxz", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZ(NLEEditor nLEEditor, VideoPublishEditModel videoPublishEditModel) {
        String audioUrl;
        String audioUrl2;
        C560870LzB.LIZ("zxz", "addOriginAndDubVideoAudioMetricsFilterNLE: add NLE filters");
        LIZLLL(videoPublishEditModel);
        if (!C1404630mej.LIZLLL() || !C1404630mej.LIZIZ() || !C0CHQ.LIZ().getAccountService().isLogin()) {
            return;
        }
        C05X0.LIZ.getClass();
        String strLIZIZ = C05X0.LIZIZ();
        if (strLIZIZ.length() == 0) {
            C560870LzB.LIZ("zxz", "modelPath = empty !!!");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (nLEEditor.getModel().getTracks() != null) {
            arrayList.addAll(nLEEditor.getModel().getTracks());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tracks = ");
        sbLIZ.append(arrayList);
        C560870LzB.LIZ("zxz", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("modelPath = ");
        sbLIZ2.append(strLIZIZ);
        C560870LzB.LIZ("zxz", C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("samiParam = ");
        sbLIZ3.append(C1404630mej.LIZJ());
        C560870LzB.LIZ("zxz", C2188811AlT.LIZIZ(sbLIZ3));
        ArrayList arrayList2 = new ArrayList();
        List listLIZJ = LIZJ(videoPublishEditModel);
        if (!((ArrayList) listLIZJ).isEmpty()) {
            arrayList2.addAll(listLIZJ);
        }
        AudioRecorderParam veAudioRecorderParam = videoPublishEditModel.getVeAudioRecorderParam();
        String str = "";
        if (veAudioRecorderParam == null || (audioUrl = veAudioRecorderParam.getAudioUrl()) == null) {
            audioUrl = "";
        }
        if (C123100dR.LIZ(audioUrl)) {
            LIZ.getClass();
            AudioRecorderParam veAudioRecorderParam2 = videoPublishEditModel.getVeAudioRecorderParam();
            if (veAudioRecorderParam2 != null && (audioUrl2 = veAudioRecorderParam2.getAudioUrl()) != null) {
                str = audioUrl2;
            }
            arrayList2.add(str);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("tracksPathList = ");
        sbLIZ4.append(arrayList2);
        sbLIZ4.append(" , size = ");
        sbLIZ4.append(arrayList2.size());
        C560870LzB.LIZ("zxz", C2188811AlT.LIZIZ(sbLIZ4));
        ArrayList<NLETrack> arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            Iterator<NLETrackSlot> it2 = ((NLETrack) obj).getSlots().iterator();
            if (it2.hasNext()) {
                NLESegment mainSegment = it2.next().getMainSegment();
                if (NLESegmentAudio.dynamicCast(mainSegment) != null && mainSegment.getResource().getResourceFile().length() > 0 && arrayList2.contains(mainSegment.getResource().getResourceFile())) {
                    arrayList3.add(obj);
                }
            }
        }
        for (NLETrack nLETrack : arrayList3) {
            NLEFilter nLEFilter = new NLEFilter();
            NLESegmentAudioMatrixFilter nLESegmentAudioMatrixFilter = new NLESegmentAudioMatrixFilter();
            NLEResourceNode nLEResourceNode = new NLEResourceNode();
            nLEResourceNode.setResourceFile(strLIZIZ);
            nLESegmentAudioMatrixFilter.setEffectSDKFilter(nLEResourceNode);
            nLESegmentAudioMatrixFilter.setSamiParam(C1404630mej.LIZJ());
            nLEFilter.setSegment(nLESegmentAudioMatrixFilter);
            nLEFilter.setStartTime(0L);
            nLEFilter.setEndTime(nLETrack.getMeasuredEndTime());
            nLETrack.addFilter(nLEFilter);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("add filter: nleTrack = ");
            sbLIZ5.append(nLETrack.getFilters());
            C560870LzB.LIZ("zxz", C2188811AlT.LIZIZ(sbLIZ5));
            nLEEditor.commit();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(com.bytedance.ies.nle.editor_jni.INLEMediaSession r11, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1407050mid.LIZIZ(com.bytedance.ies.nle.editor_jni.INLEMediaSession, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):java.lang.String");
    }

    public static void LJI(Map map, Map map2) {
        HashMap map3;
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                if (entry.getValue() instanceof HashMap) {
                    C1407050mid c1407050mid = LIZ;
                    Object value = entry.getValue();
                    if (value instanceof HashMap) {
                        map3 = (HashMap) value;
                    } else {
                        map3 = null;
                    }
                    c1407050mid.getClass();
                    LJI(map, map3);
                } else {
                    ((HashMap) map).put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public static void LJ(int i, long j, VideoPublishEditModel videoPublishEditModel, String str) {
        LJFF(i, j, videoPublishEditModel, str, "", C2179771ASp.LJIIIIZZ(), C2179771ASp.LIZLLL());
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(int r8, long r9, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r11, java.lang.String r12, java.lang.String r13, double r14, int r16) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1407050mid.LJFF(int, long, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.String, java.lang.String, double, int):void");
    }
}
