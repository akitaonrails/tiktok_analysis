package X;

import com.ss.bytertc.engine.video.VideoFrame;

/* JADX INFO: renamed from: X.0jCl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271970jCl implements InterfaceC1271820jCW {
    public final VideoFrame LIZ;

    public final void LIZ() {
        VideoFrame videoFrame = this.LIZ;
        if (videoFrame != null) {
            videoFrame.release();
        }
    }

    public C1271970jCl(VideoFrame videoFrame) {
        this.LIZ = videoFrame;
    }
}
