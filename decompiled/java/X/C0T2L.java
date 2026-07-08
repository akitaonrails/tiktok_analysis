package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.playbutton.PlayButtonComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T2L, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T2L extends C09AY implements Function0<IViewPagerComponentAbility> {
    public final /* synthetic */ PlayButtonComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0T2L(PlayButtonComponent playButtonComponent) {
        super(0);
        this.LL = playButtonComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IViewPagerComponentAbility invoke() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.LLILZ.getValue();
        if (iFeedPanelPlatformAbility != null) {
            return iFeedPanelPlatformAbility.Mb();
        }
        return null;
    }
}
