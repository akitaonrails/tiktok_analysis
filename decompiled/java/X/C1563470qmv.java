package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.ss.android.ugc.feed.platform.panel.signalcollect.EcomSignalCollectComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qmv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563470qmv extends C09AY implements Function0<IPlayerComponentAbility> {
    public final /* synthetic */ EcomSignalCollectComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1563470qmv(EcomSignalCollectComponent ecomSignalCollectComponent) {
        super(0);
        this.LL = ecomSignalCollectComponent;
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
