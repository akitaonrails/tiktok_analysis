package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.feed.platform.cell.interact.hotspot.FeedUnifiedSpacingOptimizeConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RLk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C694340RLk extends C09AY implements Function0<FeedUnifiedSpacingOptimizeConfig> {
    public C694340RLk() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.feed.platform.cell.interact.hotspot.FeedUnifiedSpacingOptimizeConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final FeedUnifiedSpacingOptimizeConfig invoke() {
        ?? LJIIIIZZ = SettingsManager.LIZLLL().LJIIIIZZ("feed_unified_spacing_optimize_exp", FeedUnifiedSpacingOptimizeConfig.class, null);
        if (LJIIIIZZ != 0) {
            return LJIIIIZZ;
        }
        return null;
    }
}
