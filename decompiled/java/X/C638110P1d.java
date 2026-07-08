package X;

import Y.ARunnableS109S0100000_9;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0P1d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C638110P1d extends C09AY implements Function2<VideoMusicTitleAssem, C291001Au<? extends Boolean>, Unit> {
    public C638110P1d() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoMusicTitleAssem videoMusicTitleAssem, C291001Au<? extends Boolean> c291001Au) {
        VideoMusicTitleAssem videoMusicTitleAssem2 = videoMusicTitleAssem;
        C291001Au<? extends Boolean> c291001Au2 = c291001Au;
        if (!C300900Bqq.LIZ() || ((Boolean) c291001Au2.LIZ).booleanValue()) {
            videoMusicTitleAssem2.Vp().LL.postValue(Boolean.FALSE);
            VideoMusicTitleVM videoMusicTitleVMXp = videoMusicTitleAssem2.Xp();
            videoMusicTitleVMXp.getClass();
            if ((!C300350Bpx.LIZIZ() || videoMusicTitleVMXp.LL) && !videoMusicTitleVMXp.wQ2()) {
                if (!C638120P1e.LIZ.needFixMarqueeAnim) {
                    videoMusicTitleVMXp.LL = false;
                    C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS109S0100000_9(videoMusicTitleVMXp, 10));
                } else if (videoMusicTitleVMXp.LL) {
                    videoMusicTitleVMXp.LL = false;
                    C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS109S0100000_9(videoMusicTitleVMXp, 12));
                }
            }
        }
        return Unit.LIZ;
    }
}
