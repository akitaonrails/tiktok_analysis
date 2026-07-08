package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.component.InsertCacheWhenPlayLagComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NrU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C607060NrU extends C09AY implements Function0<IViewPagerComponentAbility> {
    public final /* synthetic */ InsertCacheWhenPlayLagComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C607060NrU(InsertCacheWhenPlayLagComponent insertCacheWhenPlayLagComponent) {
        super(0);
        this.LL = insertCacheWhenPlayLagComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IViewPagerComponentAbility invoke() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.LLJJ.getValue();
        if (iFeedPanelPlatformAbility != null) {
            return iFeedPanelPlatformAbility.Mb();
        }
        return null;
    }
}
