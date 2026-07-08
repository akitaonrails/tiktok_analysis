package X;

import com.ss.android.ugc.aweme.feed.assem.progressbar.VideoProgressBarAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.16EP, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16EP extends C09AY implements Function2<VideoProgressBarAssem, C291001Au<? extends Boolean>, Unit> {
    public C16EP() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoProgressBarAssem videoProgressBarAssem, C291001Au<? extends Boolean> c291001Au) {
        VideoProgressBarAssem videoProgressBarAssem2 = videoProgressBarAssem;
        C291001Au<? extends Boolean> c291001Au2 = c291001Au;
        if (!C300900Bqq.LIZ() || ((Boolean) c291001Au2.LIZ).booleanValue()) {
            C736680Sv4.LJIJJ(videoProgressBarAssem2.Ep(), new C16EO(videoProgressBarAssem2));
        }
        return Unit.LIZ;
    }
}
