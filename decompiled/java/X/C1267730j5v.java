package X;

import android.os.Bundle;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.engine.VideoSink;
import com.ss.ttlivestreamer.core.utils.VideoFrameStatics;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0j5v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1267730j5v extends C1267740j5w {
    public VideoSink LLILLL;
    public VideoSink LLILZ;
    public boolean LLILZLL;
    public EnumC1267980j6K LLILLJJLI = EnumC1267980j6K.NORMAL_LIVE;
    public final VideoFrameStatics LLILZIL = new VideoFrameStatics(2000);

    @Override // X.C1271610jCB
    public final String LIZLLL() {
        int i = C1267510j5Z.LIZ[this.LLILLJJLI.ordinal()];
        if (i == 1 || i == 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VeLiveVideoSink_");
            sbLIZ.append(this.LL);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("RtcVideoSink_");
        sbLIZ2.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // X.C1271610jCB
    public final Bundle LJFF(String str) {
        Bundle bundle = new Bundle();
        if (Intrinsics.LJFF(str, "key_pre_encode_fps")) {
            bundle.putFloat("key_pre_encode_fps", this.LLILZIL.getRealRatePerSecond());
        }
        return bundle;
    }

    @Override // X.C1267740j5w, X.InterfaceC1269980j9Y
    public final void onData(VideoFrame videoFrame, Bundle bundle) {
        if (!this.LLILZLL) {
            this.LLILZIL.add();
        }
        int i = C1267510j5Z.LIZ[this.LLILLJJLI.ordinal()];
        if (i != 1 && i != 2) {
            VideoSink videoSink = this.LLILZ;
            if (videoSink != null) {
                videoSink.onData(videoFrame, bundle);
                return;
            }
            return;
        }
        VideoSink videoSink2 = this.LLILLL;
        if (videoSink2 == null) {
            return;
        }
        videoSink2.onData(videoFrame, bundle);
    }
}
