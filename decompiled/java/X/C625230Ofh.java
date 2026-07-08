package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.offlinemode.ui.popup.OfflineModeSwitchComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ofh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C625230Ofh extends C09AY implements Function0<IViewPagerComponentAbility> {
    public final /* synthetic */ OfflineModeSwitchComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C625230Ofh(OfflineModeSwitchComponent offlineModeSwitchComponent) {
        super(0);
        this.LL = offlineModeSwitchComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IViewPagerComponentAbility invoke() {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.LLILZ.getValue();
        if (iFeedPanelPlatformAbility != null) {
            return iFeedPanelPlatformAbility.Mb();
        }
        return null;
    }
}
