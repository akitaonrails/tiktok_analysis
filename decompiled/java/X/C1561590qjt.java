package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePerfComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qjt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1561590qjt extends C09AY implements Function0<ILoadMoreAbility> {
    public final /* synthetic */ LoadMorePerfComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1561590qjt(LoadMorePerfComponent loadMorePerfComponent) {
        super(0);
        this.LL = loadMorePerfComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ILoadMoreAbility invoke() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.LL.getValue();
        if (iFeedPanelPlatformAbility != null) {
            return iFeedPanelPlatformAbility.Kk1();
        }
        return null;
    }
}
