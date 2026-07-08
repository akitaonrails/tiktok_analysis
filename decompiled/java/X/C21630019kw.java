package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.exp.PreviewEndLiveOptimizeConfig;

/* JADX INFO: renamed from: X.19kw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21630019kw {
    public static final PreviewEndLiveOptimizeConfig LIZ;

    static {
        PreviewEndLiveOptimizeConfig previewEndLiveOptimizeConfig = new PreviewEndLiveOptimizeConfig(false, false, Mp4ScreenVideoLoadTimeout.CONTROL);
        PreviewEndLiveOptimizeConfig previewEndLiveOptimizeConfig2 = (PreviewEndLiveOptimizeConfig) C0C64.LJIILLIIL().LJJII(PreviewEndLiveOptimizeConfig.class, previewEndLiveOptimizeConfig, "preview_live_end_optimize", true);
        if (previewEndLiveOptimizeConfig2 != null) {
            previewEndLiveOptimizeConfig = previewEndLiveOptimizeConfig2;
        }
        LIZ = previewEndLiveOptimizeConfig;
    }
}
