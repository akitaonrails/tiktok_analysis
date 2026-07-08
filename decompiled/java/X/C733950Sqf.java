package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.share.ShareCoinIncentiveComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sqf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C733950Sqf extends C09AY implements Function0<IViewPagerComponentAbility> {
    public final /* synthetic */ ShareCoinIncentiveComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C733950Sqf(ShareCoinIncentiveComponent shareCoinIncentiveComponent) {
        super(0);
        this.LL = shareCoinIncentiveComponent;
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
