package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.playbutton.PlayButtonComponentTemp;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T1w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C740220T1w extends C09AY implements Function0<IViewPagerComponentAbility> {
    public final /* synthetic */ PlayButtonComponentTemp LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C740220T1w(PlayButtonComponentTemp playButtonComponentTemp) {
        super(0);
        this.LL = playButtonComponentTemp;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IViewPagerComponentAbility invoke() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.LLILZLL.getValue();
        if (iFeedPanelPlatformAbility != null) {
            return iFeedPanelPlatformAbility.Mb();
        }
        return null;
    }
}
