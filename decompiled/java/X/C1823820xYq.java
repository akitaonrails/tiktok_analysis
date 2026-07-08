package X;

import com.bytedance.android.livesdk.comp.api.pcs.ui.loading.IPcsLoadingAbility;
import com.bytedance.android.livesdk.comp.api.pcs.ui.loading.PcsGenericLoadingVM;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xYq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1823820xYq extends C09AY implements Function2<C03H5, AbstractC1411370mpb, Unit> {
    public final /* synthetic */ PcsOnboardingStatefulStepFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1823820xYq(PcsOnboardingStatefulStepFragment pcsOnboardingStatefulStepFragment) {
        super(2);
        this.LL = pcsOnboardingStatefulStepFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, AbstractC1411370mpb abstractC1411370mpb) {
        PcsGenericLoadingVM pcsGenericLoadingVMDj1;
        C1823830xYr c1823830xYr;
        String message;
        Throwable th;
        IPcsLoadingAbility iPcsLoadingAbility = (IPcsLoadingAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this.LL, null), IPcsLoadingAbility.class, null);
        if (iPcsLoadingAbility != null) {
            pcsGenericLoadingVMDj1 = iPcsLoadingAbility.dj1(C489600JHy.LIZ, false);
        } else {
            pcsGenericLoadingVMDj1 = null;
        }
        if (abstractC1411370mpb instanceof C1410950mov) {
            if (pcsGenericLoadingVMDj1 != null) {
                pcsGenericLoadingVMDj1.LJLJLJ();
            }
        } else if (abstractC1411370mpb instanceof C1410940mou) {
            if (pcsGenericLoadingVMDj1 != null) {
                pcsGenericLoadingVMDj1.LJJJJL();
            }
        } else if (abstractC1411370mpb instanceof C1411380mpc) {
            Throwable th2 = this.LL.JS().getState().LLJ;
            InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
            String str = "";
            if (interfaceC517590KRpLIZJ != null) {
                int i = this.LL.LLJLLL;
                if (th2 == null) {
                    th = new Throwable();
                } else {
                    th = th2;
                }
                interfaceC517590KRpLIZJ.LJIIIZ(new C0JOM(i, "", th));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LL.mT());
            sbLIZ.append(" perf.onShowFailed error_msg=");
            if (th2 != null && (message = th2.getMessage()) != null) {
                str = message;
            }
            sbLIZ.append(str);
            C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            Function0<Unit> function0 = this.LL.JS().getState().LLJI;
            if (pcsGenericLoadingVMDj1 != null) {
                if (function0 != null) {
                    c1823830xYr = new C1823830xYr(this.LL, function0);
                } else {
                    c1823830xYr = null;
                }
                pcsGenericLoadingVMDj1.Ly2(C1734970vFX.LIZ(c1823830xYr), null, null);
            }
        }
        return Unit.LIZ;
    }
}
