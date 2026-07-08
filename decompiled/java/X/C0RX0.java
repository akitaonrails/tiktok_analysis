package X;

import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.FcpMetaTagContainer;
import com.ss.android.ugc.feed.platform.componentmanager.IFcpPolicyAbility;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RX0, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RX0 extends C09AY implements Function0<List<? extends String>> {
    public final /* synthetic */ FcpMetaTagContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RX0(FcpMetaTagContainer fcpMetaTagContainer) {
        super(0);
        this.LL = fcpMetaTagContainer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends String> invoke() {
        IFcpPolicyAbility iFcpPolicyAbility = (IFcpPolicyAbility) this.LL.LLJLLL.getValue();
        if (iFcpPolicyAbility != null) {
            return iFcpPolicyAbility.If0();
        }
        return null;
    }
}
