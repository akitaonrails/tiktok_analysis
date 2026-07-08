package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.ss.android.ugc.feed.platform.panel.player.PlayerPreloadDataComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qmw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563480qmw extends C09AY implements Function0<IPlayerComponentAbility> {
    public final /* synthetic */ PlayerPreloadDataComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1563480qmw(PlayerPreloadDataComponent playerPreloadDataComponent) {
        super(0);
        this.LL = playerPreloadDataComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IPlayerComponentAbility invoke() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo = this.LL.bo();
        if (iFeedPanelPlatformAbilityBo != null) {
            return iFeedPanelPlatformAbilityBo.x32();
        }
        return null;
    }
}
