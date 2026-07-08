package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControlComponent;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SXX, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SXX extends C09AY implements Function0<IPlayerComponentAbility> {
    public final /* synthetic */ EarphonePlayerControlComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SXX(EarphonePlayerControlComponent earphonePlayerControlComponent) {
        super(0);
        this.LL = earphonePlayerControlComponent;
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
