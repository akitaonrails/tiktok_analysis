package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0mVR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1398870mVR extends C09AY implements Function2<VideoMusicCoverAssem, C291001Au<? extends Boolean>, Unit> {
    public C1398870mVR() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoMusicCoverAssem videoMusicCoverAssem, C291001Au<? extends Boolean> c291001Au) {
        VideoMusicCoverAssem videoMusicCoverAssem2 = videoMusicCoverAssem;
        if (((Boolean) c291001Au.LIZ).booleanValue()) {
            videoMusicCoverAssem2.Up();
        }
        return Unit.LIZ;
    }
}
