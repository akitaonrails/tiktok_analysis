package X;

import com.ss.android.ugc.feed.platform.componentmanager.IFcpPolicyAbility;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RXN, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RXN extends C09AY implements Function0<List<? extends String>> {
    public final /* synthetic */ C697210RWl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RXN(C697210RWl c697210RWl) {
        super(0);
        this.LL = c697210RWl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends String> invoke() {
        IFcpPolicyAbility iFcpPolicyAbility = this.LL.LLILZLL;
        if (iFcpPolicyAbility != null) {
            return iFcpPolicyAbility.If0();
        }
        return null;
    }
}
