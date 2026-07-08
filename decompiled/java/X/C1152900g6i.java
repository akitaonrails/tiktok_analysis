package X;

import com.ss.bytertc.engine.data.VideoCodecType;

/* JADX INFO: renamed from: X.0g6i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1152900g6i {
    public static String LIZ(int i) {
        if (i == VideoCodecType.VIDEO_CODEC_TYPE_H264.value()) {
            return "h264";
        }
        if (i == VideoCodecType.VIDEO_CODEC_TYPE_BYTEVC1.value()) {
            return "bytevc1";
        }
        return "";
    }
}
