package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Lw5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C558950Lw5 {
    public static final void LIZ(String str, NLEEditor nLEEditor, CreativeModel creativeModel) {
        Integer numValueOf;
        List<MultiEditVideoSegmentRecordData> list;
        Integer numValueOf2;
        MultiEditVideoRecordData multiEditVideoRecordData;
        String resourceFile;
        NLEResourceAV aVFile;
        NLEResourceAV aVFile2;
        NLETrack mainTrack = nLEEditor.getModel().getMainTrack();
        if (mainTrack == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\nNLE mainTrack=");
        sbLIZ.append(mainTrack.getSlots().size());
        sbLIZ.append(", path=\n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        Iterator<NLETrackSlot> it2 = mainTrack.getSortedSlots().iterator();
        while (true) {
            numValueOf = null;
            resourceFile = null;
            String resourceFile2 = null;
            if (!it2.hasNext()) {
                break;
            }
            NLETrackSlot next = it2.next();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("\t\t");
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) next.getMainSegment());
            if (nLESegmentVideoDynamicCast != null && (aVFile2 = nLESegmentVideoDynamicCast.getAVFile()) != null) {
                resourceFile2 = aVFile2.getResourceFile();
            }
            sbLIZ2.append(resourceFile2);
            sbLIZ2.append(",\n");
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        }
        for (NLETrack nLETrack : C351220Dpo.LJJLIIIJLJLI(nLEEditor.getModel())) {
            sb.append("\nNLE pipTrack, path=\n");
            for (NLETrackSlot nLETrackSlot : nLETrack.getSortedSlots()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("\t\t");
                NLESegmentVideo nLESegmentVideoDynamicCast2 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                if (nLESegmentVideoDynamicCast2 != null && (aVFile = nLESegmentVideoDynamicCast2.getAVFile()) != null) {
                    resourceFile = aVFile.getResourceFile();
                } else {
                    resourceFile = null;
                }
                sbLIZ3.append(resourceFile);
                sbLIZ3.append(",\n");
                sb.append(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = creativeModel.editModel.multiEditVideoStatusRecordData;
        if (multiEditVideoStatusRecordData != null && (multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) != null) {
            list = multiEditVideoRecordData.segmentDataList;
        } else {
            list = null;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("\nrecordData size=");
        if (list != null) {
            numValueOf2 = Integer.valueOf(list.size());
        } else {
            numValueOf2 = null;
        }
        sbLIZ4.append(numValueOf2);
        sbLIZ4.append(", path=\n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ4));
        if (list != null) {
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("\t\t");
                sbLIZ5.append(multiEditVideoSegmentRecordData.videoPath);
                sbLIZ5.append(",\n");
                sb.append(C2188811AlT.LIZIZ(sbLIZ5));
            }
        }
        ArrayList<ImportVideoInfo> arrayList = creativeModel.albumModel.importInfoList;
        StringBuilder sb2 = new StringBuilder("\nimportList size=");
        if (arrayList != null) {
            numValueOf = Integer.valueOf(arrayList.size());
        }
        sb2.append(numValueOf);
        sb2.append(", path=\n");
        sb.append(sb2.toString());
        if (arrayList != null) {
            for (ImportVideoInfo importVideoInfo : arrayList) {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("\t\t");
                sbLIZ6.append(importVideoInfo.getRealImportPath());
                sbLIZ6.append(", origin=");
                sbLIZ6.append(importVideoInfo.getOriginImportPath());
                sbLIZ6.append('\n');
                sb.append(C2188811AlT.LIZIZ(sbLIZ6));
            }
        }
        C559010LwB.LIZIZ(str, "printDebugInfo, " + ((Object) sb));
    }
}
