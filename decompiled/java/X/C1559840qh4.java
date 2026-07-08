package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.mingap.MinGapMonitorComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qh4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1559840qh4 extends C09AY implements Function0<IViewPagerComponentAbility> {
    public final /* synthetic */ MinGapMonitorComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1559840qh4(MinGapMonitorComponent minGapMonitorComponent) {
        super(0);
        this.LL = minGapMonitorComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IViewPagerComponentAbility invoke() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.LLILLL.getValue();
        if (iFeedPanelPlatformAbility != null) {
            return iFeedPanelPlatformAbility.Mb();
        }
        return null;
    }
}
