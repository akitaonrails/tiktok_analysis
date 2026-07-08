package X;

import Y.ARunnableS109S0100000_9;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0P27, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0P27 extends C09AY implements Function2<VideoMusicCoverAssem, C291001Au<? extends Boolean>, Unit> {
    public C0P27() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoMusicCoverAssem videoMusicCoverAssem, C291001Au<? extends Boolean> c291001Au) {
        VideoItemParams item;
        Aweme aweme;
        VideoMusicCoverAssem videoMusicCoverAssem2 = videoMusicCoverAssem;
        C291001Au<? extends Boolean> c291001Au2 = c291001Au;
        if (!C300900Bqq.LIZ() || ((Boolean) c291001Au2.LIZ).booleanValue()) {
            VideoMusicCoverVM videoMusicCoverVMAq = videoMusicCoverAssem2.aq();
            videoMusicCoverVMAq.getClass();
            if (((C300350Bpx.LIZ() != 1 && C300350Bpx.LIZ() != 3) || ((Number) C0BAA.LIZ.getValue()).intValue() > 0) && (((item = videoMusicCoverVMAq.getItem()) == null || (aweme = item.getAweme()) == null || !C720360SNm.LJIIIZ(aweme)) && !videoMusicCoverVMAq.LL && !videoMusicCoverVMAq.vQ2() && !C0VTN.LIZJ().LIZLLL() && !C0R5C.LIZJ)) {
                if (!C638120P1e.LIZ.needFixMarqueeAnim) {
                    videoMusicCoverVMAq.LL = true;
                    C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS109S0100000_9(videoMusicCoverVMAq, 9));
                } else {
                    C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS109S0100000_9(videoMusicCoverVMAq, 11));
                }
            }
        }
        return Unit.LIZ;
    }
}
