package X;

import com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarAssem;
import com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.16EN, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16EN extends C09AY implements Function2<VideoProgressBarAssem, C291001Au<? extends Integer>, Unit> {
    public C16EN(VideoProgressBarAssem videoProgressBarAssem) {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoProgressBarAssem videoProgressBarAssem, C291001Au<? extends Integer> c291001Au) {
        VideoProgressBarAssem videoProgressBarAssem2 = videoProgressBarAssem;
        if (c291001Au != null) {
            VideoProgressBarViewModel videoProgressBarViewModelEp = videoProgressBarAssem2.Ep();
            videoProgressBarViewModelEp.getClass();
            videoProgressBarViewModelEp.setState(new C16EF(true));
            videoProgressBarAssem2.Fp();
            videoProgressBarAssem2.Gp();
            videoProgressBarAssem2.Ip();
        }
        return Unit.LIZ;
    }
}
