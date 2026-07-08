package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.live.FypLiveCardComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qhE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1559940qhE extends C09AY implements Function0<IViewPagerComponentAbility> {
    public final /* synthetic */ FypLiveCardComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1559940qhE(FypLiveCardComponent fypLiveCardComponent) {
        super(0);
        this.LL = fypLiveCardComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IViewPagerComponentAbility invoke() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityFo = this.LL.fo();
        if (iFeedPanelPlatformAbilityFo != null) {
            return iFeedPanelPlatformAbilityFo.Mb();
        }
        return null;
    }
}
