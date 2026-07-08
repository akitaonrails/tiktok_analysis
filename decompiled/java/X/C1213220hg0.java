package X;

import com.ss.android.ugc.aweme.component.preformance.LivePreviewPerformanceComponent;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hg0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1213220hg0 extends C09AY implements Function0<IViewPagerComponentAbility> {
    public final /* synthetic */ LivePreviewPerformanceComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1213220hg0(LivePreviewPerformanceComponent livePreviewPerformanceComponent) {
        super(0);
        this.LL = livePreviewPerformanceComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IViewPagerComponentAbility invoke() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IFeedPanelPlatformAbility.class, null);
        if (iFeedPanelPlatformAbility != null) {
            return iFeedPanelPlatformAbility.Mb();
        }
        return null;
    }
}
