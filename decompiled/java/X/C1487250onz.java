package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.video.preload.experiment.VideoCoverPreloadConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0onz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1487250onz extends C09AY implements Function0<VideoCoverPreloadConfig> {
    public C1487250onz() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final VideoCoverPreloadConfig invoke() {
        VideoCoverPreloadConfig videoCoverPreloadConfig;
        try {
            videoCoverPreloadConfig = (VideoCoverPreloadConfig) C0C64.LJIILLIIL().LJJII(VideoCoverPreloadConfig.class, C1487260oo0.LIZ, "video_cover_preload_config", true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (videoCoverPreloadConfig != null) {
            return videoCoverPreloadConfig;
        }
        VideoCoverPreloadConfig videoCoverPreloadConfig2 = C1487260oo0.LIZ;
        return new VideoCoverPreloadConfig(false, false, false, 0);
    }
}
