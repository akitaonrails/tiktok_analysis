package X;

import com.ss.android.ugc.feed.platform.ab.LivePreviewScrollConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0OHR, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OHR extends C09AY implements Function0<LivePreviewScrollConfig> {
    public C0OHR() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.feed.platform.ab.LivePreviewScrollConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final LivePreviewScrollConfig invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        LivePreviewScrollConfig livePreviewScrollConfig = C0OHO.LIZ;
        ?? LJJII = c0c64LJIILLIIL.LJJII(LivePreviewScrollConfig.class, livePreviewScrollConfig, "live_preview_scroll_config_setting", true);
        return LJJII != 0 ? LJJII : livePreviewScrollConfig;
    }
}
