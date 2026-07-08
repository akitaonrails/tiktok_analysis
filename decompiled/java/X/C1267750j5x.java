package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.utils.VideoFrameStatics;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0j5x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1267750j5x extends C1269970j9X {
    public VideoFrameStatics LLILLL = new VideoFrameStatics(LSPassThroughRecordSizeConfig.DEFAULT);
    public boolean LLILZ;

    @Override // X.C1271610jCB
    public final void release() {
        this.LLILLL = null;
    }

    @Override // X.C1271610jCB
    public final String LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VirtualInputNode_");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1271610jCB
    public final Bundle LJFF(String str) {
        float realRatePerSecond;
        Bundle bundle = new Bundle();
        if (Intrinsics.LJFF(str, "key_in_cap_fps")) {
            VideoFrameStatics videoFrameStatics = this.LLILLL;
            if (videoFrameStatics != null) {
                realRatePerSecond = videoFrameStatics.getRealRatePerSecond();
            } else {
                realRatePerSecond = 0.0f;
            }
            bundle.putFloat("key_in_cap_fps", realRatePerSecond);
        }
        return bundle;
    }

    @Override // X.C1269970j9X, X.InterfaceC1269980j9Y
    public final void onData(VideoFrame videoFrame, Bundle bundle) {
        VideoFrameStatics videoFrameStatics;
        LJIIIZ(videoFrame, bundle);
        if (!this.LLILZ && (videoFrameStatics = this.LLILLL) != null) {
            videoFrameStatics.add();
        }
    }
}
