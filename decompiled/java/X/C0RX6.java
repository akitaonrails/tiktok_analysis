package X;

import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.FcpMetaTagContainer;
import com.ss.android.ugc.feed.platform.componentmanager.IFcpPolicyAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RX6, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RX6 extends C09AY implements Function0<InterfaceC699200Rbi<?>> {
    public final /* synthetic */ FcpMetaTagContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RX6(FcpMetaTagContainer fcpMetaTagContainer) {
        super(0);
        this.LL = fcpMetaTagContainer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC699200Rbi<?> invoke() {
        IFcpPolicyAbility iFcpPolicyAbility = (IFcpPolicyAbility) this.LL.LLJLLL.getValue();
        if (iFcpPolicyAbility != null) {
            return iFcpPolicyAbility.n6();
        }
        return null;
    }
}
