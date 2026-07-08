package X;

import com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBannerComponent;
import com.ss.android.ugc.feed.platform.componentmanager.IFcpPolicyAbility;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RWz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C697350RWz extends C09AY implements Function0<List<? extends String>> {
    public final /* synthetic */ InteractBottomBannerComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C697350RWz(InteractBottomBannerComponent interactBottomBannerComponent) {
        super(0);
        this.LL = interactBottomBannerComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends String> invoke() {
        IFcpPolicyAbility iFcpPolicyAbility = (IFcpPolicyAbility) this.LL.LLJLILLLLZIIL.getValue();
        if (iFcpPolicyAbility != null) {
            return iFcpPolicyAbility.If0();
        }
        return null;
    }
}
