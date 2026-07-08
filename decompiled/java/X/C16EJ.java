package X;

import com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarAssem;
import com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS43S0010000_31;

/* JADX INFO: renamed from: X.16EJ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16EJ extends C09AY implements Function2<VideoProgressBarAssem, C740360T2k, Unit> {
    public C16EJ() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoProgressBarAssem videoProgressBarAssem, C740360T2k c740360T2k) {
        boolean z;
        VideoProgressBarAssem videoProgressBarAssem2 = videoProgressBarAssem;
        C740360T2k c740360T2k2 = c740360T2k;
        if (c740360T2k2 != null) {
            VideoProgressBarViewModel videoProgressBarViewModelEp = videoProgressBarAssem2.Ep();
            if (c740360T2k2.LIZ != 4) {
                z = true;
            } else {
                z = false;
            }
            videoProgressBarViewModelEp.getClass();
            videoProgressBarViewModelEp.setState(new AwS43S0010000_31(z, 7));
        }
        return Unit.LIZ;
    }
}
