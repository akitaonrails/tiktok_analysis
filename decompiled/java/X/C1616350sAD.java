package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.clearmode.ClearModePanelComponent;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sAD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616350sAD extends C09AY implements Function0<ILoadMoreAbility> {
    public final /* synthetic */ ClearModePanelComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1616350sAD(ClearModePanelComponent clearModePanelComponent) {
        super(0);
        this.LL = clearModePanelComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ILoadMoreAbility invoke() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLo = this.LL.lo();
        if (iFeedPanelPlatformAbilityLo != null) {
            return iFeedPanelPlatformAbilityLo.Kk1();
        }
        return null;
    }
}
