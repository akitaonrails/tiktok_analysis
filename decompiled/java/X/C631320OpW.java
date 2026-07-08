package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicBaseVM;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0OpW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631320OpW extends C09AY implements Function2<VideoMusicTitleAssem, Double, Unit> {
    public C631320OpW() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoMusicTitleAssem videoMusicTitleAssem, Double d) {
        VideoMusicTitleAssem videoMusicTitleAssem2 = videoMusicTitleAssem;
        Double d2 = d;
        if (d2 != null) {
            d2.doubleValue();
            double dDoubleValue = d2.doubleValue();
            VideoMusicBaseVM videoMusicBaseVMVp = videoMusicTitleAssem2.Vp();
            if (videoMusicBaseVMVp.LLILLJJLI.hasActiveObservers()) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C631310OpV(videoMusicBaseVMVp, dDoubleValue, null), 3);
            }
        }
        return Unit.LIZ;
    }
}
