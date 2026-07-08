package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.player.PlayerPreloadDataComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qh7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1559870qh7 extends C09AY implements Function0<IViewPagerComponentAbility> {
    public final /* synthetic */ PlayerPreloadDataComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1559870qh7(PlayerPreloadDataComponent playerPreloadDataComponent) {
        super(0);
        this.LL = playerPreloadDataComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IViewPagerComponentAbility invoke() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo = this.LL.bo();
        if (iFeedPanelPlatformAbilityBo != null) {
            return iFeedPanelPlatformAbilityBo.Mb();
        }
        return null;
    }
}
