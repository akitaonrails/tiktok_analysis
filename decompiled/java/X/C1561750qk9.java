package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerScrollAngleComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qk9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1561750qk9 extends C09AY implements Function0<IViewPagerComponentAbility> {
    public final /* synthetic */ ViewPagerScrollAngleComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1561750qk9(ViewPagerScrollAngleComponent viewPagerScrollAngleComponent) {
        super(0);
        this.LL = viewPagerScrollAngleComponent;
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
