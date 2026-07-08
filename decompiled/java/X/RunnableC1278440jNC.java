package X;

import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.bytertc.engine.video.converter.WebRTCConverter;

/* JADX INFO: renamed from: X.0jNC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class RunnableC1278440jNC implements Runnable {
    public final /* synthetic */ VideoFrame LL;

    public /* synthetic */ RunnableC1278440jNC(VideoFrame videoFrame) {
        this.LL = videoFrame;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebRTCConverter.lambda$semisugar$release$0(this.LL);
    }
}
