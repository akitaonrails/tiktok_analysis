package X;

import com.ss.bytertc.engine.video.VideoFrame;

/* JADX INFO: renamed from: X.0jGv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274550jGv implements InterfaceC1272490jDb {
    public final VideoFrame LIZ;

    @Override // X.InterfaceC1272490jDb
    public final /* synthetic */ void release(String str) {
    }

    @Override // X.InterfaceC1272490jDb
    public final /* synthetic */ void retain(String str) {
    }

    @Override // X.InterfaceC1272490jDb
    public final void release() {
        VideoFrame videoFrame = this.LIZ;
        if (videoFrame != null) {
            videoFrame.release();
        }
    }

    @Override // X.InterfaceC1272490jDb
    public final void retain() {
        VideoFrame videoFrame = this.LIZ;
        if (videoFrame != null) {
            videoFrame.retain();
        }
    }

    public C1274550jGv(VideoFrame videoFrame) {
        this.LIZ = videoFrame;
    }
}
