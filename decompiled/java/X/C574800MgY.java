package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditTrimState;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MusicSyncData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VETimelineParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MgY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C574800MgY {
    public static final MultiEditVideoRecordData LIZIZ(List<? extends EditVideoSegment> list) {
        int rotate;
        long start;
        long duration;
        long jLongValue;
        float speed;
        long duration2;
        Long l;
        String audioPath;
        if (list == null) {
            return null;
        }
        MultiEditVideoRecordData multiEditVideoRecordData = new MultiEditVideoRecordData();
        multiEditVideoRecordData.useMusic = true;
        multiEditVideoRecordData.concatAudio = "";
        multiEditVideoRecordData.concatVideo = "";
        multiEditVideoRecordData.curRecordingDir = "";
        multiEditVideoRecordData.startTime = 0L;
        multiEditVideoRecordData.setThreadSafeSegmentDataList(new ArrayList(list.size()));
        Iterator<? extends EditVideoSegment> it2 = list.iterator();
        while (true) {
            rotate = 0;
            if (!it2.hasNext()) {
                break;
            }
            EditVideoSegment next = it2.next();
            List<MultiEditVideoSegmentRecordData> list2 = multiEditVideoRecordData.segmentDataList;
            MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = new MultiEditVideoSegmentRecordData();
            multiEditVideoSegmentRecordData.videoPath = next.getVideoPath();
            if (!Intrinsics.LJFF(next.getVideoPath(), next.getAudioPath()) && (audioPath = next.getAudioPath()) != null && audioPath.length() != 0) {
                multiEditVideoSegmentRecordData.audioPath = next.getAudioPath();
            }
            VideoCutInfo videoCutInfo = next.getVideoCutInfo();
            if (videoCutInfo != null) {
                start = videoCutInfo.getStart();
            } else {
                start = 0;
            }
            multiEditVideoSegmentRecordData.setStartTime(start);
            VideoCutInfo videoCutInfo2 = next.getVideoCutInfo();
            if (videoCutInfo2 != null) {
                duration = videoCutInfo2.getEnd();
            } else {
                duration = next.getVideoFileInfo().getDuration();
            }
            multiEditVideoSegmentRecordData.setEndTime(duration);
            Object obj = next.getExtra().get("create_time");
            if ((obj instanceof Long) && (l = (Long) obj) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            multiEditVideoSegmentRecordData.setCreateTime(jLongValue);
            if (TextUtils.isEmpty(multiEditVideoSegmentRecordData.draftVideoPath)) {
                multiEditVideoSegmentRecordData.draftVideoPath = next.getVideoPath();
            }
            if (TextUtils.isEmpty(multiEditVideoSegmentRecordData.fastImportOriginVideoPath)) {
                multiEditVideoSegmentRecordData.fastImportOriginVideoPath = next.getVideoPath();
            }
            multiEditVideoSegmentRecordData.videoLength = next.getVideoFileInfo().getDuration() * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            VideoCutInfo videoCutInfo3 = next.getVideoCutInfo();
            if (videoCutInfo3 != null) {
                speed = videoCutInfo3.getSpeed();
            } else {
                speed = 1.0f;
            }
            multiEditVideoSegmentRecordData.setVideoSpeed(speed);
            VideoCutInfo videoCutInfo4 = next.getVideoCutInfo();
            if (videoCutInfo4 != null) {
                rotate = videoCutInfo4.getRotate();
            }
            multiEditVideoSegmentRecordData.rotate = rotate;
            multiEditVideoSegmentRecordData.width = next.getVideoFileInfo().getWidth();
            multiEditVideoSegmentRecordData.height = next.getVideoFileInfo().getHeight();
            multiEditVideoSegmentRecordData.aigcInfo = next.getAigcInfo();
            list2.add(multiEditVideoSegmentRecordData);
            long j = multiEditVideoRecordData.endTime;
            VideoCutInfo videoCutInfo5 = next.getVideoCutInfo();
            if (videoCutInfo5 != null) {
                duration2 = videoCutInfo5.getEnd() - videoCutInfo5.getStart();
            } else {
                duration2 = next.getVideoFileInfo().getDuration();
            }
            multiEditVideoRecordData.endTime = j + duration2;
        }
        List<MultiEditVideoSegmentRecordData> list3 = multiEditVideoRecordData.segmentDataList;
        if (list3 != null) {
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 : list3) {
                int i = rotate + 1;
                if (rotate >= 0) {
                    multiEditVideoSegmentRecordData2.videoKey = rotate;
                    rotate = i;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return multiEditVideoRecordData;
    }

    public static final VERecordData LIZJ(MultiEditVideoRecordData multiEditVideoRecordData) {
        ArrayList arrayList = new ArrayList();
        List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
        ArrayList<MultiEditVideoSegmentRecordData> arrayList2 = new ArrayList();
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
            if (multiEditVideoSegmentRecordData.enable) {
                arrayList2.add(multiEditVideoSegmentRecordData);
            }
        }
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 : arrayList2) {
            String strLJI = LJI(multiEditVideoSegmentRecordData2.videoPath, multiEditVideoSegmentRecordData2.draftVideoPath);
            String strLJI2 = LJI(multiEditVideoSegmentRecordData2.audioPath, multiEditVideoSegmentRecordData2.draftAudioPath);
            long j = multiEditVideoSegmentRecordData2.videoLength;
            long j2 = multiEditVideoSegmentRecordData2.audioLength;
            float f = multiEditVideoSegmentRecordData2.audioSpeed;
            long startTime = multiEditVideoSegmentRecordData2.getStartTime();
            long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
            VERecordData.VERecordSegmentData vERecordSegmentData = new VERecordData.VERecordSegmentData(strLJI, j, strLJI2, j2, f, startTime * j3, multiEditVideoSegmentRecordData2.getEndTime() * j3, multiEditVideoSegmentRecordData2.enable);
            vERecordSegmentData.mRotate = C571620MbQ.LIZJ(multiEditVideoSegmentRecordData2.rotate);
            vERecordSegmentData.mVideoSpeed = multiEditVideoSegmentRecordData2.getVideoSpeed();
            arrayList.add(vERecordSegmentData);
        }
        VERecordData vERecordData = new VERecordData(arrayList, multiEditVideoRecordData.useMusic);
        vERecordData.concatVideo = multiEditVideoRecordData.concatVideo;
        vERecordData.concatAudio = multiEditVideoRecordData.concatAudio;
        return vERecordData;
    }

    public static final VETimelineParams LIZLLL(MultiEditVideoRecordData multiEditVideoRecordData) {
        int size = multiEditVideoRecordData.segmentDataList.size();
        String[] strArr = new String[size];
        double[] dArr = new double[size];
        ROTATE_DEGREE[] rotate_degreeArr = new ROTATE_DEGREE[size];
        boolean[] zArr = new boolean[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            zArr[i2] = true;
        }
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : multiEditVideoRecordData.segmentDataList) {
            int i3 = i + 1;
            if (i >= 0) {
                MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 = multiEditVideoSegmentRecordData;
                String str = multiEditVideoSegmentRecordData2.videoPath;
                str.toString();
                strArr[i] = str;
                dArr[i] = multiEditVideoSegmentRecordData2.getVideoSpeed();
                rotate_degreeArr[i] = C571620MbQ.LIZJ(multiEditVideoSegmentRecordData2.rotate);
                zArr[i] = multiEditVideoSegmentRecordData2.enable;
                iArr[i] = (int) multiEditVideoSegmentRecordData2.getStartTime();
                iArr2[i] = (int) multiEditVideoSegmentRecordData2.getEndTime();
                i = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        VETimelineParams vETimelineParams = new VETimelineParams(strArr);
        vETimelineParams.speed = dArr;
        vETimelineParams.rotate = rotate_degreeArr;
        vETimelineParams.enable = zArr;
        vETimelineParams.vTrimIn = iArr;
        vETimelineParams.vTrimOut = iArr2;
        return vETimelineParams;
    }

    public static final List<VideoSegment> LJ(MultiEditVideoRecordData multiEditVideoRecordData) {
        VideoSegment videoSegment;
        long originStartTime;
        long originEndTime;
        boolean enable;
        boolean z;
        List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
        if (list != null && !list.isEmpty()) {
            List<MultiEditVideoSegmentRecordData> list2 = multiEditVideoRecordData.segmentDataList;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list2) {
                if (((IPoiVideoPublishService) ServiceManager.get().getService(IPoiService.class)).enableReadLocationMetaData()) {
                    String str = multiEditVideoSegmentRecordData.fastImportOriginVideoPath;
                    if (str == null) {
                        str = multiEditVideoSegmentRecordData.videoPath;
                    }
                    videoSegment = new VideoSegment(multiEditVideoSegmentRecordData.videoPath, str, multiEditVideoSegmentRecordData.width, multiEditVideoSegmentRecordData.height, (int) (multiEditVideoSegmentRecordData.videoLength / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                } else {
                    String str2 = multiEditVideoSegmentRecordData.videoPath;
                    videoSegment = new VideoSegment(str2, str2, multiEditVideoSegmentRecordData.width, multiEditVideoSegmentRecordData.height, (int) (multiEditVideoSegmentRecordData.videoLength / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                }
                videoSegment.LJIIL(multiEditVideoSegmentRecordData.getVideoSpeed());
                videoSegment.rotate = multiEditVideoSegmentRecordData.rotate;
                MultiEditTrimState multiEditTrimState = multiEditVideoSegmentRecordData.multiEditTrimState;
                if (multiEditTrimState != null) {
                    originStartTime = multiEditTrimState.getStartTime();
                } else {
                    originStartTime = multiEditVideoSegmentRecordData.getOriginStartTime();
                }
                if (videoSegment.LJIIIIZZ()) {
                    videoSegment.stickPointVideoSegment.setVideoStart(originStartTime);
                } else {
                    videoSegment.start = originStartTime;
                }
                MultiEditTrimState multiEditTrimState2 = multiEditVideoSegmentRecordData.multiEditTrimState;
                if (multiEditTrimState2 != null) {
                    originEndTime = multiEditTrimState2.getEndTime();
                } else {
                    originEndTime = multiEditVideoSegmentRecordData.getOriginEndTime();
                }
                videoSegment.LJIIJ(originEndTime);
                videoSegment.date = multiEditVideoSegmentRecordData.getCreateTime();
                MultiEditTrimState multiEditTrimState3 = multiEditVideoSegmentRecordData.multiEditTrimState;
                if (multiEditTrimState3 != null) {
                    enable = multiEditTrimState3.getEnable();
                } else {
                    enable = multiEditVideoSegmentRecordData.enable;
                }
                videoSegment.isDeleted = !enable;
                int i = multiEditVideoSegmentRecordData.videoKey;
                videoSegment.videoIndex = i;
                MusicSyncData musicSyncData = multiEditVideoSegmentRecordData.musicSyncData;
                if (musicSyncData != null) {
                    z = true;
                } else {
                    z = false;
                }
                videoSegment.isStickPointMode = z;
                if (musicSyncData != null) {
                    videoSegment.stickPointVideoSegment = new C574370Mfr(i, musicSyncData.getVideoStart(), musicSyncData.getVideoEnd() - musicSyncData.getVideoStart(), multiEditVideoSegmentRecordData.videoLength / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                }
                videoSegment.aigcInfo = multiEditVideoSegmentRecordData.aigcInfo;
                if (C298040BmE.LIZ()) {
                    C0CHQ.LIZ().LJIILL().updateMediaTypeCache(multiEditVideoSegmentRecordData.videoPath);
                }
                arrayList.add(videoSegment);
            }
            int i2 = 0;
            for (Object obj : arrayList) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    ((VideoSegment) obj).videoIndex = i2;
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static final List<VideoSegment> LJFF(CanvasVideoData canvasVideoData) {
        String str;
        int i;
        int i2;
        int i3;
        float f;
        long j;
        ArrayList arrayList = new ArrayList();
        List<String> list = canvasVideoData.sourceInfo;
        if (list != null && (str = (String) C13LP.LJJJJZI(list)) != null) {
            CanvasExtra canvasExtra = canvasVideoData.extra;
            if (canvasExtra != null) {
                i = canvasExtra.width;
                i2 = canvasExtra.height;
                i3 = canvasExtra.duration;
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
            }
            VideoSegment videoSegment = new VideoSegment(str, str, i, i2, i3);
            CanvasExtra canvasExtra2 = canvasVideoData.extra;
            if (canvasExtra2 != null) {
                f = canvasExtra2.speed;
            } else {
                f = 1.0f;
            }
            videoSegment.LJIIL(f);
            CanvasExtra canvasExtra3 = canvasVideoData.extra;
            long endTime = 0;
            if (canvasExtra3 != null) {
                j = canvasExtra3.startTime;
            } else {
                j = 0;
            }
            if (videoSegment.LJIIIIZZ()) {
                videoSegment.stickPointVideoSegment.setVideoStart(j);
            } else {
                videoSegment.start = j;
            }
            CanvasExtra canvasExtra4 = canvasVideoData.extra;
            if (canvasExtra4 != null) {
                endTime = canvasExtra4.getEndTime();
            }
            videoSegment.LJIIJ(endTime);
            videoSegment.videoIndex = 0;
            videoSegment.aigcInfo = canvasVideoData.aigcInfo;
            arrayList.add(videoSegment);
        }
        return arrayList;
    }

    public static final List<MultiEditVideoSegmentRecordData> LJII(MultiEditVideoRecordData multiEditVideoRecordData) {
        List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
        ArrayList arrayList = new ArrayList();
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
            if (multiEditVideoSegmentRecordData.enable) {
                arrayList.add(multiEditVideoSegmentRecordData);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData LIZ(com.ss.android.vesdk.VERecordData r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C574800MgY.LIZ(com.ss.android.vesdk.VERecordData, java.lang.String):com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData");
    }

    public static final String LJI(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getCompleteFilePath -> record path:");
        sbLIZ.append(str);
        sbLIZ.append(", draft path:");
        sbLIZ.append(str2);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(str, str2)) {
            return str;
        }
        if (!C2286708xd.LIZJ(str2)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getCompleteFilePath -> draft video path:");
            sbLIZ2.append(str2);
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ2));
            return str;
        }
        long length = new C0VSJ(str2).length();
        long length2 = new C0VSJ(str).length();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("record length:");
        sbLIZ3.append(length2);
        sbLIZ3.append(", draft length");
        sbLIZ3.append(length);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
        if (length2 < length) {
            return str2;
        }
        return str;
    }

    public static final void LJIIIZ(MultiEditVideoRecordData multiEditVideoRecordData, List<? extends VideoSegment> list) {
        VideoSegment videoSegment;
        List<MultiEditVideoSegmentRecordData> list2 = multiEditVideoRecordData.segmentDataList;
        if (list2 != null) {
            int i = 0;
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list2) {
                int i2 = i + 1;
                if (i >= 0) {
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 = multiEditVideoSegmentRecordData;
                    if (i < list.size() && (videoSegment = (VideoSegment) C13LP.LJJJLZIJ(i, list)) != null) {
                        LJIIJ(multiEditVideoSegmentRecordData2, videoSegment);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public static final void LJIIJ(MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData, VideoSegment videoSegment) {
        MusicSyncData musicSyncData;
        C574370Mfr c574370Mfr;
        if (videoSegment.LJIIIIZZ() && (c574370Mfr = videoSegment.stickPointVideoSegment) != null) {
            musicSyncData = new MusicSyncData(c574370Mfr.getVideoStart(), c574370Mfr.getVideoEnd(), c574370Mfr.getVideoDuration());
        } else {
            musicSyncData = null;
        }
        multiEditVideoSegmentRecordData.musicSyncData = musicSyncData;
        multiEditVideoSegmentRecordData.enable = !videoSegment.isDeleted;
        multiEditVideoSegmentRecordData.setStartTime(videoSegment.LJII());
        multiEditVideoSegmentRecordData.setEndTime(videoSegment.LIZLLL());
    }

    public static final void LJIIIIZZ(MultiEditVideoRecordData multiEditVideoRecordData, long j, long j2) {
        if (j2 <= j) {
            return;
        }
        long j3 = 0;
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : multiEditVideoRecordData.segmentDataList) {
            if (multiEditVideoSegmentRecordData.enable) {
                multiEditVideoSegmentRecordData.multiEditTrimState = new MultiEditTrimState(multiEditVideoSegmentRecordData.enable, multiEditVideoSegmentRecordData.getOriginStartTime(), multiEditVideoSegmentRecordData.getOriginEndTime());
                long endTime = multiEditVideoSegmentRecordData.getEndTime() - multiEditVideoSegmentRecordData.getStartTime();
                if (j3 < j || j3 + endTime > j2) {
                    if (j3 + endTime > j && j3 < j2) {
                        long startTime = (j - j3) + multiEditVideoSegmentRecordData.getStartTime();
                        long startTime2 = (j2 - j3) + multiEditVideoSegmentRecordData.getStartTime();
                        if (startTime <= multiEditVideoSegmentRecordData.getStartTime()) {
                            startTime = multiEditVideoSegmentRecordData.getStartTime();
                        }
                        multiEditVideoSegmentRecordData.setStartTime(startTime);
                        if (startTime2 > multiEditVideoSegmentRecordData.getEndTime()) {
                            startTime2 = multiEditVideoSegmentRecordData.getEndTime();
                        }
                        multiEditVideoSegmentRecordData.setEndTime(startTime2);
                    } else {
                        multiEditVideoSegmentRecordData.enable = false;
                    }
                }
                j3 += endTime;
            }
        }
    }
}
