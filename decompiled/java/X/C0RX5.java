package X;

import com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBannerComponent;
import com.ss.android.ugc.feed.platform.componentmanager.IFcpPolicyAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RX5, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RX5 extends C09AY implements Function0<InterfaceC699200Rbi<?>> {
    public final /* synthetic */ InteractBottomBannerComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RX5(InteractBottomBannerComponent interactBottomBannerComponent) {
        super(0);
        this.LL = interactBottomBannerComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC699200Rbi<?> invoke() {
        IFcpPolicyAbility iFcpPolicyAbility = (IFcpPolicyAbility) this.LL.LLJLILLLLZIIL.getValue();
        if (iFcpPolicyAbility != null) {
            return iFcpPolicyAbility.n6();
        }
        return null;
    }
}
