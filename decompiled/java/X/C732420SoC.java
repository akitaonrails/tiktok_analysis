package X;

import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS377S0200000_11;

/* JADX INFO: renamed from: X.0SoC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732420SoC extends C09AY implements Function2<VideoShareAssem, C291001Au<? extends VideoItemParams>, Unit> {
    public C732420SoC() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoShareAssem videoShareAssem, C291001Au<? extends VideoItemParams> c291001Au) {
        VideoShareAssem videoShareAssem2 = videoShareAssem;
        C291001Au<? extends VideoItemParams> c291001Au2 = c291001Au;
        if (c291001Au2 == null) {
            videoShareAssem2.getClass();
        } else {
            VideoShareViewModel videoShareViewModelJp = videoShareAssem2.Jp();
            VideoItemParams videoItemParams = (VideoItemParams) c291001Au2.LIZ;
            videoShareViewModelJp.getClass();
            if (videoItemParams != null) {
                videoShareViewModelJp.setState(new AwS377S0200000_11(videoShareViewModelJp, videoItemParams, 147));
            }
        }
        return Unit.LIZ;
    }
}
