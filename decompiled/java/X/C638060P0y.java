package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0P0y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C638060P0y extends C09AY implements Function2<VideoMusicTitleAssem, C291001Au<? extends C693070RGn>, Unit> {
    public C638060P0y() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoMusicTitleAssem videoMusicTitleAssem, C291001Au<? extends C693070RGn> c291001Au) {
        VideoMusicTitleAssem videoMusicTitleAssem2 = videoMusicTitleAssem;
        if (c291001Au != null) {
            videoMusicTitleAssem2.onPageSelected();
            videoMusicTitleAssem2.yq(false);
        }
        return Unit.LIZ;
    }
}
