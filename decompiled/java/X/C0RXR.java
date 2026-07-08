package X;

import com.ss.android.ugc.feed.platform.componentmanager.IFcpPolicyAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RXR, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RXR extends C09AY implements Function0<InterfaceC699200Rbi<?>> {
    public final /* synthetic */ C697210RWl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RXR(C697210RWl c697210RWl) {
        super(0);
        this.LL = c697210RWl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC699200Rbi<?> invoke() {
        IFcpPolicyAbility iFcpPolicyAbility = this.LL.LLILZLL;
        if (iFcpPolicyAbility != null) {
            return iFcpPolicyAbility.n6();
        }
        return null;
    }
}
