package X;

import com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarAssem;
import com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarViewModel;
import com.ss.android.ugc.aweme.feed.widget.LineProgressBar;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.16EL, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16EL extends C09AY implements Function2<VideoProgressBarAssem, C291001Au<? extends C0R9E>, Unit> {
    public C16EL(VideoProgressBarAssem videoProgressBarAssem) {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoProgressBarAssem videoProgressBarAssem, C291001Au<? extends C0R9E> c291001Au) {
        VideoProgressBarAssem videoProgressBarAssem2 = videoProgressBarAssem;
        if (c291001Au != null) {
            VideoProgressBarViewModel videoProgressBarViewModelEp = videoProgressBarAssem2.Ep();
            videoProgressBarViewModelEp.getClass();
            videoProgressBarViewModelEp.setState(new C16EF(false));
            videoProgressBarAssem2.Jp();
            videoProgressBarAssem2.Ip();
            if (!C19252910Tv.LIZIZ.o4()) {
                C2041907zF.LIZJ(videoProgressBarAssem2.LLLFF);
                LineProgressBar lineProgressBar = videoProgressBarAssem2.LLLFF;
                if (lineProgressBar != null) {
                    lineProgressBar.LIZLLL();
                }
            }
        }
        return Unit.LIZ;
    }
}
