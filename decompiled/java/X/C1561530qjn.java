package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.series.specialcard.component.MiniDramaDNUGuideCardPanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qjn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1561530qjn extends C09AY implements Function0<IViewPagerComponentAbility> {
    public final /* synthetic */ MiniDramaDNUGuideCardPanelComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1561530qjn(MiniDramaDNUGuideCardPanelComponent miniDramaDNUGuideCardPanelComponent) {
        super(0);
        this.LL = miniDramaDNUGuideCardPanelComponent;
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
