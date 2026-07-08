package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.adaption.ScreenAdaptionComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T9W, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T9W extends C09AY implements Function0<IViewPagerComponentAbility> {
    public final /* synthetic */ ScreenAdaptionComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0T9W(ScreenAdaptionComponent screenAdaptionComponent) {
        super(0);
        this.LL = screenAdaptionComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IViewPagerComponentAbility invoke() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityJo = this.LL.Jo();
        if (iFeedPanelPlatformAbilityJo != null) {
            return iFeedPanelPlatformAbilityJo.Mb();
        }
        return null;
    }
}
