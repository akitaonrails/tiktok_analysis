package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.Music;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0P0a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C637820P0a extends C09AY implements Function0<Unit> {
    public final /* synthetic */ VideoMusicTitleAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C637820P0a(VideoMusicTitleAssem videoMusicTitleAssem) {
        super(0);
        this.LL = videoMusicTitleAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        VideoMusicTitleAssem videoMusicTitleAssem = this.LL;
        videoMusicTitleAssem.getClass();
        C724270Sb3 c724270Sb3 = videoMusicTitleAssem.LLJI;
        Music musicLIZ = C631280OpS.LIZ(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme());
        if (musicLIZ != null) {
            C724270Sb3 c724270Sb32 = videoMusicTitleAssem.LLJI;
            Aweme aweme = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme();
            if (aweme == null || !AwemeExtKt.isScheduleVideo(aweme)) {
                videoMusicTitleAssem.Qq(musicLIZ);
            }
            videoMusicTitleAssem.Fp();
        }
        return Unit.LIZ;
    }
}
