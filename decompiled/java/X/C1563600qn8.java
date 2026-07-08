package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.accessibility.A11yFeedToolComponent;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qn8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563600qn8 extends C09AY implements Function0<IPlayerComponentAbility> {
    public final /* synthetic */ A11yFeedToolComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1563600qn8(A11yFeedToolComponent a11yFeedToolComponent) {
        super(0);
        this.LL = a11yFeedToolComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IPlayerComponentAbility invoke() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.LLJILJIL.getValue();
        if (iFeedPanelPlatformAbility != null) {
            return iFeedPanelPlatformAbility.x32();
        }
        return null;
    }
}
