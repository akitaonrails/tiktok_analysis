package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.clearmode.ClearModePanelComponent;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sAE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616360sAE extends C09AY implements Function0<IPlayerComponentAbility> {
    public final /* synthetic */ ClearModePanelComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1616360sAE(ClearModePanelComponent clearModePanelComponent) {
        super(0);
        this.LL = clearModePanelComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IPlayerComponentAbility invoke() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLo = this.LL.lo();
        if (iFeedPanelPlatformAbilityLo != null) {
            return iFeedPanelPlatformAbilityLo.x32();
        }
        return null;
    }
}
