package X;

import com.ss.android.ugc.aweme.story.feed.guidecard.component.panel.StoryGuideCardFilterPanelComponentA2;
import com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0OEz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C616230OEz extends C09AY implements Function0<IFeedFetchDataAbility> {
    public final /* synthetic */ StoryGuideCardFilterPanelComponentA2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C616230OEz(StoryGuideCardFilterPanelComponentA2 storyGuideCardFilterPanelComponentA2) {
        super(0);
        this.LL = storyGuideCardFilterPanelComponentA2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IFeedFetchDataAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IFeedFetchDataAbility.class, null);
    }
}
