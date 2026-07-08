package X;

import com.ss.android.ugc.aweme.offlinemode.ui.popup.OfflineModeSwitchComponent;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Off, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C625210Off extends C09AY implements Function0<ILoadMoreAbility> {
    public final /* synthetic */ OfflineModeSwitchComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C625210Off(OfflineModeSwitchComponent offlineModeSwitchComponent) {
        super(0);
        this.LL = offlineModeSwitchComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ILoadMoreAbility invoke() {
        IFeedFragmentAbility iFeedFragmentAbilityLIZ = C443040HYw.LIZ(C1558520qew.LJIIL(this.LL));
        if (iFeedFragmentAbilityLIZ != null) {
            return iFeedFragmentAbilityLIZ.Ew0();
        }
        return null;
    }
}
