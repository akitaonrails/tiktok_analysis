package X;

import Y.ACallableS8S1101000_5;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F1c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383300F1c {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZJ(CreativeInfo creativeInfo) {
        String strLJJIFFI = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIFFI(creativeInfo);
        if (!C2354709Kn.LIZIZ(strLJJIFFI)) {
            new C0VSJ(strLJJIFFI).mkdirs();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJJIFFI);
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append("_cover_img.png");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZLLL(CreativeInfo creativeInfo) {
        String strLJJIFFI = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIFFI(creativeInfo);
        if (!C2354709Kn.LIZIZ(strLJJIFFI)) {
            new C0VSJ(strLJJIFFI).mkdirs();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJJIFFI);
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append("_cover_img_custom.png");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static MultiEditVideoRecordData LIZ(MultiEditVideoRecordData multiEditVideoRecordData, MultiEditVideoRecordData multiEditVideoRecordData2) {
        if (multiEditVideoRecordData2 == null || C580130Mp9.LIZ(multiEditVideoRecordData2.segmentDataList) || C580130Mp9.LIZ(multiEditVideoRecordData.segmentDataList)) {
            return multiEditVideoRecordData;
        }
        multiEditVideoRecordData.copyData(multiEditVideoRecordData2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : multiEditVideoRecordData2.segmentDataList) {
            Iterator<MultiEditVideoSegmentRecordData> it2 = multiEditVideoRecordData.segmentDataList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    MultiEditVideoSegmentRecordData next = it2.next();
                    if (multiEditVideoSegmentRecordData != null && !TextUtils.isEmpty(multiEditVideoSegmentRecordData.videoPath) && Intrinsics.LJFF(multiEditVideoSegmentRecordData.videoPath, next.videoPath) && !linkedHashMap.containsKey(Integer.valueOf(next.videoKey))) {
                        next.copyData(multiEditVideoSegmentRecordData);
                        linkedHashMap.put(Integer.valueOf(next.videoKey), Boolean.TRUE);
                        break;
                    }
                }
            }
        }
        return multiEditVideoRecordData;
    }

    public static MultiEditVideoRecordData LIZIZ(MultiEditVideoRecordData multiEditVideoRecordData, MultiEditVideoRecordData multiEditVideoRecordData2) {
        if (multiEditVideoRecordData != null && multiEditVideoRecordData.segmentDataList != null) {
            if (multiEditVideoRecordData2 == null) {
                return multiEditVideoRecordData.cloneData();
            }
            multiEditVideoRecordData2.concatVideo = multiEditVideoRecordData.concatVideo;
            multiEditVideoRecordData2.concatAudio = multiEditVideoRecordData.concatAudio;
            multiEditVideoRecordData2.useMusic = multiEditVideoRecordData.useMusic;
            multiEditVideoRecordData2.startTime = multiEditVideoRecordData.startTime;
            multiEditVideoRecordData2.endTime = multiEditVideoRecordData.endTime;
            multiEditVideoRecordData2.leftSlideX = multiEditVideoRecordData.leftSlideX;
            multiEditVideoRecordData2.rightSlideX = multiEditVideoRecordData.rightSlideX;
            multiEditVideoRecordData2.curRecordingDir = multiEditVideoRecordData.curRecordingDir;
            multiEditVideoRecordData2.setThreadSafeSegmentDataList(new ArrayList());
            Iterator<MultiEditVideoSegmentRecordData> it2 = multiEditVideoRecordData.segmentDataList.iterator();
            while (it2.hasNext()) {
                multiEditVideoRecordData2.segmentDataList.add(it2.next().cloneData());
            }
            multiEditVideoRecordData2.musicPath = multiEditVideoRecordData.musicPath;
            multiEditVideoRecordData2.originVolume = multiEditVideoRecordData.originVolume;
            multiEditVideoRecordData2.musicVolume = multiEditVideoRecordData.musicVolume;
            multiEditVideoRecordData2.hasRetake = multiEditVideoRecordData.hasRetake;
            multiEditVideoRecordData2.musicTrimIn = multiEditVideoRecordData.musicTrimIn;
            multiEditVideoRecordData2.musicDuration = multiEditVideoRecordData.musicDuration;
            multiEditVideoRecordData2.preVideoDuration = multiEditVideoRecordData.preVideoDuration;
            multiEditVideoRecordData2.coverPath = multiEditVideoRecordData.coverPath;
            return multiEditVideoRecordData2;
        }
        return new MultiEditVideoRecordData();
    }

    public static void LJ(Bitmap bitmap, String str, int i, Function0 function0) {
        if (bitmap != null && !bitmap.isRecycled()) {
            C15O7.LIZJ(new ACallableS8S1101000_5(bitmap, i, str, 0)).LJ(new C0FXC(function0, 0), C15O7.LJIIIIZZ, null);
        }
    }
}
