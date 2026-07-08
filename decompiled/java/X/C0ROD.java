package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.story.feed.guidecard.component.panel.StoryGuideCardPreLoadPanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ROD, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0ROD extends C09AY implements Function0<IViewPagerComponentAbility> {
    public final /* synthetic */ StoryGuideCardPreLoadPanelComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ROD(StoryGuideCardPreLoadPanelComponent storyGuideCardPreLoadPanelComponent) {
        super(0);
        this.LL = storyGuideCardPreLoadPanelComponent;
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
