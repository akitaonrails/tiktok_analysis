package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.ss.android.ugc.feed.platform.popup.component.FeedPopupPanelComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T6g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C741360T6g extends C09AY implements Function0<IPlayerComponentAbility> {
    public final /* synthetic */ FeedPopupPanelComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C741360T6g(FeedPopupPanelComponent feedPopupPanelComponent) {
        super(0);
        this.LL = feedPopupPanelComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IPlayerComponentAbility invoke() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IFeedPanelPlatformAbility.class, null);
        if (iFeedPanelPlatformAbility != null) {
            return iFeedPanelPlatformAbility.x32();
        }
        return null;
    }
}
