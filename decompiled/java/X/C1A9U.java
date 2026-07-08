package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.1A9U, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A9U extends C09AY implements Function2<VideoMusicCoverAssem, Boolean, Unit> {
    public C1A9U() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoMusicCoverAssem videoMusicCoverAssem, Boolean bool) {
        VideoMusicCoverAssem videoMusicCoverAssem2 = videoMusicCoverAssem;
        boolean zBooleanValue = bool.booleanValue();
        videoMusicCoverAssem2.LLLL = zBooleanValue;
        videoMusicCoverAssem2.Gp(videoMusicCoverAssem2.LLLILZ, videoMusicCoverAssem2.LLLIIIL, zBooleanValue, videoMusicCoverAssem2.LLLLJI);
        videoMusicCoverAssem2.dq().LIZLLL();
        return Unit.LIZ;
    }
}
