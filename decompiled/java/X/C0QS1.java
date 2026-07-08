package X;

import com.ss.android.ugc.aweme.search.entry.searchbubble.config.HomepageHotSearchTipsConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0QS1, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QS1 extends C09AY implements Function0<HomepageHotSearchTipsConfig> {
    public C0QS1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.search.entry.searchbubble.config.HomepageHotSearchTipsConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final HomepageHotSearchTipsConfig invoke() {
        ?? LJJII = C0C64.LJIILLIIL().LJJII(HomepageHotSearchTipsConfig.class, C0QS0.LIZ, "homepage_hot_search_tips_config", true);
        return LJJII == 0 ? new HomepageHotSearchTipsConfig() : LJJII;
    }
}
