package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.digg.DiggPanelComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SrE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C734300SrE extends C09AY implements Function0<IFeedPanelPlatformAbility> {
    public final /* synthetic */ DiggPanelComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C734300SrE(DiggPanelComponent diggPanelComponent) {
        super(0);
        this.LL = diggPanelComponent;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IFeedPanelPlatformAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IFeedPanelPlatformAbility.class, null);
    }
}
