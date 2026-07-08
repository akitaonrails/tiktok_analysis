package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.playbutton.PlayButtonComponent;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T2K, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T2K extends C09AY implements Function0<IPlayerComponentAbility> {
    public final /* synthetic */ PlayButtonComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0T2K(PlayButtonComponent playButtonComponent) {
        super(0);
        this.LL = playButtonComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IPlayerComponentAbility invoke() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.LLILZ.getValue();
        if (iFeedPanelPlatformAbility != null) {
            return iFeedPanelPlatformAbility.x32();
        }
        return null;
    }
}
