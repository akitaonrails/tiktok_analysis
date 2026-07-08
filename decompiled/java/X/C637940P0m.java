package X;

import Y.ARunnableS109S0100000_9;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0P0m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C637940P0m extends C09AY implements Function2<VideoMusicTitleAssem, Boolean, Unit> {
    public C637940P0m() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoMusicTitleAssem videoMusicTitleAssem, Boolean bool) {
        VideoMusicTitleAssem videoMusicTitleAssem2 = videoMusicTitleAssem;
        if (bool.booleanValue()) {
            C2041907zF.LIZ(videoMusicTitleAssem2.LLLIIII, new ARunnableS109S0100000_9(videoMusicTitleAssem2, 6));
        }
        return Unit.LIZ;
    }
}
