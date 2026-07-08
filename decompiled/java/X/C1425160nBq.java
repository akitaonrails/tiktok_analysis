package X;

import android.view.TextureView;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.services.mvtemplate.AVVideoViewComponentFactoryImpl;

/* JADX INFO: renamed from: X.0nBq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1425160nBq implements InterfaceC1425180nBs {
    public final C1DRG LIZ;
    public final InterfaceC1425180nBs LIZIZ;

    @Override // X.InterfaceC1425180nBs
    public final long getCurrentPosition() {
        InterfaceC1425180nBs interfaceC1425180nBs = this.LIZIZ;
        if (interfaceC1425180nBs != null) {
            return interfaceC1425180nBs.getCurrentPosition();
        }
        return 0L;
    }

    @Override // X.InterfaceC1425180nBs
    public final long getVideoDuration() {
        InterfaceC1425180nBs interfaceC1425180nBs = this.LIZIZ;
        if (interfaceC1425180nBs != null) {
            return interfaceC1425180nBs.getVideoDuration();
        }
        return 0L;
    }

    @Override // X.InterfaceC1425180nBs
    public final boolean isPlaying() {
        InterfaceC1425180nBs interfaceC1425180nBs = this.LIZIZ;
        if (interfaceC1425180nBs != null) {
            return interfaceC1425180nBs.isPlaying();
        }
        return false;
    }

    @Override // X.InterfaceC1425180nBs
    public final void mute() {
        InterfaceC1425180nBs interfaceC1425180nBs = this.LIZIZ;
        if (interfaceC1425180nBs != null) {
            interfaceC1425180nBs.mute();
        }
    }

    @Override // X.InterfaceC1425180nBs
    public final void pause() {
        InterfaceC1425180nBs interfaceC1425180nBs = this.LIZIZ;
        if (interfaceC1425180nBs != null) {
            interfaceC1425180nBs.pause();
        }
    }

    @Override // X.InterfaceC1425180nBs
    public final void stop() {
        InterfaceC1425180nBs interfaceC1425180nBs = this.LIZIZ;
        if (interfaceC1425180nBs != null) {
            interfaceC1425180nBs.stop();
        }
    }

    @Override // X.InterfaceC1425180nBs
    public final void unmute() {
        InterfaceC1425180nBs interfaceC1425180nBs = this.LIZIZ;
        if (interfaceC1425180nBs != null) {
            interfaceC1425180nBs.unmute();
        }
    }

    public C1425160nBq(C1DRG c1drg) {
        InterfaceC1424960nBW interfaceC1424960nBW;
        AVVideoViewComponentFactoryImpl aVVideoViewComponentFactoryImplLIZ;
        this.LIZ = c1drg;
        InterfaceC1425180nBs interfaceC1425180nBsCreate = null;
        if (c1drg != null && (interfaceC1424960nBW = (InterfaceC1424960nBW) c1drg.LJIIL(null, InterfaceC1424960nBW.class)) != null && (aVVideoViewComponentFactoryImplLIZ = interfaceC1424960nBW.LIZ()) != null) {
            interfaceC1425180nBsCreate = aVVideoViewComponentFactoryImplLIZ.create();
        }
        this.LIZIZ = interfaceC1425180nBsCreate;
    }

    @Override // X.InterfaceC1425180nBs
    public final void addPlayerListener(InterfaceC1425250nBz interfaceC1425250nBz) {
        InterfaceC1425180nBs interfaceC1425180nBs = this.LIZIZ;
        if (interfaceC1425180nBs != null) {
            interfaceC1425180nBs.addPlayerListener(interfaceC1425250nBz);
        }
    }

    @Override // X.InterfaceC1425180nBs
    public final int getCacheSize(Video video) {
        InterfaceC1425180nBs interfaceC1425180nBs = this.LIZIZ;
        if (interfaceC1425180nBs != null) {
            return interfaceC1425180nBs.getCacheSize(video);
        }
        return 0;
    }

    @Override // X.InterfaceC1425180nBs
    public final void seek(float f) {
        InterfaceC1425180nBs interfaceC1425180nBs = this.LIZIZ;
        if (interfaceC1425180nBs != null) {
            interfaceC1425180nBs.seek(f);
        }
    }

    @Override // X.InterfaceC1425180nBs
    public final void setForceNewPlay(boolean z) {
        InterfaceC1425180nBs interfaceC1425180nBs = this.LIZIZ;
        if (interfaceC1425180nBs != null) {
            interfaceC1425180nBs.setForceNewPlay(true);
        }
    }

    @Override // X.InterfaceC1425180nBs
    public final void setLoop(boolean z) {
        InterfaceC1425180nBs interfaceC1425180nBs = this.LIZIZ;
        if (interfaceC1425180nBs != null) {
            interfaceC1425180nBs.setLoop(false);
        }
    }

    @Override // X.InterfaceC1425180nBs
    public final void wrap(TextureView textureView) {
        InterfaceC1425180nBs interfaceC1425180nBs = this.LIZIZ;
        if (interfaceC1425180nBs != null) {
            interfaceC1425180nBs.wrap(textureView);
        }
    }

    @Override // X.InterfaceC1425180nBs
    public final void preloadVideo(Video video, int i) {
        InterfaceC1425180nBs interfaceC1425180nBs = this.LIZIZ;
        if (interfaceC1425180nBs != null) {
            interfaceC1425180nBs.preloadVideo(video, i);
        }
    }

    @Override // X.InterfaceC1425180nBs
    public final void tryResume(Video video, String str) {
        InterfaceC1425180nBs interfaceC1425180nBs = this.LIZIZ;
        if (interfaceC1425180nBs != null) {
            interfaceC1425180nBs.tryResume(video, str);
        }
    }
}
