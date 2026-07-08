package X;

import com.ss.android.ugc.aweme.feed.component.RecommendFeedComponent;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rSC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1589060rSC extends C09AY implements Function0<FeedRecommendFragment> {
    public final /* synthetic */ RecommendFeedComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1589060rSC(RecommendFeedComponent recommendFeedComponent) {
        super(0);
        this.LL = recommendFeedComponent;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment] */
    @Override // kotlin.jvm.functions.Function0
    public final FeedRecommendFragment invoke() {
        return this.LL.Go();
    }
}
