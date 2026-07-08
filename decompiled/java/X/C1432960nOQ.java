package X;

import android.os.Build;
import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS212S0000000_23;
import lth.o;

/* JADX INFO: renamed from: X.0nOQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432960nOQ {
    public static final C01GW<C1432960nOQ> LIZLLL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(361));
    public static final C01GW<C1512200pSE> LJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(360));
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(362));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(179));
    public final Integer[] LIZJ = {64, 128, 192, 256, 320, 384, 448, 512, 576, 640, 704, 768, 832, 896, 960, 1024, 1088, 1152, 1216, 1280, 1344, 1408, 1472, 1536, 1600, 1664, 1728, 1792, 1856, 1920, 1984, Integer.valueOf(SpeechEngineDefines.ASR_WORK_MODE_OFFLINE), 2112, 2176, 2240, 2304, 2368, 2432, 2496, 2560, 2624, 2688, 2752, 2816, 2880, 2944, 3008, 3072, 3136, 3200, 3264, 3328, 3392, 3456, 3520, 3584, 3648, 3712, 3776, 3840, 3904, 3968, 4032, Integer.valueOf(SpeechEngineDefines.TTS_WORK_MODE_BOTH), 4160, 4224, 4288, 4352, 4416, 4480, 4544, 4608, 4672, 4736, 4800, 4864, 4928, 4992};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v26, types: [com.google.gson.Gson] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.ss.android.ugc.aweme.publish.model.UploadSettingConfig] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.ss.android.ugc.aweme.publish.model.UploadSettingConfig] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static Map LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        float f;
        float speed;
        ?? r4;
        float f2;
        float f3;
        VideoFileInfo videoFileInfo;
        float duration;
        float fps;
        UploadAuthKeyConfig uploadAuthKeyConfig;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0CHQ.LIZ().getRegionService();
        linkedHashMap.put("country", C20186013yc.LIZ());
        linkedHashMap.put("content_source", C1404510meX.LIZ(videoPublishEditModel));
        float f4 = 1.0f;
        if (C1428470nHB.LL(videoPublishEditModel)) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        linkedHashMap.put("is_multi_video", Float.valueOf(f));
        if (!C1428470nHB.LJJLL(videoPublishEditModel)) {
            f4 = 0.0f;
        }
        linkedHashMap.put("is_filter", Float.valueOf(f4));
        linkedHashMap.put("os_api", Integer.valueOf(Build.VERSION.SDK_INT));
        long jCurrentTimeMillis = System.currentTimeMillis();
        C01GW c01gw = C1404790mez.LIZ;
        long j = -1;
        long j2 = ((Keva) c01gw.getValue()).getLong("upload_finish_timestamp", -1L);
        if (j2 != -1) {
            j = (jCurrentTimeMillis - j2) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
        linkedHashMap.put("last_time_diff", Long.valueOf(j));
        linkedHashMap.put("internet_speed", Integer.valueOf(o.LJIILJJIL.LJIIIZ()));
        UploadSpeedInfo uploadSpeedInfo = videoPublishEditModel.getUploadSpeedInfo();
        float bitrate = -1.0f;
        if (uploadSpeedInfo != null) {
            speed = uploadSpeedInfo.getSpeed();
        } else {
            speed = -1.0f;
        }
        linkedHashMap.put("upload_probe_speed", Float.valueOf(speed));
        linkedHashMap.put("last_upload_speed", Long.valueOf(((Keva) c01gw.getValue()).getLong("upload_speed", -1024L) / ((long) 1024)));
        C1444650nhH.LIZ.getClass();
        ?? LIZ = C1444650nhH.LIZ();
        VideoCutInfo videoCutInfo = null;
        try {
            uploadAuthKeyConfig = (UploadAuthKeyConfig) C0CHQ.LIZ().getGson().LJII(LIZ, UploadAuthKeyConfig.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("AuthkeyCache", LIZ);
            C1AF0.LIZLLL("AuthkeyCache", linkedHashMap2);
        }
        if (uploadAuthKeyConfig != null) {
            LIZ = uploadAuthKeyConfig.uploadSettingConfig;
            r4 = LIZ;
        } else {
            r4 = 0;
        }
        if (r4 != 0) {
            f2 = r4.hwEncodeScore;
        } else {
            f2 = -1.0f;
        }
        linkedHashMap.put("hw_encode_score", Float.valueOf(f2));
        if (r4 != 0) {
            f3 = r4.swEncodeScore;
        } else {
            f3 = -1.0f;
        }
        linkedHashMap.put("sw_encode_score", Float.valueOf(f3));
        if (videoPublishEditModel.getPreviewInfo() != null && (!videoPublishEditModel.getPreviewInfo().getVideoList().isEmpty())) {
            EditVideoSegment editVideoSegment = (EditVideoSegment) ListProtector.get(videoPublishEditModel.getPreviewInfo().getVideoList(), 0);
            videoFileInfo = editVideoSegment.getVideoFileInfo();
            videoCutInfo = editVideoSegment.getVideoCutInfo();
        } else {
            videoFileInfo = null;
        }
        if (videoCutInfo != null) {
            duration = videoCutInfo.getEnd() - videoCutInfo.getStart();
        } else if (videoFileInfo != null) {
            duration = videoFileInfo.getDuration();
        } else {
            duration = -1.0f;
        }
        if (videoFileInfo != null) {
            fps = videoFileInfo.getFps();
        } else {
            fps = -1.0f;
        }
        linkedHashMap.put("src_fps", Float.valueOf(fps));
        linkedHashMap.put("src_duration", Float.valueOf(duration));
        if (videoFileInfo != null) {
            bitrate = videoFileInfo.getBitrate();
        }
        linkedHashMap.put("src_bitrate", Float.valueOf(bitrate));
        Bundle bundle = new Bundle();
        C09GA c09gaLIZ = C212350188e.LIZJ().LIZ();
        C1300610jwx[] c1300610jwxArr = {C1300610jwx.LIZLLL, C1300610jwx.LJ, C1300610jwx.LIZJ, C1300610jwx.LJIIJ};
        if (c09gaLIZ != null) {
            c09gaLIZ.LJIILJJIL(c1300610jwxArr, bundle);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("byteBenchStrategy:");
        sbLIZ.append(c09gaLIZ);
        sbLIZ.append(" byteBenchScore:");
        sbLIZ.append(bundle);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        Object objLIZ = LIZ(bundle, "cpu_score");
        if (objLIZ == null) {
            objLIZ = Float.valueOf(0.0f);
        }
        linkedHashMap.put("cpu_score", objLIZ);
        Object objLIZ2 = LIZ(bundle, "gpu_score");
        if (objLIZ2 == null) {
            objLIZ2 = Float.valueOf(0.0f);
        }
        linkedHashMap.put("gpu_score", objLIZ2);
        Object objLIZ3 = LIZ(bundle, "overall_score");
        if (objLIZ3 == null) {
            objLIZ3 = Float.valueOf(0.0f);
        }
        linkedHashMap.put("overall_score", objLIZ3);
        Object objLIZ4 = LIZ(bundle, "video_record_scene");
        if (objLIZ4 == null) {
            objLIZ4 = Float.valueOf(0.0f);
        }
        linkedHashMap.put("video_record_scene", objLIZ4);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("input params: ");
        sbLIZ2.append(linkedHashMap);
        C201955140j.LIZIZ("UploadSmartSlice", C2188811AlT.LIZIZ(sbLIZ2));
        return linkedHashMap;
    }

    public static Object LIZ(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }
}
