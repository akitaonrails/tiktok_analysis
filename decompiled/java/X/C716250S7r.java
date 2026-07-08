package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.videohotswap.overlay.PaywallComponentTrigger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0S7r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C716250S7r extends C09AY implements Function0<IFeedPanelPlatformAbility> {
    public final /* synthetic */ PaywallComponentTrigger LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C716250S7r(PaywallComponentTrigger paywallComponentTrigger) {
        super(0);
        this.LL = paywallComponentTrigger;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IFeedPanelPlatformAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IFeedPanelPlatformAbility.class, null);
    }
}
