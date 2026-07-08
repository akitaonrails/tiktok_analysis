package X;

import Y.ARunnableS132S0100000_32;
import com.ss.android.ugc.aweme.feed.assem.music.RecordMuteVM;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.1A9T, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A9T extends C09AY implements Function2<VideoMusicCoverAssem, C291001Au<? extends Boolean>, Unit> {
    public C1A9T() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoMusicCoverAssem videoMusicCoverAssem, C291001Au<? extends Boolean> c291001Au) {
        VideoMusicCoverAssem videoMusicCoverAssem2 = videoMusicCoverAssem;
        C291001Au<? extends Boolean> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            if (videoMusicCoverAssem2.LLLLZ) {
                C2174741A9g.LIZIZ.LIZLLL(videoMusicCoverAssem2.iq());
            }
            if (!((Boolean) c291001Au2.LIZ).booleanValue()) {
                C1AV2 c1av2LIZ = C1AV3.LIZ(4, "Feed", null, "music_cover");
                c1av2LIZ.LJI = true;
                videoMusicCoverAssem2.Bq(c1av2LIZ);
                videoMusicCoverAssem2.LLLLLLLLL = false;
                videoMusicCoverAssem2.LLLLLLLLLL = false;
                ARunnableS132S0100000_32 aRunnableS132S0100000_32 = videoMusicCoverAssem2.LLLLLLZ;
                if (aRunnableS132S0100000_32 != null) {
                    C2487409ou.LIZ(aRunnableS132S0100000_32);
                }
                RecordMuteVM recordMuteVM = (RecordMuteVM) videoMusicCoverAssem2.LLLF.getValue(videoMusicCoverAssem2, VideoMusicCoverAssem.LLLZ[1]);
                recordMuteVM.LL.clear();
                recordMuteVM.LLILLJJLI = true;
                videoMusicCoverAssem2.zq();
            } else {
                videoMusicCoverAssem2.yq();
            }
        }
        return Unit.LIZ;
    }
}
