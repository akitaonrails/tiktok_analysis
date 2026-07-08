package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.17q3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21152117q3 extends C09AY implements Function2<VideoMusicCoverAssem, Boolean, Unit> {
    public C21152117q3() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoMusicCoverAssem videoMusicCoverAssem, Boolean bool) {
        VideoMusicCoverAssem videoMusicCoverAssem2 = videoMusicCoverAssem;
        if (bool.booleanValue()) {
            videoMusicCoverAssem2.vq();
            videoMusicCoverAssem2.tq();
        }
        return Unit.LIZ;
    }
}
