package X;

import android.view.TextureView;
import com.ss.android.ugc.aweme.feed.model.Video;

/* JADX INFO: renamed from: X.0nBs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC1425180nBs {
    void addPlayerListener(InterfaceC1425250nBz interfaceC1425250nBz);

    int getCacheSize(Video video);

    long getCurrentPosition();

    long getVideoDuration();

    boolean isPlaying();

    void mute();

    void pause();

    void preloadVideo(Video video, int i);

    void seek(float f);

    void setForceNewPlay(boolean z);

    void setLoop(boolean z);

    void stop();

    void tryResume(Video video, String str);

    void unmute();

    void wrap(TextureView textureView);
}
