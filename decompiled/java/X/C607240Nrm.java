package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.component.ReachBottomCacheComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Nrm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C607240Nrm extends C09AY implements Function0<IViewPagerComponentAbility> {
    public final /* synthetic */ ReachBottomCacheComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C607240Nrm(ReachBottomCacheComponent reachBottomCacheComponent) {
        super(0);
        this.LL = reachBottomCacheComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IViewPagerComponentAbility invoke() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.LL.getValue();
        if (iFeedPanelPlatformAbility != null) {
            return iFeedPanelPlatformAbility.Mb();
        }
        return null;
    }
}
