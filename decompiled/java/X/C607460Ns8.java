package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.live.FeedLiveScrollConfigComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ns8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C607460Ns8 extends C09AY implements Function0<IViewPagerComponentAbility> {
    public final /* synthetic */ FeedLiveScrollConfigComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C607460Ns8(FeedLiveScrollConfigComponent feedLiveScrollConfigComponent) {
        super(0);
        this.LL = feedLiveScrollConfigComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IViewPagerComponentAbility invoke() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.LLJIJIL.getValue();
        if (iFeedPanelPlatformAbility != null) {
            return iFeedPanelPlatformAbility.Mb();
        }
        return null;
    }
}
