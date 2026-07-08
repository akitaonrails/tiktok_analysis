package X;

import com.ss.android.ugc.aweme.feed.component.RecommendFeedComponent;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rS8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1589020rS8 extends C09AY implements Function0<C1601390rm5> {
    public final /* synthetic */ RecommendFeedComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1589020rS8(RecommendFeedComponent recommendFeedComponent) {
        super(0);
        this.LL = recommendFeedComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1601390rm5 invoke() {
        return ((FeedRecommendFragment) this.LL.LLJJIII.getValue()).LLJLIL;
    }
}
