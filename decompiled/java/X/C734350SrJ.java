package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.digg.DiggPanelComponent;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SrJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C734350SrJ extends C09AY implements Function0<ILoadMoreAbility> {
    public final /* synthetic */ DiggPanelComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C734350SrJ(DiggPanelComponent diggPanelComponent) {
        super(0);
        this.LL = diggPanelComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ILoadMoreAbility invoke() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.LLJILJIL.getValue();
        if (iFeedPanelPlatformAbility != null) {
            return iFeedPanelPlatformAbility.Kk1();
        }
        return null;
    }
}
