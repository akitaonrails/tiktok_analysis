package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicBaseVM;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0P0e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C637860P0e extends C09AY implements Function2<VideoMusicTitleAssem, C291001Au<? extends Integer>, Unit> {
    public C637860P0e() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoMusicTitleAssem videoMusicTitleAssem, C291001Au<? extends Integer> c291001Au) {
        VideoMusicBaseVM videoMusicBaseVMVp;
        VideoItemParams item;
        VideoMusicTitleAssem videoMusicTitleAssem2 = videoMusicTitleAssem;
        if ((!C300900Bqq.LIZ() || c291001Au != null) && (item = (videoMusicBaseVMVp = videoMusicTitleAssem2.Vp()).getItem()) != null) {
            videoMusicBaseVMVp.setState(new C0P1S(videoMusicBaseVMVp, item));
        }
        return Unit.LIZ;
    }
}
