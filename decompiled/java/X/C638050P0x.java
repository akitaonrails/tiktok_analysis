package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0P0x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C638050P0x extends C09AY implements Function2<VideoMusicTitleAssem, Boolean, Unit> {
    public C638050P0x() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoMusicTitleAssem videoMusicTitleAssem, Boolean bool) {
        VideoMusicTitleAssem videoMusicTitleAssem2 = videoMusicTitleAssem;
        if (bool.booleanValue()) {
            videoMusicTitleAssem2.Eq(8);
        } else {
            videoMusicTitleAssem2.Eq(0);
        }
        return Unit.LIZ;
    }
}
