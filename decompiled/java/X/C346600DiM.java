package X;

import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0DiM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C346600DiM {
    public static final void LIZ(long j, NLESegmentVideo nLESegmentVideo) {
        long j2 = 0;
        if (j > 0 && nLESegmentVideo.getDuration() > 0) {
            long j3 = 2;
            long timeClipEnd = nLESegmentVideo.getTimeClipEnd() / j3;
            long j4 = j * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            long j5 = timeClipEnd - (j4 / j3);
            if (j5 > 0) {
                j2 = j5;
            }
            nLESegmentVideo.setTimeClipStart(j2);
            nLESegmentVideo.setTimeClipEnd(nLESegmentVideo.getTimeClipStart() + j4);
        }
    }
}
