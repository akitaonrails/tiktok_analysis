package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0MZ0, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MZ0 {
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:103:0x01eb
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static final void LIZIZ(com.ss.android.ugc.aweme.draft.model.AwemeDraft r15) {
        /*
            Method dump skipped, instruction units count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MZ0.LIZIZ(com.ss.android.ugc.aweme.draft.model.AwemeDraft):void");
    }

    public static final void LIZLLL(AwemeDraft awemeDraft) {
        MultiEditVideoRecordData multiEditVideoRecordData;
        MultiEditVideoRecordData multiEditVideoRecordData2;
        MultiEditVideoRecordData multiEditVideoRecordData3;
        MultiEditVideoRecordData multiEditVideoRecordData4;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = awemeDraft.LJJJJIZL.multiEditVideoData;
        if (multiEditVideoStatusRecordData != null && (multiEditVideoRecordData4 = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) != null) {
            LJ(multiEditVideoRecordData4);
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = awemeDraft.LJJJJIZL.multiEditVideoData;
        if (multiEditVideoStatusRecordData2 != null && (multiEditVideoRecordData3 = multiEditVideoStatusRecordData2.originMultiEditRecordData) != null) {
            LJ(multiEditVideoRecordData3);
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData3 = awemeDraft.LJJJJIZL.multiEditVideoData;
        if (multiEditVideoStatusRecordData3 != null && (multiEditVideoRecordData2 = multiEditVideoStatusRecordData3.restoreMultiEditVideoRecordData) != null) {
            LJ(multiEditVideoRecordData2);
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData4 = awemeDraft.LJJJJIZL.multiEditVideoData;
        if (multiEditVideoStatusRecordData4 != null && (multiEditVideoRecordData = multiEditVideoStatusRecordData4.singleRestoreMultiEditRecordData) != null) {
            LJ(multiEditVideoRecordData);
        }
    }

    public static final void LJ(MultiEditVideoRecordData multiEditVideoRecordData) {
        List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
        if (list != null) {
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                multiEditVideoSegmentRecordData.draftVideoPath = multiEditVideoSegmentRecordData.videoPath;
                multiEditVideoSegmentRecordData.draftAudioPath = multiEditVideoSegmentRecordData.audioPath;
            }
        }
    }

    public static final String LJFF(AwemeDraft awemeDraft) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1449640npK.LJFF);
        sbLIZ.append(C08HM.LIZJ(LJII(awemeDraft)));
        sbLIZ.append(File.separator);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final String LJI(AwemeDraft awemeDraft) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1449640npK.LIZJ);
        sbLIZ.append(C08HM.LIZJ(LJII(awemeDraft)));
        sbLIZ.append(File.separator);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final String LJII(AwemeDraft awemeDraft) {
        EditPreviewInfo editPreviewInfoLJ;
        String videoPath;
        List<EditVideoSegment> videoList;
        EditVideoSegment editVideoSegment;
        MultiEditVideoRecordData multiEditVideoRecordData;
        String str;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = awemeDraft.LJJJJIZL.multiEditVideoData;
        if (multiEditVideoStatusRecordData != null && (multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) != null && (str = multiEditVideoRecordData.concatVideo) != null && str.length() != 0) {
            videoPath = multiEditVideoRecordData.concatVideo;
        } else {
            StitchParams stitchParams = awemeDraft.LJJJJIZL.stitchParams;
            if ((stitchParams == null || (videoPath = stitchParams.getConcatVideoPath()) == null || videoPath.length() == 0) && ((editPreviewInfoLJ = C0MZ9.LJ(awemeDraft, true)) == null || (videoList = editPreviewInfoLJ.getVideoList()) == null || (editVideoSegment = (EditVideoSegment) C13LP.LJJJLL(videoList)) == null || (videoPath = editVideoSegment.getVideoPath()) == null)) {
                videoPath = "";
            }
        }
        String strValueOf = String.valueOf(videoPath);
        if (awemeDraft.LJJJJIZL.isFastImport) {
            if (TextUtils.isEmpty(awemeDraft.LIZIZ().getCreationId())) {
                awemeDraft.LJIJI(new CreativeInfo(null, 0, null, 7, null));
            }
            return awemeDraft.LIZIZ().getCreationId();
        }
        return strValueOf;
    }

    public static final void LJIIIIZZ(AwemeDraft awemeDraft) {
        String str = awemeDraft.LJJJJIZL.videoCoverPath;
        if (str != null && str.length() != 0) {
            if ((awemeDraft.LJIIIZ() || awemeDraft.LJIILLIIL() || awemeDraft.LJIIZILJ()) && !new C0VSJ(str).exists()) {
                awemeDraft.LJJJJIZL.videoCoverPath = "";
            }
        }
    }

    public static final void LIZ(Map map, String str, Function1 function1) {
        Object next;
        Iterator it2 = map.keySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (u.LJJIIJZLJL(str, (String) next, false)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        String str2 = (String) next;
        if (str2 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) map.get(str2));
            sbLIZ.append(a0.LJJJJZ(str2, str));
            function1.invoke(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final void LIZJ(MultiEditVideoRecordData multiEditVideoRecordData, Map<String, String> map, CreativeInfo creativeInfo) {
        Object next;
        int version;
        String strLIZLLL;
        String str = multiEditVideoRecordData.curRecordingDir;
        if (str != null && str.length() != 0) {
            multiEditVideoRecordData.curRecordingDir = C570490MZb.LIZJ(multiEditVideoRecordData.curRecordingDir);
            HashMap map2 = (HashMap) map;
            Iterator it2 = map2.keySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (u.LJJIIJZLJL(multiEditVideoRecordData.curRecordingDir, (String) next, false)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            String str2 = (String) next;
            if (str2 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((String) map2.get(str2));
                sbLIZ.append(a0.LJJJJZ(str2, multiEditVideoRecordData.curRecordingDir));
                multiEditVideoRecordData.curRecordingDir = C2188811AlT.LIZIZ(sbLIZ);
            }
            if (C372020EiG.LIZ()) {
                version = creativeInfo.getVersion();
            } else {
                version = creativeInfo.getVersion() + 1;
            }
            CreativeInfo creativeInfo2 = new CreativeInfo(creativeInfo.getCreationId(), version, null, 4, null);
            String strLIZIZ = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZIZ(creativeInfo);
            String strLIZIZ2 = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZIZ(creativeInfo2);
            if (u.LJJIIJZLJL(multiEditVideoRecordData.curRecordingDir, strLIZIZ, false)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ2);
                sbLIZ2.append(a0.LJJJJZ(strLIZIZ, multiEditVideoRecordData.curRecordingDir));
                strLIZLLL = C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                strLIZLLL = C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo2, EnumC20228214Cy.EXTERNAL_RESTORE, a0.LJJJJZ(C570490MZb.LIZJ(C0CHQ.LIZ.getFilesDir().getAbsolutePath()), multiEditVideoRecordData.curRecordingDir), false, 8);
            }
            multiEditVideoRecordData.curRecordingDir = strLIZLLL;
        }
    }
}
