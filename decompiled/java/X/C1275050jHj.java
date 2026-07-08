package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.bytertc.engine.VideoEncoderConfig;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.VideoSolutionMode;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.util.List;

/* JADX INFO: renamed from: X.0jHj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1275050jHj {
    public final C1274890jHT LIZ;

    public final void LIZ(List<VideoEncoderConfig> list) {
        if (this.LIZ != null) {
            VideoSolutionMode videoSolutionMode = VideoSolutionMode.VIDEO_SOLUTION_MODE_SINGLE;
            if (list.size() == 2) {
                videoSolutionMode = VideoSolutionMode.VIDEO_SOLUTION_MODE_SIMULCAST;
            }
            VideoEncoderConfig[] videoEncoderConfigArr = (VideoEncoderConfig[]) list.toArray(new VideoEncoderConfig[0]);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateEncodeConfig configs:configs");
            sbLIZ.append(list);
            sbLIZ.append(" videoSolutionMode:");
            sbLIZ.append(videoSolutionMode);
            AVLog.logKibana(4, "LinkMicEncodeParamsManager", C2188811AlT.LIZIZ(sbLIZ), null);
            C1274890jHT c1274890jHT = this.LIZ;
            StreamIndex streamIndex = StreamIndex.STREAM_INDEX_MAIN;
            c1274890jHT.setVideoEncoderConfig(streamIndex, videoSolutionMode, videoEncoderConfigArr, list.size());
            VideoEncoderConfig videoEncoderConfig = (VideoEncoderConfig) ListProtector.get(list, list.size() - 1);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setVideoPerformanceConfig width:");
            sbLIZ2.append(videoEncoderConfig.width);
            sbLIZ2.append(" height:");
            sbLIZ2.append(videoEncoderConfig.height);
            sbLIZ2.append(" frameRate:");
            sbLIZ2.append(videoEncoderConfig.frameRate);
            AVLog.logKibana(4, "LinkMicEncodeParamsManager", C2188811AlT.LIZIZ(sbLIZ2), null);
            this.LIZ.setVideoPerformanceConfig(streamIndex, videoEncoderConfig.width, videoEncoderConfig.height, videoEncoderConfig.frameRate);
        }
    }

    public C1275050jHj(C1274890jHT c1274890jHT, C1274810jHL c1274810jHL) {
        this.LIZ = c1274890jHT;
    }
}
