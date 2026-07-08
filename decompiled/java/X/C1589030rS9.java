package X;

import com.ss.android.ugc.aweme.feed.component.RecommendFeedComponent;
import com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rS9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1589030rS9 extends C09AY implements Function0<RecommendFeedFragmentPanel> {
    public final /* synthetic */ RecommendFeedComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1589030rS9(RecommendFeedComponent recommendFeedComponent) {
        super(0);
        this.LL = recommendFeedComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final RecommendFeedFragmentPanel invoke() {
        return ((FeedRecommendFragment) this.LL.LLJJIII.getValue()).LLIZLLLIL;
    }
}
