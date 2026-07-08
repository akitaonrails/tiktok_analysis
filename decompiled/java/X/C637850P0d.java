package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0P0d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C637850P0d extends C09AY implements Function2<VideoMusicTitleAssem, C291001Au<? extends Boolean>, Unit> {
    public C637850P0d() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoMusicTitleAssem videoMusicTitleAssem, C291001Au<? extends Boolean> c291001Au) {
        VideoMusicTitleAssem videoMusicTitleAssem2 = videoMusicTitleAssem;
        C291001Au<? extends Boolean> c291001Au2 = c291001Au;
        if (!C300900Bqq.LIZ() || ((Boolean) c291001Au2.LIZ).booleanValue()) {
            videoMusicTitleAssem2.Vp().LL.postValue(Boolean.TRUE);
            videoMusicTitleAssem2.Xp().yQ2();
        }
        return Unit.LIZ;
    }
}
