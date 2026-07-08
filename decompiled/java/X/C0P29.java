package X;

import Y.ARunnableS109S0100000_9;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0P29, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0P29 extends C09AY implements Function2<VideoMusicCoverAssem, C291001Au<? extends Boolean>, Unit> {
    public C0P29() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoMusicCoverAssem videoMusicCoverAssem, C291001Au<? extends Boolean> c291001Au) {
        VideoMusicCoverAssem videoMusicCoverAssem2 = videoMusicCoverAssem;
        if (((Boolean) c291001Au.LIZ).booleanValue()) {
            VideoMusicCoverVM videoMusicCoverVMAq = videoMusicCoverAssem2.aq();
            if (videoMusicCoverVMAq.LL && !videoMusicCoverVMAq.vQ2()) {
                if (!C638120P1e.LIZ.needFixMarqueeAnim) {
                    videoMusicCoverVMAq.LL = false;
                    C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS109S0100000_9(videoMusicCoverVMAq, 4));
                } else {
                    C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS109S0100000_9(videoMusicCoverVMAq, 5));
                }
            }
        }
        return Unit.LIZ;
    }
}
