package X;

import android.os.Bundle;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.engine.VideoSink;
import com.ss.ttlivestreamer.core.utils.VideoFrameStatics;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0j3l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1266390j3l extends C1269970j9X {
    public C1267500j5Y LLILZ;
    public volatile boolean LLILZIL;
    public C1269850j9L LLIZ;
    public final VideoFrameStatics LLILZLL = new VideoFrameStatics(2000);
    public final Map<EnumC1267970j6J, VideoSink> LLILLL = new HashMap(2);

    @Override // X.C1271610jCB
    public final void release() {
        this.LLILZIL = true;
    }

    public final void LJIIJJI(VideoFrame videoFrame) {
        if (!this.LLILZIL) {
            LJIIL(EnumC1267970j6J.TYPE_LIVECORE, videoFrame);
            LJIIL(EnumC1267970j6J.TYPE_RENDER, videoFrame);
            C1269850j9L c1269850j9L = this.LLIZ;
            if (c1269850j9L != null) {
                c1269850j9L.LIZJ(EnumC1269840j9K.DURATION_TYPE_PRE_ENCODE, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
            }
            if (this.LLILZ.LIZ.mPushBase.LJIJJLI()) {
                LJIIL(EnumC1267970j6J.TYPE_PUSHER, videoFrame);
                LJIIL(EnumC1267970j6J.TYPE_RTC, videoFrame);
                VideoFrameStatics videoFrameStatics = this.LLILZLL;
                if (videoFrameStatics != null) {
                    videoFrameStatics.add();
                }
            }
            if (this.LLILZ.LIZ.LJI) {
                LJIIIZ(videoFrame, new Bundle());
            }
        }
    }

    public final void LJIILIIL(EnumC1267970j6J enumC1267970j6J) {
        ((HashMap) this.LLILLL).remove(enumC1267970j6J);
    }

    public final void LJIIJ(EnumC1267970j6J enumC1267970j6J, VideoSink videoSink) {
        ((HashMap) this.LLILLL).put(enumC1267970j6J, videoSink);
    }

    public final void LJIIL(EnumC1267970j6J enumC1267970j6J, VideoFrame videoFrame) {
        VideoSink videoSink = (VideoSink) ((HashMap) this.LLILLL).get(enumC1267970j6J);
        if (videoSink == null) {
            return;
        }
        videoSink.onFrameOnJava(videoFrame);
    }
}
