package X;

import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicBaseVM;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0P1h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C638150P1h extends C09AY implements Function2<VideoMusicCoverAssem, C291001Au<? extends Integer>, Unit> {
    public C638150P1h() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoMusicCoverAssem videoMusicCoverAssem, C291001Au<? extends Integer> c291001Au) {
        VideoMusicBaseVM videoMusicBaseVMBp;
        VideoItemParams item;
        VideoMusicCoverAssem videoMusicCoverAssem2 = videoMusicCoverAssem;
        if ((!C300900Bqq.LIZ() || c291001Au != null) && (item = (videoMusicBaseVMBp = videoMusicCoverAssem2.Bp()).getItem()) != null) {
            videoMusicBaseVMBp.setState(new C0P1S(videoMusicBaseVMBp, item));
        }
        return Unit.LIZ;
    }
}
