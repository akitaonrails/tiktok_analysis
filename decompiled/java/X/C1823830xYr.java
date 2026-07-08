package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xYr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1823830xYr extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PcsOnboardingStatefulStepFragment LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1823830xYr(PcsOnboardingStatefulStepFragment pcsOnboardingStatefulStepFragment, Function0<Unit> function0) {
        super(0);
        this.LL = pcsOnboardingStatefulStepFragment;
        this.LLILLJJLI = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            interfaceC517590KRpLIZJ.LJFF(new C517550KRl(this.LL.LLJLLL));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL.mT());
        sbLIZ.append(" perf.onReInit retry_click");
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI.invoke();
        return Unit.LIZ;
    }
}
