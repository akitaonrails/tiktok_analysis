package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0T8q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C741980T8q extends C09AY implements Function1<Throwable, Unit> {
    public C741980T8q() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingConfigurationFlowStartPage prefetch service_switch_info failed reason=");
        sbLIZ.append(th.getMessage());
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }
}
