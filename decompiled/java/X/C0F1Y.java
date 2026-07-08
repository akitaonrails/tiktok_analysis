package X;

import Y.AComparatorS24S0000000_5;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0F1Y, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F1Y {
    public static final EditVideoSegment LIZIZ(NLETrackSlot nLETrackSlot) {
        NLEResourceAV nLEResourceAVDynamicCast;
        long timeClipEnd;
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast == null || (nLEResourceAVDynamicCast = NLEResourceAV.dynamicCast((NLENode) nLESegmentVideoDynamicCast.getResource())) == null) {
            return null;
        }
        String resourceFile = nLEResourceAVDynamicCast.getResourceFile();
        int width = (int) nLEResourceAVDynamicCast.getWidth();
        int height = (int) nLEResourceAVDynamicCast.getHeight();
        long duration = nLEResourceAVDynamicCast.getDuration();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        if (duration / j > 0) {
            timeClipEnd = nLEResourceAVDynamicCast.getDuration() / j;
        } else {
            timeClipEnd = (nLESegmentVideoDynamicCast.getTimeClipEnd() / j) - (nLESegmentVideoDynamicCast.getTimeClipStart() / j);
        }
        EditVideoSegment editVideoSegment = new EditVideoSegment(resourceFile, null, new VideoFileInfo(width, height, timeClipEnd, 0, 0, 0, 0, 0, 0.0f, 504, null), 2, null);
        editVideoSegment.setVideoCutInfo(new VideoCutInfo(nLESegmentVideoDynamicCast.getTimeClipStart() / j, nLESegmentVideoDynamicCast.getTimeClipEnd() / j, nLESegmentVideoDynamicCast.getSpeed(), (int) (-nLETrackSlot.getRotation())));
        return editVideoSegment;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData LIZJ(com.bytedance.ies.nle.editor_jni.NLEModel r10, com.bytedance.ies.nle.editor_jni.NLETrackSlot r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0F1Y.LIZJ(com.bytedance.ies.nle.editor_jni.NLEModel, com.bytedance.ies.nle.editor_jni.NLETrackSlot, boolean):com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData");
    }

    public static final List<MultiEditVideoSegmentRecordData> LIZLLL(NLETrack nLETrack, NLEModel nLEModel, boolean z) {
        ArrayList arrayList = new ArrayList();
        List listLJJJJLI = C13LP.LJJJJLI(nLETrack.getSlots());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listLJJJJLI) {
            NLETrackSlot nLETrackSlot = (NLETrackSlot) obj;
            if (nLETrackSlot.getMainSegment() != null && NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment()) != null && nLETrackSlot.getMainSegment().getResource() != null) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = C13LP.LJLLLL(new AComparatorS24S0000000_5(80), arrayList2).iterator();
        while (it2.hasNext()) {
            arrayList.add(LIZJ(nLEModel, (NLETrackSlot) it2.next(), z));
        }
        return arrayList;
    }

    public static final MultiEditVideoRecordData LIZ(List<? extends MultiEditVideoSegmentRecordData> list, boolean z, VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        boolean z2;
        long videoSpeed;
        if (list.isEmpty()) {
            return null;
        }
        MultiEditVideoRecordData multiEditVideoRecordData = new MultiEditVideoRecordData();
        long endTime = 0;
        multiEditVideoRecordData.startTime = 0L;
        multiEditVideoRecordData.setThreadSafeSegmentDataList(list);
        boolean z3 = true;
        multiEditVideoRecordData.fromAdvancedEdit = true;
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
            endTime += multiEditVideoSegmentRecordData.getEndTime() - multiEditVideoSegmentRecordData.getStartTime();
        }
        multiEditVideoRecordData.endTime = endTime;
        C363500EMy.LIZ.getClass();
        if (((Boolean) C288200BRi.LIZ.getValue()).booleanValue() || C361680EFy.LJJ(nLEModel) || (((Boolean) C288210BRj.LIZ.getValue()).booleanValue() && C363500EMy.LJIIJ(videoPublishEditModel))) {
            z2 = true;
        } else {
            z2 = false;
        }
        List<MultiEditVideoSegmentRecordData> list2 = multiEditVideoRecordData.segmentDataList;
        if (list2 != null) {
            int i = 0;
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 : list2) {
                int i2 = i + 1;
                if (i >= 0) {
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData3 = multiEditVideoSegmentRecordData2;
                    multiEditVideoSegmentRecordData3.videoKey = i;
                    if (z) {
                        long endTime2 = (multiEditVideoSegmentRecordData3.getEndTime() - multiEditVideoSegmentRecordData3.getStartTime()) * 1000;
                        if (z2) {
                            videoSpeed = endTime2;
                        } else {
                            videoSpeed = (long) (endTime2 / multiEditVideoSegmentRecordData3.getVideoSpeed());
                        }
                        multiEditVideoSegmentRecordData3.videoLength = videoSpeed;
                        if (!z2) {
                            endTime2 = (long) (endTime2 / multiEditVideoSegmentRecordData3.audioSpeed);
                        }
                        multiEditVideoSegmentRecordData3.audioLength = endTime2;
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        if (list.size() != 1) {
            z3 = false;
        }
        multiEditVideoRecordData.isSingleVideo = z3;
        return multiEditVideoRecordData;
    }
}
