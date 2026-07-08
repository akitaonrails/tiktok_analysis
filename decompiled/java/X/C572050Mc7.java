package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0Mc7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C572050Mc7 {
    public static VideoPublishEditModel LIZ;
    public static long LIZIZ;

    public static VideoPublishEditModel LIZ(Bundle bundle) {
        VideoPublishEditModel videoPublishEditModel = LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (videoPublishEditModel != null && jCurrentTimeMillis <= LIZIZ) {
            LIZ = null;
            LIZIZ = 0L;
            return videoPublishEditModel;
        }
        return (VideoPublishEditModel) bundle.getSerializable("args");
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        LIZ = videoPublishEditModel;
        LIZIZ = System.currentTimeMillis() + Mp4ScreenVideoLoadTimeout.CONTROL;
    }
}
